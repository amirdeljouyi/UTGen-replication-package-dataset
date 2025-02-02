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
public class TerminalSPObjAdviseRs_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public TerminalSPObjAdviseRs_Type() {
        super();
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.Status _status;

    /** 
     * Setter for status
     * @param status the org.sourceforge.ifx.framework.element.Status to set
     */
    public void setStatus(org.sourceforge.ifx.framework.element.Status _status) {
        this._status = _status;
    }

    /**
     * Getter for status
     * @return a org.sourceforge.ifx.framework.element.Status
     */
    public org.sourceforge.ifx.framework.element.Status getStatus() {
        return _status;
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
    private org.sourceforge.ifx.framework.element.MsgRsHdr _msgRsHdr;

    /** 
     * Setter for msgRsHdr
     * @param msgRsHdr the org.sourceforge.ifx.framework.element.MsgRsHdr to set
     */
    public void setMsgRsHdr(org.sourceforge.ifx.framework.element.MsgRsHdr _msgRsHdr) {
        this._msgRsHdr = _msgRsHdr;
    }

    /**
     * Getter for msgRsHdr
     * @return a org.sourceforge.ifx.framework.element.MsgRsHdr
     */
    public org.sourceforge.ifx.framework.element.MsgRsHdr getMsgRsHdr() {
        return _msgRsHdr;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.TerminalSPObjRec _terminalSPObjRec;

    /** 
     * Setter for terminalSPObjRec
     * @param terminalSPObjRec the org.sourceforge.ifx.framework.element.TerminalSPObjRec to set
     */
    public void setTerminalSPObjRec(org.sourceforge.ifx.framework.element.TerminalSPObjRec _terminalSPObjRec) {
        this._terminalSPObjRec = _terminalSPObjRec;
    }

    /**
     * Getter for terminalSPObjRec
     * @return a org.sourceforge.ifx.framework.element.TerminalSPObjRec
     */
    public org.sourceforge.ifx.framework.element.TerminalSPObjRec getTerminalSPObjRec() {
        return _terminalSPObjRec;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.TerminalSPObjId _terminalSPObjId;

    /** 
     * Setter for terminalSPObjId
     * @param terminalSPObjId the org.sourceforge.ifx.framework.element.TerminalSPObjId to set
     */
    public void setTerminalSPObjId(org.sourceforge.ifx.framework.element.TerminalSPObjId _terminalSPObjId) {
        this._terminalSPObjId = _terminalSPObjId;
    }

    /**
     * Getter for terminalSPObjId
     * @return a org.sourceforge.ifx.framework.element.TerminalSPObjId
     */
    public org.sourceforge.ifx.framework.element.TerminalSPObjId getTerminalSPObjId() {
        return _terminalSPObjId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.TerminalSPObjStatus _terminalSPObjStatus;

    /** 
     * Setter for terminalSPObjStatus
     * @param terminalSPObjStatus the org.sourceforge.ifx.framework.element.TerminalSPObjStatus to set
     */
    public void setTerminalSPObjStatus(org.sourceforge.ifx.framework.element.TerminalSPObjStatus _terminalSPObjStatus) {
        this._terminalSPObjStatus = _terminalSPObjStatus;
    }

    /**
     * Getter for terminalSPObjStatus
     * @return a org.sourceforge.ifx.framework.element.TerminalSPObjStatus
     */
    public org.sourceforge.ifx.framework.element.TerminalSPObjStatus getTerminalSPObjStatus() {
        return _terminalSPObjStatus;
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
       * Status
       * RqUID
       * MsgRqHdr
       * MsgRsHdr
       * TerminalSPObjRec
       * TerminalSPObjId
       * TerminalSPObjStatus
       */
    public final String[] ELEMENTS = {
              "Status"
                 ,"RqUID"
                 ,"MsgRqHdr"
                 ,"MsgRsHdr"
                 ,"TerminalSPObjRec"
                 ,"TerminalSPObjId"
                 ,"TerminalSPObjStatus"
          };
}
