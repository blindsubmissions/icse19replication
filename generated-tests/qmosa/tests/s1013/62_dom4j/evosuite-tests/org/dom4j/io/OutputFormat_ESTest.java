/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:22:15 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setTrimText(false);
      outputFormat0.isPadText();
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setEncoding("XvjcK#D*H^,");
      outputFormat0.setIndentSize(0);
      outputFormat0.getEncoding();
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals("XvjcK#D*H^,", outputFormat0.getEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = 2;
      outputFormat0.setIndent("");
      outputFormat0.setEncoding("");
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
  //Test case number: 2
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String string0 = outputFormat0.getIndent();
      assertTrue(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("  ", string0);
      assertTrue(outputFormat0.isPadText());
      
      String[] stringArray0 = new String[6];
      stringArray0[0] = "  ";
      stringArray0[1] = "  ";
      stringArray0[2] = "  ";
      stringArray0[3] = "  ";
      stringArray0[4] = "  ";
      stringArray0[5] = "  ";
      int int0 = outputFormat1.parseOptions(stringArray0, 1461);
      assertFalse(outputFormat1.isPadText());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertFalse(outputFormat1.isXHTML());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat1.getEncoding());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertTrue(outputFormat1.isTrimText());
      assertEquals(1461, int0);
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isOmitEncoding());
      assertFalse(outputFormat1.isNewlines());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator");
      outputFormat0.setLineSeparator("");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent(true);
      outputFormat1.setIndentSize(0);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.isNewlines();
      outputFormat1.setExpandEmptyElements(true);
      assertEquals("", outputFormat1.getIndent());
      
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      assertTrue(outputFormat2.isTrimText());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("M");
      outputFormat0.setOmitEncoding(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "M";
      stringArray0[1] = "M";
      stringArray0[2] = "M";
      stringArray0[3] = "M";
      stringArray0[4] = "M";
      stringArray0[5] = "M";
      stringArray0[6] = "M";
      stringArray0[7] = "M";
      outputFormat0.setNewLineAfterDeclaration(true);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("M", outputFormat0.getIndent());
      assertEquals(1, int0);
      
      outputFormat0.setIndent(false);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setIndent(false);
      outputFormat0.setEncoding("");
      outputFormat0.setTrimText(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.isTrimText();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.isPadText();
      outputFormat0.setOmitEncoding(true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.parseOptions(stringArray0, 2);
      OutputFormat.createPrettyPrint();
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndentSize(1518);
      outputFormat0.isTrimText();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent(true);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setTrimText(true);
      outputFormat0.setPadText(true);
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertFalse(boolean0);
      
      outputFormat1.setOmitEncoding(true);
      assertTrue(outputFormat1.isOmitEncoding());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Q7n{|T2G ", true, "Q7n{|T2G ");
      outputFormat0.getLineSeparator();
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "PnEHP``gM/}Sf";
      stringArray0[1] = "\n";
      stringArray0[2] = "";
      stringArray0[3] = "Q7n{|T2G ";
      stringArray0[4] = "\n";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1904));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1904
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewlines(true);
      outputFormat0.setIndentSize(1163);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[8];
      outputFormat0.setOmitEncoding(false);
      stringArray0[0] = "";
      stringArray0[1] = "h(tn!%jCX!D#u~p";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "QbmG+cJ@:I DvsB";
      stringArray0[5] = "";
      stringArray0[6] = " ^>qVAPYyJ#";
      outputFormat0.setIndent("");
      stringArray0[7] = "Invalid attribute quote character (";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-605));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -605
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.getLineSeparator();
      outputFormat0.setEncoding("\n");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterNTags(1534);
      outputFormat1.setIndentSize((-1));
      outputFormat0.setIndent((String) null);
      outputFormat0.setEncoding("3*kK(3?y#W 40UB");
      outputFormat2.setSuppressDeclaration(false);
      outputFormat0.setNewlines(false);
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setNewlines(true);
      outputFormat0.setIndent("!!CMCY1#}_[0j6");
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setIndentSize((-567));
      outputFormat0.setXHTML(false);
      outputFormat2.isPadText();
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions((String[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      outputFormat0.setEncoding((String) null);
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.isNewlines();
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.setNewLineAfterNTags(0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setOmitEncoding(false);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat1.isSuppressDeclaration();
      outputFormat1.isTrimText();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      assertTrue(outputFormat2.isTrimText());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false);
      boolean boolean0 = outputFormat0.isNewLineAfterDeclaration();
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("-expandEmpty", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(boolean0);
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      outputFormat0.getAttributeQuoteCharacter();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent((String) null);
      outputFormat0.setXHTML(false);
      outputFormat1.getNewLineAfterNTags();
      outputFormat0.setEncoding("i8p=cfVPrliWgm0]");
      assertEquals("i8p=cfVPrliWgm0]", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setEncoding((String) null);
      outputFormat0.setTrimText(false);
      outputFormat0.setIndentSize(0);
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setEncoding((String) null);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setLineSeparator("/^GqLcP");
      outputFormat0.isPadText();
      outputFormat1.setTrimText(false);
      outputFormat1.setIndent((String) null);
      outputFormat1.setNewlines(true);
      outputFormat1.getLineSeparator();
      outputFormat0.isXHTML();
      outputFormat1.isSuppressDeclaration();
      outputFormat0.setNewlines(false);
      outputFormat0.setXHTML(true);
      outputFormat1.isTrimText();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.isXHTML();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.isPadText();
      outputFormat0.setLineSeparator("E");
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setNewlines(false);
      assertEquals("E", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4566966450091385
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "` p2W";
      stringArray0[1] = "-xhtmlQ7n{|T2G ";
      stringArray0[2] = "LtDYIDFjLD8rfge8";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setIndent(false);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0982737395252498
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setNewLineAfterDeclaration(false);
      String[] stringArray0 = new String[3];
      String string0 = "` p2W";
      stringArray0[0] = "` p2W";
      outputFormat0.setAttributeQuoteCharacter('\"');
      String string1 = "rtqd,q+";
      OutputFormat outputFormat1 = new OutputFormat("rtqd,q+");
      outputFormat0.setOmitEncoding(true);
      outputFormat1.setIndent(false);
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
  //Test case number: 16
  /*Coverage entropy=2.0212562319353635
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator");
      outputFormat0.setLineSeparator("");
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(true);
      outputFormat1.setIndent(true);
      outputFormat1.setIndentSize(0);
      outputFormat1.getAttributeQuoteCharacter();
      outputFormat1.setExpandEmptyElements(true);
      OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "-lineSeparator";
      stringArray0[7] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 2306);
      assertEquals("-lineSeparator", outputFormat0.getLineSeparator());
      assertEquals(2306, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2638576869792812
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", false, "}%FEU708");
      outputFormat0.setIndentSize(0);
      outputFormat0.setIndentSize(0);
      outputFormat0.setIndent("<VBzLHXAa$=(oW<5U");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setTrimText(false);
      outputFormat0.setTrimText(false);
      OutputFormat outputFormat1 = new OutputFormat("@q/IwI\"h }O\"![UGN");
      outputFormat0.setIndent("org.do");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmptyQ7n{|T2G ";
      stringArray0[1] = "}%FEU708";
      stringArray0[2] = "-xhtml";
      stringArray0[3] = "}%FEU708";
      stringArray0[4] = "}%FEU708";
      stringArray0[5] = "@q/IwI\"h }O\"![UGN";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setIndent("y");
      OutputFormat.createPrettyPrint();
      OutputFormat outputFormat2 = new OutputFormat();
      // Undeclared exception!
      try { 
        outputFormat2.setAttributeQuoteCharacter('N');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (N)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9708267273298157
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", false, "}%FEU708");
      outputFormat0.setIndentSize(0);
      outputFormat0.setIndentSize(1);
      outputFormat0.setTrimText(false);
      outputFormat0.setTrimText(false);
      OutputFormat outputFormat1 = new OutputFormat("~V.2:@5]Q!I>5fmE");
      outputFormat1.setIndent("-newlines");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "g,&t@MVoTsD'Z?y'Wjp";
      stringArray0[2] = "s{";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.setIndent("n");
      OutputFormat.createPrettyPrint();
      char char0 = 'N';
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter(')');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ())
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.375024252984546
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Q7n{|T2G ", true, "Q7n{|T2G ");
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = new OutputFormat();
      OutputFormat outputFormat2 = new OutputFormat("-trimText", true);
      outputFormat2.setNewLineAfterDeclaration(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "\t";
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat3 = new OutputFormat("Q7n{|T2G ");
      outputFormat0.setOmitEncoding(true);
      assertTrue(outputFormat0.isOmitEncoding());
      
      OutputFormat outputFormat4 = new OutputFormat("Q7n{|T2G ");
      OutputFormat outputFormat5 = new OutputFormat("-padText", false, "-trimText");
      int int0 = outputFormat3.parseOptions(stringArray0, 2877);
      assertEquals(2877, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4735023850806486
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-xhtml", false, "}%FEU708");
      outputFormat0.setIndentSize(0);
      outputFormat0.setIndentSize(1);
      outputFormat0.setIndentSize(1);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndentSize(2342);
      outputFormat0.setIndentSize(2);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "}%FEU708";
      stringArray0[1] = "-xhtml";
      stringArray0[2] = "-expandEmpty}%FEU708";
      stringArray0[3] = "-expandEmpty}%FEU708";
      stringArray0[4] = "-indentSize";
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-padText", true);
      assertFalse(outputFormat0.isPadText());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-padText";
      stringArray0[1] = "-padText";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isPadText());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "}%FEU708";
      stringArray0[1] = "-xhtml";
      stringArray0[2] = "-expandempty}%FEU708";
      stringArray0[3] = "-expandempty}%FEU708";
      stringArray0[4] = "-indentSize";
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", false, "@$Z}{%]S>");
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5810937501718239
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false, "q~7D[|Y3X");
      OutputFormat outputFormat1 = new OutputFormat("-xhtml", false, "q~7D[|Y3X");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtml-xwtml";
      stringArray0[1] = "-suppressDeclaration";
      stringArray0[2] = "-xhtml-xwtml";
      stringArray0[3] = "-xhtml-xwtml";
      stringArray0[4] = "-expandEmpty";
      stringArray0[5] = "-xhtml-xwtml";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 657);
      OutputFormat outputFormat2 = new OutputFormat("UTF-8", true);
      outputFormat0.parseOptions(stringArray0, 657);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1232));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1232
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "-trimText";
      String[] stringArray0 = new String[1];
      boolean boolean0 = true;
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-xwtml", true, "-xhtml-xwtml");
      int int0 = 2;
      outputFormat0.setTrimText(true);
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-indent";
      stringArray1[1] = "-xhtml-xwtml";
      stringArray1[2] = "-xhtml-xwtml";
      stringArray1[5] = "-xhtml-xwtml";
      stringArray1[4] = "-xhtml-xwtml";
      stringArray1[5] = "-xhtml-xwtml";
      stringArray1[6] = "-xhtml-xwtml";
      stringArray1[7] = "-trimText";
      stringArray1[8] = "-xhtml-xwtml";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3334730391185028
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "-trimText";
      OutputFormat outputFormat0 = new OutputFormat("-xhtml-xwtml", true, "-xhtml-xwtml");
      outputFormat0.setTrimText(true);
      String string1 = "-expandEmpty";
      String string2 = "-encoding";
      outputFormat0.setLineSeparator("dMmPPX{rKo{ +Vw|EM");
      outputFormat0.setTrimText(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-encoding";
      stringArray0[2] = "-expandEmpty";
      String string3 = "-suppressDeclaration";
      stringArray0[3] = "-suppressDeclaration";
      stringArray0[4] = "dMmPPX{rKo{ +Vw|EM";
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1142));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1142
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
