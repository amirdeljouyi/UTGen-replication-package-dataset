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
public class DevInqRs_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public DevInqRs_Type() {
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
    private org.sourceforge.ifx.framework.element.AsyncRqUID _asyncRqUID;

    /** 
     * Setter for asyncRqUID
     * @param asyncRqUID the org.sourceforge.ifx.framework.element.AsyncRqUID to set
     */
    public void setAsyncRqUID(org.sourceforge.ifx.framework.element.AsyncRqUID _asyncRqUID) {
        this._asyncRqUID = _asyncRqUID;
    }

    /**
     * Getter for asyncRqUID
     * @return a org.sourceforge.ifx.framework.element.AsyncRqUID
     */
    public org.sourceforge.ifx.framework.element.AsyncRqUID getAsyncRqUID() {
        return _asyncRqUID;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.RecCtrlOut _recCtrlOut;

    /** 
     * Setter for recCtrlOut
     * @param recCtrlOut the org.sourceforge.ifx.framework.element.RecCtrlOut to set
     */
    public void setRecCtrlOut(org.sourceforge.ifx.framework.element.RecCtrlOut _recCtrlOut) {
        this._recCtrlOut = _recCtrlOut;
    }

    /**
     * Getter for recCtrlOut
     * @return a org.sourceforge.ifx.framework.element.RecCtrlOut
     */
    public org.sourceforge.ifx.framework.element.RecCtrlOut getRecCtrlOut() {
        return _recCtrlOut;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.DevId[] _devId;

    /** 
     * Setter for devId
     * @param devId the org.sourceforge.ifx.framework.element.DevId[] to set
     */
    public void setDevId(org.sourceforge.ifx.framework.element.DevId[] _devId) {
        this._devId = _devId;
    }

    /**
     * Getter for devId
     * @return a org.sourceforge.ifx.framework.element.DevId[]
     */
    public org.sourceforge.ifx.framework.element.DevId[] getDevId() {
        return _devId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.DevStatusCode[] _devStatusCode;

    /** 
     * Setter for devStatusCode
     * @param devStatusCode the org.sourceforge.ifx.framework.element.DevStatusCode[] to set
     */
    public void setDevStatusCode(org.sourceforge.ifx.framework.element.DevStatusCode[] _devStatusCode) {
        this._devStatusCode = _devStatusCode;
    }

    /**
     * Getter for devStatusCode
     * @return a org.sourceforge.ifx.framework.element.DevStatusCode[]
     */
    public org.sourceforge.ifx.framework.element.DevStatusCode[] getDevStatusCode() {
        return _devStatusCode;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CSPRefId[] _cSPRefId;

    /** 
     * Setter for cSPRefId
     * @param cSPRefId the org.sourceforge.ifx.framework.element.CSPRefId[] to set
     */
    public void setCSPRefId(org.sourceforge.ifx.framework.element.CSPRefId[] _cSPRefId) {
        this._cSPRefId = _cSPRefId;
    }

    /**
     * Getter for cSPRefId
     * @return a org.sourceforge.ifx.framework.element.CSPRefId[]
     */
    public org.sourceforge.ifx.framework.element.CSPRefId[] getCSPRefId() {
        return _cSPRefId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.SPRefId[] _sPRefId;

    /** 
     * Setter for sPRefId
     * @param sPRefId the org.sourceforge.ifx.framework.element.SPRefId[] to set
     */
    public void setSPRefId(org.sourceforge.ifx.framework.element.SPRefId[] _sPRefId) {
        this._sPRefId = _sPRefId;
    }

    /**
     * Getter for sPRefId
     * @return a org.sourceforge.ifx.framework.element.SPRefId[]
     */
    public org.sourceforge.ifx.framework.element.SPRefId[] getSPRefId() {
        return _sPRefId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.DevRec[] _devRec;

    /** 
     * Setter for devRec
     * @param devRec the org.sourceforge.ifx.framework.element.DevRec[] to set
     */
    public void setDevRec(org.sourceforge.ifx.framework.element.DevRec[] _devRec) {
        this._devRec = _devRec;
    }

    /**
     * Getter for devRec
     * @return a org.sourceforge.ifx.framework.element.DevRec[]
     */
    public org.sourceforge.ifx.framework.element.DevRec[] getDevRec() {
        return _devRec;
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
       * AsyncRqUID
       * RecCtrlOut
       * DevId
       * DevStatusCode
       * CSPRefId
       * SPRefId
       * DevRec
       */
    public final String[] ELEMENTS = {
              "Status"
                 ,"RqUID"
                 ,"MsgRqHdr"
                 ,"MsgRsHdr"
                 ,"AsyncRqUID"
                 ,"RecCtrlOut"
                 ,"DevId"
                 ,"DevStatusCode"
                 ,"CSPRefId"
                 ,"SPRefId"
                 ,"DevRec"
          };
}
