/*
*   CircleSymbol  -- Represents the default plot symbol of a circle.
*
*   Copyright (C) 2000-2002 by Joseph A. Huwaldt <jhuwaldt@knology.net>.
*   All rights reserved.
*   
*   This library is free software; you can redistribute it and/or
*   modify it under the terms of the GNU Library General Public
*   License as published by the Free Software Foundation; either
*   version 2 of the License, or (at your option) any later version.
*   
*   This library is distributed in the hope that it will be useful,
*   but WITHOUT ANY WARRANTY; without even the implied warranty of
*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*   Library General Public License for more details.
**/
package jahuwaldt.plot;

import java.awt.*;

/**
*  <p> This class represents the default plot symbol
*      of a circle shown on a data plot.
*  </p>
*
*  <p>  Modified by:  Joseph A. Huwaldt  </p>
*
*  @author  Joseph A. Huwaldt   Date:  September 22, 2000
*  @version November 17, 2000
**/
public class CircleSymbol extends PlotSymbol {

	//-------------------------------------------------------------------------
	/**
	*  Creates a circle plot symbol object that
	*  has a width of 8 pixels, is transparent and
	*  has a border color of black.
	**/
	public CircleSymbol() {}
	
	//-------------------------------------------------------------------------

	/**
	*  Draws a plot symbol consisting of a circle to the
	*  specified graphics context at the specified
	*  coordinates.
	*
	*  @param  gc  The graphics context where the symbol will be drawn.
	*  @param  x   The horizontal position of the center of the symbol.
	*  @param  y   The vertical position of the center of the symbol.
	**/
	public void draw(Graphics gc, int x, int y) {
		Color saveColor = gc.getColor();
		int width = getSize();
		int width2 = getSize()/2;
		
		//	Draw in a filled symbol if color specified.
		Color fillColor = getFillColor();
		if (fillColor != null) {
			gc.setColor(fillColor);
			gc.fillOval(x-width2, y-width2, width, width);
		}
		
		//	Draw the border of the symbol if color specified.
		Color borderColor = getBorderColor();
		if (borderColor != null) {
			gc.setColor(borderColor);
			gc.drawOval(x-width2, y-width2, width, width);
		}
		
		//	Be kind, rewind.
		gc.setColor(saveColor);
	}
	
	
}


