/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 20:59:22 GMT 2024
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMoreLexicalActions() throws Throwable  {
      // No Comments were added
      JavaParserTokenManager javaParserTokenManager = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager.MoreLexicalActions();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSwitchTo() throws Throwable  {
      // rollbacked to evosuite
      JavaParserTokenManager javaParserTokenManager = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager.SwitchTo(0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJavaParserTokenManagerTaking2ArgumentsThrowsError() throws Throwable  {
      // Arrange
      JavaParserTokenManager javaParserTokenManager = null;
      
      // Act and Assert
      try {
      javaParserTokenManager = new JavaParserTokenManager((JavaCharStream) null, 17);
      fail("Expecting exception: Error");
      } catch(Error e) {
      // Verify that the expected error is thrown
      verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      
      // Verify that the error message is as expected
      assertEquals("Ignoring invalid lexical state : 17. State unchanged.", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInit() throws Throwable  {
      // rollbacked to evosuite
      JavaParserTokenManager javaParserTokenManager = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager.ReInit((JavaCharStream) null);
  }
}
