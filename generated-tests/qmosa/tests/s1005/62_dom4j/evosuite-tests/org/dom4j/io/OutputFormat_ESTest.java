/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:12:33 GMT 2018
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setIndent((String) null);
      outputFormat0.setIndent("");
      outputFormat0.setIndent("");
      outputFormat0.isSuppressDeclaration();
      outputFormat0.isOmitEncoding();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('l');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (l)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent("-omitEncoding");
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("-omitEncoding", outputFormat0.getIndent());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewlines(false);
      outputFormat0.setExpandEmptyElements(false);
      OutputFormat.createCompactFormat();
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setEncoding("7m +H'{GTm?oT");
      outputFormat0.isSuppressDeclaration();
      outputFormat0.isXHTML();
      OutputFormat.createCompactFormat();
      String string0 = "{&N";
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
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration", false);
      outputFormat0.setLineSeparator("-suppressDeclaration");
      outputFormat0.getEncoding();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "UTF-8";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("-suppressDeclaration", outputFormat0.getLineSeparator());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.setIndentSize((-1));
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(0, int0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertTrue(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("", outputFormat0.getIndent());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("  ", outputFormat0.getIndent());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false);
      outputFormat0.setExpandEmptyElements(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setLineSeparator((String) null);
      outputFormat1.setEncoding(",p77tY");
      outputFormat0.setTrimText(false);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.isOmitEncoding();
      outputFormat0.setNewlines(true);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.setIndentSize((-1862));
      OutputFormat.createPrettyPrint();
      outputFormat0.setIndent(true);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setTrimText(false);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat1.isExpandEmptyElements();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1862));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1862
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setNewLineAfterNTags((-729));
      outputFormat0.setIndentSize((-2560));
      outputFormat0.setNewlines(true);
      outputFormat0.setNewLineAfterNTags((-2560));
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent(true);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.setIndentSize(1733);
      outputFormat0.isTrimText();
      outputFormat1.isNewLineAfterDeclaration();
      outputFormat0.setNewlines(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setIndent(false);
      outputFormat1.getNewLineAfterNTags();
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat1.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat1.setSuppressDeclaration(true);
      outputFormat1.getLineSeparator();
      outputFormat0.isPadText();
      assertEquals((-2560), outputFormat0.getNewLineAfterNTags());
      
      outputFormat1.setXHTML(true);
      outputFormat2.setOmitEncoding(true);
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      assertEquals('\"', outputFormat3.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setXHTML(false);
      String string0 = null;
      outputFormat0.setIndentSize(0);
      outputFormat0.setEncoding((String) null);
      outputFormat0.isNewlines();
      String string1 = "";
      String[] stringArray0 = new String[7];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = null;
      stringArray0[5] = null;
      stringArray0[6] = null;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-162));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -162
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.9020023132056028
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("l#4", true, "l#4");
      outputFormat0.getAttributeQuoteCharacter();
      boolean boolean0 = true;
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setNewLineAfterNTags(0);
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "l#4";
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setIndent("6/itYv:{?52rVM];`");
      OutputFormat outputFormat3 = new OutputFormat();
      outputFormat3.setNewlines(true);
      outputFormat2.isNewLineAfterDeclaration();
      outputFormat3.setSuppressDeclaration(true);
      outputFormat0.setOmitEncoding(true);
      char char0 = '4';
      outputFormat2.setAttributeQuoteCharacter('\"');
      outputFormat2.getNewLineAfterNTags();
      outputFormat1.setXHTML(true);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-926));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -926
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.329871704175466
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmptyorg.dom4j.io.OutputFormat", true);
      outputFormat0.setOmitEncoding(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "f2)IogifIgs7";
      stringArray0[1] = "-expandEmptyorg.dom4j.io.OutputFormat";
      stringArray0[2] = "f2)IogifIgs7";
      stringArray0[3] = "-expandEmptyorg.dom4j.io.OutputFormat";
      outputFormat1.parseOptions(stringArray0, 1);
      outputFormat1.getLineSeparator();
      outputFormat0.getIndent();
      outputFormat0.isNewlines();
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('(');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (()
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      assertEquals("UTF-8", outputFormat1.getEncoding());
      
      outputFormat0.setSuppressDeclaration(true);
      outputFormat1.setEncoding("");
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setPadText(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "7m +H'{GTm?oT";
      stringArray0[2] = "";
      stringArray0[3] = "7m +H'{GTm?oT";
      stringArray0[4] = "7m +H'{GTm?oT";
      stringArray0[5] = "-suppressDeclaration";
      stringArray0[6] = "7m +H'{GTm?oT";
      stringArray0[7] = "7m +H'{GTm?oT";
      stringArray0[8] = "7m +H'{GTm?oT";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat2.setExpandEmptyElements(false);
      outputFormat2.isPadText();
      outputFormat0.isOmitEncoding();
      outputFormat0.setSuppressDeclaration(true);
      OutputFormat outputFormat3 = OutputFormat.createPrettyPrint();
      outputFormat3.isPadText();
      int int0 = outputFormat3.parseOptions(stringArray0, 1);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3906826278129532
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.do";
      stringArray0[1] = "-xhtmlVW0Wpe.zb0)";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("+", true);
      outputFormat0.setEncoding("-wVx%z35");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "*";
      stringArray0[1] = "-newlines";
      stringArray0[2] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-wVx%z35", outputFormat0.getEncoding());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3592367006650063
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("+", true);
      OutputFormat outputFormat1 = new OutputFormat("+");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-indent";
      stringArray0[1] = "+";
      stringArray0[2] = "-wVx%z35";
      stringArray0[3] = "*";
      stringArray0[4] = "*";
      stringArray0[5] = "";
      stringArray0[6] = "-wVx%z35";
      stringArray0[7] = "-wVx%z35";
      stringArray0[8] = "-indentSize";
      outputFormat1.parseOptions(stringArray0, 0);
      OutputFormat outputFormat2 = new OutputFormat("VW0Wpe.zb0)", true, "-wVx%z");
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray0, (-2014809000));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2014809000
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3030924037617193
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = new OutputFormat("-indentSize", false);
      outputFormat1.setEncoding("");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-indentSize";
      stringArray0[1] = "-newlines";
      stringArray0[2] = "-indentSize";
      stringArray0[3] = "-newlines";
      stringArray0[4] = "*";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = null;
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-newlines\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("*aR'}SZAV/)82", true, "*aR'}SZAV/)82");
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "*aR'}SZAV/)82";
      stringArray0[1] = "*aR'}SZAV/)82";
      outputFormat0.parseOptions(stringArray0, 391);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setAttributeQuoteCharacter('\'');
      outputFormat0.parseOptions(stringArray0, 391);
      String[] stringArray1 = new String[8];
      outputFormat0.setPadText(true);
      stringArray1[0] = "*aR'}SZAV/)82";
      outputFormat0.setNewLineAfterDeclaration(true);
      stringArray1[1] = "*aR'}SZAV/)82";
      stringArray1[2] = "*aR'}SZAV/)82";
      stringArray1[3] = "*aR'}SZAV/)82";
      stringArray1[4] = "*aR'}SZAV/)82";
      stringArray1[5] = "*aR'}SZAV/)82";
      stringArray1[6] = "-padText";
      stringArray1[7] = "*aR'}SZAV/)82";
      outputFormat0.parseOptions(stringArray1, 391);
      outputFormat0.parseOptions(stringArray0, 391);
      outputFormat0.setAttributeQuoteCharacter('\'');
      outputFormat0.setAttributeQuoteCharacter('\'');
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-880));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -880
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7549967581308246
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText");
      outputFormat0.setEncoding("-trimText");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-trimText";
      stringArray0[2] = "-trimText";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 2595);
      assertEquals("-trimText", outputFormat0.getEncoding());
      assertEquals(2595, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9998704205025659
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[7];
      outputFormat0.setSuppressDeclaration(false);
      stringArray0[0] = "-expandEmpty+";
      stringArray0[1] = "-expandEmpty+";
      stringArray0[2] = ";1+g@?(3~KAyie";
      stringArray0[3] = ";1+g@?(3~KAyie";
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[7];
      stringArray1[0] = "-expandEmpty+";
      stringArray1[1] = "-expandEmpty+";
      stringArray1[2] = "-padText";
      outputFormat0.setTrimText(false);
      stringArray1[3] = ";1+g@?(3~KAyie";
      stringArray1[4] = ";1+g@?(3~KAyie";
      stringArray1[5] = "-expandEmpty+";
      stringArray1[6] = "-expandEmpty+";
      outputFormat0.parseOptions(stringArray1, 3354);
      outputFormat0.parseOptions(stringArray1, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 3354);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isPadText());
      assertEquals(3354, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(";1+g@?(3~KAyie");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "[?RwH _ri";
      stringArray0[1] = "-expandEmpty+";
      outputFormat0.setIndentSize(1);
      stringArray0[2] = "-trimText";
      stringArray0[3] = "[?RwH _ri";
      stringArray0[4] = "-omitEncoding";
      outputFormat0.parseOptions(stringArray0, 1);
      String[] stringArray1 = new String[7];
      stringArray1[1] = "[?RwH _ri";
      stringArray1[2] = "-trimText";
      String[] stringArray2 = new String[6];
      stringArray2[0] = "-trimText";
      stringArray2[1] = "-trimText";
      stringArray2[2] = ";1+g@?(3~KAyie";
      stringArray2[3] = "-expandEmpty+";
      stringArray2[4] = "-omitEncoding";
      stringArray2[5] = "-expandEmpty+";
      outputFormat0.parseOptions(stringArray2, 3);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-288));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -288
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.450805020083924
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "[?RwH _ri";
      stringArray0[1] = "-encoding";
      stringArray0[2] = "-expandEmpty+";
      stringArray0[3] = "N'XS#dFK[nIxwf:t#";
      stringArray0[4] = "-expandEmpty+";
      stringArray0[5] = "-expandEmpty+";
      stringArray0[6] = "-expandEmpty+";
      stringArray0[7] = "[?RwH _ri";
      int int0 = 1;
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setTrimText(false);
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat("-encoding", false, "[?RwH _ri");
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-1491768107));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1491768107
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
