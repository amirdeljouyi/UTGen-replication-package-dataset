/*******************************************************************************
 * Copyright (c) 2009, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kaloyan Raev (SAP AG) - initial API and implementation
 *******************************************************************************/
package com.sap.netweaver.porta.core.snippets;

import java.util.Properties;

import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.Server;
import com.sap.netweaver.porta.core.ServerFactory;

public class SnippetServerFactory {
	
	public static void main(String[] args) throws CoreException {
		Properties props = new Properties();
		props.setProperty(ServerFactory.SERVER_TYPE, "NW7");
		props.setProperty("host", "localhost");
		props.setProperty("instance.number", "0");
		
		Server server1 = ServerFactory.createServer(props);
		System.out.println("server1 = " + server1);
		Server server2 = ServerFactory.createServer(props);
		System.out.println("server2 = " + server2);
		
		props.setProperty("instance.number", "1");
		Server server3 = ServerFactory.createServer(props);
		System.out.println("server3 = " + server3);
	}

}
