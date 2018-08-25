/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:29:04 GMT 2018
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
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      
      xPathLexer0.literal();
      xPathLexer0.consume();
      xPathLexer0.and();
      xPathLexer0.and();
      xPathLexer0.div();
      int int0 = xPathLexer0.currentPosition();
      assertEquals(4, int0);
      
      Token token2 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token2);
      assertEquals(15, token2.getTokenType());
      
      Token token3 = xPathLexer0.star();
      assertEquals(20, token3.getTokenType());
      
      Token token4 = xPathLexer0.rightParen();
      assertEquals(2, token4.getTokenType());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.dots();
      xPathLexer0.rightBracket();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.mod();
      xPathLexer0.dots();
      xPathLexer0.consume(0);
      xPathLexer0.and();
      xPathLexer0.equals();
      xPathLexer0.currentPosition();
      xPathLexer0.consume();
      xPathLexer0.setXPath("");
      xPathLexer0.setPreviousToken((Token) null);
      xPathLexer0.setXPath("");
      xPathLexer0.div();
      xPathLexer0.getPreviousToken();
      xPathLexer0.notEquals();
      xPathLexer0.literal();
      xPathLexer0.hasMoreChars();
      xPathLexer0.notEquals();
      xPathLexer0.consume((-1011));
      xPathLexer0.setPreviousToken((Token) null);
      // Undeclared exception!
      try { 
        xPathLexer0.identifier();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.leftBracket();
      xPathLexer0.slashes();
      xPathLexer0.or();
      xPathLexer0.literal();
      xPathLexer0.or();
      Token token0 = xPathLexer0.slashes();
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.literal();
      xPathLexer0.leftBracket();
      xPathLexer0.plus();
      xPathLexer0.comma();
      xPathLexer0.or();
      xPathLexer0.comma();
      xPathLexer0.literal();
      xPathLexer0.operatorName();
      xPathLexer0.literal();
      xPathLexer0.plus();
      xPathLexer0.getPreviousToken();
      xPathLexer0.equals();
      xPathLexer0.hasMoreChars();
      xPathLexer0.consume();
      assertNull(xPathLexer0.getXPath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.and();
      xPathLexer0.mod();
      xPathLexer0.colon();
      xPathLexer0.whitespace();
      xPathLexer0.mod();
      xPathLexer0.nextToken();
      Token token0 = xPathLexer0.whitespace();
      xPathLexer0.setXPath("[ (");
      xPathLexer0.dollar();
      xPathLexer0.rightParen();
      xPathLexer0.notEquals();
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
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.and();
      xPathLexer0.and();
      Token token0 = xPathLexer0.at();
      assertEquals(16, token0.getTokenType());
      
      xPathLexer0.setXPath("");
      Token token1 = xPathLexer0.literal();
      assertNull(token1);
      
      xPathLexer0.not();
      xPathLexer0.pipe();
      xPathLexer0.rightBracket();
      Token token2 = xPathLexer0.pipe();
      assertEquals(17, token2.getTokenType());
      
      Token token3 = xPathLexer0.not();
      assertEquals(23, token3.getTokenType());
      
      xPathLexer0.rightBracket();
      Token token4 = xPathLexer0.minus();
      assertEquals(6, token4.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.hasMoreChars();
      Token token5 = xPathLexer0.rightBracket();
      assertEquals(4, token5.getTokenType());
      
      Token token6 = xPathLexer0.star();
      assertEquals(20, token6.getTokenType());
      
      Token token7 = xPathLexer0.number();
      assertEquals(30, token7.getTokenType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.colon();
      Token token0 = xPathLexer0.doubleColon();
      assertEquals(19, token0.getTokenType());
      
      Token token1 = xPathLexer0.minus();
      assertEquals(6, token1.getTokenType());
      
      xPathLexer0.star();
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('*');
      xPathLexer0.leftParen();
      Token token3 = xPathLexer0.whitespace();
      assertEquals((-2), token3.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.setXPath("");
      xPathLexer0.colon();
      xPathLexer0.and();
      xPathLexer0.operatorName();
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.leftParen();
      assertEquals(1, token5.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('C');
      xPathLexer0.and();
      Token token6 = xPathLexer0.rightBracket();
      assertEquals(4, token6.getTokenType());
      
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
      
      xPathLexer0.star();
      Token token8 = xPathLexer0.plus();
      assertEquals(5, token8.getTokenType());
      
      Token token9 = xPathLexer0.star();
      assertEquals(20, token9.getTokenType());
      
      Token token10 = xPathLexer0.identifierOrOperatorName();
      assertNull(token10);
      
      xPathLexer0.setPreviousToken((Token) null);
      Token token11 = xPathLexer0.notEquals();
      assertEquals(22, token11.getTokenType());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1276178314119045
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.consume();
      xPathLexer0.currentPosition();
      xPathLexer0.dots();
      xPathLexer0.pipe();
      xPathLexer0.operatorName();
      xPathLexer0.plus();
      xPathLexer0.colon();
      xPathLexer0.identifier();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.dollar();
      xPathLexer0.div();
      xPathLexer0.leftBracket();
      xPathLexer0.rightBracket();
      xPathLexer0.identifier();
      xPathLexer0.plus();
      xPathLexer0.notEquals();
      xPathLexer0.operatorName();
      xPathLexer0.isIdentifierChar('g');
      xPathLexer0.literal();
      xPathLexer0.getPreviousToken();
      xPathLexer0.consume(1);
      xPathLexer0.endPosition();
      xPathLexer0.or();
      xPathLexer0.star();
      Token token0 = xPathLexer0.plus();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.61154219618606
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      xPathLexer0.whitespace();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      xPathLexer0.doubleColon();
      xPathLexer0.colon();
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.nextToken();
      xPathLexer0.getPreviousToken();
      xPathLexer0.rightParen();
      xPathLexer0.dollar();
      xPathLexer0.equals();
      xPathLexer0.colon();
      xPathLexer0.number();
      xPathLexer0.consume();
      xPathLexer0.getXPath();
      xPathLexer0.doubleColon();
      xPathLexer0.number();
      xPathLexer0.getXPath();
      xPathLexer0.not();
      xPathLexer0.currentPosition();
      xPathLexer0.operatorName();
      xPathLexer0.leftParen();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.430033549774761
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.setXPath("");
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.endPosition();
      xPathLexer0.or();
      xPathLexer0.notEquals();
      xPathLexer0.number();
      xPathLexer0.dots();
      xPathLexer0.not();
      xPathLexer0.operatorName();
      xPathLexer0.setXPath("");
      xPathLexer0.plus();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      xPathLexer0.pipe();
      xPathLexer0.doubleColon();
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.minus();
      xPathLexer0.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer0.equals();
      xPathLexer0.star();
      xPathLexer0.rightParen();
      xPathLexer0.div();
      xPathLexer0.consume(0);
      assertEquals("$dEi-Nad#13", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4762471329830333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(") (");
      Token token0 = xPathLexer0.literal();
      assertNull(token0);
      
      Token token1 = xPathLexer0.not();
      assertEquals(23, token1.getTokenType());
      
      Token token2 = xPathLexer0.rightParen();
      assertEquals(2, token2.getTokenType());
      
      Token token3 = xPathLexer0.plus();
      assertEquals(5, token3.getTokenType());
      
      char char0 = xPathLexer0.LA(0);
      assertEquals('\uFFFF', char0);
      
      Token token4 = xPathLexer0.leftBracket();
      assertEquals(3, token4.getTokenType());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.2078470607099763
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      xPathLexer0.whitespace();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      xPathLexer0.doubleColon();
      xPathLexer0.colon();
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.nextToken();
      xPathLexer0.getPreviousToken();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      xPathLexer0.pipe();
      xPathLexer0.doubleColon();
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.minus();
      xPathLexer0.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer0.equals();
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.star();
      xPathLexer0.rightParen();
      xPathLexer1.div();
      xPathLexer0.consume(0);
      assertEquals("$dEi-Nad#13", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0889125915539863
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.comma();
      xPathLexer0.rightBracket();
      xPathLexer0.notEquals();
      xPathLexer0.div();
      xPathLexer0.getPreviousToken();
      xPathLexer0.setXPath("com.werken.saxpath.XPathLexer");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.minus();
      xPathLexer0.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer0.equals();
      xPathLexer0.rightParen();
      xPathLexer0.div();
      xPathLexer0.consume((-4208));
      assertEquals("com.werken.saxpath.XPathLexer", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.2032816648447078
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "G+R-R7H&%}%";
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      xPathLexer0.whitespace();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      xPathLexer0.doubleColon();
      xPathLexer0.colon();
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      xPathLexer0.leftBracket();
      xPathLexer0.at();
      xPathLexer0.slashes();
      xPathLexer0.star();
      XPathLexer xPathLexer1 = new XPathLexer("'u\"pk; ");
      xPathLexer1.mod();
      xPathLexer0.currentPosition();
      xPathLexer0.dots();
      XPathLexer xPathLexer2 = null;
      try {
        xPathLexer2 = new XPathLexer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.werken.saxpath.XPathLexer", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0734030315511203
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.setXPath("");
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      
      Token token1 = xPathLexer0.dots();
      assertEquals(13, token1.getTokenType());
      
      Token token2 = xPathLexer0.not();
      assertEquals(23, token2.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.setXPath("");
      Token token3 = xPathLexer0.plus();
      assertEquals(5, token3.getTokenType());
      
      xPathLexer0.rightParen();
      Token token4 = xPathLexer0.equals();
      assertEquals(21, token4.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      Token token5 = xPathLexer0.pipe();
      assertEquals(17, token5.getTokenType());
      
      Token token6 = xPathLexer0.doubleColon();
      assertEquals(19, token6.getTokenType());
      
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      Token token7 = xPathLexer0.minus();
      assertEquals(6, token7.getTokenType());
      
      Token token8 = xPathLexer0.nextToken();
      assertEquals(15, token8.getTokenType());
      assertEquals("dEi-Nad", token8.getTokenText());
      
      Token token9 = xPathLexer0.leftBracket();
      assertEquals("#", token9.getTokenText());
      
      Token token10 = xPathLexer0.star();
      assertEquals("1", token10.getTokenText());
      assertEquals(20, token10.getTokenType());
      
      Token token11 = xPathLexer0.rightParen();
      assertEquals("3", token11.getTokenText());
      assertEquals(2, token11.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.nextToken();
      Token token12 = xPathLexer0.whitespace();
      assertEquals((-2), token12.getTokenType());
      assertEquals("", token12.getTokenText());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.481865383937763
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.setXPath("");
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.number();
      xPathLexer0.dots();
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.setXPath("");
      Token token1 = xPathLexer0.plus();
      assertEquals(5, token1.getTokenType());
      
      Token token2 = xPathLexer0.dots();
      assertEquals(13, token2.getTokenType());
      
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      Token token4 = xPathLexer0.pipe();
      assertEquals(17, token4.getTokenType());
      
      Token token5 = xPathLexer0.doubleColon();
      assertEquals(19, token5.getTokenType());
      
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      Token token6 = xPathLexer0.minus();
      assertEquals("$", token6.getTokenText());
      assertEquals(6, token6.getTokenType());
      
      Token token7 = xPathLexer0.nextToken();
      assertEquals(15, token7.getTokenType());
      
      xPathLexer0.mod();
      Token token8 = xPathLexer0.star();
      assertEquals(20, token8.getTokenType());
      
      Token token9 = xPathLexer0.rightParen();
      assertEquals(2, token9.getTokenType());
      
      xPathLexer0.div();
      Token token10 = xPathLexer0.nextToken();
      assertEquals(30, token10.getTokenType());
      
      Token token11 = xPathLexer0.whitespace();
      assertEquals((-2), token11.getTokenType());
      assertEquals("", token11.getTokenText());
      
      Token token12 = xPathLexer0.slashes();
      assertEquals(11, token12.getTokenType());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.27443373122331
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      Token token1 = xPathLexer0.doubleColon();
      assertEquals("+R", token1.getTokenText());
      
      Token token2 = xPathLexer0.colon();
      assertEquals("-", token2.getTokenText());
      assertEquals(18, token2.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      Token token3 = xPathLexer0.nextToken();
      assertEquals("7", token3.getTokenText());
      assertEquals(30, token3.getTokenType());
      
      xPathLexer0.identifier();
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      Token token4 = xPathLexer0.leftBracket();
      assertEquals("&", token4.getTokenText());
      assertEquals(3, token4.getTokenType());
      
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      assertEquals("%", token5.getTokenText());
      
      Token token6 = xPathLexer0.slashes();
      assertEquals(11, token6.getTokenType());
      assertEquals("}", token6.getTokenText());
      
      Token token7 = xPathLexer0.star();
      assertEquals(20, token7.getTokenType());
      assertEquals("%", token7.getTokenText());
      
      XPathLexer xPathLexer1 = new XPathLexer("'u\"pk; ");
      xPathLexer0.consume();
      xPathLexer1.mod();
      xPathLexer0.currentPosition();
      xPathLexer0.setXPath("'u\"pk; ");
      xPathLexer1.getXPath();
      Token token8 = xPathLexer0.identifier();
      assertEquals(15, token8.getTokenType());
      
      Token token9 = xPathLexer0.equals();
      assertEquals("'", token9.getTokenText());
      assertEquals(21, token9.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.and();
      XPathLexer xPathLexer2 = new XPathLexer("u$:ek<R]QVxuZS?E");
      Token token10 = xPathLexer2.rightBracket();
      assertEquals("u", token10.getTokenText());
      assertEquals(4, token10.getTokenType());
      
      Token token11 = xPathLexer2.rightParen();
      assertEquals(2, token11.getTokenType());
      assertEquals("$", token11.getTokenText());
      
      xPathLexer0.or();
      Token token12 = xPathLexer0.nextToken();
      assertEquals("u\"pk; ", token12.getTokenText());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0780145677474744
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.equals();
      xPathLexer0.notEquals();
      xPathLexer0.pipe();
      xPathLexer0.rightParen();
      xPathLexer0.comma();
      xPathLexer0.leftBracket();
      xPathLexer0.minus();
      xPathLexer0.slashes();
      xPathLexer0.dots();
      XPathLexer xPathLexer1 = new XPathLexer("Ro=9Y1XI");
      xPathLexer0.dots();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.pipe();
      xPathLexer2.mod();
      XPathLexer xPathLexer3 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer3.hasMoreChars();
      xPathLexer3.equals();
      XPathLexer xPathLexer4 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.not();
      xPathLexer3.rightBracket();
      xPathLexer4.currentPosition();
      xPathLexer1.at();
      xPathLexer4.currentPosition();
      xPathLexer0.comma();
      Token token0 = xPathLexer3.relationalOperator();
      assertNull(token0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5700402690601596
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.setXPath("");
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.at();
      xPathLexer0.dots();
      xPathLexer0.not();
      xPathLexer0.operatorName();
      xPathLexer0.setXPath("");
      xPathLexer0.plus();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      xPathLexer0.pipe();
      xPathLexer0.doubleColon();
      xPathLexer0.minus();
      XPathLexer xPathLexer1 = new XPathLexer("SB31`");
      xPathLexer1.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer1.equals();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer1.star();
      xPathLexer1.rightParen();
      xPathLexer0.div();
      xPathLexer0.consume(0);
      assertFalse(xPathLexer0.equals((Object)xPathLexer2));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.070920058400696
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      xPathLexer0.whitespace();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      Token token0 = xPathLexer0.doubleColon();
      assertEquals("+R", token0.getTokenText());
      
      Token token1 = xPathLexer0.colon();
      assertEquals(18, token1.getTokenType());
      assertEquals("-", token1.getTokenText());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.rightParen();
      xPathLexer0.nextToken();
      xPathLexer0.getPreviousToken();
      xPathLexer0.rightParen();
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      assertEquals("&", token2.getTokenText());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      Token token3 = xPathLexer0.pipe();
      assertEquals(17, token3.getTokenType());
      assertEquals("%", token3.getTokenText());
      
      Token token4 = xPathLexer0.doubleColon();
      assertEquals(19, token4.getTokenType());
      
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.setXPath("G+R-R7H&%}%");
      xPathLexer0.identifierOrOperatorName();
      Token token5 = xPathLexer0.minus();
      assertEquals("G", token5.getTokenText());
      assertEquals(6, token5.getTokenType());
      
      Token token6 = xPathLexer0.nextToken();
      assertEquals("+", token6.getTokenText());
      assertEquals(5, token6.getTokenType());
      
      Token token7 = xPathLexer0.leftBracket();
      assertEquals(3, token7.getTokenType());
      
      Token token8 = xPathLexer0.star();
      assertEquals("-", token8.getTokenText());
      assertEquals(20, token8.getTokenType());
      
      Token token9 = xPathLexer0.rightParen();
      assertEquals("R", token9.getTokenText());
      assertEquals(2, token9.getTokenType());
      
      xPathLexer0.div();
      Token token10 = xPathLexer0.nextToken();
      assertEquals("7", token10.getTokenText());
      assertEquals(30, token10.getTokenType());
      
      Token token11 = xPathLexer0.whitespace();
      assertEquals((-2), token11.getTokenType());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.467698644348231
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("G+R-R7H&%}%");
      xPathLexer0.whitespace();
      xPathLexer0.number();
      xPathLexer0.operatorName();
      xPathLexer0.or();
      xPathLexer0.doubleColon();
      xPathLexer0.colon();
      xPathLexer0.relationalOperator();
      xPathLexer0.setXPath("G+R-R7H&%}%");
      xPathLexer0.rightParen();
      xPathLexer0.nextToken();
      xPathLexer0.getPreviousToken();
      xPathLexer0.rightParen();
      xPathLexer0.equals();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.pipe();
      xPathLexer0.pipe();
      xPathLexer0.doubleColon();
      xPathLexer0.setXPath("$dEi-Nad#13");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.minus();
      xPathLexer0.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer0.equals();
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.star();
      xPathLexer0.rightParen();
      xPathLexer1.div();
      xPathLexer0.consume(0);
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }
}
