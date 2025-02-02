/**
 * [ObjectExplorer4J - Tool zur grafischen Darstellung von Objekten und ihren
 * Referenzen]
 * 
 * Copyright (C) [2009] [PARAGON Systemhaus GmbH]
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses/>.
 **/
package de.paragon.explorer;

// repraesentiert State im State Pattern mit Context StandardDrawingView:
// heisst: Das Verhalten von DrawingView auf Benutzereingaben ist
// durch die gewaehlte Subklasse von Tool festgelegt
//
// Implementation durch Subklassen
// (Klasse Tool legt Default-Verhalten fest: keine Reaktion)
import java.awt.event.MouseEvent;

public interface Tool {
	public abstract void mouseClicked(MouseEvent event);

	public abstract void mouseEntered(MouseEvent event);

	public abstract void mouseExited(MouseEvent event);

	public abstract void mousePressed(MouseEvent event);

	public abstract void mouseReleased(MouseEvent event);
}
