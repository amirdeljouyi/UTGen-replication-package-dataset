/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 14 23:05:17 GMT 2024
 */


import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Client_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "Client"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Client_Original_ESTest_scaffolding.class.getClassLoader() ,
      "Client$ScorePoint",
      "Client$fieldClicker",
      "Client$ServerThread",
      "Client$Message",
      "Client$1",
      "Client$ambienceTimer",
      "Client$drawCircle",
      "Client$connectListener",
      "Sound",
      "Client$introListener",
      "Client$JField",
      "Client$doListListener",
      "Client$OptionList",
      "Client$JMiniMap",
      "Client$Chain",
      "Client$windowCloseListener",
      "Client",
      "Client$miniClickListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Client_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "Client",
      "Client$ServerThread",
      "Client$JField",
      "Client$JMiniMap",
      "Client$ambienceTimer",
      "Client$connectListener",
      "Client$introListener",
      "Client$windowCloseListener",
      "Client$fieldClicker",
      "Client$miniClickListener",
      "Client$OptionList",
      "Client$doListListener",
      "Client$ScorePoint",
      "Client$Chain",
      "Client$Message",
      "Client$drawCircle"
    );
  }
}
