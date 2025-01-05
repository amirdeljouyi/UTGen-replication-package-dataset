/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 16:02:26 GMT 2024
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEApplicationAlias;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class J2EEApplicationAlias_Original_ESTest extends J2EEApplicationAlias_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningZero() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      assertEquals(0, totalRequests);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningNull() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      assertNull(ignoreCookie);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningNull() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      String appName = j2EEApplicationAlias.getAppName();
      assertNull(appName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningNull() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      String appActive = j2EEApplicationAlias.getAppActive();
      assertNull(appActive);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("org.apache.log4j.spi.RootCategory", "", 0, "", "uVb JcNM>7yd");
      String appActive = j2EEApplicationAlias.getAppActive();
      assertEquals("org.apache.log4j.spi.RootCategory", j2EEApplicationAlias.getAppName());
      assertEquals("", j2EEApplicationAlias.getAlias());
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
      assertEquals("uVb JcNM>7yd", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals("", appActive);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningNull() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      String alias = j2EEApplicationAlias.getAlias();
      assertNull(alias);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("X>XpN", "X>XpN", 9, "X>XpN", "");
      String appName = j2EEApplicationAlias.getAppName();
      assertEquals("X>XpN", j2EEApplicationAlias.getAppActive());
      assertEquals("", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals(9, j2EEApplicationAlias.getTotalRequests());
      assertEquals("X>XpN", appName);
      assertEquals("X>XpN", j2EEApplicationAlias.getAlias());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("", "", 975, "QO.", "/CVD)Bc/aR^^=");
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      assertEquals("QO.", j2EEApplicationAlias.getAppActive());
      assertEquals("", j2EEApplicationAlias.getAlias());
      assertEquals("/CVD)Bc/aR^^=", ignoreCookie);
      assertEquals(975, j2EEApplicationAlias.getTotalRequests());
      assertEquals("", j2EEApplicationAlias.getAppName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("^Rj,K&!0z", "^Rj,K&!0z", 5873, "Kd", "^Rj,K&!0z");
      String appActive = j2EEApplicationAlias.getAppActive();
      assertEquals(5873, j2EEApplicationAlias.getTotalRequests());
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getAppName());
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getAlias());
      assertEquals("Kd", appActive);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("X>XpN", "X>XpN", 9, "X>XpN", "");
      String alias = j2EEApplicationAlias.getAlias();
      assertEquals("", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals("X>XpN", alias);
      assertEquals("X>XpN", j2EEApplicationAlias.getAppName());
      assertEquals(9, j2EEApplicationAlias.getTotalRequests());
      assertEquals("X>XpN", j2EEApplicationAlias.getAppActive());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningPositive() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("^Rj,K&!0z", "^Rj,K&!0z", 5873, "Kd", "^Rj,K&!0z");
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getAlias());
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getAppName());
      assertEquals("^Rj,K&!0z", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals("Kd", j2EEApplicationAlias.getAppActive());
      assertEquals(5873, totalRequests);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndCallsHashCode() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.hashCode();
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetIgnoreCookie0() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setIgnoreCookie("G*h^w~4vIzcEb3^eVw");
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(arg0.equals((Object)j2EEApplicationAlias));
      assertFalse(equals);
      assertEquals(0, arg0.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetIgnoreCookie1() throws Throwable  {
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      arg0.setIgnoreCookie("G*h^w~4vIzcEb3^eVw");
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(arg0.equals((Object)j2EEApplicationAlias));
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAppActive0() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAppActive("IgnoreCookie");
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(arg0.equals((Object)j2EEApplicationAlias));
      assertEquals(0, arg0.getTotalRequests());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAppActive1() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      assertTrue(arg0.equals((Object)j2EEApplicationAlias));
      
      arg0.setAppActive("VD@'nh2H?L#;_(`%gv");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAppNameWithNonEmptyStringAndSetTotalRequestsWithPositive() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("", "G*h^w~4vIzcEb3^eVw", 0, "G*h^w~4vIzcEb3^eVw", "");
      j2EEApplicationAlias.setAlias("{~FL VG#8~Q");
      j2EEApplicationAlias.setTotalRequests(1572);
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias("G*h^w~4vIzcEb3^eVw", "{~FL VG#8~Q", 0, "IgnoreCookie", "G*h^w~4vIzcEb3^eVw");
      j2EEApplicationAlias.setAppName("G*h^w~4vIzcEb3^eVw");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertEquals(1572, j2EEApplicationAlias.getTotalRequests());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAlias0() throws Throwable  {
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      assertTrue(j2EEApplicationAlias.equals((Object)arg0));
      
      j2EEApplicationAlias.setAlias("P[");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAlias1() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      assertTrue(arg0.equals((Object)j2EEApplicationAlias));
      
      arg0.setAlias("f,p$PlBfC2Tct&NunFv");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsEquals0() throws Throwable  {
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%", 2245, "!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
      assertEquals(2245, j2EEApplicationAlias.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndCallsEquals0() throws Throwable  {
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsEquals1() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias("|Um$b![0qb", "V>)z3p=(+", (-1968526675), "'[sEOD,", "Alias");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
      assertEquals("|Um$b![0qb", arg0.getAppName());
      assertEquals("Alias", arg0.getIgnoreCookie());
      assertEquals("V>)z3p=(+", arg0.getAlias());
      assertEquals("'[sEOD,", arg0.getAppActive());
      assertEquals((-1968526675), arg0.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndEqualsAndEqualsReturningTrue() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%", 2245, "!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%");
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias("!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%", 2245, "!7Lf$G9NV/zR]Q%", "!7Lf$G9NV/zR]Q%");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertEquals(2245, arg0.getTotalRequests());
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      QName arg0 = new QName("TotalRequests");
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndCallsEquals1() throws Throwable  {
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDeserializer() throws Throwable  {
      Class<J2EEApplicationAlias> arg1 = J2EEApplicationAlias.class;
      QName arg2 = QName.valueOf("G*h^w~4vIzcEb3^eVw");
      Deserializer deserializer = J2EEApplicationAlias.getDeserializer("G*h^w~4vIzcEb3^eVw", arg1, arg2);
      assertFalse(deserializer.componentsReady());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAppName("");
      String appName = j2EEApplicationAlias.getAppName();
      assertEquals("", appName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeDesc() throws Throwable  {
      TypeDesc typeDesc = J2EEApplicationAlias.getTypeDesc();
      assertFalse(typeDesc.hasAttributes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningNegative() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setTotalRequests((-1815));
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      assertEquals((-1815), totalRequests);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsHashCode() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("", "", (-2147483645), "hR>zG(x[SR_", "HEFl9\"oqQ6VRv0+");
      j2EEApplicationAlias.hashCode();
      assertEquals("", j2EEApplicationAlias.getAppName());
      assertEquals((-2147483645), j2EEApplicationAlias.getTotalRequests());
      assertEquals("hR>zG(x[SR_", j2EEApplicationAlias.getAppActive());
      assertEquals("HEFl9\"oqQ6VRv0+", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals("", j2EEApplicationAlias.getAlias());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setIgnoreCookie("");
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      assertEquals("", ignoreCookie);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSerializer() throws Throwable  {
      Class<J2EEApplicationAlias> arg1 = J2EEApplicationAlias.class;
      QName arg2 = QName.valueOf("G*h^w~4vIzcEb3^eVw");
      Serializer serializer = J2EEApplicationAlias.getSerializer("V>)z3p=(+", arg1, arg2);
      assertEquals("Axis SAX Mechanism", serializer.getMechanismType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAlias("");
      String alias = j2EEApplicationAlias.getAlias();
      assertEquals("", alias);
  }
}
