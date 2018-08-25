/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 17:02:26 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.SupportingDocument;
import macaw.businessLayer.User;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupportingDocument_ESTest extends SupportingDocument_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.getDescription();
      User user0 = new User("", "");
      supportingDocument0.setIdentifier(0);
      user0.setAffiliation("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getIdentifier();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setIdentifier((-3216));
      supportingDocument0.setTitle(".C");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.isNewRecord();
      supportingDocument0.isNewRecord();
      supportingDocument0.getFilePath();
      supportingDocument0.getFilePath();
      supportingDocument0.getTitle();
      supportingDocument0.getDisplayName();
      supportingDocument0.getTitle();
      assertEquals("-3216", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.isNewRecord();
      supportingDocument0.getDocumentCode();
      User user0 = new User();
      user0.setPhone("");
      user0.setAddressLine1("");
      user0.setCity("");
      user0.setAddressLine2("");
      supportingDocument0.setIsNewRecord(false);
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, arrayList0.size());
      
      supportingDocument0.setFileName("");
      supportingDocument0.setFilePath("");
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDescription("");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      
      supportingDocument0.isNewRecord();
      supportingDocument0.getDisplayItemIdentifier();
      assertNotSame(supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6393405872324323
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.clone();
      supportingDocument0.setIdentifier(115);
      supportingDocument0.setFilePath("Ni,^ywem9timzvfu");
      supportingDocument0.setDescription("gB9g{ WD5f@b{");
      supportingDocument0.setDescription("gB9g{ WD5f@b{");
      supportingDocument0.setFileName("gB9g{ WD5f@b{");
      supportingDocument0.setDescription("I'OB[C!o;@-");
      supportingDocument0.setTitle("");
      supportingDocument0.setDocumentCode("");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDescription("");
      supportingDocument0.getDisplayName();
      supportingDocument0.isNewRecord();
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "j03%5M)^X/u-|9>&RH\\";
      supportingDocument0.setDocumentCode("j03%5M)^X/u-|9>&RH");
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.getIdentifier();
      supportingDocument0.getFileName();
      supportingDocument0.setIdentifier(41);
      supportingDocument0.getFilePath();
      String string0 = "hv5)@E)\\@ghi9-k|`+";
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setTitle("hv5)@E)@ghi9-k|`+");
      supportingDocument0.isNewRecord();
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.8389889331546985
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("^MM%zK");
      User user0 = new User("eV6-Bj-&Ypt0<+s3%.", "-");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, arrayList0.size());
      
      supportingDocument0.setDocumentCode("-");
      supportingDocument0.setFilePath("NO_ONTOLOGY_TERM_FILTER");
      supportingDocument0.setDocumentCode("NO_ONTOLOGY_TERM_FILTER");
      supportingDocument0.setFileName("7U:*xO~K");
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("7U:*xO~K", supportingDocument1.getFileName());
      assertEquals("NO_ONTOLOGY_TERM_FILTER", supportingDocument1.getFilePath());
      assertEquals("NO_ONTOLOGY_TERM_FILTER", supportingDocument1.getDocumentCode());
      
      supportingDocument0.setTitle("1&]EW");
      supportingDocument0.setFilePath("BqZ<");
      supportingDocument0.setFilePath("");
      supportingDocument0.getFilePath();
      supportingDocument0.setFileName(",Pu");
      supportingDocument0.setDescription("");
      supportingDocument0.setDescription("\u0004C%");
      supportingDocument0.getFilePath();
      supportingDocument0.getDocumentCode();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("1&]EW-NO_ONTOLOGY_TERM_FILTER", string0);
      
      supportingDocument0.getIdentifier();
      String string1 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string1);
      
      supportingDocument0.setIdentifier(0);
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertNotSame(supportingDocument0, supportingDocument1);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.775975553103794
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("");
      supportingDocument0.setDescription("UNABLE_TO_GET_ALL_SUPPORTING_DOCUMENTS");
      supportingDocument0.setIdentifier(0);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setTitle("0");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, arrayList0.size());
      
      supportingDocument0.getTitle();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getFilePath();
      supportingDocument0.setFilePath("0");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.setFilePath("R");
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.setDocumentCode("0");
      supportingDocument0.setFileName("");
      supportingDocument0.getFilePath();
      supportingDocument0.getDisplayName();
      supportingDocument0.getTitle();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("0-0", string0);
      
      supportingDocument0.getFilePath();
      supportingDocument0.setFileName("0-0");
      supportingDocument0.setFilePath("0");
      supportingDocument0.getIdentifier();
      supportingDocument0.getDescription();
      SupportingDocument.validateFields(supportingDocument0);
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument0);
      assertEquals(3, arrayList1.size());
      
      SupportingDocument supportingDocument3 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList2 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument3);
      assertEquals(3, arrayList2.size());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument3.getIdentifier());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }
}