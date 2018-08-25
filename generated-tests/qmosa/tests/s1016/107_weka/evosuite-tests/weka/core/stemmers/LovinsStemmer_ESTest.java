/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:41:01 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("{,1?E1ZF<Z0vGZg");
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      String string0 = "(x,|[P8M<y";
      lovinsStemmer0.stem("(x,|[P8M<y");
      lovinsStemmer0.getTechnicalInformation();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("{,Y3AGGWNki %");
      lovinsStemmer0.stemString("ive");
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "iv";
      stringArray0[1] = "-n!^HhqVan$d:HClS,";
      stringArray0[2] = "ive";
      stringArray0[3] = "ive";
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("-n!^HhqVan$d:HClS,");
      stringArray0[4] = "iv";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      stringArray0[5] = "iv";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stemString("f");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("f");
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      LovinsStemmer.main(stringArray0);
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9841152443499834
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main((String[]) null);
      String[] stringArray0 = new String[2];
      lovinsStemmer0.toString();
      stringArray0[0] = "ite";
      LovinsStemmer.main((String[]) null);
      stringArray0[1] = "^";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("^");
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("kRPrLxj-cjqA8x");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("f,R6\"?gaPw");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("Z$}I$uM");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8101709166237561
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      lovinsStemmer0.stem("");
      stringArray0[1] = "1)5m|%+s";
      stringArray0[2] = "ix";
      LovinsStemmer.main(stringArray0);
      stringArray0[3] = "[Hp4yj3p! AR-";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("publisher");
      String string0 = lovinsStemmer0.stem("ix");
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0065917256522487
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stem("8'b!");
      assertEquals("8'b!", string0);
      
      lovinsStemmer0.stemString("8'b!");
      lovinsStemmer0.stem("8'b!");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("8'b!");
      lovinsStemmer0.globalInfo();
      String string1 = lovinsStemmer0.stemString("20y/h,rN");
      assertEquals("20y/h,rn", string1);
      
      lovinsStemmer0.globalInfo();
      String string2 = lovinsStemmer0.stemString("8'b!");
      assertEquals("8'b!", string2);
      
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
      
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string4 = lovinsStemmer0.getRevision();
      assertEquals("8034", string4);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = "ADDRESS";
      lovinsStemmer0.stem("ADDRESS");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9653443035352592
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("icalness");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("icalness");
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("ioning");
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stemString("vFE>");
      lovinsStemmer0.stemString("weka.core.stemmers.lovinsstemmer");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      LovinsStemmer.main(stringArray0);
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9070543626840486
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("QqiAk?@");
      String string0 = lovinsStemmer0.stemString("t(g*>78O,<QlL6_6");
      assertEquals("t(g*>78o,<qll6_6", string0);
      
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.stemString("ination");
      assertEquals("inat", string1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.8993098830849456
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "8034";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[4] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[5] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("8034");
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer0.stemString("erid");
      assertEquals("eris", string0);
      
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.stem("*+;_z9");
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      String string2 = lovinsStemmer0.stemString("*+;_z9");
      assertTrue(string2.equals((Object)string1));
      
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("8034");
      lovinsStemmer0.getRevision();
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0125793805770906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("FJ7:mK&,d");
      lovinsStemmer0.stem("2h1]@");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stemString("2h1]@");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stem("UNPUBLISHED");
      assertEquals("unpubl", string0);
      
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("c=vZ]8-Y ?4I?");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("weka.core.stemmers.lovinsstemmer");
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      String string1 = lovinsStemmer0.stemString("The International Standard Serial Number. Used to identify a journal.");
      assertEquals("th intern standard ser number. us to identif a journ.", string1);
      
      lovinsStemmer0.globalInfo();
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer0.getTechnicalInformation();
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
      
      LovinsStemmer.main(stringArray0);
      String string4 = lovinsStemmer0.stemString("2h1]@");
      assertEquals("2h1]@", string4);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.107652786215132
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[8];
      lovinsStemmer0.toString();
      stringArray0[0] = "N<TOl',W+Jh:VaLfn";
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stemString("N<TOl',W+Jh:VaLfn");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("vvD");
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("wek.cor.stemmer.lovinsstemmer");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("Proceeding of the Sixteenth International Conference on Machine Learning");
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("pex");
      String string1 = lovinsStemmer0.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9729150497179929
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.getRevision();
      String string0 = lovinsStemmer0.stem("lovinsstemmerpand");
      lovinsStemmer1.getTechnicalInformation();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      lovinsStemmer0.stem("Xm");
      lovinsStemmer0.getRevision();
      lovinsStemmer1.getRevision();
      lovinsStemmer1.getRevision();
      lovinsStemmer1.stemString("pv-Ld}(u@xbsL4:dHWS");
      lovinsStemmer0.stem("pv-Ld}(u@xbsL4:dHWS");
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7990591844756405
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("s1Sj}uf)zf5I:H/S");
      assertEquals("s1sj}uf)zf5:h/s", string0);
      
      lovinsStemmer0.stemString("MONTH");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "month";
      stringArray0[1] = "A classname has to be provided with the -W option!";
      stringArray0[2] = "s1sj}uf)zf5:h/s";
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.stem("bex");
      assertEquals("bic", string1);
      
      lovinsStemmer0.stem("MONTH");
      lovinsStemmer0.stem("month");
      lovinsStemmer0.stemString("1968");
      String string2 = lovinsStemmer0.stemString("Indices from stable sort (doubles): ");
      assertEquals("indic from st sort (doubl): ", string2);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.067807763157761
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("");
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.stemString("`_%&?S[|3{<5JGD.s?");
      assertEquals("`_%&?s[|3{<5jgd.s?", string1);
      
      lovinsStemmer0.globalInfo();
      String string2 = lovinsStemmer0.stemString("8034");
      assertTrue(string2.equals((Object)string0));
      
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
      
      lovinsStemmer0.getTechnicalInformation();
      String string4 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string4);
      
      lovinsStemmer0.stem("8034");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "`_%&?S[|3{<5JGD.s?";
      stringArray0[1] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      String string5 = lovinsStemmer0.stemString("lux");
      assertEquals("luc", string5);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0821955300387673
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem(" and ");
      lovinsStemmer1.stem(" and ");
      lovinsStemmer0.stem(" and ");
      lovinsStemmer0.toString();
      String string0 = lovinsStemmer1.stemString("$Qcyaccr%L,1");
      assertEquals("$qcyaccr%l,1", string0);
      
      lovinsStemmer1.globalInfo();
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string1 = lovinsStemmer2.stemString("Title of a book, part of which is being cited. See the LaTeX book for how to type titles. For book entries, use the title field instead.");
      assertEquals("titl of a book, part of which is being cit. se th latic book for how to typ titl. for book entr, us th titl field instead.", string1);
      
      String string2 = lovinsStemmer1.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer2.stem("Can't normalize array. Sum is NaN.");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer2.stemString("S:!) ");
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer2.getTechnicalInformation();
      lovinsStemmer1.stem("Title of a book, part of which is being cited. See the LaTeX book for how to type titles. For book entries, use the title field instead.");
      lovinsStemmer0.stem("");
      lovinsStemmer1.stem(" and ");
      String string3 = lovinsStemmer0.stemString("eris");
      assertEquals("er", string3);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.7606176920415182
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("8'b!");
      lovinsStemmer0.stemString("name(s) of editor(s), typed as indicated in the latex book. if there is also an author field, then the editor field gives the editor of the book or collection in which the reference appears.et");
      lovinsStemmer0.stem("8'b!");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("organization");
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("8'b!");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("8'b!");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6135246994120284
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "$|nYqy";
      stringArray0[1] = "iEOluLi$R~@$'|XC";
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      String string0 = lovinsStemmer1.stemString("$|nYqy");
      assertEquals("$|nyq", string0);
      
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.stemString("invalid CVS revision - not enough parts separated by dots!");
      assertEquals("invalis cv revis - not enough part separ by dot!", string1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5775137153768709
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("xmlhex");
      lovinsStemmer0.stemString("xmlhyz");
      lovinsStemmer0.stemString("xmlhys");
      lovinsStemmer0.stemString("1&V6ncN|~4t/;");
      lovinsStemmer0.stemString("nH%p{){Fh$?>/>{>");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.stemmers.LovinsStemmer", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3629234715124521
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = null;
      lovinsStemmer0.stem("ond");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.46429854518271113
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("PUBLISHER");
      lovinsStemmer0.stemString("=D(c");
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stemString("E6cxZ>6bTeGB");
      assertEquals("e6cxz>6btegb", string0);
      
      lovinsStemmer0.stemString("ert");
      lovinsStemmer0.stemString("pand");
      lovinsStemmer0.stemString("pand");
      String string1 = lovinsStemmer0.stemString("ers");
      assertEquals("er", string1);
      
      lovinsStemmer0.stemString("=D(c");
      lovinsStemmer0.stemString("=d(c");
      lovinsStemmer0.stemString("er");
      lovinsStemmer0.stemString("pans");
      String string2 = lovinsStemmer0.stemString("s'-3$_S)/$");
      assertEquals("s'-3$_s)/$", string2);
      
      lovinsStemmer0.stemString("pan");
      lovinsStemmer0.stemString("ondpand");
      lovinsStemmer0.stemString("erid");
      lovinsStemmer0.stemString("=D(c");
      lovinsStemmer0.stemString("pand");
      String string3 = lovinsStemmer0.stemString("et");
      assertEquals("et", string3);
      
      lovinsStemmer0.stemString("=D(c");
      String string4 = lovinsStemmer0.stemString("publishes");
      assertEquals("publish", string4);
      
      lovinsStemmer0.stemString("pans");
      lovinsStemmer0.stemString("pand");
      String string5 = lovinsStemmer0.stemString("pand");
      assertEquals("pans", string5);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5779499003106994
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("QqiAk?@");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "w|z; \"!$4>Ko()M0R+";
      stringArray0[1] = "!X=tK_/\"K";
      stringArray0[2] = "!X=tK_/\"K";
      LovinsStemmer.main(stringArray0);
      String string0 = lovinsStemmer0.stemString("jWR|PGVMPQa?X");
      assertEquals("jwr|pgvmpq?x", string0);
      
      lovinsStemmer0.stemString("w|z; \"!$4>Ko()M0R+");
      String string1 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string1);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.823678916715124
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("xmlhex");
      lovinsStemmer0.stemString("xmlhyz");
      lovinsStemmer0.stemString("xmlhys");
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.stemString("lud");
      assertEquals("lus", string1);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "xmlhy";
      stringArray0[1] = "vq1ZHfz.u3.;\"wwB06O";
      stringArray0[2] = "xmlhyz";
      stringArray0[3] = "vq1ZHfz.u3.;\"wwB06O";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      String string2 = lovinsStemmer0.stemString("xmlhys");
      assertEquals("xmlhy", string2);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7106757258684105
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[8];
      lovinsStemmer0.toString();
      stringArray0[0] = "N<TOl',W+Jh:VaLfn";
      lovinsStemmer0.stem("N<TOl',W+Jh:VaLfn");
      lovinsStemmer0.stemString("N<TOl',W+Jh:VaLfn");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("8034mit");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("r_lv@#guVi7dw[TS");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0192335528646086
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("xmlhex");
      lovinsStemmer0.stemString("', 9Zj\"4 _20xBJ");
      lovinsStemmer0.stemString("', 9zj\"4 _20xbj");
      lovinsStemmer0.stemString("xmlhec");
      String string0 = lovinsStemmer0.stemString("', 9Zj\"4 _20xBJ");
      assertEquals("', 9zj\"4 _20xbj", string0);
      
      String string1 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9536870968261045
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "$|nYqy";
      stringArray0[1] = "iEOluLi$R~@$'|XC";
      stringArray0[2] = "!X=tK_/\"K";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("$|nYqy");
      lovinsStemmer0.stem("$|nYqy");
      LovinsStemmer.main(stringArray0);
      String string0 = lovinsStemmer0.stemString("iEOluLi$R~@$'|XC");
      assertEquals("ieoll$r~@$'|xc", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.8236789167151242
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[8];
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("N<TOl',W+Jh:VaLfn");
      lovinsStemmer0.stem("N<TOl',W+Jh:VaLfn");
      lovinsStemmer0.stem("icant");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("icant");
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("publishrud");
      assertEquals("publishrus", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.stemString("n<tol',w+jh:valfn");
      assertEquals("n<tol',w+jh:valfn", string2);
      
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("publishrud");
      LovinsStemmer.main(stringArray0);
      String string3 = lovinsStemmer1.stemString("}w@![hD!*~&PSNnF");
      assertEquals("}w@![hd!*~&psnnf", string3);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.8709750754114504
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer0.stem("");
      lovinsStemmer1.stem(" and ");
      lovinsStemmer1.stemString("uad");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer1.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer1.stem(" and ");
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6670345760105317
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("s1Sj}uf)zf5I:H/S");
      lovinsStemmer0.stem("g");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("g");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      lovinsStemmer2.toString();
      lovinsStemmer1.stemString("MONTH");
      lovinsStemmer0.globalInfo();
      LovinsStemmer lovinsStemmer3 = new LovinsStemmer();
      lovinsStemmer3.stemString("booklet");
      lovinsStemmer3.globalInfo();
      lovinsStemmer0.stem("journbex");
      lovinsStemmer1.getTechnicalInformation();
      lovinsStemmer0.stemString("5.70001 > 5.7 ? ");
      lovinsStemmer2.stem("fiJc*");
      LovinsStemmer lovinsStemmer4 = new LovinsStemmer();
      lovinsStemmer4.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      // Undeclared exception!
      try { 
        lovinsStemmer2.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
