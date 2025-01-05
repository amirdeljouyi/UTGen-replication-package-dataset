/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 06:04:14 GMT 2024
 */

package de.beiri22.stringincrementor.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import de.beiri22.stringincrementor.helper.IndexedString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IndexedString_Original_ESTest extends IndexedString_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIndexOfReturningPositive() throws Throwable  {
      IndexedString indexedString = new IndexedString("HQTuTEek?YoHxODP,;");
      char[] arg0 = new char[1];
      arg0[0] = 'Q';
      int indexOf = indexedString.indexOf(arg0);
      assertEquals(1, indexOf);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIndexOfReturningNegative() throws Throwable  {
      IndexedString indexedString = new IndexedString("HQTuTEek?YoHxODP,;");
      char[] arg0 = new char[8];
      arg0[0] = 'H';
      arg0[1] = 'Q';
      int indexOf = indexedString.indexOf(arg0);
      assertEquals((-1), indexOf);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIndexOfReturningZero() throws Throwable  {
      IndexedString indexedString = new IndexedString("o%H");
      char[] arg0 = new char[1];
      arg0[0] = 'o';
      int indexOf = indexedString.indexOf(arg0);
      assertEquals(0, indexOf);
  }
}
