/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:00:16 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.nio.CharBuffer;
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
      StringReader stringReader0 = new StringReader("q3,mL;8=)08supVsp[");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 3273);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 3273. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "<5pXzPO.f)C/mJ&2{0";
      StringReader stringReader0 = new StringReader("<5pXzPO.f)C/mJ&2{0");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-4445), (-4445), 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 0);
      javaParserTokenManager0.input_stream = javaCharStream0;
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-1659));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1659. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("m3");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-356), 9);
      JavaCharStream.hexval('5');
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.mark(45);
      Token token0 = javaParserTokenManager0.getNextToken();
      token0.endLine = 60;
      javaParserTokenManager0.ReInit(javaCharStream0, 0);
      // Undeclared exception!
      try { 
        stringReader0.read((CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v9uZ@");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = new Token();
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      assertEquals(3, javaCharStream0.bufpos);
      assertEquals(4, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3qX6*[xZ");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 9, (-1263));
      JavaCharStream.hexval('5');
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      stringReader0.mark(2145388542);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, 45);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 45. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-td6@i5");
      stringReader0.skip(4L);
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, false);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2561510437264132
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v9u@");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaCharStream0.ReadByte();
      stringReader0.ready();
      Token token0 = new Token();
      javaParserTokenManager0.SkipLexicalActions((Token) null);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.MoreLexicalActions();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(1, javaCharStream0.getColumn());
  }
}
