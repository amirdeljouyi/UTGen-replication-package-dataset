/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 07:59:07 GMT 2024
 */

package ghm.follow.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import ghm.follow.search.LineResult;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SearchableTextPane_ESTest extends SearchableTextPane_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTaking2ArgumentsReturningZero() throws Throwable  {
      // Given
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      
      // When
      int search = searchableTextPane.search("", 1962);
      
      // Then
      assertEquals(0, search);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTaking2ArgumentsReturningPositive() throws Throwable  {
      // Given: a SearchableTextPane instance with a Font object and some text appended to it
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      searchableTextPane.append("Line ");
      
      // When: the "search" method is called with an empty string and a starting index of 1962
      int search = searchableTextPane.search("", 1962);
      
      // Then: the return value should be 5, which is the length of the word "Line"
      assertEquals(5, search);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTakingStringReturningPositive() throws Throwable  {
      // Given a SearchableTextPane and a String to search for
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      searchableTextPane.append("Line ");
      searchableTextPane.append("9M;%lB+[b_;jG{*C");
      
      // When searching for the String in the SearchableTextPane
      int search = searchableTextPane.search("9M;%lB+[b_;jG{*C");
      
      // Then assert that the correct index is returned
      assertEquals(5, search);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveHighlights() throws Throwable  {
      // Given a SearchableTextPane object and font arguments, create a new Font object.
      Font arg0 = new Font("Mu`xXu|Z3X~y", (-868), 0);
      
      // When a SearchableTextPane object is created with the given font arguments.
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-1));
      
      // Then the SearchableTextPane object should have focus traversal policy set to false.
      assertFalse(searchableTextPane.isFocusTraversalPolicySet());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHighlightReturningListWhereIsEmptyIsTrue() throws Throwable  {
      // Given a SearchableTextPane with a font and a text string
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      
      // When the highlight method is called with an invalid regular expression
      List<LineResult> highlight = searchableTextPane.highlight("~!8:.Tx k", (-1));
      
      // Then the highlight list should be empty
      assertEquals(0, highlight.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHighlightReturningListWhereIsEmptyIsFalse() throws Throwable  {
      // Given a SearchableTextPane with some text and a font
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      searchableTextPane.append("Line ");
      
      // When we call the highlight method with a pattern and start position
      List<LineResult> highlight = searchableTextPane.highlight("|", 510);
      
      // Then the method should return a list of LineResults, which are objects that contain information about the lines in the text
      assertEquals(1, highlight.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTakingStringWithEmptyString() throws Throwable  {
      // Create a new instance of SearchableTextPane with a null font and a default size.
      SearchableTextPane searchableTextPane = new SearchableTextPane((Font) null, 1355);
      
      // Call the search method with an empty string as the parameter.
      int search = searchableTextPane.search("");
      
      // Assert that the search method returns -1 when an empty string is passed.
      assertEquals((-1), search);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTakingStringWithNull() throws Throwable  {
      // Test that searching for null text returns -1
      SearchableTextPane searchableTextPane = new SearchableTextPane((Font) null, (-4554));
      int search = searchableTextPane.search((String) null);
      assertEquals((-1), search);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHighlightWithEmptyString() throws Throwable  {
      // Given a SearchableTextPane with font "Line" and min score -2756
      Font arg0 = Font.decode("Line ");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      
      // When we call highlight method with empty string and min score -1
      List<LineResult> highlight = searchableTextPane.highlight("", (-1));
      
      // Then the returned list should be empty
      assertTrue(highlight.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHighlightWithNull() throws Throwable  {
      // Given a SearchableTextPane with no font and 1355 text
      SearchableTextPane searchableTextPane = new SearchableTextPane((Font) null, 1355);
      
      // When searching for an empty string ("")
      List<LineResult> highlight = searchableTextPane.highlight("", 1355);
      
      // Then the returned list of LineResults should be empty
      assertTrue(highlight.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScrollableTracksViewportWidth() throws Throwable  {
      // Given a SearchableTextPane instance with a font "Line" and a width of -2756
      Font arg0 = Font.decode("Line");
      SearchableTextPane searchableTextPane = new SearchableTextPane(arg0, (-2756));
      
      // When the method getScrollableTracksViewportWidth is invoked
      boolean scrollableTracksViewportWidth = searchableTextPane.getScrollableTracksViewportWidth();
      
      // Then the value returned should be true
      assertTrue(scrollableTracksViewportWidth);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSearchTaking2ArgumentsReturningNegative() throws Throwable  {
      // Given
      SearchableTextPane searchableTextPane = new SearchableTextPane((Font) null, 1355);
      
      // When
      int search = searchableTextPane.search(" ", (-1));
      
      // Then
      assertEquals((-1), search);
  }
}
