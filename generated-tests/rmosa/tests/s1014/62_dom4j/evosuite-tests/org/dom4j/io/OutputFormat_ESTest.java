/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 11:15:23 GMT 2018
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
  /*Coverage entropy=0.8717814824679821
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      String[] stringArray0 = new String[5];
      outputFormat0.setLineSeparator("-trimText");
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-inbntiae";
      stringArray0[3] = "-inbntiae";
      stringArray0[4] = "-inbntiae";
      outputFormat0.setPadText(true);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("-trimText", outputFormat0.getLineSeparator());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", false, "(q2 %ColAYbx");
      String string0 = outputFormat0.getEncoding();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("(q2 %ColAYbx", string0);
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("-lineSeparator", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("BY}UiQ={QQ<f1");
      String[] stringArray0 = new String[6];
      outputFormat0.setOmitEncoding(false);
      stringArray0[0] = "BY}UiQ={QQ<f1";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "BY}UiQ={QQ<f1";
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "BY}UiQ={QQ<f1";
      stringArray1[1] = "-expandEmpty";
      stringArray1[2] = "-expandEmpty";
      stringArray1[3] = "-expandEmpty";
      stringArray1[4] = "-expandEmpty";
      stringArray1[5] = "\n";
      stringArray1[6] = "-expandEmpty";
      stringArray1[7] = "-expandEmpty";
      stringArray1[8] = "-expandEmpty";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-356));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -356
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "-inbntiae";
      String string1 = "-suppressDeclaration";
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('C');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (C)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtmlsDM");
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-xhtmlsDM";
      stringArray0[1] = "-xhtmlsDM";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1747);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-inbntiae";
      outputFormat0.setEncoding("2qnv\"MM!");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("2qnv\"MM!", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      outputFormat0.setTrimText(false);
      stringArray0[1] = "-inbntiae";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1369));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1369
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7309439966762843
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      outputFormat0.setIndent(true);
      stringArray0[0] = "";
      stringArray0[1] = "-expandEmpty-xhtml^MQ+l?";
      stringArray0[2] = "\"Iqht3k";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent("\"Iqht3k");
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat1.setIndentSize(3089);
      outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.getEncoding();
      boolean boolean0 = outputFormat0.isPadText();
      assertTrue(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isXHTML());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isNewlines());
      
      outputFormat0.setNewlines(true);
      outputFormat0.setEncoding("");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "2bNew5[xw";
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\"I9ht3k";
      stringArray0[1] = "";
      stringArray0[2] = ")";
      stringArray0[3] = "";
      stringArray0[4] = "$e7&yA)|i)0/";
      stringArray0[5] = "";
      stringArray0[6] = "";
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setIndent((String) null);
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(boolean0);
      
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      
      outputFormat0.setOmitEncoding(false);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getIndent();
      outputFormat0.setLineSeparator("eL+");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setLineSeparator("R%PF+Bp");
      outputFormat0.isOmitEncoding();
      outputFormat0.setLineSeparator("<`EKkyF]");
      assertEquals("<`EKkyF]", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-inbntiae");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-inbntiae";
      outputFormat0.setIndent("");
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.setXHTML(true);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      outputFormat0.setIndentSize(2);
      assertEquals("  ", outputFormat0.getIndent());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-inbntiae";
      OutputFormat outputFormat1 = new OutputFormat((String) null);
      int int0 = outputFormat1.parseOptions(stringArray0, 0);
      assertTrue(outputFormat1.isSuppressDeclaration());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\"I9ht3k";
      stringArray0[1] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 3659);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-75));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -75
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = 0;
      String[] stringArray0 = new String[3];
      outputFormat0.setIndent(true);
      stringArray0[0] = "";
      stringArray0[1] = "-expandEmpty-xhtml^MQ+l?";
      OutputFormat outputFormat1 = new OutputFormat();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('#');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (#)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("uI+'R1:9L@Ii|$HzIOr");
      outputFormat0.setNewlines(true);
      outputFormat0.setNewLineAfterNTags(3162);
      outputFormat0.isXHTML();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(true);
      assertEquals(3162, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      boolean boolean1 = outputFormat0.isPadText();
      assertTrue(boolean1 == boolean0);
      
      String string0 = outputFormat0.getIndent();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertNull(string0);
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "}*FX)/K0JQ\\:'I&`qZ";
      OutputFormat outputFormat0 = new OutputFormat("}*FX)/K0JQ:'I&`qZ", true, "");
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.isTrimText();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat1.setSuppressDeclaration(false);
      outputFormat1.setSuppressDeclaration(true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      String string1 = "";
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('W');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (W)
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
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.isNewLineAfterDeclaration();
      assertEquals("", outputFormat0.getIndent());
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      outputFormat0.setIndentSize(2);
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtmlUTF-8", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "";
      outputFormat0.setLineSeparator("-xhtmlUTF-8");
      stringArray0[0] = "-encoding";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[0] = "";
      outputFormat0.setEncoding((String) null);
      assertEquals("-xhtmlUTF-8", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\"[9hmrjt3k";
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.getNewLineAfterNTags();
      outputFormat1.setXHTML(false);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat2.getNewLineAfterNTags();
      OutputFormat.createCompactFormat();
      outputFormat1.setLineSeparator("J=");
      outputFormat2.isTrimText();
      outputFormat1.getIndent();
      assertEquals("J=", outputFormat1.getLineSeparator());
      
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      outputFormat3.setPadText(false);
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, (String) null);
      outputFormat0.setAttributeQuoteCharacter('\'');
      String[] stringArray0 = null;
      outputFormat0.setEncoding((String) null);
      int int0 = (-4146);
      outputFormat0.setPadText(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, (-4146));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setTrimText(false);
      outputFormat0.setTrimText(true);
      outputFormat0.setIndentSize(896);
      outputFormat0.getLineSeparator();
      outputFormat0.isPadText();
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterNTags(1019);
      outputFormat0.setPadText(false);
      outputFormat0.isNewlines();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getLineSeparator();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent("\n");
      outputFormat0.setEncoding("");
      outputFormat0.isPadText();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.getIndent();
      outputFormat1.getEncoding();
      outputFormat0.setIndent("UTF-8");
      OutputFormat.createCompactFormat();
      outputFormat1.setEncoding(":@u5%b?FS'Y^M");
      OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat1.isNewlines();
      assertEquals(":@u5%b?FS'Y^M", outputFormat1.getEncoding());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent("Kj6dkF");
      OutputFormat outputFormat2 = new OutputFormat();
      outputFormat2.setNewlines(false);
      outputFormat2.setEncoding("V6");
      outputFormat2.setExpandEmptyElements(false);
      OutputFormat outputFormat3 = new OutputFormat("-xhtmlUTF-8", true, "-encoding");
      outputFormat3.setIndent("-encoding");
      outputFormat3.setLineSeparator("-encoding");
      outputFormat2.setPadText(true);
      outputFormat1.setIndent(true);
      outputFormat2.setOmitEncoding(false);
      OutputFormat outputFormat4 = OutputFormat.createCompactFormat();
      outputFormat4.getNewLineAfterNTags();
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setOmitEncoding(true);
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat5 = new OutputFormat("=pnCc 60]gH");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-xhtmlUTF-8";
      stringArray0[2] = "-encoding";
      stringArray0[3] = "Kj6dkF";
      outputFormat5.parseOptions(stringArray0, 0);
      outputFormat3.parseOptions(stringArray0, 39);
      outputFormat4.setIndentSize(0);
      outputFormat5.setNewLineAfterDeclaration(false);
      assertEquals("Kj6dkF", outputFormat5.getEncoding());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-inbntiae";
      String[] stringArray1 = new String[4];
      stringArray1[0] = "-newlines";
      stringArray1[1] = "-suppressDeclaration";
      stringArray1[2] = "-suppressDeclaration";
      stringArray1[3] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray1, 0);
      assertTrue(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isSuppressDeclaration());
      
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray2 = new String[2];
      stringArray2[0] = "-suppressDeclaration";
      stringArray2[1] = "";
      outputFormat1.parseOptions(stringArray2, 3480);
      assertFalse(outputFormat1.isPadText());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-indent";
      stringArray0[1] = "-inbntiae";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 2);
      assertEquals("-inbntiae", outputFormat0.getIndent());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String string0 = "-indentSize";
      String string1 = "";
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "-expandEmpty-xhtml^MQ+l?";
      String[] stringArray1 = new String[4];
      stringArray1[0] = "-indentSize";
      stringArray1[1] = "";
      stringArray1[3] = "";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("-lineSeparator");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent("-padText");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Kj6dkF";
      stringArray0[1] = "-expandEmptyQ";
      stringArray0[2] = "-padText";
      stringArray0[3] = "2bNew5[xw";
      stringArray0[6] = "s;M";
      stringArray0[5] = "2bNew5[xw";
      stringArray0[6] = "-lineSeparator";
      stringArray0[7] = "Kj6dkF";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat1.setTrimText(true);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-48));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -48
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
      String string0 = "-omitEncoding";
      OutputFormat outputFormat0 = new OutputFormat("-omitEncoding", false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-omitEncoding";
      stringArray0[2] = "-omitEncoding";
      stringArray0[3] = "-omitEncoding";
      stringArray0[2] = "-omitEncoding";
      int int0 = (-835);
      outputFormat0.setIndentSize((-835));
      stringArray0[5] = "-omitEncoding";
      stringArray0[2] = "-omitEncoding";
      stringArray0[7] = "-omitEncoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setLineSeparator("-trimText");
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-inbntiae";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "-inbntiae";
      stringArray0[4] = "-trimText";
      stringArray0[5] = "-trimText";
      stringArray0[6] = "-inbntiae";
      stringArray0[7] = "-inbntiae";
      stringArray0[8] = "-inbntiae";
      outputFormat0.parseOptions(stringArray0, 2914);
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("-trimText", outputFormat0.getLineSeparator());
      
      OutputFormat outputFormat1 = new OutputFormat("-inbntiae", false, "-inbntiae");
      OutputFormat.createPrettyPrint();
      outputFormat1.parseOptions(stringArray0, 1323);
      int int0 = outputFormat1.parseOptions(stringArray0, 2);
      assertEquals(3, int0);
  }
}