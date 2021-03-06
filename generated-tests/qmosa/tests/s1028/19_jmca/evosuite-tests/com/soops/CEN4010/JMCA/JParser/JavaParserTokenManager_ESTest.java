/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:23:49 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 0);
      javaParserTokenManager0.ReInit((JavaCharStream) null, 0);
      javaParserTokenManager0.lengthOfMatch = 0;
      int int0 = 119;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit((JavaCharStream) null, 119);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 119. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"false\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1621, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.jjmatchedPos = 1621;
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(6, javaCharStream0.bufpos);
      assertEquals(73, token0.kind);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.jjnewStateCnt = (-1);
      javaCharStream0.ReInit((Reader) stringReader0);
      javaParserTokenManager0.SwitchTo(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("float");
      PrintStream printStream0 = mockPrintStream0.printf("", (Object[]) javaParserTokenManager0.jjstrLiteralImages);
      javaParserTokenManager0.setDebugStream(printStream0);
      MockPrintStream mockPrintStream1 = null;
      try {
        mockPrintStream1 = new MockPrintStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      int int0 = (-2570);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0, (-2570), 0);
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
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("iF");
      stringReader0.ready();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2931), (-2931), 103);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.input_stream = javaCharStream0;
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0);
      javaParserTokenManager0.ReInit(javaCharStream1);
      Token token0 = new Token();
      javaParserTokenManager0.TokenLexicalActions(token0);
      token0.beginColumn = 103;
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.ReInit(javaCharStream1);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, (-2931));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2931. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 76, 0);
      javaCharStream0.maxNextCharInd = 76;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 76, column 1.  Encountered: \"\" (0), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0253262207700677
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 0);
      StringBuffer stringBuffer0 = new StringBuffer(2439);
      javaParserTokenManager0.jjimageLen = 64;
      javaParserTokenManager0.image = stringBuffer0;
      javaParserTokenManager0.MoreLexicalActions();
      Token.GTToken token_GTToken0 = new Token.GTToken();
      token_GTToken0.realKind = 0;
      javaParserTokenManager0.SkipLexicalActions(token_GTToken0);
      javaParserTokenManager0.ReInit((JavaCharStream) null, 0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile((String) null, "", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("tt0}'S5.tM]");
      StringReader stringReader1 = new StringReader("tt0}'S5.tM]");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 76, 1830);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      JavaParserTokenManager javaParserTokenManager1 = null;
      try {
        javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0, 2289);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2289. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4913652347979217
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("import");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 7, (-555));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-1276));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1276. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"false\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1621, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      int int0 = 15;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(int0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 15. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.450805020083924
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)18;
      StringReader stringReader0 = new StringReader(")(?/EH^6Tk;K]2u");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 19, 1621);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-777));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -777. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7387671958967841
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StringReader stringReader1 = new StringReader("7}REe8;$3,W");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader1, 83, 83);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(84);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 84. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5273157686739836
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("tt0}'S5.tM]");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 598, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.readChar();
      javaParserTokenManager1.getNextToken();
      stringReader0.mark(598);
      javaParserTokenManager0.jjFillToken();
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager2.SwitchTo(1);
      // Undeclared exception!
      try { 
        javaParserTokenManager2.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 598, column 4.  Encountered: \"\\'\" (39), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }
}
