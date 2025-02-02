/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 23:42:20 GMT 2024
 */

package net.kencochrane.a4j.file;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileUtil_Original_ESTest extends FileUtil_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFileWithNonEmptyString() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("/", "/");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems0() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.createFolder(arg0);
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("&On@:G+R", "&On@:G+R");
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFile0() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.createFolder(arg0);
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessories0() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.createFolder(arg0);
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertNull(fetchAccessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFile0() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      FileSystemHandling.createFolder(arg0);
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertNull(fetchASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadGenericSearchFileWithEmptyString() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      File downloadGenericSearchFile = fileUtil.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(downloadGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereLengthIsZero() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.createFolder(arg0);
      FileSystemHandling.setPermissions(arg0, false, false, false);
      FileUtil fileUtil = new FileUtil();
      File similarItems = fileUtil.getSimilarItems("&On@:G+R", "&On@:G+R");
      assertFalse(similarItems.canExecute());
      assertNotNull(similarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningFileWhereLengthIsPositive() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.appendStringToFile(arg0, "cacheDir");
      FileUtil fileUtil = new FileUtil();
      File browseNodeFile = fileUtil.getBrowseNodeFile("edm(S", "edm(S", "");
      assertNotNull(browseNodeFile);
      assertEquals(8L, browseNodeFile.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningFileWhereLengthIsZero() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(arg0);
      File browseNodeFile = fileUtil.getBrowseNodeFile("", "", "");
      assertNotNull(browseNodeFile);
      assertEquals("/__.XML", browseNodeFile.toString());
      assertFalse(browseNodeFile.isFile());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningFileWhereLengthIsZero() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.createFolder(arg0);
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileUtil fileUtil = new FileUtil();
      File accessories = fileUtil.getAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertNotNull(accessories);
      assertFalse(accessories.isFile());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsPositive() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/___.XML");
      byte[] arg1 = new byte[7];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("", "", "", "");
      assertNotNull(aSINFile);
      assertEquals(7L, aSINFile.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertEquals(0, fetchBNFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessoriesReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertEquals(0, fetchAccessories.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      FileSystemHandling.appendStringToFile(arg0, "p");
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertEquals(1, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadOneASINFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      boolean downloadOneASINFile = fileUtil.downloadOneASINFile("&Hmac=", "1", "&Hmac=", "http://xml.amazon.net/onca/xml3", (String) null);
      assertFalse(downloadOneASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBrowseNodeFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      boolean downloadBrowseNodeFile = fileUtil.downloadBrowseNodeFile("3U{_;je*z|lZfm'", "offerstatus=", "pA~ee", "offerstatus=");
      assertFalse(downloadBrowseNodeFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadSimilaritesFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=ShoppingCart=clear&f=xml&dev-t=&type=lite&offerpage=ShoppingCart=clear&f=xml&dev-t=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      boolean downloadSimilaritesFile = fileUtil.downloadSimilaritesFile("ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      assertFalse(downloadSimilaritesFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereLengthIsPositive() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.appendLineToFile(arg0, "$k~$o~XWg/WbFbQYc~");
      File similarItems = fileUtil.getSimilarItems("&On@:G+R", ";o(]-aZ+");
      assertNotNull(similarItems);
      assertEquals(19L, similarItems.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningFileWhereLengthIsPositive() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.appendLineToFile(arg0, "@W!m]T+uz?5@2b@t ");
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<Object>();
      File accessories = fileUtil.getAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertNotNull(accessories);
      assertEquals(18L, accessories.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningNull() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<Object>();
      File accessories = fileUtil.getAccessories("TG7VZ*iQ/E.jecA$`", arg1);
      assertNull(accessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadGenericSearchFileWithNonEmptyString() throws Throwable  {
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&S`y!CS/',@3KwR;!{(JP=%26On%40%3AG%2BR&mode=S`y!CS/',@3KwR;!{(JP&type=S`y!CS/',@3KwR;!{(JP&page=5_2LOI&offer=5_2LOI&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "&On@:G+R");
      FileUtil fileUtil = new FileUtil();
      File downloadGenericSearchFile = fileUtil.downloadGenericSearchFile("S`y!CS/',@3KwR;!{(JP", "&On@:G+R", "S`y!CS/',@3KwR;!{(JP", "S`y!CS/',@3KwR;!{(JP", "5_2LOI", "5_2LOI");
      assertNull(downloadGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningNull() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      File browseNodeFile = fileUtil.getBrowseNodeFile("", "", "");
      assertNull(browseNodeFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningNull() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("offerpage=", "offerpage=", "offerpage=", "offerpage=");
      assertNull(aSINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadCart() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      File downloadCart = fileUtil.downloadCart("`q=");
      assertNull(downloadCart);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningNull() throws Throwable  {
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=all&type=lite&offerpage=all&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "XrrIo,;tjPW");
      FileUtil fileUtil = new FileUtil();
      File similarItems = fileUtil.getSimilarItems("all", "all");
      assertNull(similarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItemsReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.appendLineToFile(arg0, "$k~$o~XWg/WbFbQYc~");
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("&On@:G+R", "&On@:G+R");
      assertEquals(19, fetchSimilarItems.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems1() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("B7-&jM=l5Cx", "+0=x22");
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessoriesReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.appendLineToFile(arg0, "@W!m]T+uz?5@2b@t ");
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertEquals(18, fetchAccessories.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessories1() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertNull(fetchAccessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchThirdPartySearchFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchThirdPartySearchFile = fileUtil.fetchThirdPartySearchFile("^54q", (String) null, (String) null, "");
      assertNull(fetchThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadThirdPartySearchFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=ShoppingCart=clear&f=xml&dev-t=&type=edm(S&page=ShoppingCart=clear&f=xml&dev-t=&offerstatus=ShoppingCart=clear&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      File downloadThirdPartySearchFile = fileUtil.downloadThirdPartySearchFile("ShoppingCart=clear&f=xml&dev-t=", "edm(S", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(downloadThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchGenericSearchFile() throws Throwable  {
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&@E!<H]Tuz?_d>5@2b@t =%40E%21%3CH%5DTuz%3F_d%3E5%402b%40t+&mode=&type=&page=@E!<H]Tuz?_d>5@2b@t &offer=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "@E!<H]Tuz?_d>5@2b@t ");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchGenericSearchFile = fileUtil.fetchGenericSearchFile("@E!<H]Tuz?_d>5@2b@t ", "@E!<H]Tuz?_d>5@2b@t ", "", "", "@E!<H]Tuz?_d>5@2b@t ", "");
      assertNull(fetchGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchKeywordSearchFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchKeywordSearchFile = fileUtil.fetchKeywordSearchFile("ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(fetchKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBlendedSearchFile() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBlendedSearchFile = fileUtil.fetchBlendedSearchFile("amazonServerURL", "amazonServerURL");
      assertNull(fetchBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadKeywordSearchFile() throws Throwable  {
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=09%60%29W%24VM%296%3F0%26%3A5%7B&mode=09`)W$VM)6?0&:5{&type=09`)W$VM)6?0&:5{&page=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "09`)W$VM)6?0&:5{");
      FileUtil fileUtil = new FileUtil();
      File downloadKeywordSearchFile = fileUtil.downloadKeywordSearchFile("09`)W$VM)6?0&:5{", "09`)W$VM)6?0&:5{", "09`)W$VM)6?0&:5{", "");
      assertNull(downloadKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBlendedSearchFile() throws Throwable  {
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "@E!<H]Tuz?_d>5@2b@t ");
      FileUtil fileUtil = new FileUtil();
      File downloadBlendedSearchFile = fileUtil.downloadBlendedSearchFile("", "");
      assertNull(downloadBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFile1() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=edm(S&mode=edm(S&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "edm(S");
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertEquals(0, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsZero() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/OFFERPAGE=_OFFERPAGE=_OFFERPAGE=_OFFERPAGE=.XML");
      FileSystemHandling.createFolder(arg0);
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("offerpage=", "offerpage=", "offerpage=", "offerpage=");
      assertFalse(aSINFile.isFile());
      assertNotNull(aSINFile);
      assertEquals("/OFFERPAGE=_OFFERPAGE=_OFFERPAGE=_OFFERPAGE=.XML", aSINFile.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFileWithEmptyString() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("k4P_4uo", "");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.appendLineToFile(arg0, "");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertEquals(1, fetchBNFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAgeGood() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      boolean ageGood = fileUtil.isAgeGood((File) null);
      assertFalse(ageGood);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithNonEmptyString() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("http://xml.amazon.net/onca/xml3");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithEmptyString() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFile1() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=[Q{xwl[fs-&type=[Q{xwl[fs-&offerpage=edm(S&offer=[Q{xwl[fs-&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertNull(fetchASINFile);
  }
}
