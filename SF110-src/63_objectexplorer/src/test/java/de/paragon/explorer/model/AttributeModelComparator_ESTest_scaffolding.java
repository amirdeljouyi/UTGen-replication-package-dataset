/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 19:07:09 GMT 2024
 */

package de.paragon.explorer.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AttributeModelComparator_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "de.paragon.explorer.model.AttributeModelComparator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AttributeModelComparator_ESTest_scaffolding.class.getClassLoader() ,
      "de.paragon.explorer.model.ConnectionModel",
      "de.paragon.explorer.model.AttributeModelComparator",
      "de.paragon.explorer.figure.FigureChangeListener",
      "de.paragon.explorer.util.AttributeTitleManager",
      "de.paragon.explorer.figure.Figure",
      "de.paragon.explorer.model.ObjectModel",
      "de.paragon.explorer.model.Model",
      "de.paragon.explorer.model.ArrayAttributeModel",
      "de.paragon.explorer.model.ObjectModelPart",
      "de.paragon.explorer.model.AttributeModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AttributeModelComparator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "de.paragon.explorer.model.AttributeModelComparator",
      "de.paragon.explorer.model.Model",
      "de.paragon.explorer.model.ObjectModelPart",
      "de.paragon.explorer.model.AttributeModel",
      "de.paragon.explorer.util.LoggerFactory",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
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
      "de.paragon.explorer.model.StandardAttributeModel",
      "de.paragon.explorer.model.ConnectionModel",
      "de.paragon.explorer.model.ObjectModel",
      "de.paragon.explorer.model.ObjectHeaderModel",
      "de.paragon.explorer.figure.AbstractFigure",
      "de.paragon.explorer.figure.StandardConnectionFigure",
      "de.paragon.explorer.figure.FigureChangeManager",
      "de.paragon.explorer.gui.NullDisplayBox",
      "de.paragon.explorer.figure.FigureChangeEvent",
      "de.paragon.explorer.util.AttributeTitleManager",
      "de.paragon.explorer.model.ExplorerModel",
      "de.paragon.explorer.util.StandardEnumerator",
      "de.paragon.explorer.excp.FigureException",
      "de.paragon.explorer.util.ResourceBundleManager",
      "de.paragon.explorer.util.ResourceBundlePurchaser",
      "de.paragon.explorer.figure.RectangleFigure",
      "de.paragon.explorer.figure.ColorRectangleFigure",
      "de.paragon.explorer.gui.StandardRectangularDisplayBox",
      "de.paragon.explorer.model.ArrayAttributeModel",
      "de.paragon.explorer.excp.FigureEventException",
      "de.paragon.explorer.figure.CompositeFigure",
      "de.paragon.explorer.figure.StandardCompositeFigure",
      "de.paragon.explorer.figure.ExplorerFigure",
      "de.paragon.explorer.figure.FigureStore",
      "de.paragon.explorer.gui.DisplayBoxComposer",
      "de.paragon.explorer.gui.ExplorerFrame",
      "de.paragon.explorer.util.ObjectViewManager",
      "de.paragon.explorer.util.PropertyManager",
      "de.paragon.explorer.model.NullObject",
      "de.paragon.explorer.figure.ListBoxFigure",
      "de.paragon.explorer.figure.ExplorerFieldListBoxFigure",
      "de.paragon.explorer.figure.FilledRectangleFigure",
      "de.paragon.explorer.excp.NoSuchFigureException",
      "de.paragon.explorer.figure.TextBoxFigure"
    );
  }
}
