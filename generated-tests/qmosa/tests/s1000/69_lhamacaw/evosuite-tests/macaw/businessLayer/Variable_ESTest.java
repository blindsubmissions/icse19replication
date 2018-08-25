/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:51:56 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.DerivedVariable;
import macaw.businessLayer.OntologyTerm;
import macaw.businessLayer.RawVariable;
import macaw.businessLayer.SupportingDocument;
import macaw.businessLayer.User;
import macaw.businessLayer.ValueLabel;
import macaw.businessLayer.Variable;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.createVariableSummary();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.addSourceVariables(arrayList0);
      derivedVariable0.form = "wm7+GH\"[N";
      assertEquals("Unknown", derivedVariable0.getAvailability());
      
      derivedVariable0.setAvailability("");
      derivedVariable0.setSupportingDocuments((ArrayList<SupportingDocument>) null);
      derivedVariable0.removeSourceVariable((Variable) null);
      derivedVariable0.getAvailability();
      derivedVariable0.getIdentifier();
      derivedVariable0.setCodeBookNumber("");
      derivedVariable0.getCodeBookNumber();
      derivedVariable0.setAlias("");
      derivedVariable0.setSupportingDocuments((ArrayList<SupportingDocument>) null);
      assertEquals("", derivedVariable0.getAvailability());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel valueLabel1 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.EDIT;
      valueLabel1.setEditingOperationType(valueLabel_EditingOperationType0);
      valueLabel0.hasSameDisplayName(valueLabel1);
      valueLabel0.setValue("$VALUES");
      rawVariable0.removeValueLabel(valueLabel0);
      rawVariable0.setValueLabels((ArrayList<ValueLabel>) null);
      rawVariable0.setCleaned(false);
      rawVariable0.getYear();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("$VALUES");
      supportingDocument0.setDescription("");
      rawVariable0.addSupportingDocument(supportingDocument0);
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
  //Test case number: 2
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.cloneAttributes(rawVariable0);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.clone();
      arrayList0.add(supportingDocument1);
      arrayList0.add(supportingDocument0);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setIdentifier((-743));
      arrayList0.add(supportingDocument2);
      arrayList0.add(supportingDocument2);
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.createVariableSummary();
      derivedVariable0.getYear();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.setAlternativeVariable(derivedVariable1);
      // Undeclared exception!
      try { 
        RawVariable.detectFieldChanges((User) null, (RawVariable) null, (RawVariable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.setLabel((String) null);
      rawVariable0.setAlias("variable.codeBookNumber.label");
      derivedVariable0.setCleaningDescription("LHA");
      assertEquals("LHA", derivedVariable0.getCleaningDescription());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      derivedVariable0.removeSupportingDocuments(arrayList0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(derivedVariable1);
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable1.updateOntologyTerm(ontologyTerm0);
      rawVariable0.setIdentifier((-2576));
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
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      User user0 = new User();
      user0.setStatus("2tzxj^!f{SY(z8^E@Q");
      user0.setAddressLine2("2tzxj^!f{SY(z8^E@Q");
      ValueLabel.differencesExist(user0, rawVariable0, valueLabel0, valueLabel0);
      rawVariable0.addValueLabel(valueLabel0);
      rawVariable0.getName();
      rawVariable0.setYear("");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getSourceVariables();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      arrayList0.add((SupportingDocument) null);
      arrayList0.add((SupportingDocument) null);
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.setLabel("");
      // Undeclared exception!
      try { 
        DerivedVariable.detectFieldChanges((User) null, derivedVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.createVariableSummary();
      derivedVariable0.setCoded(true);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setIsNewRecord(true);
      derivedVariable0.setAlternativeVariable(rawVariable0);
      assertFalse(rawVariable0.isCoded());
      
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setYear((String) null);
      derivedVariable0.isCoded();
      derivedVariable0.getValueLabels();
      derivedVariable0.setName((String) null);
      assertTrue(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.setLabel((String) null);
      rawVariable0.removeValueLabel(valueLabel0);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.removeSupportingDocument(supportingDocument0);
      rawVariable0.removeValueLabel(valueLabel0);
      rawVariable0.getFilePath();
      rawVariable0.setIdentifier((-1121));
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.setCoded(true);
      rawVariable0.getAlias();
      assertEquals("-1121", rawVariable0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = rawVariable0.getSupportingDocuments();
      derivedVariable0.removeSupportingDocuments(arrayList0);
      assertFalse(rawVariable0.isCoded());
      assertFalse(rawVariable0.isNewRecord());
      assertEquals(0, rawVariable0.getIdentifier());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = new ArrayList<Variable>();
      derivedVariable0.removeSourceVariables(arrayList0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      boolean boolean0 = derivedVariable0.containsOntologyTerm(ontologyTerm0);
      assertFalse(boolean0);
      
      derivedVariable0.getNotes();
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCoded());
      assertEquals(0, derivedVariable0.getIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.637586159726386
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getCategory();
      Variable.validateFields(rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setCleaned(true);
      derivedVariable0.setQuestionNumber("Unknown");
      derivedVariable0.hasSameDisplayName(rawVariable0);
      User user0 = new User();
      user0.setUserID("Unknown");
      derivedVariable0.questionNumber = "";
      DerivedVariable derivedVariable1 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable1);
      derivedVariable0.hasSameDisplayName(derivedVariable1);
      derivedVariable1.setAvailability("sOO9TX,9j*QQ");
      derivedVariable0.notes = "supportingDocument.fileName.label";
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      derivedVariable0.addSupportingDocuments(arrayList0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.removeOntologyTerm(ontologyTerm0);
      derivedVariable1.getCleaningStatus();
      derivedVariable0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-923));
      derivedVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.isCleaned();
      rawVariable0.addOntologyTerm(ontologyTerm0);
      assertTrue(rawVariable0.isCleaned());
      
      derivedVariable1.getAvailability();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      assertFalse(derivedVariable0.isCleaned());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("tLzD}c%H\"<NLz>b&~");
      derivedVariable0.addSupportingDocument(supportingDocument0);
      derivedVariable0.setName("Cnw}88)oT?^obHa-/B%");
      derivedVariable0.isCoded();
      derivedVariable0.setQuestionNumber((String) null);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.addSourceVariable(rawVariable0);
      derivedVariable0.setCoded(false);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      derivedVariable0.containsSupportingDocument(supportingDocument1);
      // Undeclared exception!
      try { 
        derivedVariable0.addSupportingDocuments((ArrayList<SupportingDocument>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.583518938456111
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<ValueLabel> arrayList0 = derivedVariable0.getValueLabels();
      derivedVariable0.setAvailability("");
      derivedVariable0.setValueLabels(arrayList0);
      derivedVariable0.columnEnd = "";
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.addSourceVariable(derivedVariable1);
      derivedVariable1.setCoded(false);
      derivedVariable0.getDisplayItemIdentifier();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable1.removeSourceVariables(arrayList1);
      derivedVariable0.cloneAttributes(derivedVariable1);
      derivedVariable1.clone();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setDescription("");
      ontologyTerm0.setNameSpace("r");
      derivedVariable1.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.createVariableSummary();
      derivedVariable0.getDisplayName();
      derivedVariable0.setAvailability("supportingDocument.fileName.label");
      ArrayList<Variable> arrayList2 = derivedVariable0.getSourceVariables();
      arrayList2.add((Variable) null);
      derivedVariable0.removeSourceVariables(arrayList2);
      ValueLabel valueLabel0 = new ValueLabel();
      User user0 = new User("supportingDocument.fileName.label", "");
      ValueLabel.differencesExist(user0, derivedVariable0, valueLabel0, valueLabel0);
      derivedVariable0.removeValueLabel(valueLabel0);
      ArrayList<SupportingDocument> arrayList3 = derivedVariable0.getSupportingDocuments();
      derivedVariable1.addSupportingDocuments(arrayList3);
      RawVariable rawVariable0 = new RawVariable();
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
  //Test case number: 13
  /*Coverage entropy=3.3627410007370897
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaningStatus("variable.alias.label");
      rawVariable0.setCleaned(true);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("5X3zII");
      supportingDocument0.getDisplayName();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("Ie[]rZ;z(H~y^R");
      supportingDocument0.getDisplayName();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.setCoded(true);
      rawVariable0.notes = "";
      rawVariable0.setCleaningStatus("");
      rawVariable0.setCleaningDescription("|=\"^=");
      rawVariable0.clone();
      rawVariable0.getCleaningDescription();
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
  //Test case number: 14
  /*Coverage entropy=3.396914420218569
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.codeBookNumber = "KBVWFtI7D!ftdJrSiZD";
      rawVariable0.setQuestionNumber("KBVWFtI7D!ftdJrSiZD");
      rawVariable0.setAvailability("J#zuWbrS``GVe");
      Variable.validateFields(rawVariable0);
      rawVariable0.getQuestionNumber();
      rawVariable0.setCategory("KBVWFtI7D!ftdJrSiZD");
      User user0 = new User("M@2KAl3{{~O|}.e\"#", "*2+");
      user0.setAddressLine1("M@2KAl3{{~O|}.e\"#");
      Variable.detectChangesInAlternativeVariable(user0, rawVariable0, rawVariable0);
      rawVariable0.getColumnStart();
      rawVariable0.setLabel("");
      user0.setPostCode("5!e7^");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      user0.setAddressLine2("&|@+T<J(?U[?|DiL");
      rawVariable0.containsSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.containsSourceVariable(rawVariable1);
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      rawVariable1.setQuestionNumber("VARIABLE");
      Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      rawVariable1.getAvailability();
      rawVariable1.setIdentifier(0);
      rawVariable0.removeSupportingDocument(supportingDocument0);
      assertEquals("KBVWFtI7D!ftdJrSiZD", rawVariable0.getCodeBookNumber());
      
      rawVariable1.setColumnEnd("variable.year.label");
      assertEquals("Unknown", rawVariable1.getAvailability());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      String string0 = null;
      ArrayList<OntologyTerm> arrayList0 = derivedVariable0.getOntologyTerms();
      derivedVariable0.addOntologyTerms(arrayList0);
      derivedVariable0.createVariableSummary();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setIdentifier(1);
      ArrayList<Variable> arrayList1 = null;
      try {
        arrayList1 = new ArrayList<Variable>((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.2435566421942243
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaningStatus("variable.alias.label");
      rawVariable0.setCleaned(true);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("5X3zII");
      supportingDocument0.getDisplayName();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("Ie[]rZ;z(H~y^R");
      supportingDocument0.getDisplayName();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.setCoded(true);
      rawVariable0.notes = "";
      rawVariable0.setCleaningDescription("|=\"^=");
      rawVariable0.clone();
      rawVariable0.getCleaningDescription();
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
  //Test case number: 17
  /*Coverage entropy=2.20478541691352
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = derivedVariable0.getOntologyTerms();
      derivedVariable0.setOntologyTerms(arrayList0);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      arrayList1.add((SupportingDocument) null);
      derivedVariable0.removeSupportingDocuments(arrayList1);
      derivedVariable0.isCleaned();
      derivedVariable0.setColumnStart("general.error.blankField");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      RawVariable rawVariable0 = new RawVariable();
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
  //Test case number: 18
  /*Coverage entropy=3.6537024929636472
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      User user0 = new User("^5w!k,!", "^5w!k,!");
      RawVariable rawVariable2 = new RawVariable();
      Variable.detectFieldChanges(user0, rawVariable2, rawVariable2);
      rawVariable0.setAlternativeVariable(rawVariable2);
      RawVariable rawVariable3 = (RawVariable)rawVariable0.clone();
      assertEquals("Unknown", rawVariable3.getAvailability());
      assertEquals("Unknown", rawVariable3.getCategory());
      assertFalse(rawVariable3.isCleaned());
      assertEquals("Unknown", rawVariable3.getCleaningStatus());
      assertEquals(0, rawVariable3.getIdentifier());
      
      ArrayList<MacawChangeEvent> arrayList0 = Variable.detectFieldChanges(user0, rawVariable0, rawVariable2);
      assertTrue(arrayList0.isEmpty());
      assertFalse(rawVariable2.isCoded());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("T1OCxg1qa");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      derivedVariable0.setName("VARIABLE");
      assertEquals("VARIABLE", derivedVariable0.getName());
      
      RawVariable rawVariable1 = new RawVariable();
      DerivedVariable.validateFields(derivedVariable0);
      assertFalse(derivedVariable0.isNewRecord());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("T1OCxg1qa");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      derivedVariable0.setName("VARIABLE");
      derivedVariable0.isCoded();
      User user0 = new User();
      user0.setLastName("?%%nWdu[F3dHq");
      user0.setAddressLine2("variable.alias.label");
      rawVariable0.containsSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.containsSourceVariable(rawVariable1);
      RawVariable rawVariable2 = new RawVariable();
      Variable.detectFieldChanges(user0, rawVariable2, derivedVariable0);
      rawVariable0.setQuestionNumber((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add(ontologyTerm1);
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setYear("kj#*[S?F*k>b;oB");
      derivedVariable0.isCoded();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable2.getValueLabels();
      derivedVariable2.setName("kj#*[S?F*k>b;oB");
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges((User) null, derivedVariable2, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6872176876298015
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaningStatus("variable.alias.label");
      rawVariable0.setCleaned(true);
      rawVariable0.setForm(",S|^_+N0&;f8sz");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("5X3zII");
      supportingDocument0.getDisplayName();
      User user0 = new User();
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.addValueLabel(valueLabel0);
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("Ie[]rZ;z(H~y^R");
      supportingDocument0.getDisplayName();
      user0.setPostCode((String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      user0.setAddressLine2("Ie[]rZ;z(H~y^R");
      rawVariable0.containsSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      rawVariable1.setQuestionNumber("variable.cleaningDescription.label");
      Variable.detectFieldChanges(user0, rawVariable1, derivedVariable0);
      derivedVariable0.addSupportingDocument((SupportingDocument) null);
      rawVariable1.getAvailability();
      rawVariable0.setIdentifier(0);
      rawVariable1.removeSupportingDocument(supportingDocument0);
      rawVariable1.setColumnEnd("variable.label.label");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.removeOntologyTerm(ontologyTerm0);
      assertEquals(",S|^_+N0&;f8sz", rawVariable0.getForm());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.657287226039444
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable0.removeValueLabel(valueLabel0);
      rawVariable1.setColumnEnd("8.V\"1C ap%Z2mS8f;#r");
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable1);
      // Undeclared exception!
      try { 
        Variable.detectChangesInAlternativeVariable((User) null, rawVariable0, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.799038997983739
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getCategory();
      Variable.validateFields(rawVariable0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setCleaned(true);
      derivedVariable0.setQuestionNumber("Unknown");
      derivedVariable0.hasSameDisplayName(rawVariable0);
      User user0 = new User();
      user0.setUserID("Unknown");
      derivedVariable0.questionNumber = "";
      DerivedVariable derivedVariable1 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable1);
      derivedVariable0.hasSameDisplayName(derivedVariable1);
      derivedVariable1.setAvailability("sOO9TX,9j*QQ");
      derivedVariable0.notes = "supportingDocument.fileName.label";
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      derivedVariable0.addSupportingDocuments(arrayList0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setQuestionNumber((String) null);
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable1);
      derivedVariable0.addSupportingDocument((SupportingDocument) null);
      rawVariable0.getAvailability();
      rawVariable0.setIdentifier(0);
      assertTrue(rawVariable0.isCleaned());
      
      rawVariable1.removeSupportingDocument((SupportingDocument) null);
      rawVariable1.setColumnEnd("supportingDocument.fileName.label");
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      OntologyTerm ontologyTerm2 = new OntologyTerm();
      ontologyTerm2.setIdentifier(0);
      rawVariable1.removeOntologyTerm(ontologyTerm2);
      assertEquals("", rawVariable1.getColumnStart());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.335596863781942
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      Variable.detectChangesInAlternativeVariable(user0, rawVariable1, (Variable) null);
      Variable.detectFieldChanges(user0, rawVariable1, rawVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable1.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      // Undeclared exception!
      try { 
        derivedVariable0.containsSourceVariable((Variable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.158039775219434
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      arrayList0.add(ontologyTerm1);
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setYear("kj#*[S?F*k>b;oB");
      User user0 = new User();
      User user1 = new User("general.error.blankField", "#I");
      User user2 = new User();
      User.detectFieldChanges(user0, user0, user2);
      RawVariable rawVariable0 = new RawVariable();
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
  }
}