/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:03:02 GMT 2018
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
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("wS:h;1t\u0006");
      supportingDocument0.setFilePath("wS:h;1t\u0006");
      supportingDocument0.clone();
      supportingDocument0.setFilePath(":=pG%=$4I");
      supportingDocument0.getFilePath();
      supportingDocument0.getDisplayItemIdentifier();
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
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("&a?ll5");
      supportingDocument0.setFilePath("supportingDocument.documentCode.saveChanges");
      supportingDocument0.getFileName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFileName("");
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setTitle("&a?ll5");
      supportingDocument0.setFileName("1B/.l%Y");
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getDisplayName();
      supportingDocument0.setFilePath("");
      supportingDocument0.getDocumentCode();
      supportingDocument0.getIdentifier();
      supportingDocument0.getFileName();
      supportingDocument0.getFileName();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.getDocumentCode();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.clone();
      supportingDocument0.setFilePath("");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setIdentifier(109);
      supportingDocument0.getDisplayName();
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setIdentifier(415);
      supportingDocument0.getDescription();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setTitle("");
      supportingDocument0.setFileName("");
      String string0 = "supportingDocument.documentCode.label";
      supportingDocument0.setDescription("supportingDocument.documentCode.label");
      supportingDocument0.clone();
      supportingDocument0.getFilePath();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      User user0 = new User("UyK3>t\"g7HamCdD){3", "");
      User user1 = new User();
      user1.setPassword("UyK3>t\"g7HamCdD){3");
      User.detectFieldChanges(user0, user1, user0);
      user0.setAffiliation("UyK3>t\"g7HamCdD){3");
      user0.setLastName("w+4Ofp5W%F1");
      user0.setEmail((String) null);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertTrue(arrayList0.isEmpty());
      
      supportingDocument0.setFileName("");
      supportingDocument0.setTitle("supportingDocument.fileName.saveChanges");
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("e");
      supportingDocument0.clone();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getFileName();
      supportingDocument0.setDescription("");
      supportingDocument0.setDocumentCode("e");
      supportingDocument0.setDescription("");
      supportingDocument0.setDocumentCode("e");
      supportingDocument0.setFileName("mGVxM*-92=Q_s~m");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument0.getFileName();
      Object object0 = supportingDocument0.clone();
      supportingDocument0.setFileName("0");
      supportingDocument0.setFilePath("macaw.system.ChangeEventType");
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("0", supportingDocument1.getFileName());
      assertEquals("e", supportingDocument1.getDocumentCode());
      assertEquals("macaw.system.ChangeEventType", supportingDocument1.getFilePath());
      
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      assertEquals(3, arrayList0.size());
      assertNotSame(supportingDocument0, object0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.293412589485358
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("&a?ll5");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      user0.clone();
      supportingDocument1.getFileName();
      supportingDocument1.getFileName();
      supportingDocument0.getDisplayName();
      supportingDocument1.setFilePath("-");
      String string0 = "4mn&|";
      supportingDocument1.setTitle("4mn&|");
      supportingDocument1.getDescription();
      supportingDocument0.getFileName();
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
  /*Coverage entropy=2.2008276490345495
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      int int0 = 0;
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setTitle("0");
      supportingDocument0.setFileName("0");
      User user0 = new User("", (String) null);
      user0.setStatus("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument1.setTitle("macaw.system.ChangeEventType");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setFileName("VOhtjHCsD");
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
}
