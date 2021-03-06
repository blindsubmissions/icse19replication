/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:31:03 GMT 2018
 */

package weka.core.stemmers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.TechnicalInformation;
import weka.core.stemmers.LovinsStemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LovinsStemmer_ESTest extends LovinsStemmer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.9926359148665145
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      String string0 = lovinsStemmer0.stemString("8034");
      assertEquals("8034", string0);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.stemString("institution");
      assertEquals("institut", string1);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("vLcE");
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stemString("institut");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stemString("");
      lovinsStemmer0.toString();
      String string2 = lovinsStemmer0.getRevision();
      assertTrue(string2.equals((Object)string0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.2700316752557592
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dex");
      assertEquals("dic", string0);
      
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "dic";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "dex";
      stringArray0[3] = "dic";
      stringArray0[4] = "(|<kSclT<M~";
      stringArray0[5] = "dex";
      stringArray0[6] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[7] = "dex";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9973184827831406
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("pex");
      lovinsStemmer0.stemString("ician");
      lovinsStemmer0.stem("");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.stemmers.LovinsStemmer", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0605194487641962
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("ary");
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[1] = "";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[4] = "8034";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.990413677131134
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.stem("eris");
      assertEquals("er", string1);
      
      String string2 = lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "eris";
      stringArray0[2] = "eris";
      stringArray0[3] = "erid";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      String string4 = lovinsStemmer0.getRevision();
      assertEquals("8034", string4);
      
      String string5 = lovinsStemmer0.stemString("");
      assertFalse(string5.equals((Object)string2));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0121120068015939
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("EDITOR");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      String string0 = null;
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2419181383146918
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem(" r");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("_7gw~'{!6_");
      String[] stringArray0 = new String[8];
      lovinsStemmer0.toString();
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "_7gw~'{!6_";
      lovinsStemmer0.stemString("p=i");
      stringArray0[2] = "_7gw~'{!6_";
      stringArray0[3] = " r";
      stringArray0[4] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[5] = " r";
      stringArray0[6] = " r";
      stringArray0[7] = "_7gw~'{!6_";
      lovinsStemmer0.stemString("O/wNqAH`Au2'");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("v@rz&");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.stemmers.LovinsStemmer", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7325520881169432
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "itous";
      stringArray0[1] = "=[{\"r3k!:{kIUK";
      stringArray0[2] = "Y1!d'cgp(L9emM";
      stringArray0[3] = "gdajzMPPM/br$";
      stringArray0[4] = "7|x*|w,yAJ";
      stringArray0[5] = "isation";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("Y1!d'cgp(L9emM");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("eness");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("=[{\"r3k!:{kIUK");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8361755455411349
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("ary");
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stem("one");
      lovinsStemmer1.stemString("m8TuD`DnVmnNeH:");
      lovinsStemmer1.getRevision();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer1.stemString("cid");
      lovinsStemmer1.toString();
      String string1 = lovinsStemmer0.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0086074596411065
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
      
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8034";
      String string1 = lovinsStemmer0.stemString("ex");
      assertEquals("ex", string1);
      
      String string2 = lovinsStemmer0.stem("cislid");
      assertEquals("cislis", string2);
      
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("xA%m`h)CFpew,vy;");
      lovinsStemmer1.stemString("i?urC$#Sx? -@\"O^!$");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer1.toString();
      lovinsStemmer1.getTechnicalInformation();
      String string4 = lovinsStemmer1.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string4);
      
      lovinsStemmer1.getTechnicalInformation();
      String string5 = lovinsStemmer1.toString();
      assertFalse(string5.equals((Object)string4));
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8895844533492505
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[4] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[5] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[6] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[7] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[8] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      String[] stringArray1 = new String[9];
      stringArray1[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray1[5] = "%R'>d1,FA}roDNWx";
      stringArray1[7] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray1);
      String string0 = lovinsStemmer0.stem("uiqbvlux");
      assertEquals("uiqbvluc", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.getRevision();
      assertEquals("8034", string1);
      
      String string2 = lovinsStemmer0.stem("%R'>d1,FA}roDNWx");
      assertEquals("%r'>d1,fa}rodnwx", string2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1595400651542491
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("tex");
      lovinsStemmer0.toString();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("cm");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer1.getRevision();
      lovinsStemmer1.getTechnicalInformation();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[4] = "weka.core.stemmers.lovinsstemmer";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stem("arizability");
      assertEquals("ar", string0);
      
      lovinsStemmer1.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer1.getTechnicalInformation();
      String string2 = lovinsStemmer1.stemString("8J^d('.W");
      assertEquals("8j^d('.w", string2);
      
      String string3 = lovinsStemmer1.getRevision();
      assertEquals("8034", string3);
      
      String string4 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string4);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9242074232752622
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stemString(" option.");
      assertEquals(" opt.", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.stem("lud");
      lovinsStemmer0.toString();
      String string2 = lovinsStemmer0.getRevision();
      assertEquals("8034", string2);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.852219593363262
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      String[] stringArray0 = new String[8];
      stringArray0[0] = null;
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.stem("8a,~&mCb");
      lovinsStemmer1.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.stem("Y");
      String string0 = lovinsStemmer1.stem("icality");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer1.stem("ix");
      lovinsStemmer0.stemString("picend");
      lovinsStemmer1.getTechnicalInformation();
      String string1 = lovinsStemmer1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7748795670421903
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("ond");
      // Undeclared exception!
      try { 
        lovinsStemmer1.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0488126818826367
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem(" r");
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[8];
      lovinsStemmer0.toString();
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "_7gw~'{!6_";
      lovinsStemmer0.stemString("p=i");
      stringArray0[2] = " r";
      stringArray0[3] = " r";
      stringArray0[4] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[5] = " r";
      stringArray0[6] = " r";
      stringArray0[7] = " r";
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer1.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.");
      lovinsStemmer1.stemString(" r");
      TechnicalInformation technicalInformation0 = lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stemString("KVqb6uc{+S48?{yv");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stemString("Q|X");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString(" r");
      TechnicalInformation technicalInformation1 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation1.equals((Object)technicalInformation0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0348749367173813
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stem("");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stemString("8034");
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.globalInfo();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer0.stem("8034");
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer3.getTechnicalInformation();
      lovinsStemmer2.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer lovinsStemmer4 = new LovinsStemmer();
      lovinsStemmer4.stemString("icancex");
      lovinsStemmer4.toString();
      lovinsStemmer3.getTechnicalInformation();
      lovinsStemmer1.stemString("icancax");
      LovinsStemmer lovinsStemmer5 = new LovinsStemmer();
      lovinsStemmer5.getTechnicalInformation();
      String string1 = lovinsStemmer2.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8410205459886739
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("qd]%/\"#vw:9qGST");
      lovinsStemmer0.stemString(";^n~BGtfkgX:");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";^n~bgtfkgx:";
      stringArray0[1] = "qd]%/\"#vw:9qGST";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("8034et");
      lovinsStemmer0.stem(";^n~bgtfkgx:");
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1626416509453747
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[4] = "4zw!I`9!l";
      stringArray0[5] = "";
      stringArray0[6] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      stringArray0[7] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("s70-{+jN5fn2");
      lovinsStemmer0.stemString("rud");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("HOWPUBLISHED");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("s70-{+jN5fn2");
      String string0 = lovinsStemmer0.stemString("bex");
      lovinsStemmer1.getTechnicalInformation();
      String string1 = lovinsStemmer1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9398473390054318
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "itous";
      stringArray0[1] = "=[{\"r3k!:{kIUK";
      stringArray0[2] = "Y1!d'cgp(L9emM";
      stringArray0[3] = "gdajzMPPM/br$";
      stringArray0[4] = "7|x*|w,yAJ";
      stringArray0[5] = "isation";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("Y1!d'cgp(L9emM");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("eness");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("bicpand");
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stem("^");
      lovinsStemmer0.getRevision();
      TechnicalInformation technicalInformation1 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation1.equals((Object)technicalInformation0));
  }
}
