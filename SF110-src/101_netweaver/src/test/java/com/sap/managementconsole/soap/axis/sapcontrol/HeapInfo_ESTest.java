/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 15:42:07 GMT 2024
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo;
import com.sap.managementconsole.soap.axis.sapcontrol.STATECOLOR;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HeapInfo_ESTest extends HeapInfo_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningEmptyString() throws Throwable  {
      // Given a HeapInfo object with an empty string for its type
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setType("");
      
      // When we call the getType method on this object
      String type = heapInfo.getType();
      
      // Then we should get an empty string back
      assertEquals("", type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSizeReturningPositive() throws Throwable  {
      // Given
      STATECOLOR arg7 = STATECOLOR.value4;
      HeapInfo heapInfo = new HeapInfo((String) null, "com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo", 1651L, 1651L, 949L, 949L, (-1L), arg7);
      
      // When
      long size = heapInfo.getSize();
      
      // Then
      assertEquals(1651L, size);
      assertEquals(1651L, heapInfo.getCommitSize());
      assertEquals(949L, heapInfo.getMaxUsedSize());
      assertEquals((-1L), heapInfo.getMaxSize());
      assertEquals(949L, heapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSizeReturningNegative() throws Throwable  {
      // Setup
      STATECOLOR arg7 = STATECOLOR.value1;
      HeapInfo heapInfo = new HeapInfo("irnV^|6", "SAPControl-GRAY", (-1L), 1024L, 3725L, 2171L, 3725L, arg7);
      
      // Expected values
      long expectedSize = 3725L;
      String expectedType = "SAPControl-GRAY";
      long expectedCommitSize = 1024L;
      long expectedMaxSize = 3725L;
      String expectedProcessname = "irnV^|6";
      long expectedInitialSize = 2171L;
      
      // Test assertions
      assertEquals(expectedSize, heapInfo.getSize());
      assertEquals(expectedType, heapInfo.getType());
      assertEquals(expectedCommitSize, heapInfo.getCommitSize());
      assertEquals(expectedMaxSize, heapInfo.getMaxSize());
      assertEquals(expectedProcessname, heapInfo.getProcessname());
      assertEquals(expectedInitialSize, heapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProcessnameReturningNull() throws Throwable  {
      // Given: A new instance of the HeapInfo class is created
      HeapInfo heapInfo = new HeapInfo();
      
      // When: The getProcessName method is called on the new instance
      String processname = heapInfo.getProcessname();
      
      // Then: The returned value is null
      assertNull(processname);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProcessnameReturningNonEmptyString() throws Throwable  {
      // Given: A HeapInfo object with some predefined properties
      STATECOLOR arg7 = STATECOLOR.value3;
      HeapInfo heapInfo = new HeapInfo("y5:$Yx%`uIC+Ew0Y!", "SAPControl-RED", (-1L), (-1L), (-1L), (-1L), (-1L), arg7);
      
      // When: The processname is retrieved from the HeapInfo object
      String processname = heapInfo.getProcessname();
      
      // Then: The processname should match the expected value
      assertEquals("y5:$Yx%`uIC+Ew0Y!", processname);
      
      // And: The commit size, type, max used size, max size, and initial size of the HeapInfo object should all be -1L
      assertEquals(-1L, heapInfo.getCommitSize());
      assertEquals("SAPControl-RED", heapInfo.getType());
      assertEquals(-1L, heapInfo.getMaxUsedSize());
      assertEquals(-1L, heapInfo.getMaxSize());
      assertEquals(-1L, heapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxUsedSizeReturningZero() throws Throwable  {
      // Given: A new instance of the HeapInfo class has been created
      HeapInfo heapInfo = new HeapInfo();
      
      // When: The getMaxUsedSize method is called on the HeapInfo object
      long maxUsedSize = heapInfo.getMaxUsedSize();
      
      // Then: The maximum used size of the heap should be 0
      assertEquals(0L, maxUsedSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxUsedSizeReturningPositive() throws Throwable  {
      // Create a new HeapInfo object with some initial values
      HeapInfo heapInfo = new HeapInfo("native", "native", 0L, 0L, 19L, 0L, 0L, STATECOLOR.value4);
      
      // Get the maximum used size of the heap
      long maxUsedSize = heapInfo.getMaxUsedSize();
      
      // Assert that the maximum used size is equal to 19 (the initial value set in the HeapInfo constructor)
      assertEquals(19L, maxUsedSize);
      
      // Get the size of the heap
      long size = heapInfo.getSize();
      
      // Assert that the size is equal to 0 (the initial value set in the HeapInfo constructor)
      assertEquals(0L, size);
      
      // Get the initial size of the heap
      long initialSize = heapInfo.getInitialSize();
      
      // Assert that the initial size is equal to 0 (the initial value set in the HeapInfo constructor)
      assertEquals(0L, initialSize);
      
      // Get the commit size of the heap
      long commitSize = heapInfo.getCommitSize();
      
      // Assert that the commit size is equal to 0 (the initial value set in the HeapInfo constructor)
      assertEquals(0L, commitSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxSizeReturningPositive() throws Throwable  {
      // Given a HeapInfo object with a maximum size of 3146L
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setMaxSize(3146L);
      
      // When the getMaxSize method is called on the HeapInfo object
      long maxSize = heapInfo.getMaxSize();
      
      // Then the maximum size of the HeapInfo object should be 3146L
      assertEquals(3146L, maxSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxSizeReturningNegative() throws Throwable  {
      // Given a HeapInfo object with a set maximum size of -1114
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setMaxSize((-1114L));
      
      // When the getMaxSize method is called
      long maxSize = heapInfo.getMaxSize();
      
      // Then the correct maximum size should be returned, which is -1114
      assertEquals((-1114L), maxSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitialSizeReturningNegative() throws Throwable  {
      // Given an initial size of -793L, set in the HeapInfo object.
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setInitialSize((-793L));
      
      // When getting the initial size from the HeapInfo object.
      long initialSize = heapInfo.getInitialSize();
      
      // Then, the returned value should be -793L.
      assertEquals((-793L), initialSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDispstatusReturningNonNull() throws Throwable  {
      // Given
      STATECOLOR arg7 = STATECOLOR.value1;
      HeapInfo heapInfo = new HeapInfo("", "", 539L, (-771L), (-1379L), (-2752L), 2171L, arg7);
      
      // When
      heapInfo.getDispstatus();
      
      // Then
      assertEquals((-1379L), heapInfo.getMaxUsedSize());
      assertEquals((-2752L), heapInfo.getInitialSize());
      assertEquals((-771L), heapInfo.getCommitSize());
      assertEquals(539L, heapInfo.getSize());
      assertEquals(2171L, heapInfo.getMaxSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommitSizeReturningZero() throws Throwable  {
      // Given: A new HeapInfo object
      HeapInfo heapInfo = new HeapInfo();
      
      // When: The commit size is requested
      long commitSize = heapInfo.getCommitSize();
      
      // Then: The commit size should be 0
      assertEquals(0L, commitSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommitSizeReturningPositive() throws Throwable  {
      // Given a HeapInfo object with some initial values
      HeapInfo heapInfo = new HeapInfo("", "com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo", 1651L, 1651L, 949L, 949L, -1L, STATECOLOR.value4);
      
      // When we get the commit size of the heap info object
      long commitSize = heapInfo.getCommitSize();
      
      // Then the commit size should be equal to the initial size
      assertEquals(949L, commitSize);
      
      // And the initial size should be equal to the maximum size
      assertEquals(1651L, heapInfo.getInitialSize());
      
      // And the maximum size should be -1 (no limit)
      assertEquals(-1L, heapInfo.getMaxSize());
      
      // And the maximum used size should be equal to the initial size
      assertEquals(949L, heapInfo.getMaxUsedSize());
      
      // And the total size of the heap should be equal to the maximum size
      assertEquals(1651L, heapInfo.getSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommitSizeReturningNegative() throws Throwable  {
      // Given
      HeapInfo heapInfo = new HeapInfo("super", "Scheme is required!", 1073741830L, (-1061L), (-1061L), 1073741830L, 1073741830L, (STATECOLOR) null);
      
      // When
      long commitSize = heapInfo.getCommitSize();
      
      // Then
      assertEquals(1073741830L, heapInfo.getInitialSize());
      assertEquals("super", heapInfo.getProcessname());
      assertEquals((-1061L), commitSize);
      assertEquals(1073741830L, heapInfo.getMaxSize());
      assertEquals(1073741830L, heapInfo.getSize());
      assertEquals((-1061L), heapInfo.getMaxUsedSize());
      assertEquals("Scheme is required!", heapInfo.getType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxSizeReturningZero() throws Throwable  {
      // Given: A new instance of the HeapInfo class is created.
      HeapInfo heapInfo = new HeapInfo();
      
      // When: The getMaxSize() method is called on the HeapInfo object.
      long maxSize = heapInfo.getMaxSize();
      
      // Then: The maximum size of the heap should be 0, as it has not been initialized yet.
      assertEquals(0L, maxSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDispstatusReturningNull() throws Throwable  {
      // Given: A HeapInfo object with some initial values set
      HeapInfo heapInfo = new HeapInfo("NULL", "NULL", 0L, 0L, (-3315L), 4442L, (-3315L), (STATECOLOR) null);
      
      // When: Calling the getDispstatus() method on the HeapInfo object
      heapInfo.getDispstatus();
      
      // Then: The size of the heap should be 0
      assertEquals(0L, heapInfo.getSize());
      
      // And: The maximum size of the heap should be -3315
      assertEquals((-3315L), heapInfo.getMaxSize());
      
      // And: The maximum used size of the heap should be -3315
      assertEquals((-3315L), heapInfo.getMaxUsedSize());
      
      // And: The commit size of the heap should be 0
      assertEquals(0L, heapInfo.getCommitSize());
      
      // And: The initial size of the heap should be 4442
      assertEquals(4442L, heapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitialSizeReturningZero() throws Throwable  {
      // Given a new HeapInfo object
      HeapInfo heapInfo = new HeapInfo();
      
      // When the object is created
      long initialSize = heapInfo.getInitialSize();
      
      // Then the size of the heap should be 0L
      assertEquals(0L, initialSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSizeReturningZero() throws Throwable  {
      // Given a new instance of the HeapInfo class
      HeapInfo heapInfo = new HeapInfo();
      
      // When we call the getSize method
      long size = heapInfo.getSize();
      
      // Then we expect the result to be 0L
      assertEquals(0L, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNull() throws Throwable  {
      // Given: A new HeapInfo object with no data
      HeapInfo heapInfo = new HeapInfo();
      
      // When: The type is retrieved using the getType method
      String type = heapInfo.getType();
      
      // Then: The result should be null, indicating that there is no data in the heap
      assertNull(type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProcessnameReturningEmptyString() throws Throwable  {
      // rollbacked to evosuite
      HeapInfo heapInfo = new HeapInfo("", "_6;/\"{cwRnV<~qX!", (-988L), (-988L), (-988L), (-988L), (-988L), (STATECOLOR) null);
      String processname = heapInfo.getProcessname();
      assertEquals((-988L), heapInfo.getMaxSize());
      assertEquals((-988L), heapInfo.getSize());
      assertEquals("", processname);
      assertEquals((-988L), heapInfo.getInitialSize());
      assertEquals("_6;/\"{cwRnV<~qX!", heapInfo.getType());
      assertEquals((-988L), heapInfo.getMaxUsedSize());
      assertEquals((-988L), heapInfo.getCommitSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxUsedSizeReturningNegative() throws Throwable  {
      // Given a new HeapInfo instance with null values for all parameters
      HeapInfo heapInfo = new HeapInfo(null, null, 0L, 0L, -3315L, 4442L, -3315L, null);
      
      // When we get the max used size of the heap
      long maxUsedSize = heapInfo.getMaxUsedSize();
      
      // Then the max used size should be equal to the maximum size of the heap
      assertEquals(-3315L, maxUsedSize);
      
      // And the initial size of the heap should be equal to 0
      assertEquals(4442L, heapInfo.getInitialSize());
      
      // And the commit size of the heap should be equal to 0
      assertEquals(0L, heapInfo.getCommitSize());
      
      // And the size of the heap should be equal to 0
      assertEquals(0L, heapInfo.getSize());
      
      // And the maximum size of the heap should be equal to the negative value passed in the constructor
      assertEquals(-3315L, heapInfo.getMaxSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHeapInfoTaking8ArgumentsAndCallsHashCode() throws Throwable  {
      // Arrange
      HeapInfo expectedHeapInfo = new HeapInfo("native", "native", 0L, 0L, 19L, 0L, 0L, STATECOLOR.value4);
      
      // Act
      HeapInfo actualHeapInfo = new HeapInfo("native", "native", 0L, 0L, 19L, 0L, 0L, STATECOLOR.value4);
      
      // Assert
      assertEquals(expectedHeapInfo, actualHeapInfo);
      assertEquals(0L, actualHeapInfo.getSize());
      assertEquals(0L, actualHeapInfo.getMaxSize());
      assertEquals(0L, actualHeapInfo.getCommitSize());
      assertEquals(19L, actualHeapInfo.getMaxUsedSize());
      assertEquals(0L, actualHeapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxSize() throws Throwable  {
      // Given: Two HeapInfo objects with negative max size values
      HeapInfo heapInfo1 = new HeapInfo();
      HeapInfo heapInfo2 = new HeapInfo();
      heapInfo1.setMaxSize(-1390L);
      heapInfo2.setMaxSize(-1390L);
      
      // When: We call the equals method on both objects
      boolean equal1 = heapInfo1.equals(heapInfo2);
      boolean equal2 = heapInfo2.equals(heapInfo1);
      
      // Then: Both objects are equal and have the same hash code
      assertEquals(-1390L, heapInfo1.getMaxSize());
      assertEquals(-1390L, heapInfo2.getMaxSize());
      assertTrue(equal1);
      assertTrue(equal2);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetInitialSize() throws Throwable  {
      // Given a HeapInfo instance with an initial size of -1390L
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setInitialSize(-1390L);
      
      // When we compare the HeapInfo instance to another instance with the same initial size
      HeapInfo arg0 = new HeapInfo();
      arg0.setInitialSize(-1390L);
      boolean equals = heapInfo.equals(arg0);
      
      // Then we expect the equality method to return true and the getInitialSize method to return -1390L
      assertTrue(equals);
      assertEquals(-1390L, heapInfo.getInitialSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHeapInfoTaking8ArgumentsAndCallsEquals() throws Throwable  {
      // No Comments were added
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setType("S%zLy18;>`ke(a");
      STATECOLOR arg7 = STATECOLOR.value2;
      HeapInfo arg0 = new HeapInfo((String) null, "S%zLy18;>`ke(a", 0L, 0L, 925L, (-1144L), 255L, arg7);
      boolean equals = heapInfo.equals(arg0);
      assertEquals(925L, arg0.getMaxUsedSize());
      assertEquals(0L, arg0.getCommitSize());
      assertEquals((-1144L), arg0.getInitialSize());
      assertFalse(equals);
      assertEquals(255L, arg0.getMaxSize());
      assertEquals(0L, arg0.getSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCommitSize() throws Throwable  {
      // Given two HeapInfo objects, one with a commit size of -1674 and the other with the same value
      HeapInfo heapInfo = new HeapInfo();
      HeapInfo arg0 = new HeapInfo();
      arg0.setCommitSize((-1674L));
      
      // When we call the equals method on the first object with the second object as an argument
      boolean equals = heapInfo.equals(arg0);
      
      // Then we expect the result to be false, since the commit size of the two objects is different
      assertFalse(equals);
      
      // And we expect the getCommitSize method on the first object to return -1674
      assertEquals((-1674L), heapInfo.getCommitSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSize() throws Throwable  {
      // rollbacked to evosuite
      HeapInfo arg0 = new HeapInfo();
      arg0.setProcessname("Dt");
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setProcessname("Dt");
      heapInfo.setSize(1L);
      boolean equals = heapInfo.equals(arg0);
      assertEquals(1L, heapInfo.getSize());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue() throws Throwable  {
      // Given two HeapInfo objects, "heapInfo" and "arg0", where "arg0" has a different type than "heapInfo".
      HeapInfo heapInfo = new HeapInfo();
      HeapInfo arg0 = new HeapInfo();
      
      // When we call the equals() method on "heapInfo" with "arg0" as an argument.
      boolean equals = heapInfo.equals(arg0);
      
      // Then the method should return false, since "arg0" has a different type than "heapInfo".
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetType0() throws Throwable  {
      // Create two instances of HeapInfo
      HeapInfo heapInfo = new HeapInfo();
      HeapInfo arg0 = new HeapInfo();
      
      // Assert that the instances are equal, as they are empty and have no properties set
      assertTrue(arg0.equals((Object)heapInfo));
      
      // Set a property on one of the instances and assert that they are no longer equal
      arg0.setType(":euB42uY+c_*Pl2");
      boolean equals = heapInfo.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetType1() throws Throwable  {
      // Given two instances of HeapInfo, one with a specific heap type and the other with a different heap type
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setType("=P<");
      HeapInfo arg0 = new HeapInfo();
      arg0.setType("=G<");
      
      // When we compare these instances using the equals method
      boolean equals = heapInfo.equals(arg0);
      
      // Then we expect that they are not equal
      assertFalse(arg0.equals((Object)heapInfo));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetProcessname0() throws Throwable  {
      // rollbacked to evosuite
      HeapInfo heapInfo = new HeapInfo();
      HeapInfo arg0 = new HeapInfo();
      assertTrue(arg0.equals((Object)heapInfo));
      
      arg0.setProcessname("O9efD0YT_");
      boolean equals = heapInfo.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetProcessname1() throws Throwable  {
      // rollbacked to evosuite
      HeapInfo arg0 = new HeapInfo();
      HeapInfo heapInfo = new HeapInfo();
      assertTrue(heapInfo.equals((Object)arg0));
      
      heapInfo.setProcessname("sLceq.o=xzOwPe");
      boolean equals = heapInfo.equals(arg0);
      assertFalse(heapInfo.equals((Object)arg0));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHeapInfoTakingNoArgumentsAndEqualsAndEqualsReturningFalse() throws Throwable  {
      // Given a HeapInfo object and a STATECOLOR value,
      HeapInfo heapInfo = new HeapInfo();
      STATECOLOR arg0 = STATECOLOR.value3;
      
      // When we call the equals method with this value as an argument,
      boolean equals = heapInfo.equals(arg0);
      
      // Then we expect the result to be false,
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHeapInfoTakingNoArgumentsAndEqualsAndEqualsReturningTrue() throws Throwable  {
      // Given a new HeapInfo object
      HeapInfo arg0 = new HeapInfo();
      
      // When the equals method is called with the same HeapInfo object
      boolean equals = arg0.equals(arg0);
      
      // Then the result should be true, indicating that the objects are equal
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitialSizeReturningPositive() throws Throwable  {
      // Given: A new instance of HeapInfo class with an initial size of 1 MB
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setInitialSize(1048576L);
      
      // When: The initial size is retrieved
      long initialSize = heapInfo.getInitialSize();
      
      // Then: The initial size should be equal to 1 MB
      assertEquals(1048576L, initialSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDeserializer() throws Throwable  {
      // Given: We have a deserializer object for the HeapInfo class
      Deserializer deserializer = HeapInfo.getDeserializer("com.sap.managementconsole.soap.axis.sapcontrol.HeapInfo", (Class) null, (QName) null);
      
      // When: We check if the components are ready
      assertFalse(deserializer.componentsReady());
      
      // Then: The components are not ready, so we expect this test to fail
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxUsedSize() throws Throwable  {
      // Given: A HeapInfo object is created and the maximum used size is set to 10000
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.setMaxUsedSize(10000L);
      
      // When: The maximum used size of the HeapInfo object is retrieved
      long maxUsedSize = heapInfo.getMaxUsedSize();
      
      // Then: The maximum used size should be equal to 10000
      assertEquals(10000L, maxUsedSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNonEmptyString() throws Throwable  {
      // Given: A HeapInfo object is created with a specific type of heap (Large Object Heap)
      HeapInfo largeObjectHeap = new HeapInfo();
      largeObjectHeap.setType("Large Object Heap");
      
      // When: The getType() method is called on the HeapInfo object
      String type = largeObjectHeap.getType();
      
      // Then: The expected type "Large Object Heap" should be returned
      assertEquals("Large Object Heap", type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHeapInfoTakingNoArgumentsAndCallsHashCode() throws Throwable  {
      // No Comments were added
      HeapInfo heapInfo = new HeapInfo();
      heapInfo.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeDesc() throws Throwable  {
      // Given a type desc
      TypeDesc typeDesc = HeapInfo.getTypeDesc();
      
      // When the hasAttributes method is called
      boolean actualResult = typeDesc.hasAttributes();
      
      // Then return false
      assertFalse(actualResult);
  }
}
