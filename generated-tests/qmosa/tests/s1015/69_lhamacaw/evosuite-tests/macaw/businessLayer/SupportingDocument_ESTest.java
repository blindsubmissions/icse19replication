/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:34:35 GMT 2018
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "_}~hT\\";
      supportingDocument0.setFilePath("_}~hT");
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("_}~hT");
      supportingDocument0.setFilePath("0");
      supportingDocument0.setFilePath("UNABLE_TO_CHECK_VARIABLE_ASSOCIATION_EXISTS");
      supportingDocument0.getFileName();
      User user0 = null;
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges((User) null, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
      SupportingDocument supportingDocument0 = new SupportingDocument();
      int int0 = (-1);
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
      supportingDocument1.setDescription("u_jL");
      supportingDocument0.setFilePath((String) null);
      supportingDocument1.setDescription("97Y}lCY6F");
      supportingDocument0.clone();
      supportingDocument1.isNewRecord();
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
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "@Q";
      User user0 = new User("@Q", "");
      user0.setAddressLine1("S3AK[@7Him`j,");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setTitle("");
      supportingDocument0.setTitle("S3AK[@7Him`j,");
      supportingDocument0.isNewRecord();
      User user1 = new User();
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      supportingDocument0.setIsNewRecord(true);
      User.detectFieldChanges(user0, user1, user0);
      supportingDocument0.getDisplayName();
      supportingDocument0.setFilePath("KTfcD");
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
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("q~{Qs(<qye");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.setIdentifier(0);
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
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "W9miO'3#+_{y-70-";
      supportingDocument0.setFileName("W9miO'3#+_{y-70-");
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
  /*Coverage entropy=2.7072697097848133
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      User.detectFieldChanges(user0, user0, user0);
      user0.setPhone("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      user0.setIdentifier(2122);
      supportingDocument1.setFileName("4*c*CeNg~ <Vd0q7ll]");
      supportingDocument1.setDescription("4*c*CeNg~ <Vd0q7ll]");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(2, arrayList0.size());
      
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument2.getIdentifier());
      
      supportingDocument0.setFileName("");
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setDescription("");
      assertNotSame(supportingDocument0, supportingDocument2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.282174095733918
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  //Test case number: 7
  /*Coverage entropy=2.6723516979942703
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "t7t";
      supportingDocument0.setTitle("t7t");
      supportingDocument0.setDocumentCode("t7t");
      supportingDocument0.setIdentifier(765);
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDocumentCode("$D");
      User user0 = new User();
      user0.setPostCode("KYt?~4FMq%}2t988f");
      user0.setCounty("t7t");
      user0.setUserID("9?d");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      supportingDocument1.getDisplayName();
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument0.clone();
      SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument1);
      supportingDocument0.getDocumentCode();
      supportingDocument0.setIsNewRecord(false);
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
  /*Coverage entropy=2.4260151319598084
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("W9miO'3#+_{y-70-");
      supportingDocument0.setTitle("W9miO'3#+_{y-70-");
      supportingDocument0.setTitle("supportingDocument.documentCode.label");
      supportingDocument0.setIdentifier((-2090));
      supportingDocument0.getDocumentCode();
      supportingDocument0.setDocumentCode("D");
      User user0 = new User();
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getIdentifier();
      User user1 = new User("D", ",8nJ7w+p1//");
      User user2 = new User();
      user2.setPostCode(",8nJ7w+p1//");
      User.detectFieldChanges(user1, user2, user0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument1.setDocumentCode("\"{&SEA1Q{)T#O6]vF");
      User user3 = new User(".)SS%q@d=gFmG^T,", "D");
      User user4 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user4, supportingDocument0, (SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }
}
