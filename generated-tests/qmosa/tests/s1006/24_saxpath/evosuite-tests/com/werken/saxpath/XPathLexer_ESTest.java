/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:28:52 GMT 2018
 */

package com.werken.saxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.werken.saxpath.Token;
import com.werken.saxpath.XPathLexer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XPathLexer_ESTest extends XPathLexer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(":=pG%=$4I");
      xPathLexer0.and();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      assertEquals("", token0.getTokenText());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token1.getTokenType());
      assertNotNull(token1);
      
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.comma();
      assertEquals(32, token2.getTokenType());
      assertEquals("p", token2.getTokenText());
      
      xPathLexer0.endPosition();
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      assertEquals("G", token3.getTokenText());
      
      xPathLexer0.relationalOperator();
      int int0 = xPathLexer0.endPosition();
      assertEquals(9, int0);
      
      Token token4 = xPathLexer0.rightParen();
      assertEquals(2, token4.getTokenType());
      assertEquals("%", token4.getTokenText());
      
      xPathLexer0.mod();
      Token token5 = xPathLexer0.notEquals();
      assertEquals(22, token5.getTokenType());
      assertEquals("=$", token5.getTokenText());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      Token token0 = xPathLexer0.at();
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.and();
      xPathLexer0.minus();
      Token token1 = xPathLexer0.minus();
      assertEquals("m", token1.getTokenText());
      assertEquals(6, token1.getTokenType());
      
      Token token2 = xPathLexer0.comma();
      assertEquals(".", token2.getTokenText());
      assertEquals(32, token2.getTokenType());
      
      Token token3 = xPathLexer0.number();
      assertEquals("", token3.getTokenText());
      assertEquals(30, token3.getTokenType());
      
      Token token4 = xPathLexer0.equals();
      assertEquals("w", token4.getTokenText());
      
      Token token5 = xPathLexer0.slashes();
      assertEquals("e", token5.getTokenText());
      
      Token token6 = xPathLexer0.leftParen();
      assertEquals("r", token6.getTokenText());
      
      Token token7 = xPathLexer0.literal();
      assertEquals(27, token7.getTokenType());
      assertEquals("en.saxpath.To", token7.getTokenText());
      
      Token token8 = xPathLexer0.whitespace();
      Token token9 = xPathLexer0.at();
      assertEquals(16, token9.getTokenType());
      
      Token token10 = xPathLexer0.leftParen();
      assertEquals(1, token10.getTokenType());
      
      xPathLexer0.and();
      xPathLexer0.setPreviousToken(token8);
      assertEquals((-2), token8.getTokenType());
      
      Token token11 = xPathLexer0.leftBracket();
      assertEquals(3, token11.getTokenType());
      
      xPathLexer0.identifier();
      xPathLexer0.identifier();
      xPathLexer0.relationalOperator();
      Token token12 = xPathLexer0.slashes();
      assertEquals(11, token12.getTokenType());
      
      xPathLexer0.mod();
      Token token13 = xPathLexer0.equals();
      assertEquals(21, token13.getTokenType());
      
      Token token14 = xPathLexer0.identifier();
      assertEquals(15, token14.getTokenType());
      
      int int0 = xPathLexer0.currentPosition();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.leftParen();
      xPathLexer0.slashes();
      Token token0 = xPathLexer0.doubleColon();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.werken.saxpath.Token", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.relationalOperator();
      xPathLexer0.identifier();
      xPathLexer0.div();
      xPathLexer0.or();
      xPathLexer0.relationalOperator();
      xPathLexer0.relationalOperator();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.and();
      xPathLexer0.dots();
      xPathLexer0.leftBracket();
      xPathLexer0.and();
      xPathLexer0.mod();
      Token token0 = xPathLexer0.slashes();
      assertEquals(11, token0.getTokenType());
      
      xPathLexer0.consume(1822);
      xPathLexer0.consume();
      xPathLexer0.identifierOrOperatorName();
      int int0 = xPathLexer0.endPosition();
      assertEquals(0, int0);
      
      Token token1 = xPathLexer0.whitespace();
      assertEquals((-2), token1.getTokenType());
      
      xPathLexer0.or();
      xPathLexer0.consume();
      xPathLexer0.div();
      xPathLexer0.consume();
      xPathLexer0.identifier();
      Token token2 = xPathLexer0.leftBracket();
      assertEquals(3, token2.getTokenType());
      
      xPathLexer0.notEquals();
      Token token3 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token3.getTokenType());
      
      xPathLexer0.getPreviousToken();
      Token token4 = xPathLexer0.leftParen();
      assertEquals(1, token4.getTokenType());
      
      Token token5 = xPathLexer0.notEquals();
      assertEquals(22, token5.getTokenType());
      
      Token token6 = xPathLexer0.dots();
      assertEquals(13, token6.getTokenType());
      
      Token token7 = xPathLexer0.minus();
      assertEquals(6, token7.getTokenType());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.number();
      XPathLexer xPathLexer1 = new XPathLexer("");
      xPathLexer1.colon();
      xPathLexer1.star();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.werken.saxpath.Token", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("wXZs6UCn*'");
      xPathLexer0.operatorName();
      Token token0 = xPathLexer0.colon();
      assertEquals(18, token0.getTokenType());
      assertEquals("w", token0.getTokenText());
      
      Token token1 = xPathLexer0.doubleColon();
      String string0 = token1.toString();
      assertEquals("[ (19) (XZ)", string0);
      
      xPathLexer0.setPreviousToken(token1);
      xPathLexer0.getPreviousToken();
      boolean boolean0 = xPathLexer0.isIdentifierChar('9');
      assertTrue(boolean0);
      
      Token token2 = xPathLexer0.minus();
      assertEquals(6, token2.getTokenType());
      assertEquals("s", token2.getTokenText());
      
      Token token3 = xPathLexer0.rightParen();
      assertEquals(2, token3.getTokenType());
      assertEquals("6", token3.getTokenText());
      
      xPathLexer0.or();
      Token token4 = xPathLexer0.not();
      assertEquals(23, token4.getTokenType());
      assertEquals("U", token4.getTokenText());
      
      Token token5 = xPathLexer0.plus();
      assertEquals("C", token5.getTokenText());
      assertEquals(5, token5.getTokenType());
      
      Token token6 = xPathLexer0.getPreviousToken();
      assertEquals("XZ", token6.getTokenText());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.relationalOperator();
      Token token0 = xPathLexer0.rightParen();
      assertEquals(2, token0.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.mod();
      xPathLexer0.mod();
      xPathLexer0.pipe();
      Token token1 = xPathLexer0.minus();
      assertEquals(6, token1.getTokenType());
      
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      
      xPathLexer0.setXPath("");
      Token token3 = xPathLexer0.pipe();
      assertEquals(17, token3.getTokenType());
      
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.notEquals();
      assertEquals(22, token5.getTokenType());
      
      Token token6 = xPathLexer0.leftBracket();
      assertEquals(3, token6.getTokenType());
      
      Token token7 = xPathLexer0.identifierOrOperatorName();
      assertNull(token7);
      
      boolean boolean0 = xPathLexer0.isIdentifierChar('I');
      assertTrue(boolean0);
      
      Token token8 = xPathLexer0.at();
      assertEquals(16, token8.getTokenType());
      
      Token token9 = xPathLexer0.plus();
      assertEquals(5, token9.getTokenType());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      
      Token token1 = xPathLexer0.notEquals();
      assertEquals(22, token1.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.consume(1452);
      Token token2 = xPathLexer0.leftBracket();
      assertEquals(3, token2.getTokenType());
      
      xPathLexer0.minus();
      xPathLexer0.consume(0);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.dollar();
      Token token3 = xPathLexer0.whitespace();
      assertEquals((-2), token3.getTokenType());
      
      xPathLexer0.identifier();
      Token token4 = xPathLexer0.rightParen();
      assertEquals(2, token4.getTokenType());
      
      Token token5 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token5.getTokenType());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertFalse(boolean0);
      
      Token token6 = xPathLexer0.dollar();
      assertEquals(26, token6.getTokenType());
      
      Token token7 = xPathLexer0.slashes();
      assertEquals(11, token7.getTokenType());
      
      Token token8 = xPathLexer0.colon();
      assertEquals(18, token8.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token9 = xPathLexer0.minus();
      assertEquals(6, token9.getTokenType());
      
      Token token10 = xPathLexer0.comma();
      assertEquals(32, token10.getTokenType());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("N[Ghly");
      xPathLexer0.or();
      xPathLexer0.identifier();
      xPathLexer0.rightParen();
      xPathLexer0.colon();
      xPathLexer0.consume((-1));
      xPathLexer0.dollar();
      xPathLexer0.or();
      xPathLexer0.leftParen();
      xPathLexer0.not();
      xPathLexer0.endPosition();
      xPathLexer0.div();
      xPathLexer0.consume();
      xPathLexer0.leftParen();
      xPathLexer0.and();
      xPathLexer0.or();
      xPathLexer0.rightBracket();
      xPathLexer0.slashes();
      xPathLexer0.consume();
      xPathLexer0.dots();
      xPathLexer0.identifier();
      xPathLexer0.getXPath();
      xPathLexer0.dots();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.rightParen();
      xPathLexer0.literal();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.rightParen();
      xPathLexer0.star();
      xPathLexer0.whitespace();
      Token token0 = xPathLexer0.minus();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.8625321846521685
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.equals();
      xPathLexer0.nextToken();
      xPathLexer0.isIdentifierChar('+');
      xPathLexer0.or();
      xPathLexer0.and();
      xPathLexer0.nextToken();
      xPathLexer0.plus();
      xPathLexer0.setXPath("tlFSbaTFAnj-)qN%}");
      xPathLexer0.nextToken();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9259803095879824
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("o0c0r@&-12HO2{@sD");
      xPathLexer0.literal();
      xPathLexer0.equals();
      xPathLexer0.leftParen();
      xPathLexer0.leftBracket();
      Token token0 = xPathLexer0.doubleColon();
      xPathLexer0.number();
      xPathLexer0.consume();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.minus();
      xPathLexer0.slashes();
      xPathLexer0.whitespace();
      xPathLexer0.literal();
      xPathLexer0.isIdentifierStartChar('_');
      xPathLexer0.leftBracket();
      xPathLexer0.nextToken();
      xPathLexer0.number();
      xPathLexer0.getXPath();
      xPathLexer0.minus();
      xPathLexer0.notEquals();
      Token token1 = xPathLexer0.leftParen();
      assertNotSame(token1, token0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8641550346894935
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftParen();
      xPathLexer0.or();
      xPathLexer0.setPreviousToken(token0);
      assertEquals(1, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.literal();
      Token token1 = xPathLexer0.nextToken();
      assertEquals((-1), token1.getTokenType());
      
      xPathLexer0.literal();
      Token token2 = xPathLexer0.comma();
      assertEquals(32, token2.getTokenType());
      
      xPathLexer0.div();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(31, int0);
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('D');
      assertTrue(boolean0);
      
      Token token3 = xPathLexer0.leftBracket();
      assertEquals(3, token3.getTokenType());
      
      boolean boolean1 = xPathLexer0.hasMoreChars();
      assertFalse(boolean1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.doubleColon();
      xPathLexer0.mod();
      xPathLexer0.consume((-83));
      // Undeclared exception!
      try { 
        xPathLexer0.relationalOperator();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6723516979942694
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.comma();
      Token token0 = xPathLexer0.plus();
      token0.toString();
      token0.toString();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.slashes();
      xPathLexer0.notEquals();
      xPathLexer0.identifier();
      Token token1 = xPathLexer0.relationalOperator();
      assertNull(token1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.9013917957009054
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.and();
      xPathLexer0.minus();
      Token token0 = xPathLexer0.minus();
      assertEquals(6, token0.getTokenType());
      assertEquals("o", token0.getTokenText());
      
      Token token1 = xPathLexer0.comma();
      assertEquals(32, token1.getTokenType());
      assertEquals("m", token1.getTokenText());
      
      Token token2 = xPathLexer0.number();
      assertEquals(31, token2.getTokenType());
      assertEquals(".", token2.getTokenText());
      
      Token token3 = xPathLexer0.equals();
      assertEquals("w", token3.getTokenText());
      
      Token token4 = xPathLexer0.slashes();
      assertEquals("e", token4.getTokenText());
      
      Token token5 = xPathLexer0.leftParen();
      assertEquals("r", token5.getTokenText());
      
      Token token6 = xPathLexer0.literal();
      assertEquals(27, token6.getTokenType());
      assertEquals("en.saxpath.To", token6.getTokenText());
      
      Token token7 = xPathLexer0.whitespace();
      Token token8 = xPathLexer0.at();
      assertEquals(16, token8.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.and();
      xPathLexer0.setPreviousToken(token7);
      assertEquals("", token7.getTokenText());
      assertEquals((-2), token7.getTokenType());
      
      Token token9 = xPathLexer0.leftBracket();
      assertEquals(3, token9.getTokenType());
      
      xPathLexer0.identifier();
      xPathLexer0.relationalOperator();
      Token token10 = xPathLexer0.slashes();
      assertEquals(11, token10.getTokenType());
      
      xPathLexer0.mod();
      Token token11 = xPathLexer0.equals();
      assertEquals(21, token11.getTokenType());
      
      Token token12 = xPathLexer0.identifier();
      assertEquals(15, token12.getTokenType());
      
      int int0 = xPathLexer0.currentPosition();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9352146226829547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.comma();
      assertEquals("c", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.notEquals();
      assertEquals("om", token1.getTokenText());
      assertEquals(22, token1.getTokenType());
      
      Token token2 = xPathLexer0.plus();
      String string0 = token2.toString();
      assertEquals("[ (5) (.)", string0);
      
      xPathLexer0.and();
      Token token3 = xPathLexer0.nextToken();
      assertEquals(15, token3.getTokenType());
      assertEquals("werken.saxpath.XPathLexer", token3.getTokenText());
      
      xPathLexer0.plus();
      xPathLexer0.setXPath("[ (5) (.)");
      Token token4 = xPathLexer0.nextToken();
      assertEquals(3, token4.getTokenType());
      assertEquals("[", token4.getTokenText());
      
      Token token5 = xPathLexer0.rightParen();
      assertEquals(2, token5.getTokenType());
      assertEquals(" ", token5.getTokenText());
      
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('.');
      Token token6 = xPathLexer0.nextToken();
      assertEquals(1, token6.getTokenType());
      assertEquals("(", token6.getTokenText());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9687693194921126
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftParen();
      xPathLexer0.or();
      xPathLexer0.setPreviousToken(token0);
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.literal();
      Token token1 = xPathLexer0.nextToken();
      assertEquals((-1), token1.getTokenType());
      
      Token token2 = xPathLexer0.leftParen();
      assertEquals(1, token2.getTokenType());
      
      xPathLexer0.literal();
      Token token3 = xPathLexer0.comma();
      assertEquals(32, token3.getTokenType());
      
      xPathLexer0.div();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(32, int0);
      
      xPathLexer0.nextToken();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      xPathLexer0.nextToken();
      Token token4 = xPathLexer0.rightParen();
      assertEquals(2, token4.getTokenType());
      assertEquals("c", token4.getTokenText());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3476187860979079
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("j}JB?");
      Token token0 = xPathLexer0.comma();
      xPathLexer0.notEquals();
      xPathLexer0.plus();
      token0.toString();
      xPathLexer0.and();
      xPathLexer0.nextToken();
      xPathLexer0.plus();
      xPathLexer0.setXPath("65");
      Token token1 = xPathLexer0.nextToken();
      xPathLexer0.rightParen();
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('.');
      Token token2 = xPathLexer0.nextToken();
      assertNotSame(token2, token1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.690828621511594
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.div();
      xPathLexer0.slashes();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.leftBracket();
      xPathLexer1.minus();
      xPathLexer0.number();
      xPathLexer1.minus();
      xPathLexer0.getPreviousToken();
      Token token0 = xPathLexer0.relationalOperator();
      assertNull(token0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1705263545684277
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.comma();
      assertEquals("c", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.notEquals();
      assertEquals("om", token1.getTokenText());
      assertEquals(22, token1.getTokenType());
      
      Token token2 = xPathLexer0.plus();
      String string0 = token2.toString();
      assertEquals("[ (5) (.)", string0);
      
      xPathLexer0.and();
      Token token3 = xPathLexer0.nextToken();
      assertEquals(15, token3.getTokenType());
      assertEquals("werken.saxpath.XPathLexer", token3.getTokenText());
      
      xPathLexer0.plus();
      xPathLexer0.setXPath("[ (5) (.)");
      Token token4 = xPathLexer0.nextToken();
      assertEquals("[", token4.getTokenText());
      assertEquals(3, token4.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('.');
      Token token5 = xPathLexer0.nextToken();
      assertEquals("(", token5.getTokenText());
      assertEquals(1, token5.getTokenType());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.2193205932160343
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.at();
      xPathLexer0.and();
      xPathLexer0.minus();
      xPathLexer0.minus();
      xPathLexer0.comma();
      xPathLexer0.number();
      xPathLexer0.equals();
      xPathLexer0.slashes();
      xPathLexer0.leftParen();
      xPathLexer0.literal();
      XPathLexer xPathLexer1 = new XPathLexer(")");
      xPathLexer1.consume(56);
      xPathLexer1.identifierOrOperatorName();
      xPathLexer0.nextToken();
      xPathLexer0.plus();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.nextToken();
      xPathLexer2.setXPath(")");
      xPathLexer2.nextToken();
      xPathLexer2.rightParen();
      Token token0 = xPathLexer2.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.1648195017141967
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(":=pG%=$4I");
      xPathLexer0.and();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertEquals("", token1.getTokenText());
      
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.comma();
      assertEquals(32, token2.getTokenType());
      assertEquals("p", token2.getTokenText());
      
      xPathLexer0.setXPath("QUsMraiDY$L{Mm");
      xPathLexer0.nextToken();
      Token token3 = xPathLexer0.rightParen();
      assertEquals("$", token3.getTokenText());
      assertEquals(2, token3.getTokenType());
      
      xPathLexer0.mod();
      XPathLexer xPathLexer1 = new XPathLexer("QUsMraiDY$L{Mm");
      boolean boolean0 = xPathLexer1.isIdentifierChar('_');
      assertTrue(boolean0);
      
      Token token4 = xPathLexer1.nextToken();
      assertEquals(15, token4.getTokenType());
      assertEquals("QUsMraiDY", token4.getTokenText());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.197670868638955
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("j}JB?");
      Token token0 = xPathLexer0.comma();
      Token token1 = xPathLexer0.notEquals();
      assertEquals(22, token1.getTokenType());
      assertEquals("}J", token1.getTokenText());
      
      xPathLexer0.plus();
      String string0 = token0.toString();
      assertEquals("[ (32) (j)", string0);
      
      xPathLexer0.and();
      Token token2 = xPathLexer0.number();
      assertEquals("", token2.getTokenText());
      
      Token token3 = xPathLexer0.plus();
      assertEquals(5, token3.getTokenType());
      
      xPathLexer0.setXPath("65");
      Token token4 = xPathLexer0.nextToken();
      assertEquals("65", token4.getTokenText());
      assertEquals(30, token4.getTokenType());
      
      xPathLexer0.rightParen();
      xPathLexer0.mod();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      Token token5 = xPathLexer0.nextToken();
      assertEquals((-1), token5.getTokenType());
      
      Token token6 = xPathLexer0.rightParen();
      assertEquals(2, token6.getTokenType());
      assertEquals("c", token6.getTokenText());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9434998662499046
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.leftParen();
      XPathLexer xPathLexer1 = new XPathLexer("2;V9Z<93K");
      xPathLexer1.or();
      xPathLexer0.setPreviousToken((Token) null);
      xPathLexer1.literal();
      Token token0 = xPathLexer1.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      Token token1 = xPathLexer0.leftParen();
      assertEquals("o", token1.getTokenText());
      assertEquals(1, token1.getTokenType());
      
      XPathLexer xPathLexer2 = new XPathLexer("2;V9Z<93K");
      xPathLexer2.literal();
      Token token2 = xPathLexer1.comma();
      assertEquals(32, token2.getTokenType());
      
      xPathLexer0.div();
      int int0 = xPathLexer1.currentPosition();
      assertEquals(10, int0);
      
      xPathLexer1.nextToken();
      xPathLexer1.setXPath("");
      Token token3 = xPathLexer0.nextToken();
      assertEquals(15, token3.getTokenType());
      assertEquals("m.werken.saxpath.XPathLexer", token3.getTokenText());
      
      Token token4 = xPathLexer1.rightParen();
      assertEquals(2, token4.getTokenType());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7454526473690444
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftParen();
      xPathLexer0.or();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.literal();
      xPathLexer0.nextToken();
      xPathLexer0.leftParen();
      xPathLexer0.literal();
      xPathLexer0.comma();
      xPathLexer0.div();
      xPathLexer0.currentPosition();
      xPathLexer0.rightParen();
      xPathLexer0.mod();
      XPathLexer xPathLexer1 = new XPathLexer("com.werken.saxpath.XPathLexer");
      XPathLexer xPathLexer2 = new XPathLexer("&");
      xPathLexer2.isIdentifierChar('<');
      Token token1 = xPathLexer2.nextToken();
      Token token2 = xPathLexer0.nextToken();
      assertNotSame(token2, token1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.9877034351533682
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(":=pG%=$4I");
      xPathLexer0.and();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      assertEquals("", token0.getTokenText());
      
      Token token1 = xPathLexer0.minus();
      assertEquals(6, token1.getTokenType());
      assertEquals("=", token1.getTokenText());
      
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.comma();
      assertEquals("G", token2.getTokenText());
      assertEquals(32, token2.getTokenType());
      
      xPathLexer0.setXPath("QUsMraiDY$L{Mm");
      xPathLexer0.nextToken();
      Token token3 = xPathLexer0.nextToken();
      assertEquals("$", token3.getTokenText());
      assertEquals(26, token3.getTokenType());
      
      xPathLexer0.setXPath("eE$k!R~?hw[jusr`l");
      Token token4 = xPathLexer0.nextToken();
      assertEquals(15, token4.getTokenType());
      assertEquals("eE", token4.getTokenText());
      
      Token token5 = xPathLexer0.rightParen();
      assertEquals(2, token5.getTokenType());
      assertEquals("$", token5.getTokenText());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9641805092166793
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("w-0p~4\"`p|ZUKvucy-");
      xPathLexer0.or();
      Token token0 = xPathLexer0.dots();
      assertEquals(13, token0.getTokenType());
      assertEquals("w", token0.getTokenText());
      
      xPathLexer0.and();
      Token token1 = xPathLexer0.notEquals();
      String string0 = token1.toString();
      assertEquals("[ (22) (-0)", string0);
      
      xPathLexer0.and();
      Token token2 = xPathLexer0.nextToken();
      assertEquals(15, token2.getTokenType());
      assertEquals("p", token2.getTokenText());
      
      Token token3 = xPathLexer0.plus();
      assertEquals("~", token3.getTokenText());
      assertEquals(5, token3.getTokenType());
      
      xPathLexer0.setXPath("w-0p~4\"`p|ZUKvucy-");
      xPathLexer0.nextToken();
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('1');
      Token token4 = xPathLexer0.nextToken();
      assertEquals("w-0p~4\"`p|ZUKvucy-", token4.getTokenText());
  }
}
