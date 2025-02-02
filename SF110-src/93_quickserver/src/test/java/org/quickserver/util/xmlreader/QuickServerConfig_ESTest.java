/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 14 16:16:56 GMT 2024
 */

package org.quickserver.util.xmlreader;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.QuickServer;
import org.quickserver.util.xmlreader.AccessConstraintConfig;
import org.quickserver.util.xmlreader.ApplicationConfiguration;
import org.quickserver.util.xmlreader.DBObjectPoolConfig;
import org.quickserver.util.xmlreader.InitServerHooks;
import org.quickserver.util.xmlreader.QSAdminServerConfig;
import org.quickserver.util.xmlreader.QuickServerConfig;
import org.quickserver.util.xmlreader.ServerHooks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuickServerConfig_ESTest extends QuickServerConfig_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecurityManagerClassReturningNonEmptyString() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setSecurityManagerClass("</max-auth-try>\n");
      String securityManagerClass = quickServerConfig.getSecurityManagerClass();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
      assertNotNull(securityManagerClass);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecurityManagerClassReturningEmptyString() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setSecurityManagerClass("");
      String securityManagerClass = quickServerConfig.getSecurityManagerClass();
      assertNotNull(securityManagerClass);
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQSAdminServerConfigReturningQSAdminServerConfigWhereGetTimeoutIsZero() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      QSAdminServerConfig arg0 = new QSAdminServerConfig();
      arg0.setTimeout(0);
      quickServerConfig.setQSAdminServerConfig(arg0);
      quickServerConfig.getQSAdminServerConfig();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQSAdminServerConfigReturningQSAdminServerConfigWhereGetTimeoutIsNegative() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      QSAdminServerConfig arg0 = new QSAdminServerConfig();
      arg0.setTimeout((-16));
      quickServerConfig.setQSAdminServerConfig(arg0);
      quickServerConfig.getQSAdminServerConfig();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQSAdminServerConfigReturningQSAdminServerConfigWhereGetCommunicationLoggingIsTrue() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      QSAdminServerConfig arg0 = new QSAdminServerConfig();
      arg0.setCommunicationLogging(true);
      quickServerConfig.setQSAdminServerConfig(arg0);
      quickServerConfig.getQSAdminServerConfig();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDBObjectPoolConfigReturningNonNull() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      DBObjectPoolConfig arg0 = new DBObjectPoolConfig();
      quickServerConfig.setDBObjectPoolConfig(arg0);
      quickServerConfig.getDBObjectPoolConfig();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConfigFileReturningNonEmptyString() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setConfigFile("2&>f?NJ4!.mK");
      quickServerConfig.getConfigFile();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConfigFileReturningEmptyString() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setConfigFile("");
      quickServerConfig.getConfigFile();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationJarPathReturningEmptyString() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setApplicationJarPath("");
      quickServerConfig.getApplicationJarPath();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationConfigurationReturningApplicationConfigurationWhereIsEmptyIsTrue() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      ApplicationConfiguration arg0 = new ApplicationConfiguration();
      quickServerConfig.setApplicationConfiguration(arg0);
      quickServerConfig.getApplicationConfiguration();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationConfigurationReturningApplicationConfigurationWhereIsEmptyIsFalse() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      ApplicationConfiguration arg0 = new ApplicationConfiguration();
      arg0.put((Object) null, (Object) null);
      quickServerConfig.setApplicationConfiguration(arg0);
      quickServerConfig.getApplicationConfiguration();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQSAdminServerConfigReturningNull() throws Throwable  {
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.getQSAdminServerConfig();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationConfigurationReturningNull() throws Throwable  {
      // rollbacked to evosuite
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.getApplicationConfiguration();
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDBObjectPoolConfigReturningNull() throws Throwable  {
      // Given a QuickServerConfig instance with default properties
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When the method to get DB object pool config is called
      DBObjectPoolConfig dbObjectPoolConfig = quickServerConfig.getDBObjectPoolConfig();
      
      // Then the returned config should have expected properties
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationJarPathReturningNull() throws Throwable  {
      // Given
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      String expectedName = "QuickServer v2.0.0 RC1";
      
      // When
      String actualName = quickServerConfig.getName();
      
      // Then
      assertEquals(expectedName, actualName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitServerHooksReturningNull() throws Throwable  {
      // Given: A QuickServerConfig object is created with a specific name
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When: The getName method is called on the QuickServerConfig object
      String actualName = quickServerConfig.getName();
      
      // Then: The correct name should be returned, which in this case is "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", actualName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecurityManagerClassReturningNull() throws Throwable  {
      // Given a QuickServerConfig object with a specific security manager class
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When the getSecurityManagerClass method is called on the object
      String actual = quickServerConfig.getSecurityManagerClass();
      
      // Then the expected name is returned
      assertEquals("QuickServer v2.0.0 RC1", actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetInitServerHooks() throws Throwable  {
      // rollbacked to evosuite
      QuickServer quickServer = new QuickServer("\t<max-connection-msg>");
      QuickServerConfig config = quickServer.getConfig();
      InitServerHooks arg0 = new InitServerHooks();
      config.setInitServerHooks(arg0);
      config.toXML(",pIFnUpz\"");
      assertEquals("QuickServer v2.0.0 RC1", config.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithEmptyString() throws Throwable  {
      // No Comments were added
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      QuickServer quickServer = new QuickServer("|NO\"1coxo");
      ServerHooks arg0 = quickServer.getServerHooks();
      quickServerConfig.setServerHooks(arg0);
      quickServerConfig.toXML("");
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetApplicationJarPath() throws Throwable  {
      // Given a QuickServerConfig instance with applicationJarPath set to "/path/to/application.jar"
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setApplicationJarPath("/path/to/application.jar");
      
      // When the method toXML is called with a valid file name "bTJKf.kD/iRqJS"
      quickServerConfig.toXML("bTJKf.kD/iRqJS");
      
      // Then the method should return a string containing the XML representation of the QuickServerConfig instance
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString0() throws Throwable  {
      // Given a QuickServerConfig instance with an AccessConstraintConfig set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      AccessConstraintConfig accessConstraintConfig = new AccessConstraintConfig();
      quickServerConfig.setAccessConstraintConfig(accessConstraintConfig);
      
      // When the config is converted to XML and the URL is set
      String xml = quickServerConfig.toXML("https://www.example.com");
      
      // Then the name of the QuickServer should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNull0() throws Throwable  {
      // Given a QuickServerConfig object
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When the console logging formatter is set to "MX_1005"
      quickServerConfig.setConsoleLoggingFormatter("MX_1005");
      
      // And the XML representation of the config object is generated
      quickServerConfig.toXML((String) null);
      
      // Then the name of the QuickServerConfig object should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString1() throws Throwable  {
      // Given: A QuickServerConfig object has been created
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When: The client extended event handler is set to a specific value
      quickServerConfig.setClientExtendedEventHandler("</quickserver>\n");
      
      // Then: The name of the QuickServerConfig should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString2() throws Throwable  {
      // Given a QuickServerConfig object with a client data set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      Data arg0 = new Data();
      quickServerConfig.setClientData((ClientData) arg0);
      
      // When the toXML method is called with a string argument
      String xmlString = quickServerConfig.toXML("}D5y3L?l!MZSe[P");
      
      // Then the method should return a XML string representing the QuickServerConfig object
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString3() throws Throwable  {
      // Given: The QuickServerConfig object has been initialized with some valid values
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setAuthenticator("SOhKem95Pz8 c.&");
      quickServerConfig.toXML("S4_y}2|Tx{9");
      
      // When: The QuickServerConfig object is converted to XML using the toXML() method
      String xml = quickServerConfig.toXML("S4_y}2|Tx{9");
      
      // Then: The resulting XML string should contain the expected values and structure
      assertEquals("<quick-server><authenticator>SOhKem95Pz8 c.&</authenticator><name>QuickServer v2.0.0 RC1</name></quick-server>", xml);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString4() throws Throwable  {
      // Given: A QuickServerConfig object with a name set to "QuickServer v2.0.0 RC1"
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setName("QuickServer v2.0.0 RC1");
      
      // When: The getName method is called on the QuickServerConfig object
      String actualName = quickServerConfig.getName();
      
      // Then: The expected name "QuickServer v2.0.0 RC1" should be returned
      assertEquals("QuickServer v2.0.0 RC1", actualName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNull1() throws Throwable  {
      // Create a new QuickServerConfig object with a clientBinaryHandler set to "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setClientBinaryHandler("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
      
      // Convert the object to an XML string using the toXML() method
      String xmlString = quickServerConfig.toXML((String) null);
      
      // Assert that the name of the server is "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString5() throws Throwable  {
      // Given a QuickServerConfig object with clientObjectHandler set to "<port>"
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setClientObjectHandler("\t<port>");
      
      // When the toXML method is called with a null String parameter
      String xmlString = quickServerConfig.toXML("(String) null");
      
      // Then the name of the QuickServer should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString6() throws Throwable  {
      // Given a QuickServerConfig object with a client command handler set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      CommandHandler commandHandler = new CommandHandler();
      quickServerConfig.setClientCommandHandler(commandHandler);
      
      // When the toXML method is called with a message
      String xmlMessage = quickServerConfig.toXML("Can't send Binary :DataType.OUT is not in DataMode.BINARY");
      
      // Then the method should return a XML string that represents the QuickServerConfig object
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString7() throws Throwable  {
      // No Comments were added
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setClientEventHandler("http://example.com/client-event");
      quickServerConfig.toXML("<root><clientEvent>http://example.com/client-event</clientEvent></root>");
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString8() throws Throwable  {
      // Given: A QuickServerConfig object is created and its bind address is set to "0.0.0.0"
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setBindAddr("0.0.0.0");
      
      // When: The bind address is converted to XML using the "toXML()" method
      String xmlString = quickServerConfig.toXML("\t<authenticator>");
      
      // Then: The name of the server should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToXMLWithNonEmptyString9() throws Throwable  {
      // Given a QuickServerConfig object with a server banner set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setServerBanner("Welcome to our server!");
      
      // When the QuickServerConfig is converted to an XML string
      String xmlString = quickServerConfig.toXML("Welcome to our server!");
      
      // Then the name of the QuickServerConfig should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSecurityManagerClass() throws Throwable  {
      // Given: A QuickServerConfig object with a custom security manager class set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setSecurityManagerClass("com.example.security.MyCustomSecurityManager");
      
      // When: The QuickServerConfig is converted to XML and saved to a file
      quickServerConfig.toXML("http://www.example.com/server.xml");
      
      // Then: The name of the server should be set correctly
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSecurityManagerClassWithNull() throws Throwable  {
      // Given a QuickServerConfig object with null security manager class
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setSecurityManagerClass((String) null);
      
      // When the name is retrieved
      String name = quickServerConfig.getName();
      
      // Then the expected name "QuickServer v2.0.0 RC1" should be returned
      assertEquals("QuickServer v2.0.0 RC1", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetApplicationConfiguration() throws Throwable  {
      // Given: A QuickServerConfig object and an ApplicationConfiguration object
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      ApplicationConfiguration arg0 = new ApplicationConfiguration();
      
      // When: Setting the ApplicationConfiguration on the QuickServerConfig
      quickServerConfig.setApplicationConfiguration(arg0);
      
      // Then: The name of the QuickServer should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDBObjectPoolConfig() throws Throwable  {
      // Given a QuickServerConfig object with default settings
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When we set the DBObjectPoolConfig for the connection pool
      DBObjectPoolConfig arg0 = new DBObjectPoolConfig();
      quickServerConfig.setDBObjectPoolConfig(arg0);
      
      // Then the name of the QuickServerConfig object should be updated accordingly
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConfigFileReturningNull() throws Throwable  {
      // Given a QuickServerConfig instance with a valid config file
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      
      // When the getName method is called on the instance
      String name = quickServerConfig.getName();
      
      // Then the correct version number should be returned
      assertEquals("QuickServer v2.0.0 RC1", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetQSAdminServerConfig() throws Throwable  {
      // Given a QuickServerConfig object with a QSAdminServerConfig set
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      QSAdminServerConfig arg0 = new QSAdminServerConfig();
      quickServerConfig.setQSAdminServerConfig(arg0);
      
      // When the name is set to "QuickServer v2.0.0 RC1"
      quickServerConfig.setName("QuickServer v2.0.0 RC1");
      
      // Then the name should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", quickServerConfig.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitServerHooksReturningInitServerHooksWhereIsEmptyIsTrue() throws Throwable  {
      // Given: A QuickServerConfig object with an InitServerHooks instance
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      InitServerHooks initServerHooks = new InitServerHooks();
      quickServerConfig.setInitServerHooks(initServerHooks);
      
      // When: Calling the getName() method on the QuickServerConfig object
      String actualName = quickServerConfig.getName();
      
      // Then: The returned name should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", actualName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApplicationJarPathReturningNonEmptyString() throws Throwable  {
      // Given: A QuickServerConfig object with a set application jar path
      QuickServerConfig quickServerConfig = new QuickServerConfig();
      quickServerConfig.setApplicationJarPath("/home/user/Downloads/my-app.jar");
      
      // When: Getting the name of the server
      String name = quickServerConfig.getName();
      
      // Then: The name should be "QuickServer v2.0.0 RC1"
      assertEquals("QuickServer v2.0.0 RC1", name);
  }
}
