/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:07:52 GMT 2018
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("1");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      assertEquals(0, arrayList0.size());
      
      supportingDocument0.getTitle();
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      
      supportingDocument0.setDescription("4OhX");
      supportingDocument0.setTitle("z");
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = false;
      String string0 = "supportingDocument.documentCode.saveChanges";
      supportingDocument0.setDocumentCode("supportingDocument.documentCode.saveChanges");
      supportingDocument0.setIsNewRecord(false);
      String string1 = "D(<wtUBOL";
      supportingDocument0.setIdentifier((-350));
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
      supportingDocument0.isNewRecord();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      
      User user0 = new User((String) null, "@||3hiTi]JW");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDocumentCode("UNABLE_TO_CREATE_RAW_VARIABLE");
      supportingDocument0.setFileName("oy!");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getTitle();
      supportingDocument0.getDescription();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertTrue(arrayList0.isEmpty());
      
      supportingDocument0.setDocumentCode("");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.isNewRecord();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.8133554045006153
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setDescription("Z5S<MA5 T\"RNpf");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("Z5S<MA5 T\"RNpf", supportingDocument1.getDescription());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      
      supportingDocument0.getTitle();
      supportingDocument0.getDescription();
      supportingDocument0.setFileName("1{U");
      supportingDocument0.setDocumentCode("general.error.blankField");
      supportingDocument0.getDisplayItemIdentifier();
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      assertNotSame(supportingDocument0, supportingDocument1);
      assertEquals(3, arrayList0.size());
      assertEquals(0, supportingDocument2.getIdentifier());
      assertFalse(supportingDocument2.isNewRecord());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
}
