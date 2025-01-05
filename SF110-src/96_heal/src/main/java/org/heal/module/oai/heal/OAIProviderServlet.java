/*
 * Created on Dec 16, 2004
 *
 */
package org.heal.module.oai.heal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.heal.module.oai.provider.OAIMetadataFormat;
import org.heal.module.oai.provider.OAIProvider;
import org.heal.util.FileLocator;

import com.ora.jsp.sql.DataSourceWrapper;

/**
 * The front end for the HEAL implementation of the OAI provider
 * protocol.  The full configuration options for the OAI provider are
 * as follows:<br>
 * <ul>
 * <li><code>idPrefix</code> - the prefix for OAI identifiers generated by this
 * provider. The final identifier is generated as <code>idPrefix</code>GlobalID.
 * e.g., metadata with the GlobalID <code>XXX-XXXX-XXXX</code> 
 * an <code>idPrefix</code> of <code>oai:org.heal:</code>, would lead to an idetifer 
 * of <code>oai:org:heal:XXX-XXXX-XXXX</code>.</li>
 * <li><code>resumptionThreshold</code> - This is the number of records that will 
 * be returned in any one request to ListSets or ListIdentifiers until a
 * resumptionToken is returned.  The default is 10.  A value of zero means no 
 * resumptionTokens will be generated.</li>
 * <li><code>coverage</code> - This is the value returned in the dublin core coverage 
 * element.  The default is <code>health-sciences</code>.</li>
 * <li><code>metametadataRole</code> - The value defined in the metadata's about
 * clause in the response.</li>
 * <li><code>granularity</code> - The granularity, in Java parsing format 
 * (see SimpleDateFormat).  The default is "yyyy-MM-dd'T'HH:mm:ss'Z'", and the 
 * minimum granularity supported by the OAI protocol specification is by the day 
 * (YYYY-MM-dd).</li>
 * <li><code>adminEmails</code> - a comma separated list of email addresses that
 * are included in response to OAI 'Identify' requests.  The default is: 
 * info@healcentral.org</li>
 * <li><code>description</code> - A description of the provider that is included
 * in responses to OAI 'Identify' requests.</li>
 * <li><code>healVCard</code> - The vCard used to describe HEAL.  This is included in
 * in the about clause of each metadata item in 'GetRecord' and 'ListRecords' requests.</li>
 * <li><code>allowedCollections</code> - A comma separated list of the allowable collections
 * (as found in the SourceCollection field of the Metadata table) that will be exposed 
 * via the provider.  A value of <code>all</code> means just that, all collections will
 * be exposed.</li>
 * <li><code>metadataFormats</code> - A comma separated list of prefix/class combinations
 * defining the metadata formats and their java implementations.  The first portion of each
 * entry specifies the prefix that defines this format (e.g. "oai_dc").  This is
 * used by OAI harvesters to select the format/namespace of the responses.  An example
 * parameter string is: <code>oai_dc/org.heal.module.oai.provider.oai_dc.OAI_DCMetadataFormat,nsdl_dc/org.heal.module.oai.provider.nsdl_dc.NSDL_DCMetadataFormat</code></li>
 * <li><code>repositoryName</code> - The name of the repository associated with this OAI provider.</li>
 * <li><code>baseURL</code> - The URL associated with the oaiprovider servlet.  Defaults to <code>http://www.healcentral.org/heal/oaiprovider</code></li>
 * <li><code>jdbcDriverClassname</code> - The class name of the jdbc driver to use in connecting to the database.</li>
 * <li><code>jdbcURL</code> - The URL of the heal database.</li>
 * <li><code>jdbcUser</code> - The username to use when connecting to the heal database.</li>
 * <li><code>jdbcPassword</code> - The password associated with the username that is used to connect to the heal database.</li>
 * </ul>
 * @author Seth Wright
 *
 */
public class OAIProviderServlet extends HttpServlet {
	private static final String defaultIdPrefix = "oai:org.heal:";
	private static final int defaultResumptionThreshold = 10;
	private static final String defaultCoverage = "health-sciences";
	private static final String defaultMetametadataRole = "primary";
	private static final String defaultGranularity = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	private static final String[] defaultAdminEmails = {"info@healcentral.org"};
	private static final String[] defaultDescriptions = {"The Health Education Assets Library (HEAL) is a digital library of freely accessible, web-based multimedia teaching materials that meet the needs of today's health sciences educators and learners. The HEAL collection currently contains a number of collections of multimedia resources for health sciences undergraduate and professional education, as well as resources for patient and consumer health."};
	private static final String defaultHealVCard = "begin:vcard\nn:Health Education Assets Library (HEAL)\nurl:http://www.healcentral.org\nemail;type=internet:info@healcentral.org\nfn:Health Education Assets Library (HEAL)\nend:vcard";
	private static final String[] defaultAllowedCollections = {"Peer Review Pending","HEAL Reviewed Collection"};
	private static final String defaultRepositoryName = "Health Education Assets Library";
	private static final String defaultBaseURL = "http://www.healcentral.org/heal/oaiprovider";	
	private HEALDataAccessor dataAccessor = null;
	
