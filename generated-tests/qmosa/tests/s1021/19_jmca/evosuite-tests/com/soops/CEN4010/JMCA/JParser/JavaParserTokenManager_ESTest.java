/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:30:14 GMT 2018
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
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
      StringReader stringReader0 = new StringReader("L");
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("new", "q03^cOafkkEWw{q");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      mockFileInputStream0.release();
      JavaCharStream javaCharStream0 = new JavaCharStream(mockFileInputStream0, 291, 20, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      byte[] byteArray0 = new byte[1];
      mockFileInputStream0.getChannel();
      byteArray0[0] = (byte) (-5);
      mockFileInputStream0.read(byteArray0, 291, (int) (byte) (-5));
      javaCharStream0.ReInit((InputStream) mockFileInputStream0, 31, 0, 20);
      MockPrintStream mockPrintStream0 = new MockPrintStream("||");
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
      Token token0 = Token.newToken(0);
      javaCharStream0.nextCharInd = 0;
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 31);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 31. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Vbu[=!It^p");
      stringReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-765), 0);
      javaCharStream0.maxNextCharInd = (-765);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.jjmatchedPos = 255;
      javaParserTokenManager0.lengthOfMatch = (-765);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.jjFillToken();
      Token token0 = Token.newToken((-765));
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, token0.endColumn);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      StringReader stringReader0 = new StringReader("BAx");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte)0, (byte)0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.jjFillToken();
      Token.newToken(62);
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(2, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5232109529528914
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[1] = (byte) (-87);
      byteArray0[3] = (byte)0;
      StringReader stringReader0 = new StringReader("\"const\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3298, (-500));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      javaParserTokenManager0.ReInit(javaCharStream0, (int) (byte)0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-500));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -500. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("else");
      Locale locale0 = null;
      StringReader stringReader0 = new StringReader("else");
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 417, (-1));
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream1);
      Token token0 = javaParserTokenManager1.getNextToken();
      JavaParserTokenManager javaParserTokenManager2 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager2.SkipLexicalActions(token0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 417);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 417. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.40644910555757063
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      StringReader stringReader0 = new StringReader("x");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte)0, (byte)0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.jjFillToken();
      Token.newToken(62);
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals("x", token0.toString());
      assertEquals(74, token0.kind);
  }
}
