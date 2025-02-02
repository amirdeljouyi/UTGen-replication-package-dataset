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
package de.paragon.explorer.util;

// E.Gamma erwaehnt diesen Typ in einem Beispielcode,
// FigureEnumeration verfuegt ueber die Methoden hasMoreElements()
// und nextFigure(). Dies ist analog zu java.util.Enumeration zu sehen,
// welche ueber hasMoreElements() und nextElement() verfuegt.
/**
 * Diese Klasse dient als Verfeinerung zu der vorhandenen Enumeration. Sie
 * ermoeglicht es zum Beispiel, eine Enumeration mehrmals mit hasMoreElements /
 * nextElement zu durchlaufen.
 */
import java.util.Enumeration;
import java.util.Vector;

public interface StandardEnumeration extends Enumeration<Object> {
	public void addElement(Object object);

	public Vector<?> getVector();

	// aus Oberklasse
	public abstract boolean hasMoreElements();

	public void insertElementAt(Object obj, int index);

	public boolean isInEnumeration(Object object);

	// aus Oberklasse
	public abstract Object nextElement();

	public void removeElement(Object object);
}
