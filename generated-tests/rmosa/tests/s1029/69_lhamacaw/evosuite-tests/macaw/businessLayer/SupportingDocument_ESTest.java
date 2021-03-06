/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 19:03:28 GMT 2018
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
      boolean boolean0 = false;
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("SA");
      String string0 = "`lWJ7'f";
      supportingDocument0.setDescription("`lWJ7'f");
      supportingDocument0.setTitle("rTTTf+90OVi_~ tT)P6");
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setFilePath("_p~0X)7+Sh8");
      supportingDocument0.setFilePath("_p~0X)7+Sh8");
      supportingDocument0.setFilePath("_p~0X)7+Sh8");
      supportingDocument0.getFileName();
      supportingDocument0.getFileName();
      supportingDocument1.getFileName();
      supportingDocument1.getDisplayName();
      supportingDocument0.setIdentifier(889);
      supportingDocument1.getFileName();
      supportingDocument1.setIdentifier(889);
      assertEquals(889, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("k:8@}'yhpeU'.B ~S");
      boolean boolean0 = false;
      String string0 = "H= Cr6D LP$>x`";
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode("H= Cr6D LP$>x`");
      supportingDocument0.setIsNewRecord(false);
      String string1 = "Z8klo%KKZqz{u/|u`";
      supportingDocument0.setDescription("H= Cr6D LP$>x`");
      User user0 = new User("H= Cr6D LP$>x`", "Z8klo%KKZqz{u/|u`");
      try { 
        User.checkValidEmail("Z8klo%KKZqz{u/|u`");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"Z8klo%KKZqz{u/|u`\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("UNABLE_TO_CREATE_TABLES");
      supportingDocument0.setTitle("BI8c,g06/kR`~");
      supportingDocument0.setDocumentCode("UNABLE_TO_GET_CHANGES_FOR_LIST_CHOICES");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      User user0 = new User();
      supportingDocument0.getTitle();
      supportingDocument0.setFileName("BI8c,g06/kR`~");
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-1596));
      supportingDocument0.setDescription("");
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertEquals("-1596", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
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
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("wwQ5o");
      supportingDocument0.getDisplayName();
      String string0 = "";
      supportingDocument0.setFileName("");
      String string1 = "supportingDocument.documentCode.label";
      supportingDocument0.setFileName("supportingDocument.documentCode.label");
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
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = false;
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setDocumentCode("UNABLE_TO_GET_CHANGES_FOR_DOCUMENT");
      supportingDocument0.setFilePath("UNABLE_TO_GET_CHANGES_FOR_DOCUMENT");
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle("hMNn5C3td");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setDocumentCode("hMNn5C3td");
      supportingDocument0.setFileName("Ldv>PYfT_c");
      User user0 = new User();
      user0.setAddressLine1("UNABLE_TO_CREATE_ONTOLOGY_TERM");
      User user1 = new User("UNABLE_TO_CREATE_ONTOLOGY_TERM", "supportingDocument.fileName.saveChanges");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument2, supportingDocument1);
      assertEquals(2, arrayList0.size());
      
      user0.setAddressLine2(";[EX($_s)+Z");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument3);
      assertEquals(1, arrayList1.size());
      
      supportingDocument3.setTitle("supportingDocument.title.saveChanges");
      supportingDocument2.getTitle();
      supportingDocument0.setFileName((String) null);
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
      supportingDocument0.setFilePath("supportingDocument.documentCode.saveChanges");
      supportingDocument0.setFilePath("supportingDocument.documentCode.saveChanges");
      supportingDocument0.setFileName("UNABLE_TO_GET_CHANGES_FOR_LIST_CHOICES");
      supportingDocument0.setFilePath("c80/B$r");
      User user0 = new User("Jf'`e+", "tX7>`/ ");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setDescription("supportingDocument.documentCode.saveChanges");
      supportingDocument0.getFilePath();
      supportingDocument0.setIdentifier(1191);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      supportingDocument1.getIdentifier();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setFileName("UNABLE_TO_GET_CHANGES_FOR_LIST_CHOICES");
      supportingDocument2.getDescription();
      User user1 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument1);
      assertEquals("1191", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(3, arrayList0.size());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("UNABLE_TO_GET_CHANGES_FOR_LIST_CHOICES");
      supportingDocument0.setFileName("hro(ip/Wlv|C%= (");
      supportingDocument0.setFileName("A*@E9}*>_");
      supportingDocument0.setDocumentCode("!&vO5");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.isNewRecord();
      supportingDocument0.setTitle("A*@E9}*>_");
      supportingDocument0.getTitle();
      supportingDocument0.getDisplayName();
      supportingDocument1.setDescription("!&vO5");
      supportingDocument1.getDocumentCode();
      User user0 = new User("c80/B$r", "");
      supportingDocument0.setIsNewRecord(true);
      user0.setAddressLine2(",U8)$U@");
      user0.setEmail(":5dH)f4G9r@G/`+");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("y!@d`|\"");
      supportingDocument0.setTitle("hMNn5C3td");
      supportingDocument0.setFileName("y!@d`|\"");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = supportingDocument1.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      User user0 = new User();
      User user1 = new User("macaw.businessLayer.SupportingDocument", "UNABLE_TO_GET_VALUE_LABELS");
      user1.setAddressLine1("supportingDocument.documentCode.label");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      assertEquals(2, arrayList0.size());
      
      supportingDocument0.setTitle("hMNn5C3td");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getTitle();
      assertFalse(supportingDocument2.isNewRecord());
      assertEquals(0, supportingDocument2.getIdentifier());
  }
}
