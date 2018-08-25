/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:29:52 GMT 2018
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
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-primZext", false, "-primZext");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-primZext";
      stringArray0[1] = "-primZext";
      stringArray0[2] = "-primZext";
      stringArray0[3] = "-primZext";
      outputFormat0.setEncoding("-primZext");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      stringArray0[4] = "-primZext";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewlines(false);
      outputFormat0.setXHTML(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setLineSeparator("");
      outputFormat0.isPadText();
      outputFormat0.isXHTML();
      boolean boolean0 = outputFormat0.isXHTML();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setPadText(true);
      outputFormat0.setPadText(false);
      outputFormat0.isXHTML();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getIndent();
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.8717814824679821
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null, false, "!p?~U5e_!b%SY?b,s}^");
      outputFormat0.getEncoding();
      outputFormat0.setNewLineAfterNTags((-628482866));
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "!p?~U5e_!b%SY?b,s}^";
      stringArray0[2] = "!p?~U5e_!b%SY?b,s}^";
      stringArray0[3] = "o=\"Dv=^Xi";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setLineSeparator("!p?~U5e_!b%SY?b,s}^");
      int int0 = 3097;
      outputFormat0.parseOptions(stringArray0, 3097);
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-531094882));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9495936677167384
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(")", false, ")");
      outputFormat0.setNewLineAfterNTags((-1626073033));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-trimText";
      stringArray0[3] = ")";
      outputFormat0.setTrimText(false);
      stringArray0[4] = ")";
      stringArray0[5] = "gmk&F/Y0vSx]>l_'$^2*";
      String[] stringArray1 = new String[8];
      stringArray1[0] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[1] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[2] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[3] = "";
      stringArray1[4] = ")";
      stringArray1[5] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[6] = "!p?~U5";
      stringArray1[7] = "-trimText";
      outputFormat0.parseOptions(stringArray1, 7);
      int int0 = (-531094882);
      outputFormat0.setXHTML(false);
      outputFormat0.parseOptions(stringArray0, 151);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-primZext", false, "-primZext");
      String[] stringArray0 = new String[5];
      outputFormat0.setPadText(false);
      stringArray0[0] = "-primZext";
      stringArray0[1] = "-primZext";
      stringArray0[2] = "-primZext";
      stringArray0[3] = "-primZext";
      stringArray0[4] = "-primZext";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals(1, int0);
      
      outputFormat0.parseOptions(stringArray0, 6601);
      int int1 = outputFormat0.parseOptions(stringArray0, 6601);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("-primZext", outputFormat0.getEncoding());
      assertEquals("-primZext", outputFormat0.getIndent());
      assertEquals(6601, int1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.509137344082687
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      String[] stringArray0 = new String[5];
      outputFormat0.setSuppressDeclaration(false);
      stringArray0[0] = "-peik^ext";
      stringArray0[1] = "-peik^ext";
      stringArray0[2] = "-peik^ext";
      stringArray0[3] = "-peik^ext";
      stringArray0[4] = "-peik^ext";
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0791615912646864
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      outputFormat0.setXHTML(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-peik^ext";
      outputFormat0.setExpandEmptyElements(false);
      stringArray0[1] = "-peik^ext";
      stringArray0[2] = "-peik^ext";
      stringArray0[3] = "-peik^ext";
      stringArray0[4] = "-peik^ext";
      outputFormat0.setEncoding("-peik^ext");
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.getNewLineAfterNTags();
      assertEquals(0, int0);
      
      int int1 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals(1, int1);
      
      int int2 = outputFormat0.parseOptions(stringArray0, 1314);
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("-peik^ext", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("-peik^ext", outputFormat0.getIndent());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(1314, int2);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-peik^ext";
      outputFormat0.setIndent("iAZ>B};h&Y");
      stringArray0[1] = "-peik^ext";
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals(1, int0);
      
      int int1 = outputFormat0.parseOptions(stringArray0, 6601);
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isNewlines());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isPadText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("iAZ>B};h&Y", outputFormat0.getIndent());
      assertEquals(6601, int1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      assertEquals("-peik^ext", outputFormat0.getIndent());
      
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-peik^ext";
      stringArray0[1] = "-peik^ext";
      stringArray0[2] = "-peik^ext";
      stringArray0[3] = "-peik^ext";
      stringArray0[4] = "-peik^ext";
      outputFormat0.setIndentSize(2);
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1);
      int int0 = outputFormat0.parseOptions(stringArray0, 7);
      assertEquals("  ", outputFormat0.getIndent());
      assertEquals(7, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "-peik^ext";
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('_');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (_)
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
      outputFormat0.setAttributeQuoteCharacter('\"');
      outputFormat0.setPadText(false);
      outputFormat0.setTrimText(true);
      outputFormat0.getLineSeparator();
      outputFormat0.setNewLineAfterNTags(1435);
      assertEquals(1435, outputFormat0.getNewLineAfterNTags());
      
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      assertEquals(0, outputFormat1.getNewLineAfterNTags());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat1.setTrimText(false);
      outputFormat0.setEncoding("#");
      outputFormat0.setOmitEncoding(false);
      outputFormat0.setEncoding("");
      outputFormat0.getAttributeQuoteCharacter();
      outputFormat0.isPadText();
      outputFormat0.setNewLineAfterDeclaration(false);
      assertEquals("", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2337673247041645
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      OutputFormat.createCompactFormat();
      int int0 = 1;
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-peik^ext";
      stringArray0[1] = "-peik^ext";
      stringArray0[2] = "-peik^ext";
      stringArray0[3] = "-peik^ext";
      stringArray0[4] = "-peik^ext";
      outputFormat0.parseOptions(stringArray0, 1);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.setAttributeQuoteCharacter('\"');
      outputFormat0.setPadText(false);
      outputFormat0.setExpandEmptyElements(false);
      outputFormat0.setIndent("!n\"<H@{OX}8,se'Vpan");
      outputFormat0.setTrimText(false);
      outputFormat0.isExpandEmptyElements();
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('k');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (k)
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
      OutputFormat outputFormat0 = new OutputFormat(";Cn8^YB&ly*r1xk,");
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.setTrimText(true);
      outputFormat0.isOmitEncoding();
      outputFormat0.setXHTML(false);
      outputFormat0.setNewLineAfterNTags(0);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertTrue(outputFormat0.isTrimText());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6885673693022827
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      String[] stringArray0 = new String[2];
      outputFormat0.setEncoding("O-oitEncoding");
      outputFormat0.setEncoding("O-oitEncoding");
      stringArray0[0] = "-peik^ext";
      stringArray0[1] = "-peik^ext";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 2547);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "-peik^ext";
      stringArray1[1] = "O-oitEncoding";
      stringArray1[2] = "-peik^ext";
      stringArray1[3] = "-peik^ext";
      stringArray1[4] = "-peik^ext";
      outputFormat0.setIndent(false);
      stringArray1[5] = "O-oitEncoding";
      int int0 = outputFormat0.parseOptions(stringArray1, 2547);
      assertEquals("O-oitEncoding", outputFormat0.getEncoding());
      assertEquals(2547, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      OutputFormat outputFormat0 = new OutputFormat("", false, "M'WTg]ZfT0|");
      outputFormat0.setIndent("");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "M'WTg]ZfT0|";
      stringArray0[1] = "=PN='";
      stringArray0[2] = "M'WTg]ZfT0|";
      stringArray0[3] = "-xhtmlGdu)#l+";
      stringArray0[4] = "-xhtmlGdu)#l+";
      stringArray0[5] = "M'WTg]ZfT0|";
      stringArray0[6] = "";
      stringArray0[7] = "-xhtmlGdu)#l+";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setOmitEncoding(true);
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-1995927616));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("", true);
      assertEquals("", outputFormat0.getIndent());
      
      outputFormat0.setIndent(true);
      boolean boolean0 = outputFormat0.isNewlines();
      assertEquals("  ", outputFormat0.getIndent());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("i34", false, "");
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setXHTML(true);
      outputFormat0.setPadText(false);
      boolean boolean0 = outputFormat0.isTrimText();
      assertTrue(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isOmitEncoding());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("::b|_!@bV[,1c", false, "");
      outputFormat0.setOmitEncoding(false);
      String string0 = outputFormat0.getIndent();
      assertEquals("::b|_!@bV[,1c", string0);
      
      outputFormat0.setExpandEmptyElements(false);
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertEquals("\n", outputFormat0.getLineSeparator());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-peik^ext", false, "-peik^ext");
      outputFormat0.setOmitEncoding(false);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-peik^ext";
      stringArray0[1] = "-peik^ext";
      stringArray0[2] = "-peik^ext";
      stringArray0[3] = "-peik^ext";
      stringArray0[4] = "-peik^ext";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 7);
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals("-peik^ext", outputFormat0.getEncoding());
      assertEquals(1, int0);
      assertEquals("-peik^ext", outputFormat0.getIndent());
      assertFalse(outputFormat0.isOmitEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("p+bXF7^]R6j0uc>:95", false, "{OiEL.Z6=");
      outputFormat0.setEncoding((String) null);
      assertEquals("{OiEL.Z6=", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isTrimText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isPadText());
      assertEquals("p+bXF7^]R6j0uc>:95", outputFormat0.getIndent());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      String[] stringArray0 = new String[0];
      outputFormat0.parseOptions(stringArray0, 0);
      assertEquals("UTF-8", outputFormat0.getEncoding());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertFalse(outputFormat0.isPadText());
      assertFalse(outputFormat0.isXHTML());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertFalse(outputFormat0.isNewlines());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isTrimText());
      assertFalse(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(")", false, "I}R(=G8~{$");
      OutputFormat outputFormat1 = new OutputFormat("jQ-mk5Q1),U?W4\"!}ib", false, "-padText");
      outputFormat1.setOmitEncoding(true);
      outputFormat1.getLineSeparator();
      outputFormat1.setTrimText(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "}V~.1MTl";
      stringArray0[1] = ")";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "}V~.1MTl";
      stringArray0[4] = "";
      stringArray0[5] = "}V~.1MTl";
      stringArray0[6] = "\n";
      stringArray0[7] = ")";
      stringArray0[8] = "}V~.1MTl";
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false, "-expandEmpty");
      outputFormat0.isNewLineAfterDeclaration();
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      assertFalse(outputFormat0.isXHTML());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("org.dom4j.io.OutputFormat");
      outputFormat0.setIndent(false);
      outputFormat0.setNewLineAfterNTags(0);
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      outputFormat0.setExpandEmptyElements(false);
      outputFormat1.setIndent(false);
      assertTrue(outputFormat1.isTrimText());
      
      outputFormat0.getEncoding();
      outputFormat0.isSuppressDeclaration();
      outputFormat1.setTrimText(false);
      assertFalse(outputFormat1.isXHTML());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-primZext", false, "-primZext");
      assertEquals("-primZext", outputFormat0.getIndent());
      
      outputFormat0.setIndent((String) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-primZext";
      stringArray0[1] = "-primZext";
      stringArray0[2] = "-primZext";
      stringArray0[1] = "-primZext";
      stringArray0[4] = "-primZext";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertEquals(1, int0);
      
      outputFormat0.parseOptions(stringArray0, 6601);
      assertEquals(0, outputFormat0.getNewLineAfterNTags());
      assertEquals("\n", outputFormat0.getLineSeparator());
      assertFalse(outputFormat0.isXHTML());
      assertFalse(outputFormat0.isExpandEmptyElements());
      assertFalse(outputFormat0.isPadText());
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      assertEquals('\"', outputFormat0.getAttributeQuoteCharacter());
      assertFalse(outputFormat0.isNewlines());
      assertEquals("-primZext", outputFormat0.getEncoding());
      assertFalse(outputFormat0.isSuppressDeclaration());
      assertFalse(outputFormat0.isOmitEncoding());
      assertFalse(outputFormat0.isTrimText());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("E0<T`cFwQ0FxVv+i", false, "M'WTg]ZfT0|");
      assertFalse(outputFormat0.isXHTML());
      
      String[] stringArray0 = new String[9];
      stringArray0[0] = "E0<T`cFwQ0FxVv+i";
      stringArray0[1] = "-xhtmlGdu)#l+";
      stringArray0[2] = "=P~l=";
      stringArray0[3] = "E0<T`cFwQ0FxVv+i";
      stringArray0[4] = "E0<T`cFwQ0FxVv+i";
      stringArray0[0] = "E0<T`cFwQ0FxVv+i";
      stringArray0[2] = "=P~l=";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty-encoding", false, "-trimText");
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = ")";
      stringArray0[1] = "-expandEmpty-encoding";
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(")", false, ")");
      OutputFormat outputFormat1 = new OutputFormat();
      OutputFormat outputFormat2 = new OutputFormat("-omitEncoding", false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-omitEncoding";
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat1.setTrimText(false);
      outputFormat1.parseOptions(stringArray0, 0);
      outputFormat2.parseOptions(stringArray0, 698);
      OutputFormat outputFormat3 = OutputFormat.createCompactFormat();
      String[] stringArray1 = new String[7];
      stringArray1[0] = ")";
      stringArray1[1] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[2] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray1[3] = "-trimZext";
      stringArray1[4] = "-omitEncoding";
      stringArray1[5] = "-omitEncoding";
      stringArray1[6] = "-trimZext";
      // Undeclared exception!
      try { 
        outputFormat3.parseOptions(stringArray1, (-1728));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-encoding", false, "");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-primZext";
      stringArray0[1] = "-encoding";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      OutputFormat outputFormat1 = new OutputFormat();
      int int0 = (-1626073033);
      outputFormat0.setIndent(false);
      outputFormat1.setNewLineAfterNTags((-2040130349));
      String[] stringArray0 = new String[6];
      stringArray0[0] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray0[1] = "-trimText";
      stringArray0[2] = "-trimText";
      stringArray0[3] = "-padText";
      stringArray0[5] = "-xhtml  ";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-indent", true);
      outputFormat0.setIndentSize(0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-lineSeparator";
      stringArray0[3] = "o6k^YL\"B=RWRUilk";
      stringArray0[4] = "-indent";
      stringArray0[5] = "gv,)F5y!/B92 ,C";
      stringArray0[6] = "-indent";
      stringArray0[8] = "-lineSeparator";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(")", false, ")");
      outputFormat0.setAttributeQuoteCharacter('\'');
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setNewLineAfterNTags((-1626073033));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-primZext";
      stringArray0[1] = "-primZext";
      stringArray0[2] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray0[3] = ")";
      stringArray0[5] = "gmk&F/Y0vSx]>l_'$^2*";
      stringArray0[6] = "OoitE<ncoding";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.setTrimText(false);
      String[] stringArray1 = new String[7];
      int int0 = (-1796);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setIndent(")");
      int int0 = 1;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "I}R(=G8~{$";
      stringArray0[1] = "-indentSize";
      stringArray0[3] = ")";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-trimText", false, "-trimText");
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setNewLineAfterNTags((-1626073033));
      String string0 = "-suppressDeclaration";
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-trimText";
      stringArray0[1] = "-trimText";
      stringArray0[2] = "-suppressDeclaration";
      stringArray0[3] = "-trimText";
      outputFormat0.setTrimText(false);
      stringArray0[4] = "-trimText";
      stringArray0[5] = "-suppressDeclaration";
      stringArray0[6] = "O-oitEncoding";
      outputFormat0.parseOptions(stringArray0, 1);
      outputFormat0.parseOptions(stringArray0, 1662);
      String string1 = "m";
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-3228));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}