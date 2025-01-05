/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 00:29:15 GMT 2024
 */

package com.yahoo.platform.yui.compressor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class YUICompressor_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.yahoo.platform.yui.compressor.YUICompressor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(YUICompressor_ESTest_scaffolding.class.getClassLoader() ,
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.Node$Scope",
      "jargs.gnu.CmdLineParser$Option$DoubleOption",
      "org.mozilla.javascript.Kit",
      "com.yahoo.platform.yui.compressor.JavaScriptIdentifier",
      "jargs.gnu.CmdLineParser$UnknownSuboptionException",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.RhinoException",
      "jargs.gnu.CmdLineParser$Option$BooleanOption",
      "org.mozilla.javascript.DefaultErrorReporter",
      "jargs.gnu.CmdLineParser$OptionException",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.debug.DebuggableScript",
      "org.mozilla.javascript.ScriptOrFnNode",
      "org.mozilla.javascript.ContextFactory$Listener",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.GeneratedClassLoader",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.Script",
      "jargs.gnu.CmdLineParser",
      "org.mozilla.javascript.ScriptRuntime$MessageProvider",
      "org.mozilla.javascript.jdk13.VMBridge_jdk13",
      "org.mozilla.javascript.Scriptable",
      "com.yahoo.platform.yui.compressor.JavaScriptCompressor",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.ObjArray",
      "jargs.gnu.CmdLineParser$NotFlagException",
      "org.mozilla.javascript.ScriptRuntime",
      "com.yahoo.platform.yui.compressor.ScriptOrFnScope",
      "org.mozilla.javascript.InterpretedFunction",
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.Callable",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.Decompiler",
      "jargs.gnu.CmdLineParser$Option$StringOption",
      "org.mozilla.javascript.IdFunctionCall",
      "org.mozilla.javascript.WrappedException",
      "com.yahoo.platform.yui.compressor.YUICompressor",
      "org.mozilla.javascript.NativeContinuation",
      "jargs.gnu.CmdLineParser$Option",
      "org.mozilla.javascript.Node$StringNode",
      "org.mozilla.javascript.Function",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.NativeCall",
      "jargs.gnu.CmdLineParser$Option$LongOption",
      "jargs.gnu.CmdLineParser$UnknownOptionException",
      "jargs.gnu.CmdLineParser$Option$IntegerOption",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.ConstProperties",
      "org.mozilla.javascript.JavaScriptException",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "jargs.gnu.CmdLineParser$IllegalOptionValueException",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.ErrorReporter",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.DToA",
      "org.mozilla.javascript.debug.DebuggableObject",
      "org.mozilla.javascript.CompilerEnvirons",
      "com.yahoo.platform.yui.compressor.JavaScriptToken",
      "com.yahoo.platform.yui.compressor.YUICompressor$1",
      "org.mozilla.javascript.FunctionNode",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.ContextAction",
      "org.mozilla.javascript.Node$Jump",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.Node$NumberNode",
      "org.mozilla.javascript.Evaluator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(YUICompressor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.yahoo.platform.yui.compressor.YUICompressor",
      "com.yahoo.platform.yui.compressor.YUICompressor$1",
      "jargs.gnu.CmdLineParser",
      "jargs.gnu.CmdLineParser$Option",
      "jargs.gnu.CmdLineParser$Option$StringOption",
      "jargs.gnu.CmdLineParser$Option$BooleanOption",
      "jargs.gnu.CmdLineParser$OptionException",
      "jargs.gnu.CmdLineParser$UnknownOptionException",
      "jargs.gnu.CmdLineParser$UnknownSuboptionException",
      "jargs.gnu.CmdLineParser$NotFlagException",
      "com.yahoo.platform.yui.compressor.JavaScriptCompressor",
      "com.yahoo.platform.yui.compressor.ScriptOrFnScope",
      "org.mozilla.javascript.CompilerEnvirons",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.Decompiler",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.Node$Jump",
      "org.mozilla.javascript.Node$Scope",
      "org.mozilla.javascript.ScriptOrFnNode",
      "org.mozilla.javascript.Node$StringNode",
      "org.mozilla.javascript.Node$NumberNode",
      "com.yahoo.platform.yui.compressor.JavaScriptToken",
      "org.mozilla.javascript.DToA",
      "com.yahoo.platform.yui.compressor.JavaScriptIdentifier",
      "org.mozilla.javascript.jdk13.VMBridge_jdk13",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.Node$PropListItem"
    );
  }
}
