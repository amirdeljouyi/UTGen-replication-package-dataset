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

import java.io.IOException;

/**
 * This component can be used to present any tag that doesn't have any children nor content.
 * Examples: &lt;br/&gt;, &lt;hr/&lt;, &lt;img/&gt;, &lt;link/&gt;, etc. Any-component doesn't have any default tagname
 * it will render as so a render hint is always required.
 *
 *  @author Henri Frilund
 */
public class Any extends RenderableComponent {
    public Any(Component parent, CharSequence renderHint) {
        super(parent, null, renderHint);
    }

    public String defaultTagName() {
        return null;
    }

    @Override
    public void renderComponent(XmlSerializer serializer) throws IOException {
        if (getTagName().equals("script"))
            serializer.text(" ");
        else
            super.renderComponent(serializer);
    }
    
}
