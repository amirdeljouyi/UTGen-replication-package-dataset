/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 11 23:42:18 GMT 2024
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
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFile0() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("/", "/");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems0() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      // Create a folder with the given name
      FileSystemHandling.createFolder(arg0);
      
      // Fetch similar items for the given input and output strings
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("&On@:G+R", "&On@:G+R");
      
      // Verify that the fetched items are null, as there are no similar items found in the test data
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFile0() throws Throwable  {
      // Create a new EvoSuiteFile object and set its path to "/EDM(S_EDM(S_.XML"
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      
      // Call the createFolder method of FileSystemHandling class with the EvoSuiteFile object as argument
      FileSystemHandling.createFolder(arg0);
      
      // Create a new FileUtil object and fetch the BN file named "edm(S" from the current directory
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      
      // Assert that the returned value is null
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessories0() throws Throwable  {
      // No Comments were added
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
      // Setup
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      FileSystemHandling.createFolder(arg0);
      
      // Action
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      
      // Verification
      assertNull(fetchASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadGenericSearchFileWithEmptyString() throws Throwable  {
      // Create a new instance of the FileUtil class
      FileUtil fileUtil = new FileUtil();
      
      // Invoke the downloadGenericSearchFile method with dummy values for all parameters
      File downloadGenericSearchFile = fileUtil.downloadGenericSearchFile("", "", "", "", "", "");
      
      // Assert that the returned value is null
      assertNull(downloadGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereLengthIsZero() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.createFolder(arg0);
      FileSystemHandling.setPermissions(arg0, false, false, false);
      FileUtil fileUtil = new FileUtil();
      File similarItems = fileUtil.getSimilarItems("&On@:G+R", "&On@:G+R");
      assertNotNull(similarItems);
      assertEquals("S_&ON@:G+R.XML", similarItems.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningFileWhereLengthIsPositive() throws Throwable  {
      // rollbacked to evosuite
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
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(arg0);
      File browseNodeFile = fileUtil.getBrowseNodeFile("", "", "");
      assertNotNull(browseNodeFile);
      assertTrue(browseNodeFile.canExecute());
      assertEquals("__.XML", browseNodeFile.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningFileWhereLengthIsZero() throws Throwable  {
      // Set up a new EvoSuiteFile object with a valid path
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      
      // Call the createFolder method on the FileSystemHandling class to create a folder at the specified path
      FileSystemHandling.createFolder(arg0);
      
      // Set up an ArrayList object to hold data for testing purposes
      ArrayList<Object> arg1 = new ArrayList<Object>();
      
      // Create a new FileUtil object and use its getAccessories method to retrieve accessory files for the given path
      FileUtil fileUtil = new FileUtil();
      File accessories = fileUtil.getAccessories("@W!m]T+uz?5@2b@t ", arg1);
      
      // Assert that the accessories variable is not null and that it can be written to
      assertNotNull(accessories);
      assertTrue(accessories.canWrite());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsPositive() throws Throwable  {
      // Create an EvoSuite file with a specific name and length
      EvoSuiteFile evoSuiteFile = new EvoSuiteFile("/___XML");
      // Create a byte array with the same length as the EvoSuite file
      byte[] data = new byte[7];
      // Append the data to the EvoSuite file using FileSystemHandling.appendDataToFile()
      FileSystemHandling.appendDataToFile(evoSuiteFile, data);
      // Create a FileUtil instance
      FileUtil fileUtil = new FileUtil();
      // Get the ASIN file for the specified parameters (which are empty strings in this case)
      File aSINFile = fileUtil.getASINFile("", "", "", "");
      // Assert that the ASIN file is not null
      assertNotNull(aSINFile);
      // Assert that the length of the ASIN file is equal to the length of the EvoSuite file
      assertEquals(7L, aSINFile.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertEquals(0, fetchBNFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessoriesReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      // Given: a new EvoSuiteFile instance with a file path "/A_@W!M]T+UZ?5@2B@T .XML" and an empty string as the content to be appended.
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      
      // When: the appendStringToFile method is called with the instance of the EvoSuiteFile and an empty string as the content to be appended.
      ArrayList<Object> arg1 = new ArrayList<Object>();
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("@W!m]T+uz?5@2b@t ", arg1);
      
      // Then: the method is expected to return a FileInputStream instance with an available value of 0, indicating that the file is empty and has no content to be read.
      assertEquals(0, fetchAccessories.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      
      // Act
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      
      // Assert
      assertEquals(1, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadOneASINFile() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      boolean downloadOneASINFile = fileUtil.downloadOneASINFile("&Hmac=", "1", "&Hmac=", "http://xml.amazon.net/onca/xml3", (String) null);
      assertFalse(downloadOneASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBrowseNodeFile() throws Throwable  {
      // Given a FileUtil instance and invalid arguments for downloading a browse node file
      FileUtil fileUtil = new FileUtil();
      String invalidFileName = "3U{_;je*z|lZfm'";
      String invalidParameter1 = "offerstatus=";
      String invalidParameter2 = "pA~ee";
      String invalidParameter3 = "offerstatus=";
      
      // When the downloadBrowseNodeFile method is called with these arguments
      boolean downloadBrowseNodeFile = fileUtil.downloadBrowseNodeFile(invalidFileName, invalidParameter1, invalidParameter2, invalidParameter3);
      
      // Then the method should return false, indicating that the file could not be downloaded
      assertFalse(downloadBrowseNodeFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadSimilaritesFile() throws Throwable  {
      // Given a file util instance and an EvoSuite URL containing a valid filename
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=ShoppingCart=clear&f=xml&dev-t=&type=lite&offerpage=ShoppingCart=clear&f=xml");
      
      // When a file with the same filename as the EvoSuite URL is downloaded
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      boolean downloadSimilaritesFile = fileUtil.downloadSimilaritesFile("ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      
      // Then the method should return false, indicating that a file with the same filename already exists
      assertFalse(downloadSimilaritesFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereLengthIsPositive() throws Throwable  {
      // rollbacked to evosuite
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
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_@W!M]T+UZ?5@2B@T .XML");
      FileSystemHandling.appendLineToFile(arg0, "@W!m]T+uz?5@2b@t ");
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<Object>();
      File accessories = fileUtil.getAccessories("@W!m]T+uz?5@2b@t ", arg1);
      assertEquals(18L, accessories.length());
      assertNotNull(accessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningNull() throws Throwable  {
      // Given: A fileUtil object and a list of arguments
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> args = new ArrayList<>();
      
      // When: Calling the getAccessories method with a non-existent file name
      File accessories = fileUtil.getAccessories("TG7VZ*iQ/E.jecA$`", args);
      
      // Then: The method should return null
      assertNull(accessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadGenericSearchFileWithNonEmptyString() throws Throwable  {
      // Given: A URL for an Amazon search query
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&S`y!CS/',@3KwR;!{(JP=%26On%40%3AG%2BR&mode=S`y!CS/',@3KwR;!{(JP&type=S`y!CS/',@3KwR;!{(JP&page=5_2LOI&offer=5_2LOI&f=xml");
      
      // When: The URL is used to create a remote text file
      NetworkHandling.createRemoteTextFile(arg0, "&On@:G+R");
      
      // Then: A null value should be returned as the file cannot be downloaded due to invalid credentials
      FileUtil fileUtil = new FileUtil();
      File downloadGenericSearchFile = fileUtil.downloadGenericSearchFile("S`y!CS/',@3KwR;!{(JP", "&On@:G+R", "S`y!CS/',@3KwR;!{(JP", "S`y!CS/',@3KwR;!{(JP", "5_2LOI", "5_2LOI");
      assertNull(downloadGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningNull() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      File browseNodeFile = fileUtil.getBrowseNodeFile("", "", "");
      assertNull(browseNodeFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningNull() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("offerpage=", "offerpage=", "offerpage=", "offerpage=");
      assertNull(aSINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadCart() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      String downloadUrl = "https://www.example.com?q=java";
      
      // Act
      File downloadedFile = fileUtil.downloadCart(downloadUrl);
      
      // Assert
      assertNull(downloadedFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningNull() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=all&type=lite&offerpage=all&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "XrrIo,;tjPW");
      FileUtil fileUtil = new FileUtil();
      File similarItems = fileUtil.getSimilarItems("all", "all");
      assertNull(similarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItemsReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_&ON@:G+R.XML");
      FileSystemHandling.appendLineToFile(arg0, "$k~$o~XWg/WbFbQYc~");
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("&On@:G+R", "&On@:G+R");
      assertEquals(19, fetchSimilarItems.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems1() throws Throwable  {
      // Given: We have a FileUtil class that can fetch similar items for a given query.
      // When: We pass in a query string and a file name to the fetchSimilarItems method.
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("B7-&jM=l5Cx", "Love is in the air");
      // Then: The method should return null as there are no similar items found for the given query.
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessoriesReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // rollbacked to evosuite
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
      // Given: A valid path to a file and an empty list of arguments
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<>();
      
      // When: The file is fetched using the "fetchAccessories" method
      FileInputStream fetchAccessories = fileUtil.fetchAccessories("path/to/valid/file", arg1);
      
      // Then: The method should return null, as there are no accessories in the file
      assertNull(fetchAccessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchThirdPartySearchFile() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchThirdPartySearchFile = fileUtil.fetchThirdPartySearchFile("^54q", "search term", "en-US", "");
      assertNull(fetchThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadThirdPartySearchFile() throws Throwable  {
      // Test that downloading a third-party search file returns null
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=ShoppingCart=clear&f=xml&dev-t=&type=edm(S&page=ShoppingCart=clear&f=xml&dev-t=&offerstatus=ShoppingCart=clear&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      
      // Download the third-party search file with the specified arguments
      File downloadThirdPartySearchFile = fileUtil.downloadThirdPartySearchFile("ShoppingCart=clear&f=xml&dev-t=", "edm(S", "ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      
      // Assert that the download file is null
      assertNull(downloadThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchGenericSearchFile() throws Throwable  {
      // Arrange
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&@E!<H]Tuz?_d>5@2b@t =%40E%21%3CH%5DTuz%3F_d>5@2b@t +&mode=&type=&page=@E!<H]Tuz?_d>5@2b@t &offer=&f=xml");
      FileUtil fileUtil = new FileUtil();
      
      // Act
      NetworkHandling.createRemoteTextFile(arg0, "@E!<H]Tuz?_d>5@2b@t ");
      
      // Assert
      FileInputStream fetchGenericSearchFile = fileUtil.fetchGenericSearchFile("@E!<H]Tuz?_d>5@2b@t ", "@E!<H]Tuz?_d>5@2b@t ", "", "", "@E!<H]Tuz?_d>5@2b@t ", "");
      assertNull(fetchGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchKeywordSearchFile() throws Throwable  {
      // Given a file named shopping_cart_clear_results.xml and another named shopping_cart_clear_results2.xml,
      // containing search results for a "ShoppingCart=clear" query
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchKeywordSearchFile = fileUtil.fetchKeywordSearchFile("ShoppingCart=clear&f=xml&dev-t=01/01/2023", "ShoppingCart=clear&f=xml&dev-t=01/01/2025", "shopping_cart_clear_results.xml", "shopping_cart_clear_results2.xml");
      
      // When the search results are fetched using the FileUtil class
      
      // Then the resulting file input stream should be null, indicating that no such file exists
      assertNull(fetchKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBlendedSearchFile() throws Throwable  {
      // Given: The FileUtil class is used to fetch files from the internet.
      // When: Fetching a file from two URLs using the fetchBlendedSearchFile method.
      // Then: The file should be null as it cannot be fetched from either of the URLs.
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBlendedSearchFile = fileUtil.fetchBlendedSearchFile("https://www.example1.com", "https://www.example2.com");
      assertNull(fetchBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadKeywordSearchFile() throws Throwable  {
      // Arrange
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=09%60%29W%24VM%296%3F0%26%3A5%7B&mode=09`)W$VM)6?0&:5{&type=09`)W$VM)6?0&:5{");
      NetworkHandling.createRemoteTextFile(arg0, "09`)W$VM)6?0&:5{");
      FileUtil fileUtil = new FileUtil();
      
      // Act
      File downloadKeywordSearchFile = fileUtil.downloadKeywordSearchFile("09`)W$VM)6?0&:5{", "09`)W$VM)6?0&:5{", "09`)W$VM)6?0&:5{", "");
      
      // Assert
      assertNull(downloadKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBlendedSearchFile() throws Throwable  {
      // Test that the downloadBlendedSearchFile method returns null when the parameters are empty
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "@E!<H]Tuz?_d>5@2b@t ");
      FileUtil fileUtil = new FileUtil();
      File downloadBlendedSearchFile = fileUtil.downloadBlendedSearchFile("", "");
      assertNull(downloadBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFile1() throws Throwable  {
      // Create a new instance of FileUtil
      FileUtil fileUtil = new FileUtil();
      
      // Create an EvoSuiteURL object with some invalid input
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=edm(S&mode=edm(S&type=lite&page=&offer=new&f=xml");
      
      // Call the createRemoteTextFile method with the invalid input and a random filename
      NetworkHandling.createRemoteTextFile(arg0, "edm(S");
      
      // Try to fetch the file using the fetchBNFile method with some invalid input
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      
      // Assert that the returned file is null, since we provided invalid input
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/[Q{XWL[FS-_[Q{XWL[FS-_[Q{XWL[FS-_EDM(S.XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertEquals(0, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsZero() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/OFFERPAGE=_OFFERPAGE=_OFFERPAGE=_OFFERPAGE=.XML");
      FileSystemHandling.createFolder(arg0);
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("offerpage=", "offerpage=", "offerpage=", "offerpage=");
      assertNotNull(aSINFile);
      assertTrue(aSINFile.isDirectory());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFileWithEmptyStringAndEmptyString() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("", "");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFile1() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("/home/user/Documents/old_name.txt", "/home/user/Documents/new_name.txt");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/EDM(S_EDM(S_.XML");
      FileSystemHandling.appendLineToFile(arg0, "");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("edm(S", "edm(S", "");
      assertEquals(1, fetchBNFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAgeGood() throws Throwable  {
      // Given a fileUtil object that can check if the age of a file is good
      FileUtil fileUtil = new FileUtil();
      
      // When the file is null
      boolean ageGood = fileUtil.isAgeGood(null);
      
      // Then the method returns false, indicating that the age of the file is not good
      assertFalse(ageGood);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithEmptyString() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithNonEmptyString() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("/path/to/file");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFile1() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=[Q{xwl[fs-&type=[Q{xwl[fs-&offerpage=edm(S&offer=[Q{xwl[fs-&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=clear&f=xml&dev-t=");
      FileInputStream fetchASINFile = fileUtil.fetchASINFile("[Q{xwl[fs-", "[Q{xwl[fs-", "[Q{xwl[fs-", "edm(S");
      assertNull(fetchASINFile);
  }
}
