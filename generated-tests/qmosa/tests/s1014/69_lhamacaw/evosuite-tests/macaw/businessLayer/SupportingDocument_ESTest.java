/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:23:59 GMT 2018
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("LWj_T*");
      supportingDocument0.isNewRecord();
      supportingDocument0.getTitle();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setFileName("LWj_T*");
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
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("%5]5$raqHK/jK");
      user0.setPostCode("dkr");
      user0.setCounty("wF,o");
      supportingDocument0.setFileName("P ");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setFileName("");
      user0.setCounty((String) null);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getFileName();
      supportingDocument0.getIdentifier();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFilePath("wF,o");
      supportingDocument0.getDescription();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDocumentCode((String) null);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertFalse(supportingDocument1.isNewRecord());
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      int int0 = 1;
      supportingDocument0.clone();
      supportingDocument0.setIdentifier(1);
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDisplayName();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setTitle("");
      supportingDocument0.setFilePath("");
      supportingDocument0.setFilePath("");
      boolean boolean0 = false;
      supportingDocument0.setIsNewRecord(false);
      User user0 = new User("", "");
      user0.setLastName("-");
      User.checkValidUserIDField("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      supportingDocument0.getDisplayName();
      supportingDocument1.setTitle("-");
      supportingDocument0.isNewRecord();
      supportingDocument1.setIdentifier(1);
      supportingDocument1.setDocumentCode(">G{LD<bIA");
      supportingDocument0.isNewRecord();
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
  /*Coverage entropy=2.4311306291469954
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setDescription("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User("]ExX]YgK==", "supportingDocument.filePath.saveChanges");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument2);
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setFilePath("]ExX]YgK==");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument3, supportingDocument1);
      SupportingDocument supportingDocument4 = new SupportingDocument();
      supportingDocument4.setTitle("8sR[Q#Qze");
      SupportingDocument supportingDocument5 = new SupportingDocument();
      supportingDocument1.setIdentifier((-2736));
      SupportingDocument supportingDocument6 = new SupportingDocument();
      supportingDocument1.clone();
      supportingDocument0.setIdentifier(0);
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
  //Test case number: 4
  /*Coverage entropy=2.8133554045006153
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-5));
      supportingDocument0.setDescription("");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDisplayName();
      supportingDocument0.setTitle("UNABLE_TO_UPDATE_AVAILABILITY_STATE");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      User user0 = new User("-", (String) null);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("");
      supportingDocument0.setIdentifier(0);
      User user1 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument2);
      supportingDocument2.getDisplayName();
      supportingDocument1.clone();
      supportingDocument1.getDocumentCode();
      supportingDocument1.setTitle("UNABLE_TO_UPDATE_AVAILABILITY_STATE");
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument2);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(arrayList1.equals((Object)arrayList0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.338371704803573
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setTitle("mQ(5 6?G=QWlyw%");
      supportingDocument0.setFileName("mQ(5 6?G=QWlyw%");
      supportingDocument0.setDocumentCode("x\"vZZA6Bh");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getIdentifier();
      supportingDocument0.setIdentifier(0);
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("mQ(5 6?G=QWlyw%-x\"vZZA6Bh", string0);
      
      supportingDocument0.setTitle("mQ(5 6?G=QWlyw%");
      SupportingDocument.validateFields(supportingDocument0);
      String string1 = supportingDocument0.getDisplayItemIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", string1);
      assertEquals(0, supportingDocument0.getIdentifier());
  }
}
