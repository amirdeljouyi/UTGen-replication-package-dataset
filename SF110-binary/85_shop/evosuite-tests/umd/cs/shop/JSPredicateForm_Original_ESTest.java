/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 14 01:15:26 GMT 2024
 */

package umd.cs.shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSPredicateForm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JSPredicateForm_Original_ESTest extends JSPredicateForm_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStr() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm();
      StringBuffer str = jSPredicateForm.toStr();
      assertEquals("", str.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrint() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm();
      jSPredicateForm.print();
      assertEquals("[]", jSPredicateForm.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSPredicateFormTakingString() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm("(u)T`");
      assertEquals(1, jSPredicateForm.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStringThrowsError0() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm("(F jJy|_jT5. CD@>");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStringThrowsError1() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStringThrowsError2() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm("(!+p");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStreamTokenizerThrowsError() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
