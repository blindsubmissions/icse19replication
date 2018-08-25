/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:19:05 GMT 2018
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
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.colon();
      Token token0 = xPathLexer0.doubleColon();
      assertEquals(19, token0.getTokenType());
      
      Token token1 = xPathLexer0.rightParen();
      assertEquals(2, token1.getTokenType());
      
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
      
      xPathLexer0.relationalOperator();
      Token token3 = xPathLexer0.nextToken();
      assertEquals((-1), token3.getTokenType());
      
      xPathLexer0.rightBracket();
      xPathLexer0.and();
      Token token4 = xPathLexer0.identifier();
      assertEquals(15, token4.getTokenType());
      
      xPathLexer0.plus();
      xPathLexer0.and();
      xPathLexer0.consume(114);
      xPathLexer0.minus();
      Token token5 = xPathLexer0.minus();
      assertEquals(6, token5.getTokenType());
      
      xPathLexer0.or();
      Token token6 = xPathLexer0.leftBracket();
      assertEquals(3, token6.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.and();
      xPathLexer0.plus();
      Token token7 = xPathLexer0.colon();
      assertEquals(18, token7.getTokenType());
      
      xPathLexer0.setXPath("&&>TS<H*[w231");
      xPathLexer0.operatorName();
      xPathLexer0.currentPosition();
      Token token8 = xPathLexer0.notEquals();
      assertEquals(22, token8.getTokenType());
      assertEquals("&&", token8.getTokenText());
      
      Token token9 = xPathLexer0.plus();
      assertEquals(5, token9.getTokenType());
      assertEquals(">", token9.getTokenText());
      
      Token token10 = xPathLexer0.rightBracket();
      assertEquals(4, token10.getTokenType());
      assertEquals("T", token10.getTokenText());
      
      char char0 = xPathLexer0.LA(28);
      assertEquals('\uFFFF', char0);
      
      int int0 = xPathLexer0.currentPosition();
      assertEquals(4, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("De8");
      Token token0 = xPathLexer0.leftBracket();
      assertEquals(3, token0.getTokenType());
      assertEquals("D", token0.getTokenText());
      
      Token token1 = xPathLexer0.dollar();
      assertEquals(26, token1.getTokenType());
      assertEquals("e", token1.getTokenText());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.minus();
      xPathLexer0.setXPath("");
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.equals();
      xPathLexer0.literal();
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      xPathLexer0.at();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      
      xPathLexer0.leftBracket();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      char char0 = xPathLexer0.LA(1183);
      assertEquals('\uFFFF', char0);
      
      xPathLexer0.identifier();
      xPathLexer0.mod();
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
      
      xPathLexer0.mod();
      Token token3 = xPathLexer0.equals();
      assertEquals(21, token3.getTokenType());
      
      xPathLexer0.hasMoreChars();
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      
      Token token6 = xPathLexer0.identifier();
      assertEquals(15, token6.getTokenType());
      
      Token token7 = xPathLexer0.notEquals();
      assertEquals(22, token7.getTokenType());
      
      Token token8 = xPathLexer0.whitespace();
      assertEquals((-2), token8.getTokenType());
      
      Token token9 = xPathLexer0.doubleColon();
      assertEquals(19, token9.getTokenType());
      
      Token token10 = xPathLexer0.plus();
      assertEquals(5, token10.getTokenType());
      
      Token token11 = xPathLexer0.minus();
      assertEquals(6, token11.getTokenType());
      
      Token token12 = xPathLexer0.not();
      assertEquals(23, token12.getTokenType());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.getXPath();
      Token token0 = xPathLexer0.leftParen();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.comma();
      xPathLexer0.plus();
      xPathLexer0.consume(0);
      xPathLexer0.notEquals();
      xPathLexer0.plus();
      xPathLexer0.and();
      xPathLexer0.colon();
      xPathLexer0.pipe();
      xPathLexer0.number();
      xPathLexer0.rightBracket();
      xPathLexer0.slashes();
      xPathLexer0.at();
      xPathLexer0.dots();
      xPathLexer0.leftBracket();
      xPathLexer0.slashes();
      xPathLexer0.LA(0);
      xPathLexer0.minus();
      xPathLexer0.hasMoreChars();
      xPathLexer0.identifier();
      xPathLexer0.rightBracket();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume((-871));
      // Undeclared exception!
      try { 
        xPathLexer0.slashes();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("@");
      xPathLexer0.setXPath("@");
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      xPathLexer0.equals();
      xPathLexer0.notEquals();
      xPathLexer0.equals();
      Token token1 = xPathLexer0.equals();
      assertEquals(21, token1.getTokenType());
      
      Token token2 = xPathLexer0.literal();
      assertNull(token2);
      
      Token token3 = xPathLexer0.identifier();
      assertEquals(15, token3.getTokenType());
      
      Token token4 = xPathLexer0.notEquals();
      assertEquals(22, token4.getTokenType());
      
      xPathLexer0.getPreviousToken();
      xPathLexer0.leftBracket();
      Token token5 = xPathLexer0.doubleColon();
      assertEquals(19, token5.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('@');
      assertFalse(boolean0);
      
      xPathLexer0.operatorName();
      xPathLexer0.and();
      xPathLexer0.or();
      Token token6 = xPathLexer0.leftBracket();
      assertEquals(3, token6.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token7 = xPathLexer0.star();
      assertEquals(20, token7.getTokenType());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.2444926304072963
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("ArbM?PVYtdH");
      xPathLexer0.doubleColon();
      xPathLexer0.and();
      xPathLexer0.or();
      xPathLexer0.currentPosition();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.leftParen();
      xPathLexer0.star();
      xPathLexer0.not();
      xPathLexer0.or();
      xPathLexer0.mod();
      xPathLexer0.div();
      xPathLexer0.getPreviousToken();
      xPathLexer0.plus();
      xPathLexer0.dollar();
      xPathLexer0.getPreviousToken();
      xPathLexer0.pipe();
      xPathLexer0.plus();
      xPathLexer0.notEquals();
      xPathLexer0.dollar();
      xPathLexer0.whitespace();
      xPathLexer0.comma();
      Token token0 = xPathLexer0.div();
      assertNull(token0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.898593519412333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(") (");
      xPathLexer0.whitespace();
      xPathLexer0.whitespace();
      xPathLexer0.operatorName();
      xPathLexer0.literal();
      xPathLexer0.number();
      xPathLexer0.currentPosition();
      xPathLexer0.leftBracket();
      xPathLexer0.number();
      xPathLexer0.div();
      xPathLexer0.equals();
      xPathLexer0.rightParen();
      xPathLexer0.star();
      xPathLexer0.leftParen();
      xPathLexer0.or();
      xPathLexer0.literal();
      xPathLexer0.pipe();
      xPathLexer0.consume();
      xPathLexer0.getXPath();
      xPathLexer0.notEquals();
      xPathLexer0.notEquals();
      xPathLexer0.or();
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1601441207718242
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("dyh$z^{");
      xPathLexer0.operatorName();
      xPathLexer0.consume(0);
      Token token0 = xPathLexer0.comma();
      assertEquals("d", token0.getTokenText());
      
      Token token1 = xPathLexer0.nextToken();
      assertEquals("yh", token1.getTokenText());
      
      xPathLexer0.whitespace();
      xPathLexer0.minus();
      Token token2 = xPathLexer0.rightParen();
      assertEquals("^", token2.getTokenText());
      
      xPathLexer0.or();
      Token token3 = xPathLexer0.minus();
      assertEquals("{", token3.getTokenText());
      assertEquals(6, token3.getTokenType());
      
      Token token4 = xPathLexer0.number();
      assertEquals(30, token4.getTokenType());
      
      Token token5 = xPathLexer0.rightParen();
      assertEquals(2, token5.getTokenType());
      
      Token token6 = xPathLexer0.whitespace();
      assertEquals("", token6.getTokenText());
      
      xPathLexer0.comma();
      xPathLexer0.star();
      Token token7 = xPathLexer0.dots();
      assertEquals(13, token7.getTokenType());
      
      xPathLexer0.comma();
      xPathLexer0.comma();
      xPathLexer0.and();
      Token token8 = xPathLexer0.colon();
      assertEquals(18, token8.getTokenType());
      
      xPathLexer0.identifier();
      Token token9 = xPathLexer0.comma();
      assertEquals(32, token9.getTokenType());
      
      xPathLexer0.setXPath("dyh$z^{");
      Token token10 = xPathLexer0.getPreviousToken();
      assertEquals(15, token10.getTokenType());
      
      xPathLexer0.consume(13);
      xPathLexer0.mod();
      xPathLexer0.getXPath();
      int int0 = xPathLexer0.endPosition();
      assertEquals(7, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1923442617640683
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      Token token0 = xPathLexer0.whitespace();
      xPathLexer0.plus();
      Token token1 = xPathLexer0.rightBracket();
      assertEquals(4, token1.getTokenType());
      
      token0.toString();
      token0.toString();
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      
      token0.toString();
      token0.toString();
      token0.toString();
      token0.toString();
      Token token3 = xPathLexer0.not();
      assertEquals(23, token3.getTokenType());
      
      token0.toString();
      xPathLexer0.operatorName();
      xPathLexer0.nextToken();
      Token token4 = xPathLexer0.comma();
      assertEquals(32, token4.getTokenType());
      
      Token token5 = xPathLexer0.plus();
      assertEquals(5, token5.getTokenType());
      
      token0.toString();
      token0.toString();
      xPathLexer0.consume(60);
      String string0 = token0.toString();
      assertEquals("[ (-2) ()", string0);
      
      Token token6 = xPathLexer0.identifierOrOperatorName();
      assertNull(token6);
      
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      Token token7 = xPathLexer0.star();
      assertEquals(20, token7.getTokenType());
      
      xPathLexer0.doubleColon();
      xPathLexer0.div();
      xPathLexer0.div();
      Token token8 = xPathLexer0.doubleColon();
      assertEquals(19, token8.getTokenType());
      
      xPathLexer0.getXPath();
      xPathLexer0.nextToken();
      xPathLexer0.leftParen();
      Token token9 = xPathLexer0.leftBracket();
      assertEquals(3, token9.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('$');
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6791705495852782
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("):[E&,z/GmA");
      xPathLexer0.setPreviousToken((Token) null);
      Token token0 = xPathLexer0.leftBracket();
      assertEquals(3, token0.getTokenType());
      assertEquals(")", token0.getTokenText());
      
      Token token1 = xPathLexer0.plus();
      assertEquals(5, token1.getTokenType());
      assertEquals(":", token1.getTokenText());
      
      xPathLexer0.div();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      Token token2 = xPathLexer0.dots();
      assertEquals("E", token2.getTokenText());
      assertEquals(13, token2.getTokenType());
      
      Token token3 = xPathLexer0.nextToken();
      assertEquals("&,z/GmA", token3.getTokenText());
      
      Token token4 = xPathLexer0.identifier();
      assertEquals(15, token4.getTokenType());
      assertEquals("", token4.getTokenText());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3034884952192693
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.Token");
      xPathLexer0.identifier();
      xPathLexer0.minus();
      // Undeclared exception!
      try { 
        xPathLexer0.LA((-1233));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4468305753840016
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.identifier();
      xPathLexer0.relationalOperator();
      Token token0 = xPathLexer0.not();
      assertEquals(23, token0.getTokenType());
      
      xPathLexer0.setXPath("BL)Bjg@R~7ZE|Cg*");
      Token token1 = xPathLexer0.nextToken();
      assertEquals(15, token1.getTokenType());
      assertEquals("BL", token1.getTokenText());
      
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      Token token3 = xPathLexer0.pipe();
      assertEquals(")", token3.getTokenText());
      assertEquals(17, token3.getTokenType());
      
      Token token4 = xPathLexer0.literal();
      assertNull(token4);
      
      xPathLexer0.relationalOperator();
      xPathLexer0.and();
      Token token5 = xPathLexer0.slashes();
      assertEquals(11, token5.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      Token token6 = xPathLexer0.whitespace();
      assertEquals((-2), token6.getTokenType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0409063501538456
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(") (");
      xPathLexer0.whitespace();
      Token token0 = xPathLexer0.whitespace();
      assertEquals((-2), token0.getTokenType());
      
      xPathLexer0.operatorName();
      xPathLexer0.literal();
      Token token1 = xPathLexer0.number();
      assertEquals(30, token1.getTokenType());
      
      int int0 = xPathLexer0.currentPosition();
      assertEquals(4, int0);
      
      Token token2 = xPathLexer0.leftBracket();
      assertEquals(3, token2.getTokenType());
      
      Token token3 = xPathLexer0.plus();
      assertEquals(5, token3.getTokenType());
      
      xPathLexer0.div();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      XPathLexer xPathLexer1 = new XPathLexer("'py'*h");
      Token token4 = xPathLexer1.dots();
      assertEquals(13, token4.getTokenType());
      assertEquals("'", token4.getTokenText());
      
      Token token5 = xPathLexer1.nextToken();
      assertEquals("py", token5.getTokenText());
      
      Token token6 = xPathLexer0.identifier();
      assertEquals(15, token6.getTokenType());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.6598199830493976
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("]VN-jW`#-nle");
      xPathLexer0.whitespace();
      XPathLexer xPathLexer1 = new XPathLexer("]VN-jW`#-nle");
      Token token0 = xPathLexer1.minus();
      assertEquals("]", token0.getTokenText());
      
      xPathLexer0.rightParen();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.or();
      Token token1 = xPathLexer1.minus();
      assertEquals(6, token1.getTokenType());
      
      Token token2 = xPathLexer2.number();
      assertEquals(30, token2.getTokenType());
      
      Token token3 = xPathLexer1.rightParen();
      assertEquals("N", token3.getTokenText());
      assertEquals(2, token3.getTokenType());
      
      Token token4 = xPathLexer1.whitespace();
      assertEquals((-2), token4.getTokenType());
      
      xPathLexer1.comma();
      Token token5 = xPathLexer1.star();
      assertEquals("W", token5.getTokenText());
      assertEquals(20, token5.getTokenType());
      
      Token token6 = xPathLexer2.dots();
      assertEquals(13, token6.getTokenType());
      
      XPathLexer xPathLexer3 = new XPathLexer("?");
      xPathLexer3.comma();
      xPathLexer3.comma();
      xPathLexer3.and();
      Token token7 = xPathLexer2.colon();
      assertEquals(18, token7.getTokenType());
      
      Token token8 = xPathLexer0.identifier();
      assertEquals(15, token8.getTokenType());
      assertEquals("N-jW", token8.getTokenText());
      
      Token token9 = xPathLexer3.comma();
      assertEquals(32, token9.getTokenType());
      
      XPathLexer xPathLexer4 = new XPathLexer();
      xPathLexer4.setXPath("?");
      xPathLexer4.getPreviousToken();
      xPathLexer2.consume(293);
      xPathLexer3.mod();
      xPathLexer4.getXPath();
      int int0 = xPathLexer0.endPosition();
      assertEquals(12, int0);
  }
}