/*
Copyright (c) 2007-2008, Henri Frilund

All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
    * Neither the name of the <ORGANIZATION> nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package wheel.components;

import org.xmlpull.v1.XmlSerializer;
import wheel.WheelException;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * A FormElement that knows how to handle numeric input. Uses java.text.DecimalFormat internally. Use the pattern format described in DecimalFormat class.
 * Has basic support for different schemes for handling decimal numbers. Supports '.' and ',' as decimal separators.
 * 
 * @author Henri Frilund
 */
public class NumberInput extends FormElement {
    private DecimalFormat numberFormat;

    NumberInput(Component parent, String elementName, String componentId, CharSequence numberPattern) {
        super(parent, elementName, componentId);
        try {
            numberFormat = new DecimalFormat(eval(numberPattern));
        } catch (Exception e) {
            throw new WheelException("Failed to initialize DecimalFormat with pattern '" + numberPattern + "'.", e, this);
        }
        attribute("type", "text");
        genericFieldErrorMessage = "numberInputError";
    }

    NumberInput(Component parent, String elementName, String componentId) {
        super(parent, elementName, componentId);
        attribute("type", "text");
    }

    public String defaultTagName() {
        return "input";
    }

    @Override
    public void _setSubmitValue(String[] value) {
        if (value[0].indexOf(",") != -1) {
            value[0] = value[0].replace(',', '.');

            if (numberFormat == null)
                numberFormat = new DecimalFormat();

            DecimalFormatSymbols symbols = numberFormat.getDecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
        }

        if (value[0].indexOf(" ") != -1) {
            value[0] = value[0].replaceAll(" ", "");

            if (numberFormat == null)
                numberFormat = new DecimalFormat();

            DecimalFormatSymbols symbols = numberFormat.getDecimalFormatSymbols();
            symbols.setGroupingSeparator(' ');
        }
        

        super._setSubmitValue(value);
    }

    @Override
    public void renderComponent(XmlSerializer serializer) throws IOException {
        if (isValid()) {
            serializer.attribute("", "value", eval(getBinding()));
        }
        else
            serializer.attribute("", "value", _getSubmitValue());

        super.renderComponent(serializer);
    }


    @Override
    public String _applyFormat(Object value) {
        if (numberFormat != null && value instanceof Number) {
            return numberFormat.format(value);
        }

        return super._applyFormat(value);
    }

}
