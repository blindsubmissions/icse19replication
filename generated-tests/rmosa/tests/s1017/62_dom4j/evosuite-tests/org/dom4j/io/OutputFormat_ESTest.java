/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 13:05:28 GMT 2018
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
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-suppressDecl!raZion";
      stringArray0[2] = "-suppressDecl!raZion";
      outputFormat0.setNewLineAfterDeclaration(false);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
      
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setNewlines(false);
      outputFormat1.getIndent();
      String[] stringArray1 = new String[5];
      stringArray1[0] = ",vrol\"iPO";
      stringArray1[2] = "-suppressDecl!raZion";
      stringArray1[3] = "-suppressDecl!raZion";
      outputFormat1.parseOptions(stringArray1, 0);
      outputFormat1.parseOptions(stringArray0, 505);
      assertTrue(outputFormat1.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("org.dom4j.io.OutputFormat", true, "org.dom4j.io.OutputFormat");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-indent";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-indent";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[2];
      outputFormat0.setNewLineAfterNTags((-2658));
      stringArray0[0] = "NFOvT";
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.parseOptions(stringArray0, 393);
      outputFormat0.setIndent("NFOvT");
      outputFormat0.setPadText(false);
      outputFormat0.setIndent("-expandEmptyTD");
      stringArray0[1] = "s1eEx^plJ%I";
      outputFormat0.setIndentSize(393);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.setTrimText(true);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.setIndent("");
      outputFormat0.parseOptions(stringArray0, 591);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-4846));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4846
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-suppressDecl!raZion";
      stringArray0[2] = "-suppressDecl!raZion";
      String[] stringArray1 = new String[2];
      outputFormat0.setEncoding("W");
      stringArray1[0] = "-suppressDecl!raZion";
      stringArray1[1] = "W";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray1, (-181));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -181
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
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpt&y");
      assertTrue(outputFormat0.isNewLineAfterDeclaration());
      
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setIndent(false);
      assertFalse(outputFormat0.isNewLineAfterDeclaration());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterNTags(1229);
      boolean boolean0 = outputFormat0.isTrimText();
      assertEquals(1229, outputFormat0.getNewLineAfterNTags());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.48509409130221154
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-suppressDeclaration";
      stringArray0[1] = "roS?OqP3|FAkT";
      stringArray0[2] = "tB2hEZ";
      outputFormat0.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7201248812718097
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[3];
      outputFormat0.setOmitEncoding(true);
      outputFormat0.setPadText(false);
      stringArray0[0] = "-suppressDecl!raZion";
      stringArray0[1] = "roS?OqP3|FAkT";
      stringArray0[2] = "-suppressDecl!raZion";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpty", false);
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      boolean boolean0 = outputFormat0.isXHTML();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[3];
      outputFormat0.setExpandEmptyElements(true);
      stringArray0[0] = "-suppressDecl!raZion";
      stringArray0[2] = "-suppressDecl!raZion";
      outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isExpandEmptyElements());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpt&y");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-expandEmpt&y";
      stringArray0[2] = "-expandEmpt&y";
      stringArray0[3] = "-expandEmpt&y";
      stringArray0[4] = "-expandEmpt&y";
      stringArray0[5] = "-expandEmpt&y";
      outputFormat0.parseOptions(stringArray0, 0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "-expandEmpt&y";
      stringArray1[1] = "-expandEmpt&y";
      stringArray1[2] = "-expandEmpt&y";
      outputFormat0.parseOptions(stringArray1, 189);
      outputFormat0.setIndentSize(34);
      outputFormat0.parseOptions(stringArray1, 34);
      outputFormat0.parseOptions(stringArray0, 3619);
      outputFormat0.parseOptions(stringArray1, 0);
      assertEquals("                                  ", outputFormat0.getIndent());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.getIndent();
      outputFormat0.setPadText(false);
      outputFormat0.setIndentSize(0);
      outputFormat0.isExpandEmptyElements();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.isExpandEmptyElements();
      outputFormat0.getLineSeparator();
      assertEquals("\n", outputFormat0.getLineSeparator());
      
      outputFormat0.setLineSeparator("");
      outputFormat0.isPadText();
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.isPadText();
      outputFormat0.getIndent();
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.isNewLineAfterDeclaration();
      OutputFormat.createCompactFormat();
      outputFormat0.getIndent();
      boolean boolean0 = outputFormat0.isExpandEmptyElements();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setPadText(true);
      String[] stringArray0 = new String[8];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[5] = "}pZ:";
      stringArray0[6] = null;
      stringArray0[7] = null;
      outputFormat0.parseOptions(stringArray0, 208);
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.setLineSeparator((String) null);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setTrimText(false);
      outputFormat0.isNewlines();
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions((String[]) null, (-1578));
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("org.dom4j.io.OutputFormat", true, "org.dom4j.io.OutputFormat");
      outputFormat0.setNewlines(false);
      String[] stringArray0 = new String[6];
      outputFormat0.setIndent(false);
      stringArray0[5] = "-indent";
      stringArray0[1] = "-indent";
      stringArray0[2] = "-indent";
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("lBpWfmnOfYoNWA?7S", true);
      int int0 = 0;
      // Undeclared exception!
      try { 
        outputFormat0.setAttributeQuoteCharacter('0');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid attribute quote character (0)
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.getEncoding();
      outputFormat0.setExpandEmptyElements(true);
      outputFormat0.getNewLineAfterNTags();
      outputFormat0.isPadText();
      outputFormat0.setLineSeparator("UTF-8");
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.setSuppressDeclaration(true);
      outputFormat0.isSuppressDeclaration();
      outputFormat0.setIndent(true);
      outputFormat0.getNewLineAfterNTags();
      boolean boolean0 = outputFormat0.isXHTML();
      assertEquals("UTF-8", outputFormat0.getLineSeparator());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isExpandEmptyElements());
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-expandEmpty-xhtml,vrol\"iPO";
      stringArray0[1] = "Q4@";
      stringArray0[2] = "19NS/ojFFPTn{9,V&&";
      stringArray0[3] = "-suppressDeclaration";
      int int0 = outputFormat0.parseOptions(stringArray0, 0);
      assertTrue(outputFormat0.isExpandEmptyElements());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat(" ");
      outputFormat0.setIndent(" ");
      outputFormat0.setNewlines(true);
      outputFormat0.setNewLineAfterDeclaration(false);
      outputFormat0.setIndent(" ");
      outputFormat0.setNewlines(true);
      outputFormat0.setNewlines(false);
      outputFormat0.getAttributeQuoteCharacter();
      String[] stringArray0 = null;
      outputFormat0.setXHTML(false);
      OutputFormat.createPrettyPrint();
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
  //Test case number: 18
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat((String) null);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat1.setEncoding((String) null);
      outputFormat1.setNewLineAfterDeclaration(false);
      outputFormat0.setEncoding("=7sZBnm");
      outputFormat0.setExpandEmptyElements(false);
      assertEquals("=7sZBnm", outputFormat0.getEncoding());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      outputFormat0.setNewLineAfterDeclaration(true);
      outputFormat0.setNewLineAfterDeclaration(true);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.setIndent(true);
      OutputFormat outputFormat2 = new OutputFormat("-lineSeparator", true, "It=vY|K#A$");
      outputFormat2.setNewlines(true);
      outputFormat0.getIndent();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-lineSeparator";
      stringArray0[1] = "-uppressDecl!raZion";
      stringArray0[2] = "It=vY|K#A$";
      stringArray0[3] = null;
      stringArray0[4] = "-uppressDecl!raZion";
      stringArray0[5] = null;
      stringArray0[6] = null;
      stringArray0[7] = null;
      stringArray0[8] = null;
      int int0 = outputFormat2.parseOptions(stringArray0, 0);
      assertEquals("-uppressDecl!raZion", outputFormat2.getLineSeparator());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setXHTML(false);
      char char0 = '\"';
      outputFormat0.setAttributeQuoteCharacter('\"');
      OutputFormat outputFormat1 = OutputFormat.createCompactFormat();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-2040320572));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2040320572
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OutputFormat.createCompactFormat();
      OutputFormat outputFormat0 = OutputFormat.createCompactFormat();
      outputFormat0.setAttributeQuoteCharacter('\'');
      assertEquals('\'', outputFormat0.getAttributeQuoteCharacter());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("|!~75mEE*i~", false);
      OutputFormat outputFormat1 = OutputFormat.createPrettyPrint();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat1.isSuppressDeclaration();
      outputFormat0.setIndent("|!~75mEE*i~");
      outputFormat1.isNewLineAfterDeclaration();
      OutputFormat outputFormat2 = OutputFormat.createPrettyPrint();
      outputFormat2.setXHTML(true);
      outputFormat2.setIndent("\"T<*#MdOeQ&<r");
      outputFormat1.isOmitEncoding();
      outputFormat1.isTrimText();
      outputFormat2.isPadText();
      OutputFormat outputFormat3 = new OutputFormat("-encoding");
      outputFormat3.getIndent();
      outputFormat1.getNewLineAfterNTags();
      outputFormat0.isNewLineAfterDeclaration();
      outputFormat0.getIndent();
      outputFormat3.isExpandEmptyElements();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-encoding";
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
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      OutputFormat outputFormat1 = new OutputFormat();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-expandEmpt&y";
      stringArray0[1] = "-expandEmpt&y";
      outputFormat0.parseOptions(stringArray0, 1);
      OutputFormat outputFormat2 = new OutputFormat("maH^4c");
      String[] stringArray1 = new String[9];
      stringArray1[0] = "-expandEmpt&y";
      stringArray1[1] = "-indentSize";
      stringArray1[2] = "maH^4c";
      stringArray1[3] = ",vrol\"iPO";
      stringArray1[4] = "maH^4c";
      stringArray1[5] = "maH^4c";
      stringArray1[6] = ",vrol\"iPO";
      stringArray1[7] = "maH^4c";
      stringArray1[8] = "-expandEmpt&y";
      // Undeclared exception!
      try { 
        outputFormat2.parseOptions(stringArray1, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"maH^4c\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[3];
      outputFormat0.setPadText(false);
      stringArray0[0] = "-suppressDecl!raZion";
      stringArray0[1] = "roS?OqP3|FAkT";
      stringArray0[2] = "-suppressDecl!raZion";
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.getIndent();
      String[] stringArray1 = new String[5];
      stringArray1[0] = ",vrol\"iPO";
      String[] stringArray2 = new String[8];
      stringArray2[0] = "-padText";
      stringArray2[1] = "roS?OqP3|FAkT";
      stringArray2[2] = "-suppressDecl!raZion";
      stringArray2[3] = "roS?OqP3|FAkT";
      stringArray2[4] = "-suppressDecl!raZion";
      stringArray2[5] = "-suppressDecl!raZion";
      stringArray2[6] = "-suppressDecl!raZion";
      stringArray2[7] = "-suppressDecl!raZion";
      outputFormat0.parseOptions(stringArray2, 0);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray1, (-2414));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2414
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
      OutputFormat outputFormat0 = new OutputFormat("-expandEmpt&y");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-expandEmpt&y";
      stringArray0[1] = "-xhtml<pl,P";
      stringArray0[2] = "-expandEmpt&y";
      stringArray0[3] = "-expandEmpt&y";
      stringArray0[4] = "-expandEmpt&y";
      stringArray0[5] = "-expandEmpt&y";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 0);
      assertFalse(outputFormat0.isXHTML());
      
      int int0 = outputFormat0.parseOptions(stringArray0, 1);
      assertTrue(outputFormat0.isXHTML());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      assertFalse(outputFormat0.isOmitEncoding());
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-omitEncoding";
      stringArray0[1] = "-omitEncoding";
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 2);
      outputFormat0.parseOptions(stringArray0, 2);
      assertTrue(outputFormat0.isOmitEncoding());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat();
      String[] stringArray0 = new String[2];
      outputFormat0.setNewLineAfterNTags((-2658));
      stringArray0[0] = "-newlines";
      outputFormat0.setSuppressDeclaration(false);
      outputFormat0.parseOptions(stringArray0, 393);
      outputFormat0.setIndent("-newlines");
      outputFormat0.setPadText(false);
      outputFormat0.setIndent("-expandEmptyTD");
      stringArray0[1] = "s1eEx^plJ%I";
      outputFormat0.setIndentSize(393);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.setTrimText(true);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.parseOptions(stringArray0, 0);
      outputFormat0.parseOptions(stringArray0, 50);
      outputFormat0.setIndent("");
      outputFormat0.parseOptions(stringArray0, 591);
      // Undeclared exception!
      try { 
        outputFormat0.parseOptions(stringArray0, (-4846));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4846
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("");
      outputFormat0.setNewLineAfterDeclaration(false);
      OutputFormat outputFormat1 = new OutputFormat();
      outputFormat1.getIndent();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-trimText";
      stringArray0[1] = ",vrol\"iPO";
      stringArray0[2] = null;
      stringArray0[3] = "-expandEmpt&";
      stringArray0[4] = null;
      stringArray0[5] = ",vrol\"iPO";
      stringArray0[6] = null;
      stringArray0[7] = "-expandEmpt&y";
      stringArray0[8] = "-expandEmpt&y";
      outputFormat1.parseOptions(stringArray0, 0);
      // Undeclared exception!
      try { 
        outputFormat1.parseOptions(stringArray0, (-134));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -134
         //
         verifyException("org.dom4j.io.OutputFormat", e);
      }
  }
}
