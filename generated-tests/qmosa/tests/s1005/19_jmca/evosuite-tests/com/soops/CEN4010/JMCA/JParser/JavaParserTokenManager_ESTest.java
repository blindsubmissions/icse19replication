/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:05:48 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "|e1P\\T.T2.%0}";
      StringReader stringReader0 = new StringReader("|e1PT.T2.%0}");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager0.ReInit((JavaCharStream) null);
      javaParserTokenManager0.curLexState = (-5097);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-2705));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2705. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 0);
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.GetImage();
      javaCharStream0.backup(0);
      javaParserTokenManager0.input_stream = javaCharStream0;
      javaCharStream0.available = (-2915);
      javaCharStream0.tokenBegin = (-2915);
      javaParserTokenManager0.MoreLexicalActions();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(4095);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 4095. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      token_GTToken0.realKind = (-2503);
      token_GTToken0.endLine = 251;
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      int int0 = 0;
      token_GTToken0.kind = 0;
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      javaParserTokenManager0.ReInit((JavaCharStream) null, 0);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W(K6dgs");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.defaultLexState = (-1);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaCharStream0.available = (-1073);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.TokenLexicalActions((Token) null);
      Token token1 = javaParserTokenManager0.getNextToken();
      assertEquals("W", token1.toString());
      assertEquals(74, token1.kind);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.7120634908958146
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-36);
      byteArray0[3] = (byte)100;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)77);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 319, (byte)77, (byte) (-36));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.MoreLexicalActions();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals("M", token0.toString());
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W(K6dgs");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.defaultLexState = (-1);
      javaParserTokenManager0.ReInit(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaCharStream0.available = (-1073);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      Token token1 = javaParserTokenManager0.getNextToken();
      stringReader0.skip(0);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      token0.image = "";
      token1.kind = 18;
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.TokenLexicalActions(token1);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.ReInit(javaCharStream0, 1);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0, 1);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 5.  Encountered: \"d\" (100), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      token_GTToken0.realKind = (-2503);
      token_GTToken0.endLine = 251;
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      StringReader stringReader0 = new StringReader("static");
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 61, 61);
      javaParserTokenManager0.ReInit(javaCharStream1);
      javaParserTokenManager0.getNextToken();
      try { 
        stringReader0.skip(8192L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0025493226165192
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(K6dgs");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaCharStream0.available = (-1073);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream);
      javaParserTokenManager0.ReInit(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      stringReader0.skip((-1073));
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager1.TokenLexicalActions(token_GTToken0);
      javaParserTokenManager1.getNextToken();
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }
}
