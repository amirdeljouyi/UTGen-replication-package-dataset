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
public class CustAuthRevRq_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public CustAuthRevRq_Type() {
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
    private org.sourceforge.ifx.framework.element.CustId _custId;

    /** 
     * Setter for custId
     * @param custId the org.sourceforge.ifx.framework.element.CustId to set
     */
    public void setCustId(org.sourceforge.ifx.framework.element.CustId _custId) {
        this._custId = _custId;
    }

    /**
     * Getter for custId
     * @return a org.sourceforge.ifx.framework.element.CustId
     */
    public org.sourceforge.ifx.framework.element.CustId getCustId() {
        return _custId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.TerminalId _terminalId;

    /** 
     * Setter for terminalId
     * @param terminalId the org.sourceforge.ifx.framework.element.TerminalId to set
     */
    public void setTerminalId(org.sourceforge.ifx.framework.element.TerminalId _terminalId) {
        this._terminalId = _terminalId;
    }

    /**
     * Getter for terminalId
     * @return a org.sourceforge.ifx.framework.element.TerminalId
     */
    public org.sourceforge.ifx.framework.element.TerminalId getTerminalId() {
        return _terminalId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.RevReasonCode _revReasonCode;

    /** 
     * Setter for revReasonCode
     * @param revReasonCode the org.sourceforge.ifx.framework.element.RevReasonCode to set
     */
    public void setRevReasonCode(org.sourceforge.ifx.framework.element.RevReasonCode _revReasonCode) {
        this._revReasonCode = _revReasonCode;
    }

    /**
     * Getter for revReasonCode
     * @return a org.sourceforge.ifx.framework.element.RevReasonCode
     */
    public org.sourceforge.ifx.framework.element.RevReasonCode getRevReasonCode() {
        return _revReasonCode;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.Desc _desc;

    /** 
     * Setter for desc
     * @param desc the org.sourceforge.ifx.framework.element.Desc to set
     */
    public void setDesc(org.sourceforge.ifx.framework.element.Desc _desc) {
        this._desc = _desc;
    }

    /**
     * Getter for desc
     * @return a org.sourceforge.ifx.framework.element.Desc
     */
    public org.sourceforge.ifx.framework.element.Desc getDesc() {
        return _desc;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CustAuthMsgRqInfo _custAuthMsgRqInfo;

    /** 
     * Setter for custAuthMsgRqInfo
     * @param custAuthMsgRqInfo the org.sourceforge.ifx.framework.element.CustAuthMsgRqInfo to set
     */
    public void setCustAuthMsgRqInfo(org.sourceforge.ifx.framework.element.CustAuthMsgRqInfo _custAuthMsgRqInfo) {
        this._custAuthMsgRqInfo = _custAuthMsgRqInfo;
    }

    /**
     * Getter for custAuthMsgRqInfo
     * @return a org.sourceforge.ifx.framework.element.CustAuthMsgRqInfo
     */
    public org.sourceforge.ifx.framework.element.CustAuthMsgRqInfo getCustAuthMsgRqInfo() {
        return _custAuthMsgRqInfo;
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
       * AsyncRqUID
       * CustId
       * TerminalId
       * RevReasonCode
       * Desc
       * CustAuthMsgRqInfo
       */
    public final String[] ELEMENTS = {
              "RqUID"
                 ,"MsgRqHdr"
                 ,"AsyncRqUID"
                 ,"CustId"
                 ,"TerminalId"
                 ,"RevReasonCode"
                 ,"Desc"
                 ,"CustAuthMsgRqInfo"
          };
}
