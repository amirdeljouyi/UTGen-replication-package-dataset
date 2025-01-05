/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 11 16:21:22 GMT 2024
 */

package dsachat.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Handler_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "dsachat.server.Handler"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Handler_Original_ESTest_scaffolding.class.getClassLoader() ,
      "dsachat.share.ConnectionEndpoint",
      "dsachat.server.Handler",
      "dsachat.share.InputListener",
      "dsachat.server.Entry",
      "dsachat.share.UserEvent",
      "dsachat.share.InputEvent",
      "dsachat.share.hero.Hero",
      "dsachat.server.net.SecServer",
      "dsachat.share.Challenge",
      "dsachat.share.ChallReq"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Handler_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "dsachat.server.Handler",
      "dsachat.server.Entry",
      "dsachat.share.InputEvent",
      "dsachat.client.net.SecClient",
      "dsachat.share.UserEvent",
      "dsachat.share.hero.Hero",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.DocumentFactory",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.io.OutputFormat",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.Namespace",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.dom.DOMElement",
      "org.dom4j.QName",
      "org.dom4j.tree.AbstractDocumentType",
      "org.dom4j.tree.DefaultDocumentType",
      "org.dom4j.dom.DOMDocumentType",
      "org.dom4j.dom.DOMDocument",
      "dsachat.server.net.SecServer",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.dom4j.dom.DOMProcessingInstruction",
      "dsachat.share.hero.Weapon",
      "org.dom4j.tree.BaseElement",
      "org.dom4j.tree.FilterIterator",
      "org.dom4j.tree.ElementIterator",
      "org.dom4j.util.NonLazyElement",
      "org.dom4j.tree.AbstractCharacterData",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.tree.FlyweightComment",
      "org.dom4j.tree.DefaultComment"
    );
  }
}
