/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Mar 15 01:54:22 GMT 2024
 */

package Joshua.FoxHunt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import Joshua.FoxHunt.FoxHuntFrame;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FoxHuntFrame_Original_ESTest extends FoxHuntFrame_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateFoxHuntFrameThrowsHeadlessException() throws Throwable  {
      FoxHuntFrame foxHuntFrame = null;
      try {
        foxHuntFrame = new FoxHuntFrame();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
