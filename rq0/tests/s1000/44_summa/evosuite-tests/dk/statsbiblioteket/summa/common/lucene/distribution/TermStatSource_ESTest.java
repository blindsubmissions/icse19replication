/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:15:31 GMT 2018
 */

package dk.statsbiblioteket.summa.common.lucene.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ctc.wstx.stax.WstxInputFactory;
import dk.statsbiblioteket.summa.common.lucene.distribution.TermStatSource;
import dk.statsbiblioteket.summa.common.util.Triple;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
import javax.xml.stream.XMLEventReader;
import org.apache.lucene.util.BytesRef;
import org.codehaus.jettison.util.FastStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TermStatSource_ESTest extends TermStatSource_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TermStatSource termStatSource0 = null;
      try {
        termStatSource0 = new TermStatSource((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.lucene.store.FSDirectory", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<Iterator<Triple<BytesRef, Long, Long>>> stack0 = new Stack<Iterator<Triple<BytesRef, Long, Long>>>();
      TermStatSource.Merger termStatSource_Merger0 = new TermStatSource.Merger(stack0, "JbhH[#fh");
      // Undeclared exception!
      try { 
        termStatSource_Merger0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not supported
         //
         verifyException("dk.statsbiblioteket.summa.common.lucene.distribution.TermStatSource$Merger", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Iterator<Triple<BytesRef, Long, Long>>> vector0 = new Vector<Iterator<Triple<BytesRef, Long, Long>>>();
      TermStatSource.Merger termStatSource_Merger0 = new TermStatSource.Merger(vector0, "");
      vector0.add((Iterator<Triple<BytesRef, Long, Long>>) termStatSource_Merger0);
      TermStatSource.Merger termStatSource_Merger1 = null;
      try {
        termStatSource_Merger1 = new TermStatSource.Merger(vector0, "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // There were 1 and 0 values. The two numbers should be the same. There is an error in the internal bookkeeping
         //
         verifyException("dk.statsbiblioteket.summa.common.lucene.distribution.TermStatSource$Merger", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6829081047004717
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FastStack fastStack0 = new FastStack();
      WstxInputFactory wstxInputFactory0 = new WstxInputFactory();
      StringReader stringReader0 = new StringReader("<zaB.]!x{gvMLT=4m");
      XMLEventReader xMLEventReader0 = wstxInputFactory0.createXMLEventReader("<zaB.]!x{gvMLT=4m", (Reader) stringReader0);
      fastStack0.add((Object) xMLEventReader0);
      TermStatSource.Merger termStatSource_Merger0 = new TermStatSource.Merger(fastStack0, "<zaB.]!x{gvMLT=4m");
      // Undeclared exception!
      try { 
        termStatSource_Merger0.next();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.ctc.wstx.evt.WStartDocument cannot be cast to dk.statsbiblioteket.summa.common.util.Triple
         //
         verifyException("dk.statsbiblioteket.summa.common.lucene.distribution.TermStatSource$Merger", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Stack<Iterator<Triple<BytesRef, Long, Long>>> stack0 = new Stack<Iterator<Triple<BytesRef, Long, Long>>>();
      String string0 = "epYHL8<bMy-}(+i]o";
      TermStatSource.Merger termStatSource_Merger0 = new TermStatSource.Merger(stack0, "epYHL8<bMy-}(+i]o");
      FastStack fastStack0 = new FastStack();
      fastStack0.add((Object) termStatSource_Merger0);
      TermStatSource.Merger termStatSource_Merger1 = new TermStatSource.Merger(fastStack0, "epYHL8<bMy-}(+i]o");
      // Undeclared exception!
      try { 
        termStatSource_Merger0.next();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Term was null which is illegal at this execution point. There is an error in program logic
         //
         verifyException("dk.statsbiblioteket.summa.common.lucene.distribution.TermStatSource$Merger", e);
      }
  }
}