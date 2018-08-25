/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:29:28 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDocumentCode("0");
      supportingDocument0.getFilePath();
      String string0 = null;
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.clone();
      supportingDocument0.getDisplayName();
      String string0 = "9'Vo&h:VP5Mf:Cm";
      supportingDocument0.setFileName("9'Vo&h:VP5Mf:Cm");
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDescription("");
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.setIsNewRecord(true);
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFilePath();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setDescription("");
      supportingDocument0.setDescription("");
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFileName("W;F,aNs})");
      supportingDocument0.setFileName("general.error.blankField");
      supportingDocument0.setFilePath("general.error.blankField");
      supportingDocument0.setDocumentCode("general.error.blankField");
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getDisplayName();
      supportingDocument0.clone();
      supportingDocument0.getDocumentCode();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-general.error.blankField", string0);
      
      supportingDocument0.setDescription("");
      supportingDocument0.setDescription("");
      supportingDocument0.getIdentifier();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setIsNewRecord(false);
      Object object0 = supportingDocument0.clone();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("general.error.blankField", supportingDocument1.getFileName());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("general.error.blankField", supportingDocument1.getDocumentCode());
      
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setIdentifier(0);
      assertNotSame(supportingDocument0, object0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("");
      supportingDocument0.setDescription("fp/=@9CSH``8j&!06");
      supportingDocument0.clone();
      supportingDocument0.setIdentifier((-1583));
      supportingDocument0.setDocumentCode("");
      supportingDocument0.clone();
      String string0 = "k(TP(`t8\\^46Acgu7";
      supportingDocument0.setDescription("k(TP(`t8^46Acgu7");
      String string1 = "!:.K8&ryLMYLG2";
      supportingDocument0.setFilePath("WrPBGgrUH$:*GaY");
      supportingDocument0.setTitle("!:.K8&ryLMYLG2");
      supportingDocument0.setIdentifier((-1583));
      supportingDocument0.setFileName("!:.K8&ryLMYLG2");
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
  /*Coverage entropy=2.3756465481342484
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("UNABLE_TO_GET_CATEGORY");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDescription("0");
      supportingDocument0.getDocumentCode();
      supportingDocument0.getIdentifier();
      boolean boolean0 = true;
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDescription("UNABLE_TO_GET_CATEGORY");
      User user0 = new User("ww6;dGWW|?{]J\"N3i", "supportingDocument.description.saveChanges");
      user0.setStatus("f!On[!r-_");
      User.checkValidUserIDField("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setIdentifier(0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument1.getIdentifier();
      supportingDocument1.setIsNewRecord(true);
      supportingDocument0.setDocumentCode((String) null);
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
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("Iap3A");
      supportingDocument0.setDescription("");
      supportingDocument0.clone();
      supportingDocument0.setIdentifier((-1));
      supportingDocument0.setDocumentCode("fp/=@9CSH``8j&!06");
      supportingDocument0.clone();
      supportingDocument0.setDescription("f-~yMc-y~ek 7");
      supportingDocument0.setFilePath("supportingDocument.title.saveChanges");
      supportingDocument0.setTitle("WrPBGgrUH$:*GaY");
      supportingDocument0.setIdentifier((-1));
      supportingDocument0.setFileName("supportingDocument.documentCode.saveChanges");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setTitle("WrPBGgrUH$:*GaY");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("Iap3A");
      supportingDocument1.setDocumentCode("UNABLE_TO_DELETE_CLEANING_STATE");
      supportingDocument1.getIdentifier();
      supportingDocument1.getIdentifier();
      supportingDocument0.setDocumentCode("fp/=@9CSH``8j&!06");
      assertEquals("-1", supportingDocument0.getDisplayItemIdentifier());
      
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument1.clone();
      assertFalse(supportingDocument2.isNewRecord());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5665989181145106
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("Iap3A");
      supportingDocument0.setIdentifier(2032);
      User user0 = new User("", "2udAImwzamF< TSr");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument1.setTitle("-");
      user0.setStatus("QU6fF");
      supportingDocument1.setDescription("2udAImwzamF< TSr");
      user0.setPhone("-");
      supportingDocument1.setDescription("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument0.getDocumentCode();
      supportingDocument1.getDisplayItemIdentifier();
      supportingDocument1.setDescription("0");
      supportingDocument1.getFilePath();
      supportingDocument0.setDescription("");
      supportingDocument0.getDisplayName();
      supportingDocument1.getDescription();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument1.getDisplayName();
      supportingDocument1.setDocumentCode("0");
      supportingDocument0.setTitle("PyV qx))3mc3H-H|");
      supportingDocument1.setTitle("0");
      supportingDocument0.getFileName();
      supportingDocument0.getFileName();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(2032, supportingDocument0.getIdentifier());
      assertEquals(3, arrayList0.size());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6023807799324814
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      user0.setPostCode("E@rR9");
      supportingDocument0.clone();
      user0.setPostCode("UNABLE_TO_GET_STUDY_YEARS");
      User user1 = (User)user0.clone();
      User user2 = (User)user0.clone();
      user0.setPassword("Zv)NT}<:`>^BjrY;{");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFilePath((String) null);
      user1.setIdentifier((-907));
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user2, supportingDocument2, supportingDocument1);
      supportingDocument1.getDisplayItemIdentifier();
      supportingDocument1.setIsNewRecord(true);
      supportingDocument1.getDocumentCode();
      assertTrue(supportingDocument1.isNewRecord());
      assertFalse(supportingDocument0.isNewRecord());
  }
}
