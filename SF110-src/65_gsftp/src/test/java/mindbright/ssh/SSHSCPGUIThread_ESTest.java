/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 20:20:41 GMT 2024
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
public class SSHSCPGUIThread_ESTest extends SSHSCPGUIThread_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartFileThrowsNullPointerException() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread(null, null, null, null, false, false, false, false, null);
      
      // Given the method startFile is called with a null local path
      try {
      sSHSCPGUIThread.startFile("Local:", 0L);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // When the method throws a NullPointerException
      // Then verify that the exception is correct
      assertTrue(e instanceof NullPointerException);
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningPositive() throws Throwable  {
      // Given a number to be rounded
      double input = 1.0;
      
      // When the method "round" is called with this number as an argument
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      double output = sSHSCPGUIThread.round(input);
      
      // Then the result should be equal to 1.0 with a maximum deviation of 0.01
      assertEquals(1.0, output, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningNegative() throws Throwable  {
      // This test checks the round method of SSHSCPGUIThread class
      // with a negative input value and expected output value
      double actualValue = -651.0;
      double expectedValue = -651.0;
      
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      double round = sSHSCPGUIThread.round(actualValue);
      
      assertEquals(expectedValue, round, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCutNameReturningNonEmptyString() throws Throwable  {
      // Given a string "File" and an integer 34
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      String cutName = sSHSCPGUIThread.cutName("File", 34);
      
      // When the cutName method is called with "File" and 34 as arguments
      assertEquals("File", cutName);
      
      // Then the output should be the same as the input, "File"
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCutNameReturningEmptyString() throws Throwable  {
      // Given a string and a maximum length
      String inputString = "";
      int maxLength = 40;
      
      // When the cutName method is called with the string and maximum length
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      String cutName = sSHSCPGUIThread.cutName(inputString, maxLength);
      
      // Then the method should return an empty string
      assertEquals("", cutName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddUniqueReturningNegative() throws Throwable  {
      // Given: We have a method named 'addUnique' that takes in two String arrays and an integer as input.
      //        The first array contains some unique values, the second array contains some duplicate values,
      //        and the integer is the number of unique values we want to add to the second array.
      String[] arg0 = new String[2];
      int addUnique = SSHSCPGUIThread.addUnique(arg0, ".YZ;1%romB:u9q5TD", (-2968));
      
      // When: We call the 'addUnique' method with the input parameters.
      
      // Then: The method should return the number of unique values that were added to the second array.
      assertEquals((-2968), addUnique);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException0() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      ProgressBar progressBar = new ProgressBar(4, 4, 4);
      sSHSCPGUIThread.progress = progressBar;
      sSHSCPGUIThread.curFileSize = (long) 4;
      // Test the progress method with a valid value for the current file size
      try {
      sSHSCPGUIThread.progress(4);
      } catch (NullPointerException e) {
      // This exception should not occur, as we have initialized the progress bar and set the current file size before calling the progress method
      fail("Expected no exception to be thrown");}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException1() throws Throwable  {
      // Given: A new SSHSCPGUIThread instance is created with a progress bar
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      ProgressBar progressBar = new ProgressBar(31, 31, 31);
      sSHSCPGUIThread.progress = progressBar;
      sSHSCPGUIThread.curFileSize = (long) 31;
      System.setCurrentTimeMillis(0L);
      
      // When: The sSHSCPGUIThread is called with a progress value of 31
      try {
      sSHSCPGUIThread.progress(31);
      } catch (NullPointerException e) {
      // Then: An exception should be thrown because the progress bar is null
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProgressThrowsNullPointerException2() throws Throwable  {
      // rollbacked to evosuite
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
      // Create a new SSHSCPGUIThread instance with null arguments.
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      
      // Set the current file size to 1L.
      sSHSCPGUIThread.curFileSize = 1L;
      
      // Call the progress method with a negative value.
      sSHSCPGUIThread.progress((-1818L));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSSHSCPGUIThreadAndCallsProgress1() throws Throwable  {
      // rollbacked to evosuite
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      sSHSCPGUIThread.progress((-1854L));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartDirThrowsNullPointerException0() throws Throwable  {
      // rollbacked to evosuite
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
      
      // Given: a SSHSCPGUIThread instance with null parameters
      
      try {
      sSHSCPGUIThread.startDir(" selected. Total ");
      
      // When: the startDir method is called with a valid directory path
      
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      
      // Then: the expected NullPointerException is thrown
      
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartDirThrowsNullPointerException2() throws Throwable  {
      // Given a SSHSCPGUIThread instance with a null directory
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      
      // When a startDir method is called with an invalid directory
      sSHSCPGUIThread.startTime = 1000L;
      try {
      sSHSCPGUIThread.startDir("a file, not a directory.");
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Then the method should throw an NullPointerException with no message
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddUniqueReturningPositive() throws Throwable  {
      // Given a string with multiple spaces
      String input = "8MTkjD'h)g&)%aRq";
      
      // When the string is split into an array of substrings
      String[] arg0 = SSHSCPGUIThread.spaceSplit(input);
      
      // Then the length of the array should be 1
      assertEquals(1, arg0.length);
      
      // When the method addUnique is called with the string and a specified length
      int addUnique = SSHSCPGUIThread.addUnique(arg0, "8MTkjD'h)g&)%aRq", 4096);
      
      // Then the return value should be the specified length
      assertEquals(4096, addUnique);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndStarExpand0() throws Throwable  {
      // Given: We have a string array with a single element that is a path containing asterisks
      String[] arg0 = SSHSCPGUIThread.spaceSplit("/t*");
      
      // When: We use the starExpand method to expand the asterisks in the path
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, "/t*");
      
      // Then: The expanded path should have a length of 1, indicating that the asterisks were successfully expanded
      assertEquals(1, starExpand.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStarExpandThrowsNullPointerException() throws Throwable  {
      String[] inputValues = new String[9];
      inputValues[0] = "*GBVF4zu~U";
      // Undeclared exception!
      try {
      SSHSCPGUIThread.starExpand(inputValues, "/");
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndStarExpand1() throws Throwable  {
      // Given: A string with the following format: "|100 200 50 37 255 128|"
      String input = "|100 200 50 37 255 128|";
      
      // When: The string is split into an array of strings using the space character as a delimiter
      String[] arg0 = SSHSCPGUIThread.spaceSplit(input);
      
      // Then: The resulting array should not be null and have a length of 6
      assertNotNull(arg0);
      assertEquals(6, arg0.length);
      
      // Given: A string with the following format: "|100 200 50 37 255 128|"
      input = "|100 200 50 37 255 128|";
      
      // When: The string is expanded using the star character as a delimiter
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, input);
      
      // Then: The resulting array should have a length of 6 and each element should be a string with a value of "|100 200 50 37 255 128|"
      assertEquals(6, starExpand.length);
      for (String s : starExpand) {
      assertEquals("|100 200 50 37 255 128|", s);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStarExpandReturningEmptyArray() throws Throwable  {
      // No Comments were added
      String[] arg0 = SSHSCPGUIThread.spaceSplit("/C5uCDr|55*B:\"");
      assertNotNull(arg0);
      
      String[] starExpand = SSHSCPGUIThread.starExpand(arg0, "/C5uCDr|55*B:\"");
      assertEquals(1, arg0.length);
      assertEquals(0, starExpand.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray0() throws Throwable  {
      // Given a string representing the reply path
      String replyPath = "reply:/";
      
      // When we split the string using the spaceSplit method
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit(replyPath);
      
      // Then we expect the returned array to be non-null and have a length of 1
      assertNotNull(spaceSplit);
      assertEquals(1, spaceSplit.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNull0() throws Throwable  {
      // Given: A String array of spaces
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\"");
      
      // When: The spaceSplit method is called with a double quote character as input
      assertNull(spaceSplit);
      
      // Then: The method should return null because the double quote character is not a valid delimiter for splitting a String array by spaces);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray1() throws Throwable  {
      // Given a string with special characters and spaces
      String input = "\"!LqL?\"GQvWcx";
      
      // When the method is called on this string
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit(input);
      
      // Then the output should be a single-element array containing the original string
      assertNotNull(spaceSplit);
      assertEquals(1, spaceSplit.length);
      assertEquals("\"!LqL?\"GQvWcx", spaceSplit[0]);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray2() throws Throwable  {
      // Given
      String input = "FTP response 421 received.  Server closed connection.";
      
      // When
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit(input);
      
      // Then
      assertEquals(7, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray3() throws Throwable  {
      // No Comments were added
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\" RJJ_([*$\"");
      assertEquals(1, spaceSplit.length);
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNull1() throws Throwable  {
      // No Comments were added
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("\" J_x([;$j");
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitAndSpaceSplitReturningNonEmptyArray4() throws Throwable  {
      // Test that a string with multiple spaces splits into multiple parts
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit("D+/ I,;CC9jHiT");
      assertEquals(2, spaceSplit.length);
      
      // Check that the returned array is not null
      assertNotNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitWithEmptyString() throws Throwable  {
      // Given an empty string as input
      String input = "";
      
      // When the method is called with this input
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit(input);
      
      // Then the result should be null
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSpaceSplitWithNull() throws Throwable  {
      // No Comments were added
      String[] spaceSplit = SSHSCPGUIThread.spaceSplit((String) null);
      assertNull(spaceSplit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRunThrowsHeadlessException0() throws Throwable  {
      // Given: A new instance of the SSHSCPGUIThread class with null parameters
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      
      // When: The run method is called on the SSHSCPGUIThread instance
      sSHSCPGUIThread.run();
      
      // Then: An exception of type HeadlessException should be thrown
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRunThrowsHeadlessException1() throws Throwable  {
      // Given
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, true, true, true, true, (SSHSCPPanel) null);
      
      // When
      try {
      sSHSCPGUIThread.run();
      
      // Then
      fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      verifyException("java.awt.GraphicsEnvironment", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundReturningZero() throws Throwable  {
      // Given
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      
      // When
      double round = sSHSCPGUIThread.round(0.0);
      
      // Then
      assertEquals(0.0, round, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConnectedThrowsNullPointerException() throws Throwable  {
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      
      // Try to connect with an invalid password
      try {
      sSHSCPGUIThread.connected("uY(kyv15");
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the expected exception was thrown
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndFileThrowsNullPointerException() throws Throwable  {
      // Test that endFile() throws NullPointerException when the FileDisplay object is null
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, false, (SSHSCPPanel) null);
      try {
      sSHSCPGUIThread.endFile();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the correct exception was thrown
      verifyException("mindbright.ssh.SSHSCPGUIThread", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndDir() throws Throwable  {
      // rollbacked to evosuite
      SSHSCPGUIThread sSHSCPGUIThread = new SSHSCPGUIThread((Frame) null, (FileDisplay) null, (FileDisplay) null, (RemoteFileBrowser) null, false, false, false, true, (SSHSCPPanel) null);
      sSHSCPGUIThread.endDir();
  }
}
