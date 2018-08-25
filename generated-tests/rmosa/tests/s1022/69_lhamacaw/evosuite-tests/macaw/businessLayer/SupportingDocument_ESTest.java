/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 15:28:22 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("a2H;Fk;R703/.");
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDisplayItemIdentifier();
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
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "supportingDocument.documentCode.label";
      supportingDocument0.setDescription("supportingDocument.documentCode.label");
      supportingDocument0.setDescription("supportingDocument.documentCode.label");
      supportingDocument0.setFileName("O+:6uD|h5<+0");
      supportingDocument0.getDocumentCode();
      supportingDocument0.setFilePath("supportingDocument.documentCode.saveChanges");
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User((String) null, "WYe4");
      user0.setEmail("L;IoBM");
      user0.setStatus("supportingDocument.fileName.saveChanges");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getFileName();
      supportingDocument0.getDescription();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getFileName();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setIsNewRecord(true);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getIdentifier();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getFileName();
      supportingDocument2.getTitle();
      supportingDocument1.setDocumentCode(",");
      supportingDocument1.setDocumentCode("L;IoBM");
      User user1 = new User();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument3, supportingDocument0);
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
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("supportingDocument.documentCode.label");
      supportingDocument0.setDescription("supportingDocument.documentCode.label");
      User user0 = new User();
      user0.setEmail("]j-8Cp-(PcI");
      user0.setLastName("}pc");
      User user1 = new User((String) null, "supportingDocument.documentCode.label");
      User user2 = new User();
      user2.setPostCode("UNABLE_TO_CHECK_ALIAS_FILE_PATH_EXISTS");
      supportingDocument0.setTitle("supportingDocument.documentCode.label");
      user1.clone();
      supportingDocument0.setDescription("]j-8Cp-(PcI");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument0.setIsNewRecord(false);
      supportingDocument1.getIdentifier();
      supportingDocument1.getFileName();
      supportingDocument0.getTitle();
      supportingDocument1.setDocumentCode("");
      supportingDocument0.setDocumentCode("}pc");
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("}pc", "");
      user0.setCounty("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("}pc");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("}pc");
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      supportingDocument0.setIdentifier((-678));
      supportingDocument0.setDocumentCode((String) null);
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
  //Test case number: 5
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setFileName(",+-J-OEgQW8");
      supportingDocument0.getDisplayName();
      User user0 = new User("uv?rJT\"Bo{6(62C;~", ",+-J-OEgQW8");
      user0.setAffiliation(",+-J-OEgQW8");
      user0.setEmail("-");
      user0.setLastName("uv?rJT\"Bo{6(62C;~");
      supportingDocument0.setFileName("");
      user0.setAffiliation("9?");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument1.setIsNewRecord(true);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument1.setDescription("9?");
      supportingDocument1.getFilePath();
      supportingDocument0.clone();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setFilePath("lZ1");
      supportingDocument1.setDescription("B$<j 4kRI<?l");
      supportingDocument1.getIdentifier();
      supportingDocument0.getFileName();
      supportingDocument1.setFilePath(",+-J-OEgQW8");
      supportingDocument0.getDescription();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getDocumentCode();
      supportingDocument1.getDisplayItemIdentifier();
      supportingDocument1.setFileName((String) null);
      User user1 = new User("M#,xIOXMv%QpnzmwbG", "dv&\"f1(9^@CRA(");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument2, supportingDocument1);
      assertTrue(supportingDocument1.isNewRecord());
      assertEquals(3, arrayList0.size());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.setFileName(",+-J-OEgQW8");
      supportingDocument0.getFileName();
      User user0 = new User(",+-J-OEgQW8", (String) null);
      user0.setAffiliation("B$<j 4kRI<?l");
      user0.setEmail(",+-J-OEgQW8");
      user0.setLastName("h@/<jSXKR8|m1");
      supportingDocument0.setFileName("supportingDocument.documentCode.saveChanges");
      User user1 = new User();
      user1.setAffiliation("DUPLICATE_SUPPORTING_DOCUMENT_CODE");
      user0.setPostCode(",+-J-OEgQW8");
      supportingDocument0.setTitle(",+-J-OEgQW8");
      user0.clone();
      supportingDocument0.setDescription((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("macaw.businessLayer.SupportingDocument");
      supportingDocument0.setDescription("macaw.businessLayer.SupportingDocument");
      supportingDocument0.setFileName("O+:6uD|h5<+0");
      User user0 = new User();
      user0.setEmail("]j-8Cp-(PcI");
      user0.setLastName("}pc");
      supportingDocument0.setFileName("supportingDocument.documentCode.label");
      User user1 = new User((String) null, "macaw.businessLayer.SupportingDocument");
      User user2 = new User();
      user2.setPostCode("UNABLE_TO_CHECK_ALIAS_FILE_PATH_EXISTS");
      supportingDocument0.setTitle("macaw.businessLayer.SupportingDocument");
      supportingDocument0.setDescription("macaw.businessLayer.SupportingDocument");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(3, arrayList0.size());
      
      supportingDocument0.setIsNewRecord(false);
      int int0 = supportingDocument1.getIdentifier();
      assertEquals(0, int0);
      
      supportingDocument1.getFileName();
      supportingDocument0.getTitle();
      supportingDocument1.setDocumentCode("");
      supportingDocument0.setDocumentCode("}pc");
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
  }
}
