/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 14 01:45:19 GMT 2024
 */

package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jstevh.viewer.ClassInfo;
import com.jstevh.viewer.DirManager;
import com.jstevh.viewer.MethodData;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassInfo_Original_ESTest extends ClassInfo_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsPrintFields0() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.SAXDirParser");
      String[] printFields = classInfo.printFields();
      assertEquals(1, printFields.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataTakingClassArray() throws Throwable  {
      Class<JFrame>[] arg0 = (Class<JFrame>[]) Array.newInstance(Class.class, 0);
      String[] data = ClassInfo.getData(arg0);
      assertNull(data);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataTakingMemberArrayReturningNonEmptyArray() throws Throwable  {
      Member[] arg0 = new Member[1];
      Member member = mock(Member.class, new ViolatedAssumptionAnswer());
      arg0[0] = member;
      String[] data = ClassInfo.getData(arg0);
      assertEquals(1, data.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataTakingMemberArrayReturningNull() throws Throwable  {
      Member[] arg0 = new Member[0];
      String[] data = ClassInfo.getData(arg0);
      assertNull(data);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassName() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String className = classInfo.getClassName();
      assertEquals("com.jstevh.viewer.ClassInfo$1", className);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain0() throws Throwable  {
      String[] arg0 = new String[4];
      arg0[0] = "new";
      ClassInfo.main(arg0);
      assertEquals(4, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain1() throws Throwable  {
      String[] arg0 = new String[4];
      arg0[0] = "java.lang.Object";
      ClassInfo.main(arg0);
      assertEquals(4, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain2() throws Throwable  {
      String[] arg0 = new String[1];
      arg0[0] = "com.jstevh.tools.StringTools";
      ClassInfo.main(arg0);
      assertEquals(1, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassInfoTakingStringThrowsNullPointerException() throws Throwable  {
      ClassInfo classInfo = null;
      try {
        classInfo = new ClassInfo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jstevh.viewer.ClassInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTakingStringReturningNonEmptyArray() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.MethodData");
      classInfo.srchMethods(".");
      MethodData foundMethod = classInfo.getFoundMethod(564);
      assertNull(foundMethod);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFoundMethod() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      MethodData foundMethod = classInfo.getFoundMethod(2);
      assertNull(foundMethod);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTaking2ArgumentsReturningNonEmptyArray() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.tools.StringTools");
      String[] arg1 = new String[1];
      arg1[0] = "com.jstevh.tools.StringTools";
      String[] srchMethods = classInfo.srchMethods("com.jstevh.tools.StringTools", arg1);
      assertEquals(1, srchMethods.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTaking2ArgumentsWithNullAndNull() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.tools.StringTools");
      String[] srchMethods = classInfo.srchMethods((String) null, (String[]) null);
      assertNull(srchMethods);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFoundMethodThrowsStringIndexOutOfBoundsException() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      classInfo.srchMethods("j");
      // Undeclared exception!
      try { 
        classInfo.getFoundMethod(1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTakingStringWithNull() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] srchMethods = classInfo.srchMethods((String) null);
      assertNull(srchMethods);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTakingStringReturningNull() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] srchMethods = classInfo.srchMethods("N ");
      assertNull(srchMethods);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSrchMethodsTaking2Arguments() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.SAXDirParser");
      String[] arg1 = classInfo.printInterfaces();
      assertNotNull(arg1);
      
      classInfo.srchMethods("com.jstevh.viewer.SAXDirParser", arg1);
      assertEquals(4, arg1.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndPrintInterfacesAndPrintInterfacesReturningNonEmptyArray() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] printInterfaces = classInfo.printInterfaces();
      assertEquals(1, printInterfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsPrintInterfaces0() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.MethodData");
      String[] printInterfaces = classInfo.printInterfaces();
      assertNull(printInterfaces);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsPrintInterfaces1() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("java.lang.Object");
      String[] printInterfaces = classInfo.printInterfaces();
      assertNull(printInterfaces);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsPrintInterfaces2() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.tools.StringTools");
      String[] printInterfaces = classInfo.printInterfaces();
      assertNull(printInterfaces);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintConstructorsReturningNull() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] printConstructors = classInfo.printConstructors();
      assertNull(printConstructors);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintConstructorsReturningNonEmptyArray() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo");
      String[] printConstructors = classInfo.printConstructors();
      assertEquals(2, printConstructors.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      String[] arg0 = new String[0];
      ClassInfo.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintMethodsTakingNoArguments() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] printMethods = classInfo.printMethods();
      assertNotNull(printMethods);
      assertEquals(12, printMethods.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsPrintFields1() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String[] printFields = classInfo.printFields();
      assertEquals(1, printFields.length);
      assertNotNull(printFields);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintFieldsReturningNull() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.tools.StringTools");
      String[] printFields = classInfo.printFields();
      assertNull(printFields);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTaking2ArgumentsAndCallsPrintInterfaces() throws Throwable  {
      DirManager arg1 = new DirManager(false);
      ClassInfo classInfo = new ClassInfo("javax.swing.JFrame", arg1);
      String[] printInterfaces = classInfo.printInterfaces();
      assertNotNull(printInterfaces);
      assertEquals(7, printInterfaces.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateClassInfoTaking2ArgumentsThrowsClassNotFoundException() throws Throwable  {
      DirManager arg1 = new DirManager(false);
      ClassInfo classInfo = null;
      try {
        classInfo = new ClassInfo("/home/roham/Results-Utestgen/dataset/SF110-new-res/91_classviewer", arg1);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jstevh.viewer.ClassInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTaking2Arguments() throws Throwable  {
      DirManager arg1 = new DirManager(false);
      ClassInfo classInfo = new ClassInfo("java.lang.Object", arg1);
      assertFalse(ClassInfo.debug);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsGetSuperClassName0() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.MethodData");
      String superClassName = classInfo.getSuperClassName();
      assertNull(superClassName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuperClassNameReturningNonEmptyString() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String superClassName = classInfo.getSuperClassName();
      assertEquals("java.lang.Object", superClassName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassInfoTakingStringAndCallsGetSuperClassName1() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("java.lang.Object");
      String superClassName = classInfo.getSuperClassName();
      assertNull(superClassName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetClassPackage() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo$1");
      String classPackage = classInfo.getClassPackage();
      assertEquals("com.jstevh.viewer", classPackage);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintMethodsTakingInt() throws Throwable  {
      ClassInfo classInfo = new ClassInfo("com.jstevh.viewer.ClassInfo");
      String[] printMethods = classInfo.printMethods((-1668));
      assertNull(printMethods);
  }
}
