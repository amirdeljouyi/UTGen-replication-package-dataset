/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 18:36:15 GMT 2024
 */

package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.allenstudio.ir.util.XmlElement;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Observer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlElement_Original_ESTest extends XmlElement_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveElementTakingIntReturningXmlElementWhereCountIsZero() throws Throwable  {
      XmlElement arg0 = new XmlElement("");
      arg0.append(arg0);
      XmlElement addSubElement = arg0.addSubElement("");
      XmlElement removeElement = arg0.removeElement(1);
      assertSame(removeElement, addSubElement);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveElementTakingIntReturningXmlElementWhereCountIsPositive() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.addElement(arg0);
      XmlElement addSubElement = arg0.addSubElement("3Sh.DU}s8~", "3Sh.DU}s8~");
      assertEquals("3Sh.DU}s8~", addSubElement.getData());
      
      XmlElement removeElement = arg0.removeElement(0);
      assertNotSame(removeElement, addSubElement);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetParentReturningXmlElementWhereCountIsPositive() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      Observer arg0 = mock(Observer.class, new ViolatedAssumptionAnswer());
      xmlElement.addObserver(arg0);
      XmlElement addSubElement = xmlElement.addSubElement("");
      XmlElement parent = addSubElement.getParent();
      assertEquals(1, parent.countObservers());
      assertNotNull(parent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetParentReturningXmlElementWhereCountIsZero() throws Throwable  {
      XmlElement xmlElement = new XmlElement("", "");
      xmlElement.parent = xmlElement;
      XmlElement parent = xmlElement.getParent();
      assertEquals(0, parent.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      String name = xmlElement.getName();
      assertNull(name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementsReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.subElements = null;
      List elements = xmlElement.getElements();
      assertNull(elements);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementsReturningListWhereIsEmptyIsFalse() throws Throwable  {
      XmlElement xmlElement = new XmlElement("com.allenstudio.ir.util.XmlElement");
      xmlElement.addSubElement("com.allenstudio.ir.util.XmlElement");
      xmlElement.getElements();
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementTakingIntReturningXmlElementWhereCountIsZero() throws Throwable  {
      XmlElement xmlElement = new XmlElement("@ [W(XWp;c4c7ngvT`F");
      XmlElement addSubElement = xmlElement.addSubElement("E'mh1GA>%b[Xww}hK");
      Hashtable<String, String> arg1 = new Hashtable<String, String>();
      XmlElement arg0 = new XmlElement("(F-6ooco:Cx", arg1);
      xmlElement.append(arg0);
      assertEquals(2, xmlElement.count());
      
      xmlElement.getElement(1);
      assertNotSame(xmlElement, addSubElement);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataReturningNonEmptyString() throws Throwable  {
      XmlElement xmlElement = new XmlElement("/oBYx\"");
      XmlElement addSubElement = xmlElement.addSubElement("");
      addSubElement.data = "/oBYx\"";
      String data = addSubElement.getData();
      assertEquals(1, xmlElement.count());
      assertEquals("/oBYx\"", data);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributesReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.setAttributes((Hashtable<String, String>) null);
      Hashtable<String, String> attributes = xmlElement.getAttributes();
      assertNull(attributes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeTakingStringReturningNonEmptyString() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.getAttribute(")NQk;.x=)tr1-F", ")NQk;.x=)tr1-F");
      String attribute = xmlElement.getAttribute(")NQk;.x=)tr1-F");
      assertEquals(")NQk;.x=)tr1-F", attribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeTakingStringReturningEmptyString() throws Throwable  {
      XmlElement xmlElement = new XmlElement("FS,m1`U,e<");
      xmlElement.addAttribute("", "");
      String attribute = xmlElement.getAttribute("");
      assertEquals("", attribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCountReturningPositive() throws Throwable  {
      XmlElement xmlElement = new XmlElement("");
      xmlElement.addSubElement("");
      int count = xmlElement.count();
      assertEquals(1, count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddAttributeReturningNonNull() throws Throwable  {
      Hashtable<String, String> arg1 = new Hashtable<String, String>();
      arg1.put("", "com.allenstudio.ir.util.XmlElement");
      XmlElement xmlElement = new XmlElement("^d+j|a<Y_**>Fq_", arg1);
      xmlElement.addAttribute("", "VUE");
      assertEquals(1, arg1.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementTakingStringReturningXmlElementWhereCountIsPositive() throws Throwable  {
      XmlElement arg0 = new XmlElement("");
      arg0.append(arg0);
      XmlElement element = arg0.getElement("");
      assertEquals(0, element.countObservers());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveFromParent() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.removeFromParent();
      assertNull(xmlElement.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddAttributeWithNullAndCreatesXmlElementTakingString() throws Throwable  {
      XmlElement xmlElement = new XmlElement("usSh|8`!?;/");
      Object addAttribute = xmlElement.addAttribute("usSh|8`!?;/", (String) null);
      assertNull(addAttribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable  {
      XmlElement xmlElement = new XmlElement((String) null, "com.allenstudio.ir.util.XmlElement");
      List elements = xmlElement.getElements();
      assertTrue(elements.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataReturningEmptyString() throws Throwable  {
      XmlElement xmlElement = new XmlElement(":");
      String data = xmlElement.getData();
      assertEquals("", data);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetParent() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.setParent(arg0);
      assertNull(arg0.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeTakingStringReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      String attribute = xmlElement.getAttribute(")NQk;.x=)tr1-F");
      assertNull(attribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveElementTakingXmlElementReturningXmlElementWhereCountIsZero() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.addElement(arg0);
      arg0.removeElement(arg0);
      assertEquals(0, arg0.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingNoArgumentsAndCallsHashCode() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.subElements = null;
      xmlElement.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingStringAndCallsHashCode() throws Throwable  {
      XmlElement xmlElement = new XmlElement("com.allenstudio.ir.util.XmlElement");
      xmlElement.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.setAttributes((Hashtable<String, String>) null);
      xmlElement.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement arg0 = new XmlElement();
      arg0.addSubElement(":+37k-");
      boolean equals = xmlElement.equals(arg0);
      assertEquals(1, arg0.count());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingStringAndCallsEquals() throws Throwable  {
      XmlElement xmlElement = new XmlElement("com.allenstudio.ir.util.XmlElement");
      XmlElement arg0 = xmlElement.addSubElement("~-X");
      boolean equals = xmlElement.equals(arg0);
      assertEquals(1, xmlElement.count());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      Object arg0 = new Object();
      XmlElement xmlElement = new XmlElement();
      boolean equals = xmlElement.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement("j~BE4`<A+Ve}", "j~BE4`<A+Ve}");
      boolean equals = xmlElement.equals((Object) null);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTaking2Arguments() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement arg0 = new XmlElement((String) null, (Hashtable<String, String>) null);
      boolean equals = xmlElement.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTaking2ArgumentsAndCallsEquals() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement arg0 = new XmlElement("~-X", "com.allenstudio.i.util.XmlElement");
      boolean equals = xmlElement.equals(arg0);
      assertFalse(equals);
      assertEquals("com.allenstudio.i.util.XmlElement", arg0.getData());
      assertFalse(arg0.equals((Object)xmlElement));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppend() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement arg0 = new XmlElement();
      xmlElement.append(arg0);
      xmlElement.clone();
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingNoArgumentsAndCallsClone() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.subElements = null;
      Object clone = xmlElement.clone();
      assertNotNull(clone);
      assertNotSame(clone, xmlElement);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddAttribute() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.addAttribute("n,h4}WdC~", "n,h4}WdC~");
      XmlElement.printNode(arg0, "n,h4}WdC~");
      assertNull(arg0.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTaking2ArgumentsAndCallsPrintNode() throws Throwable  {
      XmlElement arg0 = new XmlElement("r", "r");
      XmlElement.printNode(arg0, "r");
      assertEquals("r", arg0.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingNoArgumentsAndCallsAddSubElementTakingString0() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.addSubElement("com.allestudio.irutil.XmlEleUewt");
      xmlElement.addSubElement("com.allestudio.irutil.XmlEleUewt");
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementTakingString() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.addSubElement("|OY;p`");
      xmlElement.getElement("com.allenstudio.ir.util.XmlElement");
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementTakingStringReturningXmlElementWhereCountIsZero() throws Throwable  {
      XmlElement xmlElement = new XmlElement("com.allenstudio.ir.util.XmlElement");
      xmlElement.addSubElement("com.allenstudio.ir.util.XmlElement");
      xmlElement.getElement("com.allenstudio.ir.util.XmlElement");
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingNoArgumentsAndCallsGetElementTakingString() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement element = xmlElement.getElement(".I`=N-|s];X");
      assertNull(element);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveElementTakingXmlElement() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement arg0 = xmlElement.addSubElement("cm.allenstudio.ir.util.XmlElement");
      xmlElement.removeElement(arg0);
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveElementTakingXmlElementReturningNull() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      XmlElement removeElement = arg0.removeElement(arg0);
      assertNull(removeElement);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeTaking2Arguments() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.addAttribute("(F-6ooco:Cx", "(F-6ooco:Cx");
      String attribute = xmlElement.getAttribute("(F-6ooco:Cx", (String) null);
      assertEquals("(F-6ooco:Cx", attribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributesReturningHashtableWhereSizeIsPositive() throws Throwable  {
      XmlElement xmlElement = new XmlElement("");
      xmlElement.getAttribute("", "");
      Hashtable<String, String> attributes = xmlElement.getAttributes();
      assertFalse(attributes.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddAttributeWithNullAndCreatesXmlElementTakingNoArguments() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      Object addAttribute = xmlElement.addAttribute((String) null, "9eLBkk!].SEuk1t/Fn");
      assertNull(addAttribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetName() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.setName("G~B;sxWl");
      assertEquals(0, xmlElement.countObservers());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetElementTakingIntReturningXmlElementWhereCountIsPositive() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.append(arg0);
      XmlElement element = arg0.getElement(0);
      assertNull(element.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataReturningNull() throws Throwable  {
      Hashtable<String, String> arg1 = new Hashtable<String, String>();
      XmlElement xmlElement = new XmlElement("Xu;UO@Ta/oc'w)];", arg1);
      String data = xmlElement.getData();
      assertNull(data);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInsertElement() throws Throwable  {
      XmlElement arg0 = new XmlElement();
      arg0.insertElement(arg0, 0);
      assertNull(arg0.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyObservers() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.notifyObservers();
      assertNull(xmlElement.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddSubElementTaking2Arguments() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement addSubElement = xmlElement.addSubElement("'", "'");
      addSubElement.removeFromParent();
      assertEquals(0, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingNoArgumentsAndCallsAddSubElementTakingString1() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.addSubElement(".81Azrm(U|KB");
      assertEquals(1, xmlElement.count());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetParentReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      XmlElement parent = xmlElement.getParent();
      assertNull(parent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetData() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.setData("");
      assertEquals("", xmlElement.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNonEmptyString() throws Throwable  {
      XmlElement xmlElement = new XmlElement(":", ":");
      String name = xmlElement.getName();
      assertEquals(":", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveAllElements() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.removeAllElements();
      assertNull(xmlElement.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeNames() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      Enumeration attributeNames = xmlElement.getAttributeNames();
      assertNotNull(attributeNames);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClone() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      xmlElement.setAttributes((Hashtable<String, String>) null);
      Object clone = xmlElement.clone();
      assertNotSame(clone, xmlElement);
      assertNotNull(clone);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeTaking2ArgumentsReturningNull() throws Throwable  {
      XmlElement xmlElement = new XmlElement("");
      String attribute = xmlElement.getAttribute("", (String) null);
      assertNull(attribute);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXmlElementTakingStringAndCallsPrintNode() throws Throwable  {
      XmlElement arg0 = new XmlElement("com.allenstudio.ir.util.XmlElement");
      XmlElement.printNode(arg0, "com.allenstudio.ir.util.XmlElement");
      assertEquals("com.allenstudio.ir.util.XmlElement", arg0.getName());
      assertEquals("", arg0.getData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCountReturningZero() throws Throwable  {
      XmlElement xmlElement = new XmlElement();
      int count = xmlElement.count();
      assertEquals(0, count);
  }
}
