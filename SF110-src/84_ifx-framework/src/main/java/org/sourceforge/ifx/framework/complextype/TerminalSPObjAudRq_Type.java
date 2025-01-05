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
public class TerminalSPObjAudRq_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public TerminalSPObjAudRq_Type() {
        super();
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.RqUID _rqUID;

    /** 
     * Setter for rqUID
     * @param rqUID the org.sourceforge.ifx.framework.element.RqUID to set
     */
    public void setRqUID(org.sourceforge.ifx.framework.element.RqUID _rqUID) {
        this._rqUID = _rqUID;
    }

    /**
     * Getter for rqUID
     * @return a org.sourceforge.ifx.framework.element.RqUID
     */
    public org.sourceforge.ifx.framework.element.RqUID getRqUID() {
        return _rqUID;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.MsgRqHdr _msgRqHdr;

    /** 
     * Setter for msgRqHdr
     * @param msgRqHdr the org.sourceforge.ifx.framework.element.MsgRqHdr to set
     */
    public void setMsgRqHdr(org.sourceforge.ifx.framework.element.MsgRqHdr _msgRqHdr) {
        this._msgRqHdr = _msgRqHdr;
    }

    /**
     * Getter for msgRqHdr
     * @return a org.sourceforge.ifx.framework.element.MsgRqHdr
     */
    public org.sourceforge.ifx.framework.element.MsgRqHdr getMsgRqHdr() {
        return _msgRqHdr;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.RecCtrlIn _recCtrlIn;

    /** 
     * Setter for recCtrlIn
     * @param recCtrlIn the org.sourceforge.ifx.framework.element.RecCtrlIn to set
     */
    public void setRecCtrlIn(org.sourceforge.ifx.framework.element.RecCtrlIn _recCtrlIn) {
        this._recCtrlIn = _recCtrlIn;
    }

    /**
     * Getter for recCtrlIn
     * @return a org.sourceforge.ifx.framework.element.RecCtrlIn
     */
    public org.sourceforge.ifx.framework.element.RecCtrlIn getRecCtrlIn() {
        return _recCtrlIn;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.SelRangeDt _selRangeDt;

    /** 
     * Setter for selRangeDt
     * @param selRangeDt the org.sourceforge.ifx.framework.element.SelRangeDt to set
     */
    public void setSelRangeDt(org.sourceforge.ifx.framework.element.SelRangeDt _selRangeDt) {
        this._selRangeDt = _selRangeDt;
    }

    /**
     * Getter for selRangeDt
     * @return a org.sourceforge.ifx.framework.element.SelRangeDt
     */
    public org.sourceforge.ifx.framework.element.SelRangeDt getSelRangeDt() {
        return _selRangeDt;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.Method[] _method;

    /** 
     * Setter for method
     * @param method the org.sourceforge.ifx.framework.element.Method[] to set
     */
    public void setMethod(org.sourceforge.ifx.framework.element.Method[] _method) {
        this._method = _method;
    }

    /**
     * Getter for method
     * @return a org.sourceforge.ifx.framework.element.Method[]
     */
    public org.sourceforge.ifx.framework.element.Method[] getMethod() {
        return _method;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.TerminalSPObjId[] _terminalSPObjId;

    /** 
     * Setter for terminalSPObjId
     * @param terminalSPObjId the org.sourceforge.ifx.framework.element.TerminalSPObjId[] to set
     */
    public void setTerminalSPObjId(org.sourceforge.ifx.framework.element.TerminalSPObjId[] _terminalSPObjId) {
        this._terminalSPObjId = _terminalSPObjId;
    }

    /**
     * Getter for terminalSPObjId
     * @return a org.sourceforge.ifx.framework.element.TerminalSPObjId[]
     */
    public org.sourceforge.ifx.framework.element.TerminalSPObjId[] getTerminalSPObjId() {
        return _terminalSPObjId;
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
       * RqUID
       * MsgRqHdr
       * RecCtrlIn
       * SelRangeDt
       * Method
       * TerminalSPObjId
       */
    public final String[] ELEMENTS = {
              "RqUID"
                 ,"MsgRqHdr"
                 ,"RecCtrlIn"
                 ,"SelRangeDt"
                 ,"Method"
                 ,"TerminalSPObjId"
          };
}
