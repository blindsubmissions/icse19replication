/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 13:53:34 GMT 2018
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.text.DefaultCaret;
import javax.swing.tree.DefaultTreeSelectionModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.associations.Apriori;
import weka.core.Environment;
import weka.core.GlobalInfoJavadoc;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.converters.DatabaseSaver;
import weka.core.converters.JSONSaver;
import weka.core.converters.SVMLightSaver;
import weka.core.converters.TextDirectoryLoader;
import weka.gui.beans.Associator;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.Loader;
import weka.gui.beans.Saver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.ThresholdDataEvent;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.visualize.PlotData2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Saver_ESTest extends Saver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Saver saver0 = new Saver();
      saver0.saveBatch();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      Saver saver1 = new Saver();
      assertEquals("ArffSaver", saver1.getCustomName());
      
      saver1.setCustomName("");
      assertEquals("", saver1.getCustomName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Saver saver0 = new Saver();
      saver0.getLocale();
      String string0 = saver0.globalInfo();
      assertEquals("<html><font color=blue>Writes to a destination that is in arff (attribute relation file format) format</font><br><br> The data can be compressed with gzip in order to save space.<br></html>", string0);
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Saver saver0 = new Saver();
      DatabaseSaver databaseSaver0 = new DatabaseSaver();
      saver0.setSaverTemplate(databaseSaver0);
      assertEquals("DatabaseSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Saver saver0 = new Saver();
      String[] stringArray0 = new String[0];
      saver0.removeAll();
      Saver.main(stringArray0);
      saver0.stop();
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Saver saver0 = new Saver();
      Loader loader0 = new Loader();
      // Undeclared exception!
      try { 
        saver0.setWrappedAlgorithm((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Saver", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Saver saver0 = new Saver();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      saver0.getKeyListeners();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      String string0 = saver0.getCustomName();
      assertNotNull(string0);
      assertEquals("ArffSaver", string0);
      
      DefaultTreeSelectionModel defaultTreeSelectionModel0 = new DefaultTreeSelectionModel();
      Dimension dimension0 = new Dimension(0, 0);
      Rectangle rectangle0 = new Rectangle(dimension0);
      saver0.scrollRectToVisible(defaultCaret0);
      assertTrue(saver0.getRelationNameForFilename());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Saver saver0 = new Saver();
      saver0.isPaintingTile();
      saver0.isOpaque();
      saver0.getComponents();
      saver0.getTopLevelAncestor();
      saver0.getSaverTemplate();
      saver0.getWrappedAlgorithm();
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Saver saver0 = new Saver();
      Filter filter0 = new Filter();
      Associator associator0 = new Associator();
      associator0.getStructure("iT");
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null, 0, 0);
      saver0.isBusy();
      InstanceEvent instanceEvent0 = new InstanceEvent("iT");
      // Undeclared exception!
      try { 
        saver0.acceptInstance(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Saver", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Saver saver0 = new Saver();
      saver0.stop();
      JSONSaver jSONSaver0 = new JSONSaver();
      saver0.setSaverTemplate(jSONSaver0);
      assertEquals("JSONSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1383330595080277
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Saver saver0 = new Saver();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate(" ");
      TestSetEvent testSetEvent0 = new TestSetEvent(instances0, instances0, (-1), (-1));
      saver0.acceptTestSet(testSetEvent0);
      assertFalse(saver0.isBusy());
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Saver saver0 = new Saver();
      saver0.saveBatch();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      GlobalInfoJavadoc globalInfoJavadoc0 = new GlobalInfoJavadoc();
      Apriori apriori0 = new Apriori();
      apriori0.getInstancesOnlyClass();
      TestSetEvent testSetEvent0 = new TestSetEvent(globalInfoJavadoc0, (Instances) null, 800, 800);
      saver0.isBusy();
      saver0.getRelationNameForFilename();
      InstanceEvent instanceEvent0 = new InstanceEvent(substringReplacer0);
      // Undeclared exception!
      try { 
        saver0.acceptInstance(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Saver", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Saver saver0 = new Saver();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(textDirectoryLoader0, instances0);
      saver0.acceptTestSet(testSetEvent0);
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1383330595080277
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Saver saver0 = new Saver();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instances0, instances0, (-2), (-2));
      saver0.acceptTrainingSet(trainingSetEvent0);
      assertFalse(saver0.isBusy());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Saver saver0 = new Saver();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(instances0, instances0);
      saver0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("ArffSaver", saver0.getCustomName());
      assertTrue(saver0.getRelationNameForFilename());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3592367006650066
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Saver saver0 = new Saver();
      InstanceEvent instanceEvent0 = new InstanceEvent(saver0);
      SVMLightSaver sVMLightSaver0 = new SVMLightSaver();
      saver0.setWrappedAlgorithm(sVMLightSaver0);
      instanceEvent0.setStatus(1);
      saver0.acceptInstance(instanceEvent0);
      assertEquals("SVMLightSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.59342423717389
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Saver saver0 = new Saver();
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      saver0.getInputContext();
      Sorter sorter0 = new Sorter();
      Environment environment0 = sorter0.m_env;
      saver0.setEnvironment(environment0);
      flowByExpression0.getVisibleRect();
      instanceEvent0.setStatus(1);
      saver0.acceptInstance(instanceEvent0);
      String string0 = saver0.sanitizeFilename("#wEX");
      assertEquals("#wEX", string0);
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Saver saver0 = new Saver();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(saver0, instances0);
      saver0.acceptDataSet(dataSetEvent0);
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1383330595080277
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Saver saver0 = new Saver();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      PlotData2D plotData2D0 = new PlotData2D(instances0);
      ThresholdDataEvent thresholdDataEvent0 = new ThresholdDataEvent(testInstances0, plotData2D0);
      saver0.acceptDataSet(thresholdDataEvent0);
      assertFalse(saver0.isBusy());
      assertEquals("ArffSaver", saver0.getCustomName());
      assertTrue(saver0.getRelationNameForFilename());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.2450352741261774
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Saver saver0 = new Saver();
      assertTrue(saver0.getRelationNameForFilename());
      
      saver0.setRelationNameForFilename(false);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("j?<\"AOcS.wnP-JMCg");
      testInstances0.generate(".arff");
      DataSetEvent dataSetEvent0 = new DataSetEvent(testInstances0, instances0);
      saver0.acceptDataSet(dataSetEvent0);
      assertFalse(saver0.getRelationNameForFilename());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.8343719702816237
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Saver saver0 = new Saver();
      assertTrue(saver0.getRelationNameForFilename());
      
      saver0.setRelationNameForFilename(false);
      TestInstances testInstances0 = new TestInstances();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent("j?<\"AOcS.wnP-JMCg", instances0);
      saver0.acceptTestSet(testSetEvent0);
      saver0.sanitizeFilename("j?<\"AOcS.wnP-JMCg");
      assertFalse(saver0.getRelationNameForFilename());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Saver saver0 = new Saver();
      InstanceEvent instanceEvent0 = new InstanceEvent(saver0);
      instanceEvent0.setStatus(1);
      saver0.acceptInstance(instanceEvent0);
      saver0.acceptInstance(instanceEvent0);
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.2342678660790767
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Saver saver0 = new Saver();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      InstanceEvent instanceEvent0 = new InstanceEvent(instances0, instances0);
      saver0.acceptInstance(instanceEvent0);
      instanceEvent0.setStatus(2);
      saver0.acceptInstance(instanceEvent0);
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.30565733829864
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Saver saver0 = new Saver();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "`.=!}QX~BmG";
      stringArray0[1] = "";
      Saver.main(stringArray0);
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      DataSetEvent dataSetEvent0 = new DataSetEvent(testInstances0, instances0);
      saver0.acceptDataSet(dataSetEvent0);
      String string0 = saver0.sanitizeFilename("");
      assertEquals("", string0);
      assertFalse(saver0.isBusy());
      
      saver0.stop();
      assertTrue(saver0.getRelationNameForFilename());
      assertEquals("ArffSaver", saver0.getCustomName());
  }
}