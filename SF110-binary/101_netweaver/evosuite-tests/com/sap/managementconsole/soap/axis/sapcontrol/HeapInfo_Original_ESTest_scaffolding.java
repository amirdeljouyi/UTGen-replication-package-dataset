/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 11 15:42:07 GMT 2024
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HeapInfo_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HeapInfo_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.axis.description.FieldDesc",
      "org.apache.axis.InternalException",
      "org.apache.axis.encoding.Deserializer",
      "org.apache.axis.types.Day",
      "org.apache.log4j.Level",
      "org.apache.axis.types.UnsignedInt",
      "org.apache.axis.encoding.ser.SimpleSerializer",
      "org.apache.axis.message.SOAPFault",
      "org.apache.axis.types.NMToken",
      "org.apache.axis.types.Entity",
      "org.apache.axis.description.TypeDesc",
      "org.apache.axis.types.Name",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.axis.i18n.ProjectResourceBundle",
      "org.apache.axis.encoding.Serializer",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.log4j.CategoryKey",
      "org.apache.axis.message.MessageElement",
      "org.apache.axis.encoding.ser.BeanDeserializer",
      "org.apache.axis.encoding.DeserializerImpl",
      "org.apache.axis.encoding.SerializationContext",
      "org.apache.axis.i18n.MessagesConstants",
      "org.apache.log4j.helpers.Loader",
      "org.apache.axis.types.URI$MalformedURIException",
      "org.apache.log4j.ProvisionNode",
      "org.apache.axis.encoding.ser.BeanDeserializerFactory",
      "org.apache.log4j.Hierarchy",
      "org.apache.axis.types.Month",
      "org.apache.axis.types.Duration",
      "org.apache.axis.types.IDRef",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.axis.encoding.SimpleValueSerializer",
      "org.apache.axis.utils.cache.MethodCache$MethodKey",
      "org.apache.axis.types.UnsignedLong",
      "org.apache.axis.types.Time",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.axis.types.Token",
      "com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo",
      "org.apache.axis.types.NCName",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.axis.types.NMTokens",
      "org.apache.axis.encoding.ser.BaseDeserializerFactory",
      "org.apache.axis.encoding.Target",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.axis.types.UnsignedShort",
      "org.apache.log4j.Logger",
      "org.apache.axis.wsdl.fromJava.Types",
      "org.apache.axis.encoding.DeserializerFactory",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.axis.utils.JavaUtils$HolderException",
      "org.apache.axis.types.IDRefs",
      "org.apache.axis.types.MonthDay",
      "org.apache.axis.types.NonNegativeInteger",
      "org.apache.axis.types.Entities",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.axis.message.EnvelopeHandler",
      "org.apache.axis.types.HexBinary",
      "org.apache.axis.types.YearMonth",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.axis.description.ElementDesc",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.axis.utils.BeanUtils$1",
      "org.apache.axis.encoding.DeserializationContext",
      "org.apache.axis.types.UnsignedByte",
      "org.apache.axis.types.NegativeInteger",
      "org.apache.axis.message.SOAPBodyElement",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.axis.AxisFault",
      "org.apache.axis.encoding.ser.EnumSerializer",
      "org.apache.axis.i18n.ProjectResourceBundle$Context",
      "org.apache.axis.encoding.ser.BeanSerializer",
      "org.apache.axis.utils.BeanPropertyDescriptor",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.types.Language",
      "org.apache.axis.encoding.Callback",
      "com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR",
      "org.apache.axis.types.URI",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.axis.utils.cache.MethodCache",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.axis.soap.SOAPConstants",
      "org.apache.axis.utils.JavaUtils",
      "org.apache.axis.types.Id",
      "org.apache.axis.utils.BeanUtils",
      "org.apache.log4j.Priority",
      "org.apache.axis.types.NonPositiveInteger",
      "org.apache.axis.i18n.MessageBundle",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.axis.utils.Messages",
      "org.apache.axis.types.NormalizedString",
      "org.apache.axis.encoding.ser.BaseFactory",
      "org.apache.axis.types.PositiveInteger",
      "org.apache.axis.types.Year"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HeapInfo_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.axis.description.TypeDesc",
      "org.apache.axis.description.FieldDesc",
      "org.apache.axis.description.ElementDesc",
      "com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo",
      "com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR",
      "org.apache.axis.encoding.ser.SimpleSerializer",
      "org.apache.axis.encoding.ser.EnumSerializer",
      "org.apache.axis.utils.cache.MethodCache",
      "org.apache.axis.utils.cache.MethodCache$MethodKey",
      "org.apache.axis.utils.JavaUtils",
      "org.apache.axis.types.Day",
      "org.apache.axis.types.Duration",
      "org.apache.axis.types.NormalizedString",
      "org.apache.axis.types.Token",
      "org.apache.axis.types.Name",
      "org.apache.axis.types.NCName",
      "org.apache.axis.types.Entities",
      "org.apache.axis.types.Entity",
      "org.apache.axis.i18n.ProjectResourceBundle",
      "org.apache.axis.i18n.ProjectResourceBundle$Context",
      "org.apache.axis.i18n.MessagesConstants",
      "org.apache.axis.i18n.MessageBundle",
      "org.apache.axis.utils.Messages",
      "org.apache.axis.types.HexBinary",
      "org.apache.axis.types.Id",
      "org.apache.axis.types.IDRef",
      "org.apache.axis.types.IDRefs",
      "org.apache.axis.types.Language",
      "org.apache.axis.types.Month",
      "org.apache.axis.types.MonthDay",
      "org.apache.axis.types.NonPositiveInteger",
      "org.apache.axis.types.NegativeInteger",
      "org.apache.axis.types.NMToken",
      "org.apache.axis.types.NMTokens",
      "org.apache.axis.types.NonNegativeInteger",
      "org.apache.axis.types.PositiveInteger",
      "org.apache.axis.types.Time",
      "org.apache.axis.types.UnsignedInt",
      "org.apache.axis.types.UnsignedShort",
      "org.apache.axis.types.UnsignedByte",
      "org.apache.axis.types.UnsignedLong",
      "org.apache.axis.types.URI",
      "org.apache.axis.types.Year",
      "org.apache.axis.types.YearMonth",
      "org.apache.axis.utils.BeanUtils",
      "org.apache.axis.utils.BeanUtils$1",
      "org.apache.axis.AxisFault",
      "org.apache.axis.utils.BeanPropertyDescriptor",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.axis.encoding.DeserializerImpl",
      "org.apache.axis.encoding.ser.BeanDeserializer",
      "org.apache.axis.encoding.ser.BaseFactory",
      "org.apache.axis.encoding.ser.BaseDeserializerFactory",
      "org.apache.axis.encoding.ser.BeanDeserializerFactory",
      "org.apache.axis.encoding.ser.BeanSerializer",
      "org.apache.axis.encoding.ser.SimpleDeserializer",
      "org.apache.axis.encoding.ser.EnumDeserializer"
    );
  }
}
