/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:15:32 GMT 2018
 */

package org.dom4j.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.dom4j.io.OutputFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutputFormat_ESTest extends OutputFormat_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setLineSeparator("43+[t:9^kbvtaF-E");
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals("43+[t:9^kbvtaF-E", outputFormat0.getLineSeparator());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("78:loteeo-oI!k", false);
      outputFormat0.setPadText(false);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals("78:loteeo-oI!k", outputFormat0.getIndent());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6245757807017087
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("78:loteeo-oI!k", true, "Ul|[-D.ZeJl]w6");
      outputFormat0.setTrimText(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndentSize(832);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Ul|[-D.ZeJl]w6";
      stringArray0[1] = "Ul|[-D.ZeJl]w6";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setPadText(true);
      outputFormat0.isPadText();
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-535));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -535
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "L#Sr*nj";
      stringArray0[6] = "-expandEmpty";
      OutputFormat outputFormat0 = new OutputFormat("L#Sr*nj");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setLineSeparator("L#Sr*nj");
      outputFormat0.getEncoding();
      outputFormat0.setNewLineAfterNTags(1098);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals(1098, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9646946227273333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setExpandEmptyElements(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-xhtml|";
      stringArray0[1] = "-omitEncoding";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "-omitEncoding";
      stringArray0[4] = "-omitEncoding";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-391));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -391
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("e", true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-xhtml|";
      stringArray0[1] = "e";
      stringArray0[2] = "2-[";
      stringArray0[3] = "-xhtml|";
      stringArray0[4] = "e";
      int int0 = 0;
      // Undeclared exception!
      outputFormat0.setIndentSize(2147483645);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4249913134082715
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-omitEncoding";
      OutputFormat.createCompactFormat();
      outputFormat0.setOmitEncoding(true);
      stringArray0[3] = "-trimText";
      String[] stringArray1 = new String[2];
      stringArray1[1] = "-trimText";
      outputFormat0.parseOptions(stringArray1, 1);
      outputFormat0.parseOptions(stringArray1, 404);
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.isSuppressDeclaration();
      outputFormat0.isExpandEmptyElements();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('y');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (y)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setSuppressDeclaration(true);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setNewlines(false);
      boolean boolean0 = false;
      outputFormat1.setNewlines(false);
      outputFormat0.getLineSeparator();
      OutputFormat.createPrettyPrint();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "\n";
      outputFormat1.setPadText(true);
      stringArray0[1] = "\n";
      stringArray0[2] = "\n";
      stringArray0[3] = "\n";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-454));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -454
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      outputFormat0.setEncoding((String) null);
      String[] stringArray0 = new String[7];
      stringArray0[1] = null;
      stringArray0[3] = "-trimText";
      String[] stringArray1 = new String[2];
      outputFormat0.getNewLineAfterNTags();
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-omitEncoding";
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('w');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (w)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Invalid attribute quote character (", false, (String) null);
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.setXHTML(true);
      boolean boolean0 = outputFormat0.isPadText();
      assertTrue(outputFormat0.isXHTML());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("d3?3+_qi4TOj5\"6");
      outputFormat0.getIndent();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "d3?3+_qi4TOj5\"6";
      stringArray0[1] = "d3?3+_qi4TOj5\"6";
      stringArray0[2] = "d3?3+_qi4TOj5\"6";
      stringArray0[3] = "d3?3+_qi4TOj5\"6";
      String string0 = "I;Z)}P M>";
      stringArray0[4] = "I;Z)}P M>";
      stringArray0[5] = "d3?3+_qi4TOj5\"6";
      stringArray0[6] = "d3?3+_qi4TOj5\"6";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-211));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -211
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("e", true);
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-xhtml|";
      stringArray0[1] = "e";
      stringArray0[2] = "2-[";
      stringArray0[3] = "-xhtml|";
      stringArray0[4] = "e";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1221);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("ngR3", false, "ngR3");
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("ngR3", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("ngR3", outputFormat0.getIndent());
      assertFalse(boolean0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText");
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent("-trimText");
      outputFormat0.setAttributeQuoteCharacter('\"');
      String string0 = outputFormat0.getEncoding();
      assertEquals("-trimText", outputFormat0.getIndent());
      assertEquals("UTF-8", string0);
      
      outputFormat0.setIndent(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setPadText(false);
      outputFormat0.setAttributeQuoteCharacter('\"');
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags(1);
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "!#BJb7P4]q<!2@j )";
      stringArray0[2] = "L#Sr*nj";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setLineSeparator("Rc1N+en_\"|J?1t1*k");
      outputFormat0.getEncoding();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertEquals("Rc1N+en_\"|J?1t1*k", outputFormat0.getLineSeparator());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9495936677167384
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-omitEncoding";
      outputFormat0.setOmitEncoding(true);
      stringArray0[3] = "-trimText";
      String[] stringArray1 = new String[2];
      stringArray1[1] = "-trimText";
      outputFormat0.parseOptions(stringArray1, 1);
      outputFormat0.setTrimText(true);
      outputFormat0.parseOptions(stringArray1, 404);
      outputFormat0.setEncoding("Invalid attribute quote character (");
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setTrimText(true);
      outputFormat0.setNewLineAfterNTags(876);
      outputFormat0.setNewlines(false);
      outputFormat0.setIndent(false);
      outputFormat0.isNewLineAfterDeclaration();
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertEquals(876, outputFormat0.getNewLineAfterNTags());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-xhtmlL#Sz*nj";
      stringArray0[2] = "-xhtmlL#Sz*nj";
      stringArray0[3] = "-trimText";
      stringArray0[4] = "-xhtmlL#Sz*nj";
      stringArray0[5] = "-xhtmlL#Sz*nj";
      String[] stringArray1 = new String[2];
      outputFormat0.parseOptions(stringArray1, 1890);
      outputFormat0.isOmitEncoding();
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-1468));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1468
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("L#Sr*nj");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpty";
      stringArray0[2] = "L#Sr*nj";
      stringArray0[3] = "L#Sr*nj";
      stringArray0[4] = "L#Sr*nj";
      stringArray0[5] = "-expandEmpty";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "L#Sr*nj";
      stringArray0[6] = "-expandEmpty";
      OutputFormat outputFormat0 = new OutputFormat("L#Sr*nj");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setIndent(true);
      outputFormat0.parseOptions(stringArray0, 25);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-2394));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2394
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      outputFormat0.setIndent((String) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = null;
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.setIndent("");
      OutputFormat outputFormat1 = new OutputFormat(")aTg", true);
      String[] stringArray0 = null;
      int int0 = (-467);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, (-467));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags((-427));
      outputFormat0.setAttributeQuoteCharacter('\'');
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-expndEptytrime@", true, "-xhtml-expndEptytrime@");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-xhtml-expndEptytrime@";
      stringArray0[1] = "-xhtml-expndEptytrime@";
      stringArray0[2] = "-xhtml-expndEptytrime@";
      stringArray0[3] = "-xhtml-expndEptytrime@";
      stringArray0[4] = "-xhtml-expndEptytrime@";
      stringArray0[5] = "-xhtml-expndEptytrime@";
      stringArray0[6] = "-xhtml-expndEptytrime@";
      stringArray0[7] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(8, int0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("78:loteeo-oI!k", true, "-suppressDeclaration");
      boolean boolean0 = false;
      outputFormat0.setTrimText(false);
      boolean boolean1 = false;
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setLineSeparator("-suppressDeclaration");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-suppressDeclaration";
      stringArray0[2] = "-indentSize";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags((-427));
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-expandEmpty";
      stringArray0[3] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[5] = "-lineSeparator";
      stringArray0[6] = "-lineSeparator";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("pL|0WbPGp=P!");
      outputFormat0.setOmitEncoding(true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "pL|0WbPGp=P!";
      stringArray0[2] = "pL|0WbPGp=P!";
      stringArray0[3] = "-omitEncoding";
      stringArray0[4] = "-padText";
      stringArray0[5] = "pL|0WbPGp=P!";
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 4);
      assertTrue(outputFormat0.isPadText());
      assertTrue(outputFormat0.isOmitEncoding());
      assertEquals(5, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[7];
      outputFormat0.setOmitEncoding(false);
      stringArray0[0] = "z<1?*RRP|v9zl]8f";
      stringArray0[1] = "-suppressDeclaration";
      stringArray0[2] = "-newlines";
      stringArray0[3] = "28wZ/A?c:^X+))Q%";
      stringArray0[4] = "a45SaMZtuEfv*:r!+EH";
      stringArray0[5] = "";
      stringArray0[6] = "-expandEmpty";
      outputFormat0.parseOptions(stringArray0, 1017);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "-indent";
      boolean boolean0 = true;
      String string1 = "-xhtml";
      OutputFormat outputFormat0 = new OutputFormat("-indent", true, "-xhtml");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-indent";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-indent";
      stringArray0[3] = "-indent";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = (-1923);
      outputFormat0.setIndent(true);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1923));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1923
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
