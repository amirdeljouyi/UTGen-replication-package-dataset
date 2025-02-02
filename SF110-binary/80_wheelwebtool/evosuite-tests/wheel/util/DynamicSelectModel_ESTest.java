/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 13 18:58:26 GMT 2024
 */

package wheel.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mvel.util.FastList;
import wheel.ErrorPage;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValue() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel collection = dynamicSelectModel.collection("[] from ");
      Object arg0 = new Object();
      DynamicSelectModel empty = collection.empty(arg0);
      empty.value("[] from ");
      String value = empty.getValue(0);
      assertNotNull(value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTopLevelComponent() throws Throwable  {
      // Given
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      ErrorPage errorPage = new ErrorPage();
      
      // When
      dynamicSelectModel.setTopLevelComponent(errorPage);
      
      // Then
      StandaloneComponent topLevelComponent = dynamicSelectModel.getTopLevelComponent();
      assertEquals("wheel_ErrorPage", topLevelComponent.getComponentId());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOptionCountReturningZero() throws Throwable  {
      // Given a DynamicSelectModel instance with an empty collection
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      String collectionName = "[]rfBom ";
      dynamicSelectModel.collection(collectionName);
      
      // When the option count is retrieved
      int optionCount = dynamicSelectModel.getOptionCount();
      
      // Then the option count should be 0
      assertEquals(0, optionCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOptionCountReturningPositive() throws Throwable  {
      // Given an empty collection of DynamicSelectModel objects
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel collection = dynamicSelectModel.collection("[] from ");
      
      // When the collection is emptied
      Object arg0 = new Object();
      collection.empty(arg0);
      
      // Then the option count should be 1, as it contains a single empty option
      int optionCount = collection.getOptionCount();
      assertEquals(1, optionCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValidateThrowsRuntimeException() throws Throwable  {
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      // Given a DynamicSelectModel with a null or not an el-expression collection attribute
      // When attempting to validate the model
      try {
      dynamicSelectModel.validate();
      fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      // Then an exception is thrown indicating that the Collection attribute was null or not an el-expression
      verifyException("wheel.util.DynamicSelectModel", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLabel() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel collection = dynamicSelectModel.collection("[] from ");
      Object arg0 = new Object();
      collection.empty(arg0);
      collection.getObjects();
      DynamicSelectModel enumeration = collection.enumeration("f:w}EE#n}*iC");
      String label = enumeration.getLabel(0);
      assertNotNull(label);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValidate() throws Throwable  {
      // Given a DynamicSelectModel object and a String value "RETURN"
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      String inputValue = "RETURN";
      
      // When the "enumeration" method is called with the input value
      dynamicSelectModel.enumeration(inputValue);
      
      // Then the method should return a reference to the same DynamicSelectModel object
      assertSame(dynamicSelectModel, dynamicSelectModel.enumeration(inputValue));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCollection() throws Throwable  {
      // Given
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      dynamicSelectModel.collection("org.mvel.conversion.IntegerCH");
      
      // When
      try {
      dynamicSelectModel.validate();
      fail("Expecting exception: RuntimeException");
      } catch (RuntimeException e) {
      // Then
      verifyException("wheel.util.DynamicSelectModel", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetObjectsThrowsRuntimeException() throws Throwable  {
      // Given a DynamicSelectModel instance
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      
      // When a collection of objects is passed to the model
      dynamicSelectModel.collection("org.mvel.ASTNode");
      
      // Then an exception should be thrown because the collection does not match the expected type
      try {
      // Undeclared exception!
      dynamicSelectModel.getObjects();
      fail("Expecting exception: RuntimeException");
      } catch (RuntimeException e) {
      // Expression org.mvel.ASTNode evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
      verifyException("wheel.util.DynamicSelectModel", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCollectionWithNull() throws Throwable  {
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      try {
      dynamicSelectModel.collection(null);
      fail("Expecting exception: RuntimeException");
      } catch (RuntimeException e) {
      // Expression null evaluated to null. Can't build a dynamic ISelectModel
      verifyException("wheel.util.DynamicSelectModel", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTranslateValue() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel collection = dynamicSelectModel.collection("[]rfBom ");
      Object arg0 = new Object();
      DynamicSelectModel empty = collection.empty(arg0);
      collection.value("[]rfBom ");
      DynamicSelectModel value = empty.value("[]rfBom ");
      value.translateValue("org.mvel.util.FastList@0000000042");
      ElExpression elExpression = new ElExpression("org.mvel.util.FastList@0000000042");
      Object translateValue = empty.translateValue("org.mvel.util.FastList@0000000042");
      assertSame(arg0, translateValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTranslator() throws Throwable  {
      // Given an empty collection
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel collection = dynamicSelectModel.collection("[]rfBom ");
      Object arg0 = new Object();
      DynamicSelectModel empty = collection.empty(arg0);
      
      // When we translate an empty value
      DynamicSelectModel value = collection.value("[]rfBom ");
      DynamicSelectModel translator = value.translator("[]rfBom ");
      translator.translateValue("org.mvel.util.FastList@0000000042");
      
      // Then the translated value should be an empty list
      ElExpression elExpression = new ElExpression("org.mvel.util.FastList@0000000042");
      FastList translateValue = (FastList)empty.translateValue("org.mvel.util.FastList@0000000042");
      assertEquals(0, translateValue.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLabel() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel label = dynamicSelectModel.label("org.mvel.conversion.IntegerCH");
      dynamicSelectModel.collection("org.mvel.conversion.IntegerCH");
      // Undeclared exception!
      try { 
        label.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateDynamicSelectModelTaking3ArgumentsThrowsRuntimeException() throws Throwable  {
      // Given
      ElExpression collectionAttribute = new ElExpression("org.mvel.util.FastList@0000000042");
      
      // When
      DynamicSelectModel dynamicSelectModel = null;
      try {
      dynamicSelectModel = new DynamicSelectModel(collectionAttribute, collectionAttribute, collectionAttribute);
      } catch (RuntimeException e) {
      // Then
      verifyException("wheel.util.DynamicSelectModel", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTopLevelComponentReturningNull() throws Throwable  {
      // Given a DynamicSelectModel instance, we want to verify that the top-level component is null
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      StandaloneComponent topLevelComponent = dynamicSelectModel.getTopLevelComponent();
      assertNull(topLevelComponent);
      
      // When we retrieve the top-level component
      StandaloneComponent actualTopLevelComponent = dynamicSelectModel.getTopLevelComponent();
      
      // Then we expect it to be null
      assertNull(actualTopLevelComponent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetComponent() throws Throwable  {
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      ErrorPage arg0 = new ErrorPage();
      // Given: A DynamicSelectModel and an ErrorPage object
      
      dynamicSelectModel.setComponent(arg0);
      ErrorPage component = (ErrorPage)dynamicSelectModel.getComponent();
      // When: Setting the ErrorPage as a component of the DynamicSelectModel
      
      assertEquals("div", component.defaultTagName());
      // Then: The default tag name for the component is "div"
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReset() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      dynamicSelectModel.reset();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetComponentReturningNull() throws Throwable  {
      // Given: A DynamicSelectModel with no data
      DynamicSelectModel model = new DynamicSelectModel();
      
      // When: Getting the component from the model
      Component component = model.getComponent();
      
      // Then: The component should be null
      assertNull(component);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnumeration() throws Throwable  {
      // rollbacked to evosuite
      DynamicSelectModel dynamicSelectModel = new DynamicSelectModel();
      DynamicSelectModel enumeration = dynamicSelectModel.enumeration("wheel.Asset$AssetType");
      Collection objects = enumeration.getObjects();
      assertNotNull(objects);
  }
}
