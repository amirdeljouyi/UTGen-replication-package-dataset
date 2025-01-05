/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Fri Mar 15 03:47:46 GMT 2024
 */

package de.devcity.parseargs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import de.devcity.parseargs.ArgsParser;
import de.devcity.parseargs.arguments.ParameterArgument;
import de.devcity.parseargs.arguments.StringArgument;
import de.devcity.parseargs.arguments.SwitchArgument;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArgsParser_ESTest extends ArgsParser_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsCountReturningZero() throws Throwable  {
      // Given a set of arguments to be parsed
      String[] arg0 = new String[0];
      
      // When we pass these arguments to the ArgsParser
      ArgsParser argsParser = new ArgsParser();
      argsParser.setArgs(arg0);
      
      // Then we expect the getArgsCount() method to return 0
      int argsCount = argsParser.getArgsCount();
      assertEquals(0, argsCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningNonEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      ArgsParser argsParser = new ArgsParser();
      String[] arg0 = new String[3];
      argsParser.setArgs(arg0);
      String[] args = argsParser.getArgs();
      assertFalse(args.equals((Object)arg0));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningEmptyArray() throws Throwable  {
      // Given: a new instance of ArgsParser with no arguments set
      ArgsParser argsParser = new ArgsParser();
      
      // When: the getArgs method is called
      String[] args = argsParser.getArgs();
      
      // Then: the returned array should be empty
      assertTrue(args.length == 0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseStringArgumentReturningListWhereIsEmptyIsFalse() throws Throwable  {
      // Given: A test input that contains a single argument, "<", with the intention of testing the parsing of string arguments
      String[] arg0 = new String[1];
      arg0[0] = "<";
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // When: Parsing the input using the ArgsParser class to extract the string argument
      List<StringArgument> parseStringArgument = argsParser.parseStringArgument();
      
      // Then: Assert that the parsing operation was successful and that the resulting list of string arguments is not empty
      assertFalse(parseStringArgument.isEmpty());
      
      // And: Assert that there are no more arguments left to be parsed
      assertEquals(0, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningParameterArgumentWhereGetPositionIsZero0() throws Throwable  {
      // Given
      String[] arg0 = new String[5];
      arg0[0] = "-[U}F+<~_";
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // When
      ParameterArgument parseParameterArgument = argsParser.parseParameterArgument("[");
      
      // Then
      assertNotNull(parseParameterArgument);
      assertEquals(0, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentReturningParameterArgumentWhereGetPositionIsPositive() throws Throwable  {
      // Given an argument string with a parameter and value
      String[] arg0 = new String[9];
      arg0[3] = "-<";
      arg0[4] = "<";
      
      // When parsing the argument string to get the parameter and value
      ArgsParser argsParser = new ArgsParser(arg0);
      ParameterArgument parseParameterArgument = argsParser.parseParameterArgument("<");
      
      // Then assert that the parser returned a valid parameter and value
      assertEquals(0, argsParser.getArgsLeftCount());
      assertNotNull(parseParameterArgument);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull0() throws Throwable  {
      // Given: A string array containing a parameter argument and an unknown number of other arguments
      String[] arg0 = new String[9];
      arg0[3] = "-<";
      
      // When: The ArgsParser is initialized with the string array and the parseParameterArgument method is called
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("<");
      
      // Then: The getArgsLeftCount method should return 1, indicating that there is only one argument left in the array
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningParameterArgumentWhereGetPositionIsZero1() throws Throwable  {
      // Given
      String[] args = new String[5];
      args[0] = "-[U}F+<~_";
      ArgsParser argsParser = new ArgsParser(args);
      
      // When
      ParameterArgument parseParameterArgument = argsParser.parseParameterArgument("<");
      
      // Then
      assertNotNull(parseParameterArgument);
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull1() throws Throwable  {
      // Given: a string array with one element "-[UF+<"
      String[] arg0 = new String[1];
      arg0[0] = "-[UF+<";
      
      // When: the ArgsParser is created and the parseParameterArgument method is called with "<" as argument
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("<");
      
      // Then: the argsLeftCount should be 1
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull2() throws Throwable  {
      // Given a string array containing the parameter argument "<" with multiple values
      String[] arg0 = new String[9];
      arg0[2] = "---U<";
      
      // When the {@link ArgsParser} class is instantiated and the parseParameterArgument method is called with the argument
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("<");
      
      // Then the getArgsLeftCount method returns 1, indicating that there is one argument left to be parsed
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull3() throws Throwable  {
      // Given: The test has an array of arguments, arg0, with one element "<"
      String[] arg0 = new String[9];
      arg0[0] = "<";
      
      // When: The ArgsParser class is initialized with the argument array and parseParameterArgument method is called with the value "<"
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("<");
      
      // Then: The getArgsLeftCount method returns 1, indicating that there is one argument left to be processed
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentWithEmptyString() throws Throwable  {
      // Given a string array containing one argument "-[UF+<"
      String[] arg0 = new String[1];
      arg0[0] = "-[UF+<";
      
      // When parsing the parameter argument using ArgsParser with an empty string as input
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("");
      
      // Then the number of remaining arguments should be 1
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentReturningParameterArgumentWhereIsLongKeyIsTrue() throws Throwable  {
      // Given: A set of command-line arguments with two valid parameters and one invalid parameter
      String[] args = new String[5];
      args[1] = "-TU}F|+<;Y~-_^";
      args[2] = "-[U}F+<~_";
      ArgsParser argsParser = new ArgsParser(args);
      
      // When: We parse the arguments using the ArgsParser class
      ParameterArgument parsedArgument = argsParser.parseParameterArgument("-TU}F|+<;Y~-_^");
      
      // Then: The method should return a non-null object and the args left count should be 0
      assertNotNull(parsedArgument);
      assertEquals(0, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull4() throws Throwable  {
      // Given: The ArgsParser class is a Java class that parses command line arguments and stores them in an array.
      String[] arg0 = new String[5];
      arg0[1] = "---TU}F|+<;Y~-_^"; // The argument to be parsed is stored in the array at index 1.
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // When: The parseParameterArgument method is called with the argument "-TU}F|+<;Y~-_^" which is not a valid parameter for the program.
      argsParser.parseParameterArgument("-TU}F|+<;Y~-_^");
      
      // Then: The getArgsLeftCount method should return 1, as there is only one argument left in the array after parsing this invalid argument.
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull5() throws Throwable  {
      // Arrange
      String[] arg0 = new String[9];
      arg0[0] = "-";
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // Act
      argsParser.parseParameterArgument("--");
      
      // Assert
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseParameterArgumentAndParseParameterArgumentReturningNull6() throws Throwable  {
      // Given a string array containing a parameter argument and its value
      String[] arg0 = new String[4];
      arg0[3] = "-TU}F|+<;Y~-_^";
      
      // When the parseParameterArgument method is called with the argument
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseParameterArgument("-TU}F|+<;Y~-_^");
      
      // Then the argsLeftCount should be 1, indicating that there is one argument left to be parsed
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument0() throws Throwable  {
      // rollbacked to evosuite
      String[] arg0 = new String[9];
      arg0[3] = "-<";
      ArgsParser argsParser = new ArgsParser(arg0);
      SwitchArgument parseSwitchArgument = argsParser.parseSwitchArgument("<");
      assertEquals(0, argsParser.getArgsLeftCount());
      assertTrue(parseSwitchArgument.isSet());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument1() throws Throwable  {
      // Given a String array with "-" as the third element
      String[] arg0 = new String[9];
      arg0[3] = "-<";
      
      // When parsing the switch argument "-"
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseSwitchArgument("-");
      
      // Then the args left count should be 1
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument2() throws Throwable  {
      // Given a string array with 9 elements and an element at index 2 equal to "<"
      String[] args = new String[9];
      args[2] = "---U<";
      
      // When the parseSwitchArgument method is called with this argument array
      ArgsParser argsParser = new ArgsParser(args);
      argsParser.parseSwitchArgument("<");
      
      // Then the getArgsLeftCount method should return 1, indicating that there is one argument left to be processed
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument3() throws Throwable  {
      // Given an array of arguments containing a single string argument
      String[] arg0 = new String[4];
      arg0[1] = "eN!{Tn`d<!";
      
      // When the ArgsParser is initialized with this argument array
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // And the switch argument is parsed
      argsParser.parseSwitchArgument(" ");
      
      // Then the number of arguments left to be parsed should be 1
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument4() throws Throwable  {
      // Given a command-line argument array with one switch (-) and one non-switch argument (<)
      String[] arg0 = new String[] {"-", "<"};
      
      // When we create an instance of ArgsParser and parse the arguments
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseSwitchArgument("<");
      
      // Then the ArgsParser instance should have one argument left
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgumentReturningSwitchArgumentWhereGetPositionIsZero() throws Throwable  {
      // Given a valid input string "-"
      String[] arg0 = new String[4];
      arg0[0] = "-[U}F|+<;YB~-_^";
      
      // When the parseSwitchArgument method is called with the input string
      ArgsParser argsParser = new ArgsParser(arg0);
      SwitchArgument parseSwitchArgument = argsParser.parseSwitchArgument("-");
      
      // Then the return value should be a SwitchArgument object that indicates the switch was set
      assertTrue(parseSwitchArgument.isSet());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument5() throws Throwable  {
      // rollbacked to evosuite
      String[] arg0 = new String[5];
      arg0[1] = "---TU}F|+<;Y~-_^";
      ArgsParser argsParser = new ArgsParser(arg0);
      SwitchArgument parseSwitchArgument = argsParser.parseSwitchArgument("-TU}F|+<;Y~-_^");
      assertEquals(0, argsParser.getArgsLeftCount());
      assertTrue(parseSwitchArgument.isSet());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseSwitchArgument6() throws Throwable  {
      // Testing the ability to parse a switch argument and update the remaining arguments count
      String[] arg0 = new String[5];
      arg0[0] = "-[U}F+<~_";
      ArgsParser argsParser = new ArgsParser(arg0);
      argsParser.parseSwitchArgument("ygh.vr");
      assertEquals(1, argsParser.getArgsLeftCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsLeftCountReturningPositive() throws Throwable  {
      // Given: We have a String array with 5 elements and the first element contains invalid characters
      String[] arg0 = new String[5];
      arg0[0] = "-[U}F+<~_";
      
      // When: We create an instance of ArgsParser using the String array as input
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // Then: The getArgsLeftCount method returns 1, indicating that there is only one argument left to parse
      int argsLeftCount = argsParser.getArgsLeftCount();
      assertEquals(1, argsLeftCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsLeftCountReturningZero() throws Throwable  {
      // Given: A list of 5 string arguments is passed to the constructor of an ArgsParser class
      String[] arg0 = new String[5];
      ArgsParser argsParser = new ArgsParser(arg0);
      
      // When: The getArgsLeftCount method is called on the ArgsParser object
      int argsLeftCount = argsParser.getArgsLeftCount();
      
      // Then: The number of arguments left should be 0, as all 5 arguments have been parsed
      assertEquals(0, argsLeftCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetArgsThrowsNullPointerException() throws Throwable  {
      // Test that setArgs throws a NullPointerException when passed a null array
      ArgsParser argsParser = new ArgsParser();
      try {
      argsParser.setArgs((String[]) null);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // The exception is expected, as the input array cannot be null
      verifyException("de.devcity.parseargs.ArgsParser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsCountReturningPositive() throws Throwable  {
      String[] arg0 = new String[5];
      ArgsParser argsParser = new ArgsParser(arg0);
      int argsCount = argsParser.getArgsCount();
      assertEquals(5, argsCount); // Asserts that the number of arguments parsed by the ArgsParser is equal to 5
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningNull() throws Throwable  {
      // Given: No command line arguments are passed
      
      ArgsParser argsParser = new ArgsParser();
      
      // When: We call the getArgs method
      
      String[] args = argsParser.getArgs();
      
      // Then: The returned array of strings should be null
      
      assertNull(args);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseStringArgumentReturningListWhereIsEmptyIsTrue() throws Throwable  {
      // Given a list of String arguments
      String[] arg0 = new String[9];
      
      // When parsing the arguments with ArgsParser
      ArgsParser argsParser = new ArgsParser(arg0);
      List<StringArgument> parseStringArgument = argsParser.parseStringArgument();
      
      // Then the list should be empty
      assertEquals(0, parseStringArgument.size());
  }
}
