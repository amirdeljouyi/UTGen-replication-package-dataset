/*
 * Created on 31.08.2006
 * Created by Richard Doerfler, Thomas Halm
 * Copyright (C) 2006  Richard Doerfler, Thomas Halm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;

/**
 * Hauptklasse zum Starten der Anwendung plus den Zugriff auf die entsprechenden Objekt-Instanzen
 * @author tommy
 *
 */
public class Main {

	private static SaveAction saveAction;

	private static CloseAction closeAction;
	
	private static SetMoveNameAction setNameAction;

	private static JFrame window;

	private static Field field;
	
	private static CommentView commentView;
	
	private static ColorModel colorModel;

	/**
	 * Liefert die Instanz des ColorModels
	 * 
	 * @return colorModel
	 */
	public static ColorModel getColorModel() {
		return colorModel;
	}

	/**
	 * Main-Methode zum Starten der Anwendung
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out
					.println(Resources.getString("error.lookAndFell")); //$NON-NLS-1$
		}

		window = new JFrame(Resources.getString("app.title")); //$NON-NLS-1$
		window.setIconImage(createImageIcon("images/icon.gif", "").getImage()); //$NON-NLS-1$ //$NON-NLS-2$
		JPanel content = new JPanel(new BorderLayout());
		JDesktopPane desktop = new JDesktopPane();
		window.setContentPane(content);

		content.add(desktop, BorderLayout.CENTER);
		desktop.setBackground(new Color(255, 255, 174));
		desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

		// Create HandballModel
		HandballModel handballModel = createHandballModel();

		// Create ColorModel
		colorModel = new ColorModel();
		
		// Statusbar
		StatusBar statusBar = createStatusBar(handballModel);
		content.add(statusBar, BorderLayout.SOUTH);

		// Create Menu
		JMenuBar menu = createHandballMenu(handballModel);
		window.setJMenuBar(menu);

		// Create HandballField
		field = new Field(handballModel,colorModel);
				
		JInternalFrame handballField = new JInternalFrame(Resources.getString("field.title"), false, //$NON-NLS-1$
				false, false, true);
		handballField.setLocation(10, 10);
		handballField.add(field);
		handballField.setVisible(true);
		handballField.pack();
		desktop.add(handballField);

		// Create MouseController
		MouseController mouse = new MouseController(handballModel,
				handballField);
		field.addMouseListener(mouse);
		field.addMouseMotionListener(mouse);
		// Add Statusbar as Listener
		field.addMouseMotionListener(statusBar);

		// Create ToolBar
		PlayerToolBar playerBar = new PlayerToolBar(handballModel);
		content.add(playerBar, BorderLayout.NORTH);

		// Create EventView
		JPanel tablePanel = createTablePanel(handballModel);
		JInternalFrame eventView = new JInternalFrame(Resources.getString("events.title"), true, //$NON-NLS-1$
				false, false, true);
		eventView.add(tablePanel);
		eventView.setLocation(20 + handballField.getWidth(), 10);
		eventView.setVisible(true);
		eventView.setSize(450, 400);
		desktop.add(eventView);

		// Create CommentView
		commentView = new CommentView(Resources.getString("comment.title")); //$NON-NLS-1$
		commentView.setLocation(20 + handballField.getWidth(),420);
		commentView.setSize(450,handballField.getHeight()-eventView.getHeight()-10);
		commentView.setVisible(true);
		//Controller für CommentView erzeugen
		new CommentController(handballModel, commentView);
		desktop.add(commentView);
		
		window.setSize(1000, 700);
		locateOnScreenCenter(window);

		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Main.getCloseAction().actionPerformed(null);
			}
		});
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		window.setVisible(true);
	}

	private static JMenuBar createHandballMenu(HandballModel handballModel) {
		JMenuBar mbar;
		JMenu menuDatei, menuHilfe, menuEinstellungen;

		// Hauptmenue einrichten
		mbar = new JMenuBar();
		menuDatei = JMenuHelper.addMenuBarItem(mbar, Resources.getString("menu.file")); //$NON-NLS-1$
		menuEinstellungen = JMenuHelper.addMenuBarItem(mbar,Resources.getString("menu.settings")); //$NON-NLS-1$
		menuHilfe = JMenuHelper.addMenuBarItem(mbar, Resources.getString("menu.about")); //$NON-NLS-1$

		// Einträge fuer Datei
		JMenuHelper.addMenuItem(menuDatei, "", new NewAction( //$NON-NLS-1$
				handballModel));
		JMenuHelper.addMenuItem(menuDatei, "",  new OpenAction( //$NON-NLS-1$
				handballModel));
		
		//Separator einfügen
		JMenuHelper.addMenuItem(menuDatei, "-"); //$NON-NLS-1$
		saveAction = new SaveAction(handballModel);
		JMenuHelper.addMenuItem(menuDatei, "", saveAction); //$NON-NLS-1$
		
		// Separator einfügen
		JMenuHelper.addMenuItem(menuDatei, "-"); //$NON-NLS-1$
		setNameAction = new SetMoveNameAction(handballModel);
		JMenuHelper.addMenuItem(menuDatei, "", setNameAction); //$NON-NLS-1$
		
		//Separator einfügen
		JMenuHelper.addMenuItem(menuDatei, "-"); //$NON-NLS-1$
		//Drucken einfügen
		JMenuHelper.addMenuItem(menuDatei, "", new PrintActualSequenzAction( //$NON-NLS-1$
				handballModel));
		JMenuHelper.addMenuItem(menuDatei, "", new PrintMoveAction(handballModel)); //$NON-NLS-1$
		JMenuHelper.addMenuItem(menuDatei, "", new CreateMovePdfAction(handballModel)); //$NON-NLS-1$

		// Separator einfügen
		JMenuHelper.addMenuItem(menuDatei, "-"); //$NON-NLS-1$

		closeAction = new CloseAction(handballModel);
		JMenuHelper.addMenuItem(menuDatei, "", closeAction); //$NON-NLS-1$

		// Einträge für Einstellungen
		JMenuHelper.addMenuItem(menuEinstellungen, "", new ChangeColorsAction()); //$NON-NLS-1$
		
		// Einträge für Hilfe
		JMenuHelper.addMenuItem(menuHilfe, "", //$NON-NLS-1$
				new AboutAction());

		return mbar;
	}

	private static JPanel createTablePanel(HandballModel handballModel) {
		TableHandballModel tableModel = new TableHandballModel(handballModel);
		JTable table = new JTable(tableModel);
		table.setDefaultRenderer(Object.class, new EventTableCellRenderer());
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		EventTableCellDelayEditor delayEditor = new EventTableCellDelayEditor();
		table.getColumnModel().getColumn(3).setCellEditor(delayEditor);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getSelectionModel().addListSelectionListener(
				new TableSelectionListener(tableModel));
		JPanel panel = new JPanel(new BorderLayout());

		JToolBar toolBar = new JToolBar(Resources.getString("toolbar.title")); //$NON-NLS-1$

		toolBar.add(new NewMoveEventAction(handballModel));
		toolBar.add(new NewSequenceAction(handballModel));
		toolBar.add(new NewPassEventAction(handballModel));
		toolBar.add(new DeleteEventAction(handballModel));
		toolBar.addSeparator();

		toolBar.add(new StartOneSequenceAnimationAction(handballModel));
		toolBar.add(new StartAnimationAction(handballModel));
		toolBar.add(new PauseAnimationAction(handballModel));
		toolBar.add(new StopAnimationAction(handballModel));

		JScrollPane scroll = new JScrollPane(table);
		panel.add(scroll, BorderLayout.CENTER);
		panel.add(toolBar, BorderLayout.PAGE_START);

		return panel;
	}

	private static StatusBar createStatusBar(HandballModel model) {
		StatusBar statusBar = new StatusBar(model);
		return statusBar;
	}

	/**
	 * Basierend auf der relativen Pfad (relativ zum Ort dieser Klasse) und der Beschreibung
	 * wird ein Grafik geladen und ein ImageIcon-Objekt erstellt.
	 * @param path
	 * @param description
	 * 
	 * @return imageIcon
	 */
	public static ImageIcon createImageIcon(String path, String description) {
		URL url = Main.class.getResource(path);
		return new ImageIcon(url, description);
	}
	
