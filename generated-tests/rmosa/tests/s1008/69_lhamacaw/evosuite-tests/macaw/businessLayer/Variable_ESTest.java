/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 08:40:06 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import macaw.businessLayer.DerivedVariable;
import macaw.businessLayer.OntologyTerm;
import macaw.businessLayer.RawVariable;
import macaw.businessLayer.SupportingDocument;
import macaw.businessLayer.User;
import macaw.businessLayer.ValueLabel;
import macaw.businessLayer.Variable;
import macaw.businessLayer.VariableSummary;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      String string0 = rawVariable0.getDisplayItemIdentifier();
      assertEquals("0", string0);
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isNewRecord());
      assertFalse(rawVariable0.isCoded());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getFilePath();
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isNewRecord());
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList0);
      derivedVariable0.setSourceVariables(arrayList0);
      assertEquals(0, derivedVariable0.getIdentifier());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.addSupportingDocument((SupportingDocument) null);
      // Undeclared exception!
      try { 
        rawVariable0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      arrayList0.add((OntologyTerm) null);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      // Undeclared exception!
      try { 
        rawVariable0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setName("UNABLE_TO_GET_ALL_ONTOLOGY_TERMS");
      User user0 = new User();
      RawVariable.validateFields(rawVariable0);
      try { 
        User.checkValidUserIDField(")\f|M");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The field \"User ID\" value \")\f|M\" may present a security risk.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      rawVariable0.questionNumber = "$p{UF]Tf";
      arrayList0.add(ontologyTerm0);
      rawVariable0.removeOntologyTerms(arrayList0);
      ArrayList<Variable> arrayList1 = new ArrayList<Variable>();
      assertTrue(arrayList1.isEmpty());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = new ArrayList<Variable>();
      arrayList0.add((Variable) derivedVariable0);
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.clone();
      arrayList0.ensureCapacity((-1717986916));
      arrayList0.add((Variable) derivedVariable0);
      derivedVariable0.addValueLabel(valueLabel0);
      derivedVariable0.removeSourceVariables(arrayList0);
      derivedVariable0.getSourceVariables();
      assertEquals(0, derivedVariable0.getIdentifier());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isCleaned());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      boolean boolean0 = derivedVariable0.isNewRecord();
      assertFalse(boolean0);
      
      derivedVariable0.addSourceVariable(rawVariable0);
      derivedVariable0.getSourceVariables();
      assertFalse(derivedVariable0.isCleaned());
      assertEquals(0, derivedVariable0.getIdentifier());
      assertFalse(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getSupportingDocuments();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = User.detectFieldChanges(user0, user0, user0);
      assertTrue(arrayList0.isEmpty());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User();
      rawVariable0.form = null;
      user0.setAddressLine1((String) null);
      RawVariable rawVariable1 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<ValueLabel> arrayList0 = rawVariable0.getValueLabels();
      // Undeclared exception!
      try { 
        arrayList0.removeAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      VariableSummary variableSummary0 = derivedVariable0.createVariableSummary();
      assertFalse(derivedVariable0.isNewRecord());
      assertEquals("0", variableSummary0.getDisplayItemIdentifier());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isCleaned());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      rawVariable0.removeOntologyTerms(arrayList0);
      ArrayList<Variable> arrayList1 = new ArrayList<Variable>();
      assertEquals(0, arrayList1.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.removeSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(rawVariable0);
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isCleaned());
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      rawVariable0.setAlternativeVariable(rawVariable0);
      rawVariable0.clone();
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      RawVariable rawVariable1 = new RawVariable();
      RawVariable.validateFields(rawVariable1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(rawVariable0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      derivedVariable0.removeSupportingDocuments(arrayList0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      rawVariable0.addSupportingDocuments(arrayList0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.removeValueLabel(valueLabel0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setIdentifier(31);
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setNotes((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, rawVariable1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      user0.setUserID((String) null);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList0);
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, (Variable) null);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      User user0 = new User();
      User user1 = new User();
      user0.setUserID("?=X!.hHDRAkvhj");
      user1.setEmail((String) null);
      User user2 = new User();
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setAvailability((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user1, rawVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.questionNumber = null;
      rawVariable1.setIdentifier(0);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.containsOntologyTerm(ontologyTerm0);
      rawVariable0.setCategory((String) null);
      RawVariable rawVariable1 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User();
      user0.setLastName((String) null);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add(ontologyTerm0);
      derivedVariable0.addOntologyTerms(arrayList0);
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      // Undeclared exception!
      try { 
        User.checkValidEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User();
      User.detectFieldChanges(user0, user0, user0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      User user1 = new User();
      OntologyTerm.detectFieldChanges(user1, ontologyTerm1, ontologyTerm1);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      RawVariable rawVariable1 = new RawVariable();
      user0.setPostCode("uVkoP");
      rawVariable0.setLabel((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm0.setIdentifier(1441);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add(ontologyTerm1);
      arrayList0.add(ontologyTerm1);
      derivedVariable0.addOntologyTerms(arrayList0);
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.setName("variable.availability.label");
      User user0 = new User("user.userID.label", "variable.columnEnd.label");
      user0.setIdentifier(3478);
      try { 
        User.checkValidEmail("user.userID.label");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"user.userID.label\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCoded(true);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User();
      user0.setUserID("xYk");
      rawVariable0.form = null;
      user0.setAddressLine1((String) null);
      RawVariable rawVariable1 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setYear((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, rawVariable1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setAlias((String) null);
      RawVariable rawVariable1 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.060884963119022
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User();
      user0.setUserID("?=X!.hHDRAkvhj");
      user0.setEmail((String) null);
      User user1 = new User();
      user1.setFirstName("R&p");
      derivedVariable0.columnEnd = "?=X!.hHDRAkvhj";
      Variable.detectFieldChanges(user1, derivedVariable0, derivedVariable0);
      derivedVariable0.getSourceVariables();
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.1272886853327275
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.columnStart = null;
      rawVariable0.setIdentifier(31);
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      User user0 = new User();
      OntologyTerm.detectFieldChanges(user0, ontologyTerm0, ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.setIdentifier(0);
      arrayList0.add(ontologyTerm0);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      User user0 = new User();
      User.checkValidUserIDField("variable.alias.label");
      rawVariable0.form = null;
      user0.setAddressLine1((String) null);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.columnStart = ">@!+SZW]3;Bu/";
      rawVariable0.setIdentifier(31);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      String string0 = null;
      rawVariable0.setCleaningStatus((String) null);
      User user0 = new User();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user1 = new User();
      ArrayList<MacawChangeEvent> arrayList1 = new ArrayList<MacawChangeEvent>();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.notes = "R&p";
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User((String) null, (String) null);
      User user1 = new User();
      user0.setStatus((String) null);
      rawVariable0.setCleaned(true);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.columnEnd = "{4 Q";
      derivedVariable0.setAlias((String) null);
      RawVariable rawVariable1 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable1, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setCodeBookNumber((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, rawVariable1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.4963964637768603
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      arrayList0.parallelStream();
      rawVariable0.setSupportingDocuments(arrayList0);
      User user1 = new User();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setAlternativeVariable(rawVariable0);
      Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
      user1.setUserID("variable.isCoded.label");
      rawVariable1.setAlternativeVariable(rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      rawVariable1.setCleaned(true);
      RawVariable rawVariable2 = new RawVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user1, rawVariable1, derivedVariable1);
      try { 
        RawVariable.validateFields(rawVariable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.RawVariable", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.containsSupportingDocument(supportingDocument0);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setIdentifier(1);
      rawVariable0.addSupportingDocument(supportingDocument2);
      rawVariable0.containsSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm1);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getSourceVariables();
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<ValueLabel> arrayList0 = new ArrayList<ValueLabel>();
      arrayList0.add((ValueLabel) null);
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList0.add(valueLabel0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) derivedVariable0);
      predicate0.or(predicate0);
      derivedVariable0.setValueLabels(arrayList0);
      derivedVariable0.setCoded(true);
      // Undeclared exception!
      try { 
        derivedVariable0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setIdentifier((-2191));
      arrayList0.add(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm1);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User((String) null, "variable.columnStart.label");
      user0.setAddressLine1("==c`a3-|u^Q6=(*1j");
      derivedVariable0.setName((String) null);
      user0.setStatus(">R~E");
      RawVariable rawVariable0 = new RawVariable();
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      User user0 = new User();
      user0.setStatus((String) null);
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      Variable.detectChangesInAlternativeVariable(user0, rawVariable0, (Variable) null);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      DerivedVariable derivedVariable3 = new DerivedVariable();
      DerivedVariable derivedVariable4 = new DerivedVariable();
      DerivedVariable derivedVariable5 = new DerivedVariable();
      derivedVariable5.removeSourceVariable(derivedVariable4);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      User user0 = new User();
      user0.setAddressLine1((String) null);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.removeOntologyTerm(ontologyTerm0);
      derivedVariable0.setIdentifier(2578);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable0.removeSourceVariables(arrayList0);
      DerivedVariable derivedVariable3 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user0, rawVariable0, derivedVariable2);
      try { 
        RawVariable.validateFields(rawVariable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.RawVariable", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      rawVariable0.clone();
      rawVariable0.setCleaningStatus("");
      try { 
        RawVariable.validateFields(rawVariable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.RawVariable", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=3.8712010109078947
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      rawVariable0.setAvailability("");
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      User user0 = new User();
      OntologyTerm.detectFieldChanges(user0, ontologyTerm1, ontologyTerm1);
      OntologyTerm ontologyTerm2 = new OntologyTerm();
      rawVariable0.setCleaned(true);
      User user1 = new User();
      OntologyTerm.detectFieldChanges(user1, ontologyTerm2, ontologyTerm2);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setAlias("uVkoP");
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      derivedVariable0.clone();
      RawVariable rawVariable1 = new RawVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable1, rawVariable1);
      try { 
        RawVariable.validateFields(rawVariable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.RawVariable", e);
      }
  }
}
