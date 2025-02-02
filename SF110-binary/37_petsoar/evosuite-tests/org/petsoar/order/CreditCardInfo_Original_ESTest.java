/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 05:55:52 GMT 2024
 */

package org.petsoar.order;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;
import org.petsoar.order.CreditCardInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CreditCardInfo_Original_ESTest extends CreditCardInfo_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCreditCardNumberReturningNonEmptyString() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCreditCardNumber("Invalid cardType");
      String creditCardNumber = creditCardInfo.getCreditCardNumber();
      assertEquals("Invalid cardType", creditCardNumber);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCardTypeThrowsIllegalArgumentException() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      // Undeclared exception!
      try { 
        creditCardInfo.setCardType("Invalid cardType");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid cardType
         //
         verifyException("org.petsoar.order.CreditCardInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCardTypeWithNonEmptyString() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCardType("American Express");
      assertEquals("American Express", creditCardInfo.getCardType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCardTypeReturningNonEmptyString() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCardType("Visa");
      String cardType = creditCardInfo.getCardType();
      assertEquals("Visa", cardType);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCardTypeWithNull() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCardType((String) null);
      assertEquals("Unknown", creditCardInfo.getCardType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesCreditCardInfo() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCardType("Master Card");
      assertEquals("Master Card", creditCardInfo.getCardType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCardTypeReturningNull() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      String cardType = creditCardInfo.getCardType();
      assertNull(cardType);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExpirationDateReturningNull() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      Date expirationDate = creditCardInfo.getExpirationDate();
      assertNull(expirationDate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCreditCardNumberReturningNull() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      String creditCardNumber = creditCardInfo.getCreditCardNumber();
      assertNull(creditCardNumber);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCreditCardNumberReturningEmptyString() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      creditCardInfo.setCreditCardNumber("");
      String creditCardNumber = creditCardInfo.getCreditCardNumber();
      assertEquals("", creditCardNumber);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetExpirationDate() throws Throwable  {
      CreditCardInfo creditCardInfo = new CreditCardInfo();
      MockDate arg0 = new MockDate((-1));
      creditCardInfo.setExpirationDate(arg0);
      Date expirationDate = creditCardInfo.getExpirationDate();
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", expirationDate.toString());
  }
}