 	/**
 	 * Erzeugt auf Basis eines relativen Pfads (relativ zum Ort dieser Klasse) eine URL.
 	 * @param path
 	 * 
 	 * @return url
 	 */
 	public static URL getResource(String path) {
 		return Main.class.getResource(path);
 	}

	/**
	 * Methode um Component-Objekte (z.B. Fenster) in der Mitte des Bildschirms zu positionieren
	 * @param component
	 */
	public static void locateOnScreenCenter(Component component) {
		Dimension paneSize = component.getSize();
		Dimension screenSize = component.getToolkit().getScreenSize();
		component.setLocation((screenSize.width - paneSize.width) / 2,
				(screenSize.height - paneSize.height) / 2);
	}

	private static HandballModel createHandballModel() {
		HandballModel model = new HandballModel();

		return model;
	}

	/**
	 * Die Instanz des Anwendungsfensters
	 * 
	 * @return window
	 */
	public static JFrame getWindow() {
		return window;
	}

	/**
	 * Instanz des Spielfeld-Panels
	 * 
	 * @return panel
	 */
	public static Field getField() {
		return field;
	}

	/**
	 * Instanz der Speichern-Aktion
	 * 
	 * @return saveAction
	 */
	public static SaveAction getSaveAction() {
		return saveAction;
	}

	
	public static SetMoveNameAction getSetNameAction() {
		return setNameAction;
	}

	/**
	 * Instanz der Schlie�en-Aktion
	 * 
	 * @return close Action
	 */
	public static CloseAction getCloseAction() {
		return closeAction;
	}

	/**
	 * Methode um eine tiefe Objektkopie per Serialisierung zu erzeugen!
	 * 
	 * @param oldObj (muss Serializable implementieren)
	 * @return tiefe Kopie
	 * @throws Exception
	 */
	public static Object deepCopy(Object oldObj) throws Exception {
		Object clone = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(oldObj);
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(
					new ByteArrayInputStream(baos.toByteArray()));

			clone = ois.readObject();

			oos.close();
			ois.close();

		} catch (Exception e) {
			System.out.println("Exception in ObjectCloner = " + e); //$NON-NLS-1$
			throw (e);
		}
		return clone;
	}
	
	/**
	 * Liefert die Version der Anwendung als String
	 * 
	 * @return version
	 */
	public static String getVersion() {
		return "1.0.5"; //$NON-NLS-1$
	}

}