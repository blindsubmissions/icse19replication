/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:01:12 GMT 2018
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[0];
      outputFormat0.setIndentSize(2);
      outputFormat1.setXHTML(false);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setTrimText(true);
      outputFormat1.setExpandEmptyElements(false);
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat0.isXHTML();
      outputFormat0.setXHTML(false);
      outputFormat1.isNewLineAfterDeclaration();
      outputFormat2.setIndentSize(1);
      outputFormat1.setNewLineAfterNTags(3686);
      assertEquals(3686, outputFormat1.getNewLineAfterNTags());
      
      outputFormat2.setPadText(false);
      assertEquals('\"', outputFormat2.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("DW-cZ+v8");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "DW-cZ+v8";
      stringArray0[1] = "DW-cZ+v8";
      outputFormat0.setXHTML(true);
      outputFormat0.setIndent("QWpHQmDZ");
      outputFormat0.parseOptions(stringArray0, 39);
      outputFormat1.parseOptions(stringArray0, 2346);
      outputFormat0.setIndent("DW-cZ+v8");
      outputFormat0.setEncoding("DW-cZ+v8");
      outputFormat1.setPadText(true);
      outputFormat1.setNewlines(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setLineSeparator("Xe%SEzs(0Od7");
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.getLineSeparator();
      outputFormat0.getEncoding();
      outputFormat1.getLineSeparator();
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('5');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (5)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isOmitEncoding();
      String[] stringArray0 = new String[2];
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setNewlines(true);
      stringArray0[0] = "YhaS{fmQ8";
      stringArray0[1] = "";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setXHTML(false);
      outputFormat2.isExpandEmptyElements();
      outputFormat2.setIndent("X2;eo,7i9{GVYV@vo/");
      outputFormat0.getNewLineAfterNTags();
      outputFormat1.setEncoding("");
      outputFormat1.getLineSeparator();
      outputFormat0.setNewlines(false);
      outputFormat1.getAttributeQuoteCharacter();
      outputFormat2.setIndent(false);
      outputFormat0.setEncoding("B0ZV(mQ<&%![xO|");
      assertFalse(outputFormat0.isNewlines());
      
      outputFormat1.setIndent("");
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("org.dom4j.io.OutputFormat");
      outputFormat0.isPadText();
      outputFormat0.setNewLineAfterNTags(1993);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndentSize(0);
      outputFormat0.setIndent("org.dom4j.io.OutputFormat");
      outputFormat0.isNewlines();
      outputFormat1.isPadText();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat1.setEncoding("org.dom4j.io.OutputFormat");
      outputFormat1.setIndent(false);
      outputFormat2.setIndentSize(1993);
      outputFormat0.isNewlines();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat1.setTrimText(true);
      outputFormat1.isXHTML();
      outputFormat1.setLineSeparator("");
      outputFormat0.setNewlines(true);
      outputFormat2.setOmitEncoding(false);
      outputFormat2.setNewLineAfterDeclaration(true);
      outputFormat0.setTrimText(true);
      assertEquals(1993, outputFormat0.getNewLineAfterNTags());
      
      outputFormat2.setTrimText(true);
      assertEquals('\"', outputFormat2.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(true);
      outputFormat0.getIndent();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setSuppressDeclaration(false);
      assertTrue(outputFormat0.isXHTML());
      
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent("");
      outputFormat1.getIndent();
      outputFormat1.setIndent("");
      assertFalse(outputFormat1.isXHTML());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent("");
      outputFormat0.setIndent(false);
      outputFormat0.setPadText(false);
      outputFormat0.setTrimText(true);
      outputFormat0.setExpandEmptyElements(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat1.setIndent(false);
      outputFormat1.setXHTML(true);
      outputFormat0.setIndentSize(34);
      outputFormat0.getIndent();
      outputFormat0.setTrimText(true);
      assertEquals("                                  ", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      outputFormat1.getLineSeparator();
      outputFormat1.isSuppressDeclaration();
      outputFormat0.getEncoding();
      outputFormat0.getIndent();
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 34);
      assertEquals(34, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setEncoding("");
      outputFormat1.setLineSeparator("");
      assertEquals("", outputFormat1.getEncoding());
      
      outputFormat0.setIndent(false);
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.getLineSeparator();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat0.isExpandEmptyElements();
      outputFormat0.isTrimText();
      outputFormat2.setXHTML(false);
      assertTrue(outputFormat2.isPadText());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.7363390511050665
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setNewlines(true);
      outputFormat0.setIndent("");
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.isTrimText();
      outputFormat0.isNewlines();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setIndentSize(121);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setEncoding("");
      outputFormat0.setIndent(true);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setIndent("");
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false);
      boolean boolean0 = false;
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setIndent((String) null);
      outputFormat0.setPadText(false);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.getEncoding();
      outputFormat0.setLineSeparator("UTF-8");
      outputFormat0.setEncoding("m>XsQ");
      outputFormat0.getNewLineAfterNTags();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.isTrimText();
      outputFormat1.setIndent(true);
      outputFormat1.setSuppressDeclaration(false);
      String[] stringArray0 = new String[6];
      stringArray0[0] = null;
      stringArray0[1] = "UTF-8";
      stringArray0[2] = "UTF-8";
      stringArray0[3] = "";
      stringArray0[4] = "UTF-8";
      stringArray0[5] = "UTF-8";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.145841752594754
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setEncoding("");
      outputFormat1.setEncoding("-trimText");
      outputFormat0.getLineSeparator();
      outputFormat1.setNewlines(true);
      outputFormat1.getAttributeQuoteCharacter();
      outputFormat0.setIndent(true);
      outputFormat0.setEncoding("");
      outputFormat1.setIndent("-trimText");
      outputFormat0.setAttributeQuoteCharacter('\"');
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "b\"e6T3q7{}-Za1W/OA";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "";
      stringArray0[4] = "-trimText";
      stringArray0[5] = "";
      stringArray0[6] = "v]]_&j";
      stringArray0[7] = "";
      int int0 = (-1818016389);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1818016389));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1818016389
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3519365335570375
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("%_>U/72H-D#^", false, "%_>U/72H-D#^");
      outputFormat0.setIndentSize(1);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "'X$-Dq>Wb011)hQgXy";
      stringArray0[1] = "-expandEmptyUTF-8";
      stringArray0[2] = "'X$-Dq>Wb011)hQgXy";
      stringArray0[3] = "%_>U/72H-D#^";
      stringArray0[4] = "-expandEmptyUTF-8";
      stringArray0[5] = "YhaS{f";
      stringArray0[6] = "YhaS{f";
      stringArray0[7] = "%_>U/72H-D#^";
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setLineSeparator("'X$-Dq>Wb011)hQgXy");
      outputFormat0.setNewLineAfterNTags((-964));
      outputFormat0.isTrimText();
      OutputFormat outputFormat2 = new OutputFormat("6*+)r");
      OutputFormat.createCompactFormat();
      outputFormat2.setEncoding("%_>U/72H-D#^");
      outputFormat2.parseOptions(stringArray0, 2306);
      outputFormat2.parseOptions(stringArray0, 2306);
      // Undeclared exception!
      try { 
        outputFormat2.setAttributeQuoteCharacter('^');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (^)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setEncoding((String) null);
      outputFormat0.setEncoding((String) null);
      char char0 = 'M';
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('M');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (M)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.9706688585251648
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[4];
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setExpandEmptyElements(true);
      stringArray0[0] = "_YNb6S/";
      outputFormat0.setTrimText(true);
      stringArray0[2] = "W9)^iX6ak: A(<W";
      stringArray0[3] = "F^I5Gr";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.getLineSeparator();
      outputFormat1.setExpandEmptyElements(true);
      OutputFormat outputFormat2 = new OutputFormat("-expandEmptyW9)^iX6ak: A(<W", true);
      outputFormat2.parseOptions(stringArray0, 0);
      outputFormat0.setTrimText(false);
      outputFormat2.setLineSeparator("*3WjL*&`I\"[R");
      outputFormat2.setAttributeQuoteCharacter('\'');
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('l');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (l)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.8778382404072829
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setTrimText(false);
      outputFormat0.setTrimText(false);
      outputFormat0.setXHTML(false);
      outputFormat0.isTrimText();
      outputFormat0.setEncoding("YhaS{f");
      OutputFormat outputFormat1 = new OutputFormat();
      OutputFormat outputFormat2 = new OutputFormat("-expandEmptyUTF-8", false, "-expandEmptyUTF-8");
      OutputFormat outputFormat3 = new OutputFormat("'X$-Dq>Wb011)hQgXy", true);
      OutputFormat outputFormat4 = new OutputFormat("-trimText", true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-trimText";
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[5];
      stringArray1[1] = "'X$-Dq>Wb011)hQgXy";
      stringArray1[2] = "-trimText";
      outputFormat1.setXHTML(true);
      stringArray1[3] = "-expandEmptyUTF-8";
      stringArray1[4] = "YhaS{f";
      outputFormat0.parseOptions(stringArray1, 1);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.922302845401487
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setTrimText(false);
      outputFormat0.setTrimText(true);
      outputFormat0.setXHTML(false);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat0.isTrimText();
      outputFormat1.setEncoding("");
      OutputFormat outputFormat2 = new OutputFormat();
      OutputFormat outputFormat3 = new OutputFormat("W9)^iX6ak: A(<W", true, "YhaS{f");
      OutputFormat outputFormat4 = new OutputFormat("YhaS{f", true);
      OutputFormat outputFormat5 = new OutputFormat("-xhtml", true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-xhtml";
      stringArray0[1] = "";
      stringArray0[2] = "W9)^iX6ak: A(<W";
      stringArray0[3] = "-xhtml";
      stringArray0[4] = "YhaS{f";
      outputFormat2.parseOptions(stringArray0, 0);
      int int0 = outputFormat2.getNewLineAfterNTags();
      assertTrue(outputFormat2.isXHTML());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3393717343898155
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isOmitEncoding();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      boolean boolean0 = true;
      OutputFormat.createPrettyPrint();
      outputFormat1.setOmitEncoding(true);
      outputFormat1.setNewlines(true);
      OutputFormat.createPrettyPrint();
      OutputFormat.createPrettyPrint();
      outputFormat1.isOmitEncoding();
      String string0 = "YZ";
      OutputFormat outputFormat2 = new OutputFormat("YZ", false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "YZ";
      String string1 = "-indent";
      stringArray0[1] = "-indent";
      int int0 = 1;
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, 1);
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
  /*Coverage entropy=2.120326196976829
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[3];
      outputFormat0.setIndent("m;!E42GZI*;f8<2IR");
      outputFormat0.setIndent(true);
      outputFormat0.setPadText(false);
      stringArray0[0] = "-newlines";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.isOmitEncoding();
      int int0 = 0;
      OutputFormat outputFormat2 = new OutputFormat("=9Blh", false);
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = new OutputFormat("-expandEmptyV^`_uqv[oA+", false);
      OutputFormat outputFormat4 = new OutputFormat("B4+sv", true);
      OutputFormat outputFormat5 = OutputFormat.createPrettyPrint();
      // Undeclared exception!
      try { 
        outputFormat5.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
