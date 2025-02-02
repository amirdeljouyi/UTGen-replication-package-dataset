/**
 * Copyright 2008 (C) Keith Bishop (bishi@users.sourceforge.net) 
 * 
 * All rights reserved.
 * 
 * This file is part of FSPath.
 * 
 * FSPath is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FSPath is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with FSPath.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * FSPathShortExpression.java
 *
 * Created on 07 April 2008, 15:44
 *
 */

package net.sf.sugar.fspath;

/**
 *
 * @author kbishop
 */
public interface FSPathShortExpression {
    
    /**
     *  This method expands the expression so that all expression steps are converted
     *  from /foo[<predicate expression>] 
     *  to the form /dir[@name = 'foo'][<predicate expression>]
     *
     *  This enables the underlying implementation to use standard XPath tools
     *  because the element name will be 'dir' or 'file' and not the name of the 
     *  file or directory it represents.
     */ 
    public FSPathExpression expand();
}
