/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 07:42:51 GMT 2024
 */

package ghm.follow.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TabbedPane_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ghm.follow.gui.TabbedPane"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TabbedPane_Original_ESTest_scaffolding.class.getClassLoader() ,
      "ghm.follow.config.FollowAppAttributes",
      "ghm.follow.gui.FileFollowingPane",
      "ghm.follow.gui.About",
      "ghm.follow.gui.Exit",
      "ghm.follow.search.Find",
      "ghm.follow.gui.Delete",
      "ghm.follow.search.ClearHighlights",
      "ghm.follow.io.FilterableOutputDestination",
      "ghm.follow.search.WordResult",
      "ghm.follow.nav.Top",
      "ghm.follow.nav.PreviousTab",
      "ghm.follow.config.Configure",
      "ghm.follow.config.EnumeratedProperties",
      "ghm.follow.gui.ClearAll",
      "ghm.follow.search.LineResult",
      "ghm.follow.gui.Debug",
      "ghm.follow.io.JTextComponentDestination",
      "ghm.follow.gui.Clear",
      "ghm.follow.gui.Pause",
      "ghm.follow.FollowApp",
      "ghm.follow.gui.LineTextUI",
      "ghm.follow.io.OutputDestination",
      "ghm.follow.search.SearchableTextPane",
      "ghm.follow.gui.Reset",
      "ghm.follow.gui.LineTextUI$1",
      "ghm.follow.gui.StartupStatus",
      "ghm.follow.gui.Close",
      "ghm.follow.gui.Edit",
      "ghm.follow.gui.TabbedPane",
      "ghm.follow.systemInterface.SystemInterface",
      "ghm.follow.gui.Open",
      "ghm.follow.gui.ToolBar",
      "ghm.follow.FileFollower",
      "ghm.follow.gui.FollowAppAction",
      "ghm.follow.gui.DeleteAll",
      "ghm.follow.gui.LineView",
      "ghm.follow.nav.Bottom",
      "ghm.follow.nav.NextTab",
      "ghm.follow.search.ClearAllHighlights"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TabbedPane_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ghm.follow.gui.TabbedPane",
      "ghm.follow.FollowApp",
      "ghm.follow.config.FollowAppAttributes",
      "ghm.follow.config.EnumeratedProperties",
      "ghm.follow.gui.FileFollowingPane",
      "ghm.follow.search.SearchableTextPane",
      "ghm.follow.gui.LineTextUI",
      "ghm.follow.gui.LineTextUI$1",
      "ghm.follow.gui.LineView",
      "ghm.follow.io.FilterableOutputDestination",
      "ghm.follow.io.JTextComponentDestination",
      "ghm.follow.FileFollower"
    );
  }
}
