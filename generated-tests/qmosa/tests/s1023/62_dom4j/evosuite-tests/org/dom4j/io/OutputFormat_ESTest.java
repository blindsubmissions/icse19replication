/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:06:29 GMT 2018
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Zk$u3U|{-0Q~j#kZ", true);
      outputFormat0.setLineSeparator("Zk$u3U|{-0Q~j#kZ");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.isPadText();
      outputFormat0.isPadText();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[1] = "D<K{N1z=GqV%,oe4qq";
      stringArray0[2] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[3] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[4] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[5] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[6] = "8ee//8/[AT";
      stringArray0[7] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[8] = "Zk$u3U|{-0Q~j#kZ";
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.isXHTML();
      outputFormat0.isXHTML();
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setIndent("Zk$u3U|{-0Q~j#kZ");
      outputFormat1.setNewLineAfterNTags((-294));
      outputFormat1.setLineSeparator("Zk$u3U|{-0Q~j#kZ");
      assertEquals((-294), outputFormat1.getNewLineAfterNTags());
      
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      assertEquals('\"', outputFormat2.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "-indentSize";
      boolean boolean0 = false;
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", false);
      outputFormat0.setPadText(false);
      outputFormat0.setEncoding("-indentSize");
      outputFormat0.isSuppressDeclaration();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "e}~Mb'^";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "-indentSize";
      stringArray0[4] = "-indentSize";
      stringArray0[5] = "-indentSize";
      outputFormat1.setNewLineAfterDeclaration(true);
      stringArray0[6] = "-indentSize";
      stringArray0[7] = "-indentSize";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-728));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -728
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent("8HG>");
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setIndentSize(0);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat1.setIndentSize(34);
      outputFormat1.setEncoding("XAV");
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat1.setPadText(false);
      outputFormat1.setTrimText(true);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setTrimText(false);
      outputFormat1.setNewLineAfterNTags(0);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      outputFormat2.setNewlines(true);
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat1.setEncoding("");
      assertEquals("", outputFormat1.getEncoding());
      
      outputFormat3.setTrimText(false);
      outputFormat2.getAttributeQuoteCharacter();
      char char0 = outputFormat3.getAttributeQuoteCharacter();
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[8];
      stringArray0[0] = ":-3%l/77C=";
      stringArray0[1] = "CDa=-6VQGW.wsW.@.";
      stringArray0[2] = "\"mKyeSxm/!#";
      stringArray0[3] = "";
      stringArray0[4] = "qM\u00049^_`S-";
      stringArray0[5] = "";
      stringArray0[6] = "4";
      stringArray0[7] = "";
      outputFormat1.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('>');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (>)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent(true);
      outputFormat0.setXHTML(false);
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setIndent(false);
      outputFormat2.setLineSeparator("\n");
      outputFormat2.setOmitEncoding(false);
      outputFormat0.getLineSeparator();
      outputFormat2.setLineSeparator("\n");
      outputFormat0.setExpandEmptyElements(false);
      outputFormat2.setNewLineAfterDeclaration(false);
      outputFormat2.getIndent();
      outputFormat0.setTrimText(false);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat1.getIndent();
      outputFormat0.setLineSeparator("  ");
      outputFormat1.setIndent("");
      outputFormat0.getEncoding();
      outputFormat1.setIndent(false);
      outputFormat0.setIndent((String) null);
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(">/s~-:m|mS,`e7e,M6y", true, "$O");
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertEquals(">/s~-:m|mS,`e7e,M6y", outputFormat0.getIndent());
      assertTrue(outputFormat0.isNewlines());
      assertEquals("$O", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(boolean0);
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4583113296830845
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setNewlines(true);
      outputFormat1.setIndentSize(1);
      outputFormat0.isXHTML();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      assertTrue(outputFormat2.isPadText());
      
      outputFormat2.setPadText(false);
      OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "D,~PT@LW";
      stringArray0[1] = "-expandEmpty";
      stringArray0[2] = "zEI/C& #K<W3gm@>'-";
      stringArray0[3] = "RK@AzbHpaT_m@K";
      outputFormat0.parseOptions(stringArray0, 1261);
      outputFormat1.setNewlines(false);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat2.setEncoding("");
      assertTrue(outputFormat2.isNewlines());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setLineSeparator("!{wRW\">Fo");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getAttributeQuoteCharacter();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat3 = OutputFormat.createPrettyPrint();
      outputFormat3.setXHTML(true);
      outputFormat1.setXHTML(true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "UTF-8";
      stringArray0[1] = "UTF-8";
      stringArray0[2] = "UTF-8";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setEncoding("UTF-8");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat2.setAttributeQuoteCharacter('\"');
      outputFormat1.setNewlines(false);
      outputFormat1.setIndent(false);
      outputFormat2.setIndent(true);
      outputFormat1.isOmitEncoding();
      outputFormat2.setXHTML(false);
      outputFormat1.setIndent(true);
      OutputFormat.createCompactFormat();
      outputFormat0.setEncoding("UTF-8");
      outputFormat3.setNewLineAfterDeclaration(false);
      outputFormat1.setXHTML(true);
      assertTrue(outputFormat1.isXHTML());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("WMK", false, "WMK");
      outputFormat0.setIndent("");
      outputFormat0.setTrimText(false);
      outputFormat0.setEncoding("ma|xp");
      outputFormat0.setLineSeparator("vwAKXSc:J");
      outputFormat0.setIndent("8bUEL^");
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.getLineSeparator();
      outputFormat0.getNewLineAfterNTags();
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
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = null;
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('w');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (w)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat.createPrettyPrint();
      outputFormat0.setTrimText(false);
      outputFormat0.isXHTML();
      outputFormat0.setNewlines(false);
      outputFormat0.setSuppressDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setLineSeparator("-lineSeparator");
      outputFormat0.setNewLineAfterNTags(2);
      outputFormat0.isNewlines();
      outputFormat0.isXHTML();
      outputFormat0.getIndent();
      outputFormat0.setIndent(false);
      outputFormat0.setIndent(false);
      outputFormat0.getEncoding();
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getLineSeparator();
      assertEquals("-lineSeparator", outputFormat0.getLineSeparator());
      
      outputFormat1.setSuppressDeclaration(true);
      assertFalse(outputFormat1.isXHTML());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.366289317713365
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      boolean boolean0 = false;
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      OutputFormat.createPrettyPrint();
      outputFormat1.setExpandEmptyElements(true);
      outputFormat1.isNewLineAfterDeclaration();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "-indentSize";
      OutputFormat.createPrettyPrint();
      stringArray0[2] = ">O ZB_";
      stringArray0[3] = "Zk$u3U|{-0Q~";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml";
      stringArray0[6] = "xtrwXRH_";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">O ZB_\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.575390560312862
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Zk$u3U|{-0Q~j#kZ", true);
      outputFormat0.setLineSeparator("Zk$u3U|{-0Q~j#kZ");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setIndentSize((-1014));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "-xhtml";
      stringArray0[2] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[3] = "-xhtml";
      stringArray0[4] = "";
      stringArray0[5] = "-xhtml";
      stringArray0[6] = "xtrwXRH_";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setTrimText(true);
      outputFormat0.setTrimText(true);
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("Zk$u3U|{-0Q~j#kZ", outputFormat0.getLineSeparator());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.094640938826062
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setOmitEncoding(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setExpandEmptyElements(false);
      outputFormat1.isNewLineAfterDeclaration();
      OutputFormat outputFormat2 = new OutputFormat("foGOspK", true, "-expandEmptyUTF-8");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "$";
      stringArray0[1] = "-expandEmptyUTF-8";
      stringArray0[2] = "$";
      stringArray0[3] = "$";
      stringArray0[4] = "foGOspK";
      outputFormat2.parseOptions(stringArray0, 14);
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, (-1489));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1489
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Zk$u3U|{-0Q~j#kZ", true, "Zk$u3U|{-0Q~j#kZ");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[1] = "xtrwXRH_";
      stringArray0[2] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[3] = "Zk$u3U|{-0Q~j#kZ";
      stringArray0[4] = "";
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setOmitEncoding(false);
      stringArray0[5] = "D<K{N1z=GqV";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.506661812497001
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setNewLineAfterDeclaration(true);
      outputFormat1.setTrimText(true);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-omitEncoding";
      outputFormat0.setNewLineAfterNTags(0);
      stringArray0[1] = "JLy%c= <VnT3w0nR";
      stringArray0[2] = "";
      stringArray0[3] = "l+wqA{5C-+i1r$D}<A";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.setIndent("-omitEncoding");
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-265));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -265
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9284010697594987
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setPadText(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setLineSeparator("l6ekM|hQgvP-KOjPO2G");
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setTrimText(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-trimText";
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("l6ekM|hQgvP-KOjPO2G", outputFormat0.getLineSeparator());
      
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      int int0 = outputFormat2.parseOptions(stringArray0, 0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.8891591637540213
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setXHTML(true);
      outputFormat0.setOmitEncoding(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "=-z>Vnz#Jg{u1nX.#";
      stringArray0[2] = "du.\"";
      stringArray0[3] = "=-z>Vnz#Jg{u1nX.#";
      stringArray0[4] = "-expandEmptyxtrwXRH_";
      stringArray0[5] = "l6ekM|hQgvP-KOjPO2G";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.setTrimText(false);
      assertFalse(outputFormat0.isTrimText());
      
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      int int0 = outputFormat1.parseOptions(stringArray0, 2);
      assertEquals(2, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4500064999181648
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-newlines";
      outputFormat0.setIndent("\"LZ!");
      OutputFormat.createCompactFormat();
      outputFormat0.parseOptions(stringArray0, 1);
      assertFalse(outputFormat0.isNewlines());
      
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 4183);
      assertTrue(outputFormat0.isNewlines());
      assertEquals(4183, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.8778382404072829
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[5];
      outputFormat0.setNewLineAfterNTags((-432433787));
      stringArray0[0] = "sny!";
      stringArray0[1] = "-padText";
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setLineSeparator("FA4z7(hv:+<");
      stringArray0[2] = "DtjyP8x";
      outputFormat0.setIndentSize((-1980));
      outputFormat1.setSuppressDeclaration(true);
      outputFormat0.setPadText(false);
      stringArray0[3] = "";
      stringArray0[4] = "UbK:V`";
      int int0 = 0;
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.parseOptions(stringArray0, 1);
      int int1 = (-1519);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1519));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1519
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
