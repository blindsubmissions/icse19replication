/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:51:37 GMT 2018
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
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupportingDocument_ESTest extends SupportingDocument_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("T.T2.%0}Hws");
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode("T.T2.%0}Hws");
      supportingDocument0.setDocumentCode("");
      supportingDocument0.isNewRecord();
      supportingDocument0.setDocumentCode("T.T2.%0}Hws");
      supportingDocument0.setFileName("");
      supportingDocument0.getIdentifier();
      supportingDocument0.getIdentifier();
      supportingDocument0.setDescription("");
      supportingDocument0.setIdentifier(0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      try { 
        SupportingDocument.validateFields(supportingDocument1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setFilePath("-");
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setDocumentCode("user.city.saveChanges");
      supportingDocument0.getDescription();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getFileName();
      supportingDocument0.setTitle("user.city.saveChanges");
      supportingDocument0.setIsNewRecord(false);
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("s|UCU`\"JbCI");
      supportingDocument0.setIdentifier((-2385));
      supportingDocument0.setFileName("!:!");
      supportingDocument0.setTitle("$6ls");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getIdentifier();
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setIdentifier((-2385));
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getFileName();
      supportingDocument0.setTitle("MJ2r. M;m'}zewBwnh");
      supportingDocument0.getFilePath();
      supportingDocument0.getDocumentCode();
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setFilePath("NON_EXISTENT_VARIABLE");
      supportingDocument0.setIdentifier(1421);
      assertEquals(1421, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2008276490345495
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      User user0 = new User();
      user0.setFirstName("TU3)b");
      user0.clone();
      user0.setUserID("0");
      user0.clone();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setTitle("");
      String string0 = "k8_;.Zv5`U>WW&3Z8";
      supportingDocument0.setDocumentCode("k8_;.Zv5`U>WW&3Z8");
      supportingDocument0.setTitle("0");
      supportingDocument0.getIdentifier();
      supportingDocument0.setTitle("");
      supportingDocument0.getIdentifier();
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
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      User user0 = new User("", "");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("'kuxQKr3:Jz12|");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      System.setCurrentTimeMillis((-2759L));
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("supportingDocument.documentCode.saveChanges");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      System.setCurrentTimeMillis(0L);
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      System.setCurrentTimeMillis((-2759L));
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(2, arrayList1.size());
      
      System.setCurrentTimeMillis((-853L));
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument2);
      System.setCurrentTimeMillis(0L);
      ArrayList<MacawChangeEvent> arrayList2 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertTrue(arrayList2.equals((Object)arrayList0));
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setDescription("");
      supportingDocument0.setDescription("");
      supportingDocument0.setTitle("I");
      supportingDocument0.setFilePath("");
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.isNewRecord();
      supportingDocument0.getFilePath();
      supportingDocument1.clone();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      supportingDocument0.getDocumentCode();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.getDocumentCode();
      supportingDocument0.getDocumentCode();
      supportingDocument3.setIdentifier(1856);
      supportingDocument1.clone();
      supportingDocument2.isNewRecord();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      supportingDocument4.getDisplayItemIdentifier();
      supportingDocument4.setTitle("#q0Q@Z(yvKL#dK<dPRw");
      SupportingDocument supportingDocument5 = new SupportingDocument();
      supportingDocument5.setIsNewRecord(false);
      SupportingDocument supportingDocument6 = new SupportingDocument();
      supportingDocument6.clone();
      supportingDocument3.getIdentifier();
      assertEquals("1856", supportingDocument3.getDisplayItemIdentifier());
      
      supportingDocument4.getTitle();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument5, supportingDocument2);
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.7184734013300127
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("supportingDocument.title.saveChanges");
      User user0 = new User();
      User user1 = (User)user0.clone();
      user0.setAddressLine1("supportingDocument.title.saveChanges");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("supportingDocument.title.saveChanges");
      User user2 = new User((String) null, "supportingDocument.fileName.saveChanges");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      
      supportingDocument1.setTitle("'kuxQKr3:Jz12|");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.isNewRecord();
      supportingDocument2.clone();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.getTitle();
      supportingDocument2.getDocumentCode();
      assertEquals(0, supportingDocument2.getIdentifier());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.getDescription();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("U5iL=URkui_91");
      supportingDocument0.setIdentifier((-251));
      supportingDocument0.setTitle("");
      supportingDocument0.getDescription();
      supportingDocument0.getFileName();
      supportingDocument0.isNewRecord();
      supportingDocument0.setDescription("");
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals("-251", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(arrayList1.equals((Object)arrayList0));
  }
}