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
 * Created on Mar 27, 2009
 *
 * @author dkatzel
 */
package org.jcvi.jillion.assembly.ca.frg;


public class DefaultLibrary implements Library{

    private final String id;
    private final MateOrientation mateOrientation;
    private final Distance distance;
    
    
    /**
     * @param id
     * @param distance
     * @param mateOrientation
     */
    public DefaultLibrary(String id, Distance distance,
            MateOrientation mateOrientation) {
        if(id==null || distance == null || mateOrientation ==null){
            throw new IllegalArgumentException("can not have null fields");
        }
        this.id = id;
        this.distance = distance;
        this.mateOrientation = mateOrientation;
    }

    @Override
    public Distance getDistance() {
        return distance;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public MateOrientation getMateOrientation() {
        return mateOrientation;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof DefaultLibrary)){
            return false;
        }
        DefaultLibrary other = (DefaultLibrary) obj;
        return id.equals(other.id);
    }

    
}
