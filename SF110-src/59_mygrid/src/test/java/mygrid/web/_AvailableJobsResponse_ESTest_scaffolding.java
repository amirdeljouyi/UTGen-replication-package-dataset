/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 17:58:05 GMT 2024
 */

package mygrid.web;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class _AvailableJobsResponse_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "mygrid.web._AvailableJobsResponse"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(_AvailableJobsResponse_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.axis.encoding.ser.BaseDeserializerFactory",
      "org.apache.axis.encoding.Target",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.or.ObjectRenderer",
      "mygrid.web._AvailableJobsResponse",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "org.apache.axis.description.FieldDesc",
      "org.apache.axis.InternalException",
      "org.apache.log4j.Logger",
      "org.apache.axis.wsdl.fromJava.Types",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "org.apache.axis.encoding.DeserializerFactory",
      "org.apache.axis.encoding.Deserializer",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.axis.message.SOAPFault",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.axis.description.TypeDesc",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.axis.message.EnvelopeHandler",
      "org.apache.axis.encoding.Serializer",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.axis.message.MessageElement",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.axis.encoding.ser.BeanDeserializer",
      "org.apache.log4j.WriterAppender",
      "org.apache.axis.description.ElementDesc",
      "org.apache.log4j.Layout",
      "mygrid.web.ArrayOfJob",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.axis.utils.BeanUtils$1",
      "org.apache.axis.encoding.DeserializerImpl",
      "org.apache.axis.encoding.SerializationContext",
      "org.apache.axis.encoding.DeserializationContext",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.axis.message.SOAPBodyElement",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.axis.encoding.ser.BeanDeserializerFactory",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.axis.AxisFault",
      "org.apache.log4j.Appender",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.commons.logging.impl.Log4jFactory",
      "org.apache.commons.logging.impl.Log4JCategoryLog",
      "org.apache.axis.encoding.ser.BeanSerializer",
      "mygrid.web.Job",
      "org.apache.log4j.helpers.NullEnumeration",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.utils.BeanPropertyDescriptor",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.axis.encoding.Callback",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.axis.soap.SOAPConstants",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "org.apache.axis.utils.BeanUtils",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.log4j.Priority",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.axis.encoding.ser.BaseFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(_AvailableJobsResponse_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.axis.description.TypeDesc",
      "org.apache.axis.description.FieldDesc",
      "org.apache.axis.description.ElementDesc",
      "mygrid.web._AvailableJobsResponse",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.commons.logging.impl.Log4jFactory",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.commons.logging.impl.Log4JCategoryLog",
      "org.apache.log4j.Category",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
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
      "org.apache.log4j.helpers.NullEnumeration",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.axis.encoding.DeserializerImpl",
      "org.apache.axis.encoding.ser.BeanDeserializer",
      "org.apache.axis.encoding.ser.BaseFactory",
      "org.apache.axis.encoding.ser.BaseDeserializerFactory",
      "org.apache.axis.encoding.ser.BeanDeserializerFactory",
      "org.apache.axis.utils.BeanUtils",
      "org.apache.axis.utils.BeanUtils$1",
      "org.apache.axis.AxisFault",
      "org.apache.axis.utils.BeanPropertyDescriptor",
      "org.apache.axis.encoding.ser.BeanSerializer",
      "mygrid.web.ArrayOfJob",
      "mygrid.web.Job",
      "mygrid.web.Processor",
      "mygrid.web.ArrayOfContextElement",
      "mygrid.web.ContextElement",
      "mygrid.web.Discriminator",
      "mygrid.web.ArrayOfString",
      "mygrid.web.Dependency",
      "mygrid.web.ArrayOfDependency",
      "mygrid.web.GridJobStatus"
    );
  }
}
