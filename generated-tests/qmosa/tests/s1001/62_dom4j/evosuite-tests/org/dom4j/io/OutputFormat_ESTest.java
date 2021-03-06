/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:56:04 GMT 2018
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("z$0RP+~e;G");
      outputFormat0.setIndentSize((-2898));
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndentSize((-2898));
      outputFormat0.setExpandEmptyElements(true);
      outputFormat1.setNewlines(false);
      outputFormat1.setLineSeparator("");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setPadText(true);
      outputFormat0.isTrimText();
      assertTrue(outputFormat0.isExpandEmptyElements());
      
      outputFormat1.getEncoding();
      assertEquals("", outputFormat1.getLineSeparator());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setNewLineAfterNTags(287);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "o32";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "}8YlRzfDtj";
      stringArray0[5] = "Ep;'M^9S-8kaPYJ";
      stringArray0[6] = "";
      stringArray0[7] = "UOkRgwX9Xx+ZG%.xQ";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-203));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -203
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
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setSuppressDeclaration(true);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setNewlines(false);
      boolean boolean0 = false;
      outputFormat1.setNewlines(false);
      outputFormat0.setTrimText(false);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.getLineSeparator();
      OutputFormat.createPrettyPrint();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "\n";
      stringArray0[1] = "\n";
      stringArray0[2] = "\n";
      stringArray0[3] = "\n";
      stringArray0[4] = "\n";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-454));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -454
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[4];
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setSuppressDeclaration(false);
      String string0 = "";
      outputFormat1.setEncoding((String) null);
      outputFormat0.setLineSeparator("");
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character ()
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("-xhtml");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setXHTML(false);
      outputFormat0.setPadText(true);
      int int0 = 0;
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
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("78:loteeo-oI!k", true, "78:loteeo-oI!k");
      outputFormat0.setTrimText(false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "78:loteeo-oI!k";
      stringArray0[1] = "78:loteeo-oI!k";
      stringArray0[2] = "78:loteeo-oI!k";
      stringArray0[3] = "78:loteeo-oI!k";
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setIndentSize(0);
      outputFormat1.setPadText(true);
      outputFormat1.isPadText();
      outputFormat0.getIndent();
      outputFormat1.setIndent("Td_O7)X42n-8vf[");
      OutputFormat.createPrettyPrint();
      outputFormat1.setSuppressDeclaration(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setXHTML(true);
      outputFormat0.parseOptions(stringArray0, 1002);
      outputFormat1.setXHTML(false);
      outputFormat0.setTrimText(false);
      assertTrue(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("ngR3", false, "ngR3");
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("ngR3", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(boolean0);
      assertEquals("ngR3", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.getEncoding();
      boolean boolean0 = true;
      outputFormat0.setNewlines(true);
      OutputFormat.createPrettyPrint();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(false);
      outputFormat0.setAttributeQuoteCharacter('\"');
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(false);
      outputFormat2.setXHTML(true);
      outputFormat0.setSuppressDeclaration(false);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('*');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (*)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.isTrimText();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setSuppressDeclaration(true);
      assertFalse(outputFormat0.isNewlines());
      
      outputFormat0.setNewlines(true);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText");
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setIndent("-trimText");
      outputFormat0.setAttributeQuoteCharacter('\"');
      String string0 = outputFormat0.getEncoding();
      assertEquals("UTF-8", string0);
      assertEquals("-trimText", outputFormat0.getIndent());
      
      outputFormat0.setIndent(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setPadText(false);
      outputFormat0.setAttributeQuoteCharacter('\"');
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1894736293243366
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-xhtml";
      stringArray0[1] = "";
      stringArray0[2] = "C.JE{aj";
      stringArray0[3] = "";
      stringArray0[4] = "WBhWV!!cv8s 1n";
      stringArray0[5] = "";
      stringArray0[6] = ")";
      stringArray0[7] = "e>f";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setSuppressDeclaration(true);
      outputFormat1.setPadText(true);
      outputFormat0.setTrimText(true);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setEncoding("yt2E+s:cqLLO?x");
      outputFormat0.getIndent();
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setIndent("yt2E+s:cqLLO?x");
      outputFormat1.setPadText(false);
      outputFormat1.setNewLineAfterNTags((-666));
      outputFormat0.isXHTML();
      outputFormat0.isSuppressDeclaration();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setSuppressDeclaration(false);
      String[] stringArray0 = new String[0];
      outputFormat1.parseOptions(stringArray0, 449);
      outputFormat1.setExpandEmptyElements(false);
      outputFormat0.getLineSeparator();
      outputFormat0.setIndentSize(449);
      assertEquals("yt2E+s:cqLLO?x", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "oz(d");
      outputFormat0.setLineSeparator("");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.isNewLineAfterDeclaration();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "oz(d";
      stringArray0[1] = "";
      stringArray0[2] = ")";
      stringArray0[3] = "";
      stringArray0[4] = "oz(d";
      stringArray0[5] = "";
      stringArray0[6] = "";
      outputFormat0.setIndent("oz(d");
      stringArray0[7] = "";
      outputFormat0.setIndent("Zy");
      stringArray0[8] = "`Zh5)CK:sLvM(";
      outputFormat0.setEncoding("j9f}dB@@A4MY&");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndentSize((-1));
      outputFormat0.parseOptions(stringArray0, 1487);
      outputFormat0.setXHTML(true);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setNewLineAfterNTags(1487);
      outputFormat0.parseOptions(stringArray0, 1487);
      outputFormat0.isNewLineAfterDeclaration();
      OutputFormat.createCompactFormat();
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions((String[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setNewLineAfterNTags((-1));
      outputFormat0.setTrimText(true);
      outputFormat0.isTrimText();
      OutputFormat.createCompactFormat();
      outputFormat0.setLineSeparator("U&kAI\"5GVb|j");
      outputFormat0.isNewlines();
      outputFormat0.setLineSeparator("");
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setEncoding("U&kAI\"5GVb|j");
      outputFormat1.setXHTML(true);
      outputFormat1.getIndent();
      outputFormat1.setExpandEmptyElements(true);
      boolean boolean0 = outputFormat1.isOmitEncoding();
      assertEquals("U&kAI\"5GVb|j", outputFormat1.getEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5171515848932915
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags(1);
      outputFormat0.isNewlines();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "!#BJb7P4]q<!2@j )";
      stringArray0[2] = "L#Sr*nj";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setLineSeparator("Rc1N+en_\"|J?1t1*k");
      outputFormat0.getEncoding();
      outputFormat0.setNewLineAfterNTags(1);
      assertEquals("Rc1N+en_\"|J?1t1*k", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.954673212304816
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent(false);
      outputFormat0.isPadText();
      outputFormat0.setIndent(true);
      outputFormat0.setPadText(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setLineSeparator("dw'K&tkoL:z=");
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.getIndent();
      OutputFormat.createCompactFormat();
      boolean boolean0 = false;
      outputFormat1.setNewlines(false);
      outputFormat0.isExpandEmptyElements();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat0.isPadText();
      outputFormat1.getEncoding();
      outputFormat1.getIndent();
      outputFormat1.isXHTML();
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      outputFormat3.setEncoding("");
      outputFormat0.getLineSeparator();
      outputFormat1.isNewLineAfterDeclaration();
      // Undeclared exception!
      try { 
        outputFormat2.setAttributeQuoteCharacter('K');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (K)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "ruKMi`FXeEr@~&d";
      stringArray0[2] = "#";
      stringArray0[3] = "";
      stringArray0[4] = "";
      outputFormat0.setIndent("");
      outputFormat0.parseOptions(stringArray0, 1660);
      outputFormat0.isOmitEncoding();
      outputFormat0.setPadText(false);
      outputFormat0.isOmitEncoding();
      outputFormat0.isPadText();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('A');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (A)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "ruKMi`FXeEr@~&d";
      stringArray0[2] = "#";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "y^:*-pRDa{J$~9h";
      stringArray0[6] = "";
      outputFormat0.setIndent("#");
      stringArray0[7] = "FD-%d/#";
      outputFormat0.parseOptions(stringArray0, 1660);
      outputFormat0.setAttributeQuoteCharacter('\'');
      char char0 = outputFormat0.getAttributeQuoteCharacter();
      assertEquals('\'', char0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags(1);
      OutputFormat outputFormat1 = new OutputFormat("y^:*-pRDa{J$~9h");
      outputFormat1.setIndent("-lineSeparator");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "ruKMi`FXeEr@~&d";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "78:loteeo-oI!k";
      stringArray0[3] = "FD-%d/#";
      stringArray0[4] = "";
      stringArray0[5] = "-lineSeparator";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.isOmitEncoding();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat2.setPadText(true);
      outputFormat0.isOmitEncoding();
      outputFormat1.isPadText();
      outputFormat2.setIndent((String) null);
      assertTrue(outputFormat2.isPadText());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding", true);
      String[] stringArray0 = new String[2];
      outputFormat0.setPadText(true);
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-encoding";
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
  //Test case number: 20
  /*Coverage entropy=2.2047854169135204
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setLineSeparator("-suppressDeclaration");
      String[] stringArray0 = new String[8];
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = new OutputFormat("-suppressDeclaration", false, "-xhtml");
      String[] stringArray1 = new String[5];
      stringArray1[0] = "-suppressDeclaration";
      stringArray1[1] = "3U,}0R";
      stringArray1[2] = "LRSr}nj";
      stringArray1[3] = "-xhtml";
      stringArray1[4] = "-suppressDeclaration";
      outputFormat1.parseOptions(stringArray1, 0);
      outputFormat1.setIndent("#Y:DUS");
      outputFormat1.setLineSeparator("-xhtml");
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.296332348800201
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 1;
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterNTags(1);
      OutputFormat outputFormat1 = new OutputFormat("\"vgq#PvL.]6");
      outputFormat1.isNewlines();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "\"vgq#PvL.]6";
      stringArray0[1] = "-newlines";
      outputFormat2.parseOptions(stringArray0, 1);
      OutputFormat outputFormat3 = new OutputFormat();
      outputFormat3.setLineSeparator("7");
      outputFormat1.getEncoding();
      OutputFormat outputFormat4 = new OutputFormat("W!jVv*l{H");
      outputFormat3.setIndent((String) null);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "-expandEmptyC.JE{aj";
      stringArray1[1] = "LRSr}nj";
      stringArray1[2] = "LRSr}nj";
      stringArray1[3] = "-newlines";
      stringArray1[4] = "W!jVv*l{H";
      stringArray1[5] = "UTF-8";
      stringArray1[6] = "!#BJb7P4]q<!2@j )";
      stringArray1[7] = null;
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray1, (-1));
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
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat("\"vgq#PvL.]6", true);
      outputFormat1.setPadText(true);
      outputFormat1.setPadText(true);
      String string0 = "Y>p";
      outputFormat1.setEncoding("Y>p");
      String string1 = "L#Sr*n";
      String[] stringArray0 = new String[8];
      stringArray0[0] = null;
      stringArray0[1] = "-omitEncoding";
      stringArray0[2] = null;
      stringArray0[3] = "\"vgq#PvL.]6";
      String string2 = "-newlines";
      stringArray0[4] = "-newlines";
      stringArray0[5] = null;
      stringArray0[6] = "L#Sr*n";
      stringArray0[7] = "L#Sr*n";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3020613918729727
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[9];
      stringArray0[0] = ";D";
      stringArray0[1] = "-expandEmpty!#BJb7P4]q<!2@j )";
      stringArray0[2] = "-padText";
      stringArray0[3] = "Ya";
      stringArray0[4] = "yTo2{4Ig80}w";
      stringArray0[5] = "";
      stringArray0[6] = "LRSr}n";
      stringArray0[7] = "";
      stringArray0[8] = "?oPM}hcU_";
      int int0 = outputFormat0.parseOptions(stringArray0, 2);
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(3, int0);
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7660680568573222
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "";
      stringArray0[2] = "2RSr'A";
      outputFormat0.setIndent("-lineSeparator");
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.parseOptions(stringArray0, 329);
      outputFormat0.setExpandEmptyElements(false);
      String[] stringArray1 = new String[0];
      outputFormat0.parseOptions(stringArray1, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 329);
      assertEquals("-lineSeparator", outputFormat0.getIndent());
      assertEquals(329, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "2RSr'A}nj";
      stringArray0[1] = "@~=iaIS[";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "@~=iaIS[";
      stringArray0[4] = "2RSr'A}nj";
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat0.parseOptions(stringArray0, 1984);
      outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isTrimText());
      
      outputFormat1.parseOptions(stringArray0, 0);
      int int0 = outputFormat1.parseOptions(stringArray0, 39);
      assertFalse(outputFormat1.isTrimText());
      assertEquals(39, int0);
  }
}
