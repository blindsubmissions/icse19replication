/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 04:47:05 GMT 2018
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
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFileName("");
      assertFalse(supportingDocument0.isNewRecord());
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("UNABLE_TO_GET_RAW_VARIABLE");
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      String string0 = supportingDocument1.getDisplayItemIdentifier();
      assertEquals("0", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = true;
      supportingDocument0.getDisplayName();
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertFalse(supportingDocument1.isNewRecord());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("DUPLICATE_VALUE_LABELS_WITHIN_LIST");
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.setTitle("");
      supportingDocument0.getDescription();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setTitle("DUPLICATE_VALUE_LABELS_WITHIN_LIST");
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath("awcpnx(dzP0/9O");
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setFilePath("U\"fezP>7");
      int int0 = (-2749);
      User user0 = new User("awcpnx(dzP0/9O", (String) null);
      user0.setAffiliation("user.status.label");
      user0.setAffiliation("U\"fezP>7");
      try { 
        User.checkValidEmail("^#ollptC;6KYrFyGH");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"^#ollptC;6KYrFyGH\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("");
      String string0 = "r)41u[j]RXR-";
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("r)41u[j]RXR-");
      supportingDocument0.setDocumentCode("aT P^2n=HP5XV_9SlH|");
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("supportingDocument.title.label");
      supportingDocument0.getTitle();
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setTitle("7J;5g8f6d`wkbL-?Vm");
      supportingDocument0.setFileName("7J;5g8f6d`wkbL-?Vm");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(3, arrayList0.size());
      
      supportingDocument1.setFilePath("v(3+");
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("UNABLE_TO_UPDATE_USER");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      User user1 = new User("", "UNABLE_TO_CHECK_DOCUMENT_EXISTS");
      user1.setPhone((String) null);
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument1);
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
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("ilSmh&$dqf<hHD[");
      supportingDocument0.setTitle("UNABLE_TO_GET_CATEGORY_IDENTIFIER");
      supportingDocument0.setFileName("_F2wCnWg+0f9");
      supportingDocument0.setDocumentCode("UNABLE_TO_GET_CATEGORY_IDENTIFIER");
      User user0 = new User();
      user0.setCounty("UNABLE_TO_GET_ALTERNATIVE_VARIABLE");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setIdentifier((-1994091956));
      supportingDocument0.setFilePath("JF:0,wa#c=K");
      supportingDocument0.setDescription("qMii/[2'|+/j");
      User user1 = new User();
      user1.setIdentifier(1071);
      user1.setStatus("supportingDocument.documentCode.label");
      User user2 = new User("^E,=*mgT;u", "UNABLE_TO_GET_CATEGORY_IDENTIFIER");
      user2.setIdentifier((-2064888120));
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument1);
      supportingDocument1.getDescription();
      supportingDocument0.setTitle("qMii/[2'|+/j");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals("-1994091956", supportingDocument0.getDisplayItemIdentifier());
      assertEquals((-1994091956), supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("UNABLE_TO_GET_RAW_VARIABLE");
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument2);
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
}
