/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:41:40 GMT 2018
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
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      assertFalse(outputFormat0.isTrimText());
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.setTrimText(true);
      outputFormat0.setNewlines(false);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 34);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isTrimText());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "y_2)u Rv3-Vt}r";
      stringArray0[2] = "-newlines";
      outputFormat0.setNewlines(false);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("^>\"n]wdes");
      String[] stringArray0 = new String[1];
      outputFormat0.setSuppressDeclaration(false);
      stringArray0[0] = "-paIdText";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("^>\"n]wdes", outputFormat0.getIndent());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat.createCompactFormat();
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
  //Test case number: 4
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(false);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 34);
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-2886));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2886
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "I:YkIo9WN4j[-%k+";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals(0, int0);
      
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(boolean0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("");
      outputFormat0.setIndent(false);
      outputFormat0.getLineSeparator();
      outputFormat0.isPadText();
      outputFormat0.setLineSeparator("9sZa$DvJ1v");
      assertEquals("9sZa$DvJ1v", outputFormat0.getLineSeparator());
      
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setExpandEmptyElements(false);
      outputFormat1.setXHTML(false);
      boolean boolean0 = outputFormat1.isNewLineAfterDeclaration();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getLineSeparator();
      OutputFormat outputFormat1 = new OutputFormat("-newlines");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "y_2)u Rv3-Vt}r";
      stringArray0[2] = "-newlines";
      stringArray0[3] = "M.K+l*bX";
      outputFormat0.parseOptions(stringArray0, 34);
      outputFormat1.setPadText(true);
      OutputFormat outputFormat2 = new OutputFormat();
      outputFormat1.isSuppressDeclaration();
      assertTrue(outputFormat1.isPadText());
      
      OutputFormat outputFormat3 = new OutputFormat("\n");
      boolean boolean0 = outputFormat3.isXHTML();
      assertFalse(outputFormat3.isPadText());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setPadText(true);
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertEquals('\"', char0);
      
      outputFormat0.setPadText(true);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indentSize");
      boolean boolean0 = outputFormat0.isNewlines();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("-indentSize", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(boolean0);
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      String[] stringArray1 = new String[6];
      stringArray1[0] = "";
      stringArray1[1] = "-nhwdes";
      stringArray1[2] = "-nhwdes";
      stringArray1[3] = "-nhwdes";
      stringArray1[4] = "-nhwdes";
      stringArray1[5] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.setLineSeparator("-xhtml-newdies");
      stringArray0[1] = "-nhwdes";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-xhtml-newdies", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      outputFormat0.setXHTML(false);
      outputFormat0.getEncoding();
      outputFormat0.setXHTML(false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ($)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false);
      outputFormat0.setIndent((String) null);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isNewlines());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.setIndent("-nhwdes");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("-nhwdes", outputFormat0.getIndent());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      String[] stringArray0 = new String[9];
      outputFormat0.setIndentSize(1529);
      stringArray0[0] = "-newlines";
      stringArray0[1] = "y_2)u Rv3-Vt}r";
      stringArray0[2] = "-newlines";
      outputFormat0.setNewlines(false);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent(true);
      outputFormat0.isNewLineAfterDeclaration();
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      outputFormat0.setExpandEmptyElements(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-newdies";
      stringArray0[1] = "-newdies";
      outputFormat0.setEncoding("-newdies");
      outputFormat0.setNewlines(false);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 9);
      assertEquals("-newdies", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.375024252984546
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-nhwdes");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-nhwdes";
      stringArray0[1] = "-nhwdes";
      outputFormat0.setNewlines(false);
      int int0 = 0;
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "b]Pk=/";
      stringArray1[1] = "-nhwdes";
      stringArray1[2] = "b]Pk=/";
      stringArray1[3] = "-nhwdes";
      OutputFormat.createPrettyPrint();
      stringArray1[4] = "-nhwdes";
      stringArray1[5] = "-nhwdes";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3425));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3425
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("l,h%)Nl(:(HL", false);
      outputFormat0.setIndent(false);
      outputFormat0.getIndent();
      String[] stringArray0 = null;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("\n");
      assertEquals("\n", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "\n";
      stringArray0[1] = "";
      outputFormat0.parseOptions(stringArray0, 1977);
      outputFormat0.parseOptions(stringArray0, 1977);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getLineSeparator();
      OutputFormat outputFormat1 = new OutputFormat("-newlines");
      String[] stringArray0 = new String[9];
      outputFormat1.isTrimText();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter(' ');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ( )
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("5FJ(YYAS*##0");
      outputFormat0.setIndent((String) null);
      int int0 = 1;
      String[] stringArray0 = new String[6];
      stringArray0[0] = null;
      stringArray0[1] = "T%_K2*Sx";
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-2624));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2624
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("M.K+l*bX");
      outputFormat0.setEncoding("M.K+l*bX");
      boolean boolean0 = false;
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setIndent(false);
      outputFormat1.setNewlines(true);
      outputFormat0.isOmitEncoding();
      char char0 = '\'';
      OutputFormat outputFormat2 = new OutputFormat("", false, "-indentSize");
      // Undeclared exception!
      try { 
        outputFormat2.setAttributeQuoteCharacter('3');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (3)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "y_2)u Rv3-Vt}r";
      stringArray0[2] = "-newlines";
      outputFormat0.setIndent(true);
      outputFormat0.setNewlines(false);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = ",!'";
      String string1 = "";
      OutputFormat outputFormat0 = new OutputFormat(",!'", false, "");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setEncoding("");
      outputFormat0.setNewlines(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setIndentSize(0);
      outputFormat0.setNewlines(false);
      outputFormat0.setIndent(false);
      outputFormat0.setNewlines(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setLineSeparator(",!'");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setPadText(false);
      outputFormat0.setNewlines(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('9');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (9)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      outputFormat0.setAttributeQuoteCharacter('\"');
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "y_2)u Rv3-Vt}r";
      stringArray0[2] = "y_2)u Rv3-Vt}r";
      outputFormat0.setIndentSize((-1));
      outputFormat0.parseOptions(stringArray0, 3238);
      outputFormat0.parseOptions(stringArray0, 3238);
      assertEquals("", outputFormat0.getIndent());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      outputFormat0.setSuppressDeclaration(false);
      stringArray0[0] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newdes");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newdes";
      stringArray0[1] = "-newdes";
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setNewlines(false);
      outputFormat0.setAttributeQuoteCharacter('\'');
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setExpandEmptyElements(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3234));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3234
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.611157817343917
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("5FJ(YYAS*##0");
      outputFormat0.setIndent((String) null);
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setIndentSize((-13));
      outputFormat0.setNewLineAfterNTags(172);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-lineSeparator";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("", outputFormat0.getIndent());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.328515191203992
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "-xhtml)";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indentSize");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-padText";
      outputFormat0.setNewLineAfterDeclaration(true);
      stringArray0[1] = "-indentSize";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "-indentSize";
      stringArray0[4] = "-indentSize";
      stringArray0[5] = "-padText";
      stringArray0[6] = "nlP`W('h+jfY,";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-indentSize\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "'";
      stringArray0[2] = "8r*&8d\u0001";
      stringArray0[3] = "'YJFX=fDz|{=";
      stringArray0[4] = "-linSe";
      stringArray0[5] = "-expandEmpty5FJ(YYAS*##0";
      stringArray0[6] = "lCxj=xM6`Q";
      stringArray0[7] = "Ze,vl](MF6";
      stringArray0[8] = "      ";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isOmitEncoding());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newdes");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-padText";
      outputFormat0.setNewLineAfterDeclaration(true);
      stringArray0[1] = "-newdes";
      stringArray0[2] = "-newdes";
      stringArray0[3] = "-newdes";
      stringArray0[4] = "-newdes";
      stringArray0[5] = "";
      stringArray0[6] = "nlP`W('h+GjSfY,";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewlines(true);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setLineSeparator("-newdes");
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "nlP`W('h+GjSfY,";
      stringArray1[1] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray1, 1);
      assertEquals("-newdes", outputFormat0.getLineSeparator());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setNewlines(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "5FJ(YYAS*##0";
      stringArray0[2] = "-expandEmpty5FJ(YYAS*##0";
      stringArray0[3] = "5FJ(YYAS*##0";
      stringArray0[4] = "5FJ(YYAS*##0";
      stringArray0[5] = "";
      outputFormat0.parseOptions(stringArray0, 2);
      int int0 = outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "-trimText");
      assertFalse(outputFormat0.isPadText());
      
      outputFormat0.setPadText(true);
      outputFormat0.getNewLineAfterNTags();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-paIdText";
      stringArray0[0] = "-trimText";
      outputFormat1.parseOptions(stringArray0, 0);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      outputFormat1.setNewlines(false);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat3.parseOptions(stringArray0, 1);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isPadText());
      
      int int0 = outputFormat2.parseOptions(stringArray0, 0);
      assertEquals(1, int0);
  }
}
