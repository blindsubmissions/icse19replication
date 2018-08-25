/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:39:09 GMT 2018
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
      OutputFormat outputFormat0 = new OutputFormat("");
      boolean boolean0 = false;
      outputFormat0.setPadText(false);
      boolean boolean1 = true;
      outputFormat0.setXHTML(true);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent("1)-F");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      OutputFormat outputFormat2 = OutputFormat.createCompactFormat();
      outputFormat2.setLineSeparator("");
      int int0 = (-2365);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-2365));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2365
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
      String string0 = null;
      OutputFormat outputFormat0 = new OutputFormat((String) null, true);
      outputFormat0.setNewlines(true);
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setNewLineAfterNTags((-3204));
      outputFormat0.setLineSeparator("c<nivb#p~yq");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.isSuppressDeclaration();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('i');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (i)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", false, "");
      outputFormat0.setEncoding("");
      outputFormat0.setPadText(false);
      outputFormat0.setNewlines(false);
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.isExpandEmptyElements();
      outputFormat0.isXHTML();
      outputFormat0.setEncoding((String) null);
      outputFormat0.setIndentSize(1);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getLineSeparator();
      outputFormat0.getIndent();
      assertEquals(" ", outputFormat0.getIndent());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setEncoding("");
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.getEncoding();
      outputFormat0.isPadText();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent(true);
      outputFormat0.setXHTML(false);
      outputFormat0.setPadText(false);
      outputFormat1.isTrimText();
      outputFormat1.setTrimText(false);
      outputFormat0.setXHTML(false);
      outputFormat0.setIndentSize(1080);
      outputFormat1.setSuppressDeclaration(true);
      outputFormat0.isNewlines();
      outputFormat0.getNewLineAfterNTags();
      outputFormat1.setIndent("");
      outputFormat0.setOmitEncoding(false);
      outputFormat1.getNewLineAfterNTags();
      outputFormat1.isSuppressDeclaration();
      outputFormat0.isTrimText();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 1080);
      assertTrue(outputFormat0.isSuppressDeclaration());
      assertEquals(1080, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = false;
      String string1 = "q,lY0q";
      OutputFormat outputFormat0 = new OutputFormat("", false, "q,lY0q");
      outputFormat0.setLineSeparator("q,lY0q");
      outputFormat0.getIndent();
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
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
  //Test case number: 5
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("fgj{", false);
      outputFormat0.setSuppressDeclaration(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "fgj{";
      stringArray0[1] = "fgj{";
      stringArray0[2] = "fgj{";
      stringArray0[3] = "fgj{";
      stringArray0[4] = "fgj{";
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('O');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (O)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setPadText(false);
      outputFormat0.setNewlines(true);
      outputFormat0.setXHTML(false);
      outputFormat0.isPadText();
      outputFormat0.getLineSeparator();
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.setXHTML(false);
      outputFormat0.setPadText(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setTrimText(false);
      outputFormat0.isXHTML();
      outputFormat0.getIndent();
      outputFormat0.getIndent();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setIndent("\n");
      outputFormat2.setNewlines(true);
      outputFormat2.isNewLineAfterDeclaration();
      outputFormat1.setNewLineAfterNTags((-537));
      char char0 = outputFormat2.getAttributeQuoteCharacter();
      assertEquals("\n", outputFormat2.getIndent());
      assertEquals('\"', char0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "S*T;J!&Dk[[\\eV2+juG";
      OutputFormat outputFormat0 = new OutputFormat("S*T;J!&Dk[[eV2+juG");
      outputFormat0.isOmitEncoding();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setNewlines(false);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.isExpandEmptyElements();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('e');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (e)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8571028374420018
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("fgj{", false);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".s}mJ\"ub(Pu~~:";
      stringArray0[1] = "8Q;7p#R_[tZ2";
      outputFormat0.parseOptions(stringArray0, 1151);
      outputFormat0.isSuppressDeclaration();
      OutputFormat outputFormat1 = new OutputFormat("m?HK?", false);
      outputFormat1.setLineSeparator("#voM?E VM+pj");
      outputFormat0.setIndent("m?HK?");
      outputFormat1.setSuppressDeclaration(false);
      OutputFormat outputFormat2 = new OutputFormat("", false, "8Q;7p#R_[tZ2");
      outputFormat2.setXHTML(false);
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat1.setIndent(false);
      outputFormat1.setEncoding("h");
      outputFormat1.setSuppressDeclaration(true);
      outputFormat1.setNewlines(false);
      outputFormat2.setPadText(false);
      OutputFormat.createPrettyPrint();
      outputFormat1.setAttributeQuoteCharacter('\'');
      assertEquals("#voM?E VM+pj", outputFormat1.getLineSeparator());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7721393884375287
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpty";
      stringArray0[1] = "-expandEmpty";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setPadText(false);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "N}NuYBxf)k\"W5`)Wzs%";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "9rNt}|qCVAw&~e<[8";
      stringArray0[4] = "";
      int int0 = outputFormat0.parseOptions(stringArray0, 356);
      assertEquals(356, int0);
      
      outputFormat0.setNewLineAfterNTags(0);
      outputFormat0.setAttributeQuoteCharacter('\"');
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setIndent("-expandEmptyfgj{");
      outputFormat0.setTrimText(false);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpty";
      outputFormat0.setPadText(false);
      stringArray0[1] = "-trimText";
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.setIndent("6!");
      stringArray0[2] = "+4s2G.,<6";
      stringArray0[3] = "G`-ag6=DOY|'|n%";
      stringArray0[4] = "";
      stringArray0[5] = "";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setLineSeparator("UA9<j6O#:d{");
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setLineSeparator("");
      outputFormat0.setIndent("2w,EiK.J2E|w`nnWd9G");
      assertTrue(outputFormat0.isTrimText());
      
      OutputFormat.createCompactFormat();
      outputFormat1.setIndent((String) null);
      assertTrue(outputFormat1.isNewlines());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7741986100986102
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setTrimText(false);
      outputFormat0.setPadText(true);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setPadText(false);
      OutputFormat outputFormat2 = new OutputFormat("6!", false);
      outputFormat2.setIndent("zW1]XXD# h");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-xhtml3cg5:xf_})-.";
      stringArray0[1] = "G`-agz6=DOYe'|F%";
      stringArray0[2] = "G`-agz6=DOYe'|F%";
      stringArray0[3] = "-expandEmptyfgj{";
      stringArray0[4] = "";
      stringArray0[5] = "o?[&;WG68a";
      outputFormat2.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat1.setAttributeQuoteCharacter('N');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (N)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = (-1);
      String string0 = "M8UdA^J";
      int int1 = 0;
      String[] stringArray0 = new String[1];
      String string1 = "-lineSeparator";
      stringArray0[0] = "-lineSeparator";
      outputFormat0.parseOptions(stringArray0, 1906);
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
  //Test case number: 14
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = 0;
      OutputFormat outputFormat1 = new OutputFormat((String) null, false, "-newlines");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-newlines";
      stringArray0[1] = "-newlines";
      stringArray0[2] = null;
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9867316488081914
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      int int0 = 23;
      outputFormat0.setIndentSize(1699);
      outputFormat0.setIndent("3cg5:xf_})-.");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-trimText";
      int int1 = 39;
      outputFormat0.parseOptions(stringArray0, 39);
      outputFormat0.parseOptions(stringArray0, 23);
      outputFormat0.parseOptions(stringArray0, 23);
      OutputFormat outputFormat1 = new OutputFormat("-indent");
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      String[] stringArray1 = new String[2];
      stringArray1[0] = "3cg5:xf_})-.";
      stringArray1[1] = "-indent";
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray1, 1);
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-suppressDeclaration", true);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "-suppressDeclaration";
      stringArray0[2] = "-suppressDeclaration";
      stringArray0[3] = "-suppressDeclaration";
      stringArray0[4] = "-suppressDeclaration";
      stringArray0[5] = "-suppressDeclaration";
      stringArray0[6] = "-suppressDeclaration";
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-423));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -423
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6001660731596457
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-encoding";
      stringArray0[1] = "-expandEmp~";
      stringArray0[2] = "-expandEmp~";
      outputFormat0.parseOptions(stringArray0, 0);
      int int0 = outputFormat0.parseOptions(stringArray0, 4172);
      assertEquals("-expandEmp~", outputFormat0.getEncoding());
      assertEquals(4172, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "utxBH[Iz9YlpX";
      OutputFormat outputFormat0 = new OutputFormat("utxBH[Iz9YlpX");
      outputFormat0.parseOptions(stringArray0, 0);
      OutputFormat outputFormat1 = new OutputFormat("utxBH[Iz9YlpX");
      String[] stringArray1 = new String[1];
      stringArray1[0] = "utxBH[Iz9YlpX";
      outputFormat1.parseOptions(stringArray1, 1151);
      String[] stringArray2 = new String[1];
      stringArray2[0] = "-padText";
      int int0 = 0;
      outputFormat1.parseOptions(stringArray2, 0);
      String[] stringArray3 = null;
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions((String[]) null, 630);
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
  /*Coverage entropy=1.5403058252265167
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "ovU6;FZ<^f18";
      OutputFormat outputFormat0 = new OutputFormat("-indentSize", true, "ovU6;FZ<^f18");
      String[] stringArray0 = new String[4];
      outputFormat0.setIndentSize(1961);
      outputFormat0.setIndentSize(1961);
      outputFormat0.setIndent(true);
      stringArray0[0] = "-indentSize";
      outputFormat0.setLineSeparator("-indentSize");
      outputFormat0.setIndentSize(3273);
      String string1 = "";
      stringArray0[1] = "";
      stringArray0[2] = "-indentSize";
      outputFormat0.setXHTML(true);
      stringArray0[3] = "ovU6;FZ<^f18";
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
