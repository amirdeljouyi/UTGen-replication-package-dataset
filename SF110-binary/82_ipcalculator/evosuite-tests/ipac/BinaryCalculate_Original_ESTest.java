/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 14 12:58:02 GMT 2024
 */

package ipac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import ipac.BinaryCalculate;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BinaryCalculate_Original_ESTest extends BinaryCalculate_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSubBinaryReturningEmptyString() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String subBinary = binaryCalculate.subBinary("GFlg;]%pdsmO+c=", "Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 0\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /-2\nNetmask: \nBinary Netmask: ");
      assertEquals("", subBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinaryReturningEmptyString() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("c1j54$M2)Am$[8TAP$", "t0]B#r/,T2hc[ ~c8");
      assertEquals("", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSubBinaryWithEmptyString() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String subBinary = binaryCalculate.subBinary("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 268,435,454\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /0\nNetmask: \nBinary Netmask: ", "");
      assertEquals("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000001", subBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSubBinary() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String subBinary = binaryCalculate.subBinary("1Npr^/hxu>Kvo+Mr2", "1Npr^/hxu>Kvo+Mr2");
      assertEquals("1", subBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary0() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("0000000000000000000000000100000000000000000000000000001", "5~487`3DyOp',T");
      assertEquals("00000000000000000000000001000000000000000", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary1() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("0", "0");
      assertEquals("0", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary2() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("!C0f-eL>'tblRL1R", "!C0f-eL>'tblRL1R");
      assertEquals("10", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary3() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("1C`lnNTBn", "0BrzTm#c[1(gRHc,uA");
      assertEquals("10", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculateWithEmptyString() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.isIPv6 = true;
      binaryCalculate.lengthOfToken = 1;
      // Undeclared exception!
      try { 
        binaryCalculate.IPCalculate("", "pD5W@(QEu Ar7,");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length BigInteger
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate0() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.lengthOfToken = 1;
      String IPCalculate = binaryCalculate.IPCalculate("a|KCot", "a|KCot");
      assertEquals("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 0\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /-2\nNetmask: \nBinary Netmask: ", IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate1() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.lengthOfToken = 824;
      binaryCalculate.isIPv6 = true;
      String IPCalculate = binaryCalculate.IPCalculate("00000000000000001000000000000000000", "00000000000000000000000");
      assertNotNull(IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate2() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.isIPv6 = true;
      String IPCalculate = binaryCalculate.IPCalculate("000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000", "Dotalsabl IPGAddzesses : ");
      assertEquals("Total Range:  -- 255.255.255.255\nUsable Range:  -- \n\nTotal usable IP Addresses : 1,427,247,692,705,959,881,048,614,562,892,578,744,635,577,940\nSubnet: \nBinary Subnet: \nBroadcast Address: 255.255.255.255\nPrefix: /-128\nNetmask: \nBinary Netmask: ", IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate3() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.MAXPREFIX = 32;
      String IPCalculate = binaryCalculate.IPCalculate("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 2\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /0\nNetmask: \nBinary Netmask: ", "Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 2\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /0\nNetmask: \nBinary Netmask: ");
      assertEquals("Total Range: 255.255.255.255 -- \nUsable Range:  -- 255.255.255.255\n\nTotal usable IP Addresses : 134,217,728\nSubnet: \nBinary Subnet: Total Ra.nge:  --. \nUsable. Range: .\nBroadcast Address: \nPrefix: /4\nNetmask: 0.0.0.0\nBinary Netmask: 00000000.00000000.00000000.00000000", IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate4() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.MAXPREFIX = 2;
      String IPCalculate = binaryCalculate.IPCalculate("0", "0");
      assertEquals("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 1\nSubnet: \nBinary Subnet: 0\nBroadcast Address: \nPrefix: /0\nNetmask: \nBinary Netmask: 01", IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary4() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("!f-eL>'1tblRL1R", "!f-eL>'1tblRL1R");
      assertEquals("110", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddBinary5() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String addBinary = binaryCalculate.addBinary("1010", "111");
      assertEquals("10001", addBinary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate5() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String IPCalculate = binaryCalculate.IPCalculate("000000000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000000000000000000000000", "Dotalsbl IPAdzesses : ");
      assertEquals("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 1,427,247,692,705,959,881,048,614,562,892,578,102,985,097,215\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /0\nNetmask: \nBinary Netmask: ", IPCalculate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculateThrowsNumberFormatException() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      // Undeclared exception!
      try { 
        binaryCalculate.IPCalculate("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000000000000000000000000001", "0000000000000000000000000001");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // radix 0 less than Character.MIN_RADIX
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrefixInPrefixCalculateThrowsHeadlessException() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      binaryCalculate.isIPv4 = true;
      binaryCalculate.lengthOfToken = 1;
      // Undeclared exception!
      try { 
        binaryCalculate.prefixInPrefixCalculate("", "O46%?u`|qM1Pup", 1, "Total Range: 0 -- 1\nUsable Range: 1 -- 0\n\nTotal usable IP Addresses : -1\nSubnet: \nBinary Subnet: \nBroadcast Address: 1\nPrefix: /0\nNetmask: \nBinary Netmask: ");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIPCalculate6() throws Throwable  {
      BinaryCalculate binaryCalculate = new BinaryCalculate();
      String IPCalculate = binaryCalculate.IPCalculate("!f-eL>'1ltblR11R", "IP Address Range");
      assertEquals("Total Range:  -- \nUsable Range:  -- \n\nTotal usable IP Addresses : 0\nSubnet: \nBinary Subnet: \nBroadcast Address: \nPrefix: /-2\nNetmask: \nBinary Netmask: ", IPCalculate);
  }
}
