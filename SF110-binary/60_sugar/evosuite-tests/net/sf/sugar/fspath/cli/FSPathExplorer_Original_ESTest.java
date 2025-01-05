/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 18:47:36 GMT 2024
 */

package net.sf.sugar.fspath.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.sugar.fspath.cli.FSPathExplorer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FSPathExplorer_Original_ESTest extends FSPathExplorer_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartThrowsNullPointerException() throws Throwable  {
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      // Undeclared exception!
      try { 
        fSPathExplorer.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateFSPath() throws Throwable  {
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      fSPathExplorer.createFSPath();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsTooManyResourcesException() throws Throwable  {
      SystemInUtil.addInputLine("-f");
      String[] arg0 = new String[6];
      arg0[0] = "-f";
      arg0[1] = "-f";
      arg0[2] = "-f";
      arg0[3] = "-f";
      arg0[4] = "-f";
      arg0[5] = "8#OxL4w:ml";
      // Undeclared exception!
      FSPathExplorer.main(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain() throws Throwable  {
      String[] arg0 = new String[0];
      SystemInUtil.addInputLine("exit");
      FSPathExplorer.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsInstantiationError() throws Throwable  {
      String[] arg0 = new String[8];
      arg0[0] = "OsdXR.E@1+g</&tgTx";
      arg0[1] = "-path";
      arg0[2] = "Ap\"";
      arg0[3] = "Ap\"";
      arg0[4] = "OsdXR.E@1+g</&tgTx";
      arg0[5] = "GUX%%4Jjh";
      arg0[6] = "|i<7l=Z";
      arg0[7] = "Ap\"";
      // Undeclared exception!
      try { 
        FSPathExplorer.main(arg0);
        fail("Expecting exception: InstantiationError");
      
      } catch(InstantiationError e) {
         //
         // the java.io.File specified must be a Directory
         //
         verifyException("net.sf.sugar.fspath.DefaultFSPath", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConfigureExplorerThrowsNullPointerException() throws Throwable  {
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      String[] arg0 = new String[7];
      arg0[0] = "\n\nAttributes : (see javadoc for java.io.File for more info)";
      arg0[1] = "\t: ";
      arg0[2] = "p";
      arg0[3] = "-find";
      // Undeclared exception!
      try { 
        fSPathExplorer.configureExplorer(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException() throws Throwable  {
      String[] arg0 = new String[2];
      arg0[0] = "-p";
      // Undeclared exception!
      try { 
        FSPathExplorer.main(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowHelp() throws Throwable  {
      FSPathExplorer.showHelp();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowWelcome() throws Throwable  {
      FSPathExplorer.showWelcome();
  }
}
