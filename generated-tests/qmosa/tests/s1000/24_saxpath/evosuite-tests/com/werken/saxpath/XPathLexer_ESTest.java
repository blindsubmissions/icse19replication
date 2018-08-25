/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:45:41 GMT 2018
 */

package com.werken.saxpath;

import org.junit.Test;
import static org.junit.Assert.*;
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
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.leftParen();
      assertEquals(1, token0.getTokenType());
      
      Token token1 = xPathLexer0.plus();
      assertEquals(5, token1.getTokenType());
      
      xPathLexer0.colon();
      xPathLexer0.mod();
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      
      Token token3 = xPathLexer0.dots();
      assertEquals(13, token3.getTokenType());
      
      char char0 = xPathLexer0.LA(0);
      assertEquals('\uFFFF', char0);
      
      Token token4 = xPathLexer0.rightParen();
      assertEquals(2, token4.getTokenType());
      
      Token token5 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token5);
      
      xPathLexer0.colon();
      xPathLexer0.consume(0);
      Token token6 = xPathLexer0.notEquals();
      assertEquals(22, token6.getTokenType());
      
      Token token7 = xPathLexer0.identifier();
      assertEquals(15, token7.getTokenType());
      
      xPathLexer0.setXPath("");
      Token token8 = xPathLexer0.colon();
      assertEquals(18, token8.getTokenType());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("L(T$XAEdF_I'");
      xPathLexer0.minus();
      xPathLexer0.and();
      xPathLexer0.comma();
      xPathLexer0.not();
      xPathLexer0.setPreviousToken((Token) null);
      xPathLexer0.number();
      Token token0 = xPathLexer0.not();
      token0.toString();
      xPathLexer0.dollar();
      xPathLexer0.plus();
      xPathLexer0.dots();
      xPathLexer0.literal();
      xPathLexer0.plus();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.setXPath("L(T$XAEdF_I'");
      assertEquals("L(T$XAEdF_I'", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.and();
      xPathLexer0.relationalOperator();
      xPathLexer0.mod();
      Token token0 = xPathLexer0.rightBracket();
      Token token1 = xPathLexer0.equals();
      assertEquals(21, token1.getTokenType());
      
      xPathLexer0.identifier();
      xPathLexer0.leftParen();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(3, int0);
      
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      Token token3 = xPathLexer0.notEquals();
      assertEquals(22, token3.getTokenType());
      
      Token token4 = xPathLexer0.leftParen();
      assertEquals(1, token4.getTokenType());
      
      xPathLexer0.star();
      xPathLexer0.plus();
      xPathLexer0.and();
      xPathLexer0.relationalOperator();
      xPathLexer0.star();
      Token token5 = xPathLexer0.colon();
      assertEquals(18, token5.getTokenType());
      
      Token token6 = xPathLexer0.dollar();
      assertEquals(26, token6.getTokenType());
      
      Token token7 = xPathLexer0.star();
      assertEquals(20, token7.getTokenType());
      
      Token token8 = xPathLexer0.identifier();
      assertEquals(15, token8.getTokenType());
      
      xPathLexer0.getXPath();
      Token token9 = xPathLexer0.plus();
      assertEquals(5, token9.getTokenType());
      
      xPathLexer0.getXPath();
      Token token10 = xPathLexer0.literal();
      assertNull(token10);
      
      xPathLexer0.setPreviousToken(token0);
      assertEquals(4, token0.getTokenType());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.rightParen();
      xPathLexer0.leftBracket();
      xPathLexer0.equals();
      xPathLexer0.doubleColon();
      xPathLexer0.equals();
      xPathLexer0.pipe();
      xPathLexer0.dots();
      Token token0 = xPathLexer0.slashes();
      xPathLexer0.div();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      xPathLexer0.dots();
      xPathLexer0.not();
      xPathLexer0.mod();
      xPathLexer0.leftParen();
      xPathLexer0.mod();
      xPathLexer0.operatorName();
      xPathLexer0.whitespace();
      xPathLexer0.dollar();
      xPathLexer0.colon();
      xPathLexer0.number();
      xPathLexer0.at();
      xPathLexer0.consume();
      assertEquals("", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.and();
      xPathLexer0.and();
      Token token0 = xPathLexer0.at();
      assertEquals(16, token0.getTokenType());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      xPathLexer0.isIdentifierChar('#');
      Token token2 = xPathLexer0.dots();
      assertEquals(13, token2.getTokenType());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.2582310409232749
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.colon();
      Token token0 = xPathLexer0.notEquals();
      assertEquals(22, token0.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.setXPath("");
      xPathLexer0.slashes();
      Token token1 = xPathLexer0.equals();
      assertEquals(21, token1.getTokenType());
      
      Token token2 = xPathLexer0.plus();
      assertEquals(5, token2.getTokenType());
      
      xPathLexer0.literal();
      xPathLexer0.and();
      xPathLexer0.div();
      Token token3 = xPathLexer0.at();
      assertEquals(16, token3.getTokenType());
      
      xPathLexer0.or();
      xPathLexer0.pipe();
      xPathLexer0.and();
      xPathLexer0.operatorName();
      Token token4 = xPathLexer0.pipe();
      assertEquals(17, token4.getTokenType());
      
      Token token5 = xPathLexer0.slashes();
      assertEquals(11, token5.getTokenType());
      
      Token token6 = xPathLexer0.not();
      assertEquals(23, token6.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.and();
      xPathLexer0.endPosition();
      xPathLexer0.leftParen();
      xPathLexer0.isIdentifierChar('*');
      int int0 = xPathLexer0.endPosition();
      assertEquals(0, int0);
      
      xPathLexer0.isIdentifierStartChar('*');
      xPathLexer0.leftParen();
      xPathLexer0.consume();
      Token token7 = xPathLexer0.comma();
      assertEquals(32, token7.getTokenType());
      
      xPathLexer0.setXPath("");
      Token token8 = xPathLexer0.colon();
      assertEquals(18, token8.getTokenType());
      
      int int1 = xPathLexer0.currentPosition();
      assertEquals(1, int1);
      
      xPathLexer0.leftParen();
      xPathLexer0.whitespace();
      xPathLexer0.consume(0);
      Token token9 = xPathLexer0.nextToken();
      assertEquals((-1), token9.getTokenType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0977473548307513
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("QoY?~^$ox)wuMNk%");
      Token token0 = xPathLexer0.dollar();
      assertEquals("Q", token0.getTokenText());
      
      Token token1 = xPathLexer0.literal();
      assertEquals(27, token1.getTokenType());
      assertEquals("Y?~^$", token1.getTokenText());
      
      xPathLexer0.mod();
      Token token2 = xPathLexer0.nextToken();
      assertEquals("x", token2.getTokenText());
      
      xPathLexer0.dollar();
      Token token3 = xPathLexer0.slashes();
      assertEquals("w", token3.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token4 = xPathLexer0.identifier();
      xPathLexer0.leftBracket();
      token4.toString();
      token4.toString();
      token4.toString();
      char char0 = xPathLexer0.LA(1046);
      assertEquals('\uFFFF', char0);
      
      String string0 = token4.toString();
      assertEquals("[ (15) (uMNk)", string0);
      
      xPathLexer0.leftParen();
      xPathLexer0.currentPosition();
      xPathLexer0.setPreviousToken(token4);
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      
      xPathLexer0.endPosition();
      xPathLexer0.or();
      xPathLexer0.consume(0);
      Token token6 = xPathLexer0.leftBracket();
      assertEquals(3, token6.getTokenType());
      
      xPathLexer0.and();
      Token token7 = xPathLexer0.slashes();
      assertEquals(11, token7.getTokenType());
      
      Token token8 = xPathLexer0.not();
      assertEquals(23, token8.getTokenType());
      
      xPathLexer0.div();
      int int0 = xPathLexer0.endPosition();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5013526063417646
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.literal();
      Token token0 = xPathLexer0.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.consume();
      xPathLexer0.whitespace();
      Token token1 = xPathLexer0.literal();
      assertNull(token1);
      
      Token token2 = xPathLexer0.star();
      assertEquals(20, token2.getTokenType());
      
      xPathLexer0.whitespace();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar(']');
      assertFalse(boolean0);
      
      Token token3 = xPathLexer0.identifierOrOperatorName();
      assertNull(token3);
      
      xPathLexer0.setXPath("`Ve3LA\"ivxfqxh|?^)");
      xPathLexer0.isIdentifierChar(']');
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      Token token5 = xPathLexer0.rightBracket();
      assertEquals("V", token5.getTokenText());
      assertEquals(4, token5.getTokenType());
      
      Token token6 = xPathLexer0.at();
      assertEquals("e", token6.getTokenText());
      assertEquals(16, token6.getTokenType());
      
      Token token7 = xPathLexer0.notEquals();
      assertEquals("3L", token7.getTokenText());
      
      Token token8 = xPathLexer0.number();
      assertEquals("", token8.getTokenText());
      
      xPathLexer0.nextToken();
      xPathLexer0.literal();
      Token token9 = xPathLexer0.comma();
      assertEquals(32, token9.getTokenType());
      
      Token token10 = xPathLexer0.notEquals();
      assertEquals(22, token10.getTokenType());
      
      xPathLexer0.div();
      Token token11 = xPathLexer0.literal();
      assertNull(token11);
      
      xPathLexer0.setXPath("");
      Token token12 = xPathLexer0.number();
      assertEquals(30, token12.getTokenType());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9319232930107053
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.not();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.consume();
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertNull(token1);
      
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.doubleColon();
      assertEquals(19, token2.getTokenType());
      assertEquals(".w", token2.getTokenText());
      
      xPathLexer0.mod();
      Token token3 = xPathLexer0.rightParen();
      assertEquals("e", token3.getTokenText());
      assertEquals(2, token3.getTokenType());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      Token token4 = xPathLexer0.comma();
      assertEquals(32, token4.getTokenType());
      assertEquals("r", token4.getTokenText());
      
      boolean boolean1 = xPathLexer0.isIdentifierStartChar('&');
      assertFalse(boolean1 == boolean0);
      
      Token token5 = xPathLexer0.equals();
      assertEquals("k", token5.getTokenText());
      assertEquals(21, token5.getTokenType());
      
      xPathLexer0.not();
      Token token6 = xPathLexer0.getPreviousToken();
      assertEquals("c", token6.getTokenText());
      assertEquals(23, token6.getTokenType());
      
      Token token7 = xPathLexer0.number();
      assertEquals(30, token7.getTokenType());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.7521915465690427
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftParen();
      assertEquals(1, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      char char0 = xPathLexer0.LA(0);
      assertEquals('c', char0);
      
      Token token1 = xPathLexer0.dollar();
      assertEquals("o", token1.getTokenText());
      assertEquals(26, token1.getTokenType());
      
      Token token2 = xPathLexer0.doubleColon();
      Token token3 = xPathLexer0.colon();
      assertEquals("w", token3.getTokenText());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('^');
      assertFalse(boolean0);
      
      Token token4 = xPathLexer0.identifier();
      assertEquals("erken.saxpath.XPathLexer", token4.getTokenText());
      assertEquals(15, token4.getTokenType());
      
      Token token5 = xPathLexer0.colon();
      assertEquals(18, token5.getTokenType());
      
      xPathLexer0.setPreviousToken(token2);
      Token token6 = xPathLexer0.getPreviousToken();
      assertEquals(19, token6.getTokenType());
      assertEquals("m.", token6.getTokenText());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.050147243747477
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.comma();
      xPathLexer0.setXPath("com.werken.saxpath.Token");
      xPathLexer0.rightParen();
      xPathLexer0.operatorName();
      xPathLexer0.minus();
      xPathLexer0.and();
      xPathLexer0.identifier();
      xPathLexer0.star();
      xPathLexer0.consume(0);
      xPathLexer0.dots();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume(1);
      xPathLexer0.and();
      xPathLexer0.comma();
      xPathLexer0.getXPath();
      xPathLexer0.rightBracket();
      xPathLexer0.at();
      xPathLexer0.pipe();
      xPathLexer0.star();
      xPathLexer0.endPosition();
      xPathLexer0.isIdentifierStartChar('|');
      String string0 = xPathLexer0.getXPath();
      assertEquals("com.werken.saxpath.Token", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6956903753038388
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.dollar();
      xPathLexer0.notEquals();
      xPathLexer0.rightBracket();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.notEquals();
      assertEquals(22, token0.getTokenType());
      
      Token token1 = xPathLexer0.not();
      assertEquals(23, token1.getTokenType());
      
      Token token2 = xPathLexer0.nextToken();
      assertEquals((-1), token2.getTokenType());
      
      xPathLexer0.dollar();
      Token token3 = xPathLexer0.pipe();
      assertEquals(17, token3.getTokenType());
      
      xPathLexer0.and();
      Token token4 = xPathLexer0.at();
      assertEquals(16, token4.getTokenType());
      
      xPathLexer0.rightBracket();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume(1458);
      xPathLexer0.setXPath("t:ZS2H}||:7~");
      xPathLexer0.consume();
      xPathLexer0.relationalOperator();
      xPathLexer0.number();
      xPathLexer0.currentPosition();
      xPathLexer0.or();
      xPathLexer0.identifierOrOperatorName();
      boolean boolean0 = xPathLexer0.isIdentifierChar('-');
      Token token5 = xPathLexer0.identifier();
      assertEquals(15, token5.getTokenType());
      assertEquals("", token5.getTokenText());
      
      Token token6 = xPathLexer0.dots();
      assertEquals(13, token6.getTokenType());
      assertEquals(":", token6.getTokenText());
      
      Token token7 = xPathLexer0.dollar();
      assertEquals(26, token7.getTokenType());
      
      Token token8 = xPathLexer0.number();
      assertEquals(30, token8.getTokenType());
      assertEquals("", token8.getTokenText());
      
      Token token9 = xPathLexer0.rightBracket();
      assertEquals("S", token9.getTokenText());
      assertEquals(4, token9.getTokenType());
      
      xPathLexer0.leftParen();
      boolean boolean1 = xPathLexer0.hasMoreChars();
      assertTrue(boolean1 == boolean0);
      
      Token token10 = xPathLexer0.plus();
      assertEquals(5, token10.getTokenType());
      assertEquals("H", token10.getTokenText());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0995003946702235
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.comma();
      xPathLexer0.setXPath("com.werken.saxpath.Token");
      xPathLexer0.and();
      xPathLexer0.comma();
      Token token0 = xPathLexer0.not();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.number();
      xPathLexer0.not();
      Token token1 = xPathLexer0.star();
      token1.toString();
      xPathLexer0.dollar();
      xPathLexer0.plus();
      xPathLexer0.dots();
      Token token2 = xPathLexer0.literal();
      xPathLexer0.plus();
      xPathLexer0.setPreviousToken(token2);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.setXPath("com.werken.saxpath.Token");
      assertEquals("com.werken.saxpath.Token", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4942315629012
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("J35IafOCb%/");
      xPathLexer0.mod();
      xPathLexer0.rightBracket();
      Token token0 = xPathLexer0.rightParen();
      assertEquals("3", token0.getTokenText());
      assertEquals(2, token0.getTokenType());
      
      Token token1 = xPathLexer0.plus();
      assertEquals("5", token1.getTokenText());
      
      Token token2 = xPathLexer0.not();
      assertEquals("I", token2.getTokenText());
      assertEquals(23, token2.getTokenType());
      
      xPathLexer0.nextToken();
      Token token3 = xPathLexer0.dollar();
      assertEquals("%", token3.getTokenText());
      
      Token token4 = xPathLexer0.pipe();
      assertEquals("/", token4.getTokenText());
      assertEquals(17, token4.getTokenType());
      
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.and();
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      
      Token token6 = xPathLexer1.whitespace();
      assertEquals((-2), token6.getTokenType());
      
      xPathLexer0.rightBracket();
      Token token7 = xPathLexer0.identifierOrOperatorName();
      assertNull(token7);
      
      xPathLexer0.consume(1458);
      xPathLexer0.setXPath("t:ZS2H}||:7~");
      xPathLexer0.consume();
      xPathLexer1.relationalOperator();
      xPathLexer1.number();
      xPathLexer1.currentPosition();
      xPathLexer0.or();
      xPathLexer1.identifierOrOperatorName();
      boolean boolean0 = xPathLexer0.isIdentifierChar('-');
      XPathLexer xPathLexer2 = new XPathLexer("brS");
      Token token8 = xPathLexer2.identifier();
      assertEquals("brS", token8.getTokenText());
      assertEquals(15, token8.getTokenType());
      
      Token token9 = xPathLexer0.dots();
      assertEquals(13, token9.getTokenType());
      assertEquals(":", token9.getTokenText());
      
      Token token10 = xPathLexer0.dollar();
      assertEquals(26, token10.getTokenType());
      
      Token token11 = xPathLexer0.number();
      assertEquals(30, token11.getTokenType());
      assertEquals("", token11.getTokenText());
      
      Token token12 = xPathLexer0.rightBracket();
      assertEquals(4, token12.getTokenType());
      
      xPathLexer2.leftParen();
      boolean boolean1 = xPathLexer2.hasMoreChars();
      assertFalse(boolean1 == boolean0);
      
      Token token13 = xPathLexer2.plus();
      assertEquals(5, token13.getTokenType());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.008810661463255
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("hn&;x$%");
      xPathLexer0.literal();
      Token token0 = xPathLexer0.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.consume();
      xPathLexer0.whitespace();
      xPathLexer0.literal();
      Token token1 = xPathLexer0.star();
      assertEquals(20, token1.getTokenType());
      
      xPathLexer0.whitespace();
      xPathLexer0.isIdentifierStartChar('-');
      Token token2 = xPathLexer0.identifierOrOperatorName();
      assertNull(token2);
      
      xPathLexer0.setXPath("L{H'C[t>nSzhM\"hv~7");
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.isIdentifierChar(']');
      Token token3 = xPathLexer1.whitespace();
      assertEquals((-2), token3.getTokenType());
      
      Token token4 = xPathLexer1.rightBracket();
      assertEquals(4, token4.getTokenType());
      
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      assertEquals("L", token5.getTokenText());
      
      xPathLexer1.notEquals();
      xPathLexer1.number();
      Token token6 = xPathLexer0.nextToken();
      assertEquals("{H'C[t>nSzhM\"hv~7", token6.getTokenText());
      
      Token token7 = xPathLexer1.literal();
      assertNull(token7);
      
      Token token8 = xPathLexer1.comma();
      assertEquals(32, token8.getTokenType());
      
      Token token9 = xPathLexer1.notEquals();
      assertEquals(22, token9.getTokenType());
      
      xPathLexer0.div();
      Token token10 = xPathLexer0.literal();
      assertNull(token10);
      
      xPathLexer0.setXPath("k1{-;L$");
      Token token11 = xPathLexer0.number();
      assertEquals(30, token11.getTokenType());
      assertEquals("", token11.getTokenText());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.2861703896509078
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("[ (");
      Token token0 = xPathLexer0.dots();
      token0.toString();
      token0.toString();
      token0.toString();
      xPathLexer0.rightParen();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.leftParen();
      xPathLexer0.getPreviousToken();
      xPathLexer0.getPreviousToken();
      xPathLexer0.leftBracket();
      xPathLexer0.consume();
      xPathLexer0.currentPosition();
      XPathLexer xPathLexer1 = new XPathLexer("[ (13) ([)");
      xPathLexer1.relationalOperator();
      xPathLexer1.identifierOrOperatorName();
      xPathLexer1.nextToken();
      xPathLexer0.rightParen();
      xPathLexer1.identifierOrOperatorName();
      xPathLexer0.dots();
      xPathLexer0.mod();
      xPathLexer1.consume();
      xPathLexer1.dollar();
      xPathLexer0.star();
      xPathLexer0.star();
      xPathLexer0.whitespace();
      xPathLexer1.mod();
      xPathLexer0.isIdentifierStartChar('(');
      xPathLexer0.star();
      xPathLexer0.endPosition();
      xPathLexer1.div();
      xPathLexer0.dots();
      xPathLexer0.div();
      Token token1 = xPathLexer1.operatorName();
      assertNull(token1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.145361440616761
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.rightParen();
      assertEquals(2, token0.getTokenType());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      xPathLexer0.equals();
      xPathLexer0.doubleColon();
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      
      xPathLexer0.dots();
      Token token3 = xPathLexer0.slashes();
      xPathLexer0.div();
      xPathLexer0.setPreviousToken(token3);
      assertEquals(11, token3.getTokenType());
      
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.identifier();
      assertEquals(15, token5.getTokenType());
      
      Token token6 = xPathLexer0.dots();
      assertEquals(13, token6.getTokenType());
      
      Token token7 = xPathLexer0.not();
      assertEquals(23, token7.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('i');
      int int0 = xPathLexer0.endPosition();
      assertEquals(0, int0);
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('3');
      assertFalse(boolean0);
      
      xPathLexer0.leftParen();
      xPathLexer0.consume();
      Token token8 = xPathLexer0.comma();
      assertEquals(32, token8.getTokenType());
      
      xPathLexer0.setXPath("5MdJ*&s0(Jz");
      Token token9 = xPathLexer0.colon();
      assertEquals("5", token9.getTokenText());
      assertEquals(18, token9.getTokenType());
      
      xPathLexer0.currentPosition();
      Token token10 = xPathLexer0.leftParen();
      assertEquals("M", token10.getTokenText());
      assertEquals(1, token10.getTokenType());
      
      Token token11 = xPathLexer0.whitespace();
      assertEquals("", token11.getTokenText());
      assertEquals((-2), token11.getTokenType());
      
      xPathLexer0.consume(1);
      Token token12 = xPathLexer0.nextToken();
      assertEquals(20, token12.getTokenType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.501339578126994
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.pipe();
      xPathLexer0.leftBracket();
      xPathLexer0.setXPath(",ZXe2\"J@&^52|9bGcU");
      xPathLexer0.dollar();
      xPathLexer0.operatorName();
      xPathLexer0.comma();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.identifier();
      xPathLexer0.setXPath("1E*J");
      xPathLexer0.isIdentifierStartChar('g');
      xPathLexer0.at();
      xPathLexer0.whitespace();
      xPathLexer0.literal();
      xPathLexer0.plus();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.setXPath(",ZXe2\"J@&^52|9bGcU");
      assertEquals(",ZXe2\"J@&^52|9bGcU", xPathLexer0.getXPath());
  }
}
