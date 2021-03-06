/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 09:46:34 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.StringReader;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("private");
      stringReader0.read();
      int int0 = 52;
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 52, 52, 52);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 52);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 52. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"long\"");
      char[] charArray0 = new char[4];
      charArray0[0] = '+';
      charArray0[1] = '/';
      charArray0[2] = 'j';
      charArray0[3] = 'x';
      stringReader0.read(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-2934), (-1411), 0);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaCharStream javaCharStream0 = null;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      int int0 = (-973);
      javaParserTokenManager0.curLexState = (-973);
      javaParserTokenManager0.MoreLexicalActions();
      StringBuffer stringBuffer0 = new StringBuffer();
      javaParserTokenManager0.image = stringBuffer0;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-973));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -973. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 782);
      int int0 = 0;
      JavaCharStream javaCharStream0 = new JavaCharStream(pushbackInputStream0, 0, 782);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      int int1 = 99;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(99);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 99. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaCharStream javaCharStream0 = new JavaCharStream(mockFileInputStream0, 0, (-1394), 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      char[] charArray0 = new char[7];
      charArray0[0] = '3';
      charArray0[1] = 't';
      charArray0[2] = '[';
      charArray0[3] = 'n';
      charArray0[4] = 'V';
      charArray0[5] = 'y';
      charArray0[6] = 'p';
      javaCharStream0.nextCharBuf = charArray0;
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, true);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cK");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 930, 800, 800);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2930076787813762
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Tb.|jwq9");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(javaParserTokenManager0.debugStream);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      javaParserTokenManager0.debugStream = (PrintStream) mockPrintStream0;
      javaParserTokenManager0.SkipLexicalActions(token0);
      StringBuffer stringBuffer0 = new StringBuffer("");
      stringBuffer0.append((long) 1);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      MockFile mockFile0 = new MockFile(">>=", "Tb.|jwq9");
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0, 1);
      // Undeclared exception!
      try { 
        javaParserTokenManager1.SwitchTo(85);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 85. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4717268326042875
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hpV:./UXKI{r5Vrj");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.MoreLexicalActions();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(3, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hpV:./UXKI{r5Vrj");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.TokenLexicalActions(token0);
      Token token1 = javaParserTokenManager0.getNextToken();
      assertEquals(3, javaCharStream0.bufpos);
      assertEquals(":", token1.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("return");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager1.getNextToken();
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      Token.GTToken token_GTToken0 = new Token.GTToken();
      Token token1 = token_GTToken0.next;
      javaParserTokenManager2.TokenLexicalActions((Token) null);
      javaParserTokenManager1.TokenLexicalActions(token0);
      javaParserTokenManager2.MoreLexicalActions();
      assertEquals(5, javaCharStream0.bufpos);
      assertEquals(6, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.7834428094110023
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("trow");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.TokenLexicalActions(token0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(3, javaCharStream0.bufpos);
      assertEquals(4, javaCharStream0.getColumn());
  }
}
