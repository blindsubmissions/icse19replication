/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:09:59 GMT 2018
 */

package com.aelitis.azureus.core.content;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.content.AzureusContent;
import com.aelitis.azureus.core.content.AzureusContentDirectoryListener;
import com.aelitis.azureus.core.content.AzureusContentFile;
import com.aelitis.azureus.core.content.AzureusPlatformContentDirectory;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.gudy.azureus2.plugins.torrent.Torrent;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AzureusPlatformContentDirectory_ESTest extends AzureusPlatformContentDirectory_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AzureusPlatformContentDirectory azureusPlatformContentDirectory0 = new AzureusPlatformContentDirectory();
      AzureusContentDirectoryListener azureusContentDirectoryListener0 = mock(AzureusContentDirectoryListener.class, new ViolatedAssumptionAnswer());
      azureusPlatformContentDirectory0.addListener(azureusContentDirectoryListener0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        AzureusPlatformContentDirectory.register();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PluginInitializer not instantiated by AzureusCore.create yet
         //
         verifyException("org.gudy.azureus2.pluginsimpl.local.PluginInitializer", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AzureusPlatformContentDirectory azureusPlatformContentDirectory0 = new AzureusPlatformContentDirectory();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      AzureusContent azureusContent0 = azureusPlatformContentDirectory0.lookupContent(hashMap0);
      assertNull(azureusContent0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AzureusPlatformContentDirectory azureusPlatformContentDirectory0 = new AzureusPlatformContentDirectory();
      AzureusContentDirectoryListener azureusContentDirectoryListener0 = mock(AzureusContentDirectoryListener.class, new ViolatedAssumptionAnswer());
      azureusPlatformContentDirectory0.removeListener(azureusContentDirectoryListener0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AzureusPlatformContentDirectory azureusPlatformContentDirectory0 = new AzureusPlatformContentDirectory();
      AzureusPlatformContentDirectory.AzureusPlatformContent azureusPlatformContentDirectory_AzureusPlatformContent0 = azureusPlatformContentDirectory0.new AzureusPlatformContent((Torrent) null);
      Torrent torrent0 = azureusPlatformContentDirectory_AzureusPlatformContent0.getTorrent();
      assertNull(torrent0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AzureusPlatformContentDirectory.fireChanged((AzureusContentFile) null);
  }
}
