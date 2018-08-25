/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:28:20 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setLineSeparator("");
      outputFormat0.isPadText();
      outputFormat0.isXHTML();
      boolean boolean0 = outputFormat0.isXHTML();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setAttributeQuoteCharacter('\"');
      outputFormat0.setPadText(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent("!n\"<H@{OX}8,se'Vpan");
      outputFormat0.setTrimText(false);
      outputFormat0.setIndentSize((-1272));
      outputFormat0.setEncoding("!n\"<H@{OX}8,se'Vpan");
      assertEquals("!n\"<H@{OX}8,se'Vpan", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setLineSeparator("");
      outputFormat0.setEncoding("D:WKyI]{6+)uoONO&MM");
      outputFormat0.isOmitEncoding();
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setPadText(false);
      outputFormat0.getAttributeQuoteCharacter();
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertEquals("D:WKyI]{6+)uoONO&MM", outputFormat0.getEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      OutputFormat outputFormat0 = new OutputFormat("", false, "");
      outputFormat0.setSuppressDeclaration(false);
      String[] stringArray0 = null;
      outputFormat0.setNewlines(true);
      int int0 = 0;
      outputFormat0.setIndent("");
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, (-3209));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.8891591637540215
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent(true);
      boolean boolean0 = false;
      outputFormat0.setNewLineAfterDeclaration(false);
      boolean boolean1 = false;
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('K');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (K)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(0, int0);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(",lyS!", false, ",lyS!");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setEncoding((String) null);
      outputFormat0.setPadText(true);
      outputFormat0.setLineSeparator(",lyS!");
      outputFormat0.getEncoding();
      outputFormat0.isPadText();
      outputFormat0.getIndent();
      outputFormat0.isXHTML();
      outputFormat0.isTrimText();
      outputFormat0.setNewLineAfterDeclaration(false);
      assertEquals(",lyS!", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(";Cn8^YB&ly*r1xk,");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setTrimText(true);
      outputFormat0.isOmitEncoding();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewLineAfterNTags(0);
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent(true);
      outputFormat0.setPadText(true);
      outputFormat0.isNewlines();
      outputFormat0.getLineSeparator();
      outputFormat0.isOmitEncoding();
      outputFormat0.setLineSeparator("");
      outputFormat0.setLineSeparator("\n");
      outputFormat0.isOmitEncoding();
      outputFormat0.getLineSeparator();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\n";
      stringArray0[1] = "\n";
      stringArray0[2] = "\n";
      stringArray0[3] = "";
      stringArray0[4] = "\n";
      stringArray0[5] = "\n";
      stringArray0[6] = "\n";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setLineSeparator("D|bWynf^Nu.m");
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setNewlines(false);
      outputFormat0.setIndentSize(0);
      outputFormat0.isTrimText();
      outputFormat0.setExpandEmptyElements(true);
      assertTrue(outputFormat0.isPadText());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, (String) null);
      outputFormat0.getEncoding();
      String[] stringArray0 = new String[0];
      outputFormat0.setNewLineAfterNTags(1);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setOmitEncoding(false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('Z');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (Z)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false, "-expandEmpty");
      outputFormat0.isNewLineAfterDeclaration();
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("1", true);
      outputFormat0.setEncoding("");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "$6,%4&Q#SmT";
      stringArray0[1] = "";
      stringArray0[2] = "1";
      stringArray0[3] = "Pla8fV,5'RqXXyf(NL";
      stringArray0[4] = "_*~(_=*A]?";
      stringArray0[5] = "";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.setPadText(true);
      assertEquals("", outputFormat0.getEncoding());
      assertTrue(outputFormat0.isPadText());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent(false);
      outputFormat0.setNewLineAfterNTags(258);
      outputFormat1.isSuppressDeclaration();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewlines(true);
      outputFormat1.isExpandEmptyElements();
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('}');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (})
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.1240357221909014
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      OutputFormat outputFormat1 = new OutputFormat("BL1^#VXw^X[]", false);
      outputFormat1.setEncoding("BL1^#VXw^X[]");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "_*~(_=*A]?";
      stringArray0[1] = "BL1^#VXw^X[]";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "";
      stringArray0[4] = "-trimText";
      stringArray0[5] = "$6,%4&Q#SmT";
      stringArray0[6] = "_*~(_=*A]?";
      stringArray0[7] = "-trimText";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat1.setPadText(true);
      assertTrue(outputFormat1.isPadText());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false);
      outputFormat0.setAttributeQuoteCharacter('\'');
      outputFormat0.setNewLineAfterNTags(1206);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setTrimText(false);
      outputFormat0.getLineSeparator();
      outputFormat1.setNewLineAfterNTags(1206);
      OutputFormat.createPrettyPrint();
      outputFormat0.setIndent((String) null);
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0437938808441543
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      OutputFormat outputFormat1 = new OutputFormat("BL1^#VXw^X[]", false);
      outputFormat1.setEncoding("BL1^#VXw^X[]");
      outputFormat0.setNewLineAfterNTags((-2680));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "U2g1n76q>4[";
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
  //Test case number: 16
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      outputFormat0.setEncoding("BL1^#VXw^X[]");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-expandEmpty\n";
      stringArray0[3] = "-expandEmpty\n";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setPadText(false);
      outputFormat0.setIndent((String) null);
      OutputFormat outputFormat1 = new OutputFormat(":H8E8", false, "");
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('0');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (0)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8717814824679821
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml93XIvc&x0~!_", false, "-xhtml93XIvc&x0~!_");
      OutputFormat outputFormat1 = new OutputFormat("BL1^#VXw^X[]", false);
      outputFormat1.setEncoding("BL1^#VXw^X[]");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "F4";
      stringArray0[1] = "$6,%4&Q#SmT";
      stringArray0[2] = "-xhtml93XIvc&x0~!_";
      stringArray0[3] = "_*~(_=*A]?";
      stringArray0[4] = "-xhtml93XIvc&x0~!_";
      stringArray0[5] = "_*~(_=*A]?";
      stringArray0[6] = "$6,%4&Q#SmT";
      stringArray0[7] = "-xhtml93XIvc&x0~!_";
      stringArray0[8] = "Pla8fV,5'RqXXyf(NL";
      outputFormat1.parseOptions(stringArray0, 2);
      int int0 = outputFormat1.parseOptions(stringArray0, 4);
      assertEquals("BL1^#VXw^X[]", outputFormat1.getEncoding());
      assertEquals(5, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.649158683274018
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-omitEncoding");
      String[] stringArray0 = new String[1];
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      stringArray0[0] = "-omitEncoding";
      int int0 = 1;
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat0.setSuppressDeclaration(false);
      outputFormat1.setIndentSize(1);
      outputFormat1.setExpandEmptyElements(false);
      OutputFormat.createCompactFormat();
      outputFormat2.setNewLineAfterNTags(1);
      int int1 = 3514;
      outputFormat0.parseOptions(stringArray0, 3514);
      int int2 = 0;
      outputFormat1.parseOptions(stringArray0, 0);
      int int3 = 1;
      outputFormat1.parseOptions(stringArray0, 1);
      OutputFormat outputFormat3 = OutputFormat.createPrettyPrint();
      outputFormat2.parseOptions(stringArray0, 2111);
      outputFormat3.setXHTML(false);
      outputFormat2.parseOptions(stringArray0, 1769);
      outputFormat2.setEncoding("-omitEncoding");
      outputFormat1.parseOptions(stringArray0, 3514);
      outputFormat2.parseOptions(stringArray0, 1769);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1742));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1742
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7721393884375287
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      outputFormat0.setTrimText(true);
      outputFormat0.setIndent("BL1^#VXw^X[]");
      outputFormat0.setIndent("-indent");
      outputFormat0.getLineSeparator();
      outputFormat0.setTrimText(false);
      outputFormat0.setIndent(false);
      outputFormat0.setIndent("BL1^#VXw^X[]");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-trimText";
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat("$6,%4&Q#SmT");
      outputFormat1.parseOptions(stringArray0, 2);
      outputFormat1.setNewLineAfterNTags(3);
      outputFormat1.parseOptions(stringArray0, 489);
      int int0 = outputFormat0.parseOptions(stringArray0, 3);
      assertTrue(outputFormat0.isTrimText());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trismext", false, "-padText");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-padText";
      stringArray0[1] = "-padText";
      stringArray0[2] = "-padText";
      stringArray0[3] = "-padText";
      stringArray0[4] = "-padText";
      stringArray0[5] = "U2g1n76q>4[";
      stringArray0[6] = "-padText";
      stringArray0[7] = "U2g1n76q>4[";
      stringArray0[8] = "U2g1n76q>4[";
      outputFormat0.parseOptions(stringArray0, 2582);
      assertFalse(outputFormat0.isPadText());
      
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 492);
      assertTrue(outputFormat0.isPadText());
      assertEquals(492, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.9722469794234416
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "-xhDtml9m3XIvc&x0~!_");
      outputFormat0.setXHTML(false);
      outputFormat0.setSuppressDeclaration(false);
      OutputFormat outputFormat1 = new OutputFormat("-suppressDeclaration", false, "U2g1n76q>4[");
      outputFormat1.setTrimText(false);
      outputFormat1.setIndent("-xhtml_*~(_=*A]?");
      outputFormat1.setIndentSize(0);
      assertEquals("", outputFormat1.getIndent());
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "U2g1n76q>4[";
      OutputFormat outputFormat2 = new OutputFormat("-suppressDeclaration", false);
      outputFormat2.parseOptions(stringArray0, 0);
      outputFormat2.parseOptions(stringArray0, 1);
      assertEquals(0, outputFormat2.getNewLineAfterNTags());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.45056120886630463
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "UTF-8";
      stringArray0[1] = "-indentSize";
      stringArray0[2] = "ESf60?0`Ze/k|";
      stringArray0[3] = "^+,!=y\b):O]'n=40";
      int int0 = 1;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ESf60?0`Ze/k|\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.172993472439513
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "NN&s1?@lmKZa?0~mB";
      stringArray0[2] = "";
      outputFormat0.parseOptions(stringArray0, 3138);
      assertFalse(outputFormat0.isNewlines());
      
      stringArray0[3] = "Q7mwz$";
      stringArray0[4] = "BJ[3qjr";
      stringArray0[5] = "DJCii/o]$HD";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(1, int0);
  }
}