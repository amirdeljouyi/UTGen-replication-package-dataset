/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 16:25:39 GMT 2024
 */

package dsachat.client.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import dsachat.client.gui.InternalChatFrame;
import dsachat.client.gui.MainFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InternalChatFrame_Original_ESTest extends InternalChatFrame_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateInternalChatFrameThrowsNullPointerException() throws Throwable  {
      InternalChatFrame internalChatFrame = null;
      try {
        internalChatFrame = new InternalChatFrame((MainFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dsachat.client.gui.InternalChatFrame", e);
      }
  }
}
