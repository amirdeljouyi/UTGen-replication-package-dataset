/*
 * IFX-Framework - IFX XML to JavaBean application framework.
 * Copyright (C) 2003  The IFX-Framework Team
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.sourceforge.ifx.framework.complextype;

/**
 * Generated code.
 * 
 * @author org.sourceforge.ifx.tools.CodeGenerator
 */
public class IssScriptData_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public IssScriptData_Type() {
        super();
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.IssPreScriptData[] _issPreScriptData;

    /** 
     * Setter for issPreScriptData
     * @param issPreScriptData the org.sourceforge.ifx.framework.element.IssPreScriptData[] to set
     */
    public void setIssPreScriptData(org.sourceforge.ifx.framework.element.IssPreScriptData[] _issPreScriptData) {
        this._issPreScriptData = _issPreScriptData;
    }

    /**
     * Getter for issPreScriptData
     * @return a org.sourceforge.ifx.framework.element.IssPreScriptData[]
     */
    public org.sourceforge.ifx.framework.element.IssPreScriptData[] getIssPreScriptData() {
        return _issPreScriptData;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.IssPostScriptData[] _issPostScriptData;

    /** 
     * Setter for issPostScriptData
     * @param issPostScriptData the org.sourceforge.ifx.framework.element.IssPostScriptData[] to set
     */
    public void setIssPostScriptData(org.sourceforge.ifx.framework.element.IssPostScriptData[] _issPostScriptData) {
        this._issPostScriptData = _issPostScriptData;
    }

    /**
     * Getter for issPostScriptData
     * @return a org.sourceforge.ifx.framework.element.IssPostScriptData[]
     */
    public org.sourceforge.ifx.framework.element.IssPostScriptData[] getIssPostScriptData() {
        return _issPostScriptData;
    }


    /**
     * Returns true if objects are equal, false otherwise.
     * @param obj the object to compare with.
     * @return true if equal, false if not.
     */
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /** Element ordering - 
       * IssPreScriptData
       * IssPostScriptData
       */
    public final String[] ELEMENTS = {
              "IssPreScriptData"
                 ,"IssPostScriptData"
          };
}
