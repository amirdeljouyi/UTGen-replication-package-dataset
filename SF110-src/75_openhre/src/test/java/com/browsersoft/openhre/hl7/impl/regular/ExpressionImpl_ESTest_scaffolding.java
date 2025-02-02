/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 13 02:15:18 GMT 2024
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExpressionImpl_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExpressionImpl_ESTest_scaffolding.class.getClassLoader() ,
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.api.regular.Expression",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionPart",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExpressionImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupItemImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7FieldListImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7ParserImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerStateImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl",
      "com.browsersoft.openhre.hl7.impl.parser.XMLUtils",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixBuilderImpl",
      "com.browsersoft.openhre.hl7.impl.regular.NodeStack",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionNodeList",
      "com.browsersoft.openhre.hl7.api.regular.InvalidExpressionException",
      "com.browsersoft.openhre.hl7.impl.config.HL7FieldImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7VersionConfigurationMapImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ConnectionList",
      "com.browsersoft.openhre.hl7.impl.regular.Connection",
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
      "org.apache.axis.handlers.BasicHandler",
      "org.apache.axis.AxisEngine",
      "org.apache.axis.server.AxisServer",
      "org.apache.axis.AxisProperties",
      "org.apache.commons.discovery.resource.names.ResourceNameDiscoverImpl",
      "org.apache.commons.discovery.log.SimpleLog",
      "org.apache.commons.discovery.log.DiscoveryLogFactory",
      "org.apache.commons.discovery.tools.ClassUtils",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInAlternateManagedProperties",
      "org.apache.commons.discovery.resource.names.DiscoverMappedNames",
      "org.apache.axis.configuration.EngineConfigurationFactoryFinder",
      "org.apache.axis.configuration.EngineConfigurationFactoryFinder$1",
      "org.apache.commons.discovery.resource.names.NameDiscoverers",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInManagedProperties",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInFile",
      "org.apache.commons.discovery.resource.names.DiscoverServiceNames",
      "org.apache.commons.discovery.resource.ResourceDiscoverImpl",
      "org.apache.commons.discovery.resource.DiscoverResources",
      "org.apache.commons.discovery.resource.names.NameDiscoverers$1",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema"
    );
  }
}
