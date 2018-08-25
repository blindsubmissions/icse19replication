/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:12:17 GMT 2018
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
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.consume();
      xPathLexer0.setXPath(") (");
      boolean boolean0 = xPathLexer0.hasMoreChars();
      Token token0 = xPathLexer0.pipe();
      assertEquals(17, token0.getTokenType());
      assertEquals(")", token0.getTokenText());
      
      xPathLexer0.whitespace();
      Token token1 = xPathLexer0.star();
      Token token2 = xPathLexer0.whitespace();
      assertEquals((-2), token2.getTokenType());
      
      xPathLexer0.or();
      Token token3 = xPathLexer0.minus();
      assertEquals(6, token3.getTokenType());
      
      xPathLexer0.identifierOrOperatorName();
      Token token4 = xPathLexer0.at();
      assertEquals(16, token4.getTokenType());
      
      xPathLexer0.identifier();
      Token token5 = xPathLexer0.leftBracket();
      assertEquals(3, token5.getTokenType());
      
      xPathLexer0.identifier();
      Token token6 = xPathLexer0.rightBracket();
      assertEquals(4, token6.getTokenType());
      
      String string0 = token1.toString();
      assertEquals("[ (20) (()", string0);
      
      xPathLexer0.or();
      xPathLexer0.isIdentifierChar('H');
      xPathLexer0.getXPath();
      xPathLexer0.plus();
      Token token7 = xPathLexer0.plus();
      assertEquals(5, token7.getTokenType());
      
      xPathLexer0.getXPath();
      Token token8 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token8.getTokenType());
      assertNotNull(token8);
      
      int int0 = xPathLexer0.endPosition();
      assertEquals(3, int0);
      
      xPathLexer0.setPreviousToken(token1);
      xPathLexer0.consume();
      boolean boolean1 = xPathLexer0.isIdentifierStartChar('J');
      assertTrue(boolean1 == boolean0);
      
      Token token9 = xPathLexer0.nextToken();
      assertEquals((-1), token9.getTokenType());
      
      char char0 = xPathLexer0.LA(0);
      assertEquals('\uFFFF', char0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("@vrZ");
      Token token0 = xPathLexer0.not();
      assertEquals("@", token0.getTokenText());
      assertEquals(23, token0.getTokenType());
      
      Token token1 = xPathLexer0.dots();
      assertEquals(13, token1.getTokenType());
      assertEquals("v", token1.getTokenText());
      
      Token token2 = xPathLexer0.dollar();
      assertEquals(26, token2.getTokenType());
      assertEquals("r", token2.getTokenText());
      
      Token token3 = xPathLexer0.number();
      assertEquals("", token3.getTokenText());
      
      xPathLexer0.and();
      xPathLexer0.literal();
      Token token4 = xPathLexer0.slashes();
      assertEquals(11, token4.getTokenType());
      
      xPathLexer0.leftParen();
      Token token5 = xPathLexer0.plus();
      assertEquals(5, token5.getTokenType());
      
      xPathLexer0.currentPosition();
      int int0 = xPathLexer0.endPosition();
      assertEquals(4, int0);
      
      Token token6 = xPathLexer0.number();
      assertEquals(30, token6.getTokenType());
      
      Token token7 = xPathLexer0.identifierOrOperatorName();
      assertEquals(15, token7.getTokenType());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.equals();
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
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("kN?H9@xG%A");
      xPathLexer0.doubleColon();
      xPathLexer0.star();
      xPathLexer0.div();
      xPathLexer0.and();
      xPathLexer0.minus();
      xPathLexer0.equals();
      xPathLexer0.whitespace();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.rightBracket();
      xPathLexer0.plus();
      xPathLexer0.comma();
      xPathLexer0.consume();
      xPathLexer0.currentPosition();
      xPathLexer0.at();
      xPathLexer0.leftBracket();
      xPathLexer0.leftBracket();
      xPathLexer0.or();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.slashes();
      xPathLexer0.pipe();
      xPathLexer0.star();
      xPathLexer0.rightParen();
      xPathLexer0.number();
      xPathLexer0.isIdentifierStartChar('5');
      Token token0 = xPathLexer0.operatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.at();
      xPathLexer0.notEquals();
      xPathLexer0.setXPath("1");
      xPathLexer0.number();
      xPathLexer0.identifier();
      Token token0 = xPathLexer0.getPreviousToken();
      assertNull(token0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.131815719070714
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.doubleColon();
      xPathLexer0.dollar();
      xPathLexer0.mod();
      xPathLexer0.doubleColon();
      xPathLexer0.endPosition();
      Token token0 = xPathLexer0.notEquals();
      xPathLexer0.nextToken();
      xPathLexer0.slashes();
      xPathLexer0.doubleColon();
      xPathLexer0.operatorName();
      xPathLexer0.pipe();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.number();
      xPathLexer0.dots();
      xPathLexer0.getXPath();
      xPathLexer0.consume(3);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.plus();
      xPathLexer0.consume();
      assertEquals("", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3959081192939284
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("com.werken.saxpath.XPathLexer");
      xPathLexer0.leftBracket();
      xPathLexer0.leftBracket();
      xPathLexer0.literal();
      xPathLexer0.comma();
      Token token0 = xPathLexer0.star();
      // Undeclared exception!
      try { 
        token0.toString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.div();
      xPathLexer0.dots();
      xPathLexer0.consume();
      xPathLexer0.not();
      xPathLexer0.comma();
      xPathLexer0.notEquals();
      xPathLexer0.mod();
      xPathLexer0.setXPath("6$V3uda]UmsQ)C]M");
      xPathLexer0.whitespace();
      xPathLexer0.operatorName();
      xPathLexer0.plus();
      xPathLexer0.consume();
      xPathLexer0.literal();
      xPathLexer0.relationalOperator();
      xPathLexer0.number();
      xPathLexer0.leftBracket();
      xPathLexer0.slashes();
      xPathLexer0.consume((-798));
      xPathLexer0.consume((-798));
      xPathLexer0.rightParen();
      xPathLexer0.rightBracket();
      xPathLexer0.currentPosition();
      // Undeclared exception!
      try { 
        xPathLexer0.operatorName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.692271402537113
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.minus();
      xPathLexer0.and();
      xPathLexer0.leftParen();
      xPathLexer0.rightParen();
      xPathLexer0.and();
      xPathLexer0.setXPath(";N~z&fk($/.[*Ki0");
      xPathLexer0.nextToken();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.comma();
      xPathLexer0.isIdentifierStartChar('2');
      xPathLexer0.identifier();
      xPathLexer0.at();
      xPathLexer0.whitespace();
      xPathLexer0.isIdentifierChar('2');
      xPathLexer0.identifier();
      xPathLexer0.setXPath("Zrt z_Eub8rE[nFE*");
      xPathLexer0.doubleColon();
      xPathLexer0.rightParen();
      xPathLexer0.literal();
      xPathLexer0.setPreviousToken((Token) null);
      Token token0 = xPathLexer0.div();
      assertNull(token0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.2554299203056605
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("4wgBE[@(n`J7PSei");
      xPathLexer0.nextToken();
      xPathLexer0.identifier();
      xPathLexer0.dots();
      xPathLexer0.rightParen();
      Token token0 = xPathLexer0.and();
      assertNull(token0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.298148610656036
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      Token token0 = xPathLexer0.number();
      xPathLexer0.whitespace();
      Token token1 = xPathLexer0.whitespace();
      assertEquals((-2), token1.getTokenType());
      
      xPathLexer0.dollar();
      xPathLexer0.mod();
      xPathLexer0.operatorName();
      int int0 = xPathLexer0.endPosition();
      assertEquals(0, int0);
      
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      xPathLexer0.notEquals();
      Token token2 = xPathLexer0.rightBracket();
      assertEquals(4, token2.getTokenType());
      
      xPathLexer0.notEquals();
      xPathLexer0.setXPath(")");
      xPathLexer0.div();
      Token token3 = xPathLexer0.pipe();
      assertEquals(")", token3.getTokenText());
      
      xPathLexer0.star();
      Token token4 = xPathLexer0.identifierOrOperatorName();
      assertNull(token4);
      
      Token token5 = xPathLexer0.dollar();
      assertEquals(26, token5.getTokenType());
      
      xPathLexer0.hasMoreChars();
      Token token6 = xPathLexer0.star();
      assertEquals(20, token6.getTokenType());
      
      int int1 = xPathLexer0.currentPosition();
      assertEquals(4, int1);
      
      Token token7 = xPathLexer0.getPreviousToken();
      assertEquals(30, token7.getTokenType());
      
      xPathLexer0.div();
      Token token8 = xPathLexer0.dots();
      assertEquals(13, token8.getTokenType());
      
      xPathLexer0.leftBracket();
      xPathLexer0.or();
      Token token9 = xPathLexer0.notEquals();
      assertEquals(22, token9.getTokenType());
      
      xPathLexer0.setXPath(")");
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('S');
      assertTrue(boolean0);
      
      Token token10 = xPathLexer0.leftBracket();
      assertEquals(3, token10.getTokenType());
      assertEquals(")", token10.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token11 = xPathLexer0.pipe();
      assertEquals(17, token11.getTokenType());
      
      boolean boolean1 = xPathLexer0.hasMoreChars();
      assertFalse(boolean1 == boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.134809336299311
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("&(k_ud.A.zq=YFi(");
      xPathLexer0.identifier();
      xPathLexer0.comma();
      xPathLexer0.identifier();
      xPathLexer0.leftBracket();
      xPathLexer0.or();
      xPathLexer0.relationalOperator();
      xPathLexer0.dollar();
      xPathLexer0.rightParen();
      xPathLexer0.operatorName();
      xPathLexer0.mod();
      Token token0 = xPathLexer0.rightBracket();
      token0.toString();
      xPathLexer0.rightParen();
      xPathLexer0.setPreviousToken(token0);
      xPathLexer0.LA(0);
      xPathLexer0.leftParen();
      xPathLexer0.currentPosition();
      xPathLexer0.mod();
      xPathLexer0.getPreviousToken();
      xPathLexer0.consume();
      xPathLexer0.relationalOperator();
      xPathLexer0.colon();
      xPathLexer0.and();
      xPathLexer0.at();
      xPathLexer0.leftBracket();
      xPathLexer0.consume(100);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.plus();
      xPathLexer0.consume();
      Token token1 = xPathLexer0.identifierOrOperatorName();
      assertNull(token1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.2829507132875912
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("&(k_ud.A.zq=YFi(");
      xPathLexer0.identifier();
      Token token0 = xPathLexer0.comma();
      assertEquals("&", token0.getTokenText());
      assertEquals(32, token0.getTokenType());
      
      Token token1 = xPathLexer0.identifier();
      assertEquals(15, token1.getTokenType());
      assertEquals("", token1.getTokenText());
      
      xPathLexer0.leftBracket();
      xPathLexer0.or();
      xPathLexer0.relationalOperator();
      Token token2 = xPathLexer0.dollar();
      assertEquals("k", token2.getTokenText());
      assertEquals(26, token2.getTokenType());
      
      xPathLexer0.rightParen();
      xPathLexer0.operatorName();
      xPathLexer0.mod();
      Token token3 = xPathLexer0.rightBracket();
      String string0 = token3.toString();
      assertEquals("[ (4) (u)", string0);
      
      Token token4 = xPathLexer0.rightParen();
      assertEquals("", token4.getTokenText());
      assertEquals(2, token4.getTokenType());
      
      xPathLexer0.setPreviousToken(token3);
      xPathLexer0.LA(0);
      xPathLexer0.getXPath();
      Token token5 = xPathLexer0.leftParen();
      assertEquals("d", token5.getTokenText());
      
      xPathLexer0.currentPosition();
      xPathLexer0.mod();
      Token token6 = xPathLexer0.star();
      assertEquals(20, token6.getTokenType());
      assertEquals(".", token6.getTokenText());
      
      xPathLexer0.currentPosition();
      xPathLexer0.getPreviousToken();
      XPathLexer xPathLexer1 = new XPathLexer("&(k_ud.A.zq=YFi(");
      xPathLexer1.div();
      Token token7 = xPathLexer0.dots();
      assertEquals("A.", token7.getTokenText());
      assertEquals(14, token7.getTokenType());
      
      xPathLexer1.leftBracket();
      xPathLexer1.or();
      Token token8 = xPathLexer0.notEquals();
      assertEquals(22, token8.getTokenType());
      
      xPathLexer0.setXPath("bu3");
      boolean boolean0 = xPathLexer0.isIdentifierStartChar('S');
      assertTrue(boolean0);
      
      Token token9 = xPathLexer0.leftBracket();
      assertEquals(3, token9.getTokenType());
      assertEquals("b", token9.getTokenText());
      
      xPathLexer0.relationalOperator();
      Token token10 = xPathLexer0.pipe();
      assertEquals(17, token10.getTokenType());
      
      boolean boolean1 = xPathLexer0.hasMoreChars();
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.1823392035982838
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.minus();
      xPathLexer0.and();
      xPathLexer0.leftParen();
      xPathLexer0.rightParen();
      xPathLexer0.and();
      xPathLexer0.setXPath(";N~z&fk($/.[*Ki0");
      xPathLexer0.nextToken();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.star();
      xPathLexer0.consume();
      xPathLexer0.at();
      xPathLexer0.star();
      xPathLexer0.or();
      xPathLexer0.nextToken();
      xPathLexer0.leftBracket();
      xPathLexer0.mod();
      xPathLexer0.not();
      XPathLexer xPathLexer1 = new XPathLexer(";N~z&fk($/.[*Ki0");
      xPathLexer1.relationalOperator();
      xPathLexer0.operatorName();
      xPathLexer0.star();
      xPathLexer0.leftParen();
      xPathLexer1.at();
      xPathLexer1.setXPath("");
      xPathLexer1.pipe();
      Token token0 = xPathLexer0.identifierOrOperatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.1744895011263914
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("-c3SWw(k+Vh],");
      xPathLexer0.equals();
      xPathLexer0.minus();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.consume();
      xPathLexer0.star();
      xPathLexer0.consume();
      xPathLexer0.at();
      xPathLexer0.or();
      xPathLexer0.nextToken();
      xPathLexer0.mod();
      xPathLexer0.not();
      xPathLexer0.relationalOperator();
      xPathLexer0.operatorName();
      xPathLexer0.star();
      xPathLexer0.leftParen();
      xPathLexer0.setXPath("");
      xPathLexer0.pipe();
      Token token0 = xPathLexer0.identifierOrOperatorName();
      assertNull(token0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8356389299038997
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer();
      xPathLexer0.at();
      Token token0 = xPathLexer0.notEquals();
      assertEquals(22, token0.getTokenType());
      
      Token token1 = xPathLexer0.at();
      assertEquals(16, token1.getTokenType());
      
      xPathLexer0.setXPath("1");
      Token token2 = xPathLexer0.number();
      assertEquals("1", token2.getTokenText());
      
      xPathLexer0.identifier();
      Token token3 = xPathLexer0.identifier();
      assertEquals(15, token3.getTokenType());
      assertEquals("", token3.getTokenText());
      
      Token token4 = xPathLexer0.nextToken();
      assertEquals((-1), token4.getTokenType());
      
      Token token5 = xPathLexer0.number();
      assertEquals("", token5.getTokenText());
      assertEquals(30, token5.getTokenType());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.8361898763322821
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("-c3SWw(k+Vh],");
      Token token0 = xPathLexer0.equals();
      assertEquals(21, token0.getTokenType());
      assertEquals("-", token0.getTokenText());
      
      Token token1 = xPathLexer0.minus();
      assertEquals(6, token1.getTokenType());
      assertEquals("c", token1.getTokenText());
      
      Token token2 = xPathLexer0.identifierOrOperatorName();
      assertNotNull(token2);
      
      xPathLexer0.consume();
      Token token3 = xPathLexer0.leftParen();
      assertEquals(1, token3.getTokenType());
      assertEquals("k", token3.getTokenText());
      
      Token token4 = xPathLexer0.star();
      assertEquals("+", token4.getTokenText());
      
      xPathLexer0.div();
      Token token5 = xPathLexer0.at();
      assertEquals(16, token5.getTokenType());
      assertEquals("V", token5.getTokenText());
      
      xPathLexer0.or();
      Token token6 = xPathLexer0.notEquals();
      assertEquals(22, token6.getTokenType());
      assertEquals("h]", token6.getTokenText());
      
      Token token7 = xPathLexer0.identifier();
      assertEquals("", token7.getTokenText());
      assertEquals(15, token7.getTokenType());
      
      Token token8 = xPathLexer0.nextToken();
      assertEquals(",", token8.getTokenText());
      assertEquals(32, token8.getTokenType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.431561319507713
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("&(k_ud.A.zq=YFi(");
      XPathLexer xPathLexer1 = new XPathLexer();
      xPathLexer1.doubleColon();
      xPathLexer1.dollar();
      xPathLexer0.mod();
      Token token0 = xPathLexer1.doubleColon();
      xPathLexer1.endPosition();
      xPathLexer1.notEquals();
      XPathLexer xPathLexer2 = new XPathLexer();
      xPathLexer2.nextToken();
      xPathLexer1.slashes();
      xPathLexer0.doubleColon();
      xPathLexer0.operatorName();
      xPathLexer0.pipe();
      xPathLexer2.setPreviousToken(token0);
      xPathLexer2.number();
      xPathLexer0.dots();
      xPathLexer2.getXPath();
      xPathLexer1.consume(3);
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.plus();
      xPathLexer0.consume();
      assertEquals("&(k_ud.A.zq=YFi(", xPathLexer0.getXPath());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.1308596534603357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XPathLexer xPathLexer0 = new XPathLexer("");
      xPathLexer0.star();
      xPathLexer0.setXPath("");
      xPathLexer0.dots();
      xPathLexer0.plus();
      xPathLexer0.and();
      xPathLexer0.identifierOrOperatorName();
      xPathLexer0.mod();
      xPathLexer0.literal();
      xPathLexer0.pipe();
      xPathLexer0.relationalOperator();
      xPathLexer0.div();
      xPathLexer0.setXPath("]:mr/g\"Rt");
      xPathLexer0.pipe();
      XPathLexer xPathLexer1 = new XPathLexer();
      Token token0 = xPathLexer0.leftParen();
      xPathLexer1.setPreviousToken(token0);
      xPathLexer1.number();
      xPathLexer1.dots();
      xPathLexer0.getXPath();
      XPathLexer xPathLexer2 = new XPathLexer("N?=H=Y}T2T'[rQ");
      xPathLexer2.consume(3464);
      xPathLexer1.identifierOrOperatorName();
      XPathLexer xPathLexer3 = new XPathLexer("");
      xPathLexer3.plus();
      xPathLexer0.consume();
      xPathLexer1.whitespace();
      xPathLexer1.number();
      Token token1 = xPathLexer0.literal();
      assertNull(token1);
  }
}
