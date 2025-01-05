/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 14 15:27:22 GMT 2024
 */

package net.virtualinfinity.atrobots.gui.renderers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.LinkedHashSet;
import java.util.Set;
import net.virtualinfinity.atrobots.gui.renderers.RobotRenderer;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RobotRenderer_Original_ESTest extends RobotRenderer_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetShowStatusBars() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      assertTrue(robotRenderer.isShowStatusBars());
      
      robotRenderer.setShowStatusBars(false);
      boolean showStatusBars = robotRenderer.isShowStatusBars();
      assertFalse(showStatusBars);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsRenderDeadReturningFalse() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      assertTrue(robotRenderer.isRenderDead());
      
      robotRenderer.setRenderDead(false);
      robotRenderer.isRenderDead();
      assertTrue(robotRenderer.isShowStatusBars());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsRenderDeadReturningTrue() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      boolean renderDead = robotRenderer.isRenderDead();
      assertTrue(robotRenderer.isShowName());
      assertTrue(robotRenderer.isShowStatusBars());
      assertTrue(robotRenderer.isFillShield());
      assertTrue(renderDead);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsShowStatusBarsReturningTrue() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      boolean showStatusBars = robotRenderer.isShowStatusBars();
      assertTrue(showStatusBars);
      assertTrue(robotRenderer.isRenderDead());
      assertTrue(robotRenderer.isShowName());
      assertTrue(robotRenderer.isFillShield());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRender() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      assertTrue(robotRenderer.isRenderDead());
      
      Graphics2D arg0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RobotSnapshot arg1 = new RobotSnapshot();
      arg1.setDead(true);
      robotRenderer.setRenderDead(false);
      assertFalse(robotRenderer.isRenderDead());
      
      LinkedHashSet<Integer> arg2 = new LinkedHashSet<Integer>();
      robotRenderer.render(arg0, arg1, (Set<Integer>) arg2);
      assertTrue(robotRenderer.isShowStatusBars());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsFillShieldReturningTrue() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      boolean fillShield = robotRenderer.isFillShield();
      assertTrue(fillShield);
      assertTrue(robotRenderer.isRenderDead());
      assertTrue(robotRenderer.isShowStatusBars());
      assertTrue(robotRenderer.isShowName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderThrowsNullPointerException() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      robotRenderer.setRenderDead(false);
      Graphics2D arg0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn((Stroke) null).when(arg0).getStroke();
      RobotSnapshot arg1 = new RobotSnapshot();
      LinkedHashSet<Integer> arg2 = new LinkedHashSet<Integer>();
      // Undeclared exception!
      try { 
        robotRenderer.render(arg0, arg1, (Set<Integer>) arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetFillShield() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      assertTrue(robotRenderer.isFillShield());
      
      robotRenderer.setFillShield(false);
      boolean fillShield = robotRenderer.isFillShield();
      assertFalse(fillShield);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetShowName() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      assertTrue(robotRenderer.isShowName());
      
      robotRenderer.setShowName(false);
      boolean showName = robotRenderer.isShowName();
      assertFalse(showName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsShowNameReturningTrue() throws Throwable  {
      RobotRenderer robotRenderer = new RobotRenderer();
      boolean showName = robotRenderer.isShowName();
      assertTrue(showName);
      assertTrue(robotRenderer.isShowStatusBars());
      assertTrue(robotRenderer.isFillShield());
      assertTrue(robotRenderer.isRenderDead());
  }
}
