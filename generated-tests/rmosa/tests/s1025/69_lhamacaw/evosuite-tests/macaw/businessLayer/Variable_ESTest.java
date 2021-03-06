/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:18:46 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
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
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<ValueLabel> arrayList0 = new ArrayList<ValueLabel>();
      derivedVariable0.setValueLabels(arrayList0);
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.setSourceVariables(arrayList1);
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCleaned());
      assertEquals(0, derivedVariable0.getIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User();
      user0.setAddressLine1("@^ FkO\"P$/S7]VYJ7wZ");
      rawVariable0.codeBookNumber = "macaw.businessLayer.Variable";
      user0.setCounty("u;!r[(-%!AU#<!eOU");
      User user1 = new User("blank", "GXZd0*<&Ymt8^f");
      user1.setPassword("VJ5A");
      rawVariable0.setCleaned(true);
      Variable.validateFields(rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
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
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setYear((String) null);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      User user0 = new User((String) null, (String) null);
      // Undeclared exception!
      try { 
        DerivedVariable.detectFieldChanges(user0, derivedVariable1, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      User user0 = null;
      DerivedVariable derivedVariable1 = new DerivedVariable();
      // Undeclared exception!
      try { 
        Variable.detectChangesInAlternativeVariable((User) null, rawVariable0, derivedVariable1);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getValueLabels();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      try { 
        OntologyTerm.validateFields(ontologyTerm0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.OntologyTerm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      rawVariable0.isNewRecord();
      ArrayList<ValueLabel> arrayList1 = new ArrayList<ValueLabel>();
      assertTrue(arrayList1.isEmpty());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable0.removeValueLabel(valueLabel0);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.removeSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNewRecord(false);
      derivedVariable0.setCoded(true);
      derivedVariable0.setCleaned(false);
      User user0 = new User();
      user0.setAddressLine2("zseR*YUqG6+b3e+=");
      OntologyTerm.detectFieldChanges(user0, ontologyTerm0, ontologyTerm0);
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.getYear();
      derivedVariable0.setAlternativeVariable((Variable) null);
      derivedVariable0.getOntologyTerms();
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setNotes("");
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = rawVariable0.getSupportingDocuments();
      // Undeclared exception!
      try { 
        arrayList0.set(103, supportingDocument0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 103, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0989087071263235
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      User user0 = new User(" /t/A&CD%+", "mcm");
      user0.setEmail("mcm");
      RawVariable rawVariable1 = new RawVariable();
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable1.containsSourceVariable(derivedVariable2);
      RawVariable rawVariable2 = new RawVariable();
      derivedVariable0.addSourceVariable(rawVariable2);
      // Undeclared exception!
      try { 
        derivedVariable2.removeSourceVariables((ArrayList<Variable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.addValueLabel((ValueLabel) null);
      derivedVariable0.setIsNewRecord(true);
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
  //Test case number: 9
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getSupportingDocuments();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      rawVariable0.getFilePath();
      rawVariable0.setAvailability("7,lS{7_M0W");
      // Undeclared exception!
      try { 
        derivedVariable0.hasSameDisplayName((Variable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add((OntologyTerm) null);
      rawVariable0.addOntologyTerms(arrayList0);
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
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAvailability("");
      DerivedVariable derivedVariable0 = new DerivedVariable();
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
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      rawVariable0.removeOntologyTerms(arrayList0);
      assertEquals(0, rawVariable0.getIdentifier());
      assertFalse(rawVariable0.isNewRecord());
      assertFalse(rawVariable0.isCoded());
      assertFalse(rawVariable0.isCleaned());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      derivedVariable0.columnEnd = "%[5+q0RdQcZu}8M~X";
      arrayList0.add((OntologyTerm) null);
      // Undeclared exception!
      try { 
        derivedVariable0.removeOntologyTerms(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      // Undeclared exception!
      try { 
        rawVariable0.addSupportingDocuments((ArrayList<SupportingDocument>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      VariableSummary variableSummary0 = derivedVariable0.createVariableSummary();
      assertEquals(0, variableSummary0.getIdentifier());
      
      derivedVariable0.getSourceVariables();
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCleaned());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = new ArrayList<Variable>();
      derivedVariable0.removeSourceVariables(arrayList0);
      Variable.detectChangesInAlternativeVariable((User) null, derivedVariable0, (Variable) null);
      // Undeclared exception!
      try { 
        Variable.detectChangesInAlternativeVariable((User) null, (Variable) null, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  //Test case number: 18
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      rawVariable0.setName("YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      derivedVariable0.containsSourceVariable(rawVariable0);
      assertEquals("YS?|PAO`", rawVariable0.getName());
      assertEquals("0", rawVariable0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setName("EDIT");
      Variable.validateFields(derivedVariable0);
      assertEquals("EDIT", derivedVariable0.getDisplayName());
      assertEquals("EDIT", derivedVariable0.getName());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      User user0 = new User(" /t/A&ZD%+", "mcm");
      user0.setEmail("mcm");
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setCoded(true);
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable1);
      assertTrue(rawVariable1.isCoded());
      
      DerivedVariable derivedVariable1 = new DerivedVariable();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      RawVariable rawVariable2 = new RawVariable();
      derivedVariable2.addSourceVariable(rawVariable2);
      derivedVariable2.getSourceVariables();
      assertEquals("Unknown", derivedVariable2.getCategory());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      derivedVariable0.removeSupportingDocuments(arrayList0);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      assertFalse(arrayList1.contains(supportingDocument0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      rawVariable0.setQuestionNumber("<{pEF?");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      User user1 = new User("YS?|PAO`", "<{pEF?");
      Variable.detectFieldChanges(user1, derivedVariable0, rawVariable0);
      ArrayList<MacawChangeEvent> arrayList0 = Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("<{pEF?", rawVariable0.getQuestionNumber());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.1272886853327275
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      rawVariable0.columnEnd = "YS?|PAO`";
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      assertEquals("YS?|PAO`", rawVariable0.getColumnEnd());
      assertEquals("Unknown", rawVariable0.getAvailability());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1272886853327275
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      rawVariable0.codeBookNumber = "s";
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("s", rawVariable0.getCodeBookNumber());
      
      ArrayList<Variable> arrayList0 = new ArrayList<Variable>();
      derivedVariable0.setSourceVariables(arrayList0);
      assertEquals("Unknown", derivedVariable0.getCategory());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setColumnEnd("R)$R'l9(5(lI]F{u>\"");
      derivedVariable0.containsSourceVariable(rawVariable0);
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      assertEquals("R)$R'l9(5(lI]F{u>\"", rawVariable0.getColumnEnd());
      assertEquals("Unknown", rawVariable0.getAvailability());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      rawVariable0.setLabel("variable.columnEnd.label");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("variable.columnEnd.label", rawVariable0.getLabel());
      
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.addSourceVariables(arrayList0);
      assertEquals(0, derivedVariable0.getIdentifier());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      User user0 = new User(" /t/A&CD%+", "mcm");
      rawVariable0.setCategory(" /t/A&CD%+");
      user0.setEmail("mcm");
      RawVariable rawVariable1 = new RawVariable();
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(derivedVariable1);
      derivedVariable0.addSourceVariable(rawVariable0);
      // Undeclared exception!
      try { 
        derivedVariable1.removeSourceVariables((ArrayList<Variable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaned(true);
      User user0 = new User();
      user0.setEmail("valueLabel.label.saveChanges");
      RawVariable rawVariable1 = new RawVariable();
      RawVariable.detectFieldChanges(user0, rawVariable1, rawVariable0);
      assertTrue(rawVariable0.isCleaned());
      
      derivedVariable0.containsSourceVariable(derivedVariable0);
      assertEquals(0, derivedVariable0.getIdentifier());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.1272886853327275
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.columnStart = "c}pGTH?r!8XyAH,";
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      assertEquals("c}pGTH?r!8XyAH,", rawVariable0.getColumnStart());
      assertEquals("Unknown", rawVariable0.getCategory());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setNotes("%uc)");
      User user0 = new User("%uc)", "tKd@");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable1);
      assertEquals("%uc)", rawVariable1.getNotes());
      
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      assertEquals("Unknown", rawVariable0.getCleaningStatus());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.160769135511544
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.cloneAttributes(rawVariable0);
      derivedVariable0.containsSourceVariable(rawVariable0);
      assertEquals("Unknown", rawVariable0.getAvailability());
      assertEquals("Unknown", rawVariable0.getCleaningStatus());
      assertEquals("Unknown", rawVariable0.getCategory());
      assertFalse(rawVariable0.isNewRecord());
      
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      assertEquals(0, derivedVariable0.getIdentifier());
      assertEquals("Unknown", derivedVariable0.getCleaningStatus());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable1.getOntologyTerms();
      arrayList0.add(ontologyTerm0);
      // Undeclared exception!
      try { 
        rawVariable1.removeOntologyTerms(arrayList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      boolean boolean0 = derivedVariable0.containsOntologyTerm(ontologyTerm0);
      assertFalse(derivedVariable0.isNewRecord());
      assertEquals(0, derivedVariable0.getIdentifier());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isCleaned());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      derivedVariable0.updateOntologyTerm(ontologyTerm1);
      ontologyTerm1.setIdentifier((-794));
      OntologyTerm ontologyTerm2 = new OntologyTerm();
      derivedVariable0.containsOntologyTerm(ontologyTerm2);
      derivedVariable0.getSourceVariables();
      RawVariable rawVariable0 = new RawVariable();
      // Undeclared exception!
      try { 
        derivedVariable0.removeSourceVariables((ArrayList<Variable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.setDescription("@K^+a'-");
      ontologyTerm1.setIdentifier(1336);
      derivedVariable0.updateOntologyTerm(ontologyTerm1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCategory("zr_OLa54^9");
      derivedVariable0.addSourceVariable(rawVariable0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      // Undeclared exception!
      try { 
        derivedVariable1.removeSourceVariables((ArrayList<Variable>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(derivedVariable0);
      User user0 = new User("R", "R");
      derivedVariable0.form = "R";
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAlias("R");
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("R", rawVariable0.getAlias());
      assertEquals("R", derivedVariable0.getForm());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("oKuEIz^h<FExYf)$H");
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable2.addSourceVariable(derivedVariable0);
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList0);
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAvailability("N4}>Pm MiYG'Wh ");
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      DerivedVariable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      assertEquals("N4}>Pm MiYG'Wh ", rawVariable0.getAvailability());
      assertEquals("Unknown", rawVariable0.getCategory());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument2.setIsNewRecord(true);
      rawVariable0.addSupportingDocument(supportingDocument0);
      boolean boolean0 = rawVariable0.containsSupportingDocument(supportingDocument2);
      assertTrue(boolean0);
      assertFalse(rawVariable0.isNewRecord());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isCoded());
      assertEquals(0, rawVariable0.getIdentifier());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=3.2047775241322567
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.cloneAttributes(rawVariable1);
      assertEquals("0", rawVariable1.getDisplayItemIdentifier());
      assertFalse(rawVariable1.isCleaned());
      assertEquals("Unknown", rawVariable1.getCategory());
      assertEquals("Unknown", rawVariable1.getAvailability());
      assertEquals("Unknown", rawVariable1.getCleaningStatus());
      assertFalse(rawVariable1.isCoded());
      assertFalse(rawVariable1.isNewRecord());
      
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setTitle("general.error.blankField");
      supportingDocument2.setIdentifier(1);
      User user0 = new User("cl]&", "cl]&");
      SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument2);
      supportingDocument0.setIsNewRecord(true);
      supportingDocument2.setIsNewRecord(true);
      rawVariable0.addSupportingDocument(supportingDocument0);
      boolean boolean0 = rawVariable0.containsSupportingDocument(supportingDocument2);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.191013317336941
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      user0.setCity("R)$R'l9(5(lI]F{u>\"");
      rawVariable0.columnStart = null;
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      try { 
        DerivedVariable.validateFields(derivedVariable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAlternativeVariable(rawVariable0);
      // Undeclared exception!
      try { 
        Variable.detectChangesInAlternativeVariable((User) null, rawVariable0, (Variable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.1272886853327275
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User("YS?|PAO`", "YS?|PAO`");
      user0.setEmail("R)$R'l9(5(lI]F{u>\"");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      user0.setStatus("YS?|PAO`");
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.form = "R)$R'l9(5(lI]F{u>\"";
      Variable.detectFieldChanges(user0, derivedVariable1, rawVariable0);
      assertEquals("R)$R'l9(5(lI]F{u>\"", derivedVariable1.getForm());
      assertEquals("Unknown", rawVariable0.getCategory());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      User user0 = new User();
      user0.setCounty("u;!r[(-%!AU#<!eOU");
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      User user1 = new User("blank", "GXZd0*<&Ymt8^f");
      user1.setPassword("blank");
      derivedVariable0.setCleaningStatus((String) null);
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
}
