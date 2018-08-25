/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:31:19 GMT 2018
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.isIdentifierStartChar('>');
      xPathLexer0.comma();
      xPathLexer0.div();
      xPathLexer0.colon();
      xPathLexer0.minus();
      xPathLexer0.notEquals();
      xPathLexer0.number();
      xPathLexer0.isIdentifierChar('>');
      xPathLexer0.and();
      xPathLexer0.consume();
      xPathLexer0.literal();
      Token token0 = xPathLexer0.and();
      assertNull(token0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.mod();
      xPathLexer0.and();
      xPathLexer0.or();
      xPathLexer0.slashes();
      xPathLexer0.whitespace();
      xPathLexer0.leftParen();
      xPathLexer0.star();
      xPathLexer0.whitespace();
      xPathLexer0.dollar();
      xPathLexer0.number();
      xPathLexer0.literal();
      xPathLexer0.and();
      xPathLexer0.currentPosition();
      xPathLexer0.comma();
      xPathLexer0.setXPath("");
      xPathLexer0.setXPath("");
      xPathLexer0.setXPath("!\"JK6gFJe8{<NeC@");
      xPathLexer0.operatorName();
      xPathLexer0.dots();
      xPathLexer0.rightBracket();
      xPathLexer0.star();
      xPathLexer0.at();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.whitespace();
      xPathLexer0.plus();
      xPathLexer0.dots();
      xPathLexer0.notEquals();
      xPathLexer0.leftBracket();
      xPathLexer0.relationalOperator();
      xPathLexer0.nextToken();
      xPathLexer0.at();
      xPathLexer0.setXPath("y2:+xhIw6O*x_#ZN");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.dots();
      Token token0 = xPathLexer0.relationalOperator();
      assertNull(token0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.dots();
      xPathLexer0.slashes();
      xPathLexer0.hasMoreChars();
      xPathLexer0.minus();
      xPathLexer0.div();
      xPathLexer0.dots();
      xPathLexer0.leftParen();
      xPathLexer0.not();
      Token token0 = xPathLexer0.rightBracket();
      xPathLexer0.dots();
      xPathLexer0.rightBracket();
      xPathLexer0.rightParen();
      Token token1 = xPathLexer0.dollar();
      assertEquals(26, token1.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.setPreviousToken(token0);
      assertEquals(4, token0.getTokenType());
      
      Token token2 = xPathLexer0.at();
      assertEquals(16, token2.getTokenType());
      
      xPathLexer0.or();
      xPathLexer0.and();
      Token token3 = xPathLexer0.slashes();
      assertEquals(11, token3.getTokenType());
      
      Token token4 = xPathLexer0.plus();
      assertEquals(5, token4.getTokenType());
      
      Token token5 = xPathLexer0.not();
      assertEquals(23, token5.getTokenType());
      
      xPathLexer0.setXPath("E d^,z");
      Token token6 = xPathLexer0.rightParen();
      assertEquals(2, token6.getTokenType());
      assertEquals("E", token6.getTokenText());
      
      Token token7 = xPathLexer0.minus();
      assertEquals(" ", token7.getTokenText());
      assertEquals(6, token7.getTokenType());
      
      Token token8 = xPathLexer0.number();
      assertEquals(30, token8.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token9 = xPathLexer0.comma();
      assertEquals("d", token9.getTokenText());
      assertEquals(32, token9.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.identifierOrOperatorName();
      Token token10 = xPathLexer0.identifier();
      assertEquals("", token10.getTokenText());
      assertEquals(15, token10.getTokenType());
      
      Token token11 = xPathLexer0.whitespace();
      assertEquals((-2), token11.getTokenType());
      
      Token token12 = xPathLexer0.dots();
      assertEquals(13, token12.getTokenType());
      assertEquals(",", token12.getTokenText());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.slashes();
      xPathLexer0.setXPath("X");
      Token token0 = xPathLexer0.literal();
      assertNull(token0);
      
      Token token1 = xPathLexer0.whitespace();
      assertEquals((-2), token1.getTokenType());
      assertEquals("", token1.getTokenText());
      
      xPathLexer0.leftParen();
      xPathLexer0.pipe();
      Token token2 = xPathLexer0.rightParen();
      assertEquals(2, token2.getTokenType());
      
      Token token3 = xPathLexer0.at();
      assertEquals(16, token3.getTokenType());
      
      xPathLexer0.pipe();
      Token token4 = xPathLexer0.plus();
      assertEquals(5, token4.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.operatorName();
      Token token5 = xPathLexer0.slashes();
      assertEquals(11, token5.getTokenType());
      
      Token token6 = xPathLexer0.pipe();
      assertEquals(17, token6.getTokenType());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.notEquals();
      xPathLexer0.at();
      xPathLexer0.number();
      xPathLexer0.whitespace();
      xPathLexer0.equals();
      xPathLexer0.pipe();
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      xPathLexer0.leftBracket();
      xPathLexer0.notEquals();
      xPathLexer0.currentPosition();
      xPathLexer0.star();
      xPathLexer0.notEquals();
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      xPathLexer0.identifier();
      xPathLexer0.isIdentifierStartChar('Z');
      xPathLexer0.div();
      xPathLexer0.slashes();
      xPathLexer0.currentPosition();
      xPathLexer0.consume(11);
      xPathLexer0.plus();
      xPathLexer0.consume();
      xPathLexer0.consume((-2467));
      xPathLexer0.rightBracket();
      xPathLexer0.colon();
      // Undeclared exception!
      try { 
        xPathLexer0.nextToken();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.nextToken();
      xPathLexer0.relationalOperator();
      xPathLexer0.mod();
      xPathLexer0.isIdentifierChar('w');
      xPathLexer0.leftBracket();
      xPathLexer0.consume();
      xPathLexer0.minus();
      xPathLexer0.doubleColon();
      xPathLexer0.literal();
      xPathLexer0.literal();
      xPathLexer0.identifier();
      xPathLexer0.rightBracket();
      xPathLexer0.comma();
      xPathLexer0.leftBracket();
      xPathLexer0.dots();
      xPathLexer0.whitespace();
      xPathLexer0.doubleColon();
      Token token0 = xPathLexer0.identifier();
      xPathLexer0.pipe();
      xPathLexer0.pipe();
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
  //Test case number: 7
  /*Coverage entropy=1.1967758945792144
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.or();
      Token token0 = xPathLexer0.pipe();
      assertEquals(17, token0.getTokenType());
      
      xPathLexer0.at();
      xPathLexer0.minus();
      xPathLexer0.colon();
      Token token1 = xPathLexer0.plus();
      assertEquals(5, token1.getTokenType());
      
      xPathLexer0.dollar();
      Token token2 = xPathLexer0.nextToken();
      assertEquals((-1), token2.getTokenType());
      
      xPathLexer0.literal();
      Token token3 = xPathLexer0.doubleColon();
      assertEquals(19, token3.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token4 = xPathLexer0.at();
      assertEquals(16, token4.getTokenType());
      
      xPathLexer0.consume();
      Token token5 = xPathLexer0.slashes();
      assertEquals(11, token5.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.literal();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(13, int0);
      
      xPathLexer0.setXPath("");
      xPathLexer0.leftParen();
      xPathLexer0.leftBracket();
      Token token6 = xPathLexer0.colon();
      assertEquals(18, token6.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.leftParen();
      xPathLexer0.dollar();
      xPathLexer0.dollar();
      Token token7 = xPathLexer0.leftBracket();
      assertEquals(3, token7.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token8 = xPathLexer0.minus();
      assertEquals(6, token8.getTokenType());
      
      Token token9 = xPathLexer0.dollar();
      assertEquals(26, token9.getTokenType());
      
      xPathLexer0.setXPath("  #B8l]Yz.NRv");
      Token token10 = xPathLexer0.literal();
      assertNotNull(token10);
      assertEquals(27, token10.getTokenType());
      assertEquals("", token10.getTokenText());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9093644808816874
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.pipe();
      assertEquals("c", token0.getTokenText());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      Token token2 = xPathLexer0.minus();
      assertEquals("m", token2.getTokenText());
      assertEquals(6, token2.getTokenType());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals(".", token3.getTokenText());
      
      Token token4 = xPathLexer0.rightBracket();
      assertEquals("w", token4.getTokenText());
      
      xPathLexer0.whitespace();
      Token token5 = xPathLexer0.notEquals();
      assertEquals(22, token5.getTokenType());
      assertEquals("rk", token5.getTokenText());
      
      Token token6 = xPathLexer0.whitespace();
      assertEquals((-2), token6.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      Token token7 = xPathLexer0.identifier();
      assertEquals(15, token7.getTokenType());
      
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      xPathLexer0.literal();
      xPathLexer0.pipe();
      Token token9 = xPathLexer0.rightParen();
      assertEquals(2, token9.getTokenType());
      
      Token token10 = xPathLexer0.rightBracket();
      assertEquals(4, token10.getTokenType());
      
      Token token11 = xPathLexer0.slashes();
      assertEquals(11, token11.getTokenType());
      
      xPathLexer0.endPosition();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(35, int0);
      
      xPathLexer0.getXPath();
      Token token12 = xPathLexer0.pipe();
      assertEquals(17, token12.getTokenType());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.2663832440484455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifier();
      xPathLexer0.whitespace();
      xPathLexer0.not();
      xPathLexer0.minus();
      Token token0 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token0.getTokenType());
      assertNotNull(token0);
      
      Token token1 = xPathLexer0.dollar();
      assertEquals(26, token1.getTokenType());
      
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      
      Token token3 = xPathLexer0.at();
      assertEquals(16, token3.getTokenType());
      
      xPathLexer0.consume();
      Token token4 = xPathLexer0.leftParen();
      assertEquals(1, token4.getTokenType());
      
      Token token5 = xPathLexer0.whitespace();
      assertEquals((-2), token5.getTokenType());
      
      xPathLexer0.endPosition();
      xPathLexer0.not();
      xPathLexer0.plus();
      xPathLexer0.getPreviousToken();
      Token token6 = xPathLexer0.minus();
      assertEquals(6, token6.getTokenType());
      
      Token token7 = xPathLexer0.nextToken();
      assertEquals((-1), token7.getTokenType());
      
      xPathLexer0.dots();
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      Token token9 = xPathLexer0.dots();
      assertEquals(13, token9.getTokenType());
      
      xPathLexer0.consume(0);
      xPathLexer0.rightBracket();
      Token token10 = xPathLexer0.not();
      assertEquals(23, token10.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierChar('-');
      assertTrue(boolean0);
      
      Token token11 = xPathLexer0.plus();
      assertEquals(5, token11.getTokenType());
      
      Token token12 = xPathLexer0.rightBracket();
      assertEquals(4, token12.getTokenType());
      
      Token token13 = xPathLexer0.number();
      assertEquals(30, token13.getTokenType());
      
      int int0 = xPathLexer0.currentPosition();
      assertEquals(19, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1983816340991154
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.pipe();
      assertEquals(17, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      assertEquals("o", token1.getTokenText());
      
      Token token2 = xPathLexer0.minus();
      assertEquals("m", token2.getTokenText());
      assertEquals(6, token2.getTokenType());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals(".", token3.getTokenText());
      
      Token token4 = xPathLexer0.rightBracket();
      assertEquals("w", token4.getTokenText());
      assertEquals(4, token4.getTokenType());
      
      xPathLexer0.whitespace();
      Token token5 = xPathLexer0.notEquals();
      assertEquals(22, token5.getTokenType());
      assertEquals("rk", token5.getTokenText());
      
      Token token6 = xPathLexer0.nextToken();
      assertEquals("en.saxpath.XPathLexer", token6.getTokenText());
      assertEquals(15, token6.getTokenType());
      
      Token token7 = xPathLexer0.whitespace();
      assertEquals((-2), token7.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      xPathLexer0.identifier();
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      xPathLexer0.consume();
      Token token9 = xPathLexer0.number();
      assertEquals(30, token9.getTokenType());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.2233663248714632
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.or();
      xPathLexer0.pipe();
      xPathLexer0.at();
      xPathLexer0.minus();
      xPathLexer0.colon();
      xPathLexer0.plus();
      xPathLexer0.dollar();
      xPathLexer0.nextToken();
      xPathLexer0.literal();
      xPathLexer0.relationalOperator();
      xPathLexer0.at();
      xPathLexer0.consume();
      xPathLexer0.slashes();
      xPathLexer0.operatorName();
      xPathLexer0.literal();
      xPathLexer0.currentPosition();
      xPathLexer0.setXPath("");
      xPathLexer0.leftParen();
      xPathLexer0.leftBracket();
      xPathLexer0.colon();
      xPathLexer0.consume();
      xPathLexer0.leftParen();
      xPathLexer0.dollar();
      xPathLexer0.leftBracket();
      xPathLexer0.relationalOperator();
      xPathLexer0.minus();
      xPathLexer0.dollar();
      xPathLexer0.setXPath("4RgXvJ");
      Token token0 = xPathLexer0.literal();
      assertNull(token0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1194930597613422
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.notEquals();
      xPathLexer0.at();
      xPathLexer0.number();
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      Token token1 = xPathLexer0.equals();
      assertEquals(21, token1.getTokenType());
      
      xPathLexer0.pipe();
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      Token token2 = xPathLexer0.leftBracket();
      assertEquals(3, token2.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.currentPosition();
      Token token3 = xPathLexer0.star();
      assertEquals(20, token3.getTokenType());
      
      Token token4 = xPathLexer0.notEquals();
      assertEquals(22, token4.getTokenType());
      
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      Token token5 = xPathLexer0.nextToken();
      assertEquals("zC", token5.getTokenText());
      assertEquals(15, token5.getTokenType());
      
      Token token6 = xPathLexer0.at();
      assertEquals(16, token6.getTokenType());
      
      xPathLexer0.setXPath("");
      Token token7 = xPathLexer0.identifierOrOperatorName();
      assertNull(token7);
      
      XPathLexer xPathLexer1 = new XPathLexer("VU$N=G's:q");
      Token token8 = xPathLexer1.dots();
      assertEquals(13, token8.getTokenType());
      assertEquals("V", token8.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token9 = xPathLexer0.number();
      assertEquals(30, token9.getTokenType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8762555980127755
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      xPathLexer0.star();
      xPathLexer0.mod();
      xPathLexer0.dollar();
      xPathLexer0.and();
      xPathLexer0.star();
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      xPathLexer0.consume();
      xPathLexer0.equals();
      xPathLexer0.div();
      xPathLexer0.nextToken();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.4906647542789075
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      XPathLexer xPathLexer1 = new XPathLexer("V|0");
      xPathLexer1.leftParen();
      xPathLexer1.whitespace();
      xPathLexer1.number();
      xPathLexer0.literal();
      xPathLexer0.leftParen();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.comma();
      xPathLexer1.setPreviousToken((Token) null);
      assertEquals("V|0", xPathLexer1.getXPath());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0239343167792059
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      xPathLexer0.star();
      xPathLexer0.mod();
      xPathLexer0.nextToken();
      xPathLexer0.and();
      xPathLexer0.star();
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9966617973712916
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.pipe();
      assertEquals(17, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals("o", token1.getTokenText());
      assertEquals(3, token1.getTokenType());
      
      Token token2 = xPathLexer0.minus();
      assertEquals(6, token2.getTokenType());
      
      Token token3 = xPathLexer0.rightBracket();
      assertEquals(4, token3.getTokenType());
      
      Token token4 = xPathLexer0.nextToken();
      assertEquals(15, token4.getTokenType());
      assertEquals("werken.saxpath.XPathLexer", token4.getTokenText());
      
      Token token5 = xPathLexer0.whitespace();
      assertEquals((-2), token5.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      xPathLexer0.identifier();
      Token token6 = xPathLexer0.star();
      assertEquals(20, token6.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      xPathLexer0.consume();
      Token token7 = xPathLexer0.number();
      assertEquals(30, token7.getTokenType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9015256865948359
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      Token token0 = xPathLexer0.star();
      assertEquals("z", token0.getTokenText());
      
      xPathLexer0.mod();
      Token token1 = xPathLexer0.dollar();
      assertEquals("6", token1.getTokenText());
      assertEquals(26, token1.getTokenType());
      
      xPathLexer0.and();
      Token token2 = xPathLexer0.star();
      assertEquals("`", token2.getTokenText());
      assertEquals(20, token2.getTokenType());
      
      xPathLexer0.mod();
      int int0 = xPathLexer0.endPosition();
      assertEquals(18, int0);
      
      xPathLexer0.consume();
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      assertEquals("z", token3.getTokenText());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      assertEquals("", token4.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token5 = xPathLexer0.nextToken();
      assertEquals("`n>fhh}V3iTy", token5.getTokenText());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('>');
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7724544300162763
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      xPathLexer0.plus();
      XPathLexer xPathLexer1 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      xPathLexer1.dots();
      xPathLexer1.notEquals();
      xPathLexer0.leftBracket();
      xPathLexer1.relationalOperator();
      xPathLexer1.nextToken();
      xPathLexer0.at();
      xPathLexer1.setXPath("y2:+xhIw6O*x_#ZN");
      xPathLexer1.identifierOrOperatorName();
      xPathLexer1.dots();
      Token token0 = xPathLexer1.relationalOperator();
      assertNull(token0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1514497979115934
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      Token token0 = xPathLexer0.star();
      assertEquals("z", token0.getTokenText());
      
      xPathLexer0.mod();
      xPathLexer0.rightBracket();
      Token token1 = xPathLexer0.rightParen();
      assertEquals(2, token1.getTokenType());
      assertEquals("`", token1.getTokenText());
      
      Token token2 = xPathLexer0.dollar();
      assertEquals("%", token2.getTokenText());
      assertEquals(26, token2.getTokenType());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals("z", token3.getTokenText());
      assertEquals(1, token3.getTokenType());
      
      Token token4 = xPathLexer0.rightBracket();
      assertEquals(4, token4.getTokenType());
      assertEquals("]", token4.getTokenText());
      
      xPathLexer0.whitespace();
      Token token5 = xPathLexer0.notEquals();
      assertEquals("n>", token5.getTokenText());
      assertEquals(22, token5.getTokenType());
      
      Token token6 = xPathLexer0.nextToken();
      assertEquals("fhh", token6.getTokenText());
      
      xPathLexer0.whitespace();
      xPathLexer0.consume();
      xPathLexer0.or();
      Token token7 = xPathLexer0.identifier();
      assertEquals("3iTy", token7.getTokenText());
      assertEquals(15, token7.getTokenType());
      
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      xPathLexer0.mod();
      XPathLexer xPathLexer1 = new XPathLexer(">,U0RL4@r^v:");
      xPathLexer1.endPosition();
      Token token9 = xPathLexer1.whitespace();
      assertEquals((-2), token9.getTokenType());
      assertEquals("", token9.getTokenText());
      
      xPathLexer1.consume();
      Token token10 = xPathLexer1.number();
      assertEquals(30, token10.getTokenType());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0650379583334355
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.pipe();
      assertEquals(17, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      xPathLexer0.leftBracket();
      Token token1 = xPathLexer0.minus();
      assertEquals("m", token1.getTokenText());
      assertEquals(6, token1.getTokenType());
      
      xPathLexer0.leftParen();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals("w", token2.getTokenText());
      assertEquals(4, token2.getTokenType());
      
      xPathLexer0.whitespace();
      xPathLexer0.operatorName();
      Token token3 = xPathLexer0.nextToken();
      assertEquals("rken.saxpath.XPathLexer", token3.getTokenText());
      assertEquals(15, token3.getTokenType());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      xPathLexer0.identifier();
      Token token5 = xPathLexer0.star();
      assertEquals(20, token5.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.nextToken();
      XPathLexer xPathLexer1 = new XPathLexer("mi<'0rV:M?<v3(\"l");
      Token token6 = xPathLexer1.leftBracket();
      assertEquals("m", token6.getTokenText());
      assertEquals(3, token6.getTokenType());
      
      boolean boolean0 = xPathLexer1.isIdentifierStartChar('*');
      assertFalse(boolean0);
      
      Token token7 = xPathLexer0.identifier();
      assertEquals(15, token7.getTokenType());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7905399943953901
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.leftBracket();
      assertEquals(3, token0.getTokenType());
      assertEquals("c", token0.getTokenText());
      
      Token token1 = xPathLexer0.minus();
      assertEquals("o", token1.getTokenText());
      assertEquals(6, token1.getTokenType());
      
      Token token2 = xPathLexer0.rightBracket();
      assertEquals(4, token2.getTokenType());
      assertEquals("m", token2.getTokenText());
      
      Token token3 = xPathLexer0.nextToken();
      assertEquals(13, token3.getTokenType());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals("", token4.getTokenText());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      Token token5 = xPathLexer0.identifier();
      assertEquals(15, token5.getTokenType());
      assertEquals("rken.saxpath.XPathLexer", token5.getTokenText());
      
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      Token token6 = xPathLexer0.identifierOrOperatorName();
      assertNull(token6);
      
      XPathLexer xPathLexer1 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token7 = xPathLexer0.dots();
      assertEquals("c", token7.getTokenText());
      
      xPathLexer0.relationalOperator();
      XPathLexer xPathLexer2 = new XPathLexer("");
      Token token8 = xPathLexer2.number();
      assertEquals(30, token8.getTokenType());
      
      Token token9 = xPathLexer2.whitespace();
      assertEquals((-2), token9.getTokenType());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5384949042236016
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.notEquals();
      xPathLexer0.at();
      xPathLexer0.number();
      xPathLexer0.whitespace();
      xPathLexer0.equals();
      xPathLexer0.pipe();
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      xPathLexer0.leftBracket();
      XPathLexer xPathLexer1 = new XPathLexer("EQ_c");
      xPathLexer1.mod();
      xPathLexer1.nextToken();
      xPathLexer1.and();
      xPathLexer0.star();
      xPathLexer1.mod();
      xPathLexer1.endPosition();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.9114701449764913
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.at();
      xPathLexer0.number();
      xPathLexer0.whitespace();
      xPathLexer0.equals();
      xPathLexer0.pipe();
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      xPathLexer0.leftBracket();
      xPathLexer0.notEquals();
      xPathLexer0.currentPosition();
      xPathLexer0.star();
      xPathLexer0.notEquals();
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      xPathLexer0.identifier();
      xPathLexer0.plus();
      xPathLexer0.isIdentifierStartChar('Z');
      xPathLexer0.div();
      xPathLexer0.slashes();
      xPathLexer0.currentPosition();
      xPathLexer0.plus();
      xPathLexer0.consume();
      xPathLexer0.consume((-2467));
      xPathLexer0.rightBracket();
      xPathLexer0.colon();
      // Undeclared exception!
      try { 
        xPathLexer0.nextToken();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.2849280840928496
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("z6`%z]`n>fhh}V3iTy");
      Token token0 = xPathLexer0.star();
      assertEquals("z", token0.getTokenText());
      
      xPathLexer0.mod();
      Token token1 = xPathLexer0.dollar();
      assertEquals("6", token1.getTokenText());
      assertEquals(26, token1.getTokenType());
      
      xPathLexer0.and();
      Token token2 = xPathLexer0.star();
      assertEquals(20, token2.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      xPathLexer0.consume();
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      
      xPathLexer0.whitespace();
      xPathLexer0.relationalOperator();
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      assertEquals("", token4.getTokenText());
      
      Token token5 = xPathLexer0.rightParen();
      assertEquals("n", token5.getTokenText());
      assertEquals(2, token5.getTokenType());
      
      Token token6 = xPathLexer0.nextToken();
      assertEquals(9, token6.getTokenType());
      assertEquals(">", token6.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token7 = xPathLexer0.dots();
      assertEquals(13, token7.getTokenType());
      assertEquals("f", token7.getTokenText());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9706098030831851
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.notEquals();
      xPathLexer0.at();
      xPathLexer0.number();
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      Token token1 = xPathLexer0.equals();
      assertEquals(21, token1.getTokenType());
      
      Token token2 = xPathLexer0.pipe();
      assertEquals(17, token2.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      Token token3 = xPathLexer0.leftBracket();
      assertEquals(3, token3.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.currentPosition();
      xPathLexer0.star();
      Token token4 = xPathLexer0.notEquals();
      assertEquals(22, token4.getTokenType());
      
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      xPathLexer0.setXPath("zC%dZ?654{0LB7");
      Token token5 = xPathLexer0.nextToken();
      assertEquals("zC", token5.getTokenText());
      assertEquals(15, token5.getTokenType());
      
      Token token6 = xPathLexer0.at();
      assertEquals(16, token6.getTokenType());
      assertEquals("%", token6.getTokenText());
      
      Token token7 = xPathLexer0.star();
      assertEquals("d", token7.getTokenText());
      assertEquals(20, token7.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.endPosition();
      xPathLexer0.consume();
      Token token8 = xPathLexer0.number();
      assertEquals(30, token8.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('_');
      assertTrue(boolean0);
  }
}
