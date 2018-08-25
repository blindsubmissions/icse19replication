/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:33:09 GMT 2018
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
      supportingDocument0.getDescription();
      User user0 = new User("INVALID_DERIVED_VARIABLE", "INVALID_DERIVED_VARIABLE");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument0.setDescription("O}))AW=|A`*g");
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setTitle("INVALID_SUPPORTING_DOCUMENT");
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("NON_EXISTENT_CLEANING_STATE");
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.getDocumentCode();
      int int0 = 337;
      supportingDocument0.getDisplayName();
      supportingDocument0.setIdentifier(337);
      supportingDocument0.setDocumentCode("");
      String string0 = "iHH?(b^!(Qj^1_nIc";
      supportingDocument0.setDocumentCode("iHH?(b^!(Qj^1_nIc");
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
  //Test case number: 4
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("macaw.system.ChangeEventType");
      Object object0 = supportingDocument0.clone();
      supportingDocument0.setTitle("macaw.system.ChangeEventType");
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("macaw.system.ChangeEventType-macaw.system.ChangeEventType", string0);
      
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("macaw.system.ChangeEventType", supportingDocument1.getTitle());
      assertEquals("macaw.system.ChangeEventType", supportingDocument1.getDocumentCode());
      
      User user0 = new User("8NF}C)}8bML", "macaw.system.ChangeEventType");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      assertEquals(2, arrayList0.size());
      assertNotSame(supportingDocument0, object0);
      assertFalse(supportingDocument2.isNewRecord());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(1117);
      User user0 = new User("UNABLE_TO_GET_USERS", "UNABLE_TO_GET_USERS");
      supportingDocument0.setDocumentCode("UNABLE_TO_GET_USERS");
      supportingDocument0.setFilePath("UNABLE_TO_GET_USERS");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getFilePath();
      supportingDocument0.getDescription();
      supportingDocument0.setFileName("UNABLE_TO_GET_USERS");
      supportingDocument0.clone();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("UNABLE_TO_GET_USERS");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument1.setDescription("`avnImhem\"AZh#");
      supportingDocument0.setIdentifier((-1834));
      assertEquals("-1834", supportingDocument0.getDisplayItemIdentifier());
      
      supportingDocument1.getDescription();
      supportingDocument1.isNewRecord();
      boolean boolean0 = supportingDocument1.isNewRecord();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("user.affiliation.label");
      supportingDocument0.setFileName("user.affiliation.label");
      int int0 = (-5059);
      String string0 = "8I<1rfhPo%>?$^3>";
      supportingDocument0.setDescription("8I<1rfhPo%>?$^3>");
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
  //Test case number: 7
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("user.lastName.label");
      supportingDocument0.setTitle("g%jy");
      supportingDocument0.setDocumentCode("/wax");
      supportingDocument0.setDocumentCode("i|W?OLZTr");
      supportingDocument0.getDisplayName();
      supportingDocument0.setDescription("i|W?OLZTr");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath("");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setFileName("user.lastName.label");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDescription("i|W?OLZTr");
      supportingDocument0.getFilePath();
      supportingDocument0.getDescription();
      supportingDocument0.setTitle("V-El3D!W'3:YB,x(:MZ");
      supportingDocument0.getFilePath();
      supportingDocument0.getDisplayItemIdentifier();
      User user0 = new User("E(:ru+^,.o>~Wa(", ";4<");
      user0.setStatus(">/i lco>$");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.clone();
      assertTrue(supportingDocument0.isNewRecord());
  }
}
