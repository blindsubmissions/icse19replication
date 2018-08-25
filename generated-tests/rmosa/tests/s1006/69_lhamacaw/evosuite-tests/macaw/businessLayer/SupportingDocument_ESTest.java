/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:34:07 GMT 2018
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("7SHj");
      supportingDocument0.setFilePath("7SHj");
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setDocumentCode("o2C");
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setTitle((String) null);
      String string0 = "";
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setFilePath("");
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      String string0 = "UNABLE_TO_GET_USERS";
      supportingDocument0.setDocumentCode("UNABLE_TO_GET_USERS");
      String string1 = "";
      supportingDocument0.getDisplayName();
      User user0 = new User("", "UNABLE_TO_GET_USERS");
      try { 
        User.validateFields(user0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("UNABLE_TO_CHECK_USER_DUPLICATE");
      supportingDocument0.setFileName("UNABLE_TO_CHECK_USER_DUPLICATE");
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("wS:h;1t\u0006");
      supportingDocument0.setTitle("[EW3");
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setTitle("user.phone.saveChanges");
      supportingDocument0.setDescription("m)=s?tL/?chfM");
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setDescription("atEOK,/f x;XS#3Q");
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(7);
      String string0 = "Zku";
      supportingDocument0.setDocumentCode("-");
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
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("");
      User user0 = new User("", "");
      user0.setPhone((String) null);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getFilePath();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("wS:h;1t\u0006");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument0.isNewRecord();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getDescription();
      String string1 = supportingDocument0.getDisplayName();
      assertEquals("-", string1);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("-");
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setDocumentCode("-");
      User user0 = new User("", "1_.$lw5:cU|%\"Y");
      user0.setPhone((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(2, arrayList0.size());
      
      supportingDocument0.getDescription();
      supportingDocument0.getFilePath();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("&a?ll5");
      supportingDocument0.setFilePath("supportingDocument.documentCode.saveChanges");
      supportingDocument0.getFileName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIsNewRecord(true);
      User user0 = new User();
      user0.setPhone("-");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      
      supportingDocument0.getDescription();
      supportingDocument0.getFilePath();
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFilePath();
      supportingDocument0.setFilePath("");
      supportingDocument0.setTitle("");
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      User user1 = (User)user0.clone();
      supportingDocument0.getFileName();
      supportingDocument0.getFileName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFilePath("");
      supportingDocument0.setTitle("-");
      User user2 = new User("-", "");
      String string0 = "";
      user1.setStatus("supportingDocument.documentCode.saveChanges");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      supportingDocument0.setIsNewRecord(true);
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
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setTitle("W5>bS");
      supportingDocument0.setFileName("W5>bS");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDocumentCode("0");
      SupportingDocument.validateFields(supportingDocument0);
      System.setCurrentTimeMillis((-2773L));
  }
}