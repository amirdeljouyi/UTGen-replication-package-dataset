/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 06:47:41 GMT 2024
 */

package glengineer.blocks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import glengineer.blocks.HorizontalBlock;
import glengineer.blocks.Scheme;
import glengineer.blocks.VerticalBlock;
import glengineer.positions.CharPosition1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Block_ESTest extends Block_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      // rollbacked to evosuite
      VerticalBlock verticalBlock = null;
      try {
        verticalBlock = new VerticalBlock((Scheme) null, 2480, 2480, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // improper block definition: 2480,2480, 2,2.
         //
         verifyException("glengineer.blocks.Block", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      // No Comments were added
      HorizontalBlock horizontalBlock = null;
      try {
        horizontalBlock = new HorizontalBlock((Scheme) null, 1785, (-4912), (-4912), 1785);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // improper block definition: 1785,-4912, -4912,1785.
         //
         verifyException("glengineer.blocks.Block", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2() throws Throwable  {
      // Create a CharPosition1 object with invalid coordinates.
      CharPosition1 charPos1 = new CharPosition1(-2803, -2803);
      
      // Try to create a VerticalBlock object with the invalid coordinate.
      VerticalBlock verticalBlock = null;
      try {
      verticalBlock = new VerticalBlock(null, charPos1, charPos1);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Verify that the expected exception is thrown.
      verifyException("glengineer.blocks.Block", e);}
  }
}
