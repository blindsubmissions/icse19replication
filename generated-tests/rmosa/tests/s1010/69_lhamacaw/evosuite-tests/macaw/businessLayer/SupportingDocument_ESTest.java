/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:29:32 GMT 2018
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
  /*Coverage entropy=1.4205719259467045
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "";
      supportingDocument0.setFilePath("");
      boolean boolean0 = true;
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("!C:'`zw");
      supportingDocument0.setFileName("Y;BA;D+2>|");
      supportingDocument0.setDescription("Y;BA;D+2>|");
      supportingDocument0.setDescription((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayItemIdentifier();
      String string0 = "UNABLE_TO_GET_USER_IDENTIFIER";
      supportingDocument0.setFileName("!C:'`zw");
      supportingDocument1.getDisplayName();
      supportingDocument1.setDescription("&Ruy%a#og[8");
      supportingDocument0.setIdentifier(84);
      supportingDocument1.setFilePath("(Ek");
      supportingDocument0.getDisplayName();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getDisplayName();
      supportingDocument0.isNewRecord();
      supportingDocument1.getDisplayName();
      supportingDocument1.setFileName("V)<NVn<oG");
      try { 
        User.checkValidEmail("supportingDocument.title.label");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"supportingDocument.title.label\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.getIdentifier();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDescription("-");
      supportingDocument0.setFilePath("4{");
      supportingDocument0.isNewRecord();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setTitle("supportingDocument.title.saveChanges");
      User user0 = new User("DUPLICATE_SUPPORTING_DOCUMENT", "");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setTitle("-");
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      supportingDocument0.getDocumentCode();
      supportingDocument0.clone();
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setDescription("Z5S<MA5 T\"RNpf");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("Z5S<MA5 T\"RNpf", supportingDocument1.getDescription());
      assertEquals(0, supportingDocument1.getIdentifier());
      
      supportingDocument0.getTitle();
      supportingDocument0.getDescription();
      supportingDocument0.setFileName("1{U");
      supportingDocument0.setDocumentCode("general.error.blankField");
      String string1 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string1);
      
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      assertEquals(3, arrayList0.size());
      assertFalse(supportingDocument2.isNewRecord());
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "g}\"B3?aXD4*\\d:";
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("g}\"B3?aXD4*d:");
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
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("rS=3+qn#Q^=K-}");
      supportingDocument0.clone();
      supportingDocument0.getDocumentCode();
      supportingDocument0.isNewRecord();
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument0.setFilePath("");
      supportingDocument0.getIdentifier();
      String string0 = "m=&B";
      User user1 = new User("m=&B", "");
      user1.setPhone("H,Y");
      user1.setAddressLine1((String) null);
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      supportingDocument0.setIdentifier(0);
      SupportingDocument supportingDocument2 = null;
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument1, (SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "+vA2a@?1#WXrr";
      supportingDocument0.setIdentifier(2774);
      supportingDocument0.setFileName("+vA2a@?1#WXrr");
      supportingDocument0.setFileName("_Dps3UeXdZ");
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("4{");
      supportingDocument0.setDescription("g}\"B3?aXD4*d:");
      supportingDocument0.setTitle("4{");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setIdentifier(276);
      supportingDocument0.setIdentifier(1969);
      supportingDocument0.setFileName("g}\"B3?aXD4*d:");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getFileName();
      supportingDocument0.setTitle("general.error.blankField");
      supportingDocument0.clone();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setFileName("macaw.system.MacawException");
      assertEquals("1969", supportingDocument0.getDisplayItemIdentifier());
  }
}
