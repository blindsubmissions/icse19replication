/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:53:24 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setEncoding("2TBt,C~zOZ");
      outputFormat0.setIndent("2TBt,C~zOZ");
      outputFormat0.setEncoding((String) null);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setOmitEncoding(true);
      assertEquals("2TBt,C~zOZ", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1894736293243366
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setPadText(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setTrimText(false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "gkcGC>HaJ<v";
      stringArray0[1] = "-padText";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "gkcGC>HaJ<v";
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat1 = new OutputFormat("-padText", true);
      outputFormat1.setIndent(true);
      outputFormat1.parseOptions(stringArray0, 4);
      outputFormat1.parseOptions(stringArray0, 4);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "-padText";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-1793110124));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1793110124
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("n'", true);
      String[] stringArray0 = new String[5];
      outputFormat0.setIndent("n'");
      stringArray0[0] = "";
      stringArray0[1] = "n'";
      outputFormat0.setIndent("n'");
      stringArray0[2] = "n'";
      stringArray0[3] = "n'";
      stringArray0[4] = "n'";
      outputFormat0.parseOptions(stringArray0, 39);
      int int0 = (-1741);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1741));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1741
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3486289544613381
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gkcGC>HaJ<v";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-padText";
      stringArray0[4] = "gkcGC>HaJ<v";
      stringArray0[5] = "-padText";
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1731));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1731
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
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.isXHTML();
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("-lineSeparator", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(boolean0);
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      OutputFormat outputFormat1 = new OutputFormat();
      assertFalse(outputFormat1.isExpandEmptyElements());
      assertFalse(outputFormat1.isXHTML());
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
      assertFalse(outputFormat1.isNewlines());
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
      assertEquals("UTF-8", outputFormat1.getEncoding());
      assertFalse(outputFormat1.isPadText());
      assertEquals("\n", outputFormat1.getLineSeparator());
      assertFalse(outputFormat1.isOmitEncoding());
      assertFalse(outputFormat1.isTrimText());
      assertFalse(outputFormat1.isSuppressDeclaration());
      assertEquals('\"', outputFormat1.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = true;
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setNewLineAfterNTags(1);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8377716126398524
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gkcGC>HaJ<v";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-padText";
      stringArray0[4] = "gkcGC>HaJ<v";
      stringArray0[5] = "-padText";
      stringArray0[6] = "gkcGC>HaJ<v";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setIndentSize(810);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 4);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1953));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1953
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("|@6P69", true);
      outputFormat0.isSuppressDeclaration();
      assertTrue(outputFormat0.isNewlines());
      
      OutputFormat.createCompactFormat();
      outputFormat0.setNewlines(false);
      assertFalse(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.getEncoding();
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.411642334512242
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setPadText(false);
      OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gkcGC>HaJ<v";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      outputFormat0.setTrimText(true);
      stringArray0[3] = "-padText";
      stringArray0[4] = "gkcGC>HaJ<v";
      stringArray0[5] = "-padText";
      stringArray0[6] = "gkcGC>HaJ<v";
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-lineSeparator", outputFormat0.getLineSeparator());
      assertEquals(4, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      char char0 = '8';
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('8');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (8)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String string0 = outputFormat0.getLineSeparator();
      assertEquals("\n", string0);
      
      outputFormat0.setTrimText(true);
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isTrimText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setIndentSize(0);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = " ";
      stringArray0[3] = " ";
      outputFormat0.setExpandEmptyElements(true);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals("", outputFormat0.getIndent());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-lineSeparator";
      outputFormat0.setIndent((String) null);
      stringArray0[1] = "-lineSeparator";
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setIndentSize(0);
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent("");
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4*H2;L";
      stringArray0[1] = "gkcGC>HaJ<v";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = ">1u6/4iz";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setNewLineAfterDeclaration(true);
      OutputFormat outputFormat1 = new OutputFormat("", false);
      int int0 = outputFormat1.parseOptions(stringArray0, 0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6598720137848266
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setPadText(false);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "gkcGC>HaJ<v";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-padText";
      stringArray0[4] = "gkcGC>HaJ<v";
      stringArray0[5] = "-padText";
      stringArray0[6] = "gkcGC>HaJ<v";
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 704);
      assertTrue(outputFormat0.isPadText());
      assertEquals(704, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("WMK", false, "WMK");
      outputFormat0.setTrimText(false);
      outputFormat0.setEncoding("ma|xp");
      outputFormat0.setLineSeparator("vwAKXSc:J");
      outputFormat0.setIndent("8bUEL^");
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.getLineSeparator();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setIndent("WMK");
      outputFormat0.isTrimText();
      outputFormat0.isOmitEncoding();
      outputFormat0.setLineSeparator("-omitEncoding");
      boolean boolean0 = outputFormat0.isOmitEncoding();
      assertEquals("8bUEL^", outputFormat0.getIndent());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineepzrKor", true);
      outputFormat0.setIndentSize(2998);
      OutputFormat outputFormat1 = new OutputFormat();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-lineepzrKor";
      stringArray0[1] = "-lineepzrKor";
      stringArray0[2] = "RTQ,x0\"NiZqR<";
      stringArray0[2] = "";
      outputFormat1.setEncoding("ilB-{j&n7.b2");
      outputFormat0.setPadText(true);
      outputFormat0.getNewLineAfterNTags();
      OutputFormat outputFormat2 = new OutputFormat("");
      outputFormat2.parseOptions(stringArray0, 0);
      outputFormat1.setAttributeQuoteCharacter('\"');
      assertEquals("ilB-{j&n7.b2", outputFormat1.getEncoding());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setPadText(true);
      outputFormat0.isTrimText();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isPadText();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "FgO$u~";
      stringArray0[1] = "e";
      stringArray0[2] = "";
      stringArray0[3] = "i2Ld@Qd5Vz?";
      outputFormat0.setPadText(false);
      stringArray0[4] = "-indent";
      stringArray0[5] = "";
      stringArray0[6] = "V";
      outputFormat0.setNewlines(true);
      stringArray0[7] = "m-#<L*>/?a`DFO";
      stringArray0[8] = "!T^#yTIa";
      outputFormat0.parseOptions(stringArray0, 2679);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setEncoding("V");
      assertFalse(outputFormat0.isPadText());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true, "");
      outputFormat0.setNewlines(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setIndent("");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setEncoding("");
      outputFormat0.setPadText(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setIndent("");
      outputFormat0.setLineSeparator("");
      outputFormat0.setOmitEncoding(true);
      outputFormat0.isNewlines();
      outputFormat0.isPadText();
      outputFormat0.getIndent();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.isNewlines();
      outputFormat0.setOmitEncoding(false);
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setPadText(false);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setSuppressDeclaration(false);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "-lineSeparator";
      stringArray0[4] = "-indentSize";
      stringArray0[5] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-lineSeparator\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("=ZCCd^G)mr");
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("=ZCCd^G)mr");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtml";
      stringArray0[1] = "=ZCCd^G)mr";
      stringArray0[2] = "=ZCCd^G)mr";
      stringArray0[3] = "=ZCCd^G)mr";
      stringArray0[4] = "=ZCCd^G)mr";
      stringArray0[5] = "=ZCCd^G)mr";
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat("=ZCCd^G)mr", true, "=ZCCd^G)mr");
      boolean boolean0 = outputFormat1.isExpandEmptyElements();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, true);
      outputFormat0.setLineSeparator("PGDB/NAm`?'ZP<-=~r");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.isPadText();
      String[] stringArray0 = new String[3];
      stringArray0[0] = null;
      stringArray0[1] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[2] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.isXHTML();
      outputFormat0.isXHTML();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('t');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (t)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-lineSeparator", true);
      outputFormat0.setIndentSize(0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-lineSeparator";
      stringArray0[2] = "-expandEmpty:-3%l/77C=";
      stringArray0[3] = " ";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("", outputFormat0.getIndent());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent");
      String[] stringArray0 = new String[6];
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setLineSeparator("4uz");
      stringArray0[0] = "-indent";
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-omitEncoding", false, "RuinSe");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "RuinSeparato";
      stringArray0[1] = "-newlines";
      stringArray0[2] = "-omitEncoding";
      stringArray0[3] = "-omitEncoding";
      stringArray0[4] = "-omitEncoding";
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 2871);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "-newlines";
      stringArray1[1] = "-newlines";
      stringArray1[2] = "-newlines";
      stringArray1[3] = null;
      stringArray1[4] = "n(";
      stringArray1[5] = "RuinSe";
      stringArray1[6] = null;
      stringArray1[7] = "G6X8\"8C";
      outputFormat0.parseOptions(stringArray1, 2871);
      assertTrue(outputFormat0.isOmitEncoding());
      assertTrue(outputFormat0.isNewlines());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("=ZCCd^G)mr");
      outputFormat0.setLineSeparator("-encoding");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "=ZCCd^G)mr";
      stringArray0[2] = "-encoding";
      stringArray0[3] = "-encoding";
      stringArray0[4] = "-encoding";
      stringArray0[5] = "-encoding";
      stringArray0[6] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat1.getAttributeQuoteCharacter());
      
      outputFormat0.setTrimText(false);
      assertFalse(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "";
      stringArray0[2] = "-xhtmlFA4z7(hv:+<";
      stringArray0[3] = "|pDFYR>x`NGH^";
      stringArray0[5] = "a?,T+^1XIqMv8Ddy<";
      stringArray0[6] = "-trimText";
      stringArray0[8] = "";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isTrimText());
      assertEquals(1, int0);
      assertFalse(outputFormat0.isNewlines());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertEquals("UTF-8", outputFormat0.getEncoding());
  }
}
