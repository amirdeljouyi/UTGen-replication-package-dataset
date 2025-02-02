/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Mar 15 05:02:54 GMT 2024
 */

package Newzgrabber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Newzgrabber;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Newzgrabber_ESTest extends Newzgrabber_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateNewzgrabberTakingNoArgumentsThrowsHeadlessException() throws Throwable  {
      // rollbacked to evosuite
      Newzgrabber newzgrabber = null;
      try {
        newzgrabber = new Newzgrabber();
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
  public void testFindDirectoryWithEmptyString() throws Throwable  {
      // Test that findDirectory returns null when given an empty string as input
      String findDirectory = Newzgrabber.findDirectory("");
      assertNull(findDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain() throws Throwable  {
      // Given: A string array with five elements
      String[] arg0 = new String[5];
      
      // When: The debug flag is added to the array
      arg0[0] = "-debug";
      
      // Then: The length of the array should be 5, and the first element should be the debug flag
      Newzgrabber.main(arg0);
      assertEquals(5, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsSystemExitException() throws Throwable  {
      // rollbacked to evosuite
      String[] arg0 = new String[1];
      arg0[0] = "-batch";
      // Undeclared exception!
      try { 
        Newzgrabber.main(arg0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      // Given: No arguments are passed to the main method
      String[] args = new String[0];
      
      // When: The main method is called with no arguments
      Newzgrabber.main(args);
      
      // Then: Verify that the length of the array is 0
      assertEquals(0, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindDirectoryReturningNonEmptyString() throws Throwable  {
      // Test that Newzgrabber.findDirectory() correctly identifies the directory of a given JAR file
      String findDirectory = Newzgrabber.findDirectory("EvoSuite_pathingJar7785128905367304111.jar");
      assertEquals("/tmp", findDirectory); // Assert that the directory is "/tmp" as expected
      assertNotNull(findDirectory); // Assert that the returned value is not null
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindDirectory() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/tmp/EvoSuite_pathingJar7785128905367304111.jar");
      FileSystemHandling.createFolder(arg0);
      String findDirectory = Newzgrabber.findDirectory("3`qulht/it:r1!$&o");
      assertNull(findDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainAndSetupBasicSystem() throws Throwable  {
      // rollbacked to evosuite
      String[] arg0 = new String[6];
      arg0[0] = "~<FFqC?oj~xS^S=swO";
      arg0[1] = "~<FFqC?oj~xS^S=swO";
      arg0[2] = "~<FFqC?oj~xS^S=swO";
      arg0[3] = "-verbose";
      Newzgrabber.main(arg0);
      Newzgrabber.setupBasicSystem();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetupBasicSystem() throws Throwable  {
      // rollbacked to evosuite
      Newzgrabber.setupBasicSystem();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateNewzgrabberTakingStringThrowsHeadlessException() throws Throwable  {
      // Given: A newzgrabber object is created with the constructor that takes a string as an argument
      String username = "4P@$TSz";
      
      // When: The newzgrabber object is constructed with the given username
      try {
      Newzgrabber newzgrabber = new Newzgrabber(username);
      
      // Then: An exception should be thrown, specifically a HeadlessException
      fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      // Verify that the exception is an instance of HeadlessException
      verifyException("java.awt.GraphicsEnvironment", e);}
  }
}
