/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:11:02 GMT 2018
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
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "-padText");
      outputFormat0.setNewLineAfterNTags(0);
      assertFalse(outputFormat0.isPadText());
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-padText";
      stringArray0[1] = "-padText";
      stringArray0[2] = "w9scWwnq2C`";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isPadText());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5047882836811908
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9sccwnq2C`", false, "x-padText");
      outputFormat0.setNewLineAfterNTags(0);
      assertEquals("x-padText", outputFormat0.getEncoding());
      assertEquals("w9sccwnq2C`", outputFormat0.getIndent());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "x-padText";
      OutputFormat outputFormat1 = new OutputFormat("x-padText", false, "x-padText");
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      assertTrue(outputFormat2.isTrimText());
      assertFalse(outputFormat2.isXHTML());
      assertFalse(outputFormat2.isSuppressDeclaration());
      assertEquals("  ", outputFormat2.getIndent());
      assertTrue(outputFormat2.isPadText());
      assertEquals('\"', outputFormat2.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat2.getEncoding());
      assertFalse(outputFormat2.isOmitEncoding());
      assertTrue(outputFormat2.isNewlines());
      assertEquals("\n", outputFormat2.getLineSeparator());
      assertTrue(outputFormat2.isNewLineAfterDeclaration());
      
      outputFormat1.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "w9sccwnq2C`";
      stringArray1[1] = "x-padText";
      stringArray1[3] = "w9sccwnq2C`";
      stringArray1[4] = "x-padText";
      stringArray1[5] = "x-padText";
      outputFormat1.parseOptions(stringArray1, 0);
      outputFormat1.parseOptions(stringArray1, 0);
      outputFormat1.parseOptions(stringArray0, 0);
      assertFalse(outputFormat1.isNewlines());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertFalse(outputFormat1.isXHTML());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isPadText());
      assertFalse(outputFormat1.isOmitEncoding());
      assertFalse(outputFormat1.isTrimText());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, ".nP@XtN2Kr./hTA");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "x-padText";
      stringArray0[2] = "";
      stringArray0[3] = ".nP@XtN2Kr./hTA";
      outputFormat0.setNewlines(true);
      outputFormat0.setExpandEmptyElements(true);
      stringArray0[4] = "w9scWw";
      stringArray0[5] = ".nP@XtN2Kr./hTA";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[4];
      stringArray1[1] = "x-padText";
      stringArray1[2] = "?.cTU]eTm[";
      stringArray1[3] = "w9scWw";
      outputFormat0.parseOptions(stringArray1, 2);
      String[] stringArray2 = new String[0];
      outputFormat0.parseOptions(stringArray2, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray2, (-975));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -975
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, "x-padText");
      outputFormat0.setIndentSize((-1316));
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setNewLineAfterNTags((-1));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "x-padText";
      OutputFormat outputFormat1 = new OutputFormat("x-padText", true, "x-padText");
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat0.setOmitEncoding(true);
      String[] stringArray1 = new String[6];
      outputFormat0.setIndent(true);
      stringArray1[0] = "w9scWwnq2C`";
      stringArray1[1] = "x-padText";
      outputFormat0.parseOptions(stringArray1, 0);
      assertEquals((-1), outputFormat0.getNewLineAfterNTags());
      
      outputFormat1.parseOptions(stringArray0, 0);
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "u@$UOT,p";
      OutputFormat outputFormat0 = new OutputFormat("u@$UOT,p");
      outputFormat0.setIndentSize((-478));
      int int0 = 110;
      outputFormat0.setIndentSize(110);
      char char0 = '\\';
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('\\');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (\\)
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
      OutputFormat outputFormat0 = new OutputFormat("3YNVJxX?6@M+MlE", true);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('@');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (@)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "-padText";
      OutputFormat outputFormat0 = new OutputFormat("", true, "-padText");
      int int0 = 0;
      outputFormat0.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-padText";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "-padText";
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter(']');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (])
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, "x-padText");
      outputFormat0.setNewLineAfterNTags(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "x-padText";
      OutputFormat outputFormat1 = new OutputFormat("x-padText", true, "x-padText");
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.setSuppressDeclaration(true);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "w9scWwnq2C`";
      stringArray1[1] = "x-padText";
      stringArray1[2] = "x-padText";
      stringArray1[3] = "w9scWwnq2C`";
      stringArray1[4] = "x-padText";
      stringArray1[5] = "x-padText";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 34);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-3432));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3432
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true);
      outputFormat0.setIndent("");
      outputFormat0.setNewlines(false);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setTrimText(true);
      outputFormat0.isNewLineAfterDeclaration();
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(outputFormat0.isNewlines());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.isSuppressDeclaration();
      String string0 = "=P5e]Yw:(\\yW";
      outputFormat0.setLineSeparator("=P5e]Yw:(yW");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('S');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (S)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, "x-padText");
      outputFormat0.setNewLineAfterNTags(0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "x-padText";
      OutputFormat outputFormat1 = new OutputFormat("x-padText", true, "x-padText");
      outputFormat1.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "w9scWwnq2C`";
      outputFormat1.setIndent("x-padText");
      stringArray1[1] = "x-padText";
      stringArray1[2] = "x-padText";
      stringArray1[3] = "w9scWwnq2C`";
      stringArray1[4] = "x-padText";
      stringArray1[5] = "x-padText";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 34);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3965));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3965
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
      OutputFormat outputFormat0 = new OutputFormat(".nP@XtN2Kr./hTA");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "x-padText";
      stringArray0[2] = "";
      stringArray0[3] = ".nP@XtN2Kr./hTA";
      stringArray0[4] = "w9scWw";
      stringArray0[5] = ".nP@XtN2Kr./hTA";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setIndent("");
      String[] stringArray1 = new String[6];
      stringArray1[1] = "x-padText";
      stringArray1[2] = "?.cTU]eTm[";
      stringArray1[3] = "w9scWw";
      outputFormat0.parseOptions(stringArray1, 2);
      outputFormat0.parseOptions(stringArray1, 2);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-209));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -209
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[0] = ")Iv&wF~NxS9";
      stringArray0[1] = ")Iv&wF~NxS9";
      stringArray0[2] = "RDRxtgBTecRmaJ=v";
      OutputFormat outputFormat0 = new OutputFormat(")Iv&wF~NxS9", false, (String) null);
      outputFormat0.setEncoding("RDRxtgBTecRmaJ=v");
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("RDRxtgBTecRmaJ=v", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(")Iv&wF~NxS9", outputFormat0.getIndent());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[2];
      OutputFormat.createCompactFormat();
      stringArray0[0] = "-xhtmloK'@";
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String string0 = "a{?y";
      String string1 = "";
      outputFormat0.setEncoding("a{?y");
      outputFormat0.isNewlines();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('I');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (I)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, (String) null);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w9scWwnq2C`";
      stringArray0[1] = ")Iv&wF~NxS9";
      stringArray0[2] = "RDRxtgBTecRmaJ=v";
      stringArray0[3] = ")Iv&wF~NxS9";
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[5];
      stringArray1[0] = "-padText";
      stringArray1[1] = ")Iv&wF~NxS9";
      stringArray1[2] = null;
      stringArray1[3] = "";
      stringArray1[4] = null;
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setIndentSize(1);
      outputFormat0.setTrimText(true);
      outputFormat0.setIndentSize(1);
      outputFormat0.setLineSeparator("");
      outputFormat0.setEncoding("a{?y");
      outputFormat0.isNewlines();
      OutputFormat.createPrettyPrint();
      OutputFormat.createCompactFormat();
      outputFormat0.setPadText(false);
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("a{?y", outputFormat0.getEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(boolean0);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "-padText");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-padText";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "-padText";
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(boolean0);
      
      OutputFormat outputFormat1 = new OutputFormat();
      String string0 = outputFormat1.getEncoding();
      assertFalse(outputFormat1.isXHTML());
      assertFalse(outputFormat1.isTrimText());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isOmitEncoding());
      assertEquals("UTF-8", string0);
      assertFalse(outputFormat1.isPadText());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isNewlines());
      
      OutputFormat outputFormat2 = new OutputFormat("-padText", true);
      assertFalse(outputFormat2.isOmitEncoding());
      assertFalse(outputFormat2.isXHTML());
      assertFalse(outputFormat2.isExpandEmptyElements());
      assertEquals('\"', outputFormat2.getAttributeQuoteCharacter());
      assertFalse(outputFormat2.isSuppressDeclaration());
      assertFalse(outputFormat2.isTrimText());
      assertEquals("-padText", outputFormat2.getIndent());
      assertTrue(outputFormat2.isNewLineAfterDeclaration());
      assertTrue(outputFormat2.isNewlines());
      assertEquals("\n", outputFormat2.getLineSeparator());
      assertEquals("UTF-8", outputFormat2.getEncoding());
      assertFalse(outputFormat2.isPadText());
      assertEquals(0, outputFormat2.getNewLineAfterNTags());
      
      outputFormat0.setNewLineAfterDeclaration(true);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("-padText", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, "D");
      String[] stringArray0 = new String[0];
      outputFormat0.setIndent((String) null);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1384));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1384
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = true;
      OutputFormat outputFormat0 = new OutputFormat("", true, "-padText");
      OutputFormat outputFormat1 = new OutputFormat("", true, (String) null);
      outputFormat0.setEncoding((String) null);
      outputFormat0.isPadText();
      outputFormat1.setPadText(false);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = null;
      stringArray0[2] = "-xhtml-xhtml/dGg%p%_`X4A],Ip";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1587));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1587
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = true;
      OutputFormat outputFormat0 = new OutputFormat("HZ&lv2x2", true);
      outputFormat0.setNewlines(true);
      outputFormat0.isOmitEncoding();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "HZ&lv2x2";
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('s');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (s)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(".nP@XtN2Kr./hTA");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-trimTeVv";
      stringArray0[1] = "-trimTeVv";
      String[] stringArray1 = new String[0];
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = (-1);
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
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "";
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setXHTML(true);
      outputFormat0.isTrimText();
      outputFormat0.setNewLineAfterDeclaration(true);
      char char0 = 'e';
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('e');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (e)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("r#%X,1S");
      outputFormat0.setTrimText(false);
      outputFormat0.setLineSeparator("r#%X,1S");
      outputFormat0.setNewlines(false);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setPadText(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.getNewLineAfterNTags();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertEquals("r#%X,1S", outputFormat0.getLineSeparator());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setTrimText(false);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getIndent();
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat0.setIndent(true);
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat1.setLineSeparator((String) null);
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[0] = ")Iv&wF~NxS9";
      stringArray0[1] = ")Iv&wF~NxS9";
      stringArray0[2] = null;
      OutputFormat outputFormat0 = new OutputFormat(")Iv&wF~NxS9", false, (String) null);
      outputFormat0.setEncoding(stringArray0[2]);
      outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertEquals(")Iv&wF~NxS9", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9sccwnq2C`", false, "x-padText");
      outputFormat0.setNewLineAfterNTags(0);
      String[] stringArray0 = new String[2];
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(false);
      stringArray0[0] = "x-padText";
      OutputFormat outputFormat1 = new OutputFormat("x-padText", false, "x-padText");
      outputFormat1.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "w9sccwnq2C`";
      stringArray1[1] = "x-padText";
      stringArray1[2] = "x-padText";
      stringArray1[3] = "w9sccwnq2C`";
      stringArray1[4] = "x-padText";
      stringArray1[5] = "x-padText";
      outputFormat1.parseOptions(stringArray1, 0);
      String[] stringArray2 = new String[3];
      stringArray2[0] = "x-padText";
      stringArray2[1] = "w9sccwnq2C`";
      outputFormat1.setAttributeQuoteCharacter('\"');
      stringArray2[2] = "w9sccwnq2C`";
      outputFormat0.parseOptions(stringArray2, 0);
      outputFormat1.parseOptions(stringArray1, 0);
      outputFormat1.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-291676431));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -291676431
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, "x-padText");
      OutputFormat outputFormat1 = new OutputFormat("x-padText", true, "-expandEmptyRDRxtgBTecRmaJ=v");
      assertFalse(outputFormat1.isExpandEmptyElements());
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-expandEmptyRDRxtgBTecRmaJ=v";
      stringArray0[1] = ")Iv&wF~NxS9";
      stringArray0[2] = "-expandEmptyRDRxtgBTecRmaJ=v";
      stringArray0[3] = "RDRxtgBTecRmaJ=v";
      stringArray0[4] = "w9scWwnq2C`";
      stringArray0[5] = "x-padText";
      stringArray0[6] = ")Iv&wF~NxS9";
      int int0 = outputFormat1.parseOptions(stringArray0, 0);
      assertTrue(outputFormat1.isExpandEmptyElements());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String string0 = "/dGg%p%_`X4A],Ip";
      outputFormat0.setIndent("/dGg%p%_`X4A],Ip");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setAttributeQuoteCharacter('\'');
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w9scWwnq2C`";
      stringArray0[1] = "-encoding";
      stringArray0[2] = "RDRxtgBTecRmaJ=v";
      stringArray0[3] = "-encoding";
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`");
      outputFormat0.setXHTML(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", false, "cgo5pJxjX8$5w0");
      outputFormat0.setIndent("/dGg%p%_`X4A],Ip");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-indent";
      stringArray0[1] = "/dGg%p%_`X4A],Ip";
      stringArray0[2] = "";
      stringArray0[3] = "cgo5pJxjX8$5w0";
      stringArray0[4] = "-indent";
      stringArray0[5] = "/dGg%p%_`X4A],Ip";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("/dGg%p%_`X4A],Ip", outputFormat0.getIndent());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("w9scWwnq2C`", true, "x-padText");
      outputFormat0.setNewLineAfterNTags(0);
      OutputFormat outputFormat1 = new OutputFormat("-suppressDeclaration", true, (String) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[2] = "w9scWwnq2C`";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "-omitEncoding";
      OutputFormat outputFormat0 = new OutputFormat(".nP@XtN2Kr./hTA");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-omitEncoding";
      String[] stringArray1 = new String[0];
      int int0 = 2;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = true;
      OutputFormat outputFormat0 = new OutputFormat("w9s)W<nq2C`", true, "x-padText");
      String string0 = "+]@P";
      OutputFormat outputFormat1 = new OutputFormat("w9s)W<nq2C`", true, "+]@P");
      int int0 = 0;
      outputFormat0.setNewLineAfterNTags(0);
      OutputFormat outputFormat2 = new OutputFormat("-lineSeparator", true, "w9s)W<nq2C`");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(".nP@XtN2Kr./hTA");
      OutputFormat outputFormat1 = new OutputFormat("-trimText", true, "-trimText");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-trimText";
      stringArray0[2] = "x-pa^WdText";
      stringArray0[3] = "-trimText";
      stringArray0[4] = "x-pa^WdText";
      stringArray0[5] = "-trimText";
      stringArray0[7] = ".nP@XtN2Kr./hTA";
      outputFormat1.parseOptions(stringArray0, 2);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 2);
      outputFormat0.parseOptions(stringArray0, 2);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1478385201));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1478385201
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setXHTML(false);
      outputFormat0.setNewLineAfterNTags(39);
      OutputFormat outputFormat2 = new OutputFormat(".nP@XtN2Kr./hTA");
      outputFormat0.setIndent(true);
      OutputFormat outputFormat3 = new OutputFormat("x-pa^WdText", false, ".nP@XtN2Kr./hTA");
      outputFormat3.setIndent(true);
      outputFormat0.setIndent(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".nP@XtN2Kr./hTA";
      stringArray0[1] = "-trimText";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "-indentSize";
      stringArray0[4] = "x-pa^WdText";
      stringArray0[5] = "-xhtmloK'@";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"x-pa^WdText\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
