/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 07:42:51 GMT 2024
 */

package ghm.follow.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.config.FollowAppAttributes;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.TabbedPane;
import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TabbedPane_Original_ESTest extends TabbedPane_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectedComponent() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.addTab("ghm.follow.gui.TabbedPane", (Icon) null, (Component) null);
      tabbedPane.setSelectedComponent((FileFollowingPane) null);
      assertFalse(tabbedPane.isFocusTraversalPolicyProvider());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveTabAt() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.addTab((String) null, (Component) null);
      tabbedPane.removeTabAt(0);
      assertTrue(tabbedPane.getFocusTraversalKeysEnabled());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningComponentWhereGetIgnoreRepaintIsTrue() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.setBounds(2, 7, 4, 7);
      tabbedPane.setIgnoreRepaint(true);
      Component findComponentAt = tabbedPane.findComponentAt(1, 6);
      assertSame(tabbedPane, findComponentAt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtThrowsIndexOutOfBoundsException() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.setBounds(2, 7, 4, 7);
      tabbedPane.add("bufferSize", (Component) null);
      tabbedPane.setTabLayoutPolicy(1);
      // Undeclared exception!
      try { 
        tabbedPane.findComponentAt(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningNull() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      Component findComponentAt = tabbedPane.findComponentAt(5, 7);
      assertNull(findComponentAt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningComponentWhereGetIgnoreRepaintIsFalse() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.setBounds(2, 7, 4, 7);
      Component findComponentAt = tabbedPane.findComponentAt(0, 0);
      assertSame(tabbedPane, findComponentAt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectedIndexThrowsIndexOutOfBoundsException() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes((File) null);
      TabbedPane tabbedPane = new TabbedPane(arg0);
      // Undeclared exception!
      try { 
        tabbedPane.setSelectedIndex(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Tab count: 0
         //
         verifyException("javax.swing.JTabbedPane", e);
      }
  }
}
