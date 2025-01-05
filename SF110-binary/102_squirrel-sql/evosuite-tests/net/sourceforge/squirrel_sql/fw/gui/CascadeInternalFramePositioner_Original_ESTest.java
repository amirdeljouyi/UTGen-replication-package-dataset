/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 16:13:55 GMT 2024
 */

package net.sourceforge.squirrel_sql.fw.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JInternalFrame;
import net.sourceforge.squirrel_sql.fw.gui.CascadeInternalFramePositioner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CascadeInternalFramePositioner_Original_ESTest extends CascadeInternalFramePositioner_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameThrowsIllegalArgumentException() throws Throwable  {
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      // Undeclared exception!
      try { 
        cascadeInternalFramePositioner.positionInternalFrame((JInternalFrame) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null JInternalFrame passed
         //
         verifyException("net.sourceforge.squirrel_sql.fw.gui.CascadeInternalFramePositioner", e);
      }
  }
}
