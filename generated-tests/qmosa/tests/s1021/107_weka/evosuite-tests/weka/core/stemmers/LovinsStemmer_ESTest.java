/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:03:04 GMT 2018
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
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "l";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[2] = "l";
      stringArray0[3] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("l");
      lovinsStemmer0.stemString("l");
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("Proceeding of the Sixteenth International Conference on Machine Learning");
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("0a");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.639031859650177
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("r(D w';u&`tD-` ");
      assertEquals("r(d w';u&`td-` ", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6773909059316823
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("booklet");
      assertEquals("bookles", string0);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.stemString("8034");
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer0.stem("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      String string3 = lovinsStemmer0.stemString("");
      assertFalse(string3.equals((Object)string1));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1318379626024464
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("pr}n#\"a0*tQ.E");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("arization");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("0.JX7(KD!(eTPt<)");
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "0.jx7(kd!(etpt<)";
      stringArray0[1] = "8034";
      stringArray0[2] = "8034";
      stringArray0[3] = "8034";
      stringArray0[4] = "pr}n#\"a0*tQ.E";
      stringArray0[5] = "8034";
      LovinsStemmer.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.782192104471876
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
      
      lovinsStemmer0.stemString("");
      String string1 = lovinsStemmer0.stemString("uad");
      assertEquals("uas", string1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8993098830849456
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Apt9W|pDVHO";
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("!5`eduerid");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stem("her");
      assertEquals("hes", string0);
      
      String string1 = lovinsStemmer0.stemString("\u001E");
      assertEquals("\u001E", string1);
      
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.globalInfo();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer1.getTechnicalInformation();
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8804901314870051
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[8];
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = ")9E";
      lovinsStemmer0.stemString(")9E");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("mit");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString(";I5*\"po6)1");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string1 = null;
      // Undeclared exception!
      try { 
        lovinsStemmer1.stemString((String) null);
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
  /*Coverage entropy=1.0472559679279883
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ities";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("publisher");
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("<@t|{xCA:xb");
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.stem("po6vad");
      assertEquals("po6vas", string1);
      
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getTechnicalInformation();
      String string2 = lovinsStemmer1.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string2);
      
      lovinsStemmer1.stem("");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.getRevision();
      String string3 = lovinsStemmer1.getRevision();
      assertEquals("8034", string3);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.7892730950713935
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("booklet");
      assertEquals("bookles", string0);
      
      lovinsStemmer0.getRevision();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getRevision();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stemString("8034");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.stem("pand");
      lovinsStemmer1.getRevision();
      lovinsStemmer1.getTechnicalInformation();
      String string2 = lovinsStemmer1.stemString("8034");
      assertEquals("8034", string2);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.791759469228055
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.globalInfo();
      lovinsStemmer1.stemString("ikfhrud");
      lovinsStemmer1.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.stem("8034");
      lovinsStemmer1.toString();
      lovinsStemmer0.stemString("ADDRESS");
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main((String[]) null);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.027539370637948
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.toString();
      String[] stringArray1 = new String[1];
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      stringArray1[0] = "va";
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem(".TOf($ZV[be.)QC6");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("cid");
      assertEquals("cis", string0);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getRevision();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.getTechnicalInformation();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.toString();
      LovinsStemmer.main(stringArray1);
      LovinsStemmer lovinsStemmer4 = new LovinsStemmer();
      lovinsStemmer4.getRevision();
      String string1 = lovinsStemmer3.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      String string2 = lovinsStemmer3.getRevision();
      assertEquals("8034", string2);
      
      lovinsStemmer2.toString();
      lovinsStemmer2.stem("cid");
      String string3 = lovinsStemmer2.stem("ousness");
      assertEquals("ous", string3);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.048956757917115
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("ioned");
      lovinsStemmer0.stem("0/(![h2");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("ion");
      String string0 = lovinsStemmer0.stemString("1Yme}',Dj;");
      assertEquals("1ym}',dj;", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("entness");
      String string2 = lovinsStemmer0.stemString("0/(![h2");
      assertEquals("0/(![h2", string2);
      
      String string3 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string3);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1166329241114679
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ities";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("ities");
      lovinsStemmer0.stem("ities");
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer1.stemString(")534Z{S1+!nFr");
      lovinsStemmer1.getRevision();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7190717152634583
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ities";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("ities");
      assertEquals("it", string0);
      
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string1 = lovinsStemmer2.stemString("ikfhlid");
      assertEquals("ikfhlis", string1);
      
      String string2 = lovinsStemmer1.stemString("2N>dKM^KP+");
      assertEquals("2n>dkm^kp+", string2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7275487828883785
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      assertEquals("wek.cor.stemmer.lovinsstemmer", string0);
      
      lovinsStemmer0.stemString("dkmyz");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getRevision();
      String string2 = lovinsStemmer0.getRevision();
      assertEquals("8034", string2);
      
      String string3 = lovinsStemmer0.stemString("dkmrud");
      assertEquals("dkmrus", string3);
      
      lovinsStemmer0.stemString("dkmrus");
      String string4 = lovinsStemmer0.stemString("rr");
      assertEquals("rr", string4);
  }
}