/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 07:09:33 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.getDisplayName();
      User user0 = new User((String) null, "");
      user0.setEmail("");
      user0.setPostCode("null-");
      // Undeclared exception!
      try { 
        User.validateFields(user0);
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument1.setFileName("");
      String string0 = "YB\\ak8rwoQ";
      try { 
        User.checkValidUserIDField("YBak8rwoQ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The field \"User ID\" value \"YBak8rwoQ\" may present a security risk.
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
      supportingDocument0.setIsNewRecord(true);
      String string0 = null;
      supportingDocument0.setIsNewRecord(true);
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
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "cGt4gs|L>";
      supportingDocument0.setTitle("cGt4gs|L>");
      supportingDocument0.getFileName();
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
  /*Coverage entropy=2.236599436197459
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "";
      supportingDocument0.setDescription("");
      supportingDocument0.setIdentifier(0);
      supportingDocument0.getTitle();
      String string1 = "JGA:";
      User user0 = new User("JGA:", "!J]Xr%MNu@xc");
      user0.setFirstName("!J]Xr%MNu@xc");
      String string2 = "supportingDocument.title.label";
      supportingDocument0.setDescription("");
      supportingDocument0.setIdentifier(0);
      user0.setEmail("supportingDocument.title.label");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      supportingDocument0.getDisplayName();
      supportingDocument0.getFileName();
      supportingDocument0.setFileName("-supportingDocument.filePath.saveChanges");
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setFileName((String) null);
      supportingDocument0.setIdentifier((-1093));
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDocumentCode("fZ0j~W[M^4W");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setIdentifier(185);
      supportingDocument0.setDescription("fZ0j~W[M^4W");
      assertEquals(185, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
      assertEquals("1421", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getIdentifier();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setFileName("[4O_*w!ak#(;)");
      User user0 = new User("L&^O~f4_-sSk/", "L&^O~f4_-sSk/");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle("w");
      supportingDocument1.setIsNewRecord(false);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      
      supportingDocument0.setTitle("supportingDocument.documentCode.label");
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      User user0 = new User("2[`&bD`\"Fm", "k#z+y)Xqu.");
      user0.setCity("Km3mn*,Yo:");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("5Uu>L2:i/OD*hgX");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      boolean boolean0 = supportingDocument1.isNewRecord();
      assertFalse(boolean0);
      
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertTrue(supportingDocument0.isNewRecord());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("BW[__y^]:");
      supportingDocument1.setIdentifier(97);
      supportingDocument1.getTitle();
      User user0 = new User("NON_EXISTENT_ALIAS_FILE_PATH", "JGA:");
      user0.setFirstName("");
      supportingDocument0.setDescription("NON_EXISTENT_ALIAS_FILE_PATH");
      supportingDocument1.setIdentifier(0);
      user0.setEmail("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("");
      supportingDocument0.setDocumentCode("UNABLE_TO_DELETE_DERIVED_VARIABLE");
      User user1 = new User("]]hQX3jDc", "6)Kbxo\"`nrP?2");
      user1.setPostCode("UNABLE_TO_DELETE_SUPPORTING_DOCUMENT");
      user0.setCity("");
      user1.setPassword("supportingDocument.documentCode.label");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      supportingDocument0.setFileName("UNABLE_TO_GET_VALUE_LABEL_IDENTIFIER");
      supportingDocument0.isNewRecord();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      assertEquals(0, arrayList1.size());
      assertFalse(arrayList1.equals((Object)arrayList0));
      
      supportingDocument1.setFilePath((String) null);
      supportingDocument2.setFilePath("");
      supportingDocument1.setDocumentCode("");
      String string0 = supportingDocument2.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      ArrayList<MacawChangeEvent> arrayList2 = SupportingDocument.detectFieldChanges(user1, supportingDocument2, supportingDocument1);
      assertEquals(0, supportingDocument2.getIdentifier());
      assertEquals(1, arrayList2.size());
  }
}
