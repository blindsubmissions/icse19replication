/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:20:08 GMT 2018
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
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("_|vTqD");
      Token token0 = xPathLexer0.dots();
      assertEquals("", token0.getTokenText());
      assertEquals(13, token0.getTokenType());
      
      Token token1 = xPathLexer0.rightBracket();
      assertEquals("_", token1.getTokenText());
      assertEquals(4, token1.getTokenType());
      
      xPathLexer0.dollar();
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      Token token3 = xPathLexer0.dollar();
      xPathLexer0.plus();
      Token token4 = xPathLexer0.leftBracket();
      assertEquals("q", token4.getTokenText());
      
      xPathLexer0.getXPath();
      Token token5 = xPathLexer0.plus();
      assertEquals("D", token5.getTokenText());
      
      String string0 = token3.toString();
      assertEquals("[ (26) (v)", string0);
      
      xPathLexer0.pipe();
      Token token6 = xPathLexer0.plus();
      assertEquals(5, token6.getTokenType());
      
      xPathLexer0.or();
      xPathLexer0.leftBracket();
      xPathLexer0.hasMoreChars();
      xPathLexer0.or();
      Token token7 = xPathLexer0.equals();
      assertEquals(21, token7.getTokenType());
      
      Token token8 = xPathLexer0.notEquals();
      assertEquals(22, token8.getTokenType());
      
      Token token9 = xPathLexer0.pipe();
      assertEquals(17, token9.getTokenType());
      
      xPathLexer0.dollar();
      int int0 = xPathLexer0.endPosition();
      assertEquals(7, int0);
      
      Token token10 = xPathLexer0.leftBracket();
      assertEquals(3, token10.getTokenType());
      
      xPathLexer0.consume(7);
      xPathLexer0.relationalOperator();
      xPathLexer0.setPreviousToken(token3);
      Token token11 = xPathLexer0.colon();
      assertEquals(18, token11.getTokenType());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("[EtFOB");
      xPathLexer0.leftParen();
      xPathLexer0.rightBracket();
      xPathLexer0.rightBracket();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.whitespace();
      xPathLexer0.and();
      xPathLexer0.dollar();
      xPathLexer0.notEquals();
      xPathLexer0.dollar();
      // Undeclared exception!
      try { 
        xPathLexer0.LA((-1354));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("Fq0{<4(Ku>A@8");
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.minus();
      token0.toString();
      token0.toString();
      token0.toString();
      token0.toString();
      token0.toString();
      String string0 = token0.toString();
      assertEquals("[ (6) (q)", string0);
      
      xPathLexer0.setPreviousToken(token0);
      Token token1 = xPathLexer0.doubleColon();
      assertEquals("0{", token1.getTokenText());
      assertEquals(19, token1.getTokenType());
      
      xPathLexer0.dollar();
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.slashes();
      assertEquals(11, token2.getTokenType());
      
      xPathLexer0.mod();
      Token token3 = xPathLexer0.rightParen();
      assertEquals(2, token3.getTokenType());
      assertEquals("K", token3.getTokenText());
      
      char char0 = xPathLexer0.LA(3221);
      assertEquals('\uFFFF', char0);
      
      Token token4 = xPathLexer0.dollar();
      assertEquals("u", token4.getTokenText());
      assertEquals(26, token4.getTokenType());
      
      Token token5 = xPathLexer0.rightBracket();
      assertEquals(">", token5.getTokenText());
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(13, int0);
      
      xPathLexer0.consume(3221);
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertFalse(boolean0);
      
      Token token6 = xPathLexer0.pipe();
      assertEquals(17, token6.getTokenType());
      
      Token token7 = xPathLexer0.comma();
      assertEquals(32, token7.getTokenType());
      
      Token token8 = xPathLexer0.rightBracket();
      assertEquals(4, token8.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token9 = xPathLexer0.at();
      assertEquals(16, token9.getTokenType());
      
      Token token10 = xPathLexer0.not();
      assertEquals(23, token10.getTokenType());
      
      xPathLexer0.getPreviousToken();
      Token token11 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token11.getTokenType());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.equals();
      xPathLexer0.nextToken();
      xPathLexer0.star();
      xPathLexer0.relationalOperator();
      xPathLexer0.and();
      xPathLexer0.setXPath("%n/7");
      xPathLexer0.comma();
      xPathLexer0.colon();
      xPathLexer0.identifier();
      xPathLexer0.consume();
      xPathLexer0.nextToken();
      xPathLexer0.comma();
      xPathLexer0.isIdentifierChar('9');
      xPathLexer0.not();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.831480240067973
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("l=NhRdK~>");
      Token token0 = xPathLexer0.identifier();
      xPathLexer0.rightBracket();
      xPathLexer0.div();
      xPathLexer0.pipe();
      xPathLexer0.plus();
      xPathLexer0.notEquals();
      xPathLexer0.at();
      xPathLexer0.notEquals();
      token0.toString();
      xPathLexer0.identifier();
      xPathLexer0.getPreviousToken();
      xPathLexer0.whitespace();
      xPathLexer0.setPreviousToken(token0);
      Token token1 = xPathLexer0.div();
      assertNull(token1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9668683566312984
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.dots();
      xPathLexer0.rightBracket();
      xPathLexer0.plus();
      xPathLexer0.at();
      xPathLexer0.slashes();
      xPathLexer0.setXPath("rliv9F7gP^!e]");
      xPathLexer0.not();
      xPathLexer0.at();
      xPathLexer0.rightBracket();
      xPathLexer0.or();
      xPathLexer0.consume();
      xPathLexer0.whitespace();
      xPathLexer0.literal();
      xPathLexer0.minus();
      xPathLexer0.LA(0);
      xPathLexer0.nextToken();
      Token token1 = xPathLexer0.nextToken();
      assertFalse(token1.equals((Object)token0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.751666616931517
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.identifier();
      xPathLexer0.number();
      xPathLexer0.and();
      xPathLexer0.currentPosition();
      xPathLexer0.minus();
      xPathLexer0.isIdentifierStartChar('c');
      xPathLexer0.doubleColon();
      xPathLexer0.equals();
      xPathLexer0.at();
      // Undeclared exception!
      try { 
        xPathLexer0.LA((-607));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.955282915243147
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("wn>!1H3");
      Token token0 = xPathLexer0.whitespace();
      Token token1 = xPathLexer0.dots();
      assertEquals("n", token1.getTokenText());
      assertEquals(13, token1.getTokenType());
      
      Token token2 = xPathLexer0.leftBracket();
      xPathLexer0.nextToken();
      token2.toString();
      String string0 = token2.toString();
      assertEquals("[ (3) (>)", string0);
      
      xPathLexer0.star();
      String string1 = token0.toString();
      assertEquals("[ (-2) ()", string1);
      
      xPathLexer0.setPreviousToken(token2);
      Token token3 = xPathLexer0.not();
      assertEquals(23, token3.getTokenType());
      assertEquals("H", token3.getTokenText());
      
      Token token4 = xPathLexer0.star();
      assertEquals(20, token4.getTokenType());
      assertEquals("3", token4.getTokenText());
      
      Token token5 = xPathLexer0.number();
      assertEquals(30, token5.getTokenType());
      assertEquals("", token5.getTokenText());
      
      Token token6 = xPathLexer0.plus();
      assertEquals(5, token6.getTokenType());
      
      xPathLexer0.setPreviousToken(token0);
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
      
      xPathLexer0.or();
      Token token8 = xPathLexer0.rightBracket();
      assertEquals(4, token8.getTokenType());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.2434261760390533
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.colon();
      assertEquals(18, token0.getTokenType());
      
      xPathLexer0.rightParen();
      Token token1 = xPathLexer0.nextToken();
      assertEquals((-1), token1.getTokenType());
      
      Token token2 = xPathLexer0.identifierOrOperatorName();
      assertNull(token2);
      
      xPathLexer0.or();
      Token token3 = xPathLexer0.leftBracket();
      assertEquals(3, token3.getTokenType());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      
      Token token6 = xPathLexer0.rightBracket();
      assertEquals(4, token6.getTokenType());
      
      Token token7 = xPathLexer0.dots();
      assertEquals(13, token7.getTokenType());
      
      xPathLexer0.minus();
      xPathLexer0.setXPath("Vo\"Q}nv]QaG");
      Token token8 = xPathLexer0.pipe();
      assertEquals("V", token8.getTokenText());
      assertEquals(17, token8.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.operatorName();
      Token token9 = xPathLexer0.minus();
      assertEquals(6, token9.getTokenType());
      assertEquals("o", token9.getTokenText());
      
      Token token10 = xPathLexer0.comma();
      assertEquals("\"", token10.getTokenText());
      assertEquals(32, token10.getTokenType());
      
      Token token11 = xPathLexer0.rightParen();
      assertEquals("Q", token11.getTokenText());
      
      xPathLexer0.setXPath("");
      xPathLexer0.nextToken();
      xPathLexer0.mod();
      xPathLexer0.and();
      xPathLexer0.nextToken();
      boolean boolean0 = xPathLexer0.isIdentifierChar('n');
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.246211539077691
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.mod();
      Token token0 = xPathLexer0.rightBracket();
      assertEquals(4, token0.getTokenType());
      
      xPathLexer0.pipe();
      Token token1 = xPathLexer0.colon();
      assertEquals(18, token1.getTokenType());
      
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      xPathLexer0.and();
      xPathLexer0.operatorName();
      Token token3 = xPathLexer0.leftParen();
      assertEquals("c", token3.getTokenText());
      
      xPathLexer0.doubleColon();
      xPathLexer0.leftParen();
      xPathLexer0.mod();
      xPathLexer0.currentPosition();
      Token token4 = xPathLexer0.leftBracket();
      assertEquals("w", token4.getTokenText());
      assertEquals(3, token4.getTokenType());
      
      xPathLexer0.literal();
      Token token5 = xPathLexer0.not();
      assertEquals(23, token5.getTokenType());
      
      xPathLexer0.div();
      Token token6 = xPathLexer0.notEquals();
      assertEquals(".s", token6.getTokenText());
      assertEquals(22, token6.getTokenType());
      
      Token token7 = xPathLexer0.doubleColon();
      assertEquals(19, token7.getTokenType());
      assertEquals("ax", token7.getTokenText());
      
      Token token8 = xPathLexer0.pipe();
      assertEquals("p", token8.getTokenText());
      assertEquals(17, token8.getTokenType());
      
      Token token9 = xPathLexer0.slashes();
      assertEquals("a", token9.getTokenText());
      
      Token token10 = xPathLexer0.whitespace();
      assertEquals((-2), token10.getTokenType());
      
      xPathLexer0.or();
      Token token11 = xPathLexer0.literal();
      assertNotNull(token11);
      assertEquals(".XPat", token11.getTokenText());
      assertEquals(27, token11.getTokenType());
      
      Token token12 = xPathLexer0.leftParen();
      assertEquals(1, token12.getTokenType());
      
      Token token13 = xPathLexer0.comma();
      assertEquals("e", token13.getTokenText());
      assertEquals(32, token13.getTokenType());
      
      Token token14 = xPathLexer0.star();
      assertEquals("x", token14.getTokenText());
      assertEquals(20, token14.getTokenType());
      
      Token token15 = xPathLexer0.equals();
      assertEquals("e", token15.getTokenText());
      assertEquals(21, token15.getTokenType());
      
      Token token16 = xPathLexer0.dollar();
      assertEquals("r", token16.getTokenText());
      assertEquals(26, token16.getTokenType());
      
      Token token17 = xPathLexer0.slashes();
      assertEquals(11, token17.getTokenType());
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(29, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2484078494866913
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.rightBracket();
      xPathLexer0.mod();
      xPathLexer0.div();
      xPathLexer0.notEquals();
      xPathLexer0.consume(2425);
      xPathLexer0.comma();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.slashes();
      xPathLexer0.minus();
      xPathLexer0.operatorName();
      xPathLexer0.nextToken();
      xPathLexer0.relationalOperator();
      xPathLexer0.comma();
      xPathLexer0.setXPath("UHBH- v");
      xPathLexer0.getPreviousToken();
      xPathLexer0.number();
      xPathLexer0.rightBracket();
      xPathLexer0.and();
      xPathLexer0.LA(0);
      xPathLexer0.plus();
      xPathLexer0.isIdentifierStartChar('U');
      xPathLexer0.colon();
      xPathLexer0.dollar();
      xPathLexer0.getXPath();
      xPathLexer0.minus();
      xPathLexer0.endPosition();
      xPathLexer0.leftBracket();
      xPathLexer0.and();
      xPathLexer0.at();
      xPathLexer0.getXPath();
      xPathLexer0.nextToken();
      xPathLexer0.rightBracket();
      xPathLexer0.setPreviousToken((Token) null);
      assertEquals("UHBH- v", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.2470221861919355
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.identifier();
      xPathLexer0.at();
      xPathLexer0.rightParen();
      xPathLexer0.not();
      token0.toString();
      xPathLexer0.dollar();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.number();
      xPathLexer0.nextToken();
      xPathLexer0.notEquals();
      token0.toString();
      xPathLexer0.minus();
      token0.toString();
      token0.toString();
      xPathLexer0.minus();
      xPathLexer0.div();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.relationalOperator();
      XPathLexer xPathLexer1 = new XPathLexer("[ (15) ()");
      xPathLexer1.whitespace();
      xPathLexer1.getPreviousToken();
      xPathLexer0.colon();
      xPathLexer0.endPosition();
      xPathLexer1.operatorName();
      XPathLexer xPathLexer2 = new XPathLexer("");
      int int0 = xPathLexer2.endPosition();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.865004489265256
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.identifier();
      xPathLexer0.number();
      xPathLexer0.and();
      xPathLexer0.setXPath("$d6l#$L");
      xPathLexer0.comma();
      xPathLexer0.colon();
      xPathLexer0.identifier();
      xPathLexer0.consume();
      xPathLexer0.nextToken();
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.setXPath("");
      xPathLexer1.comma();
      xPathLexer0.isIdentifierChar('p');
      xPathLexer0.not();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3838794239216359
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G{;'6?{!Q?4'0\f");
      xPathLexer0.mod();
      xPathLexer0.setXPath("G{;'6?{!Q?4'0\f");
      xPathLexer0.not();
      xPathLexer0.star();
      xPathLexer0.nextToken();
      xPathLexer0.whitespace();
      xPathLexer0.dollar();
      xPathLexer0.doubleColon();
      xPathLexer0.identifier();
      xPathLexer0.nextToken();
      xPathLexer0.hasMoreChars();
      xPathLexer0.leftBracket();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6713851151277275
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("wn>!1H3");
      Token token0 = xPathLexer0.identifier();
      xPathLexer0.dots();
      Token token1 = xPathLexer0.leftBracket();
      xPathLexer0.nextToken();
      token1.toString();
      xPathLexer0.star();
      token0.toString();
      xPathLexer0.setPreviousToken(token1);
      xPathLexer0.not();
      xPathLexer0.star();
      xPathLexer0.notEquals();
      xPathLexer0.plus();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.colon();
      xPathLexer0.or();
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3118921844540656
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G{;'6?{!Q?4'0\f");
      xPathLexer0.mod();
      xPathLexer0.setXPath("G{;'6?{!Q?4'0\f");
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      assertEquals("G", token0.getTokenText());
      
      Token token1 = xPathLexer0.star();
      assertEquals("{", token1.getTokenText());
      assertEquals(20, token1.getTokenType());
      
      Token token2 = xPathLexer0.nextToken();
      assertEquals((-1), token2.getTokenType());
      
      Token token3 = xPathLexer0.dollar();
      assertEquals(";", token3.getTokenText());
      assertEquals(26, token3.getTokenType());
      
      Token token4 = xPathLexer0.doubleColon();
      assertEquals("'6", token4.getTokenText());
      assertEquals(19, token4.getTokenType());
      
      Token token5 = xPathLexer0.identifier();
      assertEquals(15, token5.getTokenType());
      
      Token token6 = xPathLexer0.nextToken();
      assertEquals("?{!Q?4'0\f", token6.getTokenText());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertTrue(boolean0);
      
      Token token7 = xPathLexer0.leftBracket();
      assertEquals("?", token7.getTokenText());
      assertEquals(3, token7.getTokenType());
      
      xPathLexer0.mod();
      Token token8 = xPathLexer0.whitespace();
      assertEquals((-2), token8.getTokenType());
      assertEquals("", token8.getTokenText());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0256986341535768
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("wn>!1H3");
      xPathLexer0.and();
      xPathLexer0.dots();
      Token token0 = xPathLexer0.leftBracket();
      xPathLexer0.nextToken();
      token0.toString();
      token0.toString();
      xPathLexer0.star();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.not();
      xPathLexer0.star();
      xPathLexer0.number();
      xPathLexer0.plus();
      xPathLexer0.setPreviousToken((Token) null);
      xPathLexer0.colon();
      xPathLexer0.or();
      xPathLexer0.rightBracket();
      Token token1 = xPathLexer0.and();
      assertNull(token1);
  }
}
