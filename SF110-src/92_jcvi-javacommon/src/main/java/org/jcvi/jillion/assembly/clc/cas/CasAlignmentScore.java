/*******************************************************************************
 * Copyright (c) 2013 J. Craig Venter Institute.
 * 	This file is part of Jillion
 * 
 * 	 Jillion is free software: you can redistribute it and/or modify
 * 	it under the terms of the GNU General Public License as published by
 * 	the Free Software Foundation, either version 3 of the License, or
 * 	(at your option) any later version.
 * 	
 * 	 Jillion is distributed in the hope that it will be useful,
 * 	but WITHOUT ANY WARRANTY; without even the implied warranty of
 * 	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * 	GNU General Public License for more details.
 * 	
 * 	You should have received a copy of the GNU General Public License
 * 	along with  Jillion.  If not, see http://www.gnu.org/licenses
 * 
 * Contributors:
 *     Danny Katzel - initial API and implementation
 ******************************************************************************/
/*
 * Created on Oct 27, 2009
 *
 * @author dkatzel
 */
package org.jcvi.jillion.assembly.clc.cas;

public interface CasAlignmentScore {

    int getFirstInsertionCost();
    
    int getInsertionExtensionCost();
    
    int getFirstDeletionCost();
    
    int getDeletionExtensionCost();
    
    int getMatchScore();
    /**
     * A <=> G or C <=> T.
     * @return
     */
    int getTransitionScore();
    /**
     * score of other differences that aren't transitions.
     * @return
     */
    int getTransversionScore();
    
    int getUnknownScore();
}
