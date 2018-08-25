/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:00:45 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.whitespace();
      xPathLexer0.whitespace();
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.minus();
      xPathLexer0.or();
      xPathLexer0.slashes();
      xPathLexer0.dots();
      xPathLexer0.dollar();
      xPathLexer0.dollar();
      xPathLexer0.at();
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
  //Test case number: 2
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(")");
      Token token0 = xPathLexer0.notEquals();
      assertEquals(22, token0.getTokenType());
      
      xPathLexer0.and();
      xPathLexer0.nextToken();
      Token token1 = xPathLexer0.rightParen();
      assertEquals(2, token1.getTokenType());
      
      xPathLexer0.setXPath("");
      xPathLexer0.identifierOrOperatorName();
      Token token2 = xPathLexer0.getPreviousToken();
      assertEquals((-1), token2.getTokenType());
      
      Token token3 = xPathLexer0.doubleColon();
      assertEquals(19, token3.getTokenType());
      
      Token token4 = xPathLexer0.at();
      assertEquals(16, token4.getTokenType());
      
      Token token5 = xPathLexer0.pipe();
      assertEquals(17, token5.getTokenType());
      
      xPathLexer0.number();
      xPathLexer0.isIdentifierChar('\\');
      Token token6 = xPathLexer0.comma();
      assertEquals(32, token6.getTokenType());
      
      xPathLexer0.colon();
      Token token7 = xPathLexer0.dollar();
      assertEquals(26, token7.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.mod();
      Token token8 = xPathLexer0.plus();
      assertEquals(5, token8.getTokenType());
      
      xPathLexer0.mod();
      Token token9 = xPathLexer0.leftBracket();
      assertEquals(3, token9.getTokenType());
      
      Token token10 = xPathLexer0.number();
      assertEquals(30, token10.getTokenType());
      
      xPathLexer0.dots();
      Token token11 = xPathLexer0.minus();
      assertEquals(6, token11.getTokenType());
      
      xPathLexer0.colon();
      Token token12 = xPathLexer0.dots();
      assertEquals(13, token12.getTokenType());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.plus();
      assertEquals(5, token0.getTokenType());
      
      Token token1 = xPathLexer0.notEquals();
      assertEquals(22, token1.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.or();
      xPathLexer0.operatorName();
      Token token2 = xPathLexer0.identifier();
      assertEquals(15, token2.getTokenType());
      
      Token token3 = xPathLexer0.whitespace();
      assertEquals((-2), token3.getTokenType());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.equals();
      xPathLexer0.div();
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
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.minus();
      assertEquals(6, token0.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.relationalOperator();
      Token token1 = xPathLexer0.dots();
      assertEquals(13, token1.getTokenType());
      
      xPathLexer0.comma();
      Token token2 = xPathLexer0.notEquals();
      assertEquals(22, token2.getTokenType());
      
      xPathLexer0.rightParen();
      Token token3 = xPathLexer0.rightParen();
      assertEquals(2, token3.getTokenType());
      
      Token token4 = xPathLexer0.equals();
      assertEquals(21, token4.getTokenType());
      
      xPathLexer0.consume();
      Token token5 = xPathLexer0.comma();
      assertEquals(32, token5.getTokenType());
      
      Token token6 = xPathLexer0.colon();
      assertEquals(18, token6.getTokenType());
      
      xPathLexer0.identifier();
      xPathLexer0.consume(0);
      Token token7 = xPathLexer0.identifier();
      assertEquals(15, token7.getTokenType());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertFalse(boolean0);
      
      xPathLexer0.and();
      xPathLexer0.consume(0);
      xPathLexer0.consume(0);
      xPathLexer0.or();
      xPathLexer0.consume();
      xPathLexer0.div();
      xPathLexer0.mod();
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      Token token9 = xPathLexer0.doubleColon();
      assertEquals(19, token9.getTokenType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("_");
      xPathLexer0.comma();
      xPathLexer0.doubleColon();
      xPathLexer0.comma();
      xPathLexer0.whitespace();
      xPathLexer0.minus();
      xPathLexer0.minus();
      xPathLexer0.setXPath("Z7P\"t4?1b");
      xPathLexer0.leftParen();
      xPathLexer0.consume((-3096));
      assertEquals("Z7P\"t4?1b", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.number();
      xPathLexer0.dollar();
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      xPathLexer0.equals();
      xPathLexer0.comma();
      Token token1 = xPathLexer0.not();
      assertEquals(23, token1.getTokenType());
      
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      Token token3 = xPathLexer0.nextToken();
      assertEquals((-1), token3.getTokenType());
      
      Token token4 = xPathLexer0.equals();
      assertEquals(21, token4.getTokenType());
      
      xPathLexer0.colon();
      xPathLexer0.nextToken();
      xPathLexer0.or();
      xPathLexer0.consume(12);
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('7');
      assertFalse(boolean0);
      
      xPathLexer0.identifierOrOperatorName();
      Token token5 = xPathLexer0.minus();
      assertEquals(6, token5.getTokenType());
      
      Token token6 = xPathLexer0.identifierOrOperatorName();
      assertNull(token6);
      
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
      
      Token token8 = xPathLexer0.comma();
      assertEquals(32, token8.getTokenType());
      
      Token token9 = xPathLexer0.dollar();
      assertEquals(26, token9.getTokenType());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0166125096468999
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.notEquals();
      xPathLexer0.colon();
      xPathLexer0.mod();
      xPathLexer0.not();
      Token token0 = xPathLexer0.nextToken();
      assertEquals((-1), token0.getTokenType());
      
      xPathLexer0.colon();
      xPathLexer0.or();
      Token token1 = xPathLexer0.plus();
      assertEquals(5, token1.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('(');
      xPathLexer0.mod();
      xPathLexer0.colon();
      Token token2 = xPathLexer0.not();
      assertEquals(23, token2.getTokenType());
      
      Token token3 = xPathLexer0.star();
      assertEquals(20, token3.getTokenType());
      
      Token token4 = xPathLexer0.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      Token token5 = xPathLexer0.identifier();
      assertEquals(15, token5.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.consume();
      xPathLexer0.colon();
      Token token6 = xPathLexer0.notEquals();
      assertEquals(22, token6.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.nextToken();
      xPathLexer0.mod();
      xPathLexer0.colon();
      boolean boolean1 = xPathLexer0.hasMoreChars();
      assertTrue(boolean1 == boolean0);
      
      xPathLexer0.relationalOperator();
      xPathLexer0.and();
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.number();
      xPathLexer0.mod();
      xPathLexer0.plus();
      xPathLexer0.comma();
      xPathLexer0.and();
      xPathLexer0.number();
      xPathLexer0.equals();
      Token token0 = xPathLexer0.equals();
      assertEquals(21, token0.getTokenType());
      
      xPathLexer0.slashes();
      xPathLexer0.div();
      xPathLexer0.or();
      xPathLexer0.leftParen();
      Token token1 = xPathLexer0.dollar();
      assertEquals(26, token1.getTokenType());
      
      Token token2 = xPathLexer0.plus();
      assertEquals(5, token2.getTokenType());
      
      Token token3 = xPathLexer0.number();
      assertEquals(30, token3.getTokenType());
      
      Token token4 = xPathLexer0.at();
      assertEquals(16, token4.getTokenType());
      
      Token token5 = xPathLexer0.doubleColon();
      assertEquals(19, token5.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.slashes();
      Token token6 = xPathLexer0.rightBracket();
      assertEquals(4, token6.getTokenType());
      
      xPathLexer0.and();
      Token token7 = xPathLexer0.slashes();
      assertEquals(11, token7.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.endPosition();
      xPathLexer0.endPosition();
      xPathLexer0.or();
      xPathLexer0.setXPath("");
      Token token8 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token8);
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(0, int0);
      
      Token token9 = xPathLexer0.identifier();
      assertEquals(15, token9.getTokenType());
      
      Token token10 = xPathLexer0.colon();
      assertEquals(18, token10.getTokenType());
      
      Token token11 = xPathLexer0.minus();
      assertEquals(6, token11.getTokenType());
      
      Token token12 = xPathLexer0.leftBracket();
      assertEquals(3, token12.getTokenType());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.7516666169315163
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.notEquals();
      xPathLexer0.dots();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.literal();
      xPathLexer0.and();
      xPathLexer0.consume((-1160));
      // Undeclared exception!
      try { 
        xPathLexer0.nextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.120291565301284
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("Nv%n@8i=CJ");
      Token token0 = xPathLexer0.equals();
      assertEquals("N", token0.getTokenText());
      assertEquals(21, token0.getTokenType());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token1);
      assertEquals("v", token1.getTokenText());
      assertEquals(15, token1.getTokenType());
      
      xPathLexer0.mod();
      Token token2 = xPathLexer0.notEquals();
      assertEquals(22, token2.getTokenType());
      assertEquals("%n", token2.getTokenText());
      
      Token token3 = xPathLexer0.at();
      assertEquals("@", token3.getTokenText());
      
      xPathLexer0.literal();
      Token token4 = xPathLexer0.dots();
      assertEquals(13, token4.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierChar('{');
      assertFalse(boolean0);
      
      Token token5 = xPathLexer0.number();
      assertEquals(30, token5.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.isIdentifierChar('&');
      Token token6 = xPathLexer0.dollar();
      assertEquals(26, token6.getTokenType());
      
      Token token7 = xPathLexer0.at();
      assertEquals(16, token7.getTokenType());
      
      Token token8 = xPathLexer0.leftBracket();
      assertEquals(3, token8.getTokenType());
      
      Token token9 = xPathLexer0.star();
      assertEquals(20, token9.getTokenType());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9477220470692663
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(".5v,>r3jv#JWR_~");
      Token token0 = xPathLexer0.at();
      assertEquals(".", token0.getTokenText());
      assertEquals(16, token0.getTokenType());
      
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertEquals("5v", token1.getTokenText());
      
      xPathLexer0.mod();
      Token token2 = xPathLexer0.not();
      assertEquals(23, token2.getTokenType());
      assertEquals(",", token2.getTokenText());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals(">", token3.getTokenText());
      
      xPathLexer0.literal();
      Token token4 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token4.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('D');
      assertTrue(boolean0);
      
      xPathLexer0.mod();
      Token token5 = xPathLexer0.nextToken();
      assertEquals("", token5.getTokenText());
      assertEquals((-1), token5.getTokenType());
      
      xPathLexer0.mod();
      Token token6 = xPathLexer0.leftParen();
      assertEquals(1, token6.getTokenType());
      
      Token token7 = xPathLexer0.whitespace();
      assertEquals((-2), token7.getTokenType());
      
      boolean boolean1 = xPathLexer0.isIdentifierStartChar('{');
      assertFalse(boolean1);
      
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2586653101771799
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("-FSeWb_F");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.leftParen();
      xPathLexer0.dots();
      xPathLexer0.equals();
      xPathLexer0.number();
      xPathLexer0.nextToken();
      xPathLexer0.currentPosition();
      xPathLexer0.plus();
      xPathLexer0.currentPosition();
      xPathLexer0.plus();
      xPathLexer0.LA(12);
      xPathLexer0.whitespace();
      xPathLexer0.minus();
      xPathLexer0.dollar();
      xPathLexer0.consume(0);
      xPathLexer0.consume();
      assertEquals("-FSeWb_F", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.269639374604125
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("VpW#q{xICBu0N");
      xPathLexer0.operatorName();
      xPathLexer0.and();
      Token token0 = xPathLexer0.whitespace();
      assertEquals("", token0.getTokenText());
      assertEquals((-2), token0.getTokenType());
      
      Token token1 = xPathLexer0.comma();
      assertEquals(32, token1.getTokenType());
      assertEquals("p", token1.getTokenText());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0947487470925763
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      XPathLexer xPathLexer1 = new XPathLexer("");
      Token token0 = xPathLexer0.comma();
      assertEquals(32, token0.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      Token token1 = xPathLexer1.rightParen();
      assertEquals(2, token1.getTokenType());
      
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      xPathLexer0.getXPath();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals(4, token2.getTokenType());
      assertEquals("c", token2.getTokenText());
      
      xPathLexer0.or();
      xPathLexer1.setXPath("com.werken.saxpath.XPathLexer");
      Token token3 = xPathLexer0.literal();
      assertNull(token3);
      
      xPathLexer1.endPosition();
      Token token4 = xPathLexer1.nextToken();
      assertEquals("com.werken.saxpath.XPathLexer", token4.getTokenText());
      assertEquals(15, token4.getTokenType());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1738943919627869
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.rightBracket();
      token0.toString();
      token0.toString();
      xPathLexer0.pipe();
      xPathLexer0.nextToken();
      token0.toString();
      xPathLexer0.literal();
      token0.toString();
      xPathLexer0.literal();
      xPathLexer0.literal();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.slashes();
      xPathLexer0.not();
      xPathLexer0.mod();
      token0.toString();
      xPathLexer0.comma();
      xPathLexer0.rightParen();
      xPathLexer0.consume((-2179));
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.notEquals();
      xPathLexer0.leftParen();
      xPathLexer0.consume();
      // Undeclared exception!
      try { 
        xPathLexer0.identifier();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2310974316923535
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      Token token0 = xPathLexer0.rightBracket();
      token0.toString();
      token0.toString();
      Token token1 = xPathLexer0.nextToken();
      assertEquals("om.werken.saxpath.XPathLexer", token1.getTokenText());
      assertEquals(15, token1.getTokenType());
      
      String string0 = token0.toString();
      assertEquals("[ (4) (c)", string0);
      
      xPathLexer0.literal();
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
      
      xPathLexer0.slashes();
      Token token3 = xPathLexer0.slashes();
      assertEquals(11, token3.getTokenType());
      
      Token token4 = xPathLexer0.pipe();
      assertEquals(17, token4.getTokenType());
      
      xPathLexer0.number();
      xPathLexer0.isIdentifierChar('P');
      xPathLexer0.comma();
      xPathLexer0.colon();
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.mod();
      Token token6 = xPathLexer0.plus();
      assertEquals(5, token6.getTokenType());
      
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.mod();
      Token token7 = xPathLexer1.number();
      assertEquals(30, token7.getTokenType());
      
      xPathLexer0.dots();
      Token token8 = xPathLexer0.minus();
      assertEquals(6, token8.getTokenType());
      
      Token token9 = xPathLexer1.colon();
      assertEquals(18, token9.getTokenType());
      
      XPathLexer xPathLexer2 = new XPathLexer("[ (");
      Token token10 = xPathLexer2.dots();
      assertEquals(13, token10.getTokenType());
      assertEquals("[", token10.getTokenText());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.992196960885483
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      XPathLexer xPathLexer1 = new XPathLexer("");
      xPathLexer0.comma();
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      xPathLexer1.rightParen();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      xPathLexer0.getXPath();
      xPathLexer0.rightBracket();
      xPathLexer0.or();
      xPathLexer0.leftBracket();
      xPathLexer0.number();
      xPathLexer0.dots();
      xPathLexer0.minus();
      xPathLexer0.star();
      xPathLexer0.colon();
      xPathLexer1.dots();
      Token token0 = xPathLexer0.mod();
      assertNull(token0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5291543137342514
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("VpW#q{xICBu0N");
      xPathLexer0.setXPath("k(-Fa\"O0^@5UmL[");
      XPathLexer xPathLexer1 = new XPathLexer("VpW#q{xICBu0N");
      xPathLexer1.identifierOrOperatorName();
      Token token0 = xPathLexer1.doubleColon();
      assertEquals(19, token0.getTokenType());
      assertEquals("#q", token0.getTokenText());
      
      Token token1 = xPathLexer0.at();
      assertEquals(16, token1.getTokenType());
      assertEquals("k", token1.getTokenText());
      
      Token token2 = xPathLexer1.pipe();
      assertEquals("{", token2.getTokenText());
      assertEquals(17, token2.getTokenType());
      
      Token token3 = xPathLexer1.number();
      assertEquals(30, token3.getTokenType());
      assertEquals("", token3.getTokenText());
      
      xPathLexer0.isIdentifierChar('^');
      Token token4 = xPathLexer0.comma();
      assertEquals("(", token4.getTokenText());
      assertEquals(32, token4.getTokenType());
      
      Token token5 = xPathLexer1.colon();
      assertEquals(18, token5.getTokenType());
      assertEquals("x", token5.getTokenText());
      
      XPathLexer xPathLexer2 = new XPathLexer();
      Token token6 = xPathLexer2.dollar();
      assertEquals(26, token6.getTokenType());
      
      xPathLexer2.div();
      xPathLexer0.mod();
      Token token7 = xPathLexer0.plus();
      assertEquals("-", token7.getTokenText());
      assertEquals(5, token7.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.setXPath("k(-Fa\"O0^@5UmL[");
      xPathLexer2.literal();
      xPathLexer2.endPosition();
      Token token8 = xPathLexer1.nextToken();
      assertEquals("ICBu0N", token8.getTokenText());
      assertEquals(15, token8.getTokenType());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.260440011160755
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("Y?u{{Tor^X5U");
      Token token0 = xPathLexer0.slashes();
      assertEquals("Y", token0.getTokenText());
      
      xPathLexer0.operatorName();
      xPathLexer0.slashes();
      Token token1 = xPathLexer0.colon();
      assertEquals("u", token1.getTokenText());
      assertEquals(18, token1.getTokenType());
      
      Token token2 = xPathLexer0.rightParen();
      assertEquals(2, token2.getTokenType());
      assertEquals("{", token2.getTokenText());
      
      Token token3 = xPathLexer0.dots();
      assertEquals(13, token3.getTokenType());
      assertEquals("{", token3.getTokenText());
      
      xPathLexer0.doubleColon();
      Token token4 = xPathLexer0.doubleColon();
      assertEquals("r^", token4.getTokenText());
      assertEquals(19, token4.getTokenType());
      
      Token token5 = xPathLexer0.minus();
      assertEquals("X", token5.getTokenText());
      assertEquals(6, token5.getTokenType());
      
      Token token6 = xPathLexer0.slashes();
      assertEquals(11, token6.getTokenType());
      
      xPathLexer0.and();
      xPathLexer0.div();
      Token token7 = xPathLexer0.nextToken();
      assertEquals(15, token7.getTokenType());
      assertEquals("U", token7.getTokenText());
      
      xPathLexer0.nextToken();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('1');
      assertFalse(boolean0);
  }
}
