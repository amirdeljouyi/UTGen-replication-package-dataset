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
public class ForExDealMsgRec_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public ForExDealMsgRec_Type() {
        super();
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CustId[] _custId;

    /** 
     * Setter for custId
     * @param custId the org.sourceforge.ifx.framework.element.CustId[] to set
     */
    public void setCustId(org.sourceforge.ifx.framework.element.CustId[] _custId) {
        this._custId = _custId;
    }

    /**
     * Getter for custId
     * @return a org.sourceforge.ifx.framework.element.CustId[]
     */
    public org.sourceforge.ifx.framework.element.CustId[] getCustId() {
        return _custId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.MsgRecDt[] _msgRecDt;

    /** 
     * Setter for msgRecDt
     * @param msgRecDt the org.sourceforge.ifx.framework.element.MsgRecDt[] to set
     */
    public void setMsgRecDt(org.sourceforge.ifx.framework.element.MsgRecDt[] _msgRecDt) {
        this._msgRecDt = _msgRecDt;
    }

    /**
     * Getter for msgRecDt
     * @return a org.sourceforge.ifx.framework.element.MsgRecDt[]
     */
    public org.sourceforge.ifx.framework.element.MsgRecDt[] getMsgRecDt() {
        return _msgRecDt;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.ForExDealAddRs[] _forExDealAddRs;

    /** 
     * Setter for forExDealAddRs
     * @param forExDealAddRs the org.sourceforge.ifx.framework.element.ForExDealAddRs[] to set
     */
    public void setForExDealAddRs(org.sourceforge.ifx.framework.element.ForExDealAddRs[] _forExDealAddRs) {
        this._forExDealAddRs = _forExDealAddRs;
    }

    /**
     * Getter for forExDealAddRs
     * @return a org.sourceforge.ifx.framework.element.ForExDealAddRs[]
     */
    public org.sourceforge.ifx.framework.element.ForExDealAddRs[] getForExDealAddRs() {
        return _forExDealAddRs;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.ForExDealModRs[] _forExDealModRs;

    /** 
     * Setter for forExDealModRs
     * @param forExDealModRs the org.sourceforge.ifx.framework.element.ForExDealModRs[] to set
     */
    public void setForExDealModRs(org.sourceforge.ifx.framework.element.ForExDealModRs[] _forExDealModRs) {
        this._forExDealModRs = _forExDealModRs;
    }

    /**
     * Getter for forExDealModRs
     * @return a org.sourceforge.ifx.framework.element.ForExDealModRs[]
     */
    public org.sourceforge.ifx.framework.element.ForExDealModRs[] getForExDealModRs() {
        return _forExDealModRs;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.ForExDealCanRs[] _forExDealCanRs;

    /** 
     * Setter for forExDealCanRs
     * @param forExDealCanRs the org.sourceforge.ifx.framework.element.ForExDealCanRs[] to set
     */
    public void setForExDealCanRs(org.sourceforge.ifx.framework.element.ForExDealCanRs[] _forExDealCanRs) {
        this._forExDealCanRs = _forExDealCanRs;
    }

    /**
     * Getter for forExDealCanRs
     * @return a org.sourceforge.ifx.framework.element.ForExDealCanRs[]
     */
    public org.sourceforge.ifx.framework.element.ForExDealCanRs[] getForExDealCanRs() {
        return _forExDealCanRs;
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
       * CustId
       * MsgRecDt
       * ForExDealAddRs
       * ForExDealModRs
       * ForExDealCanRs
       */
    public final String[] ELEMENTS = {
              "CustId"
                 ,"MsgRecDt"
                 ,"ForExDealAddRs"
                 ,"ForExDealModRs"
                 ,"ForExDealCanRs"
          };
}
