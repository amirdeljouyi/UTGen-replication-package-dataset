/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 12 05:11:35 GMT 2024
 */

package httpanalyzer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HttpAnalyzerView_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "httpanalyzer.HttpAnalyzerView"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HttpAnalyzerView_ESTest_scaffolding.class.getClassLoader() ,
      "httpanalyzer.CryptDesDialog",
      "org.apache.http.client.methods.HttpPost",
      "org.jdesktop.application.ApplicationActionMap",
      "httpanalyzer.HttpAnalyzerApp",
      "org.jdesktop.application.Task$BlockingScope",
      "org.jdesktop.application.ResourceConverter$ByteResourceConverter",
      "org.apache.http.HttpMessage",
      "httpanalyzer.IntelSaveDialog",
      "org.apache.http.HttpRequestInterceptor",
      "org.jdesktop.application.ResourceConverter$ResourceConverterException",
      "org.jdesktop.application.ResourceConverter$BooleanResourceConverter",
      "org.jdesktop.application.ResourceMap$FontStringConverter",
      "org.apache.http.conn.ClientConnectionManager",
      "org.jdesktop.application.TaskService$TaskPCL",
      "org.apache.http.client.AuthenticationHandler",
      "org.jdesktop.application.LocalStorage$LocalFileIO",
      "org.apache.http.HttpRequest",
      "httpanalyzer.Base64Transformer",
      "org.jdesktop.beansbinding.AutoBinding",
      "org.apache.http.HttpException",
      "org.jdesktop.application.Application",
      "org.jdesktop.application.LocalStorage",
      "org.jdesktop.application.ResourceMap",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.http.client.ClientProtocolException",
      "org.jdesktop.application.MnemonicText",
      "org.apache.http.client.methods.HttpHead",
      "org.jdesktop.swingworker.AccumulativeRunnable",
      "org.jdesktop.application.LocalStorage$LocalIO",
      "org.jdesktop.application.SingleFrameApplication",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.jdesktop.application.ResourceMap$DimensionStringConverter",
      "org.apache.http.cookie.CookieSpecRegistry",
      "org.jdesktop.application.LocalStorage$PersistenceServiceIO",
      "org.jdesktop.application.ResourceConverter$IntegerResourceConverter",
      "org.apache.http.client.methods.AbortableHttpRequest",
      "org.jdesktop.application.ResourceConverter$FloatResourceConverter",
      "org.apache.http.client.HttpClient",
      "org.apache.http.auth.Credentials",
      "org.apache.http.auth.AuthSchemeFactory",
      "org.jdesktop.application.ApplicationAction",
      "httpanalyzer.HttpAnalyzerView$1",
      "httpanalyzer.HttpAnalyzerView",
      "org.jdesktop.swingworker.SwingWorker$DoSubmitAccumulativeRunnable",
      "httpanalyzer.HttpAnalyzerView$4",
      "httpanalyzer.HttpAnalyzerView$5",
      "org.jdesktop.application.ResourceMap$RectangleStringConverter",
      "org.jdesktop.application.Task$InputBlocker",
      "org.apache.http.protocol.HttpProcessor",
      "org.jdesktop.application.ResourceConverter$DoubleResourceConverter",
      "org.apache.http.ProtocolVersion",
      "org.jdesktop.application.SessionStorage",
      "httpanalyzer.RequestParamsDialog",
      "org.apache.http.protocol.HttpContext",
      "org.apache.http.params.HttpParams",
      "org.jdesktop.application.View",
      "org.jdesktop.application.ResourceMap$ImageStringConverter",
      "org.apache.http.HttpResponse",
      "org.jdesktop.beansbinding.Binding",
      "org.jdesktop.application.Action",
      "org.jdesktop.beansbinding.Property",
      "org.apache.http.HttpHost",
      "org.apache.http.client.RedirectHandler",
      "org.apache.http.impl.client.DefaultHttpClient",
      "org.jdesktop.application.LocalStorage$LSException",
      "org.jdesktop.application.SessionStorage$TabbedPaneProperty",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "httpanalyzer.HttpAnalyzerView$RequestRunTask",
      "org.jdesktop.application.ResourceConverter$URLResourceConverter",
      "org.jdesktop.swingworker.SwingWorker",
      "org.jdesktop.application.SessionStorage$WindowProperty",
      "org.jdesktop.application.ResourceMap$KeyStrokeStringConverter",
      "org.jdesktop.application.SessionStorage$Property",
      "org.apache.http.cookie.CookieSpecFactory",
      "org.apache.http.conn.ConnectionKeepAliveStrategy",
      "org.jdesktop.beansbinding.BindingGroup",
      "org.jdesktop.application.ResourceConverter$MessageFormatResourceConverter",
      "org.jdesktop.beansbinding.ELProperty",
      "org.jdesktop.application.ResourceMap$LookupException",
      "org.jdesktop.application.AbstractBean$EDTPropertyChangeSupport",
      "org.apache.http.conn.routing.HttpRoutePlanner",
      "org.jdesktop.beansbinding.PropertyHelper",
      "org.jdesktop.application.Task",
      "org.jdesktop.application.ResourceMap$PointStringConverter",
      "org.jdesktop.beansbinding.BeanProperty",
      "org.jdesktop.application.ApplicationContext",
      "httpanalyzer.NotesDialog",
      "org.jdesktop.application.LocalStorage$RectanglePD",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.HttpEntity",
      "org.jdesktop.application.Application$NotifyingEvent",
      "org.apache.http.auth.AuthSchemeRegistry",
      "org.jdesktop.application.ResourceMap$InsetsStringConverter",
      "org.jdesktop.swingworker.SwingWorker$4",
      "org.apache.http.HttpResponseInterceptor",
      "org.jdesktop.application.SessionStorage$SplitPaneProperty",
      "org.apache.http.client.methods.HttpGet",
      "httpanalyzer.MD5Dialog",
      "org.apache.http.conn.scheme.SocketFactory",
      "org.jdesktop.application.DefaultInputBlocker",
      "org.jdesktop.application.ResourceConverter$ShortResourceConverter",
      "org.jdesktop.swingworker.SwingWorker$3",
      "org.jdesktop.swingworker.SwingWorker$2",
      "org.apache.http.HttpVersion",
      "org.jdesktop.swingworker.SwingPropertyChangeSupport",
      "org.apache.http.client.RequestDirector",
      "org.jdesktop.application.ResourceConverter",
      "org.jdesktop.application.ResourceMap$InjectFieldException",
      "org.jdesktop.application.FrameView",
      "org.jdesktop.application.AbstractBean",
      "org.apache.http.client.CookieStore",
      "org.jdesktop.application.ResourceManager",
      "org.jdesktop.application.ResourceMap$IconStringConverter",
      "org.apache.http.impl.client.AbstractHttpClient",
      "org.apache.http.message.AbstractHttpMessage",
      "org.jdesktop.application.Application$NoApplication",
      "org.jdesktop.application.ProxyActions",
      "org.jdesktop.application.ResourceConverter$NumberResourceConverter",
      "org.jdesktop.application.ResourceMap$EmptyBorderStringConverter",
      "org.jdesktop.application.SessionStorage$TableProperty",
      "org.jdesktop.beansbinding.BindingListener",
      "org.apache.http.client.HttpRequestRetryHandler",
      "org.jdesktop.application.ActionManager",
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.http.client.UserTokenHandler",
      "httpanalyzer.HttpAnalyzerAboutBox",
      "org.jdesktop.application.ResourceConverter$LongResourceConverter",
      "org.jdesktop.application.ResourceConverter$URIResourceConverter",
      "httpanalyzer.HttpAnalyzerView$ClearDataPanelTask",
      "org.apache.http.ConnectionReuseStrategy",
      "org.jdesktop.application.ResourceMap$PropertyInjectionException",
      "org.jdesktop.application.ResourceConverter$INumberResourceConverter",
      "org.jdesktop.application.ResourceMap$ColorStringConverter",
      "org.jdesktop.application.Application$ExitListener",
      "org.apache.http.client.ResponseHandler",
      "org.jdesktop.application.TaskService",
      "httpanalyzer.HttpAnalyzerView$ProxyAuth"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HttpAnalyzerView_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jdesktop.application.AbstractBean",
      "org.jdesktop.application.View",
      "org.jdesktop.application.FrameView",
      "httpanalyzer.HttpAnalyzerView",
      "httpanalyzer.HttpAnalyzerView$4",
      "httpanalyzer.HttpAnalyzerView$5",
      "httpanalyzer.HttpAnalyzerView$6",
      "httpanalyzer.HttpAnalyzerView$7",
      "httpanalyzer.HttpAnalyzerView$8",
      "httpanalyzer.HttpAnalyzerView$9",
      "httpanalyzer.HttpAnalyzerView$10",
      "httpanalyzer.HttpAnalyzerView$11",
      "httpanalyzer.HttpAnalyzerView$12",
      "httpanalyzer.HttpAnalyzerView$13",
      "httpanalyzer.HttpAnalyzerView$14",
      "httpanalyzer.HttpAnalyzerView$15",
      "httpanalyzer.HttpAnalyzerView$16",
      "httpanalyzer.HttpAnalyzerView$17",
      "httpanalyzer.HttpAnalyzerView$18",
      "httpanalyzer.HttpAnalyzerView$19",
      "httpanalyzer.HttpAnalyzerView$20",
      "httpanalyzer.HttpAnalyzerView$21",
      "httpanalyzer.HttpAnalyzerView$1",
      "httpanalyzer.HttpAnalyzerView$2",
      "httpanalyzer.HttpAnalyzerView$3",
      "httpanalyzer.HttpAnalyzerView$22",
      "httpanalyzer.HttpAnalyzerView$23",
      "httpanalyzer.HttpAnalyzerView$24",
      "httpanalyzer.HttpAnalyzerView$25",
      "httpanalyzer.HttpAnalyzerView$26",
      "httpanalyzer.HttpAnalyzerView$27",
      "httpanalyzer.HttpAnalyzerView$28",
      "httpanalyzer.HttpAnalyzerView$ProxyAuth",
      "httpanalyzer.HttpAnalyzerView$29",
      "org.jdesktop.swingworker.AccumulativeRunnable",
      "org.jdesktop.swingworker.SwingWorker$DoSubmitAccumulativeRunnable",
      "org.jdesktop.swingworker.SwingWorker",
      "org.jdesktop.application.Task",
      "httpanalyzer.HttpAnalyzerView$RequestRunTask",
      "httpanalyzer.HttpAnalyzerView$ClearDataPanelTask",
      "org.jdesktop.application.Task$BlockingScope",
      "org.jdesktop.application.Application",
      "org.jdesktop.beansbinding.AutoBinding$UpdateStrategy",
      "httpanalyzer.HeaderSettings",
      "httpanalyzer.IntelSaveDialog",
      "org.jdesktop.application.SingleFrameApplication",
      "httpanalyzer.HttpAnalyzerApp",
      "org.jdesktop.application.AbstractBean$EDTPropertyChangeSupport",
      "org.jdesktop.application.ApplicationContext",
      "org.jdesktop.application.ResourceManager",
      "org.jdesktop.application.ActionManager",
      "org.jdesktop.application.LocalStorage",
      "org.jdesktop.application.SessionStorage",
      "org.jdesktop.application.SessionStorage$WindowProperty",
      "org.jdesktop.application.SessionStorage$TabbedPaneProperty",
      "org.jdesktop.application.SessionStorage$SplitPaneProperty",
      "org.jdesktop.application.SessionStorage$TableProperty",
      "org.jdesktop.application.TaskService",
      "org.jdesktop.application.TaskService$TaskPCL",
      "org.jdesktop.application.ResourceConverter$BooleanResourceConverter",
      "org.jdesktop.application.ResourceConverter$INumberResourceConverter",
      "org.jdesktop.application.ResourceConverter$IntegerResourceConverter",
      "org.jdesktop.application.ResourceConverter$MessageFormatResourceConverter",
      "org.jdesktop.application.ResourceConverter$NumberResourceConverter",
      "org.jdesktop.application.ResourceConverter$FloatResourceConverter",
      "org.jdesktop.application.ResourceConverter$DoubleResourceConverter",
      "org.jdesktop.application.ResourceConverter$LongResourceConverter",
      "org.jdesktop.application.ResourceConverter$ShortResourceConverter",
      "org.jdesktop.application.ResourceConverter$ByteResourceConverter",
      "org.jdesktop.application.ResourceConverter$URLResourceConverter",
      "org.jdesktop.application.ResourceConverter$URIResourceConverter",
      "org.jdesktop.application.ResourceConverter",
      "org.jdesktop.application.ResourceMap$ColorStringConverter",
      "org.jdesktop.application.ResourceMap$IconStringConverter",
      "org.jdesktop.application.ResourceMap$ImageStringConverter",
      "org.jdesktop.application.ResourceMap$FontStringConverter",
      "org.jdesktop.application.ResourceMap$KeyStrokeStringConverter",
      "org.jdesktop.application.ResourceMap$DimensionStringConverter",
      "org.jdesktop.application.ResourceMap$PointStringConverter",
      "org.jdesktop.application.ResourceMap$RectangleStringConverter",
      "org.jdesktop.application.ResourceMap$InsetsStringConverter",
      "org.jdesktop.application.ResourceMap$EmptyBorderStringConverter",
      "org.jdesktop.application.ResourceMap",
      "org.jdesktop.beansbinding.BindingGroup",
      "org.jdesktop.application.ApplicationActionMap",
      "org.jdesktop.application.ApplicationAction",
      "org.jdesktop.application.MnemonicText",
      "org.jdesktop.application.Application$NoApplication",
      "org.jdesktop.application.Application$1",
      "org.apache.http.params.AbstractHttpParams",
      "org.apache.http.params.DefaultedHttpParams",
      "org.apache.http.impl.client.DefaultUserTokenHandler",
      "org.apache.http.protocol.BasicHttpContext",
      "org.apache.http.protocol.DefaultedHttpContext",
      "org.apache.http.protocol.SyncBasicHttpContext",
      "org.jdesktop.application.AbstractBean$EDTPropertyChangeSupport$1"
    );
  }
}