	/**
	 * Creates the application scope objects used by
	 * JSP pages in this application.
	 */
	public void init() throws ServletException {
		HEALProviderConfig providerConfig = null;	
		DataSource ds = null;

		ServletConfig config = getServletConfig();
		String jdbcDriverClassName = config.getInitParameter("jdbcDriverClassName");
		String jdbcURL = config.getInitParameter("jdbcURL");
		String jdbcUser = config.getInitParameter("jdbcUser");
		String jdbcPassword = config.getInitParameter("jdbcPassword");
        String contentPath = config.getInitParameter("healContentPath");
        String healBaseURL = config.getInitParameter("healBaseURL");
        System.out.println("content path: "+contentPath);
        System.out.println("healBaseURL: "+healBaseURL);
		ServletContext context = getServletContext();
		try {
			// use the DataSourceWrapper from the O'Reilly JSP library
			ds = new DataSourceWrapper(jdbcDriverClassName, jdbcURL, jdbcUser, jdbcPassword);
		} catch(Exception e) {
			throw new ServletException("Unable to initialize HEAL OAI Provider application" +
					" due to an inability to open a " +
					" connection to the database.  Reason:" +
					e.toString());
		}
		if(ds == null) {
			throw new ServletException("Unable to initialize HEAL OAI Provider application" +
					" due to an inability to open a " +
					" connection to the database.");
		}


		String idPrefix = config.getInitParameter("idPrefix");
		if (idPrefix == null) {
			idPrefix = OAIProviderServlet.defaultIdPrefix;
		}
		String resumptionThresholdStr = config.getInitParameter("resumptionThreshold");
		int resumptionThreshold = 0;
		if (resumptionThresholdStr == null) {
			resumptionThreshold = OAIProviderServlet.defaultResumptionThreshold;
		} else {
			try {
				resumptionThreshold = Integer.parseInt(resumptionThresholdStr);
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
				throw new ServletException("Unable to initialize HEAL OAI Provider application" +
						" due to an invalid resumptionThreshold config parameter.  The expected" +
						" format is an integer.  The provided parameter was:"+resumptionThresholdStr);
			}
		}
		String coverage = config.getInitParameter("coverage");
		if (coverage == null) {
			coverage = OAIProviderServlet.defaultCoverage;
		}
		String metametadataRole = config.getInitParameter("metametadataRole");
		if (metametadataRole == null) {
			metametadataRole = OAIProviderServlet.defaultMetametadataRole;
		}
		String granularity = config.getInitParameter("granularity");
		if (granularity == null) {
			granularity = OAIProviderServlet.defaultGranularity;
		}
		String descriptionsStr = config.getInitParameter("description");
		String[] descriptions = null;
		if (descriptionsStr == null) {
			descriptions = OAIProviderServlet.defaultDescriptions;
		} else {
			descriptions = new String[1];
			descriptions[0] = descriptionsStr;
		}
		String adminEmailsStr = config.getInitParameter("adminEmails");
		String[] adminEmails = null;
		if (adminEmailsStr == null) {
			adminEmails = OAIProviderServlet.defaultAdminEmails;
		} else {
			ArrayList list = new ArrayList();
			StringTokenizer tokenizer = new StringTokenizer(adminEmailsStr,",");
			while (tokenizer.hasMoreTokens()) {
				list.add(tokenizer.nextToken());
			}
			if (list.size() > 0) {
				adminEmails = new String[list.size()];
				Iterator iter = list.iterator();
				for (int i=0;iter.hasNext();i++) {
					adminEmails[i] = (String)iter.next();
				}
			}
		}
		String healVCard = config.getInitParameter("healVCard");
		if (healVCard == null) {
			healVCard = OAIProviderServlet.defaultHealVCard;
		}
		String allowedCollectionsStr = config.getInitParameter("allowedCollections");
		String[] allowedCollections = null;
		if (allowedCollectionsStr == null) {
			allowedCollections = OAIProviderServlet.defaultAllowedCollections;
		} else if (!"all".equalsIgnoreCase(allowedCollectionsStr)) {
			//if we have 'all' then we leave it as null because the 
			//HealDataAccessor interprets that as it should include all source collections
			ArrayList list = new ArrayList();
			StringTokenizer tokenizer = new StringTokenizer(allowedCollectionsStr,",");
			while (tokenizer.hasMoreTokens()) {
				list.add(tokenizer.nextToken());
			}
			if (list.size() > 0) {
				allowedCollections = new String[list.size()];
				Iterator iter = list.iterator();
				for (int i=0;iter.hasNext();i++) {
					allowedCollections[i] = (String)iter.next();
				}
			}
		}
		String formatsString = config.getInitParameter("metadataFormats");
		OAIMetadataFormat[] formats = getMetadataFormats(formatsString);
		String repositoryName = config.getInitParameter("repositoryName");
		if (repositoryName == null) {
			repositoryName = defaultRepositoryName;
		}
		String baseURL = config.getInitParameter("baseURL");
		if (baseURL == null) {
			baseURL = defaultBaseURL;
		}
				
		providerConfig = new HEALProviderConfig(idPrefix,
												resumptionThreshold,
												coverage,
												metametadataRole,
												granularity,
												descriptions,
												adminEmails,
												healVCard,
												allowedCollections,
												repositoryName,
												baseURL,
												formats,
												healBaseURL+'/'+contentPath);
		dataAccessor = new HEALDataAccessor(providerConfig,ds);
		//initialize the provider wrapper
		OAIProvider.init(providerConfig);
	}

