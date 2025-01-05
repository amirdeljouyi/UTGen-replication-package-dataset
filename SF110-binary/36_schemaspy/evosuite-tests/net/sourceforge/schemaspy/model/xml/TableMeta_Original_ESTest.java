/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 05:35:45 GMT 2024
 */

package net.sourceforge.schemaspy.model.xml;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import net.sourceforge.schemaspy.model.xml.TableMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TableMeta_Original_ESTest extends TableMeta_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNull() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode(" remotdeCatalog: ");
      arg0.setAttribute("name", (String) null);
      TableMeta tableMeta = new TableMeta(arg0);
      String name = tableMeta.getName();
      assertNull(name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNonEmptyString() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String name = tableMeta.getName();
      assertEquals("name", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentsReturningNonEmptyString() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      arg0.setAttribute("remarks", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String comments = tableMeta.getComments();
      assertEquals("name", comments);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      List<TableColumnMeta> columns = tableMeta.getColumns();
      assertTrue(columns.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteCatalogReturningNonEmptyString() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("remoteCatalog", "wt&Afq?nJx#KO|cJR4");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String remoteCatalog = tableMeta.getRemoteCatalog();
      assertEquals("wt&Afq?nJx#KO|cJR4", remoteCatalog);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteSchemaReturningNonEmptyString() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttributeNS("name", "name", "name");
      arg0.setAttribute("remoteSchema", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String remoteSchema = tableMeta.getRemoteSchema();
      assertEquals("name", remoteSchema);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTableMeta() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      arg0.setAttribute("remarks", "");
      TableMeta tableMeta = new TableMeta(arg0);
      assertEquals("name", tableMeta.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateTableMetaThrowsNullPointerException() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode();
      arg0.setAttribute("name", "name");
      arg0.setAttribute("comments", "name");
      TableMeta tableMeta = null;
      try {
        tableMeta = new TableMeta(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteSchemaReturningNull() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttributeNS("name", "name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String remoteSchema = tableMeta.getRemoteSchema();
      assertNull(remoteSchema);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteCatalogReturningNull() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("column");
      arg0.setAttribute("name", "o~");
      TableMeta tableMeta = new TableMeta(arg0);
      String remoteCatalog = tableMeta.getRemoteCatalog();
      assertNull(remoteCatalog);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnsReturningListWhereIsEmptyIsFalse() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("column");
      arg0.setAttribute("name", "o~");
      TableMeta tableMeta = new TableMeta(arg0);
      List<TableColumnMeta> columns = tableMeta.getColumns();
      assertEquals(1, columns.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningEmptyString() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "");
      TableMeta tableMeta = new TableMeta(arg0);
      String name = tableMeta.getName();
      assertEquals("", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentsReturningNull() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode("column");
      arg0.setAttribute("name", "o~");
      TableMeta tableMeta = new TableMeta(arg0);
      String comments = tableMeta.getComments();
      assertNull(comments);
  }
}
