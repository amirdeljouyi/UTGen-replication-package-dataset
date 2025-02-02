/*
 *   ====================================================================
 *                 Open Source Health Records Exchange
 *   ====================================================================
 *
 *   Copyright (C) 2006 Browsersoft Inc.
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License, version 2,
 *   as published by the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   The GNU General Public License is available at
 *   http://www.fsf.org/licensing/licenses/gpl.html
 *
 *   Email: info@openhre.org
 *   Web:   http://www.openhre.org
 */


package com.browsersoft.openhre.hl7.impl.config;

import com.browsersoft.openhre.hl7.api.config.HL7Table;
import com.browsersoft.openhre.hl7.api.config.HL7TableItemMap;


public class HL7TableImpl implements HL7Table {

    private String id;
    private String description;
    private HL7TableItemMap items;

    public HL7TableImpl() {
        items = new HL7TableItemMapImpl();
    }

    public String getID() {
        return id;
    }

    public void setID( String id ) {
       this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public HL7TableItemMap getItems() {
        return items;
    }

    public void setItems( HL7TableItemMap items ) {
       this.items = items;
    }

    public String toString() {

		String ret = " -----------------------------------------\n";
		ret += " table id=\"" + id + "\"\n";
		ret += " -----------------------------------------\n";

		if ( !description.equals("") ) {
			ret += " description=\"" + description + "\"\n";
		}

		ret += items.toString() + "\n";

		return ret;


	}

}
