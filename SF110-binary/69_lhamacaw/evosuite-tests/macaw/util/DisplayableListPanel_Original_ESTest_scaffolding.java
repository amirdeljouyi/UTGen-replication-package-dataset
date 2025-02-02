/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 23:18:40 GMT 2024
 */

package macaw.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DisplayableListPanel_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "macaw.util.DisplayableListPanel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DisplayableListPanel_Original_ESTest_scaffolding.class.getClassLoader() ,
      "macaw.util.Displayable",
      "macaw.util.DisplayableList",
      "macaw.businessLayer.User",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.MacawError",
      "macaw.system.StartupOptions",
      "macaw.util.DisplayableListItemAdder",
      "macaw.util.DisplayableListItemSelector",
      "macaw.util.DisplayableListPanel",
      "macaw.util.DisplayableListParentForm",
      "macaw.system.MacawMessages",
      "macaw.util.DisplayableListItemEditor",
      "macaw.system.MacawException",
      "macaw.system.Log",
      "macaw.system.SessionProperties",
      "macaw.util.DisplayableListItemViewer",
      "macaw.util.DisplayableListItemDeleter",
      "macaw.system.MacawErrorType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DisplayableListPanel_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "macaw.util.DisplayableListPanel",
      "macaw.system.MacawMessages",
      "macaw.system.MacawErrorType",
      "macaw.system.SessionProperties",
      "macaw.system.Log",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.StartupOptions",
      "macaw.presentationLayer.VariableEditor",
      "macaw.presentationLayer.RawVariableEditor",
      "macaw.presentationLayer.VariableConstantsEditor",
      "macaw.presentationLayer.DerivedVariableEditor",
      "macaw.businessLayer.User",
      "macaw.businessLayer.Variable",
      "macaw.businessLayer.RawVariable",
      "macaw.presentationLayer.AliasFilePathEditor",
      "macaw.presentationLayer.MacawStateEditor",
      "macaw.presentationLayer.CategoryStateEditor",
      "macaw.presentationLayer.SupportingDocumentSelectionDialog",
      "macaw.util.DisplayableList",
      "macaw.presentationLayer.SupportingDocumentEditor",
      "macaw.util.ValidationUtility",
      "macaw.system.MacawException",
      "macaw.system.MacawError",
      "macaw.presentationLayer.OntologyTermEditor",
      "macaw.presentationLayer.AvailabilityStateEditor",
      "macaw.presentationLayer.CleaningStateEditor",
      "macaw.system.MacawChangeEvent",
      "macaw.system.ChangeEventType",
      "macaw.presentationLayer.OntologyTermSelectionDialog",
      "macaw.presentationLayer.SourceVariablesPanel",
      "macaw.presentationLayer.SourceVariableSelectionDialog",
      "macaw.businessLayer.AliasFilePath",
      "macaw.businessLayer.DerivedVariable",
      "macaw.businessLayer.ValueLabel",
      "macaw.businessLayer.ValueLabel$EditingOperationType",
      "macaw.businessLayer.MacawListChoice",
      "macaw.businessLayer.CleaningState",
      "macaw.businessLayer.SupportingDocument",
      "macaw.businessLayer.AvailabilityState",
      "macaw.businessLayer.OntologyTerm",
      "macaw.businessLayer.Category",
      "macaw.businessLayer.VariableSummary"
    );
  }
}
