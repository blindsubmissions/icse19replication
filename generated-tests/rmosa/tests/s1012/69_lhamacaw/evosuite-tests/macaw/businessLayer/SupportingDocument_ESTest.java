/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:24:09 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("3F)");
      User user0 = new User("SH\"[\"OiB", "SH\"[\"OiB");
      String string0 = "";
      user0.setAddressLine1("3F)");
      supportingDocument0.clone();
      try { 
        User.checkValidEmail("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("y");
      supportingDocument0.setIdentifier(1);
      supportingDocument0.setIdentifier((-1543));
      supportingDocument0.setIdentifier(1607);
      supportingDocument0.isNewRecord();
      supportingDocument0.getFileName();
      supportingDocument0.getFileName();
      assertEquals("1607", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setTitle("$");
      supportingDocument0.getDescription();
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
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("general.fieldValue.unknown");
      boolean boolean0 = true;
      supportingDocument0.setIsNewRecord(true);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      int int0 = supportingDocument1.getIdentifier();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("macaw.system.ChangeEventType");
      supportingDocument0.setFilePath("macaw.system.ChangeEventType");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFilePath("macaw.system.ChangeEventType");
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      int int0 = 2062;
      supportingDocument1.setIdentifier(2062);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument1.getDisplayItemIdentifier();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getDisplayName();
      supportingDocument1.setIsNewRecord(true);
      int int1 = (-1170);
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setFilePath("qd]%/\"#vw:9qGST");
      User user0 = new User();
      user0.clone();
      User user1 = new User();
      user1.setAddressLine2((String) null);
      user1.setCounty("UNABLE_TO_INITIALISE_CONNECTION");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument0.setFilePath("gX:tr!Y");
      user0.setCity("gX:tr!Y");
      int int0 = 151;
      supportingDocument0.setIdentifier(294);
      User user2 = new User();
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument2.getDisplayItemIdentifier();
      supportingDocument2.getDisplayName();
      supportingDocument2.setIsNewRecord(true);
      try { 
        SupportingDocument.validateFields(supportingDocument2);
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDescription("ge3 [FBU4l1");
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      int int0 = (-2259);
      user0.setIdentifier((-2259));
      User user1 = new User();
      user1.setFirstName("f{a8h6]*F!W^IQ;0[{");
      String string0 = ">O";
      String string1 = "qd]%/\"#vw:9qGST";
      User user2 = new User(">O", "qd]%/\"#vw:9qGST");
      user2.setPostCode("f{a8h6]*F!W^IQ;0[{");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument1);
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
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDocumentCode("0");
      supportingDocument0.setTitle("0");
      supportingDocument0.setTitle("$");
      User user0 = new User("0", "-SsUOX_ZR=,B");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(2, arrayList0.size());
      
      int int0 = supportingDocument1.getIdentifier();
      assertEquals(0, int0);
      
      String string0 = supportingDocument1.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument1);
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertTrue(arrayList1.isEmpty());
  }
}
