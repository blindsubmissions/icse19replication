/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:36:37 GMT 2018
 */

package weka.core.stemmers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.stemmers.LovinsStemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LovinsStemmer_ESTest extends LovinsStemmer_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0810459782585875
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "8034";
      stringArray0[1] = "Aa^!N(Jf<";
      stringArray0[2] = "8034";
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("D!");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("");
      String string0 = lovinsStemmer0.stem("contents");
      assertEquals("content", string0);
      
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.getRevision();
      assertEquals("8034", string1);
      
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.stem("m1");
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.stemString("");
      assertFalse(string2.equals((Object)string1));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.49875846591288275
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("pex");
      assertEquals("pic", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2399100577564395
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("ent");
      String string0 = lovinsStemmer0.stemString("8034");
      lovinsStemmer0.stem("Hn]5");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.stemString("`PW");
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      String string2 = lovinsStemmer0.stemString("U'xf*lv6@");
      assertEquals("u'xf*lv6@", string2);
      
      lovinsStemmer0.stem("hn]5");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      String string3 = lovinsStemmer0.getRevision();
      assertTrue(string3.equals((Object)string0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0888261712123897
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("INBOOK");
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("t*<$2neT0\"U/|/qj} V");
      assertEquals("t*<$2net0\"u/|/qj} v", string0);
      
      String string1 = lovinsStemmer0.stem("izement");
      assertEquals("iz", string1);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      String string3 = lovinsStemmer0.stemString("incollection");
      assertEquals("incollect", string3);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      String string4 = lovinsStemmer0.stem("mis");
      assertEquals("mi", string4);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.908908734898781
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("uct");
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
  //Test case number: 5
  /*Coverage entropy=1.791759469228055
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "8034";
      stringArray0[1] = "weka.core.stemmers.lovinsstemmer";
      stringArray0[2] = "weka.core.stemmers.lovinsstemmer";
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("weka.core.stemmers.lovinsstemmer");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      String[] stringArray1 = new String[6];
      stringArray1[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray1[1] = "weka.core.stemmers.lovinsstemmer";
      stringArray1[2] = "8034";
      stringArray1[3] = "weka.core.stemmers.lovinsstemmer";
      stringArray1[4] = "weka.core.stemmers.lovinsstemmer";
      stringArray1[5] = "weka.core.stemmers.lovinsstemmer";
      LovinsStemmer.main(stringArray1);
      LovinsStemmer.main(stringArray1);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("weka.core.stemmers.lovinsstemmer");
      lovinsStemmer0.stem("k.");
      lovinsStemmer0.stem("d/&7EmQ4");
      String string2 = lovinsStemmer0.stemString("Key words used for searching or possibly for annotation.");
      assertEquals("key word us for search or pos for annot.", string2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0854099392984664
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "J91)$J>1cKDx6L X.";
      stringArray0[1] = "6VoQ^";
      lovinsStemmer0.stemString("6VoQ^");
      lovinsStemmer0.stem("J91)$J>1cKDx6L X.");
      stringArray0[2] = "";
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      stringArray0[3] = "encies";
      lovinsStemmer0.stemString("ANNOTE");
      stringArray0[4] = "ward";
      stringArray0[5] = "xlp,[;";
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      stringArray0[6] = "";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("Any additional information that can help the reader. The first word should be capitalized.");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stemString("encies");
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.2403441730695675
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4h$(If,";
      stringArray0[1] = "|NunXx\"SI00";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("`PW");
      lovinsStemmer0.stem("4h$(If,");
      String string0 = lovinsStemmer0.stemString("~*]`}6|");
      assertEquals("~*]`}6|", string0);
      
      String string1 = lovinsStemmer0.stem("yz");
      assertEquals("yz", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string2 = lovinsStemmer1.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer1.getRevision();
      String string3 = lovinsStemmer1.stemString("dex");
      assertEquals("dic", string3);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7723805260701166
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("ent");
      lovinsStemmer0.stemString("8034");
      lovinsStemmer0.stem("Hn]5");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("rcil8");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("rcil8");
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.stemString("ORGANIZATION");
      assertEquals("organ", string1);
      
      String string2 = lovinsStemmer0.stemString("ert");
      assertEquals("ers", string2);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("rcil8");
      String string3 = lovinsStemmer0.stemString("Julie Beth Lovins");
      assertEquals("juli beth lovin", string3);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.067807763157761
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("U2");
      assertEquals("u2", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "ap5$_QBDH18Cl";
      lovinsStemmer0.stemString("");
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string2 = lovinsStemmer1.stem("ionuad");
      assertEquals("ionuas", string2);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9242074232752622
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      String string0 = lovinsStemmer0.stem("INBOOK");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.stem("izement");
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("");
      lovinsStemmer0.globalInfo();
      lovinsStemmer1.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer1.stemString("editor");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stem("ionuasend");
      lovinsStemmer1.stem("");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stemString("The name(s) of the author(s), in the format described in the LaTeX book.");
      String string1 = lovinsStemmer1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9242074232752622
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stem(">");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("sdC");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("E;VyORfTh(BUWzK;1t");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("8034");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.toString();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stemString(">");
      String string1 = lovinsStemmer0.stemString("5.7 <= 5.70001 ? ");
      assertEquals("5.7 <= 5.70001 ? ", string1);
      
      String string2 = lovinsStemmer0.stemString("lud");
      assertEquals("lus", string2);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7971347991462773
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "2;E`ZqoviKu|v6z";
      stringArray0[1] = "`w+@WVSI<lM Va<B";
      stringArray0[2] = "-2C(#$c_|v";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("booktitle");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("booktitl");
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray1 = new String[6];
      stringArray1[0] = "8034";
      stringArray1[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray1[2] = "8034";
      stringArray1[3] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray1[4] = "booktitle";
      stringArray1[5] = "booktitl";
      LovinsStemmer.main(stringArray1);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.stemString("booktitl");
      lovinsStemmer0.stem("8034");
      String string1 = lovinsStemmer0.stemString("-2C(#$c_|v");
      assertEquals("-2c(#$c_|v", string1);
      
      String string2 = lovinsStemmer0.stemString("A work that is printed and bound, but without a named publisher or sponsoring institution.");
      assertEquals("a work that is print and bound, but without a nam publishes or sponsor institut.", string2);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2700316752557592
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("U2");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[5];
      String string0 = lovinsStemmer0.stemString("bex");
      assertEquals("bic", string0);
      
      stringArray0[0] = "";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "ap5$_QBDH18Cl";
      stringArray0[4] = "";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("<C)b#Z$tGj!r\"tcX");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getRevision();
      String string2 = lovinsStemmer0.stemString("X;vu0fofrIKFnql+t");
      assertEquals("x;vu0fofrikfnql+t", string2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0123732632915532
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "8034";
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stem("ert");
      assertEquals("ers", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("vX/2i<(");
      lovinsStemmer0.stemString("P{Cm#7(Qf");
      lovinsStemmer0.stemString("vx/2i<(");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string2 = lovinsStemmer1.stemString("\tUses lowercase strings.");
      assertEquals("\tus lowercas string.", string2);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("/:GM)4`Bv0B!");
      lovinsStemmer1.stemString(";jK1u0");
      String string3 = lovinsStemmer1.stemString("8034");
      assertEquals("8034", string3);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.111641288952863
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      String[] stringArray1 = new String[6];
      stringArray1[0] = "8034";
      stringArray1[1] = "8034";
      stringArray1[2] = "m;]5k}5OlAL\t1/h";
      stringArray1[3] = "wek.cor.stemmer.lovinsstemmer";
      stringArray1[4] = "weka.core.stemmers.LovinsStemmer";
      stringArray1[5] = "8034";
      LovinsStemmer.main(stringArray1);
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.stemString("ious");
      lovinsStemmer0.toString();
      String[] stringArray2 = new String[3];
      stringArray2[0] = "";
      stringArray2[1] = "weka.core.stemmers.lovinsstemmer";
      stringArray2[2] = "ious";
      LovinsStemmer.main(stringArray2);
      String string2 = lovinsStemmer0.stemString("ious");
      assertEquals("ious", string2);
      
      lovinsStemmer0.stem("");
      LovinsStemmer.main(stringArray1);
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
      
      LovinsStemmer.main(stringArray1);
      String string4 = lovinsStemmer0.stemString("8034ix");
      assertEquals("8034ic", string4);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.2700316752557592
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("/0L~H ");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stem("/0L~H ");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("h3Pv=>ol\"abW");
      String string0 = lovinsStemmer0.stemString("/0l~h ");
      assertEquals("/0l~h ", string0);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("isms");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("D~,");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      String string2 = lovinsStemmer0.getRevision();
      assertEquals("8034", string2);
      
      lovinsStemmer0.stemString("");
      String string3 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string3);
      
      lovinsStemmer0.toString();
      String string4 = lovinsStemmer0.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.");
      assertEquals("a stemmer ba on th lovin stemmer, describ he:\n\njl beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string4);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.990413677131134
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[4] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string0 = lovinsStemmer2.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer2.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.stemString("ily");
      lovinsStemmer2.stemString("y2!*[0BBJLCnF&eQ_");
      lovinsStemmer1.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer2.toString();
      lovinsStemmer1.toString();
      lovinsStemmer0.stemString("e`Ct8Q/+`{H8CB");
      String string1 = lovinsStemmer1.stemString("8034erid");
      assertEquals("8034eris", string1);
      
      String string2 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string2);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7477359346492541
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4h$(If,";
      stringArray0[1] = "|NunXx\"SI00";
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("4h$(If,");
      assertEquals("4h$(if,", string0);
      
      String string1 = lovinsStemmer0.stemString("rud");
      assertEquals("rus", string1);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string2 = lovinsStemmer1.getRevision();
      assertEquals("8034", string2);
      
      String string3 = lovinsStemmer1.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8410205459886739
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "J91)$J>1cKDx6L X.";
      stringArray0[1] = "J91)$J>1cKDx6L X.";
      lovinsStemmer0.stemString("J91)$J>1cKDx6L X.");
      lovinsStemmer0.stem("J91)$J>1cKDx6L X.");
      stringArray0[2] = "";
      lovinsStemmer0.getRevision();
      stringArray0[3] = "encies";
      String string0 = lovinsStemmer0.stemString("ANNOTE");
      assertEquals("annot", string0);
      
      stringArray0[4] = "ward";
      stringArray0[5] = "xlp,[;";
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      stringArray0[6] = "";
      LovinsStemmer.main(stringArray0);
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.stem("Any additional information that can help the reader. The first word should be capitalized.");
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getTechnicalInformation();
      String string2 = lovinsStemmer0.stemString("Get flag -f: ");
      assertEquals("ges flag -f: ", string2);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9398473390054318
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("INBOOK");
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("t*<$2neT0\"U/|/qj} V");
      assertEquals("t*<$2net0\"u/|/qj} v", string0);
      
      String string1 = lovinsStemmer0.stem("izement");
      assertEquals("iz", string1);
      
      lovinsStemmer0.toString();
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      String string3 = lovinsStemmer0.stemString("incollection");
      assertEquals("incollect", string3);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      String string4 = lovinsStemmer0.stemString("ond");
      assertEquals("ons", string4);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3056390167749121
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.stemString("");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("");
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.globalInfo();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.globalInfo();
      lovinsStemmer1.toString();
      lovinsStemmer3.getTechnicalInformation();
      lovinsStemmer3.globalInfo();
      lovinsStemmer0.stem("$`,v$%y^");
      String string0 = lovinsStemmer1.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer3.stemString("'Z/5G2%1h+iMG w");
      LovinsStemmer lovinsStemmer4 = new LovinsStemmer();
      String string1 = lovinsStemmer4.stemString("'Z/5G2%1h+iMG w");
      assertEquals("'z/5g2%1h+img w", string1);
      
      String string2 = lovinsStemmer2.stemString("ist");
      assertEquals("ist", string2);
  }
}