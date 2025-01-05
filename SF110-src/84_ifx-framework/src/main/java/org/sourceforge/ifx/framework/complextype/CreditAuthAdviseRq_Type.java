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
public class CreditAuthAdviseRq_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public CreditAuthAdviseRq_Type() {
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
    private org.sourceforge.ifx.framework.element.CreditAuthRec _creditAuthRec;

    /** 
     * Setter for creditAuthRec
     * @param creditAuthRec the org.sourceforge.ifx.framework.element.CreditAuthRec to set
     */
    public void setCreditAuthRec(org.sourceforge.ifx.framework.element.CreditAuthRec _creditAuthRec) {
        this._creditAuthRec = _creditAuthRec;
    }

    /**
     * Getter for creditAuthRec
     * @return a org.sourceforge.ifx.framework.element.CreditAuthRec
     */
    public org.sourceforge.ifx.framework.element.CreditAuthRec getCreditAuthRec() {
        return _creditAuthRec;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CreditAuthId _creditAuthId;

    /** 
     * Setter for creditAuthId
     * @param creditAuthId the org.sourceforge.ifx.framework.element.CreditAuthId to set
     */
    public void setCreditAuthId(org.sourceforge.ifx.framework.element.CreditAuthId _creditAuthId) {
        this._creditAuthId = _creditAuthId;
    }

    /**
     * Getter for creditAuthId
     * @return a org.sourceforge.ifx.framework.element.CreditAuthId
     */
    public org.sourceforge.ifx.framework.element.CreditAuthId getCreditAuthId() {
        return _creditAuthId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CreditAuthStatus _creditAuthStatus;

    /** 
     * Setter for creditAuthStatus
     * @param creditAuthStatus the org.sourceforge.ifx.framework.element.CreditAuthStatus to set
     */
    public void setCreditAuthStatus(org.sourceforge.ifx.framework.element.CreditAuthStatus _creditAuthStatus) {
        this._creditAuthStatus = _creditAuthStatus;
    }

    /**
     * Getter for creditAuthStatus
     * @return a org.sourceforge.ifx.framework.element.CreditAuthStatus
     */
    public org.sourceforge.ifx.framework.element.CreditAuthStatus getCreditAuthStatus() {
        return _creditAuthStatus;
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
       * CreditAuthRec
       * CreditAuthId
       * CreditAuthStatus
       */
    public final String[] ELEMENTS = {
              "RqUID"
                 ,"MsgRqHdr"
                 ,"AsyncRqUID"
                 ,"CustId"
                 ,"CreditAuthRec"
                 ,"CreditAuthId"
                 ,"CreditAuthStatus"
          };
}