	private OAIMetadataFormat[] getMetadataFormats(String formatsString) throws ServletException {
		if (formatsString == null) {
			throw new ServletException("Unable to initialize HEAL OAI Provider application" +
					" due to a configuration error.  No metadata formats are configured.");
		} 
		StringTokenizer tokenizer = new StringTokenizer(formatsString,",");
		ArrayList formatList = new ArrayList();
		while (tokenizer.hasMoreTokens()) {
			String formatStr = tokenizer.nextToken();
			int slashIndex = formatStr.indexOf('/');
			if (slashIndex > 0 && slashIndex < formatStr.length()-1) {
				String prefix = formatStr.substring(0,slashIndex);
				String format = formatStr.substring(slashIndex+1);
				try {
					Class classDefinition = Class.forName(format);
					OAIMetadataFormat formatInstance = (OAIMetadataFormat) classDefinition.newInstance();
					formatInstance.setPrefix(prefix);
					formatList.add(formatInstance);
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
					throw new ServletException("Unable to initialize HEAL OAI Provider application" +
							" due to a configuration error.  Cannot find the following format class in the classpath: "+format);
				} catch (InstantiationException ex2) {
					ex2.printStackTrace();
					throw new ServletException("Unable to initialize HEAL OAI Provider application" +
							" due to a configuration error.  Cannot instantiate the following format class: "+format);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					throw new ServletException("Unable to initialize HEAL OAI Provider application" +
							" due to a configuration error.  Cannot access the following format class: "+format);
				}		 
			} else if (slashIndex >= formatStr.length()-1){
				throw new ServletException("Unable to initialize HEAL OAI Provider application" +
						" due to a configuration error.  A metadata format parameter is missing the format class: "+formatStr);
			} else {
				throw new ServletException("Unable to initialize HEAL OAI Provider application" +
						" due to a configuration error.  A metadata format parameter is missing the format prefix: "+formatStr);
			}
		}
		OAIMetadataFormat[] formats = null;
		int listLen = formatList.size();
		if (listLen == 0) {
			throw new ServletException("Unable to initialize HEAL OAI Provider application" +
					" due to a configuration error.  No metadata formats are configured.");
		}
		formats = new OAIMetadataFormat[listLen];
		Iterator iter = formatList.iterator();
		for (int i=0;iter.hasNext();i++) {
			formats[i] = (OAIMetadataFormat) iter.next();
		}
		return formats;
	}


	/**
	 * Refer all get requests to the central processing doPost method.
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}

	/**
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		Map parameters = request.getParameterMap();
		Iterator iter = parameters.keySet().iterator();
		HashMap realParameterMap = new HashMap();
		while (iter.hasNext()) {
			String param = (String)iter.next();
			realParameterMap.put(param,request.getParameterValues(param));
		}
		String requestURL = request.getRequestURL().toString();
		response.setContentType("text/xml");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		OAIProvider.processRequest(requestURL,dataAccessor,realParameterMap,writer);
		writer.flush();
	}
}
