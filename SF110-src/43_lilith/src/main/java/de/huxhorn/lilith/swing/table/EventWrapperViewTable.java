/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.swing.table;

import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.swing.MainFrame;
import de.huxhorn.lilith.swing.ViewContainer;
import de.huxhorn.lilith.swing.table.model.EventWrapperTableModel;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;

public abstract class EventWrapperViewTable<T extends Serializable>
	extends JTable
	implements ColorsProvider
{
	public static final String SCROLLING_TO_BOTTOM_PROPERTY = "scrollingToBottom";
	public static final String FILTER_CONDITION_PROPERTY = "filterCondition";

	private final Logger logger = LoggerFactory.getLogger(EventWrapperViewTable.class);

	protected EventWrapperTableModel<T> tableModel;
	protected Map<Object, TooltipGenerator> tooltipGenerators;
	protected Map<Object, TableColumn> tableColumns;
	protected PersistentTableColumnModel tableColumnModel;
	private boolean scrollingToBottom;
	private Condition filterCondition;

	// TODO: Move to ViewActions
	private JPopupMenu popupMenu;
	private JMenuItem columnsMenu;
	private boolean global;
	protected MainFrame mainFrame;

	public EventWrapperViewTable(MainFrame mainFrame, EventWrapperTableModel<T> model, boolean global)
	{
		super();
		this.mainFrame = mainFrame;
		this.global = global;
		this.tableModel = model;
		this.tableModel.addTableModelListener(new ScrollToEventListener());
		setAutoCreateColumnsFromModel(false);
		setModel(tableModel);
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		addFocusListener(new RepaintFocusListener());
		initTableColumns();
		tableColumnModel = new PersistentTableColumnModel();
		//initColumnModel();
		resetLayout();
		initTooltipGenerators();
		setShowHorizontalLines(false);
		setAutoResizeMode(AUTO_RESIZE_OFF);
		popupMenu = new JPopupMenu();
		columnsMenu = new JMenu("Columns");
		popupMenu.add(columnsMenu);
		popupMenu.addSeparator();
		popupMenu.add(new SaveLayoutAction());
		popupMenu.add(new ResetLayoutAction());
		getTableHeader().addMouseListener(new PopupListener());
	}

	public boolean isGlobal()
	{
		return global;
	}

	protected abstract void initTooltipGenerators();

	protected abstract void initTableColumns();
//	protected abstract void initColumnModel();

	// TODO: Move to ViewActions

	private void updatePopupMenu()
	{
		columnsMenu.removeAll();
		List<PersistentTableColumnModel.TableColumnLayoutInfo> cli = tableColumnModel.getColumnLayoutInfos();
		for(PersistentTableColumnModel.TableColumnLayoutInfo current : cli)
		{
			boolean visible = current.isVisible();
			JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem(new ShowHideAction(current.getColumnName(), visible));
			cbmi.setSelected(visible);
			columnsMenu.add(cbmi);
		}
	}

	public PersistentTableColumnModel getTableColumnModel()
	{
		return tableColumnModel;
	}

	public Condition getFilterCondition()
	{
		return filterCondition;
	}

	public void setFilterCondition(Condition filterCondition)
	{
		Object oldValue = this.filterCondition;
		this.filterCondition = filterCondition;
		repaint();
		firePropertyChange(FILTER_CONDITION_PROPERTY, oldValue, filterCondition);
	}

	public void scrollToBottom()
	{
		//System.out.println("Scrolling to bottom...");
		//new Throwable().printStackTrace(System.out);

		int row = getRowCount();
		row--;

		selectRow(row);
	}

	public void scrollToFirst()
	{
		if(getRowCount() > 0)
		{
			selectRow(0);
		}
	}

	public void selectRow(int row)
	{
		if(row >= 0 && row < getRowCount())
		{
			if(logger.isDebugEnabled()) logger.debug("Selecting row {}.", row);
			getSelectionModel().setSelectionInterval(0, row);
			// scrollpane adjustment
			scrollRectToVisible(getCellRect(row, 0, true));
		}
	}

	public boolean isScrollingToBottom()
	{
		return scrollingToBottom;
	}

	public void setScrollingToBottom(boolean scrollingToBottom)
	{
		if(this.scrollingToBottom != scrollingToBottom)
		{
			Object oldValue = this.scrollingToBottom;
			this.scrollingToBottom = scrollingToBottom;
			if(scrollingToBottom)
			{
				scrollToBottom();
			}
			firePropertyChange(SCROLLING_TO_BOTTOM_PROPERTY, oldValue, scrollingToBottom);
		}
	}

	protected boolean processKeyBinding(KeyStroke ks, KeyEvent e, int condition, boolean pressed)
	{
		if(logger.isDebugEnabled())
		{
			Object[] args = new Object[]{ks, e, condition, pressed};
			logger.debug("Processing KeyBinding:\n" +
				"\tKeyStroke: {}\n" +
				"\nEvent    : {}\n" +
				"\tcondition: {}\n" +
				"\tpressed  : {}\n", args);
		}
		InputMap inputMap = getInputMap(condition);
		Object key = inputMap.get(ks);
		if(key != null)
		{
			String keyStr = "" + key;
			if(keyStr.startsWith("select"))
			{
				if(isScrollingToBottom())
				{
					setScrollingToBottom(false);
				}
				if(logger.isDebugEnabled()) logger.debug("select detected! {}", keyStr);
			}
			if(logger.isDebugEnabled()) logger.debug("ActionKey: {}", keyStr);
		}
		return super.processKeyBinding(ks, e, condition, pressed);
	}

	public String getToolTipText(MouseEvent event)
	{
		if(tooltipGenerators == null)
		{
			return null;
		}
		Point p = event.getPoint();
		int row = rowAtPoint(p);
		int column = columnAtPoint(p); // This is the view column!
		if(column > -1)
		{
			TableColumn tableColumn = getColumnModel().getColumn(column);
			if(tableColumn != null)
			{
				TooltipGenerator generator = tooltipGenerators.get(tableColumn.getIdentifier());
				if(generator != null)
				{
					return generator.createTooltipText(this, row);
				}
			}
		}
		return null;
	}

	public abstract void saveLayout();

	protected abstract List<PersistentTableColumnModel.TableColumnLayoutInfo> getDefaultLayout();

	protected abstract List<PersistentTableColumnModel.TableColumnLayoutInfo> loadLayout();

	protected void fireViewContainerChange()
	{
		ViewContainer viewContainer = resolveViewContainer();
		if(viewContainer != null)
		{
			viewContainer.fireChange();
			if(logger.isDebugEnabled()) logger.debug("Fired change on ViewContainer!");
		}
	}

	public void resetLayout()
	{
		List<PersistentTableColumnModel.TableColumnLayoutInfo> loadedInfos = loadLayout();
		List<PersistentTableColumnModel.TableColumnLayoutInfo> defaults = getDefaultLayout();
		List<PersistentTableColumnModel.TableColumnLayoutInfo> infos;
		if(loadedInfos == null)
		{
			infos = getDefaultLayout();
		}
		else
		{
			infos = new ArrayList<PersistentTableColumnModel.TableColumnLayoutInfo>();

			// lets make sure that all columns exist.
			for(PersistentTableColumnModel.TableColumnLayoutInfo current : loadedInfos)
			{
				if(current != null)
				{
					String currentName = current.getColumnName();
					if(currentName != null)
					{
						for(PersistentTableColumnModel.TableColumnLayoutInfo other : defaults)
						{
							if(currentName.equals(other.getColumnName()))
							{
								infos.add(current);
								break;
							}
						}
					}
				}
			}

			// lets add missing columns
			for(PersistentTableColumnModel.TableColumnLayoutInfo current : defaults)
			{
				String currentName = current.getColumnName();
				if(currentName != null)
				{
					boolean found = false;
					for(PersistentTableColumnModel.TableColumnLayoutInfo other : infos)
					{
						String otherName = other.getColumnName();
						if(currentName.equals(otherName))
						{
							found = true;
						}
					}
					if(!found)
					{
						infos.add(current);
					}
				}
			}
		}
		PersistentTableColumnModel newModel = new PersistentTableColumnModel();
		for(PersistentTableColumnModel.TableColumnLayoutInfo current : infos)
		{
			String name = current.getColumnName();
			TableColumn col = tableColumns.get(name);
			if(col != null)
			{
				col.setPreferredWidth(current.getWidth());
				newModel.addColumn(col);
				newModel.setColumnVisible(col, current.isVisible());
			}
		}
		setColumnModel(newModel);
		tableColumnModel = newModel;
		fireViewContainerChange();
	}

	public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend)
	{
		if(logger.isDebugEnabled())
		{
			logger.debug("changeSelection({}, {}, {}, {})", new Object[]{rowIndex, columnIndex, toggle, extend});
			//noinspection ThrowableInstanceNeverThrown
			logger.debug("changeSelection-Stacktrace", new Throwable());
		}
		if(isScrollingToBottom())
		{
			setScrollingToBottom(false);
		}
		super.changeSelection(rowIndex, columnIndex, toggle, extend);
	}

	private static final Colors NOT_MATCHING_COLORS = new Colors(new Color(192, 192, 192), new Color(245, 245, 245), true);
	private static final Colors EVEN_ROW_COLORS = new Colors(new Color(0, 0, 0), new Color(255, 255, 255));
	private static final Colors ODD_ROW_COLORS = new Colors(new Color(0, 0, 0), new Color(0xE9, 0xED, 0xF2));

	public Colors resolveColors(Object object, int row, int column)
	{
		if(object instanceof EventWrapper)
		{
			if(filterCondition != null && !filterCondition.isTrue(object))
			{
				return NOT_MATCHING_COLORS;
			}
			// check active conditions...
			Colors colors = mainFrame.getColors((EventWrapper) object);
			if(colors != null)
			{
				return colors;
			}
			// if none match...
			if(row % 2 == 0)
			{
				return EVEN_ROW_COLORS;
			}
			return ODD_ROW_COLORS;
		}
		return null;
	}


	/**
	 * This is part one of "scroll to bottom" functionality and selects the first event otherwise if no event was
	 * previously selected.
	 * <p/>
	 * It selects the last row of the table.
	 * Be aware that this listener *must* be added to the table model *before* the
	 * model is assigned to a table!
	 */
	private class ScrollToEventListener
		implements TableModelListener
	{
		public void tableChanged(TableModelEvent e)
		{
			if(scrollingToBottom)
			{
				scrollToBottom();
			}
			else if(getSelectedRow() < 0)
			{
				scrollToFirst();
			}
		}
	}

	private class RepaintFocusListener
		implements FocusListener
	{

		public void focusGained(FocusEvent e)
		{
			repaint();
		}

		public void focusLost(FocusEvent e)
		{
			repaint();
		}
	}

	private class PopupListener
		implements MouseListener
	{

		public void mouseClicked(MouseEvent e)
		{
			if(e.isPopupTrigger())
			{
				showPopup(e.getPoint());
			}
		}

		public void mousePressed(MouseEvent e)
		{
			if(e.isPopupTrigger())
			{
				showPopup(e.getPoint());
			}
		}

		public void mouseReleased(MouseEvent e)
		{
			if(e.isPopupTrigger())
			{
				showPopup(e.getPoint());
			}
		}

		public void mouseEntered(MouseEvent e)
		{
		}

		public void mouseExited(MouseEvent e)
		{
		}

		private void showPopup(Point p)
		{
			// TODO: call ViewActions
			if(logger.isDebugEnabled()) logger.debug("Showing popup at {}.", p);
			updatePopupMenu();
			popupMenu.show(EventWrapperViewTable.this.getTableHeader(), p.x, p.y);
		}
	}

	// TODO: Move to ViewActions
	private class SaveLayoutAction
		extends AbstractAction
	{
		private static final long serialVersionUID = 1154654992206760884L;

		private SaveLayoutAction()
		{
			super("Save layout");
		}

		public void actionPerformed(ActionEvent e)
		{
			if(logger.isDebugEnabled()) logger.debug("Save layout");
			saveLayout();
		}
	}

	// TODO: Move to ViewActions
	private class ResetLayoutAction
		extends AbstractAction
	{
		private static final long serialVersionUID = 8635210294474124660L;

		private ResetLayoutAction()
		{
			super("Reset layout");
		}

		public void actionPerformed(ActionEvent e)
		{
			if(logger.isDebugEnabled()) logger.debug("Reset layout");
			resetLayout();
		}
	}

	// TODO: Move to ViewActions
	protected ViewContainer resolveViewContainer()
	{
		ViewContainer result = null;
		Container parentContainer = getParent();
		for(; ;)
		{
			if(parentContainer instanceof ViewContainer)
			{
				result = (ViewContainer) parentContainer;
				break;
			}
			if(parentContainer == null)
			{
				break;
			}
			parentContainer = parentContainer.getParent();
		}
		return result;
	}

	// TODO: Move to ViewActions
	private class ShowHideAction
		extends AbstractAction
	{
		private static final long serialVersionUID = 2845939134245819103L;

		private boolean visible;
		private String columnName;

		private ShowHideAction(String columnName, boolean visible)
		{
			super(columnName);
			this.columnName = columnName;
			this.visible = visible;
			//putValue(EventWrapperViewTable.SELECTED_KEY, visible);
		}

		public void actionPerformed(ActionEvent e)
		{
			visible = !visible;
			Iterator<TableColumn> iter = tableColumnModel.getColumns(false);
			TableColumn found = null;
			while(iter.hasNext())
			{
				TableColumn current = iter.next();
				if(columnName.equals(current.getIdentifier()))
				{
					found = current;
					break;
				}
			}
			if(found != null)
			{
				tableColumnModel.setColumnVisible(found, visible);
				fireViewContainerChange();
			}
		}
	}

}
