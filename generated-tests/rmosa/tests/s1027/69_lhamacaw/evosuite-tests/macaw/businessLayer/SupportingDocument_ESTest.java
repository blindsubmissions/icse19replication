/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:55:19 GMT 2018
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
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      User user1 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals(0, arrayList0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("");
      supportingDocument0.setDocumentCode("");
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
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      String string0 = "i}f";
      supportingDocument0.setTitle("i}f");
      User user0 = new User();
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setFileName("user.phone.label");
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.setTitle("-");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("0F3{[-tQ<\"6");
      supportingDocument0.setTitle("");
      supportingDocument0.getDisplayName();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("=:t5IAe01-PU{w/aP");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("");
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("=:t5IAe01-PU{w/aP-");
      supportingDocument1.getFileName();
      supportingDocument1.setDescription("=:t5IAe01-PU{w/aP");
      User user0 = new User();
      User user1 = new User("UNABLE_TO_GET_CATEGORIES_FOR_VARIABLE", "");
      user1.setIdentifier((-1421));
      User.detectFieldChanges(user1, user1, user0);
      user1.setCounty("}@");
      user1.setPassword("%%uDbSAv6?,(TT,]");
      supportingDocument0.setDocumentCode("");
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument1);
      supportingDocument1.getDisplayName();
      supportingDocument1.setDocumentCode("=:t5IAe01-PU{w/aP");
      supportingDocument0.isNewRecord();
      supportingDocument1.setDescription("M']nw9SaI8J");
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
  //Test case number: 6
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("riy>hA;{A1JZN");
      supportingDocument0.setIdentifier((-1589));
      supportingDocument0.setFileName("riy>hA;{A1JZN");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("riy>hA;{A1JZN");
      supportingDocument1.setTitle("riy>hA;{A1JZN");
      supportingDocument0.setDocumentCode("j}A%(.WHEG%");
      supportingDocument0.getDisplayName();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields((SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("j'vV$F/D? 2c9'X<");
      supportingDocument0.setFilePath("j'vV$F/D? 2c9'X<");
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.getDisplayName();
      supportingDocument0.setDescription("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.setFilePath((String) null);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals("supportingDocument.filePath.saveChanges", supportingDocument1.getDescription());
      assertEquals("j'vV$F/D? 2c9'X<", supportingDocument1.getFileName());
      
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getFileName();
      supportingDocument0.getIdentifier();
      supportingDocument0.setIsNewRecord(false);
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-null", string0);
      
      supportingDocument0.getFileName();
      User user0 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument0);
      assertEquals(4, arrayList0.size());
      
      supportingDocument0.setDocumentCode("");
      assertFalse(supportingDocument0.isNewRecord());
      assertNotSame(supportingDocument0, supportingDocument1);
      
      supportingDocument2.setFileName((String) null);
      supportingDocument2.setIdentifier(0);
      assertFalse(supportingDocument2.isNewRecord());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.setTitle("-");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = "3](!';P<'2[u";
      supportingDocument1.setDocumentCode("3](!';P<'2[u");
      supportingDocument1.getFileName();
      User user0 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("o{]7)y^+pS");
      supportingDocument0.setTitle("`t2]~#+");
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setIdentifier(2);
      supportingDocument0.setIdentifier((-2028178998));
      supportingDocument0.setFileName("UNABLE_TO_UPDATE_ALTERNATIVE_VARIABLE");
      supportingDocument0.setTitle("`t2]~#+");
      supportingDocument0.setFilePath("UNABLE_TO_UPDATE_ALTERNATIVE_VARIABLE");
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals((-2028178998), supportingDocument0.getIdentifier());
      assertEquals("-2028178998", supportingDocument0.getDisplayItemIdentifier());
  }
}
