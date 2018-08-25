/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 14:31:12 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = "#pUdJGjY3'y'If3";
      supportingDocument1.setFileName("#pUdJGjY3'y'If3");
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
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName((String) null);
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getDisplayItemIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getTitle();
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      String string0 = "UNABLE_TO_CREATE_DATABASE";
      String string1 = "]h~XO";
      supportingDocument0.setFilePath("]h~XO");
      supportingDocument0.setFilePath("UNABLE_TO_CREATE_DATABASE");
      supportingDocument0.setFilePath("]h~XO");
      supportingDocument0.setTitle("UNABLE_TO_CREATE_DATABASE");
      supportingDocument0.setFilePath("UNABLE_TO_CREATE_DATABASE");
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("t9|DbJNN%FX_Wo5.|U@");
      supportingDocument0.getDisplayName();
      assertEquals(0, supportingDocument0.getIdentifier());
      
      supportingDocument0.setIdentifier(1);
      supportingDocument0.getTitle();
      supportingDocument0.setFileName("4)5u`/Q>5~");
      supportingDocument0.setDocumentCode("supportingDocument.fileName.label");
      supportingDocument0.setTitle("r2,:X\":`FXtA<^1=S(:");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setTitle("");
      assertEquals(1, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.isNewRecord();
      supportingDocument0.getTitle();
      User user0 = new User("", "");
      user0.setPassword("");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertTrue(arrayList0.isEmpty());
      
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getFilePath();
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDescription();
      supportingDocument1.setFilePath("-VwR'>|6!M");
      supportingDocument1.setTitle("0");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(2, arrayList1.size());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User((String) null, "UNABLE_TO_ASSOCIATE_SOURCE_VARIABLE");
      user0.setPassword("supportingDocument.documentCode.label");
      user0.setPostCode((String) null);
      user0.setPhone((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.clone();
      supportingDocument1.setDescription("L%M1.#C)rq /Rn:[0");
      supportingDocument0.setFileName("UNABLE_TO_DELETE_ONTOLOGY_TERM");
      User user1 = new User("supportingDocument.documentCode.label", "UNABLE_TO_ASSOCIATE_SOURCE_VARIABLE");
      user1.setPassword("|SEJME^][Ut6");
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      user0.setFirstName("`^\"+=r");
      user0.setIdentifier(1357);
      supportingDocument1.setIsNewRecord(true);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getDisplayName();
      supportingDocument2.getDisplayName();
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument2);
      supportingDocument2.setDocumentCode("`^\"+=r");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.getDescription();
      supportingDocument2.setIsNewRecord(true);
      supportingDocument2.setIdentifier(1357);
      assertEquals("1357", supportingDocument2.getDisplayItemIdentifier());
      
      supportingDocument3.setIsNewRecord(true);
      assertEquals("0", supportingDocument3.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("$", "UNxB+E_TO_CHECK_VARIABLE_DUPLICATES");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getTitle();
      supportingDocument0.setDescription("UNABLE_TO_CHECK_VARIABLE_ASSOCIATION_DUPLICATE");
      supportingDocument0.getFileName();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      assertFalse(arrayList1.equals((Object)arrayList0));
      assertTrue(arrayList1.isEmpty());
      
      ArrayList<MacawChangeEvent> arrayList2 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList2.size());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("DUPLICATE_ALIAS_FILE_PATH");
      supportingDocument1.getIdentifier();
      supportingDocument0.setDescription((String) null);
      supportingDocument1.setDescription("");
      User user0 = new User();
      String string0 = "";
      user0.setUserID("");
      user0.setPassword("");
      user0.setAddressLine1("user.postCode.saveChanges");
      user0.setIdentifier(0);
      supportingDocument1.setIdentifier(3494);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument2);
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
}
