/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:54:35 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.ByteArrayInputStream;
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<NO=qw");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1131), 85);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      assertEquals(0, token_GTToken0.beginColumn);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.MoreLexicalActions();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit((JavaCharStream) null, (-2735));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2735. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0436543214770593
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S?fL&4BGTgg?");
      stringReader0.markSupported();
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, (-1881), 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.input_stream = javaCharStream0;
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals((-1880), javaCharStream0.getColumn());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5911752986244392
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KS?fL&4BGTgg?");
      stringReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, (-1881), 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.jjmatchedPos = 1081;
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals((-1880), javaCharStream0.getColumn());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("svE");
      stringReader0.mark(0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.readChar();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      javaCharStream0.GetImage();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.jjFillToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.ReInit(javaCharStream0, 2);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      PrintStream printStream0 = javaParserTokenManager1.debugStream;
      javaParserTokenManager0.setDebugStream(printStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token1 = token_GTToken0.next;
      javaParserTokenManager1.TokenLexicalActions(token0);
      javaParserTokenManager1.TokenLexicalActions((Token) null);
      Token.newToken(46);
      javaParserTokenManager1.ReInit(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager2.ReInit(javaCharStream0);
      javaParserTokenManager1.MoreLexicalActions();
      javaParserTokenManager1.SwitchTo(1);
      javaParserTokenManager1.ReInit(javaCharStream0);
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(3, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5174959268902934
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)107;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)54;
      byteArray0[4] = (byte)89;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)0, (byte)9);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, (-1471), (byte)107, (byte)0);
      JavaCharStream javaCharStream2 = new JavaCharStream(byteArrayInputStream0);
      javaParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false);
      javaParserTokenManager0.setDebugStream(javaParserTokenManager0.debugStream);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token0 = token_GTToken0.specialToken;
      javaParserTokenManager0.TokenLexicalActions((Token) null);
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      assertEquals(17, javaCharStream0.getBeginColumn());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.22523798445730334
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      StringReader stringReader0 = new StringReader("");
      stringReader0.markSupported();
      stringReader0.read();
      StringReader stringReader1 = new StringReader("");
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader1, 106, 65, 0);
      javaCharStream1.available = 115;
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 9.  Encountered: \"\" (0), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      StringReader stringReader0 = new StringReader("\"native\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.readChar();
      StringReader stringReader1 = new StringReader("\"native\"");
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader1, 46, (byte)9);
      javaCharStream1.GetImage();
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.jjFillToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.ReInit(javaCharStream1, 1);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream1);
      PrintStream printStream0 = javaParserTokenManager0.debugStream;
      javaParserTokenManager1.setDebugStream(javaParserTokenManager0.debugStream);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token1 = token_GTToken0.next;
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.TokenLexicalActions(token_GTToken0);
      Token.newToken(1);
      javaParserTokenManager1.ReInit(javaCharStream1);
      JavaParserTokenManager javaParserTokenManager2 = null;
      try {
        javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream1, (-767));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -767. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5012567054180554
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      StringReader stringReader0 = new StringReader("class");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2146, 2146, 104);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager2 = null;
      try {
        javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0, 104);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 104. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }
}
