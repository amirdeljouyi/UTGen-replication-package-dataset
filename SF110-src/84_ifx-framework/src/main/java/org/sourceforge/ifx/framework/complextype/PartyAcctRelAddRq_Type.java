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
public class PartyAcctRelAddRq_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public PartyAcctRelAddRq_Type() {
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
    private org.sourceforge.ifx.framework.element.DepAcctId _depAcctId;

    /** 
     * Setter for depAcctId
     * @param depAcctId the org.sourceforge.ifx.framework.element.DepAcctId to set
     */
    public void setDepAcctId(org.sourceforge.ifx.framework.element.DepAcctId _depAcctId) {
        this._depAcctId = _depAcctId;
    }

    /**
     * Getter for depAcctId
     * @return a org.sourceforge.ifx.framework.element.DepAcctId
     */
    public org.sourceforge.ifx.framework.element.DepAcctId getDepAcctId() {
        return _depAcctId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.CardAcctId _cardAcctId;

    /** 
     * Setter for cardAcctId
     * @param cardAcctId the org.sourceforge.ifx.framework.element.CardAcctId to set
     */
    public void setCardAcctId(org.sourceforge.ifx.framework.element.CardAcctId _cardAcctId) {
        this._cardAcctId = _cardAcctId;
    }

    /**
     * Getter for cardAcctId
     * @return a org.sourceforge.ifx.framework.element.CardAcctId
     */
    public org.sourceforge.ifx.framework.element.CardAcctId getCardAcctId() {
        return _cardAcctId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.LoanAcctId _loanAcctId;

    /** 
     * Setter for loanAcctId
     * @param loanAcctId the org.sourceforge.ifx.framework.element.LoanAcctId to set
     */
    public void setLoanAcctId(org.sourceforge.ifx.framework.element.LoanAcctId _loanAcctId) {
        this._loanAcctId = _loanAcctId;
    }

    /**
     * Getter for loanAcctId
     * @return a org.sourceforge.ifx.framework.element.LoanAcctId
     */
    public org.sourceforge.ifx.framework.element.LoanAcctId getLoanAcctId() {
        return _loanAcctId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.PartyAcctRelInfo[] _partyAcctRelInfo;

    /** 
     * Setter for partyAcctRelInfo
     * @param partyAcctRelInfo the org.sourceforge.ifx.framework.element.PartyAcctRelInfo[] to set
     */
    public void setPartyAcctRelInfo(org.sourceforge.ifx.framework.element.PartyAcctRelInfo[] _partyAcctRelInfo) {
        this._partyAcctRelInfo = _partyAcctRelInfo;
    }

    /**
     * Getter for partyAcctRelInfo
     * @return a org.sourceforge.ifx.framework.element.PartyAcctRelInfo[]
     */
    public org.sourceforge.ifx.framework.element.PartyAcctRelInfo[] getPartyAcctRelInfo() {
        return _partyAcctRelInfo;
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
       * DepAcctId
       * CardAcctId
       * LoanAcctId
       * PartyAcctRelInfo
       */
    public final String[] ELEMENTS = {
              "RqUID"
                 ,"MsgRqHdr"
                 ,"AsyncRqUID"
                 ,"CustId"
                 ,"DepAcctId"
                 ,"CardAcctId"
                 ,"LoanAcctId"
                 ,"PartyAcctRelInfo"
          };
}
