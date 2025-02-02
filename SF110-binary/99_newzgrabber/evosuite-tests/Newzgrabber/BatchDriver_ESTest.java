/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Mar 15 03:33:57 GMT 2024
 */

package Newzgrabber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import Newzgrabber.BatchDriver;
import Newzgrabber.BatchJob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BatchDriver_ESTest extends BatchDriver_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBatchJob() throws Throwable  {
      // Arrange
      EvoSuiteFile file = new EvoSuiteFile("_<E(");
      byte[] data = new byte[] {1, 2, 3, 4};
      
      // Act
      FileSystemHandling.appendDataToFile(file, data);
      
      // Assert
      BatchDriver batchDriver = new BatchDriver("_<E(", "_<E(");
      BatchJob batchJob = batchDriver.getBatchJob("_<E(");
      assertNull(batchJob);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGroups() throws Throwable  {
      // Given: We have an instance of EvoSuiteFile with the name "Center" and a file system handling object that can append strings to files
      EvoSuiteFile arg0 = new EvoSuiteFile("Center");
      FileSystemHandling.appendStringToFile(arg0, "Center");
      
      // When: We create an instance of BatchDriver with the name "Center" and the path "Center"
      BatchDriver batchDriver = new BatchDriver("Center", "Center");
      
      // Then: We expect the array of groups to be empty since there are no files in the directory with the specified path
      String[] groups = batchDriver.getGroups();
      assertEquals(0, groups.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubjectLines() throws Throwable  {
      // Given: A file named "Center" exists and contains the string "Center"
      EvoSuiteFile center = new EvoSuiteFile("Center");
      FileSystemHandling.appendStringToFile(center, "Center");
      
      // When: The BatchDriver instance is created with the file name as an argument
      BatchDriver batchDriver = new BatchDriver("Center", "Center");
      
      // Then: The subject lines array should be null since the file does not contain any lines
      assertNull(batchDriver.getSubjectLines());
  }
}
