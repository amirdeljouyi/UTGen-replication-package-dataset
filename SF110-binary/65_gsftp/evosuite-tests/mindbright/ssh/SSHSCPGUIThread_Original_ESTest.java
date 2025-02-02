/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 20:20:42 GMT 2024
 */

package mindbright.ssh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gotoservers.ftp.RemoteFileBrowser;
import com.isnetworks.ssh.FileDisplay;
import java.awt.Frame;
import java.awt.HeadlessException;
import mindbright.gui.ProgressBar;
import mindbright.ssh.SSHSCPGUIThread;
import mindbright.ssh.SSHSCPPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SSHSCPGUIThread_Original_ESTest extends SSHSCPGUIThread_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartFileThrowsNullPointerException() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.startFile("Local:", 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningPositive() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      double round = sSHSCPGUIThread.round(1.0);
      assertEquals(1.0, round, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningNegative() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      double round = sSHSCPGUIThread.round((-651));
      assertEquals((-651.0), round, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCutNameReturningNonEmptyString() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      String cutName = sSHSCPGUIThread.cutName("File", 34);
      assertEquals("File", cutName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCutNameReturningEmptyString() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      String cutName = sSHSCPGUIThread.cutName("", 40);
      assertEquals("", cutName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddUniqueReturningPositive() throws Throwable  {
      String[] arg0 = SSHSCPGUIThread.spaceSplit("8MTkjD'h)g&)%aRq");
      assertEquals(1, arg0.length);
      
      int addUnique = SSHSCPGUIThread.addUnique(arg0, "8MTkjD'h)g&)%aRq", 4096);
      assertEquals(4096, addUnique);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddUniqueReturningNegative() throws Throwable  {
      String[] arg0 = new String[2];
      int addUnique = SSHSCPGUIThread.addUnique(arg0, ".YZ;1%romB:u9q5TD", (-2968));
      assertEquals((-2968), addUnique);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException0() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      ProgressBar progressBar = new ProgressBar(4, 4, 4);
      sSHSCPGUIThread.progress = progressBar;
      sSHSCPGUIThread.curFileSize = (long) 4;
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.progress(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException1() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      ProgressBar progressBar = new ProgressBar(31, 31, 31);
      sSHSCPGUIThread.progress = progressBar;
      sSHSCPGUIThread.curFileSize = (long) 31;
      System.setCurrentTimeMillis(0L);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.progress(31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException2() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      sSHSCPGUIThread.curFileSize = 1L;
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.progress(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSSHSCPGUIThreadAndCallsProgress0() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      sSHSCPGUIThread.curFileSize = 1L;
      sSHSCPGUIThread.progress((-1818L));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSSHSCPGUIThreadAndCallsProgress1() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      sSHSCPGUIThread.progress((-1854L));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartDirThrowsNullPointerException0() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, false, true, true, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.startDir("B");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartDirThrowsNullPointerException1() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.startDir(" selected. Total ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartDirThrowsNullPointerException2() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      sSHSCPGUIThread.startTime = 1000L;
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.startDir(" a file, not a directory.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndStarExpand0() throws Throwable  {
      String[] arg0 = SSHSCPGUIThread.spaceSplit("/t*");
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, "/t*");
      assertEquals(1, starExpand.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStarExpandThrowsNullPointerException() throws Throwable  {
      String[] arg0 = new String[9];
      arg0[0] = "*GBVF4zu~U";
      // Undeclared exception!
      try { 
        SSHSCPGUIThread.starExpand(arg0, "/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndStarExpand1() throws Throwable  {
      String[] arg0 = SSHSCPGUIThread.spaceSplit(" a file, not a directory.");
      assertNotNull(arg0);
      
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, " a file, not a directory.");
      assertEquals(4, starExpand.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStarExpandReturningEmptyArray() throws Throwable  {
      String[] arg0 = SSHSCPGUIThread.spaceSplit("/C5uCDr|55*B:\"");
      assertNotNull(arg0);
      
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, "/C5uCDr|55*B:\"");
      assertEquals(0, starExpand.length);
      assertEquals(1, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray0() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("reply:/");
      assertEquals(1, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNull0() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\"");
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray1() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\"!LqL?\"GQvWcx");
      assertEquals(1, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray2() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("FTP response 421 received.  Server closed connection.");
      assertEquals(7, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray3() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\" RJJ_([*$\"");
      assertNotNull(spaceSplit);
      assertEquals(1, spaceSplit.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNull1() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\" J_x([;$j");
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray4() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("D+/ I,;CC9jHiT");
      assertEquals(2, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitWithEmptyString() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("");
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitWithNull() throws Throwable  {
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit((String) null);
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRunThrowsHeadlessException0() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.run();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRunThrowsHeadlessException1() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.run();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningZero() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      double round = sSHSCPGUIThread.round(0.0);
      assertEquals(0.0, round, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConnectedThrowsNullPointerException() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.connected("uY(kyv15");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndFileThrowsNullPointerException() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      // Undeclared exception!
      try { 
        sSHSCPGUIThread.endFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("mindbright.ssh.SSHSCPGUIThread", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndDir() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      sSHSCPGUIThread.endDir();
  }
}
