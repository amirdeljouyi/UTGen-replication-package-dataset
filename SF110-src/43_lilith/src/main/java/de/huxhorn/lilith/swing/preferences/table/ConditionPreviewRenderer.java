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
package de.huxhorn.lilith.swing.preferences.table;

import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;

import javax.swing.*;

public class ConditionPreviewRenderer
	extends ColorSchemePreviewRenderer
{
	public ConditionPreviewRenderer()
	{
	}

	public ColorScheme resolveColorScheme(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		ColorScheme result = null;
		if(value instanceof SavedCondition)
		{
			SavedCondition condition = (SavedCondition) value;
			result = condition.getColorScheme();
		}
		return result;
	}

	public void updateText(JTable table, Object value, boolean selected, boolean hasFocus, int row, int column)
	{
		renderer.setText("Message");
	}
}
