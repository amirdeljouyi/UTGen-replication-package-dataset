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
public class PassbkStatus_Type
        extends org.sourceforge.ifx.basetypes.IFXObject
{

    /** Default constructor */
    public PassbkStatus_Type() {
        super();
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.PassbkStatusCode _passbkStatusCode;

    /** 
     * Setter for passbkStatusCode
     * @param passbkStatusCode the org.sourceforge.ifx.framework.element.PassbkStatusCode to set
     */
    public void setPassbkStatusCode(org.sourceforge.ifx.framework.element.PassbkStatusCode _passbkStatusCode) {
        this._passbkStatusCode = _passbkStatusCode;
    }

    /**
     * Getter for passbkStatusCode
     * @return a org.sourceforge.ifx.framework.element.PassbkStatusCode
     */
    public org.sourceforge.ifx.framework.element.PassbkStatusCode getPassbkStatusCode() {
        return _passbkStatusCode;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.PassbkNewItemsToPrint _passbkNewItemsToPrint;

    /** 
     * Setter for passbkNewItemsToPrint
     * @param passbkNewItemsToPrint the org.sourceforge.ifx.framework.element.PassbkNewItemsToPrint to set
     */
    public void setPassbkNewItemsToPrint(org.sourceforge.ifx.framework.element.PassbkNewItemsToPrint _passbkNewItemsToPrint) {
        this._passbkNewItemsToPrint = _passbkNewItemsToPrint;
    }

    /**
     * Getter for passbkNewItemsToPrint
     * @return a org.sourceforge.ifx.framework.element.PassbkNewItemsToPrint
     */
    public org.sourceforge.ifx.framework.element.PassbkNewItemsToPrint getPassbkNewItemsToPrint() {
        return _passbkNewItemsToPrint;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.StatusDesc _statusDesc;

    /** 
     * Setter for statusDesc
     * @param statusDesc the org.sourceforge.ifx.framework.element.StatusDesc to set
     */
    public void setStatusDesc(org.sourceforge.ifx.framework.element.StatusDesc _statusDesc) {
        this._statusDesc = _statusDesc;
    }

    /**
     * Getter for statusDesc
     * @return a org.sourceforge.ifx.framework.element.StatusDesc
     */
    public org.sourceforge.ifx.framework.element.StatusDesc getStatusDesc() {
        return _statusDesc;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.EffDt _effDt;

    /** 
     * Setter for effDt
     * @param effDt the org.sourceforge.ifx.framework.element.EffDt to set
     */
    public void setEffDt(org.sourceforge.ifx.framework.element.EffDt _effDt) {
        this._effDt = _effDt;
    }

    /**
     * Getter for effDt
     * @return a org.sourceforge.ifx.framework.element.EffDt
     */
    public org.sourceforge.ifx.framework.element.EffDt getEffDt() {
        return _effDt;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.ApprovalId _approvalId;

    /** 
     * Setter for approvalId
     * @param approvalId the org.sourceforge.ifx.framework.element.ApprovalId to set
     */
    public void setApprovalId(org.sourceforge.ifx.framework.element.ApprovalId _approvalId) {
        this._approvalId = _approvalId;
    }

    /**
     * Getter for approvalId
     * @return a org.sourceforge.ifx.framework.element.ApprovalId
     */
    public org.sourceforge.ifx.framework.element.ApprovalId getApprovalId() {
        return _approvalId;
    }

    // property declaration 
    private org.sourceforge.ifx.framework.element.StatusModBy _statusModBy;

    /** 
     * Setter for statusModBy
     * @param statusModBy the org.sourceforge.ifx.framework.element.StatusModBy to set
     */
    public void setStatusModBy(org.sourceforge.ifx.framework.element.StatusModBy _statusModBy) {
        this._statusModBy = _statusModBy;
    }

    /**
     * Getter for statusModBy
     * @return a org.sourceforge.ifx.framework.element.StatusModBy
     */
    public org.sourceforge.ifx.framework.element.StatusModBy getStatusModBy() {
        return _statusModBy;
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
       * PassbkStatusCode
       * PassbkNewItemsToPrint
       * StatusDesc
       * EffDt
       * ApprovalId
       * StatusModBy
       */
    public final String[] ELEMENTS = {
              "PassbkStatusCode"
                 ,"PassbkNewItemsToPrint"
                 ,"StatusDesc"
                 ,"EffDt"
                 ,"ApprovalId"
                 ,"StatusModBy"
          };
}
