/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:03:13 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  public void test00()  throws Throwable  {
      String string0 = "9c^p5aRf?P,~c]S'X<";
      StringReader stringReader0 = new StringReader("9c^p5aRf?P,~c]S'X<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2431), (-2431));
      char[] charArray0 = new char[3];
      charArray0[0] = '!';
      charArray0[1] = 'T';
      charArray0[2] = 's';
      stringReader0.read(charArray0);
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
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 85);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      Token token0 = Token.newToken((-283));
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, token0.endLine);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.mark(1525);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0, 2053, 0, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      sequenceInputStream0.close();
      Token token0 = Token.newToken((-1));
      Token token1 = javaParserTokenManager0.getNextToken();
      token0.specialToken = token1;
      token0.kind = 2053;
      javaParserTokenManager0.SkipLexicalActions(token0);
      sequenceInputStream0.available();
      token0.kind = 0;
      javaParserTokenManager0.MoreLexicalActions();
      token1.beginLine = 2053;
      javaParserTokenManager0.MoreLexicalActions();
      Token token2 = javaParserTokenManager0.jjFillToken();
      javaParserTokenManager0.SkipLexicalActions(token0.specialToken);
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.TokenLexicalActions(token2);
      javaParserTokenManager0.MoreLexicalActions();
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ntvr\"+=2H84nt#N,EP");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 611, 0, 611);
      stringReader0.reset();
      CharBuffer charBuffer0 = CharBuffer.allocate(58);
      stringReader0.read(charBuffer0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 611);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 611. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-85);
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-121);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)119;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)35;
      byteArray0[7] = (byte) (-98);
      byteArray0[8] = (byte)107;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 346);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte) (-85), 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaCharStream javaCharStream1 = new JavaCharStream(byteArrayInputStream0, (byte)119, (byte)47, 595);
      byteArrayInputStream0.mark(2);
      javaParserTokenManager0.jjmatchedKind = (int) (byte) (-121);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream1, 1495);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1495. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      javaParserTokenManager0.defaultLexState = (-222);
      javaParserTokenManager0.MoreLexicalActions();
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, true);
      PrintStream printStream0 = mockPrintStream0.append('4');
      javaParserTokenManager0.setDebugStream(printStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      StringReader stringReader0 = new StringReader("");
      StringReader stringReader1 = new StringReader("\r");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader1);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.MoreLexicalActions();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-85ZFbT/");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3775, 3775, 2);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 0, 45, 3775);
      JavaCharStream javaCharStream2 = new JavaCharStream(stringReader0, 3775, 3775, 45);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream2);
      javaParserTokenManager1.ReInit(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token1 = token_GTToken0.next;
      javaParserTokenManager1.SkipLexicalActions((Token) null);
      javaParserTokenManager0.jjFillToken();
      assertEquals(3776, javaCharStream0.getBeginColumn());
      assertEquals(3777, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.170494981710864
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("k;nUI=??))-c[");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.backup(246);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 0, column 0.  Encountered: \"\" (0), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6167935755921614
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("k;nUI=??))-c[");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 246, (-259), 246);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream1);
      javaParserTokenManager0.ReInit(javaCharStream1);
      Token token0 = javaParserTokenManager0.getNextToken();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      Token token1 = javaParserTokenManager0.jjFillToken();
      assertEquals("k", token1.toString());
      assertEquals(74, token1.kind);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"transient\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaCharStream.hexval('e');
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(10, javaCharStream0.bufpos);
      assertEquals("\"transient\"", token0.toString());
  }
}