/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:05:03 GMT 2018
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("al");
      assertEquals("al", string0);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("ant");
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("ant");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("ant");
      lovinsStemmer0.stemString("ant");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("ward");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      String string2 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string2);
      
      String string3 = lovinsStemmer0.stem("EDITION");
      assertEquals("edit", string3);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0819502618282688
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("WuGAQeqAYL;Im");
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[3];
      lovinsStemmer0.getTechnicalInformation();
      stringArray0[0] = "WuGAQeqAYL;Im";
      lovinsStemmer0.globalInfo();
      stringArray0[1] = "WuGAQeqAYL;Im";
      stringArray0[2] = "wugaqeqayl;im";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("nuS[q");
      lovinsStemmer0.stemString("volume");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("WuGAQeqAYL;Im");
      LovinsStemmer.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[7];
      lovinsStemmer0.toString();
      stringArray0[0] = "WABO&r&U|t :z{AP!q";
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("u2x() *l^*gT;|ZM");
      stringArray0[1] = "izers";
      stringArray0[2] = ")vK_NZ)dig_w-@";
      stringArray0[3] = "/c):a,VjR2IUGl<!Yg";
      stringArray0[4] = "";
      stringArray0[5] = "mEbu` ixux";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("u2x() *l^*gT;|ZM");
      stringArray0[6] = "";
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("BOOK");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stemString("Can't add object to itself!");
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String[] stringArray1 = new String[2];
      stringArray1[0] = "BOOK";
      stringArray1[1] = "WABO&r&U|t :z{AP!q";
      LovinsStemmer.main(stringArray1);
      assertEquals(2, stringArray1.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.067807763157761
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("WuGAQeqAYL;Im");
      String string0 = lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[3];
      lovinsStemmer0.getTechnicalInformation();
      stringArray0[0] = "WuGAQeqAYL;Im";
      lovinsStemmer0.globalInfo();
      stringArray0[1] = "WuGAQeqAYL;Im";
      stringArray0[2] = "wugaqeqayl;im";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("HH#5\"");
      lovinsStemmer0.stemString("uad");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("8034");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stemString("WuGAQeqAYL;Im");
      String string1 = lovinsStemmer1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1851956848497927
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("tex");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.stem("The sponsoring institution of a technical report.");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem(":Ik&,UM+7e");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6007400949099436
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("institution");
      String string0 = lovinsStemmer0.stem("institution");
      assertEquals("institut", string0);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("OR4YKI,Sr_bl&A9");
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer1.getRevision();
      String string1 = lovinsStemmer0.getRevision();
      assertEquals("8034", string1);
      
      lovinsStemmer0.stemString("8034");
      String string2 = lovinsStemmer0.stemString("OR4YKI,Sr_bl&A9");
      assertEquals("or4yk,sr_bl&a9", string2);
      
      lovinsStemmer0.toString();
      String string3 = lovinsStemmer0.stemString("ert");
      assertEquals("ers", string3);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.027539370637948
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[25];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      stringArray0[3] = "8034";
      stringArray0[4] = "8034";
      stringArray0[5] = "8034";
      stringArray0[6] = "8034";
      LovinsStemmer.main(stringArray0);
      String string0 = lovinsStemmer0.stemString("8034");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      String string2 = lovinsStemmer0.stemString("8034");
      assertEquals("8034", string2);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("/");
      lovinsStemmer0.toString();
      String string3 = lovinsStemmer0.stem("cid");
      assertEquals("cis", string3);
      
      lovinsStemmer0.stem("");
      String string4 = lovinsStemmer0.stemString("N");
      assertEquals("n", string4);
      
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      String string5 = lovinsStemmer0.getRevision();
      assertTrue(string5.equals((Object)string0));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.107652786215132
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("al");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("lid");
      lovinsStemmer0.stemString("pex");
      lovinsStemmer0.stem("xV}S!/6y9I>u");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.stemString("D(JB%JJRU6Rl`/g");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stemString("xv}s!/6y9i>u");
      String string0 = lovinsStemmer0.stemString("lis");
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("W{*WJ&Ky");
      lovinsStemmer0.stemString("ac");
      lovinsStemmer0.globalInfo();
      lovinsStemmer1.getTechnicalInformation();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.791759469228055
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("iness");
      assertEquals("ines", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("pex");
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.stemString("ines");
      assertEquals("in", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("vad");
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.stem("vas");
      assertEquals("va", string2);
      
      lovinsStemmer0.stemString("ant");
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("in");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      String string4 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string4);
      
      String string5 = lovinsStemmer0.stemString("*bT");
      assertEquals("*bt", string5);
      
      String string6 = lovinsStemmer1.stem("weka.core.stemmers.LovinsStemmer");
      assertEquals("weka.core.stemmers.lovinsstemmer", string6);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.13537267177689
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[7];
      lovinsStemmer0.toString();
      stringArray0[0] = "WABO&r&U|t :z{AP!q";
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stemString("u2x() *l^*gT;|ZM");
      assertEquals("u2x() *l^*gt;|zm", string0);
      
      stringArray0[1] = "izers";
      stringArray0[2] = ")vK_NZ)dig_w-@";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("cO@,");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      LovinsStemmer.main(stringArray0);
      String string1 = lovinsStemmer1.stemString("izers");
      assertEquals("izer", string1);
      
      lovinsStemmer1.getRevision();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.stem("z0o'?");
      String string2 = lovinsStemmer1.stemString("(=A!v-& r:'b(");
      assertEquals("(=a!v-& r:'b(", string2);
      
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
      
      lovinsStemmer0.getRevision();
      String string4 = lovinsStemmer1.stemString("ogen");
      assertEquals("ogen", string4);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0749189489331847
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("OURNAL");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.stemString("arizable");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.stem("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer2.globalInfo();
      lovinsStemmer1.getRevision();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer2.toString();
      lovinsStemmer1.stem("AUTHOR");
      lovinsStemmer2.stemString("`H)Vv3");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.toString();
      lovinsStemmer1.globalInfo();
      lovinsStemmer1.getRevision();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer4 = new LovinsStemmer();
      lovinsStemmer4.getRevision();
      lovinsStemmer1.stem(",[WxQ");
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9560718577335003
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("techreport");
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("1aQIlq\u0004I");
      lovinsStemmer0.stem(",%ANqrB");
      String string0 = lovinsStemmer0.stem("1aQIlq\u0004I");
      assertEquals("1aqilq\u0004", string0);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.toString();
      String string2 = lovinsStemmer0.stem("end");
      assertEquals("ens", string2);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("7[vYs|:3\"#B");
      String string3 = lovinsStemmer1.stemString("8034");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      String string4 = lovinsStemmer1.getRevision();
      assertTrue(string4.equals((Object)string3));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.2403441730695675
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("al");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("lid");
      lovinsStemmer0.stemString("pex");
      lovinsStemmer0.stem("xV}S!/6y9I>u");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stem("al");
      lovinsStemmer0.stem("dex");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stem("rWe*jTh7!w");
      lovinsStemmer0.globalInfo();
      lovinsStemmer1.stem("al");
      lovinsStemmer1.stemString("tex");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer1.toString();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer1.getRevision();
      lovinsStemmer0.stemString("lis");
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[7];
      lovinsStemmer0.toString();
      stringArray0[0] = "WABO&r&U|t :z{AP!q";
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("u2x() *l^*gT;|ZM");
      stringArray0[1] = "izers";
      stringArray0[2] = ")vK_NZ)dig_w-@";
      stringArray0[3] = "/c):a,VjR2IUGl<!Yg";
      stringArray0[4] = "";
      stringArray0[5] = "mEbu` ixux";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("u2x() *l^*gT;|ZM");
      stringArray0[6] = "";
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stem("ally");
      lovinsStemmer0.stemString("a stemmer based on the lovins stemmer, described here:\n\njulie beth lovins (1968). development of a stemming algorithm. mechanical translation and computational linguistics. 11:22-31.cid");
      lovinsStemmer1.globalInfo();
      lovinsStemmer1.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer1.stem("al");
      LovinsStemmer.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9894526349495162
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "A part of a book having its own title.";
      stringArray0[4] = "oJA8";
      stringArray0[5] = "";
      stringArray0[6] = "pF4H98~:rk<W[";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      lovinsStemmer0.stem("oJA8");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("");
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer0.stemString("A part of a book having its own title.");
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.stemString("7WE3\"");
      String string1 = lovinsStemmer2.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0199558456044235
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[2] = "8034";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer1.stem("BF[*pOZT&+G2;(En");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.globalInfo();
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
  //Test case number: 16
  /*Coverage entropy=1.1626416509453747
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("institution");
      lovinsStemmer0.stemString("institut");
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("OR4YKI,Sr_bl&A9");
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      lovinsStemmer1.toString();
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("lidbex");
      LovinsStemmer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.7492371052659756
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("institution");
      lovinsStemmer0.stemString("wabyt");
      lovinsStemmer0.stem("S5O[");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = "inate";
      lovinsStemmer0.getRevision();
      String[] stringArray0 = null;
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stemString("S5O[");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("wabyt");
      lovinsStemmer0.getTechnicalInformation();
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
  //Test case number: 18
  /*Coverage entropy=0.7610447253582144
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("institution");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stemString("H|oRs|jQ5ozn");
      lovinsStemmer1.toString();
      lovinsStemmer1.getRevision();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.stem("linguend");
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.toString();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "OR4YKI,Sr_bl&A9";
      stringArray0[1] = "institution";
      stringArray0[2] = "institut";
      stringArray0[3] = "linguens";
      stringArray0[4] = "linguens";
      stringArray0[5] = "OR4YKI,Sr_bl&A9";
      stringArray0[6] = "H|oRs|jQ5ozn";
      stringArray0[7] = "OR4YKI,Sr_bl&A9";
      stringArray0[8] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.034874936717381
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer1.stem("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.stem("8034ex");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer1.stem("");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string0 = lovinsStemmer2.stem("");
      lovinsStemmer2.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer2.stemString("8034ix");
      String string1 = lovinsStemmer2.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0797300067534268
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("al");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("ant");
      LovinsStemmer.main((String[]) null);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("8034");
      lovinsStemmer1.stem("oJA8");
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.getTechnicalInformation();
      String string0 = lovinsStemmer2.stem("bb");
      assertEquals("bb", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer2.getRevision();
      String string2 = lovinsStemmer0.getRevision();
      assertEquals("8034", string2);
      
      LovinsStemmer.main((String[]) null);
      String string3 = lovinsStemmer2.stemString("An article from a journal or magazine.");
      assertEquals("an articl from a journ or magaz.", string3);
      
      lovinsStemmer0.stemString("oja8");
      lovinsStemmer3.toString();
      String string4 = lovinsStemmer3.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string4);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8804901314870051
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("GRs:X6SBD;<qf@cl");
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[1];
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("gr:x6sbd;<qf@cl");
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("gr:x6sbd;<qf@cl");
      lovinsStemmer0.stem("pF4H98~:rk<W[");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.getTechnicalInformation();
      String string0 = lovinsStemmer1.stem("-4y\"");
      lovinsStemmer1.globalInfo();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.stemString("icant");
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.getTechnicalInformation();
      lovinsStemmer2.globalInfo();
      lovinsStemmer2.stemString("oja8bicmit");
      String string1 = lovinsStemmer1.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9398473390054318
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("al");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("lid");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "al";
      stringArray0[1] = "lis";
      stringArray0[2] = "lid";
      stringArray0[3] = "lis";
      stringArray0[4] = "lid";
      stringArray0[5] = "&F|K4NDc";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("pex");
      lovinsStemmer0.stem("xV}S!/6y9I>u");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer1.getTechnicalInformation();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.stem("pic");
      lovinsStemmer0.toString();
      lovinsStemmer1.stemString("xV}S!/6y9I>u");
      lovinsStemmer2.stem("al");
      lovinsStemmer2.stemString("pex");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer2.stemString("pand");
      lovinsStemmer2.getTechnicalInformation();
      lovinsStemmer1.stemString("yz");
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.globalInfo();
      lovinsStemmer2.getRevision();
      lovinsStemmer3.stemString("j)9:Z|KJI");
      lovinsStemmer0.toString();
      lovinsStemmer1.toString();
      String string1 = lovinsStemmer1.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0571803818589793
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("al");
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "al";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string1);
      
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("8034");
      String string2 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string2);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.toString();
      String string3 = lovinsStemmer0.stemString("The name of a series or set of books. When citing an entire book, the the title field gives its title and an optional series field gives the name of a series or multi-volume set in which the book is published.");
      assertEquals("th nam of a ser or ses of book. when cit an entir book, th th titl field giv it titl and an opt ser field giv th nam of a ser or mult-volum ses in which th book is publ.", string3);
  }
}
