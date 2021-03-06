/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:23:13 GMT 2018
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifier();
      xPathLexer0.star();
      char char0 = '-';
      Token token0 = xPathLexer0.colon();
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
  //Test case number: 1
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      xPathLexer0.nextToken();
      Token token1 = xPathLexer0.minus();
      assertEquals(6, token1.getTokenType());
      
      xPathLexer0.or();
      Token token2 = xPathLexer0.notEquals();
      assertEquals(22, token2.getTokenType());
      
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      
      Token token4 = xPathLexer0.dots();
      assertEquals(13, token4.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.isIdentifierChar('\'');
      xPathLexer0.consume();
      xPathLexer0.setXPath("b`B");
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      assertEquals("b", token5.getTokenText());
      
      xPathLexer0.setXPath("@`\"B)YJ)&P]");
      Token token6 = xPathLexer0.rightParen();
      xPathLexer0.rightParen();
      xPathLexer0.setPreviousToken(token6);
      assertEquals(2, token6.getTokenType());
      assertEquals("@", token6.getTokenText());
      
      Token token7 = xPathLexer0.at();
      xPathLexer0.setPreviousToken(token7);
      assertEquals("\"", token7.getTokenText());
      assertEquals(16, token7.getTokenType());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.minus();
      xPathLexer0.minus();
      xPathLexer0.notEquals();
      xPathLexer0.plus();
      xPathLexer0.operatorName();
      xPathLexer0.comma();
      xPathLexer0.slashes();
      xPathLexer0.operatorName();
      xPathLexer0.not();
      xPathLexer0.notEquals();
      xPathLexer0.equals();
      xPathLexer0.dots();
      xPathLexer0.and();
      xPathLexer0.colon();
      xPathLexer0.minus();
      xPathLexer0.consume();
      // Undeclared exception!
      try { 
        xPathLexer0.setXPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.werken.saxpath.XPathLexer", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("rpC0M]^IqV;");
      Token token0 = xPathLexer0.rightParen();
      assertEquals(2, token0.getTokenType());
      assertEquals("r", token0.getTokenText());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertEquals("pC0M", token1.getTokenText());
      assertNotNull(token1);
      
      Token token2 = xPathLexer0.pipe();
      assertEquals(17, token2.getTokenType());
      assertEquals("]", token2.getTokenText());
      
      Token token3 = xPathLexer0.identifier();
      assertEquals(15, token3.getTokenType());
      
      Token token4 = xPathLexer0.plus();
      assertEquals("^", token4.getTokenText());
      
      Token token5 = xPathLexer0.notEquals();
      assertEquals("Iq", token5.getTokenText());
      assertEquals(22, token5.getTokenType());
      
      Token token6 = xPathLexer0.minus();
      assertEquals(6, token6.getTokenType());
      assertEquals("V", token6.getTokenText());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('>');
      assertFalse(boolean0);
      
      xPathLexer0.currentPosition();
      xPathLexer0.operatorName();
      Token token7 = xPathLexer0.plus();
      assertEquals(5, token7.getTokenType());
      
      Token token8 = xPathLexer0.number();
      assertEquals(30, token8.getTokenType());
      assertEquals("", token8.getTokenText());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.operatorName();
      xPathLexer0.and();
      xPathLexer0.consume();
      xPathLexer0.at();
      xPathLexer0.dollar();
      xPathLexer0.pipe();
      xPathLexer0.identifier();
      xPathLexer0.whitespace();
      xPathLexer0.plus();
      xPathLexer0.relationalOperator();
      xPathLexer0.minus();
      xPathLexer0.pipe();
      xPathLexer0.rightParen();
      xPathLexer0.consume((-449));
      xPathLexer0.colon();
      // Undeclared exception!
      try { 
        xPathLexer0.whitespace();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.doubleColon();
      assertEquals(19, token0.getTokenType());
      
      Token token1 = xPathLexer0.notEquals();
      assertEquals(22, token1.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.pipe();
      char char0 = xPathLexer0.LA(2423);
      assertEquals('\uFFFF', char0);
      
      xPathLexer0.getXPath();
      Token token2 = xPathLexer0.pipe();
      assertEquals(17, token2.getTokenType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.not();
      xPathLexer0.notEquals();
      xPathLexer0.doubleColon();
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      
      xPathLexer0.pipe();
      xPathLexer0.star();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      Token token2 = xPathLexer0.doubleColon();
      assertEquals(19, token2.getTokenType());
      
      Token token3 = xPathLexer0.pipe();
      assertEquals(17, token3.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.div();
      Token token4 = xPathLexer0.notEquals();
      assertEquals(22, token4.getTokenType());
      
      xPathLexer0.dots();
      xPathLexer0.relationalOperator();
      xPathLexer0.or();
      Token token5 = xPathLexer0.slashes();
      assertEquals(11, token5.getTokenType());
      
      Token token6 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token6);
      
      xPathLexer0.dots();
      Token token7 = xPathLexer0.nextToken();
      assertEquals((-1), token7.getTokenType());
      
      Token token8 = xPathLexer0.identifier();
      assertEquals(15, token8.getTokenType());
      
      xPathLexer0.dots();
      xPathLexer0.literal();
      Token token9 = xPathLexer0.star();
      assertEquals(20, token9.getTokenType());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.leftBracket();
      xPathLexer0.number();
      xPathLexer0.literal();
      xPathLexer0.and();
      xPathLexer0.dollar();
      xPathLexer0.star();
      xPathLexer0.minus();
      xPathLexer0.div();
      xPathLexer0.leftParen();
      xPathLexer0.dollar();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.relationalOperator();
      xPathLexer0.minus();
      Token token0 = xPathLexer0.dots();
      assertEquals(13, token0.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token1 = xPathLexer0.rightBracket();
      assertEquals(4, token1.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.minus();
      xPathLexer0.getPreviousToken();
      xPathLexer0.identifier();
      xPathLexer0.at();
      xPathLexer0.minus();
      xPathLexer0.at();
      xPathLexer0.not();
      xPathLexer0.colon();
      xPathLexer0.pipe();
      Token token2 = xPathLexer0.identifier();
      assertEquals(15, token2.getTokenType());
      
      Token token3 = xPathLexer0.pipe();
      assertEquals(17, token3.getTokenType());
      
      xPathLexer0.minus();
      Token token4 = xPathLexer0.notEquals();
      assertEquals(22, token4.getTokenType());
      
      Token token5 = xPathLexer0.not();
      assertEquals(23, token5.getTokenType());
      
      Token token6 = xPathLexer0.at();
      assertEquals(16, token6.getTokenType());
      
      Token token7 = xPathLexer0.minus();
      assertEquals(6, token7.getTokenType());
      
      Token token8 = xPathLexer0.rightParen();
      assertEquals(2, token8.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierChar('');
      assertTrue(boolean0);
      
      xPathLexer0.and();
      xPathLexer0.getXPath();
      Token token9 = xPathLexer0.colon();
      assertEquals(18, token9.getTokenType());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.173554429075132
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("f,nl=");
      xPathLexer0.and();
      xPathLexer0.consume();
      Token token0 = xPathLexer0.colon();
      assertEquals(",", token0.getTokenText());
      
      xPathLexer0.and();
      Token token1 = xPathLexer0.literal();
      assertNull(token1);
      
      Token token2 = xPathLexer0.whitespace();
      assertEquals((-2), token2.getTokenType());
      
      Token token3 = xPathLexer0.doubleColon();
      assertEquals(19, token3.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token4 = xPathLexer0.not();
      assertEquals(23, token4.getTokenType());
      
      xPathLexer0.consume();
      Token token5 = xPathLexer0.equals();
      assertEquals(21, token5.getTokenType());
      
      xPathLexer0.star();
      Token token6 = xPathLexer0.at();
      assertEquals(16, token6.getTokenType());
      
      Token token7 = xPathLexer0.identifier();
      assertEquals(15, token7.getTokenType());
      
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      Token token9 = xPathLexer0.nextToken();
      assertEquals((-1), token9.getTokenType());
      
      Token token10 = xPathLexer0.plus();
      assertEquals(5, token10.getTokenType());
      
      Token token11 = xPathLexer0.colon();
      assertEquals(18, token11.getTokenType());
      
      Token token12 = xPathLexer0.leftParen();
      assertEquals(1, token12.getTokenType());
      
      Token token13 = xPathLexer0.minus();
      assertEquals(6, token13.getTokenType());
      
      Token token14 = xPathLexer0.leftBracket();
      assertEquals(3, token14.getTokenType());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.193995709732798
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("qbT 5lhysI#Ij");
      xPathLexer0.mod();
      Token token0 = xPathLexer0.leftParen();
      assertEquals("q", token0.getTokenText());
      
      Token token1 = xPathLexer0.whitespace();
      assertEquals("", token1.getTokenText());
      assertEquals((-2), token1.getTokenType());
      
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
      
      xPathLexer0.at();
      Token token3 = xPathLexer0.at();
      assertEquals(16, token3.getTokenType());
      
      xPathLexer0.colon();
      xPathLexer0.leftParen();
      xPathLexer0.consume();
      Token token4 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token4);
      assertEquals(15, token4.getTokenType());
      
      xPathLexer0.nextToken();
      boolean boolean0 = xPathLexer0.isIdentifierChar('`');
      assertFalse(boolean0);
      
      xPathLexer0.plus();
      xPathLexer0.consume();
      xPathLexer0.dots();
      Token token5 = xPathLexer0.colon();
      assertEquals(18, token5.getTokenType());
      
      Token token6 = xPathLexer0.rightParen();
      assertEquals(2, token6.getTokenType());
      
      xPathLexer0.consume();
      Token token7 = xPathLexer0.dollar();
      assertEquals(26, token7.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.mod();
      xPathLexer0.getPreviousToken();
      Token token8 = xPathLexer0.getPreviousToken();
      assertEquals((-1), token8.getTokenType());
      
      Token token9 = xPathLexer0.plus();
      assertEquals(5, token9.getTokenType());
      
      xPathLexer0.hasMoreChars();
      xPathLexer0.and();
      xPathLexer0.setXPath("S(c/$Pj*LL");
      Token token10 = xPathLexer0.dots();
      assertEquals("S", token10.getTokenText());
      assertEquals(13, token10.getTokenType());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.28340490721124
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("AUBWW");
      Token token0 = xPathLexer0.comma();
      assertEquals("A", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      assertEquals("U", token1.getTokenText());
      
      xPathLexer0.notEquals();
      Token token2 = xPathLexer0.at();
      assertEquals("W", token2.getTokenText());
      
      xPathLexer0.number();
      Token token3 = xPathLexer0.rightBracket();
      assertEquals(4, token3.getTokenType());
      
      xPathLexer0.consume();
      Token token4 = xPathLexer0.slashes();
      assertEquals(11, token4.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token6 = xPathLexer0.leftBracket();
      assertEquals(3, token6.getTokenType());
      
      xPathLexer0.setXPath("AUBWW");
      xPathLexer0.isIdentifierStartChar('1');
      Token token7 = xPathLexer0.doubleColon();
      assertEquals("AU", token7.getTokenText());
      assertEquals(19, token7.getTokenType());
      
      Token token8 = xPathLexer0.notEquals();
      assertEquals(22, token8.getTokenType());
      assertEquals("BW", token8.getTokenText());
      
      Token token9 = xPathLexer0.number();
      assertEquals("", token9.getTokenText());
      assertEquals(30, token9.getTokenType());
      
      Token token10 = xPathLexer0.nextToken();
      assertEquals("W", token10.getTokenText());
      assertEquals(15, token10.getTokenType());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.0447063524141176
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftBracket();
      assertEquals("c", token0.getTokenText());
      assertEquals(3, token0.getTokenType());
      
      Token token1 = xPathLexer0.identifier();
      assertEquals("om.werken.saxpath.XPathLexer", token1.getTokenText());
      
      xPathLexer0.leftParen();
      Token token2 = xPathLexer0.slashes();
      assertEquals(11, token2.getTokenType());
      
      xPathLexer0.consume();
      Token token3 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token3);
      
      Token token4 = xPathLexer0.literal();
      assertNull(token4);
      
      xPathLexer0.whitespace();
      Token token5 = xPathLexer0.minus();
      assertEquals(6, token5.getTokenType());
      
      xPathLexer0.dots();
      xPathLexer0.dots();
      Token token6 = xPathLexer0.dots();
      assertEquals(13, token6.getTokenType());
      
      xPathLexer0.at();
      Token token7 = xPathLexer0.leftParen();
      assertEquals(1, token7.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token8 = xPathLexer0.whitespace();
      assertEquals((-2), token8.getTokenType());
      assertEquals("", token8.getTokenText());
      
      Token token9 = xPathLexer0.star();
      assertEquals(20, token9.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      xPathLexer0.relationalOperator();
      xPathLexer0.and();
      Token token10 = xPathLexer0.identifier();
      assertEquals(15, token10.getTokenType());
      
      Token token11 = xPathLexer0.at();
      assertEquals(16, token11.getTokenType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3443463749152045
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.colon();
      xPathLexer0.rightBracket();
      xPathLexer0.identifierOrOperatorName();
      Token token0 = xPathLexer0.identifier();
      assertEquals(15, token0.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.at();
      xPathLexer0.equals();
      Token token1 = xPathLexer0.dots();
      assertEquals(13, token1.getTokenType());
      
      xPathLexer0.setXPath("h|NAoHXVK{%A");
      xPathLexer0.operatorName();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals("h", token2.getTokenText());
      
      Token token3 = xPathLexer0.literal();
      assertNull(token3);
      
      xPathLexer0.rightBracket();
      Token token4 = xPathLexer0.doubleColon();
      assertEquals(19, token4.getTokenType());
      
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      
      xPathLexer0.endPosition();
      Token token6 = xPathLexer0.plus();
      assertEquals(5, token6.getTokenType());
      
      xPathLexer0.equals();
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('D');
      xPathLexer0.rightParen();
      xPathLexer0.operatorName();
      xPathLexer0.isIdentifierStartChar('O');
      xPathLexer0.equals();
      xPathLexer0.consume(12);
      xPathLexer0.not();
      xPathLexer0.getXPath();
      Token token8 = xPathLexer0.equals();
      assertEquals(21, token8.getTokenType());
      
      Token token9 = xPathLexer0.rightBracket();
      assertEquals(4, token9.getTokenType());
      
      xPathLexer0.nextToken();
      Token token10 = xPathLexer0.identifierOrOperatorName();
      assertNull(token10);
      
      xPathLexer0.endPosition();
      Token token11 = xPathLexer0.not();
      assertEquals(23, token11.getTokenType());
      
      Token token12 = xPathLexer0.dollar();
      assertEquals(26, token12.getTokenType());
      
      Token token13 = xPathLexer0.getPreviousToken();
      assertEquals((-1), token13.getTokenType());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.148793194469537
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("AUBWW");
      Token token0 = xPathLexer0.comma();
      assertEquals("A", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      assertEquals("U", token1.getTokenText());
      
      Token token2 = xPathLexer0.notEquals();
      assertEquals("BW", token2.getTokenText());
      assertEquals(22, token2.getTokenType());
      
      Token token3 = xPathLexer0.at();
      assertEquals("W", token3.getTokenText());
      
      Token token4 = xPathLexer0.number();
      assertEquals(30, token4.getTokenType());
      
      Token token5 = xPathLexer0.rightBracket();
      assertEquals(4, token5.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.and();
      Token token6 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token6.getTokenType());
      
      Token token7 = xPathLexer0.at();
      assertEquals(16, token7.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token8 = xPathLexer0.leftBracket();
      assertEquals(3, token8.getTokenType());
      
      xPathLexer0.setXPath("AUBWW");
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('1');
      assertFalse(boolean0);
      
      Token token9 = xPathLexer0.doubleColon();
      assertEquals(19, token9.getTokenType());
      assertEquals("AU", token9.getTokenText());
      
      Token token10 = xPathLexer0.dots();
      assertEquals(13, token10.getTokenType());
      assertEquals("B", token10.getTokenText());
      
      Token token11 = xPathLexer0.literal();
      assertNotNull(token11);
      assertEquals("", token11.getTokenText());
      assertEquals(27, token11.getTokenType());
      
      Token token12 = xPathLexer0.star();
      assertEquals(20, token12.getTokenType());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5310251704359263
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      Token token1 = xPathLexer0.identifier();
      assertEquals(15, token1.getTokenType());
      
      Token token2 = xPathLexer0.not();
      assertEquals(23, token2.getTokenType());
      
      Token token3 = xPathLexer0.minus();
      assertEquals(6, token3.getTokenType());
      
      xPathLexer0.setXPath("ee Zc?RE");
      Token token4 = xPathLexer0.dots();
      assertEquals("e", token4.getTokenText());
      assertEquals(13, token4.getTokenType());
      
      Token token5 = xPathLexer0.leftParen();
      assertEquals(1, token5.getTokenType());
      assertEquals("e", token5.getTokenText());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('4');
      assertFalse(boolean0);
      
      Token token6 = xPathLexer0.comma();
      assertEquals(" ", token6.getTokenText());
      assertEquals(32, token6.getTokenType());
      
      Token token7 = xPathLexer0.dollar();
      assertEquals(26, token7.getTokenType());
      assertEquals("Z", token7.getTokenText());
      
      xPathLexer0.hasMoreChars();
      xPathLexer0.relationalOperator();
      Token token8 = xPathLexer0.leftBracket();
      assertEquals("c", token8.getTokenText());
      assertEquals(3, token8.getTokenType());
      
      xPathLexer0.setXPath("ee Zc?RE");
      Token token9 = xPathLexer0.at();
      assertEquals("e", token9.getTokenText());
      assertEquals(16, token9.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('C');
      Token token10 = xPathLexer0.doubleColon();
      assertEquals(19, token10.getTokenType());
      assertEquals("e ", token10.getTokenText());
      
      Token token11 = xPathLexer0.notEquals();
      assertEquals("Zc", token11.getTokenText());
      assertEquals(22, token11.getTokenType());
      
      Token token12 = xPathLexer0.number();
      assertEquals(30, token12.getTokenType());
      assertEquals("", token12.getTokenText());
      
      Token token13 = xPathLexer0.nextToken();
      assertEquals("?RE", token13.getTokenText());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.6859453246697877
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.or();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      assertEquals("o", token1.getTokenText());
      
      Token token2 = xPathLexer0.slashes();
      assertEquals(11, token2.getTokenType());
      assertEquals("m", token2.getTokenText());
      
      xPathLexer0.mod();
      Token token3 = xPathLexer0.notEquals();
      assertEquals(22, token3.getTokenType());
      assertEquals(".w", token3.getTokenText());
      
      Token token4 = xPathLexer0.rightBracket();
      assertEquals("e", token4.getTokenText());
      
      Token token5 = xPathLexer0.plus();
      assertEquals("r", token5.getTokenText());
      assertEquals(5, token5.getTokenType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9674490254448049
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      xPathLexer0.number();
      xPathLexer0.colon();
      xPathLexer0.equals();
      xPathLexer0.colon();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.nextToken();
      xPathLexer0.isIdentifierChar('7');
      xPathLexer0.plus();
      xPathLexer0.consume();
      xPathLexer0.dots();
      xPathLexer0.colon();
      xPathLexer0.rightParen();
      xPathLexer0.consume();
      xPathLexer0.dollar();
      XPathLexer xPathLexer1 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      xPathLexer1.mod();
      xPathLexer1.mod();
      xPathLexer0.getPreviousToken();
      xPathLexer1.getPreviousToken();
      xPathLexer0.plus();
      xPathLexer1.hasMoreChars();
      xPathLexer0.and();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      assertNotSame(xPathLexer0, xPathLexer1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7911882554945273
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("as");
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      assertEquals("a", token0.getTokenText());
      
      xPathLexer0.or();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      assertEquals("s", token1.getTokenText());
      
      Token token2 = xPathLexer0.slashes();
      assertEquals(11, token2.getTokenType());
      
      XPathLexer xPathLexer1 = new XPathLexer("\"xq.ir~j;$S?lr$TV}o");
      Token token3 = xPathLexer1.doubleColon();
      assertEquals("\"x", token3.getTokenText());
      assertEquals(19, token3.getTokenType());
      
      Token token4 = xPathLexer1.notEquals();
      assertEquals("q.", token4.getTokenText());
      assertEquals(22, token4.getTokenType());
      
      xPathLexer1.setXPath("\"xq.ir~j;$S?lr$TV}o");
      Token token5 = xPathLexer0.number();
      assertEquals(30, token5.getTokenType());
      
      Token token6 = xPathLexer1.nextToken();
      assertEquals("", token6.getTokenText());
      assertEquals((-1), token6.getTokenType());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0913457064077101
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      xPathLexer0.number();
      xPathLexer0.colon();
      Token token0 = xPathLexer0.equals();
      assertEquals(21, token0.getTokenType());
      assertEquals("5", token0.getTokenText());
      
      xPathLexer0.colon();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.nextToken();
      boolean boolean0 = xPathLexer0.hasMoreChars();
      Token token1 = xPathLexer0.plus();
      assertEquals("]", token1.getTokenText());
      
      xPathLexer0.consume();
      Token token2 = xPathLexer0.dots();
      assertEquals(13, token2.getTokenType());
      assertEquals("Z", token2.getTokenText());
      
      Token token3 = xPathLexer0.colon();
      assertEquals(18, token3.getTokenType());
      assertEquals("6", token3.getTokenText());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      xPathLexer0.consume();
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      assertEquals("Z", token5.getTokenText());
      
      XPathLexer xPathLexer1 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      xPathLexer1.mod();
      xPathLexer0.mod();
      xPathLexer0.setXPath("pSa!z`[-lvLbLyE)");
      Token token6 = xPathLexer0.getPreviousToken();
      assertEquals(17, token6.getTokenType());
      assertEquals("|", token6.getTokenText());
      
      xPathLexer1.getPreviousToken();
      Token token7 = xPathLexer0.plus();
      assertEquals(5, token7.getTokenType());
      
      xPathLexer0.consume(96);
      xPathLexer1.hasMoreChars();
      xPathLexer0.and();
      Token token8 = xPathLexer0.number();
      assertEquals(30, token8.getTokenType());
      
      XPathLexer xPathLexer2 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      Token token9 = xPathLexer1.not();
      assertEquals(23, token9.getTokenType());
      assertEquals("y", token9.getTokenText());
      
      Token token10 = xPathLexer2.nextToken();
      assertEquals("y5", token10.getTokenText());
      assertEquals(15, token10.getTokenType());
      
      boolean boolean1 = xPathLexer1.isIdentifierChar('7');
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0133778529714024
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("y5@znw|]\"Z6,:Zu");
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      
      Token token1 = xPathLexer0.colon();
      assertEquals("y", token1.getTokenText());
      
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      assertEquals("5", token2.getTokenText());
      
      xPathLexer0.colon();
      Token token3 = xPathLexer0.colon();
      assertEquals(18, token3.getTokenType());
      
      Token token4 = xPathLexer0.comma();
      assertEquals("n", token4.getTokenText());
      
      Token token5 = xPathLexer0.doubleColon();
      assertEquals("w|", token5.getTokenText());
      
      XPathLexer xPathLexer1 = new XPathLexer();
      Token token6 = xPathLexer0.nextToken();
      assertEquals(4, token6.getTokenType());
      assertEquals("]", token6.getTokenText());
      
      boolean boolean0 = xPathLexer1.hasMoreChars();
      assertFalse(boolean0);
      
      Token token7 = xPathLexer1.at();
      assertEquals(16, token7.getTokenType());
      
      XPathLexer xPathLexer2 = new XPathLexer();
      Token token8 = xPathLexer2.notEquals();
      assertEquals(22, token8.getTokenType());
      
      xPathLexer0.div();
      Token token9 = xPathLexer1.comma();
      assertEquals(32, token9.getTokenType());
      
      XPathLexer xPathLexer3 = new XPathLexer();
      Token token10 = xPathLexer3.doubleColon();
      assertEquals(19, token10.getTokenType());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9189870431699818
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("AUBWW");
      Token token0 = xPathLexer0.comma();
      assertEquals("A", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.number();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals(4, token2.getTokenType());
      assertEquals("W", token2.getTokenText());
      
      Token token3 = xPathLexer0.number();
      assertEquals("", token3.getTokenText());
      
      xPathLexer0.consume();
      XPathLexer xPathLexer1 = new XPathLexer("\"xq.ir~j;$S?lr$TV}o");
      Token token4 = xPathLexer0.doubleColon();
      assertEquals(19, token4.getTokenType());
      
      Token token5 = xPathLexer1.notEquals();
      assertEquals(22, token5.getTokenType());
      assertEquals("\"x", token5.getTokenText());
      
      xPathLexer0.setXPath("AUBWW");
      Token token6 = xPathLexer0.number();
      assertEquals(30, token6.getTokenType());
      
      Token token7 = xPathLexer1.nextToken();
      assertEquals(15, token7.getTokenType());
      assertEquals("q.ir", token7.getTokenText());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.8661567655877596
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.relationalOperator();
      xPathLexer0.minus();
      xPathLexer0.dots();
      xPathLexer0.relationalOperator();
      xPathLexer0.rightBracket();
      xPathLexer0.operatorName();
      xPathLexer0.minus();
      xPathLexer0.getPreviousToken();
      xPathLexer0.colon();
      xPathLexer0.at();
      xPathLexer0.and();
      xPathLexer0.minus();
      XPathLexer xPathLexer1 = new XPathLexer("[ (");
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.dollar();
      xPathLexer0.hasMoreChars();
      xPathLexer0.isIdentifierStartChar('D');
      XPathLexer xPathLexer3 = new XPathLexer("5B3*vL9b[$'o[");
      xPathLexer3.number();
      xPathLexer1.at();
      xPathLexer2.relationalOperator();
      xPathLexer1.whitespace();
      xPathLexer0.notEquals();
      Token token0 = xPathLexer2.div();
      assertNull(token0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.2368398556052038
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      xPathLexer0.not();
      xPathLexer0.minus();
      xPathLexer0.setXPath("ee Zc?RE");
      xPathLexer0.dots();
      xPathLexer0.leftParen();
      xPathLexer0.isIdentifierStartChar('4');
      xPathLexer0.comma();
      xPathLexer0.dollar();
      xPathLexer0.hasMoreChars();
      xPathLexer0.relationalOperator();
      xPathLexer0.leftBracket();
      xPathLexer0.setXPath("ee Zc?RE");
      XPathLexer xPathLexer1 = new XPathLexer("");
      xPathLexer1.rightBracket();
      xPathLexer0.nextToken();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer1.endPosition();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.at();
      xPathLexer2.not();
      xPathLexer2.dollar();
      xPathLexer0.getPreviousToken();
      xPathLexer1.dots();
      Token token0 = xPathLexer2.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5835712713606533
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertNull(token1);
      
      xPathLexer0.and();
      xPathLexer0.setXPath("ee Zc?RE");
      Token token2 = xPathLexer0.dots();
      assertEquals("e", token2.getTokenText());
      assertEquals(13, token2.getTokenType());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals("e", token3.getTokenText());
      
      xPathLexer0.isIdentifierStartChar('E');
      Token token4 = xPathLexer0.comma();
      assertEquals(32, token4.getTokenType());
      assertEquals(" ", token4.getTokenText());
      
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      assertEquals("Z", token5.getTokenText());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      xPathLexer0.and();
      XPathLexer xPathLexer1 = new XPathLexer("ee Zc?RE");
      xPathLexer1.operatorName();
      xPathLexer0.isIdentifierStartChar('O');
      xPathLexer1.consume('E');
      Token token6 = xPathLexer0.not();
      assertEquals(23, token6.getTokenType());
      assertEquals("c", token6.getTokenText());
      
      xPathLexer1.leftParen();
      xPathLexer1.getXPath();
      Token token7 = xPathLexer1.rightBracket();
      assertEquals(4, token7.getTokenType());
      
      Token token8 = xPathLexer1.equals();
      assertEquals(21, token8.getTokenType());
      
      Token token9 = xPathLexer1.at();
      assertEquals(16, token9.getTokenType());
      
      boolean boolean1 = xPathLexer1.isIdentifierStartChar('E');
      assertTrue(boolean1 == boolean0);
      
      Token token10 = xPathLexer0.doubleColon();
      assertEquals(19, token10.getTokenType());
      assertEquals("?R", token10.getTokenText());
      
      Token token11 = xPathLexer1.notEquals();
      assertEquals(22, token11.getTokenType());
      
      Token token12 = xPathLexer0.number();
      assertEquals(30, token12.getTokenType());
      
      Token token13 = xPathLexer0.nextToken();
      assertNotSame(token13, token0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.6701198898068177
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.or();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals("o", token1.getTokenText());
      assertEquals(3, token1.getTokenType());
      
      xPathLexer0.mod();
      Token token2 = xPathLexer0.notEquals();
      assertEquals(22, token2.getTokenType());
      assertEquals("m.", token2.getTokenText());
      
      Token token3 = xPathLexer0.rightBracket();
      assertEquals("w", token3.getTokenText());
      assertEquals(4, token3.getTokenType());
      
      Token token4 = xPathLexer0.plus();
      assertEquals("e", token4.getTokenText());
      assertEquals(5, token4.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('S');
      assertTrue(boolean0);
  }
}
