/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 13 03:50:58 GMT 2024
 */

package bcry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import bcry.battlecryGUI;
import bcry.bcGenerator;
import bcry.bcModule;
import bcry.bcVoice;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class bcGenerator_Original_ESTest extends bcGenerator_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetModuleInfo() throws Throwable  {
      boolean[] arg0 = new boolean[7];
      bcVoice arg1 = new bcVoice(arg0, (battlecryGUI) null);
      bcGenerator _bcGenerator = new bcGenerator((bcModule) null, arg1);
      _bcGenerator.getModuleInfo();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLyrics() throws Throwable  {
      boolean[] arg0 = new boolean[7];
      bcVoice arg1 = new bcVoice(arg0, (battlecryGUI) null);
      bcGenerator _bcGenerator = new bcGenerator((bcModule) null, arg1);
      List lyrics = _bcGenerator.getLyrics();
      assertTrue(lyrics.isEmpty());
  }
}
