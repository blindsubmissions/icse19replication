/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:07:24 GMT 2018
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "64hMBxqU";
      supportingDocument0.clone();
      supportingDocument0.setTitle("64hMBxqU");
      supportingDocument0.setFileName("64hMBxqU");
      supportingDocument0.setTitle("64hMBxqU");
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("Jpw7Dq=");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFileName();
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setIdentifier(3130);
      supportingDocument0.getDisplayName();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.clone();
      supportingDocument0.isNewRecord();
      supportingDocument0.getDescription();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.getDescription();
      supportingDocument0.setDocumentCode(">nx$/=2");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFilePath();
      supportingDocument0.setDocumentCode("supportingDocument.fileName.label");
      supportingDocument0.getFilePath();
      assertEquals("3130", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setTitle("");
      supportingDocument0.setIdentifier(144);
      supportingDocument0.isNewRecord();
      supportingDocument0.isNewRecord();
      supportingDocument0.getFileName();
      supportingDocument0.isNewRecord();
      supportingDocument0.clone();
      supportingDocument0.getDescription();
      supportingDocument0.setIdentifier(144);
      supportingDocument0.setIdentifier((-2421));
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument1.setFileName("+=i)RA4R$~S&IWn.");
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.setFilePath("");
      String string0 = "vxPFWUYiKp%7=w$A";
      User user0 = new User("vxPFWUYiKp%7=w$A", "");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("");
      supportingDocument0.getDisplayName();
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields((SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setTitle("");
      String string1 = "K";
      supportingDocument0.setFilePath("K");
      supportingDocument0.setDescription("p~$0Nq\"oip)c");
      supportingDocument0.clone();
      supportingDocument0.getDisplayName();
      supportingDocument0.getTitle();
      supportingDocument0.isNewRecord();
      supportingDocument0.isNewRecord();
      User user0 = new User("7qDgh]w_aL7f0W", "Z.)r6Ox:BJWP<`");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      User user1 = new User();
      User.detectFieldChanges(user1, user1, user1);
      user1.setAddressLine2("supportingDocument.title.label");
      // Undeclared exception!
      try { 
        User.checkValidEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("fu,o$G");
      supportingDocument0.getDisplayName();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      User user0 = new User("^#rCR5YPjiPDiD=a%`", "`Z2HsQ)?F?^");
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
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
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("GXraN-E");
      supportingDocument0.setIdentifier(0);
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("GXraN-E-", string0);
      
      supportingDocument0.getDocumentCode();
      User user0 = new User();
      user0.setIdentifier(0);
      user0.setPassword("");
      User.checkValidUserIDField("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      
      supportingDocument1.setDocumentCode((String) null);
      supportingDocument0.setDocumentCode((String) null);
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument2.getIdentifier());
      assertEquals("GXraN-E", supportingDocument2.getTitle());
      
      supportingDocument1.setFilePath("K J3T-tIiH/xJWO\"");
      supportingDocument1.setDocumentCode("");
      supportingDocument0.setFileName("INVALID_CLEANING_STATE");
      supportingDocument0.setFileName("GXraN-E-");
      int int0 = supportingDocument1.getIdentifier();
      assertEquals(0, int0);
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getTitle();
      supportingDocument0.setFilePath("");
      assertNotSame(supportingDocument0, supportingDocument2);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("-");
      String string0 = "XU:b)";
      supportingDocument0.setDescription("XU:b)");
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
  //Test case number: 8
  /*Coverage entropy=2.582306344313967
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("-");
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("UNABLE_TO_GET_CONNECTION");
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode("-");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges--");
      supportingDocument0.setFilePath("supportingDocument.filePath.saveChanges--");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDescription("supportingDocument.title.saveChanges");
      supportingDocument0.setDescription("supportingDocument.filePath.saveChanges--");
      supportingDocument0.setIdentifier((-816));
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.clone();
      supportingDocument0.clone();
      supportingDocument0.getDescription();
      assertEquals((-816), supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.08676875496392
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("macaw.system.MacawErrorType");
      String string0 = "supportingDocument.fileName.saveChanges";
      supportingDocument0.setFileName("supportingDocument.fileName.saveChanges");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
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
}
