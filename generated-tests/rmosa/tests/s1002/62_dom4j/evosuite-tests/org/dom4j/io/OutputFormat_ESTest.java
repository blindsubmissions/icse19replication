/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:44:03 GMT 2018
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
  /*Coverage entropy=0.6598720137848266
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-xhtml-xhtml ";
      stringArray0[2] = "/]sL~B\"gK._yjX";
      stringArray0[3] = "-xhtml-xhtml ";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml-xhtml ";
      outputFormat0.setTrimText(false);
      outputFormat0.parseOptions(stringArray0, 296);
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "-xhtml-xhtml ";
      stringArray1[1] = "yxhtgl ";
      stringArray1[2] = "/]sL~B\"gK._yjX";
      outputFormat0.parseOptions(stringArray1, 0);
      int int0 = outputFormat0.parseOptions(stringArray1, 1);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6598720137848266
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-xhtml-xhtml ";
      stringArray0[2] = "/]sL~B\"gK._yjX";
      outputFormat0.setPadText(true);
      stringArray0[3] = "-xhtml-xhtml ";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml-xhtml ";
      outputFormat0.parseOptions(stringArray0, 296);
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "-xhtml-xhtml ";
      stringArray1[1] = "yxhtgl ";
      stringArray1[2] = "/]sL~B\"gK._yjX";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 1420);
      assertTrue(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isPadText());
      assertEquals(1420, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setNewLineAfterNTags(0);
      String[] stringArray0 = new String[8];
      outputFormat0.setOmitEncoding(true);
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "kY3h";
      outputFormat0.setSuppressDeclaration(true);
      stringArray0[6] = "";
      stringArray0[7] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[8];
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      stringArray0[0] = "-newlies";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      
      String[] stringArray1 = new String[7];
      stringArray1[0] = "BZ5";
      stringArray1[1] = "-newlies";
      stringArray1[2] = "-newlies";
      stringArray1[3] = "-newlies";
      stringArray1[4] = "-newlies";
      stringArray1[5] = "-newlies";
      stringArray1[6] = "-newlies";
      outputFormat1.parseOptions(stringArray1, 0);
      assertFalse(outputFormat1.isOmitEncoding());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertTrue(outputFormat1.isNewlines());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertFalse(outputFormat1.isXHTML());
      assertEquals("  ", outputFormat1.getIndent());
      assertEquals("UTF-8", outputFormat1.getEncoding());
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertTrue(outputFormat1.isTrimText());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertTrue(outputFormat1.isPadText());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      assertFalse(outputFormat0.isNewlines());
      
      outputFormat0.setNewlines(true);
      outputFormat0.isNewLineAfterDeclaration();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      outputFormat0.parseOptions(stringArray0, 20);
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6598720137848266
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-xhtml-xhtml ";
      stringArray0[2] = "/]sL~B\"gK._yjX";
      outputFormat0.setNewlines(true);
      stringArray0[3] = "-xhtml-xhtml ";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml-xhtml ";
      outputFormat0.parseOptions(stringArray0, 296);
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "-xhtml-xhtml ";
      stringArray1[1] = "yxhtgl ";
      stringArray1[2] = "/]sL~B\"gK._yjX";
      outputFormat0.parseOptions(stringArray1, 0);
      outputFormat0.parseOptions(stringArray1, 1);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding("zs8?^$Mn}");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "zs8?^$Mn}";
      stringArray0[1] = "zs8?^$Mn}";
      stringArray0[2] = "zs8?^$Mn}";
      stringArray0[3] = "zs8?^$Mn}";
      stringArray0[4] = "zs8?^$Mn}";
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent("%(p4..l,.q\"skPF9`j");
      outputFormat0.isXHTML();
      outputFormat0.getIndent();
      assertEquals("zs8?^$Mn}", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6245757807017087
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "*bFkc`bMY");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[1];
      OutputFormat.createCompactFormat();
      stringArray0[0] = "*bFkc`bMY";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setOmitEncoding(true);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-524172252));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -524172252
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(true);
      String[] stringArray0 = new String[9];
      stringArray0[6] = "-newlies";
      outputFormat0.setLineSeparator("-newlies");
      stringArray0[1] = "-newlies";
      stringArray0[2] = "-newlies";
      stringArray0[3] = "-newlies";
      stringArray0[4] = "-newlies";
      stringArray0[5] = "\n";
      stringArray0[6] = "-newlies";
      stringArray0[7] = "-newlies";
      stringArray0[8] = "-newlies";
      outputFormat0.parseOptions(stringArray0, 7);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3907));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3907
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-xhtml-xhtml ";
      outputFormat0.parseOptions(stringArray0, 296);
      outputFormat0.setNewLineAfterNTags(296);
      outputFormat0.parseOptions(stringArray0, 1004);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      assertFalse(outputFormat0.isPadText());
      
      outputFormat0.setPadText(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.isNewLineAfterDeclaration();
      String string0 = OutputFormat.STANDARD_INDENT;
      outputFormat0.isOmitEncoding();
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertTrue(outputFormat0.isPadText());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      assertEquals("yxhtgl ", outputFormat0.getIndent());
      
      outputFormat0.setIndent(true);
      assertEquals("  ", outputFormat0.getIndent());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "");
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("", outputFormat0.getIndent());
      assertEquals("", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      boolean boolean0 = outputFormat0.isSuppressDeclaration();
      assertTrue(outputFormat0.isNewlines());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("-lineSeparator", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6598720137848266
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "yxhtgl ";
      String string1 = "";
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ");
      String string2 = "-xhtml-xhtml ";
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-xhtml-xhtml ";
      String[] stringArray1 = new String[5];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "yxhtgl ";
      stringArray1[3] = "";
      stringArray1[4] = "yxhtgl ";
      outputFormat0.parseOptions(stringArray1, 0);
      stringArray0[2] = "/]sL~B\"gK._yjX";
      stringArray0[3] = "/]sL~B\"gK._yjX";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml-xhtml ";
      outputFormat0.parseOptions(stringArray0, 296);
      int int0 = 1;
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray2 = new String[3];
      stringArray2[0] = "-xhtml-xhtml ";
      stringArray2[1] = "yxhtgl ";
      stringArray2[2] = "/]sL~B\"gK._yjX";
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.parseOptions(stringArray2, 0);
      outputFormat0.parseOptions(stringArray2, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray2, (-1882790195));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1882790195
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      outputFormat0.setEncoding(stringArray0[2]);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("y79", false);
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertFalse(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("y79", outputFormat0.getIndent());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('k');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (k)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("cNQ~&d@wdv/0L");
      outputFormat0.setLineSeparator("Z(u6;!D=|'yPlZX");
      outputFormat0.isPadText();
      outputFormat0.setTrimText(false);
      assertEquals("Z(u6;!D=|'yPlZX", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags((-1));
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setIndent("(}V");
      outputFormat0.getEncoding();
      outputFormat0.setXHTML(false);
      outputFormat0.setXHTML(true);
      outputFormat0.isPadText();
      outputFormat0.isXHTML();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent(false);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setNewlines(false);
      assertEquals((-1), outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "*bFkc`bMY";
      outputFormat0.parseOptions(stringArray0, 0);
      String string0 = outputFormat0.getLineSeparator();
      assertFalse(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("\n", string0);
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setLineSeparator("");
      outputFormat0.setIndentSize(0);
      outputFormat0.setIndentSize((-1));
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(false);
      outputFormat0.isExpandEmptyElements();
      String string0 = OutputFormat.STANDARD_INDENT;
      outputFormat0.setExpandEmptyElements(false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "  ";
      stringArray0[1] = "  ";
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
  //Test case number: 22
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("27{RTD';Xv");
      outputFormat0.setNewLineAfterNTags((-1));
      assertEquals((-1), outputFormat0.getNewLineAfterNTags());
      
      OutputFormat outputFormat1 = new OutputFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-$X=n<m&0";
      stringArray0[1] = "";
      outputFormat1.parseOptions(stringArray0, 0);
      boolean boolean0 = outputFormat1.isXHTML();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setXHTML(false);
      outputFormat0.setIndent(false);
      outputFormat0.setEncoding("");
      outputFormat0.isTrimText();
      outputFormat0.setIndent("");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      outputFormat0.parseOptions(stringArray0, 1306);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setPadText(false);
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isOmitEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("yxhtgl ", true);
      assertEquals("yxhtgl ", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      outputFormat0.setIndent(false);
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent((String) null);
      outputFormat0.setIndentSize(0);
      String[] stringArray0 = null;
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
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-expandEmpty#,RLWYH`jy";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("D@b!yRl8");
      OutputFormat outputFormat1 = new OutputFormat("D3jelI1??1o^q");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "D@b!yRl8";
      stringArray0[1] = "";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "D@b!yRl8";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 2);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"D@b!yRl8\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding("-xhtmlO,%J$SNyVSAT");
      int int0 = 0;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*bFkc`bMY";
      int int1 = (-1848391248);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndentSize(0);
      OutputFormat outputFormat1 = new OutputFormat("_)w/=hhrA");
      outputFormat1.setEncoding("-xhtml ");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-xhtml ";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setSuppressDeclaration(false);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isSuppressDeclaration());
      
      OutputFormat outputFormat2 = new OutputFormat("sY#");
      outputFormat2.setTrimText(false);
      int int0 = outputFormat2.parseOptions(stringArray0, 0);
      assertEquals(2, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = 0;
      String[] stringArray0 = new String[3];
      stringArray0[2] = "-newlines";
      outputFormat0.setEncoding("-newlines");
      stringArray0[0] = "-newlines";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndentSize(0);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setOmitEncoding(true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "-newlines";
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat();
      assertFalse(outputFormat1.isPadText());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-padText";
      stringArray0[1] = "=mCR+@u>D1Hd./,qE";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 1);
      assertTrue(outputFormat1.isPadText());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndentSize(0);
      String string0 = "";
      OutputFormat outputFormat1 = new OutputFormat("", true);
      OutputFormat outputFormat2 = new OutputFormat("", false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      outputFormat1.parseOptions(stringArray0, 0);
      int int0 = (-1848391248);
      outputFormat2.parseOptions(stringArray0, 24);
      String string1 = "O,%J$SNyVSAT";
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isTrimText());
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "d%{/);+.v0E";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "5<C!hWO_kBaA";
      stringArray0[4] = "-xhtmlO,%J$S";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isTrimText());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat("_)w/=hhrA");
      outputFormat1.setEncoding("-xhtml ");
      OutputFormat outputFormat2 = new OutputFormat("_)w/=hhrA");
      outputFormat1.setEncoding("0iN|bXn}2cg;");
      assertEquals("0iN|bXn}2cg;", outputFormat1.getEncoding());
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-omitEncoding";
      outputFormat2.parseOptions(stringArray0, 0);
      OutputFormat outputFormat3 = new OutputFormat("");
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat("_)w/=hhrA");
      outputFormat1.setEncoding("-xhtmlr");
      outputFormat0.setSuppressDeclaration(false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-indent";
      stringArray0[1] = "_)w/=hhrA";
      stringArray0[2] = "-xhtmll=,tK e%";
      stringArray0[3] = "-xhtmlr";
      stringArray0[4] = "_)w/=hhrA";
      stringArray0[5] = "_)w/=hhrA";
      stringArray0[6] = "_)w/=hhrA";
      stringArray0[7] = "-xhtmlr";
      stringArray0[8] = "-xhtmlr";
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat2 = new OutputFormat();
      outputFormat2.parseOptions(stringArray0, 4);
      OutputFormat outputFormat3 = new OutputFormat("-xhtml");
      int int0 = 1;
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1793429746));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1793429746
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
