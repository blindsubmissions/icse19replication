/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:09:06 GMT 2018
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
  /*Coverage entropy=1.1266233058417239
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String[] stringArray0 = new String[1];
      lovinsStemmer0.globalInfo();
      stringArray0[0] = "hes";
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("");
      lovinsStemmer0.stem("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("xKW{,FG=WQB%n");
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("ion");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("hes");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("ion");
      lovinsStemmer0.getRevision();
      TechnicalInformation technicalInformation1 = lovinsStemmer0.getTechnicalInformation();
      assertFalse(technicalInformation1.equals((Object)technicalInformation0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0791372368666592
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("Any additional information that can help the reader. The first word should be capitalized.");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("TECHREPORT");
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("any additional information that can help the reader. the first word should be capitalized.");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      lovinsStemmer0.stem("techreport");
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
  /*Coverage entropy=2.0642580751745085
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.";
      stringArray0[2] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[3] = "k(MY=N^0[pO-^=Jo";
      stringArray0[4] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[5] = "a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.";
      stringArray0[6] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray0);
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("ating");
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.106664673443317
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.stemString("[z9t{f5GT#~3'e]fov");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
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
  //Test case number: 4
  /*Coverage entropy=1.1673974362491342
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = "izability";
      lovinsStemmer0.stem("izability");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("1999");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("7O-z)\\;");
      lovinsStemmer0.stemString("MISC");
      String string1 = "M9!)'K`nJHc(heP$";
      lovinsStemmer0.stemString("M9!)'K`nJHc(heP$");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("1999");
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      stringArray0[1] = "7O-z)\\;";
      stringArray0[2] = "7o-z)\\;";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
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
  //Test case number: 5
  /*Coverage entropy=1.0125793805770906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stemString("How something strange has been published. The first word should be capitalized.");
      String string0 = lovinsStemmer0.stemString("How something strange has been published. The first word should be capitalized.");
      assertEquals("how someth strang ha been publ. th first word should be capital.", string0);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("how someth strang ha been publ. th first word should be capital.");
      lovinsStemmer0.toString();
      String string1 = lovinsStemmer0.stemString("f 3oGZ");
      assertEquals("f 3ogz", string1);
      
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("|-}(pip/P@");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("How something strange has been published. The first word should be capitalized.");
      String[] stringArray0 = new String[6];
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      stringArray0[0] = "|-}(pip/p@";
      stringArray0[1] = "how someth strang ha been publ. th first word should be capital.";
      stringArray0[2] = "how someth strang ha been publ. th first word should be capital.";
      stringArray0[3] = "f 3ogz";
      stringArray0[4] = "8034";
      stringArray0[5] = "How something strange has been published. The first word should be capitalized.";
      LovinsStemmer.main(stringArray0);
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
      
      String string4 = lovinsStemmer0.stem("f 3ogz");
      assertEquals("f 3ogz", string4);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0921939070387652
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getRevision();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stemString("8034");
      lovinsStemmer0.getRevision();
      String string0 = lovinsStemmer0.stem("INCOLLECTION");
      assertEquals("incollect", string0);
      
      lovinsStemmer0.stem("");
      String string1 = lovinsStemmer0.stemString("5H)$<EsMD9iB");
      assertEquals("5h)$<esmd9ib", string1);
      
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stem("8034");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("");
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.getRevision();
      assertEquals("8034", string2);
      
      String string3 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string3);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8051967445325007
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.getRevision();
      LovinsStemmer.main((String[]) null);
      LovinsStemmer.main((String[]) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray0[1] = "8034";
      LovinsStemmer.main(stringArray0);
      String[] stringArray1 = new String[2];
      stringArray1[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      stringArray1[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      LovinsStemmer.main(stringArray1);
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("`'");
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("BOOKLET");
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.getTechnicalInformation();
      String string1 = lovinsStemmer0.getRevision();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.971686045898069
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("uad");
      assertEquals("uas", string0);
      
      String string1 = lovinsStemmer0.stemString("aOUP&");
      assertEquals("aoup&", string1);
      
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      String string3 = lovinsStemmer0.getRevision();
      assertEquals("8034", string3);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1851956848497927
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("A location associated with the entry, such as the city in which a conference took place.");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("a loc associ with th entr, such as th cit in which a confer took plac.");
      String string0 = lovinsStemmer0.stemString("A location associated with the entry, such as the city in which a conference took place.");
      assertEquals("a loc associ with th entr, such as th cit in which a confer took plac.", string0);
      
      lovinsStemmer0.stem("bibtex");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "a loc associ with th entr, such as th cit in which a confer took plac.";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      String string1 = lovinsStemmer0.getRevision();
      assertEquals("8034", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("a loc assoc with th entr, such as th cit in which a confer took plac.");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("bibtic");
      lovinsStemmer0.stem("bibtex");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      String string2 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string2);
      
      lovinsStemmer0.getTechnicalInformation();
      String string3 = lovinsStemmer0.stemString("&nSbtfQ=J$xY'WeT");
      assertEquals("&nsbtfq=j$xy'wes", string3);
      
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      String string4 = lovinsStemmer0.stem("ene");
      assertEquals("en", string4);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2403441730695675
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stemString("A location associated with the entry, such as the city in which a conference took place.");
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("a loc associ with th entr, such as th cit in which a confer took plac.");
      String string0 = lovinsStemmer0.stemString("A location associated with the entry, such as the city in which a conference took place.");
      assertEquals("a loc associ with th entr, such as th cit in which a confer took plac.", string0);
      
      lovinsStemmer0.stem("bibtex");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "a loc associ with th entr, such as th cit in which a confer took plac.";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getRevision();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      lovinsStemmer0.toString();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("a loc assoc with th entr, such as th cit in which a confer took plac.");
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.stemString("bibtic");
      lovinsStemmer0.stem("bibtex");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.globalInfo();
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
      
      lovinsStemmer0.getTechnicalInformation();
      String string2 = lovinsStemmer0.stemString("dex");
      assertEquals("dic", string2);
      
      lovinsStemmer0.stem("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      String string3 = lovinsStemmer0.stem("ene");
      assertEquals("en", string3);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9619144229863392
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.stem("izability");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stem("1999");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("7O-z)\\;");
      lovinsStemmer0.stemString("MISC");
      lovinsStemmer0.stemString("M9!)'K`nJHc(heP$");
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.getTechnicalInformation();
      lovinsStemmer0.toString();
      lovinsStemmer0.stemString("1999");
      lovinsStemmer0.toString();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "weka.core.stemmers.LovinsStemmer";
      lovinsStemmer0.stem("weka.core.stemmers.LovinsStemmer");
      stringArray0[1] = "7O-z)\\;";
      stringArray0[2] = "7o-z)\\;";
      lovinsStemmer0.getRevision();
      lovinsStemmer0.stemString("v,}N");
      lovinsStemmer0.getRevision();
      lovinsStemmer0.globalInfo();
      lovinsStemmer0.stem("[z*RJ\"Qv`E_|");
      LovinsStemmer lovinsStemmer1 = new LovinsStemmer();
      lovinsStemmer1.stem("manual");
      lovinsStemmer0.getTechnicalInformation();
      String string0 = lovinsStemmer0.stem("manual");
      lovinsStemmer1.stem("title");
      LovinsStemmer lovinsStemmer2 = new LovinsStemmer();
      String string1 = lovinsStemmer2.toString();
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8198809053708964
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      lovinsStemmer0.toString();
      lovinsStemmer0.globalInfo();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray0);
      stringArray0[2] = "weka.core.stemmers.LovinsStemmer";
      LovinsStemmer.main(stringArray0);
      stringArray0[3] = "weka.core.stemmers.LovinsStemmer";
      String[] stringArray1 = new String[4];
      stringArray1[0] = "vZtI";
      stringArray1[1] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      stringArray1[2] = "weka.core.stemmers.LovinsStemmer";
      stringArray1[3] = "rqCfB";
      LovinsStemmer.main(stringArray1);
      stringArray0[4] = "weka.core.stemmers.LovinsStemmer";
      stringArray0[5] = "vFn--mg%";
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.getTechnicalInformation();
      LovinsStemmer.main(stringArray0);
      lovinsStemmer0.globalInfo();
      String[] stringArray2 = new String[1];
      stringArray2[0] = "A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.";
      LovinsStemmer.main(stringArray2);
      lovinsStemmer0.globalInfo();
      LovinsStemmer.main(stringArray1);
      LovinsStemmer.main(stringArray2);
      String string0 = lovinsStemmer0.stem("1999erid");
      assertEquals("1999eris", string0);
      
      String string1 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6426379505182007
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
      
      String string1 = lovinsStemmer0.stem("rud");
      assertEquals("rus", string1);
      
      String string2 = lovinsStemmer0.stemString("*YmQMrdZ\"7H)BU>");
      assertEquals("*ymqmrdz\"7h)bu>", string2);
  }
}
