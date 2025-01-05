/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 10:56:24 GMT 2024
 */

package com.mentorgen.tools.profile.runtime;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Profile_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.mentorgen.tools.profile.runtime.Profile"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Profile_Original_ESTest_scaffolding.class.getClassLoader() ,
      "com.mentorgen.tools.profile.instrument.clfilter.ClassLoaderFilter",
      "com.mentorgen.tools.profile.output.FrameComparator",
      "com.mentorgen.tools.profile.runtime.Frame",
      "com.mentorgen.tools.profile.output.ProfileDump$1",
      "com.mentorgen.tools.profile.Controller$OutputType",
      "com.mentorgen.tools.profile.runtime.ThreadDictionary",
      "com.mentorgen.tools.profile.Controller",
      "net.sourceforge.jiprof.instrument.clfilter.GenericClassLoaderFilter",
      "com.mentorgen.tools.profile.output.ProfileTextDump",
      "com.mentorgen.tools.profile.runtime.ClassAllocation",
      "com.mentorgen.tools.profile.Controller$TimeResolution",
      "com.mentorgen.tools.profile.output.ProfileDump",
      "com.mentorgen.tools.profile.runtime.Profile",
      "com.mentorgen.tools.profile.output.HolderComparator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Profile_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.mentorgen.tools.profile.runtime.Profile",
      "com.mentorgen.tools.profile.Controller$OutputType",
      "com.mentorgen.tools.profile.Controller$TimeResolution",
      "net.sourceforge.jiprof.instrument.clfilter.GenericClassLoaderFilter",
      "com.mentorgen.tools.profile.runtime.ThreadDictionary",
      "com.mentorgen.tools.profile.Controller",
      "com.mentorgen.tools.profile.output.ProfileDump$1",
      "com.mentorgen.tools.profile.output.FrameDump",
      "com.mentorgen.tools.profile.output.ProfileTextDump",
      "com.mentorgen.tools.profile.output.ProfileXMLDump",
      "com.mentorgen.tools.profile.runtime.ClassAllocation",
      "com.mentorgen.tools.profile.instrument.clfilter.WebAppClassLoaderFilter",
      "com.mentorgen.tools.profile.runtime.Method",
      "com.mentorgen.tools.profile.runtime.Frame",
      "com.mentorgen.tools.profile.runtime.Metrics",
      "com.mentorgen.tools.profile.runtime.InteractionList",
      "com.mentorgen.tools.profile.output.ProfileDump",
      "com.mentorgen.tools.profile.output.Math",
      "com.mentorgen.tools.profile.output.FrameComparator",
      "com.mentorgen.tools.profile.output.Holder",
      "com.mentorgen.tools.profile.output.HolderComparator",
      "com.mentorgen.tools.profile.instrument.clfilter.JettyClassLoaderFilter",
      "com.mentorgen.tools.profile.instrument.clfilter.StandardClassLoaderFilter",
      "com.mentorgen.tools.profile.instrument.clfilter.ExtensionsClassLoaderFilter",
      "com.mentorgen.tools.profile.instrument.clfilter.CustomMultiClassLoaderFilter",
      "com.mentorgen.tools.profile.instrument.clfilter.TomcatInternalClassLoaderFilter",
      "com.mentorgen.tools.profile.output.ClassAllocComparator"
    );
  }
}
