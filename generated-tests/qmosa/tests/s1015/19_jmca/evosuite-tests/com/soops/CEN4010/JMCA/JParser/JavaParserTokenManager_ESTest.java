/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:59:53 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R]_7");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      stringReader0.read();
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager0.curLexState = 1877;
      int int0 = (-3389);
      javaParserTokenManager0.jjmatchedPos = (-3389);
      javaParserTokenManager0.debugStream = null;
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.input_stream = null;
      javaParserTokenManager0.lengthOfMatch = (-3389);
      javaParserTokenManager0.lengthOfMatch = 0;
      javaParserTokenManager0.curChar = '<';
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-3389));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -3389. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
      javaParserTokenManager0.ReInit((JavaCharStream) null);
      javaParserTokenManager0.input_stream = null;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit((JavaCharStream) null, (-1457));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1457. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("aX(j2AVh\"9ff_zz");
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 100, 100, 100);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.skip(100);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager1.ReInit(javaCharStream0);
      javaParserTokenManager1.MoreLexicalActions();
      assertNotSame(javaParserTokenManager1, javaParserTokenManager0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L{w(:uWl_q3`wmD`:iW");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      PrintStream printStream0 = javaParserTokenManager0.debugStream;
      javaParserTokenManager0.setDebugStream(printStream0);
      boolean boolean0 = false;
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(printStream0, false, "dR/WD!yBUcRX2kQ");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // dR/WD!yBUcRX2kQ
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L{w(:uWl_q3`wmD`:iW");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      stringReader0.reset();
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, (-1100), 100, 44);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.skip(1L);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      JavaParserTokenManager javaParserTokenManager1 = null;
      try {
        javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0, 15);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 15. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L{w(:uWl_q3`wmD`:iW");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      PrintStream printStream0 = javaParserTokenManager0.debugStream;
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 1, 1, 23);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.skip(1);
      javaParserTokenManager0.getNextToken();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token1 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.SkipLexicalActions(token0);
      Token token2 = javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("w", token2.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("aX(j2AVh\"9ff_zz");
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 100, 100, 100);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.skip((-1764L));
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      Token token1 = javaParserTokenManager0.getNextToken();
      assertEquals(102, javaCharStream0.getBeginColumn());
      assertEquals("(", token1.toString());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8310204811135165
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Y#`V'=!");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 0, column 1.  Encountered: \"#\" (35), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }
}
