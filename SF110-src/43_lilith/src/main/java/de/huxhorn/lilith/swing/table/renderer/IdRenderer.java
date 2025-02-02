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
package de.huxhorn.lilith.swing.table.renderer;

import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.swing.table.Colors;
import de.huxhorn.lilith.swing.table.ColorsProvider;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class IdRenderer
	implements TableCellRenderer
{
	private LabelCellRenderer renderer;

	public IdRenderer()
	{
		super();
		renderer = new LabelCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.RIGHT);
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int rowIndex, int vColIndex)
	{
		if(!isSelected)
		{
			isSelected = rowIndex == LabelCellRenderer.getSelectedRow(table);
		}
		if(!hasFocus && isSelected)
		{
			hasFocus = table.isFocusOwner();
		}
		renderer.setSelected(isSelected);
		renderer.setFocused(hasFocus);

		Color foreground = Color.BLACK;
		String text = "";
		if(value instanceof EventWrapper)
		{
			EventWrapper wrapper = (EventWrapper) value;
			text = "" + wrapper.getLocalId();
		}
		renderer.setText(text);
		renderer.setToolTipText(null);
		renderer.setIcon(null);
		boolean colorsInitialized = false;

		// special handling of id field, keep color even if selected or focus!
		//if(!hasFocus && !isSelected)
		if(value instanceof EventWrapper)
		{
			EventWrapper wrapper = (EventWrapper) value;
			if(table instanceof ColorsProvider)
			{
				ColorsProvider cp = (ColorsProvider) table;
				Colors colors = cp.resolveColors(wrapper, rowIndex, vColIndex);
				colorsInitialized = renderer.updateColors(colors);
			}
		}
		if(!colorsInitialized)
		{
			renderer.setForeground(foreground);
		}

		renderer.correctRowHeight(table);

		return renderer;
	}
}
