/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 12:02:32 GMT 2018
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-1161));
      supportingDocument0.setDescription("supportingDocument.fileName.saveChanges");
      supportingDocument0.clone();
      supportingDocument0.setFileName("/+;WHH3?=uYFr:{");
      supportingDocument0.getIdentifier();
      supportingDocument0.setDocumentCode("supportingDocument.fileName.saveChanges");
      supportingDocument0.setFileName("/+;WHH3?=uYFr:{");
      assertEquals("-1161", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("G|2w[2(U '");
      supportingDocument0.setTitle("supportingDocument.title.saveChanges");
      supportingDocument0.setTitle("Z>;p#");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument0.getFileName();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string1 = supportingDocument1.getDisplayName();
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("-", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      User user0 = new User("0", "0");
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("0");
      supportingDocument0.isNewRecord();
      supportingDocument0.getFilePath();
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("G|2w[2(U '");
      supportingDocument0.setTitle("supportingDocument.title.saveChanges");
      supportingDocument0.setTitle("Z>;p#");
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument0.getTitle();
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("f1#4}uj)`K,n<8Z");
      supportingDocument0.setFilePath("");
      supportingDocument0.setIdentifier((-1));
      User user0 = new User();
      user0.setAddressLine2("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      supportingDocument0.setDescription("");
      supportingDocument0.setFilePath("UNABLE_TO_CHECK_DATABASE_EXISTS");
      supportingDocument0.getDocumentCode();
      user0.setCounty("{tao");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      supportingDocument1.getIdentifier();
      supportingDocument0.setIdentifier(0);
      supportingDocument1.getDisplayName();
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
  //Test case number: 5
  /*Coverage entropy=1.73798344858705
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("");
      supportingDocument0.setTitle("");
      supportingDocument0.setTitle("Z>;p#");
      supportingDocument0.getDisplayItemIdentifier();
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
  //Test case number: 6
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("rdWfWV+");
      supportingDocument0.setTitle("t7t");
      supportingDocument0.setDocumentCode("t7t");
      supportingDocument0.setIdentifier(765);
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDocumentCode("$D");
      supportingDocument0.setTitle("O@$-R}");
      supportingDocument0.getDisplayItemIdentifier();
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
  //Test case number: 7
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setFilePath("");
      supportingDocument0.setIdentifier((-2513));
      supportingDocument0.setFileName("");
      supportingDocument0.setDescription("C6&w=E'@W");
      supportingDocument0.getDocumentCode();
      supportingDocument0.getFileName();
      User user0 = new User();
      user0.setCounty("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getIdentifier();
      User.checkValidUserIDField("");
      supportingDocument0.getIdentifier();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode("");
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals("-2513", supportingDocument0.getDisplayItemIdentifier());
      assertEquals((-2513), supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("b'n>X\"kZ");
      User user0 = new User("@Q", "");
      user0.setAddressLine1("S3AK[@7Him`j,");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setTitle("");
      supportingDocument0.setTitle("S3AK[@7Him`j,");
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      User user1 = new User();
      ArrayList<MacawChangeEvent> arrayList1 = SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      assertTrue(arrayList1.equals((Object)arrayList0));
      
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle("UNABLE_TO_CHECK_VARIABLE_ASSOCIATION_DUPLICATE");
      User user2 = new User("W5;/q38I/TDE)cS3", "_w0u`kJ?d_9?I");
      user2.setPassword("");
      User user3 = new User();
      User.detectFieldChanges(user1, user3, user2);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user4 = new User("UNABLE_TO_CHECK_DATABASE_EXISTS", "");
      ArrayList<MacawChangeEvent> arrayList2 = SupportingDocument.detectFieldChanges(user4, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(2, arrayList2.size());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      supportingDocument0.setFileName("4*c*CeNg~ <Vd0q7ll]");
      supportingDocument0.setFilePath("}<\"iwaOSeBfrAG5@4=W");
      supportingDocument0.setDocumentCode("uOWXgk");
      supportingDocument0.setIdentifier(765);
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDocumentCode("user.email.label");
      supportingDocument0.setTitle("}<\"iwaOSeBfrAG5@4=W");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDescription();
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.setFileName("4*c*CeNg~ <Vd0q7ll]");
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals("765", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(765, supportingDocument0.getIdentifier());
  }
}