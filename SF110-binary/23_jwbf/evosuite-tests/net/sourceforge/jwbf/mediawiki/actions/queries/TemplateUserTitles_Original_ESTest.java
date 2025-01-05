/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 12 02:15:10 GMT 2024
 */

package net.sourceforge.jwbf.mediawiki.actions.queries;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sourceforge.jwbf.mediawiki.actions.queries.TemplateUserTitles;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TemplateUserTitles_Original_ESTest extends TemplateUserTitles_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateTemplateUserTitlesThrowsNullPointerException() throws Throwable  {
      TemplateUserTitles templateUserTitles = null;
      try {
        templateUserTitles = new TemplateUserTitles((MediaWikiBot) null, "=Y!u1'<j9", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.jwbf.mediawiki.actions.queries.TitleQuery", e);
      }
  }
}
