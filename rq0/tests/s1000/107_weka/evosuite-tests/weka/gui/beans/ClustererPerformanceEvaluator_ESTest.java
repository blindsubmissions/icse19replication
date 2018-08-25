/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:06:07 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.clusterers.EM;
import weka.clusterers.FarthestFirst;
import weka.clusterers.SimpleKMeans;
import weka.core.Instances;
import weka.core.converters.TextDirectoryLoader;
import weka.core.tokenizers.NGramTokenizer;
import weka.gui.beans.BatchClustererEvent;
import weka.gui.beans.Clusterer;
import weka.gui.beans.ClustererPerformanceEvaluator;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.Sorter;
import weka.gui.beans.TextViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClustererPerformanceEvaluator_ESTest extends ClustererPerformanceEvaluator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      TextViewer textViewer0 = new TextViewer();
      clustererPerformanceEvaluator0.removeTextListener(textViewer0);
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      // Undeclared exception!
      try { 
        clustererPerformanceEvaluator0.performRequest(">eM\u0002iXEx?1ure;*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // >eM\u0002iXEx?1ure;* not supported (ClustererPerformanceEvaluator)
         //
         verifyException("weka.gui.beans.ClustererPerformanceEvaluator", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      TextViewer textViewer0 = new TextViewer();
      clustererPerformanceEvaluator0.addTextListener(textViewer0);
      NGramTokenizer nGramTokenizer0 = new NGramTokenizer();
      assertEquals(3, nGramTokenizer0.getNGramMaxSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      TextViewer textViewer0 = new TextViewer();
      clustererPerformanceEvaluator0.getTopLevelAncestor();
      textViewer0.enableInputMethods(false);
      String string0 = clustererPerformanceEvaluator0.globalInfo();
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
      assertEquals("Evaluate the performance of batch trained clusterers.", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      EM eM0 = new EM();
      DataSetEvent dataSetEvent0 = new DataSetEvent(eM0, (Instances) null);
      BatchClustererEvent batchClustererEvent0 = new BatchClustererEvent(clustererPerformanceEvaluator0, eM0, dataSetEvent0, (-44), (-44), (-44));
      clustererPerformanceEvaluator0.acceptClusterer(batchClustererEvent0);
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
      assertFalse(clustererPerformanceEvaluator0.isBusy());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      boolean boolean0 = clustererPerformanceEvaluator0.eventGeneratable("weka.core.converters.SerializedInstancesLoader");
      assertFalse(boolean0);
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      clustererPerformanceEvaluator0.enumerateRequests();
      String string0 = clustererPerformanceEvaluator0.getCustomName();
      assertEquals("ClustererPerformanceEvaluator", string0);
      
      boolean boolean0 = clustererPerformanceEvaluator0.isBusy();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
      
      clustererPerformanceEvaluator0.setCustomName("");
      assertEquals("", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      Clusterer clusterer0 = new Clusterer();
      clustererPerformanceEvaluator0.m_listenee = (Object) clusterer0;
      boolean boolean0 = clustererPerformanceEvaluator0.eventGeneratable("3y");
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      Clusterer clusterer0 = new Clusterer();
      clustererPerformanceEvaluator0.m_listenee = (Object) clusterer0;
      clustererPerformanceEvaluator0.stop();
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      clustererPerformanceEvaluator0.connectionNotification("", "");
      Clusterer clusterer0 = new Clusterer();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = clustererPerformanceEvaluator0.eventGeneratable("w3y");
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EM eM0 = new EM();
      Sorter sorter0 = new Sorter();
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      String string0 = clustererPerformanceEvaluator0.getCustomName();
      assertEquals("ClustererPerformanceEvaluator", string0);
      
      clustererPerformanceEvaluator0.performRequest("Stop");
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      FarthestFirst farthestFirst0 = new FarthestFirst();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(instanceStreamToBatchMaker0, instances0);
      BatchClustererEvent batchClustererEvent0 = new BatchClustererEvent(clustererPerformanceEvaluator0, farthestFirst0, dataSetEvent0, (-88), (-88), (-88));
      clustererPerformanceEvaluator0.acceptClusterer(batchClustererEvent0);
      assertEquals("ClustererPerformanceEvaluator", clustererPerformanceEvaluator0.getCustomName());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      SimpleKMeans simpleKMeans0 = new SimpleKMeans();
      DataSetEvent dataSetEvent0 = new DataSetEvent(simpleKMeans0, (Instances) null);
      simpleKMeans0.getCapabilities();
      BatchClustererEvent batchClustererEvent0 = new BatchClustererEvent(clustererPerformanceEvaluator0, simpleKMeans0, dataSetEvent0, 821, 821, 821);
      clustererPerformanceEvaluator0.acceptClusterer(batchClustererEvent0);
      System.setCurrentTimeMillis(821);
  }
}
