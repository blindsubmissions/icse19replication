/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:33:54 GMT 2018
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("y8M8[nr;$?*M@ecb4g");
      xPathLexer0.identifier();
      xPathLexer0.identifier();
      xPathLexer0.minus();
      Token token0 = xPathLexer0.literal();
      assertNull(token0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("az");
      Token token0 = xPathLexer0.identifier();
      assertEquals("az", token0.getTokenText());
      assertEquals(15, token0.getTokenType());
      
      Token token1 = xPathLexer0.dots();
      assertEquals(13, token1.getTokenType());
      
      Token token2 = xPathLexer0.slashes();
      assertEquals(11, token2.getTokenType());
      
      Token token3 = xPathLexer0.whitespace();
      assertEquals("", token3.getTokenText());
      assertEquals((-2), token3.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('G');
      assertTrue(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.slashes();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.equals();
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
  //Test case number: 3
  /*Coverage entropy=3.2580965380214835
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.pipe();
      xPathLexer0.identifier();
      xPathLexer0.plus();
      Token token0 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token0.getTokenType());
      assertNotNull(token0);
      
      xPathLexer0.mod();
      xPathLexer0.dollar();
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token2 = xPathLexer0.doubleColon();
      assertEquals(19, token2.getTokenType());
      
      xPathLexer0.or();
      Token token3 = xPathLexer0.slashes();
      assertEquals(11, token3.getTokenType());
      
      Token token4 = xPathLexer0.comma();
      assertEquals(32, token4.getTokenType());
      
      xPathLexer0.leftParen();
      Token token5 = xPathLexer0.minus();
      assertEquals(6, token5.getTokenType());
      
      Token token6 = xPathLexer0.leftParen();
      assertEquals(1, token6.getTokenType());
      
      xPathLexer0.dollar();
      Token token7 = xPathLexer0.number();
      assertEquals(30, token7.getTokenType());
      
      char char0 = xPathLexer0.LA(46);
      assertEquals('\uFFFF', char0);
      
      xPathLexer0.whitespace();
      xPathLexer0.or();
      xPathLexer0.relationalOperator();
      Token token8 = xPathLexer0.notEquals();
      assertEquals(22, token8.getTokenType());
      
      Token token9 = xPathLexer0.dollar();
      assertEquals(26, token9.getTokenType());
      
      xPathLexer0.getXPath();
      xPathLexer0.setPreviousToken((Token) null);
      Token token10 = xPathLexer0.plus();
      assertEquals(5, token10.getTokenType());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("Z&9#+FDLX&o2GJ-");
      xPathLexer0.number();
      Token token0 = xPathLexer0.dollar();
      assertEquals("Z", token0.getTokenText());
      
      xPathLexer0.at();
      xPathLexer0.not();
      xPathLexer0.nextToken();
      Token token1 = xPathLexer0.leftParen();
      assertEquals("#", token1.getTokenText());
      
      Token token2 = xPathLexer0.whitespace();
      assertEquals((-2), token2.getTokenType());
      assertEquals("", token2.getTokenText());
      
      xPathLexer0.or();
      Token token3 = xPathLexer0.number();
      assertEquals(30, token3.getTokenType());
      
      xPathLexer0.or();
      Token token4 = xPathLexer0.pipe();
      assertEquals(17, token4.getTokenType());
      assertEquals("F", token4.getTokenText());
      
      xPathLexer0.identifierOrOperatorName();
      Token token5 = xPathLexer0.not();
      assertEquals(23, token5.getTokenType());
      assertEquals("D", token5.getTokenText());
      
      xPathLexer0.div();
      xPathLexer0.nextToken();
      Token token6 = xPathLexer0.star();
      assertEquals(20, token6.getTokenType());
      assertEquals("L", token6.getTokenText());
      
      Token token7 = xPathLexer0.at();
      assertEquals(16, token7.getTokenType());
      assertEquals("X", token7.getTokenText());
      
      Token token8 = xPathLexer0.rightBracket();
      assertEquals(4, token8.getTokenType());
      assertEquals("&", token8.getTokenText());
      
      Token token9 = xPathLexer0.literal();
      assertNull(token9);
      
      xPathLexer0.colon();
      Token token10 = xPathLexer0.equals();
      assertEquals(21, token10.getTokenType());
      
      xPathLexer0.getXPath();
      Token token11 = xPathLexer0.dollar();
      assertEquals(26, token11.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.isIdentifierChar('#');
      xPathLexer0.div();
      Token token12 = xPathLexer0.colon();
      assertEquals(18, token12.getTokenType());
      
      xPathLexer0.getPreviousToken();
      xPathLexer0.consume(0);
      xPathLexer0.and();
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('L');
      assertTrue(boolean0);
      
      Token token13 = xPathLexer0.doubleColon();
      assertEquals(19, token13.getTokenType());
      
      char char0 = xPathLexer0.LA(0);
      assertEquals('\uFFFF', char0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.778057368280374
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.not();
      xPathLexer0.notEquals();
      xPathLexer0.isIdentifierStartChar('~');
      xPathLexer0.and();
      xPathLexer0.dollar();
      xPathLexer0.nextToken();
      xPathLexer0.minus();
      xPathLexer0.rightBracket();
      xPathLexer0.rightParen();
      xPathLexer0.dots();
      xPathLexer0.pipe();
      xPathLexer0.isIdentifierStartChar('~');
      xPathLexer0.colon();
      xPathLexer0.minus();
      // Undeclared exception!
      try { 
        xPathLexer0.LA((-1384));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8679980261706721
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.operatorName();
      xPathLexer0.setXPath("\nl](]");
      xPathLexer0.operatorName();
      Token token0 = xPathLexer0.number();
      assertEquals(30, token0.getTokenType());
      
      xPathLexer0.div();
      Token token1 = xPathLexer0.notEquals();
      assertEquals(22, token1.getTokenType());
      assertEquals("\nl", token1.getTokenText());
      
      Token token2 = xPathLexer0.nextToken();
      assertEquals(4, token2.getTokenType());
      assertEquals("]", token2.getTokenText());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(") (");
      Token token0 = xPathLexer0.rightParen();
      xPathLexer0.pipe();
      token0.toString();
      token0.toString();
      token0.toString();
      xPathLexer0.pipe();
      token0.toString();
      token0.toString();
      token0.toString();
      xPathLexer0.pipe();
      xPathLexer0.nextToken();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.leftParen();
      xPathLexer0.isIdentifierChar('K');
      xPathLexer0.rightParen();
      xPathLexer0.operatorName();
      xPathLexer0.identifier();
      xPathLexer0.getXPath();
      xPathLexer0.currentPosition();
      xPathLexer0.leftBracket();
      xPathLexer0.leftBracket();
      xPathLexer0.getXPath();
      xPathLexer0.rightParen();
      Token token1 = xPathLexer0.div();
      assertNull(token1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.904728949798007
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("}l2cqw\"@E7bO");
      Token token0 = xPathLexer0.rightParen();
      assertEquals(2, token0.getTokenType());
      assertEquals("}", token0.getTokenText());
      
      xPathLexer0.identifier();
      Token token1 = xPathLexer0.plus();
      assertEquals("\"", token1.getTokenText());
      
      Token token2 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token2);
      
      Token token3 = xPathLexer0.identifier();
      assertEquals("", token3.getTokenText());
      assertEquals(15, token3.getTokenType());
      
      xPathLexer0.mod();
      xPathLexer0.hasMoreChars();
      xPathLexer0.at();
      xPathLexer0.relationalOperator();
      xPathLexer0.consume();
      Token token4 = xPathLexer0.nextToken();
      assertEquals("7", token4.getTokenText());
      assertEquals(30, token4.getTokenType());
      
      xPathLexer0.consume();
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      assertEquals("O", token5.getTokenText());
      
      Token token6 = xPathLexer0.plus();
      assertEquals(5, token6.getTokenType());
      
      Token token7 = xPathLexer0.equals();
      assertEquals(21, token7.getTokenType());
      
      xPathLexer0.dots();
      Token token8 = xPathLexer0.minus();
      assertEquals(6, token8.getTokenType());
      
      Token token9 = xPathLexer0.dollar();
      assertEquals(26, token9.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('<');
      assertFalse(boolean0);
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(12, int0);
      
      Token token10 = xPathLexer0.leftBracket();
      assertEquals(3, token10.getTokenType());
      
      xPathLexer0.operatorName();
      Token token11 = xPathLexer0.rightBracket();
      assertEquals(4, token11.getTokenType());
      
      Token token12 = xPathLexer0.colon();
      assertEquals(18, token12.getTokenType());
      
      Token token13 = xPathLexer0.dots();
      assertEquals(13, token13.getTokenType());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1632816309658542
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.star();
      Token token0 = xPathLexer0.colon();
      assertEquals(18, token0.getTokenType());
      
      xPathLexer0.consume();
      xPathLexer0.operatorName();
      xPathLexer0.pipe();
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(3, token1.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.dots();
      xPathLexer0.consume(1073);
      xPathLexer0.consume((-1));
      Token token2 = xPathLexer0.rightParen();
      assertEquals(2, token2.getTokenType());
      
      xPathLexer0.endPosition();
      Token token3 = xPathLexer0.star();
      assertEquals(20, token3.getTokenType());
      
      xPathLexer0.and();
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.rightBracket();
      assertEquals(4, token5.getTokenType());
      
      xPathLexer0.setXPath("y]jad[mR3w=N");
      Token token6 = xPathLexer0.leftParen();
      assertEquals(1, token6.getTokenType());
      
      xPathLexer0.relationalOperator();
      Token token7 = xPathLexer0.doubleColon();
      assertEquals(19, token7.getTokenType());
      assertEquals("]j", token7.getTokenText());
      
      char char0 = xPathLexer0.LA(2228);
      assertEquals('\uFFFF', char0);
      
      Token token8 = xPathLexer0.identifierOrOperatorName();
      assertNull(token8);
      
      Token token9 = xPathLexer0.pipe();
      assertEquals(17, token9.getTokenType());
      assertEquals("a", token9.getTokenText());
      
      xPathLexer0.number();
      xPathLexer0.consume();
      Token token10 = xPathLexer0.minus();
      assertEquals(6, token10.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('$');
      char char1 = xPathLexer0.LA((-1));
      assertEquals('d', char1);
      
      xPathLexer0.getXPath();
      Token token11 = xPathLexer0.dots();
      assertEquals("m", token11.getTokenText());
      assertEquals(13, token11.getTokenType());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.296268304513654
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("pV[L6oW\"dDS,");
      Token token0 = xPathLexer0.minus();
      assertEquals(6, token0.getTokenType());
      assertEquals("p", token0.getTokenText());
      
      Token token1 = xPathLexer0.whitespace();
      assertEquals((-2), token1.getTokenType());
      assertEquals("", token1.getTokenText());
      
      xPathLexer0.mod();
      Token token2 = xPathLexer0.equals();
      assertEquals(21, token2.getTokenType());
      assertEquals("[", token2.getTokenText());
      
      Token token3 = xPathLexer0.identifier();
      token3.toString();
      token3.toString();
      token3.toString();
      token3.toString();
      String string0 = token3.toString();
      assertEquals("[ (15) (L6oW)", string0);
      
      xPathLexer0.setPreviousToken(token3);
      xPathLexer0.operatorName();
      xPathLexer0.identifier();
      Token token4 = xPathLexer0.identifierOrOperatorName();
      assertNull(token4);
      
      Token token5 = xPathLexer0.not();
      assertEquals("\"", token5.getTokenText());
      assertEquals(23, token5.getTokenType());
      
      boolean boolean0 = xPathLexer0.isIdentifierChar('X');
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1966782356879726
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("jriI|tqS{PB");
      Token token0 = xPathLexer0.nextToken();
      assertEquals(15, token0.getTokenType());
      assertEquals("jriI", token0.getTokenText());
      
      xPathLexer0.consume(110);
      xPathLexer0.mod();
      xPathLexer0.mod();
      xPathLexer0.and();
      xPathLexer0.consume();
      xPathLexer0.literal();
      xPathLexer0.equals();
      Token token1 = xPathLexer0.pipe();
      assertEquals(17, token1.getTokenType());
      
      xPathLexer0.relationalOperator();
      xPathLexer0.slashes();
      xPathLexer0.notEquals();
      Token token2 = xPathLexer0.dollar();
      assertEquals(26, token2.getTokenType());
      
      xPathLexer0.isIdentifierStartChar('P');
      Token token3 = xPathLexer0.rightBracket();
      assertEquals(4, token3.getTokenType());
      
      Token token4 = xPathLexer0.slashes();
      assertEquals(11, token4.getTokenType());
      
      Token token5 = xPathLexer0.plus();
      assertEquals(5, token5.getTokenType());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4362708890311744
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer(") (");
      xPathLexer0.relationalOperator();
      xPathLexer0.whitespace();
      Token token0 = xPathLexer0.rightParen();
      assertEquals("(", token0.getTokenText());
      assertEquals(2, token0.getTokenType());
      
      xPathLexer0.endPosition();
      Token token1 = xPathLexer0.literal();
      assertNull(token1);
      
      xPathLexer0.rightBracket();
      xPathLexer0.div();
      xPathLexer0.minus();
      xPathLexer0.relationalOperator();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals(4, token2.getTokenType());
      
      Token token3 = xPathLexer0.leftParen();
      assertEquals(1, token3.getTokenType());
      
      Token token4 = xPathLexer0.not();
      assertEquals(23, token4.getTokenType());
      
      xPathLexer0.setXPath(" C8?501.bl");
      Token token5 = xPathLexer0.nextToken();
      assertEquals(15, token5.getTokenType());
      assertEquals("C8", token5.getTokenText());
      
      xPathLexer0.nextToken();
      Token token6 = xPathLexer0.comma();
      assertEquals("?", token6.getTokenText());
      assertEquals(32, token6.getTokenType());
      
      xPathLexer0.setXPath("LR.EIL6&W^");
      xPathLexer0.operatorName();
      Token token7 = xPathLexer0.colon();
      assertEquals("L", token7.getTokenText());
      assertEquals(18, token7.getTokenType());
      
      xPathLexer0.nextToken();
      xPathLexer0.getXPath();
      Token token8 = xPathLexer0.minus();
      assertEquals(6, token8.getTokenType());
      assertEquals("R", token8.getTokenText());
      
      Token token9 = xPathLexer0.pipe();
      assertEquals(".", token9.getTokenText());
      assertEquals(17, token9.getTokenType());
      
      boolean boolean0 = xPathLexer0.hasMoreChars();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6302533563892636
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.div();
      xPathLexer0.slashes();
      xPathLexer0.minus();
      xPathLexer0.operatorName();
      xPathLexer0.pipe();
      xPathLexer0.comma();
      int int0 = (-1063);
      xPathLexer0.number();
      // Undeclared exception!
      try { 
        xPathLexer0.LA((-1063));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.09743019497093
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("[ (");
      xPathLexer0.number();
      xPathLexer0.or();
      Token token0 = xPathLexer0.not();
      assertEquals("[", token0.getTokenText());
      assertEquals(23, token0.getTokenType());
      
      Token token1 = xPathLexer0.leftBracket();
      assertEquals(" ", token1.getTokenText());
      assertEquals(3, token1.getTokenType());
      
      xPathLexer0.leftParen();
      xPathLexer0.dots();
      xPathLexer0.consume(26);
      xPathLexer0.consume(26);
      Token token2 = xPathLexer0.rightParen();
      assertEquals(2, token2.getTokenType());
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(3, int0);
      
      xPathLexer0.star();
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.and();
      xPathLexer1.nextToken();
      Token token3 = xPathLexer0.rightBracket();
      assertEquals(4, token3.getTokenType());
      
      xPathLexer0.setXPath("y]jad[mR3w=N");
      Token token4 = xPathLexer0.leftParen();
      assertEquals("y", token4.getTokenText());
      
      xPathLexer0.relationalOperator();
      XPathLexer xPathLexer2 = new XPathLexer(")Y}L4+#u74??A3J5");
      xPathLexer2.identifierOrOperatorName();
      Token token5 = xPathLexer2.doubleColon();
      assertEquals(")Y", token5.getTokenText());
      assertEquals(19, token5.getTokenType());
      
      char char0 = xPathLexer0.LA(26);
      assertEquals('\uFFFF', char0);
      
      xPathLexer2.identifierOrOperatorName();
      Token token6 = xPathLexer2.pipe();
      assertEquals("}", token6.getTokenText());
      
      Token token7 = xPathLexer1.slashes();
      assertEquals(11, token7.getTokenType());
      
      XPathLexer xPathLexer3 = new XPathLexer();
      xPathLexer3.number();
      xPathLexer1.consume();
      Token token8 = xPathLexer3.minus();
      assertEquals(6, token8.getTokenType());
      
      boolean boolean0 = xPathLexer3.isIdentifierStartChar('z');
      assertTrue(boolean0);
      
      char char1 = xPathLexer0.LA(3);
      assertEquals('a', char1);
      
      xPathLexer1.getXPath();
      Token token9 = xPathLexer2.dots();
      assertEquals("L", token9.getTokenText());
      assertEquals(13, token9.getTokenType());
      
      Token token10 = xPathLexer2.nextToken();
      assertEquals(30, token10.getTokenType());
      assertEquals("4", token10.getTokenText());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.5778871968907886
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.slashes();
      xPathLexer0.minus();
      xPathLexer0.getPreviousToken();
      xPathLexer0.isIdentifierStartChar('X');
      xPathLexer0.or();
      xPathLexer0.getXPath();
      Token token0 = xPathLexer0.comma();
      xPathLexer0.consume();
      xPathLexer0.or();
      XPathLexer xPathLexer1 = new XPathLexer();
      Token token1 = xPathLexer1.not();
      xPathLexer1.setPreviousToken(token1);
      xPathLexer1.isIdentifierChar('@');
      xPathLexer1.identifierOrOperatorName();
      xPathLexer1.setPreviousToken(token0);
      xPathLexer0.comma();
      xPathLexer0.not();
      xPathLexer0.dollar();
      xPathLexer0.or();
      xPathLexer1.dots();
      xPathLexer1.whitespace();
      xPathLexer1.colon();
      xPathLexer1.equals();
      xPathLexer0.number();
      xPathLexer1.colon();
      xPathLexer1.minus();
      xPathLexer1.mod();
      XPathLexer xPathLexer2 = new XPathLexer("b<=x',yT;}Q=6I?");
      xPathLexer2.plus();
      xPathLexer0.setXPath("");
      Token token2 = xPathLexer0.div();
      assertNull(token2);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9434998662499046
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.div();
      Token token0 = xPathLexer0.slashes();
      assertEquals("c", token0.getTokenText());
      assertEquals(11, token0.getTokenType());
      
      Token token1 = xPathLexer0.minus();
      assertEquals("o", token1.getTokenText());
      assertEquals(6, token1.getTokenType());
      
      xPathLexer0.setXPath("com.werken.saxpath.Token");
      xPathLexer0.operatorName();
      Token token2 = xPathLexer0.number();
      assertEquals(30, token2.getTokenType());
      
      xPathLexer0.div();
      Token token3 = xPathLexer0.notEquals();
      assertEquals("co", token3.getTokenText());
      assertEquals(22, token3.getTokenType());
      
      Token token4 = xPathLexer0.nextToken();
      assertEquals("m.werken.saxpath.Token", token4.getTokenText());
      assertEquals(15, token4.getTokenType());
  }
}
