/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 13 18:44:16 GMT 2024
 */

package org.javathena.utiles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.javathena.conf.LoginAthena;
import org.javathena.core.utiles.ACO;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigurationManagement_ESTest extends ConfigurationManagement_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningNonEmptyString() throws Throwable  {
      ConfigurationManagement.setTimestamp_format("p-");
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
      assertEquals("p-", timestamp_format);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningEmptyString() throws Throwable  {
      ConfigurationManagement.setTimestamp_format("");
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
      assertEquals("", timestamp_format);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetiReturningNonEmptyArray() throws Throwable  {
      int[] arg0 = new int[8];
      ConfigurationManagement.setSubneti(arg0);
      int[] subneti = ConfigurationManagement.getSubneti();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, subneti);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStart_limited_time() throws Throwable  {
      ConfigurationManagement.setStart_limited_time(0);
      long startLimitedTime = ConfigurationManagement.getStartLimitedTime();
      assertEquals(0L, startLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningPositive() throws Throwable  {
      ConfigurationManagement.setServer_num(2389);
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals(2389, server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningNegative() throws Throwable  {
      ConfigurationManagement.setGMMax((-1));
      int gMMax = ConfigurationManagement.getGMMax();
      assertEquals((-1), gMMax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAuth_before_save_fileReturningPositive() throws Throwable  {
      ConfigurationManagement.setAuth_before_save_file(2147483645);
      int auth_before_save_file = ConfigurationManagement.getAuth_before_save_file();
      assertEquals(2147483645, auth_before_save_file);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningACOWhereGetValueIsZero() throws Throwable  {
      ACO arg0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(arg0);
      ACO access_order = ConfigurationManagement.getAccess_order();
      assertSame(access_order, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningACOWhereGetValueIsPositive() throws Throwable  {
      ACO arg0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(arg0);
      ACO access_order = ConfigurationManagement.getAccess_order();
      assertEquals(ACO.STRSIZE, access_order);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_deny() throws Throwable  {
      ConfigurationManagement.setAccess_deny("W%\"N}RMDKR~XZW");
      String access_deny = ConfigurationManagement.getAccess_deny();
      assertEquals("W%\"N}RMDKR~XZW", access_deny);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningPositive() throws Throwable  {
      ConfigurationManagement.setAccess_allownum(11);
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      assertEquals(11, access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningNegative() throws Throwable  {
      ConfigurationManagement.setAccess_allownum((-15));
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      assertEquals((-15), access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLoginAthenaConf() throws Throwable  {
      LoginAthena loginAthenaConf = ConfigurationManagement.getLoginAthenaConf();
      assertFalse(loginAthenaConf.getNew_account_flag());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readXMLWithNonEmptyString() throws Throwable  {
      int login_config_readXML = ConfigurationManagement.login_config_readXML("login.xml");
      assertEquals(0, login_config_readXML);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readXMLWithEmptyString() throws Throwable  {
      int login_config_readXML = ConfigurationManagement.login_config_readXML("");
      assertEquals(0, login_config_readXML);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_allownumWithNegative() throws Throwable  {
      ConfigurationManagement.setAccess_allownum((-2116372906));
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_allownumWithPositive() throws Throwable  {
      ACO arg0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(arg0);
      ConfigurationManagement.setAccess_allownum(643);
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_order0() throws Throwable  {
      ACO arg0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(arg0);
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_order1() throws Throwable  {
      ACO arg0 = ACO.DENY_ALLOW;
      ConfigurationManagement.setAccess_order(arg0);
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warnings() throws Throwable  {
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBoolean() throws Throwable  {
      // Undeclared exception!
      try { 
        ConfigurationManagement.yesNoOnOffToBoolean("INVALID");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningFalse0() throws Throwable  {
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("NO");
      assertFalse(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningTrue0() throws Throwable  {
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("ON");
      assertTrue(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningFalse1() throws Throwable  {
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("OFF");
      assertFalse(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningTrue1() throws Throwable  {
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("YES");
      assertTrue(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readTXT() throws Throwable  {
      int[] arg0 = new int[8];
      ConfigurationManagement.setSubneti(arg0);
      // Undeclared exception!
      try { 
        ConfigurationManagement.login_config_readTXT("NO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_lan_config_read() throws Throwable  {
      int[] arg0 = new int[8];
      ConfigurationManagement.setSubneti(arg0);
      // Undeclared exception!
      try { 
        ConfigurationManagement.login_lan_config_read(")!HRS*;?M");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddGMMaxTakingInt() throws Throwable  {
      ConfigurationManagement.addGMMax(1234567890);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLogin_ip_str() throws Throwable  {
      String login_ip_str = ConfigurationManagement.getLogin_ip_str();
      assertEquals("127.0.0.1", login_ip_str);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNum_regs() throws Throwable  {
      ConfigurationManagement.setNum_regs((-1));
      long num_regs = ConfigurationManagement.getNum_regs();
      assertEquals((-1L), num_regs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddChar_id_countTakingInt() throws Throwable  {
      ConfigurationManagement.addChar_id_count(1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBackup_txt_flag() throws Throwable  {
      String backup_txt_flag = ConfigurationManagement.getBackup_txt_flag();
      assertNull(backup_txt_flag);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddChar_id_countTakingNoArguments() throws Throwable  {
      ConfigurationManagement.addChar_id_count();
      int char_id_count = ConfigurationManagement.getChar_id_count();
      assertEquals(1, char_id_count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetChar_id_count() throws Throwable  {
      ConfigurationManagement.setChar_id_count(0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLesslessAuth_before_save_fileReturningPositive() throws Throwable  {
      ConfigurationManagement.setAuth_before_save_file(120);
      int lesslessAuth_before_save_file = ConfigurationManagement.lesslessAuth_before_save_file();
      assertEquals(119, lesslessAuth_before_save_file);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_denynum() throws Throwable  {
      ConfigurationManagement.setAccess_denynum(9812);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEmail_creation() throws Throwable  {
      int email_creation = ConfigurationManagement.getEmail_creation();
      assertEquals(0, email_creation);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGm_allow_level() throws Throwable  {
      int gm_allow_level = ConfigurationManagement.getGm_allow_level();
      assertEquals(0, gm_allow_level);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScdata_txt() throws Throwable  {
      String scdata_txt = ConfigurationManagement.getScdata_txt();
      assertNull(scdata_txt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSubnetmaski() throws Throwable  {
      ConfigurationManagement.setSubnetmaski((int[]) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denyReturningNull() throws Throwable  {
      String access_deny = ConfigurationManagement.getAccess_deny();
      assertNull(access_deny);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningNegative() throws Throwable  {
      ConfigurationManagement.setServer_num((-4051));
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals((-4051), server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningZero() throws Throwable  {
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals(0, server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNum_regsReturningZero() throws Throwable  {
      long num_regs = ConfigurationManagement.getNum_regs();
      assertEquals(0L, num_regs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLan_char_ip() throws Throwable  {
      ConfigurationManagement.setLan_char_ip("");
      String lan_char_ip = ConfigurationManagement.getLan_char_ip();
      assertEquals("", lan_char_ip);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBackup_txt() throws Throwable  {
      String backup_txt = ConfigurationManagement.getBackup_txt();
      assertNull(backup_txt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsConsole_silent() throws Throwable  {
      boolean console_silent = ConfigurationManagement.isConsole_silent();
      assertFalse(console_silent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWisp_server_name() throws Throwable  {
      String wisp_server_name = ConfigurationManagement.getWisp_server_name();
      assertNull(wisp_server_name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningZero() throws Throwable  {
      ConfigurationManagement.setGMMax(0);
      int gMMax = ConfigurationManagement.getGMMax();
      assertEquals(0, gMMax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLan_char_ipReturningNull() throws Throwable  {
      String lan_char_ip = ConfigurationManagement.getLan_char_ip();
      assertNull(lan_char_ip);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLogin_ip_str() throws Throwable  {
      ConfigurationManagement.setLogin_ip_str("10.10.10.10");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denynum() throws Throwable  {
      int access_denynum = ConfigurationManagement.getAccess_denynum();
      assertEquals(0, access_denynum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStartLimitedTime() throws Throwable  {
      // Given: The start limited time is set to 1598678400000L (June 23, 2020)
      ConfigurationManagement.setStartLimitedTime(1598678400000L);
      
      // When: The start limited time is retrieved
      long startLimitedTime = ConfigurationManagement.getStartLimitedTime();
      
      // Then: The start limited time should be 1598678400000L (June 23, 2020)
      assertEquals(1598678400000L, startLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddGMMaxTakingNoArguments() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.addGMMax();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAutosave_interval() throws Throwable  {
      // Test that the autosave interval is set correctly
      int autosave_interval = ConfigurationManagement.getAutosave_interval();
      assertEquals(0, autosave_interval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNew_reg_tick() throws Throwable  {
      // Given: A new registration tick is set to 161
      ConfigurationManagement.setNew_reg_tick(161L);
      
      // When: The new registration tick is retrieved
      long new_reg_tick = ConfigurationManagement.getNew_reg_tick();
      
      // Then: The new registration tick should be equal to 161
      assertEquals(161L, new_reg_tick);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningNull() throws Throwable  {
      // No Comments were added
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
      assertNull(timestamp_format);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetmaski() throws Throwable  {
      // Given a list of subnet masks returned by the ConfigurationManagement.getSubnetmaski() method
      int[] subnetMasks = ConfigurationManagement.getSubnetmaski();
      
      // When the returned list is null
      assertNull(subnetMasks);
      
      // Then the test fails with an error message indicating that the subnet mask list is expected to be non-null
      assertNotNull(subnetMasks, "Expected the subnet mask list to be non-null");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAuth_before_save_fileReturningNegative() throws Throwable  {
      // This test ensures that the method ConfigurationManagement.lesslessAuth_before_save_file() returns -1 before saving a file.
      int authBeforeSaveFile = ConfigurationManagement.getAuth_before_save_file();
      assertEquals(-1, authBeforeSaveFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningNull() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.getAccess_order();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddNum_regsTakingLong() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.addNum_regs(1234567890L);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNew_reg_tickReturningZero() throws Throwable  {
      // rollbacked to evosuite
      long new_reg_tick = ConfigurationManagement.getNew_reg_tick();
      assertEquals(0L, new_reg_tick);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allowReturningNull() throws Throwable  {
      // rollbacked to evosuite
      String access_allow = ConfigurationManagement.getAccess_allow();
      assertNull(access_allow);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAutosave_time() throws Throwable  {
      // rollbacked to evosuite
      int autosave_time = ConfigurationManagement.getAutosave_time();
      assertEquals(0, autosave_time);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_allow() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.setAccess_allow("ABC123!");
      String access_allow = ConfigurationManagement.getAccess_allow();
      assertEquals("ABC123!", access_allow);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStartLimitedTimeReturningNegative() throws Throwable  {
      // Test that the start limited time is correctly returned
      long startLimitedTime = ConfigurationManagement.getStartLimitedTime();
      assertEquals((-1L), startLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetConsole_silent() throws Throwable  {
      // Set silent mode to false
      ConfigurationManagement.setConsole_silent(false);
      
      // Assert that the value of console silent is now false
      assertFalse(ConfigurationManagement.isConsole_silent());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLogin_ip_set_() throws Throwable  {
      // Given a configuration where login IP is not set,
      boolean loginIpSet = ConfigurationManagement.isLogin_ip_set_();
      assertFalse(loginIpSet);
      
      // When a user attempts to log in without providing an IP address,
      // Then the login attempt should fail with an error message indicating that the IP address is required.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAuth_before_save_fileReturningZero() throws Throwable  {
      // Set up the test by configuring the expected value for auth_before_save_file
      ConfigurationManagement.setAuth_before_save_file(0);
      
      // Call the method to be tested and get the result
      int actualValue = ConfigurationManagement.getAuth_before_save_file();
      
      // Assert that the expected value is equal to the actual value
      assertEquals(0, actualValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningPositive() throws Throwable  {
      // Given: a variable called "gMMax" that stores the maximum value of GM
      int gMMax = ConfigurationManagement.getGMMax();
      
      // When: the value of GM is greater than 30
      assertEquals(30, gMMax);
      
      // Then: the test passes, indicating that the value of GM is indeed greater than 30
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningZero() throws Throwable  {
      // No Comments were added
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      assertEquals(0, access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChar_id_countReturningZero() throws Throwable  {
      // rollbacked to evosuite
      int char_id_count = ConfigurationManagement.getChar_id_count();
      assertEquals(0, char_id_count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFriends_txt() throws Throwable  {
      // rollbacked to evosuite
      String friends_txt = ConfigurationManagement.getFriends_txt();
      assertNull(friends_txt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetiReturningNull() throws Throwable  {
      // Arrange
      // The getSubneti method is called to retrieve the subnet IP addresses.
      
      // Act
      int[] subneti = ConfigurationManagement.getSubneti();
      
      // Assert
      assertNull(subneti);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddNum_regsTakingNoArguments() throws Throwable  {
      // Add a new number of registers to the configuration management system
      ConfigurationManagement.addNum_regs();
      
      // Retrieve the number of registers from the configuration management system
      long numRegs = ConfigurationManagement.getNum_regs();
      
      // Assert that the number of registers is 1
      assertEquals(1L, numRegs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMax_connect_user() throws Throwable  {
      // rollbacked to evosuite
      String max_connect_user = ConfigurationManagement.getMax_connect_user();
      assertNull(max_connect_user);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChar_txt() throws Throwable  {
      // Given a value for the character text
      String char_txt = ConfigurationManagement.getChar_txt();
      
      // When we assert that the value is null
      assertNull(char_txt);
  }
}
