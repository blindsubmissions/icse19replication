/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:31:57 GMT 2018
 */

package dk.statsbiblioteket.summa.search.document;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dk.statsbiblioteket.summa.common.configuration.Configuration;
import dk.statsbiblioteket.summa.common.index.IndexException;
import dk.statsbiblioteket.summa.support.lucene.search.LuceneSearchNode;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentSearcherImpl_ESTest extends DocumentSearcherImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      boolean boolean0 = luceneSearchNode0.isCollectDocIDs();
      assertFalse(boolean0);
      
      long long0 = luceneSearchNode0.getRecords();
      assertEquals(20L, long0);
      
      String[] stringArray0 = luceneSearchNode0.getFallbackValues();
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertNull(stringArray0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setRecords((-3302L));
      luceneSearchNode0.getFallbackValues();
      assertEquals((-3302L), luceneSearchNode0.getRecords());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setResultFields(configuration0.DEFAULT_RESOURCES);
      luceneSearchNode0.getNonescapedFields();
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertFalse(luceneSearchNode0.isCollectDocIDs());
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      try { 
        luceneSearchNode0.simpleSearch("dk.statsbiblioteket.summa.search.document.DocumentSearcherImpl", 30000, 30000);
        fail("Expecting exception: IndexException");
      
      } catch(IndexException e) {
         //
         // No searcher available (index at 'null')
         //
         verifyException("dk.statsbiblioteket.summa.support.lucene.search.LuceneSearchNode", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      luceneSearchNode0.setNonescapedFields(set0);
      String[] stringArray0 = luceneSearchNode0.getFallbackValues();
      assertNull(stringArray0);
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertFalse(luceneSearchNode0.isCollectDocIDs());
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.getNonescapedFields();
      luceneSearchNode0.getMaxRecords();
      System.setCurrentTimeMillis((-3772L));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setCollectDocIDs(false);
      String[] stringArray0 = luceneSearchNode0.getFallbackValues();
      assertNull(stringArray0);
      
      luceneSearchNode0.getDocCount();
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertFalse(luceneSearchNode0.isCollectDocIDs());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setSortKey("summa.configuration");
      luceneSearchNode0.managedWarmup("summa.api.version");
      assertEquals("summa.configuration", luceneSearchNode0.getSortKey());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      Configuration configuration1 = new Configuration(configuration0);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration1);
      long long0 = luceneSearchNode0.getStartIndex();
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertEquals(0L, long0);
      assertFalse(luceneSearchNode0.isCollectDocIDs());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      String string0 = luceneSearchNode0.getSortKey();
      assertNotNull(string0);
      assertFalse(luceneSearchNode0.isCollectDocIDs());
      assertEquals("summa-score", string0);
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setWarmupData("summa.configuration");
      luceneSearchNode0.setStartIndex(9223372036854775807L);
      assertEquals(9223372036854775807L, luceneSearchNode0.getStartIndex());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setFallbackValues(configuration0.DEFAULT_RESOURCES);
      luceneSearchNode0.getNonescapedFields();
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertFalse(luceneSearchNode0.isCollectDocIDs());
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      String[] stringArray0 = luceneSearchNode0.getFallbackValues();
      assertNull(stringArray0);
      
      String[] stringArray1 = luceneSearchNode0.getResultFields();
      assertFalse(luceneSearchNode0.isCollectDocIDs());
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertNotNull(stringArray1);
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.setMaxRecords((-2281L));
      luceneSearchNode0.getFallbackValues();
      assertEquals((-2281L), luceneSearchNode0.getMaxRecords());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Configuration configuration0 = Configuration.getSystemConfiguration(true);
      LuceneSearchNode luceneSearchNode0 = new LuceneSearchNode(configuration0);
      luceneSearchNode0.managedWarmup("=%:1vYJ");
      String[] stringArray0 = luceneSearchNode0.getFallbackValues();
      assertNull(stringArray0);
      assertEquals("summa-score", luceneSearchNode0.getSortKey());
      assertEquals(9223372036854775807L, luceneSearchNode0.getMaxRecords());
      assertFalse(luceneSearchNode0.isCollectDocIDs());
  }
}
