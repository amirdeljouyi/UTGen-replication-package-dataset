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
public class BatchDriver_Original_ESTest extends BatchDriver_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBatchJob() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("_<E(");
      byte[] arg1 = new byte[4];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      BatchDriver batchDriver = new BatchDriver("_<E(", "_<E(");
      BatchJob batchJob = batchDriver.getBatchJob("_<E(");
      assertNull(batchJob);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGroups() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("Center");
      FileSystemHandling.appendStringToFile(arg0, "Center");
      BatchDriver batchDriver = new BatchDriver("Center", "Center");
      String[] groups = batchDriver.getGroups();
      assertEquals(0, groups.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubjectLines() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("Center");
      FileSystemHandling.appendStringToFile(arg0, "Center");
      BatchDriver batchDriver = new BatchDriver("Center", "Center");
      String[] subjectLines = batchDriver.getSubjectLines();
      assertNull(subjectLines);
  }
}
