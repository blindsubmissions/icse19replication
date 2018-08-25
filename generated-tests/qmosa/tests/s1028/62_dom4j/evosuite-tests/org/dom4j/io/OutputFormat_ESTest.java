/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:34:17 GMT 2018
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
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("a<$bPwB1*)&0", false);
      outputFormat0.getLineSeparator();
      outputFormat0.setPadText(false);
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setXHTML(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setIndent(false);
      outputFormat0.setNewLineAfterNTags(2048);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "\n";
      stringArray0[1] = "\n";
      stringArray0[2] = "\n";
      outputFormat0.parseOptions(stringArray0, 967);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent(false);
      outputFormat0.setTrimText(false);
      outputFormat0.isOmitEncoding();
      outputFormat0.isTrimText();
      outputFormat0.getIndent();
      OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("\n");
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setPadText(true);
      assertTrue(outputFormat0.isPadText());
      
      String string0 = outputFormat1.getLineSeparator();
      assertEquals("\n", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "`UO?I,v1nNhV++Sb`B#";
      OutputFormat outputFormat0 = new OutputFormat("`UO?I,v1nNhV++Sb`B#", true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      boolean boolean0 = false;
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setTrimText(true);
      outputFormat0.isNewLineAfterDeclaration();
      int int0 = (-1247);
      outputFormat0.setIndentSize((-1247));
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewLineAfterNTags(1443);
      outputFormat0.setLineSeparator("`UO?I,v1nNhV++Sb`B#");
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent(true);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('Q');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (Q)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      OutputFormat.createCompactFormat();
      outputFormat0.setIndent("-expandEmpty");
      OutputFormat.createCompactFormat();
      OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterNTags((-1560));
      outputFormat0.setTrimText(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setEncoding("-expandEmpty");
      boolean boolean0 = outputFormat0.isPadText();
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setPadText(true);
      outputFormat0.setNewLineAfterNTags(0);
      OutputFormat.createPrettyPrint();
      outputFormat0.getIndent();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.isPadText();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.getEncoding();
      outputFormat0.setPadText(false);
      int int0 = (-1527);
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('R');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (R)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isPadText();
      outputFormat0.setXHTML(true);
      OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&Ie,mbRrs]tXh";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      outputFormat0.parseOptions(stringArray0, 0);
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
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "";
      OutputFormat outputFormat0 = new OutputFormat("");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('.');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (.)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("xJq2TIAa", false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.isXHTML();
      outputFormat0.setIndent("xJq2TIAa");
      outputFormat0.setIndentSize(39);
      outputFormat0.setIndent(true);
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "xJq2TIAa";
      stringArray0[1] = "xJq2TIAa";
      stringArray0[2] = "xJq2TIAa";
      stringArray0[3] = "xJq2TIAa";
      stringArray0[4] = "xJq2TIAa";
      stringArray0[5] = "xJq2TIAa";
      stringArray0[6] = "vFn--mg%";
      stringArray0[7] = "xJq2TIAa";
      outputFormat0.parseOptions(stringArray0, 34);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      assertEquals("  ", outputFormat0.getIndent());
      
      outputFormat0.setIndent(false);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.isXHTML();
      outputFormat0.setNewLineAfterNTags(0);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("cGvv)+ ", false);
      outputFormat0.setIndent("");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.isOmitEncoding();
      outputFormat0.isTrimText();
      outputFormat0.getLineSeparator();
      outputFormat0.setIndentSize(3792);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.isTrimText();
      OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterDeclaration(false);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5232109529528914
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setIndent(true);
      outputFormat0.getIndent();
      outputFormat0.setIndent(false);
      outputFormat0.setIndent("");
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setAttributeQuoteCharacter('\"');
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.getEncoding();
      outputFormat0.setIndent("");
      assertFalse(outputFormat0.isOmitEncoding());
      
      outputFormat1.setTrimText(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setNewLineAfterNTags(0);
      assertTrue(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("N4S:-kmhcqf", false, "dt");
      outputFormat0.setPadText(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent("dt");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "dt";
      stringArray0[1] = "N4S:-kmhcqf";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.getEncoding();
      outputFormat0.setIndent(false);
      outputFormat0.setIndent("dt");
      OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterNTags(271);
      outputFormat0.parseOptions(stringArray0, 0);
      boolean boolean0 = true;
      outputFormat0.setIndent(true);
      outputFormat0.setTrimText(false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('^');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (^)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setPadText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterNTags(1);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setNewlines(true);
      outputFormat0.setEncoding("");
      outputFormat0.setPadText(true);
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals(1, outputFormat0.getNewLineAfterNTags());
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "hKBx\"Lj@dhr)`mh/";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getLineSeparator();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("-indentSize");
      outputFormat0.setPadText(false);
      outputFormat1.setIndent(true);
      outputFormat1.setExpandEmptyElements(true);
      outputFormat1.setNewLineAfterNTags(1);
      outputFormat0.setIndent((String) null);
      assertEquals("-indentSize", outputFormat0.getEncoding());
      
      boolean boolean0 = outputFormat1.isNewlines();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX0$tB( ^");
      outputFormat0.setXHTML(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Czu9ZDhphHx}X";
      stringArray0[1] = "Czu9ZDhphHx}X";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setEncoding((String) null);
      assertTrue(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4978661367769952
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("N4S:-kmhcqf", false, "dt");
      outputFormat0.setPadText(false);
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = new OutputFormat("-indentSize");
      outputFormat1.setTrimText(true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "dt";
      stringArray0[2] = "dt";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"dt\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3906826278129532
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtmlT(CvQPu=,c&{&Jx3~";
      stringArray0[1] = "I)+4Xp{HcSg";
      outputFormat0.setTrimText(true);
      assertFalse(outputFormat0.isXHTML());
      
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewlines(false);
      outputFormat0.setIndent("I)+4Xp{HcSg");
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8346096344580884
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding");
      outputFormat0.setEncoding("-encoding");
      outputFormat0.setIndent("-encoding");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndentSize((-1909));
      OutputFormat outputFormat1 = new OutputFormat("-encoding");
      outputFormat0.setTrimText(true);
      outputFormat1.getNewLineAfterNTags();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-encoding";
      stringArray0[2] = "-encoding";
      stringArray0[3] = "-encoding";
      stringArray0[4] = "-encoding";
      stringArray0[5] = "-encoding";
      stringArray0[6] = "-encoding";
      stringArray0[7] = "-encoding";
      stringArray0[8] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945934775756114
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[7];
      outputFormat0.setTrimText(false);
      stringArray0[0] = "-omitEncoding";
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      stringArray0[1] = "ULr82G";
      outputFormat0.setIndentSize(0);
      stringArray0[2] = "UTF-8";
      stringArray0[3] = "(3";
      stringArray0[4] = "@&%\"@U";
      stringArray0[5] = "";
      stringArray0[6] = "-indentSize";
      outputFormat0.parseOptions(stringArray0, 39);
      outputFormat0.parseOptions(stringArray0, 788);
      outputFormat1.parseOptions(stringArray0, 0);
      char char0 = '3';
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('3');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (3)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6886531709811083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding");
      outputFormat0.setEncoding("-encoding");
      outputFormat0.setIndent("-encoding");
      OutputFormat outputFormat1 = new OutputFormat("_A$*^L", false, "-expandEmpty");
      outputFormat1.setSuppressDeclaration(true);
      outputFormat1.setExpandEmptyElements(false);
      outputFormat1.setIndentSize((-1909));
      OutputFormat outputFormat2 = new OutputFormat("-encoding");
      outputFormat1.setTrimText(false);
      outputFormat1.getNewLineAfterNTags();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-encoding";
      stringArray0[4] = "_A$*^L";
      stringArray0[5] = "_A$*^L";
      stringArray0[6] = "-encoding";
      stringArray0[7] = "-encoding";
      outputFormat1.parseOptions(stringArray0, 0);
      OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterDeclaration(true);
      assertEquals("-encoding", outputFormat0.getEncoding());
      
      OutputFormat outputFormat3 = OutputFormat.createPrettyPrint();
      outputFormat3.setOmitEncoding(false);
      assertEquals("  ", outputFormat3.getIndent());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0887454393489295
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-padText");
      outputFormat0.setIndent(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setEncoding("-padText");
      outputFormat1.setExpandEmptyElements(false);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewLineAfterNTags((-1735097809));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-padText";
      outputFormat0.setIndent("-padText");
      stringArray0[1] = "-padText";
      stringArray0[2] = "-padText";
      stringArray0[3] = "-padText";
      stringArray0[4] = "-padText";
      int int0 = 1;
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setIndent(false);
      String[] stringArray1 = null;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, 768);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.9706688585251648
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat2 = new OutputFormat("5{:[IEV<xvfhz97", false, "YF;y1h");
      outputFormat2.setSuppressDeclaration(false);
      outputFormat1.setTrimText(false);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "5{:[IEV<xvfhz97";
      stringArray0[1] = "hp";
      stringArray0[2] = "I)+4wp{Hcxg";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat0.setEncoding("-lineSeparator");
      outputFormat1.setAttributeQuoteCharacter('\'');
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('r');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (r)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.8989267893363289
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setTrimText(false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-indent";
      stringArray0[1] = "-expandEmptyu>>";
      stringArray0[2] = "-expandEmptyu>>";
      stringArray0[3] = "-expandEmptyu>>";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setEncoding("-expandEmptyu>>");
      char char0 = 'm';
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setTrimText(false);
      outputFormat1.setNewlines(false);
      outputFormat0.setExpandEmptyElements(false);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1970971278));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1970971278
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681098
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      outputFormat0.setTrimText(false);
      OutputFormat outputFormat1 = new OutputFormat("-newlines");
      String[] stringArray0 = new String[5];
      stringArray0[1] = "-newlines";
      OutputFormat outputFormat2 = new OutputFormat();
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "-padQText";
      OutputFormat outputFormat0 = new OutputFormat("-padQText");
      int int0 = 1;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-expandEmpty-padText";
      stringArray0[1] = "-expandEmpty-padText";
      String string1 = "XohjZ,^{^_H-(I";
      outputFormat0.setEncoding("XohjZ,^{^_H-(I");
      String string2 = "-suppressDeclaration";
      outputFormat0.setEncoding("-suppressDeclaration");
      String[] stringArray1 = new String[5];
      stringArray1[0] = "-suppressDeclaration";
      stringArray1[1] = "-xhtmlCzu9ZD=hphHx}X";
      stringArray1[2] = "-suppressDeclaration";
      stringArray1[3] = "-xhtmlCzu9ZD=hphHx}X";
      String string3 = "3CX/p,g).";
      stringArray1[4] = "3CX/p,g).";
      outputFormat0.parseOptions(stringArray1, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
