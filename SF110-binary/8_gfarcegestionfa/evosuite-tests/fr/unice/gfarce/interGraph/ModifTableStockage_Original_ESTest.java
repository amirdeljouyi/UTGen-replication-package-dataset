/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 13 15:55:15 GMT 2024
 */

package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.ModifTableStockage;
import fr.unice.gfarce.interGraph.TableStockage;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModifTableStockage_Original_ESTest extends ModifTableStockage_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSelectMailThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.selectMail();
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
  public void testFusionnerColonnesThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.fusionnerColonnes((-1));
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
  public void testColonneMailAndSupprimerColonne() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      TableStockage colonneMail = modifTableStockage.colonneMail();
      assertEquals(0, colonneMail.getRowCount());
      
      TableStockage supprimerColonne = modifTableStockage.supprimerColonne(0);
      assertEquals(0, supprimerColonne.getColumnCount());
      assertEquals(0, supprimerColonne.getRowCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAjouterLigne() throws Throwable  {
      TableStockage arg0 = new TableStockage(57, 57);
      Class<Object> arg1 = Object.class;
      arg0.setColumnClass(0, arg1);
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      TableStockage ajouterLigne = modifTableStockage.ajouterLigne();
      assertEquals(57, ajouterLigne.getColumnCount());
      assertEquals(57, ajouterLigne.getRowCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAjouterLigneThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.ajouterLigne();
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
  public void testAjouterColonne() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      Class<Boolean> arg1 = Boolean.class;
      TableStockage ajouterColonne = modifTableStockage.ajouterColonne("fr.unice.gfarce.interGraph.TableStockage", arg1);
      assertEquals(0, ajouterColonne.getRowCount());
      assertEquals(1, ajouterColonne.getColumnCount());
  }
}
