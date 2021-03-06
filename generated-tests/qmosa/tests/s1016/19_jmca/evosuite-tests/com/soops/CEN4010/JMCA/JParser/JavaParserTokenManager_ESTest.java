/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:22:56 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2466);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 2466, 2466, 2466);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      assertEquals(0, javaCharStream0.getBeginColumn());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("j@[h");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.ReadByte();
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
  //Test case number: 2
  /*Coverage entropy=1.8343719702816237
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaCharStream0.adjustBeginLineColumn(659, 0);
      Token token0 = token_GTToken0.specialToken;
      sequenceInputStream0.markSupported();
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
      StringReader stringReader0 = new StringReader("\"public\"");
      javaCharStream0.inputStream = (Reader) stringReader0;
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 701);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 701. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)121;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(dataInputStream0, 1656, (byte)121, 1299);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = new Token();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1656, column 121.  Encountered: \"\\ufffd\" (65533), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      javaCharStream0.adjustBeginLineColumn(659, 0);
      Token token0 = token_GTToken0.specialToken;
      sequenceInputStream0.markSupported();
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
      String string0 = "\"public\"";
      StringReader stringReader0 = new StringReader("\"public\"");
      javaCharStream0.inputStream = (Reader) stringReader0;
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      Token token1 = token_GTToken0.next;
      javaParserTokenManager0.getNextToken();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "\"public\"");
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false, "]@C1:IA4\"L/6");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ]@C1:IA4\"L/6
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0253262207700677
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(9);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 2263, 2263, 2263);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = new Token();
      Token.newToken(1299);
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.setDebugStream((PrintStream) null);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.setDebugStream(javaParserTokenManager1.debugStream);
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager2.ReInit(javaCharStream0);
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0, 0, 9, 255);
      JavaParserTokenManager javaParserTokenManager3 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream1);
      assertNotSame(javaCharStream0, javaCharStream1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@K055n9-R8[tKN.$ew");
      stringReader0.reset();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "@K055n9-R8[tKN.$ew");
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.prevCharIsCR = false;
      Token token0 = Token.newToken(701);
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.jjmatchedKind = 0;
      Token token1 = javaParserTokenManager0.getNextToken();
      token0.endLine = 385;
      token1.next = token0;
      javaParserTokenManager0.TokenLexicalActions(token1);
      stringReader0.close();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      assertEquals(2, javaCharStream0.getBeginColumn());
      assertEquals(7, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(9);
      StringReader stringReader0 = new StringReader("eT0!W+");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "eT0!W+");
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = Token.newToken(9);
      javaParserTokenManager0.SkipLexicalActions(token0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager1.TokenLexicalActions(token0);
      stringReader0.close();
      javaParserTokenManager1.getNextToken();
      javaParserTokenManager1.MoreLexicalActions();
      assertEquals(3, javaCharStream0.bufpos);
      assertEquals(4, javaCharStream0.getEndColumn());
  }
}
