/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 10:03:35 GMT 2024
 */

package org.templateit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.templateit.Reference;
import org.templateit.Region;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Region_Original_ESTest extends Region_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartReturningNull() throws Throwable  {
      Region region = new Region();
      Reference start = region.start();
      assertNull(start);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartReturningReferenceWhereColumnIsZero() throws Throwable  {
      Reference arg1 = new Reference(0, 0);
      Region region = new Region(arg1, arg1);
      Reference start = region.start();
      assertEquals(0, start.column());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartReturningReferenceWhereColumnIsPositive() throws Throwable  {
      Reference arg1 = new Reference(0, 1769);
      Region region = new Region(arg1, arg1);
      Reference start = region.start();
      assertEquals(0, start.row());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndReturningNull() throws Throwable  {
      Region region = new Region();
      Reference end = region.end();
      assertNull(end);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndReturningReferenceWhereColumnIsZeroAndReferenceWhereRowIsZero() throws Throwable  {
      Reference arg1 = new Reference(0, 0);
      Region region = new Region(arg1, arg1);
      Reference end = region.end();
      assertSame(arg1, end);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndReturningReferenceWhereColumnIsPositive() throws Throwable  {
      Reference arg1 = new Reference((-1), 2546);
      Region region = new Region(arg1, arg1);
      Reference end = region.end();
      assertEquals((-1), end.row());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetEndReferenceWithReferenceWhereRowIsPositive() throws Throwable  {
      Reference arg0 = new Reference(2893, (-1920));
      Reference arg1 = new Reference(0, (-1));
      Region region = new Region(arg1, arg1);
      region.setEndReference(arg0);
      boolean contains = region.contains(arg0);
      assertFalse(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsTakingReferenceWithReferenceWhereColumnIsPositive() throws Throwable  {
      Reference arg1 = new Reference(0, 0);
      Region region = new Region(arg1, arg1);
      Reference arg0 = new Reference(1023, 944);
      boolean contains = region.contains(arg0);
      assertFalse(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStartReference() throws Throwable  {
      Region region = new Region();
      Reference arg0 = new Reference((-1), (-1));
      region.setStartReference(arg0);
      region.setEndReference(arg0);
      boolean contains = region.contains(arg0);
      assertTrue(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsTakingReferenceReturningTrue() throws Throwable  {
      Reference arg0 = new Reference(2893, (-1920));
      Region region = new Region(arg0, arg0);
      boolean contains = region.contains(arg0);
      assertTrue(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsTakingReferenceWithReferenceWhereColumnIsZero() throws Throwable  {
      Reference arg1 = new Reference(0, (-2132));
      Region region = new Region(arg1, arg1);
      Reference arg0 = new Reference((-2132), 0);
      boolean contains = region.contains(arg0);
      assertFalse(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsTakingRegion() throws Throwable  {
      Reference arg1 = new Reference(0, 0);
      Region arg0 = new Region(arg1, arg1);
      boolean contains = arg0.contains(arg0);
      assertTrue(contains);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      Region region = new Region();
      String string = region.toString();
      assertEquals("null,null", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartReturningReferenceWhereColumnIsNegative() throws Throwable  {
      Reference arg1 = new Reference(2893, (-1920));
      Region region = new Region(arg1, arg1);
      Reference start = region.start();
      assertSame(start, arg1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEndReturningReferenceWhereColumnIsNegative() throws Throwable  {
      Reference arg1 = new Reference(2893, (-1920));
      Region region = new Region(arg1, arg1);
      Reference end = region.end();
      assertEquals(2893, end.row());
  }
}
