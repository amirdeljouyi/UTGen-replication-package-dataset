/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 13 04:13:26 GMT 2024
 */

package org.fixsuite.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Library_Original_ESTest extends Library_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLoadFromDirectoryWithNonEmptyString() throws Throwable  {
      Library library = new Library();
      boolean loadFromDirectory = library.loadFromDirectory("5.uI>P9DSQsTC85`*");
      assertFalse(loadFromDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLoadFromDirectoryWithEmptyString() throws Throwable  {
      Library library = new Library();
      boolean loadFromDirectory = library.loadFromDirectory("");
      assertFalse(loadFromDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDictionary() throws Throwable  {
      Library library = new Library();
      DictionaryInfo dictionary = library.getDictionary("]l\"~J `cDx*");
      assertNull(dictionary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDictionaries() throws Throwable  {
      Library library = new Library();
      List<DictionaryInfo> dictionaries = library.getDictionaries();
      assertTrue(dictionaries.isEmpty());
  }
}
