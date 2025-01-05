/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 02:47:56 GMT 2024
 */

package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saxpath.Axis;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString0() throws Throwable  {
      // No Comments were added
      int lookup = Axis.lookup("ancestor-or-self");
      assertEquals(13, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString1() throws Throwable  {
      // Look up the value for the "descendant-or-self" axis
      int lookup = Axis.lookup("descendant-or-self");
      
      // Assert that the lookup result is 12
      assertEquals(12, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString2() throws Throwable  {
      // Test that the "self" axis correctly returns the number 11 when looking up a value
      int lookup = Axis.lookup("self");
      assertEquals(11, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString3() throws Throwable  {
      // Look up the value for "namespace" in the Axis map
      int lookup = Axis.lookup("namespace");
      
      // Assert that the returned value is equal to 10
      assertEquals(10, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString4() throws Throwable  {
      // Look up a value in a map based on an attribute name
      int lookup = Axis.lookup("attribute");
      
      // Check that the returned value is equal to 9
      assertEquals(9, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString5() throws Throwable  {
      // rollbacked to evosuite
      int lookup = Axis.lookup("preceding");
      assertEquals(8, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString6() throws Throwable  {
      // rollbacked to evosuite
      int lookup = Axis.lookup("following");
      assertEquals(7, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString7() throws Throwable  {
      // Given a variable "lookup" of type "Axis",
      // when the method "lookup" is called with the argument "preceding-sibling",
      // then the method should return the value 6.
      int lookup = Axis.lookup("preceding-sibling");
      assertEquals(6, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString8() throws Throwable  {
      // No Comments were added
      int lookup = Axis.lookup("following-sibling");
      assertEquals(5, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString9() throws Throwable  {
      // rollbacked to evosuite
      int lookup = Axis.lookup("ancestor");
      assertEquals(4, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString10() throws Throwable  {
      // rollbacked to evosuite
      int lookup = Axis.lookup("parent");
      assertEquals(3, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString11() throws Throwable  {
      // rollbacked to evosuite
      int lookup = Axis.lookup("descendant");
      assertEquals(2, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString12() throws Throwable  {
      // Given a string "child" and an axis lookup function
      String name = "child";
      int lookup = Axis.lookup(name);
      
      // When we call the lookup function with the given string
      int result = Axis.lookup("child");
      
      // Then we expect the result to be 1
      assertEquals(1, result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingStringReturningZero() throws Throwable  {
      // Given: The Axis class has a lookup method that takes in a name as a string and returns an integer representing the index of the name in an array.
      // When: The lookup method is called with the name "John" as an argument.
      int lookup = Axis.lookup("John");
      
      // Then: The lookup method should return 0, since "John" is the first element in the array.
      assertEquals(0, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingIntReturningNull() throws Throwable  {
      // Given a negative number, we expect the lookup method to return null
      String lookup = Axis.lookup(-789);
      assertNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt0() throws Throwable  {
      // Test the lookup method with a valid axis value (13)
      String lookup = Axis.lookup(13);
      assertEquals("ancestor-or-self", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt1() throws Throwable  {
      // Test that the Axis.lookup() method returns a non-null value for the given axis number
      String lookup = Axis.lookup(12);
      assertNotNull(lookup);
      
      // Test that the returned string is equal to "descendant-or-self" for the given axis number
      assertEquals("descendant-or-self", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt2() throws Throwable  {
      // No Comments were added
      String lookup = Axis.lookup(11);
      assertNotNull(lookup);
      assertEquals("self", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt3() throws Throwable  {
      // Given a value of 10, we expect to find a valid namespace in the Axis class
      // When we call the lookup method with this value
      String lookup = Axis.lookup(10);
      // Then we assert that the result is not null and it matches our expected namespace
      assertNotNull(lookup);
      assertEquals("namespace", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt4() throws Throwable  {
      // Look up a value using the Axis class' lookup method
      String lookup = Axis.lookup(9);
      
      // Verify that the returned value is not null
      assertNotNull(lookup);
      
      // Verify that the returned value matches the expected attribute name
      assertEquals("attribute", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt5() throws Throwable  {
      // Given a value of 8, we expect to find a precedent in the Axis.lookup method
      String lookup = Axis.lookup(8);
      
      // When we call the lookup method with this value
      assertNotNull(lookup);
      
      // Then we should get back the string "preceding" as our result
      assertEquals("preceding", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt6() throws Throwable  {
      // No Comments were added
      String lookup = Axis.lookup(7);
      assertEquals("following", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt7() throws Throwable  {
      // Look up the axis with the number 6.
      String lookup = Axis.lookup(6);
      
      // Verify that the lookup is not null.
      assertNotNull(lookup);
      
      // Verify that the lookup returns "preceding-sibling".
      assertEquals("preceding-sibling", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt8() throws Throwable  {
      // No Comments were added
      String lookup = Axis.lookup(4);
      assertNotNull(lookup);
      assertEquals("ancestor", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt9() throws Throwable  {
      // This test looks up the value of a specific key in an Axis object
      // and asserts that it is not null and equals "parent".
      
      String lookup = Axis.lookup(3);
      assertNotNull(lookup);
      assertEquals("parent", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt10() throws Throwable  {
      // No Comments were added
      String lookup = Axis.lookup(2);
      assertEquals("descendant", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt11() throws Throwable  {
      // This test verifies that the "Axis.lookup" method returns a non-null value for a given input.
      // The input is 5, and the expected result is a string containing "following-sibling".
      String lookup = Axis.lookup(5);
      assertNotNull(lookup);
      assertEquals("following-sibling", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt12() throws Throwable  {
      // No Comments were added
      String lookup = Axis.lookup(1);
      assertEquals("child", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesAxis() throws Throwable  {
      // Given the Axis class and its ancestor-or-self constant
      Axis axis = new Axis();
      int ANCESTOR_OR_SELF = Axis.ANCESTOR_OR_SELF;
      
      // When we compare the constant to 13
      boolean result = (ANCESTOR_OR_SELF == 13);
      
      // Then the comparison should return false
      assertFalse(result);
  }
}
