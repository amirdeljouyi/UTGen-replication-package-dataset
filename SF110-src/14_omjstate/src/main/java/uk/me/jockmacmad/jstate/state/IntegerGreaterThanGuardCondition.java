/*
	This code is (c) Don Stewart 2001.

This file is part of OMJState.

	OMJState is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.
    OMJState is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with OMJState; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA */

package uk.me.jockmacmad.jstate.state;

/**
 * Insert the type's description here.
 * Creation date: (2/15/01 2:33:42 PM)
 * @author:
 */
public class IntegerGreaterThanGuardCondition implements uk.me.jockmacmad.jstate.state.IGuardCondition {
    private transient final int Value;

    private IntegerGreaterThanGuardCondition() {
        Value = 0;
    }
    /**
     * IntegerGreaterThanGuardCondition constructor comment.
     */
    public IntegerGreaterThanGuardCondition(final int pInt) {
        super();
        Value = pInt;
    }

    /**
     * evaluate method comment.
     */
    public boolean evaluate(final Object object) {
        boolean retVal = false;
        try {
            final java.util.Vector params = ((uk.me.jockmacmad.jstate.state.Event) object).getParameters();
            final Integer integer = (Integer) params.elementAt(0);
            if (integer.intValue() > Value) {
                retVal = true;
            }
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return retVal;
    }

    /**
     * Insert the method's description here.
     * Creation date: (2/15/01 2:37:29 PM)
     * @return int
     */
    public int getValue() {
        return Value;
    }
}