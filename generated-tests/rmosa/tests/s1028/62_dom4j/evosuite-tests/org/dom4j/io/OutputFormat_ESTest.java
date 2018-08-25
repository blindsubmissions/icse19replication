/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:20:12 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      outputFormat0.setSuppressDeclaration(true);
      boolean boolean0 = outputFormat0.isTrimText();
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      OutputFormat outputFormat0 = new OutputFormat("U#=q~uG:%aA4");
      outputFormat0.setTrimText(false);
      outputFormat0.setPadText(false);
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("U#=q~uG:%aA4", outputFormat0.getIndent());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6096120660994164
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent("-expandEmpty");
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "YEXOgsp}N";
      stringArray0[1] = "Czu9ZDhphHxzX";
      stringArray0[2] = "Czu9ZDhphHxzX";
      outputFormat0.setIndentSize(0);
      stringArray0[3] = "YEXOgsp}N";
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1798099455));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1798099455
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
      OutputFormat outputFormat0 = new OutputFormat("", false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setOmitEncoding(false);
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isPadText());
      assertFalse(outputFormat1.isOmitEncoding());
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isNewlines());
      assertTrue(outputFormat1.isTrimText());
      assertEquals("UTF-8", outputFormat1.getEncoding());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertFalse(outputFormat1.isXHTML());
      
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertTrue(boolean0);
      
      outputFormat0.isNewlines();
      boolean boolean1 = outputFormat0.isNewlines();
      boolean boolean2 = outputFormat0.isOmitEncoding();
      assertTrue(boolean2 == boolean1);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertEquals("", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(boolean2);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Czu9ZDjphHxyX";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewlines(true);
      int int0 = (-1955334592);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1955334592));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1955334592
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setLineSeparator("N|.6SyTqNL9Db[rDPt");
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.isNewlines();
      outputFormat0.setNewLineAfterNTags(0);
      assertEquals("N|.6SyTqNL9Db[rDPt", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.getIndent();
      outputFormat0.getLineSeparator();
      outputFormat0.setSuppressDeclaration(true);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('{');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ({)
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
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent("");
      OutputFormat outputFormat1 = new OutputFormat("", true, "-encoding");
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat1.setEncoding("-expandEmptyNVI(vX0$tB( ^");
      outputFormat0.setIndent("-encoding");
      outputFormat0.isOmitEncoding();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      String[] stringArray0 = new String[3];
      outputFormat0.setXHTML(false);
      stringArray0[0] = "Czu9ZDjphHxyX";
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1955334592));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1955334592
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      String[] stringArray0 = new String[3];
      outputFormat0.setIndentSize(1);
      outputFormat0.setNewLineAfterNTags(1);
      stringArray0[0] = "Czu9ZDjphHxyX";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = (-1955334592);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1955334592));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1955334592
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isPadText();
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-xhtmlN";
      stringArray0[1] = "-xhtmlN";
      outputFormat0.setIndent(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7902347553432827
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX'(tB(8^");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Czu9ZDhphHx}X";
      stringArray0[1] = "Czu9ZDhphHx}X";
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.parseOptions(stringArray0, 133);
      int int0 = 1;
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "Czu9ZDhphHx}X";
      stringArray1[1] = "Czu9ZDhphHx}X";
      stringArray1[2] = "Czu9ZDhphHx}X";
      outputFormat0.setIndent("");
      stringArray1[3] = "NVI(vX'(tB(8^";
      stringArray1[4] = "Czu9ZDhphHx}X";
      stringArray1[5] = "Czu9ZDhphHx}X";
      int int1 = (-1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Czu9ZDjphHxyX";
      outputFormat0.setLineSeparator("lxU1?v");
      outputFormat0.setIndent(true);
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = (-1955334592);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1955334592));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1955334592
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = true;
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('u');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (u)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setIndent(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setPadText(true);
      String string0 = OutputFormat.STANDARD_INDENT;
      assertEquals("  ", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX0$tB( ^");
      outputFormat0.setXHTML(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Czu9ZDhphHx}X";
      stringArray0[1] = "Czu9ZDhphHx}X";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setEncoding((String) null);
      assertTrue(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("^S*|7VI:");
      outputFormat0.setTrimText(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setNewLineAfterNTags(1044);
      outputFormat0.setTrimText(false);
      outputFormat0.setIndent(true);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.getEncoding();
      assertFalse(outputFormat0.isTrimText());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Czu9ZDjphHxyX";
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertEquals("Czu9ZDjphHxyX", outputFormat0.getIndent());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, int0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ";?bms>YyfM)e,O!~c";
      boolean boolean0 = false;
      OutputFormat outputFormat0 = new OutputFormat(";?bms>YyfM)e,O!~c", false, ";?bms>YyfM)e,O!~c");
      outputFormat0.setEncoding(";?bms>YyfM)e,O!~c");
      outputFormat0.setEncoding("rT)z73.rc{yM'x");
      outputFormat0.setNewlines(true);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setTrimText(false);
      outputFormat0.isXHTML();
      boolean boolean1 = false;
      int int0 = (-1291);
      outputFormat0.setIndentSize((-1291));
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('j');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (j)
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
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX0$tB( ^");
      outputFormat0.setXHTML(true);
      outputFormat0.setAttributeQuoteCharacter('\"');
      int int0 = 0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Czu9ZDhphHx}X";
      stringArray0[1] = "XRU)";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setOmitEncoding(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-3193));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3193
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setPadText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterNTags(1);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setNewlines(true);
      outputFormat0.setEncoding("");
      outputFormat0.setPadText(true);
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("", outputFormat0.getEncoding());
      assertEquals(1, outputFormat0.getNewLineAfterNTags());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      boolean boolean0 = outputFormat0.isPadText();
      assertFalse(boolean0);
      
      outputFormat0.setIndent((String) null);
      assertFalse(outputFormat0.isTrimText());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "-encoding";
      OutputFormat outputFormat0 = new OutputFormat("");
      String string1 = "T(CvQPu=,c&{&Jx3~";
      outputFormat0.setIndent("-encoding");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setExpandEmptyElements(true);
      int int0 = (-1909);
      boolean boolean0 = true;
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setIndentSize((-1909));
      outputFormat0.setAttributeQuoteCharacter('\'');
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "T(CvQPu=,c&{&Jx3~";
      stringArray0[2] = "T(CvQPu=,c&{&Jx3~";
      stringArray0[3] = "-encoding";
      stringArray0[4] = "T(CvQPu=,c&{&Jx3~";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1909));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1909
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "-lineSeparator";
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      outputFormat0.setIndent("-lineSeparator");
      outputFormat0.setOmitEncoding(true);
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "-lineSeparator";
      stringArray0[5] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration");
      assertFalse(outputFormat0.isSuppressDeclaration());
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-suppressDeclaration";
      stringArray0[2] = "-suppressDeclaration";
      stringArray0[3] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(4, int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = false;
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", false, "OAR.MA?J}\"iH]CjQ+T");
      outputFormat0.setPadText(true);
      OutputFormat outputFormat1 = new OutputFormat("N4S:-kmhcqf", true);
      outputFormat1.setExpandEmptyElements(false);
      outputFormat0.setIndent("dt");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-indentSize";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "dt";
      stringArray0[4] = "OAR.MA?J}\"iH]CjQ+T";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3486289544613381
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtmldt");
      outputFormat0.setIndent("-encoding");
      outputFormat0.setEncoding("-xhtmldt");
      outputFormat0.setIndent("-xhtmldt");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setIndentSize((-1909));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "";
      stringArray0[2] = "-xhtmldt";
      stringArray0[3] = "";
      stringArray0[4] = "-xhtmldt";
      stringArray0[5] = "-xhtmldt";
      stringArray0[6] = "N";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("", outputFormat0.getIndent());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.2592004731479975
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX0$tB( ^");
      outputFormat0.setIndent("-expandEmpty");
      OutputFormat outputFormat1 = new OutputFormat("-expandEmpty", true, "Czu9ZDhphHx}X");
      outputFormat1.setXHTML(false);
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Czu9ZDhphHx}X";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "-expandEmpty{EXOgeK.N";
      stringArray0[3] = "NVI(vX0$tB( ^";
      stringArray0[4] = "-expandEmpty";
      stringArray0[3] = "Czu9ZDhphHx}X";
      stringArray0[6] = "NVI(vX0$tB( ^";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setEncoding("NVI(vX0$tB( ^");
      int int0 = outputFormat1.parseOptions(stringArray0, 1);
      assertTrue(outputFormat1.isExpandEmptyElements());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDhphHx}X", true, "NVI(vX0$tB( ^");
      outputFormat0.setIndent("-expandEmpty");
      OutputFormat outputFormat1 = new OutputFormat("-expandEmpty", true, "Czu9ZDhphHx}X");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-padText";
      stringArray0[1] = "{EXOgeK.N";
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat2 = new OutputFormat("-xhtml|hvs c", false, "-xhtml|hvs c");
      outputFormat2.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.isPadText();
      OutputFormat outputFormat1 = new OutputFormat("0tc8&aHPEOwE;tkl!x_", false, "-trimText");
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat2.setIndent(" ");
      OutputFormat outputFormat3 = new OutputFormat(" ", true, "-expandEmptyNVI(vX'(tB(8^");
      outputFormat2.setIndent("-xhtml");
      outputFormat3.setLineSeparator("rvZ:;;7RkQ]");
      assertEquals("rvZ:;;7RkQ]", outputFormat3.getLineSeparator());
      
      outputFormat2.setXHTML(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setIndent(true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-xhtml";
      stringArray0[1] = "-expandEmptyNVI(vX'(tB(8^";
      stringArray0[2] = "-xhtml";
      outputFormat0.setIndent("@CH");
      String[] stringArray1 = new String[8];
      stringArray1[0] = " ";
      stringArray1[1] = "-trimText";
      stringArray1[2] = "rvZ:;;7RkQ]";
      stringArray1[3] = "-xhtml";
      stringArray1[4] = "-expandEmptyNVI(vX'(tB(8^";
      stringArray1[5] = "-trimText";
      stringArray1[6] = "rvZ:;;7RkQ]";
      stringArray1[7] = "rvZ:;;7RkQ]";
      outputFormat0.parseOptions(stringArray1, 1);
      int int0 = outputFormat2.parseOptions(stringArray0, 114);
      assertEquals(114, int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-newlines");
      outputFormat0.setIndent("-expandEmpty");
      outputFormat0.setIndent("-newlines");
      OutputFormat outputFormat1 = new OutputFormat();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "YEXOgsp}N";
      stringArray0[2] = "YEXOgsp}N";
      stringArray0[3] = "-newlines";
      stringArray0[4] = "-expandEmpty";
      stringArray0[5] = "-newlines";
      outputFormat0.parseOptions(stringArray0, 3);
      outputFormat1.parseOptions(stringArray0, 6);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setPadText(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setXHTML(true);
      outputFormat1.setIndent(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setNewLineAfterNTags((-1908977467));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-expandEmpty";
      stringArray0[3] = "1$qO7&\"&ko";
      stringArray0[4] = ">";
      stringArray0[5] = "m^Z^]-SW";
      stringArray0[6] = "H[mI?n5BVF1l4^lY(c*";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat2.parseOptions(stringArray0, 1223);
      int int0 = outputFormat2.parseOptions(stringArray0, 7);
      assertEquals((-1908977467), outputFormat2.getNewLineAfterNTags());
      assertEquals(7, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Czu9ZDjphHxyX");
      outputFormat0.setIndent("-expandEmpty");
      outputFormat0.setLineSeparator(")JtC");
      outputFormat0.setIndent("Czu9ZDjphHxyX");
      outputFormat0.setEncoding("-omitEncoding");
      outputFormat0.setIndent("-expandEmpty");
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-omitEncoding";
      stringArray0[2] = ")\"/eQ},";
      stringArray0[3] = "P.Wz8k#+k";
      stringArray0[4] = "Czu9ZDjphHxyX";
      stringArray0[5] = "YEXOgsp}N";
      stringArray0[6] = "Czu9ZDjphHxyX";
      stringArray0[7] = "Czu9ZDjphHxyX";
      stringArray0[8] = "YEXOgsp}N";
      outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      
      OutputFormat outputFormat1 = new OutputFormat(")JtC");
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
  }
}