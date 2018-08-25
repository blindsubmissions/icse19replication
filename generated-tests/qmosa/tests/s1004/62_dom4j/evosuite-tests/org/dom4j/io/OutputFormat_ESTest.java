/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:22 GMT 2018
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
      OutputFormat outputFormat0 = new OutputFormat("  ", false, "");
      outputFormat0.setTrimText(false);
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
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setSuppressDeclaration(false);
      outputFormat0.setIndent("FYAfck,7%9");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('?');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (?)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String string0 = null;
      outputFormat0.setIndent((String) null);
      outputFormat0.setNewLineAfterNTags(1383);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      int int0 = 1;
      outputFormat1.setNewLineAfterNTags(1);
      outputFormat0.setIndent(false);
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat1.setNewlines(false);
      outputFormat1.getEncoding();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('X');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (X)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setNewLineAfterNTags(3729);
      outputFormat0.setIndent("");
      assertEquals(3729, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setNewlines(false);
      outputFormat0.isTrimText();
      outputFormat0.setTrimText(true);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setLineSeparator("`;TwFf]XeqsAH2t");
      outputFormat0.setLineSeparator("`;TwFf]XeqsAH2t");
      outputFormat0.getEncoding();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setLineSeparator((String) null);
      outputFormat1.setAttributeQuoteCharacter('\"');
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat0.isExpandEmptyElements();
      outputFormat2.setXHTML(true);
      outputFormat2.setExpandEmptyElements(true);
      outputFormat1.isPadText();
      outputFormat2.setNewLineAfterDeclaration(true);
      outputFormat1.getAttributeQuoteCharacter();
      outputFormat1.isXHTML();
      outputFormat2.setSuppressDeclaration(false);
      outputFormat0.isTrimText();
      outputFormat0.setIndentSize(0);
      assertEquals("`;TwFf]XeqsAH2t", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("VGv");
      boolean boolean0 = false;
      outputFormat0.setIndent(false);
      boolean boolean1 = false;
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setIndent(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.getLineSeparator();
      outputFormat0.setIndent("VGv");
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(false);
      char char0 = '$';
      outputFormat0.setXHTML(false);
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('$');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ($)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewLineAfterNTags(2008);
      outputFormat0.setEncoding(";m.eD8-9E+");
      outputFormat0.isTrimText();
      outputFormat0.getEncoding();
      outputFormat0.isExpandEmptyElements();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";m.eD8-9E+";
      stringArray0[1] = ";m.eD8-9E+";
      stringArray0[2] = ";m.eD8-9E+";
      int int0 = outputFormat0.parseOptions(stringArray0, 2008);
      assertEquals(";m.eD8-9E+", outputFormat0.getEncoding());
      assertEquals(2008, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setEncoding("p rg");
      outputFormat0.setPadText(false);
      outputFormat0.isOmitEncoding();
      outputFormat0.setPadText(false);
      assertEquals("p rg", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setLineSeparator("+");
      OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterNTags((-2303));
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent("Phi");
      outputFormat0.setXHTML(false);
      outputFormat1.setSuppressDeclaration(false);
      outputFormat0.setIndent("+");
      outputFormat0.setIndent(true);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      OutputFormat.createCompactFormat();
      outputFormat2.setNewLineAfterNTags(0);
      outputFormat2.setNewLineAfterDeclaration(true);
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat0.setIndent(true);
      outputFormat2.isSuppressDeclaration();
      outputFormat1.getIndent();
      outputFormat0.isNewLineAfterDeclaration();
      assertEquals("+", outputFormat0.getLineSeparator());
      
      boolean boolean0 = outputFormat1.isXHTML();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.isNewlines();
      outputFormat0.setEncoding("Y");
      outputFormat0.isSuppressDeclaration();
      String string0 = "";
      String string1 = "?{6f s6l{zzo,f0PE";
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Y";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3688));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3688
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setPadText(true);
      String string0 = null;
      outputFormat0.setEncoding((String) null);
      int int0 = 5234;
      outputFormat0.setNewLineAfterNTags((-545));
      outputFormat0.setNewLineAfterNTags(5234);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('%');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (%)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7309439966762843
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setNewLineAfterNTags((-1731));
      outputFormat1.setIndentSize(2409);
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setOmitEncoding(false);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtmlUT`i8";
      stringArray0[1] = "Invalid attribute quote character (";
      stringArray0[2] = "H2sa:m)tJ}1@";
      stringArray0[3] = "BZC~\"Y+,#SRg:G|6";
      stringArray0[4] = "";
      stringArray0[5] = "un}R6md6]/'^oq1C8";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.setEncoding("");
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9376664956966976
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setNewLineAfterNTags((-1723));
      outputFormat1.setIndentSize(2409);
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat2 = new OutputFormat("|I7Gic", false);
      outputFormat2.setEncoding("|I7Gic");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "|I7Gic";
      stringArray0[2] = "|I7Gic";
      stringArray0[3] = "|I7Gic";
      stringArray0[4] = "=QsnagAWG5<DDrB=";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat2.setOmitEncoding(false);
      assertEquals("|I7Gic", outputFormat2.getEncoding());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3030924037617193
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("\"{?`P[j//y f,g", false);
      OutputFormat outputFormat1 = new OutputFormat("Q3Y\"oHe}E", true);
      outputFormat1.setEncoding("\"{?`P[j//y f,g");
      outputFormat1.setOmitEncoding(true);
      outputFormat1.setNewLineAfterNTags(2);
      OutputFormat outputFormat2 = new OutputFormat("\n", false);
      outputFormat2.setEncoding("-indentSize");
      int int0 = 0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "\"{?`P[j//y f,g";
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"{?`P[j//y f,g\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty[A0");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpty[A0";
      stringArray0[1] = "-expandEmpty[A0";
      stringArray0[2] = "-expandEmpty[A0";
      stringArray0[3] = "-expandEmpty[A0";
      stringArray0[4] = "-expandEmpty[A0";
      stringArray0[5] = "-expandEmpty[A0";
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[0];
      outputFormat0.parseOptions(stringArray1, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-893));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -893
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4978661367769952
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("\"{?`P[j//y f,g", false);
      OutputFormat outputFormat1 = new OutputFormat("Q3Y\"oHe}E", true);
      outputFormat1.setEncoding("\"{?`P[j//y f,g");
      String[] stringArray0 = new String[1];
      OutputFormat outputFormat2 = new OutputFormat("-omitEncoding", true);
      String[] stringArray1 = new String[4];
      stringArray1[0] = "-omitEncoding";
      stringArray1[1] = "Q3Y\"oHe}E";
      stringArray1[2] = "8P{";
      stringArray1[3] = "Q3Y\"oHe}E";
      outputFormat2.parseOptions(stringArray1, 0);
      OutputFormat outputFormat3 = new OutputFormat("-newlines");
      outputFormat2.setOmitEncoding(false);
      outputFormat2.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('_');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (_)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.829081436908226
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setNewLineAfterNTags((-1723));
      outputFormat0.setIndentSize(2396);
      outputFormat0.setNewLineAfterNTags((-1723));
      OutputFormat outputFormat2 = new OutputFormat("-indentSize");
      outputFormat2.setOmitEncoding(false);
      outputFormat1.setEncoding("-lineSeparator");
      outputFormat2.setIndent(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-newlines";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "-newlines";
      stringArray0[5] = "-newlines";
      stringArray0[6] = "-newlines";
      outputFormat1.parseOptions(stringArray0, 1);
      outputFormat1.setOmitEncoding(false);
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
  //Test case number: 17
  /*Coverage entropy=1.6661022550876021
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(false);
      OutputFormat outputFormat1 = new OutputFormat("6adgooSQ", false);
      OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-encoding";
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
  //Test case number: 18
  /*Coverage entropy=1.1894736293243366
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "!f#Gi>Y!,JsaHaJsP";
      stringArray0[1] = "-padText";
      stringArray0[2] = "-padText";
      stringArray0[3] = "!f#Gi>Y!,JsaHaJsP";
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat1 = new OutputFormat();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat0.parseOptions(stringArray0, 47);
      assertTrue(outputFormat0.isPadText());
      
      outputFormat2.parseOptions(stringArray0, 47);
      assertFalse(outputFormat2.isPadText());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newli{es";
      stringArray0[1] = "h/rB4k$Z$n)sxOZ[";
      OutputFormat outputFormat1 = new OutputFormat((String) null, true);
      outputFormat1.parseOptions(stringArray0, 3335);
      OutputFormat outputFormat2 = new OutputFormat("R4N/)|8o`|2");
      outputFormat2.setXHTML(false);
      OutputFormat outputFormat3 = new OutputFormat("-xhtml)", true, "-xhtml)");
      outputFormat3.setIndent("g1#+]GUE@elF)6");
      outputFormat0.setAttributeQuoteCharacter('\'');
      outputFormat0.parseOptions(stringArray0, 3335);
      // Undeclared exception!
      try { 
        outputFormat3.parseOptions(stringArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.252728336819822
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setEncoding("<B^4Jny:%2tTH;Dr0");
      outputFormat0.setTrimText(true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "-indent";
      stringArray0[2] = "(`D]#%";
      outputFormat0.setXHTML(true);
      stringArray0[3] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 4);
      outputFormat0.parseOptions(stringArray0, 4);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("(`D]#%", outputFormat0.getIndent());
      assertEquals(4, int0);
  }
}
