/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:07:59 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.removeOntologyTerm(ontologyTerm0);
      String string0 = rawVariable0.getDisplayItemIdentifier();
      assertFalse(rawVariable0.isNewRecord());
      assertEquals("0", string0);
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isCoded());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = derivedVariable0.getOntologyTerms();
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.getAlternativeVariable();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      arrayList1.trimToSize();
      derivedVariable0.removeSourceVariables(arrayList1);
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      ArrayList<OntologyTerm> arrayList1 = new ArrayList<OntologyTerm>(arrayList0);
      derivedVariable0.setOntologyTerms(arrayList1);
      OntologyTerm[] ontologyTermArray0 = new OntologyTerm[0];
      arrayList1.toArray(ontologyTermArray0);
      derivedVariable0.columnStart = "";
      derivedVariable0.setName("");
      derivedVariable0.addOntologyTerms(arrayList1);
      ArrayList<Variable> arrayList2 = derivedVariable0.getSourceVariables();
      derivedVariable0.addSourceVariables(arrayList2);
      String string0 = derivedVariable0.getCleaningStatus();
      assertEquals("Unknown", string0);
      assertNotNull(string0);
      
      derivedVariable0.getFilePath();
      derivedVariable0.getDisplayName();
      derivedVariable0.setForm("");
      derivedVariable0.getSourceVariables();
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isCleaned());
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
      assertFalse(derivedVariable0.isNewRecord());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.setName("");
      derivedVariable0.setColumnStart("");
      derivedVariable0.clone();
      derivedVariable0.getColumnStart();
      derivedVariable0.setCoded(true);
      derivedVariable0.setAlias("+G[/UQFc");
      derivedVariable0.setName("<WSG<|a4#rGD0l3");
      derivedVariable0.removeOntologyTerm(ontologyTerm0);
      derivedVariable0.clone();
      DerivedVariable.validateFields(derivedVariable0);
      derivedVariable0.setCleaningStatus("");
      assertEquals("+G[/UQFc", derivedVariable0.getAlias());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCodeBookNumber("");
      rawVariable0.clone();
      rawVariable0.isCoded();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.isNewRecord();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setIsNewRecord(true);
      derivedVariable0.clone();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setIdentifier(0);
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      rawVariable0.setOntologyTerms(arrayList0);
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.addValueLabel(valueLabel0);
      derivedVariable0.getOntologyTerms();
      rawVariable0.setCleaned(true);
      assertTrue(rawVariable0.isCleaned());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getAlternativeVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getSupportingDocuments();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.containsSupportingDocument(supportingDocument0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
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
  /*Coverage entropy=2.290270939009878
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User();
      derivedVariable0.questionNumber = "";
      user0.setPassword("");
      user0.setPostCode("}*");
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setIsNewRecord(false);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.addSourceVariable(rawVariable0);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.addSupportingDocument((SupportingDocument) null);
      rawVariable1.setForm((String) null);
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, derivedVariable0, rawVariable1);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setColumnEnd(";eAN{!F^cUI|P&6n");
      derivedVariable0.setAlias("");
      String string0 = null;
      derivedVariable0.setFilePath((String) null);
      String string1 = "#NKapuGw";
      derivedVariable0.setQuestionNumber("#NKapuGw");
      User user0 = new User();
      user0.setUserID("");
      DerivedVariable derivedVariable1 = new DerivedVariable();
      try { 
        DerivedVariable.validateFields(derivedVariable1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.DerivedVariable", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setNotes("[^b=");
      User user0 = new User("^C0AWW$k5B66?,u1u", "");
      user0.setAddressLine1("[^b=");
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setFilePath("DELETE");
      derivedVariable0.setIdentifier((-1134));
      derivedVariable0.codeBookNumber = "ib89onpA@0]L('o<c;C";
      ArrayList<ValueLabel> arrayList0 = derivedVariable0.getValueLabels();
      int int0 = 1176;
      arrayList0.spliterator();
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList0.add(valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      // Undeclared exception!
      try { 
        arrayList0.add(1176, valueLabel1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1176, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.setIsNewRecord(true);
      ArrayList<OntologyTerm> arrayList0 = derivedVariable1.getOntologyTerms();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      derivedVariable0.setOntologyTerms(arrayList0);
      derivedVariable0.setFilePath("");
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable0.addValueLabel(valueLabel0);
      assertFalse(derivedVariable0.isNewRecord());
      
      int int0 = derivedVariable1.getIdentifier();
      assertTrue(derivedVariable1.isNewRecord());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      ontologyTerm0.setTerm("})s<s5ot0F3AUC<;");
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.setCleaningDescription("");
      rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      try { 
        OntologyTerm.validateFields(ontologyTerm1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.OntologyTerm", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.4965075614664793
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setIdentifier(2833);
      rawVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.setCleaned(true);
      rawVariable0.getFilePath();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.createVariableSummary();
      rawVariable1.setColumnEnd("");
      rawVariable0.setAlternativeVariable(rawVariable1);
      rawVariable1.setIsNewRecord(true);
      User user0 = new User("ir]B2oD]Dx&@", "");
      rawVariable1.questionNumber = "";
      user0.setCity("user.status.unverified");
      user0.setAddressLine2("");
      user0.setAddressLine2("");
      rawVariable1.createVariableSummary();
      user0.setCity("");
      rawVariable1.setNotes("");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setValueLabels((ArrayList<ValueLabel>) null);
      Variable.detectFieldChanges(user0, rawVariable1, derivedVariable0);
      rawVariable1.getSupportingDocuments();
      rawVariable1.updateOntologyTerm(ontologyTerm0);
      derivedVariable0.getSourceVariables();
      boolean boolean0 = rawVariable0.isCoded();
      rawVariable0.getAlternativeVariable();
      Variable variable0 = rawVariable0.getAlternativeVariable();
      boolean boolean1 = derivedVariable0.containsSourceVariable(variable0);
      assertTrue(rawVariable0.isCleaned());
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.5553480614894135
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setDescription("z.R9/ik#^G/TST");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.removeSupportingDocument(supportingDocument0);
      ontologyTerm0.clone();
      ontologyTerm0.setNameSpace("1hj");
      ontologyTerm0.setDescription("general.fieldValue.blank");
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.getColumnEnd();
      derivedVariable0.isCoded();
      derivedVariable0.getCleaningStatus();
      derivedVariable0.getForm();
      derivedVariable0.getDisplayName();
      derivedVariable0.getCategory();
      derivedVariable0.getDisplayName();
      derivedVariable0.setAvailability("F3XDa@9.x+:Y a#");
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      rawVariable0.setQuestionNumber(")rqkZ:P8qL");
      rawVariable0.setColumnEnd("");
      derivedVariable0.clone();
      rawVariable0.getNotes();
      rawVariable0.getAlternativeVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      rawVariable0.setSupportingDocuments(arrayList0);
      assertEquals(")rqkZ:P8qL", rawVariable0.getQuestionNumber());
      
      derivedVariable0.removeSupportingDocument(supportingDocument0);
      assertFalse(derivedVariable0.isNewRecord());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4545004761177
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.setSourceVariables(arrayList0);
      derivedVariable0.setNotes("variable.saveChanges.valueChanged");
      derivedVariable0.setCoded(true);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      arrayList1.add((SupportingDocument) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      arrayList1.containsAll(linkedList0);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList1.add(supportingDocument0);
      arrayList1.add((SupportingDocument) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle("variable.alias.label");
      arrayList1.add(supportingDocument1);
      derivedVariable0.removeSupportingDocuments(arrayList1);
      derivedVariable0.setNotes("variable.saveChanges.valueChanged");
      User user0 = new User();
      user0.setAffiliation("variable.alias.label");
      String string0 = "73}";
      user0.setAddressLine1("73}");
      RawVariable rawVariable0 = new RawVariable();
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      RawVariable rawVariable1 = new RawVariable();
      Variable.validateFields(rawVariable1);
      rawVariable1.setForm("variable.saveChanges.valueChanged");
      derivedVariable0.removeSourceVariable(rawVariable0);
      // Undeclared exception!
      try { 
        rawVariable1.addOntologyTerms((ArrayList<OntologyTerm>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.createVariableSummary();
      derivedVariable0.setName("M?+z^Ij) xXp26|");
      derivedVariable0.getColumnEnd();
      derivedVariable0.setCodeBookNumber("^PbGZoOxdA~Mfeh9");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setIdentifier(3);
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      arrayList0.add(ontologyTerm0);
      Comparator<OntologyTerm> comparator0 = (Comparator<OntologyTerm>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      derivedVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.getCleaningDescription();
      rawVariable0.getIdentifier();
      derivedVariable0.setCategory("");
      ArrayList<SupportingDocument> arrayList1 = rawVariable0.getSupportingDocuments();
      derivedVariable0.addSupportingDocuments(arrayList1);
      derivedVariable0.getAvailability();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList2 = derivedVariable1.getSupportingDocuments();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList2.add(supportingDocument0);
      rawVariable0.setSupportingDocuments(arrayList2);
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
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setOntologyName("variable.cleaningDescription.label");
      rawVariable0.containsOntologyTerm(ontologyTerm0);
      rawVariable0.setNotes("U4T!8[ y");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      derivedVariable0.removeValueLabel(valueLabel0);
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
  //Test case number: 16
  /*Coverage entropy=2.713730096006549
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getColumnEnd();
      derivedVariable0.codeBookNumber = "";
      derivedVariable0.setNotes("general.fieldValue.unknown");
      User user0 = new User();
      user0.setEmail("general.fieldValue.unknown");
      DerivedVariable derivedVariable1 = new DerivedVariable();
      user0.setStatus((String) null);
      derivedVariable1.addSourceVariable(derivedVariable0);
      DerivedVariable.detectFieldChanges(user0, derivedVariable1, derivedVariable0);
      derivedVariable0.setColumnEnd("user.phone.saveChanges");
      ArrayList<ValueLabel> arrayList0 = derivedVariable0.getValueLabels();
      arrayList0.stream();
      derivedVariable1.setValueLabels(arrayList0);
      derivedVariable0.setColumnEnd("general.fieldValue.unknown");
      derivedVariable0.getFilePath();
      derivedVariable1.setCleaningStatus("AxCFO");
      derivedVariable1.getSourceVariables();
      derivedVariable1.setColumnStart((String) null);
      derivedVariable0.setCoded(true);
      derivedVariable0.getSourceVariables();
      ArrayList<SupportingDocument> arrayList1 = derivedVariable1.getSupportingDocuments();
      derivedVariable0.removeSupportingDocuments(arrayList1);
      derivedVariable0.getSourceVariables();
      derivedVariable0.setCleaningDescription((String) null);
      assertEquals("general.fieldValue.unknown", derivedVariable0.getColumnEnd());
      
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.hasSameDisplayName(rawVariable1);
      assertFalse(rawVariable0.isNewRecord());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.setIdentifier((-1754));
      rawVariable0.removeValueLabel(valueLabel0);
      rawVariable0.setCategory("");
      rawVariable0.getCleaningStatus();
      ArrayList<SupportingDocument> arrayList0 = rawVariable0.getSupportingDocuments();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      arrayList1.remove((Object) rawVariable0);
      arrayList0.retainAll(arrayList1);
      rawVariable0.addSupportingDocuments(arrayList0);
      User user0 = new User("SQ#A4#1]>@+h", "\f10t<4yFZK7B");
      ArrayList<OntologyTerm> arrayList2 = new ArrayList<OntologyTerm>();
      rawVariable0.addOntologyTerms(arrayList2);
      user0.setUserID("Unknown");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, rawVariable0);
      derivedVariable0.removeSourceVariable(rawVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("\f10t<4yFZK7B");
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.createVariableSummary();
      rawVariable0.setFilePath("FMjIl2[Et");
      derivedVariable0.getLabel();
      derivedVariable0.containsSourceVariable(rawVariable0);
      derivedVariable0.setCategory("$p{UFf");
      derivedVariable0.getAlias();
      derivedVariable0.removeValueLabel(valueLabel0);
      derivedVariable0.getFilePath();
      assertEquals("$p{UFf", derivedVariable0.getCategory());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.681445343144403
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      Variable.validateFields(rawVariable0);
      rawVariable0.setQuestionNumber("+m@{F");
      rawVariable0.setQuestionNumber("Mh");
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setMissingValue(true);
      rawVariable0.setAvailability("+m@{F");
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      ValueLabel.validateFields(valueLabel0);
      rawVariable0.addValueLabel(valueLabel0);
      rawVariable0.isCoded();
      rawVariable0.getLabel();
      rawVariable0.setForm("+m@{F");
      rawVariable0.getCategory();
      rawVariable0.setFilePath("+m@{F");
      rawVariable0.setCleaned(false);
      User user0 = new User("52I(CyjKU\"6.", "ontologyTerm.nameSpace.label");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("+m@{F", rawVariable0.getFilePath());
      assertEquals("+m@{F", rawVariable0.getForm());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.094729047527649
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm0.getDisplayName();
      OntologyTerm ontologyTerm2 = new OntologyTerm();
      ontologyTerm2.setIdentifier(1043);
      arrayList0.add(ontologyTerm2);
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.addOntologyTerms(arrayList0);
      assertFalse(arrayList0.contains(ontologyTerm0));
      
      rawVariable0.getDisplayName();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      assertFalse(rawVariable0.isCoded());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.3276698862269427
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.isNewRecord();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setIsNewRecord(false);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      RawVariable rawVariable1 = (RawVariable)rawVariable0.clone();
      assertEquals("Unknown", rawVariable1.getCategory());
      assertEquals("Unknown", rawVariable1.getAvailability());
      assertFalse(rawVariable1.isCoded());
      assertEquals("Unknown", rawVariable1.getCleaningStatus());
      assertEquals(0, rawVariable1.getIdentifier());
      
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      OntologyTerm ontologyTerm2 = new OntologyTerm();
      ontologyTerm2.setIdentifier((-2067947214));
      derivedVariable0.updateOntologyTerm(ontologyTerm1);
      ArrayList<OntologyTerm> arrayList1 = new ArrayList<OntologyTerm>();
      rawVariable0.setOntologyTerms(arrayList0);
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.addValueLabel(valueLabel0);
      derivedVariable0.getOntologyTerms();
      assertFalse(derivedVariable0.isNewRecord());
      assertFalse(derivedVariable0.isCleaned());
      
      rawVariable0.setCleaned(false);
      assertEquals(0, rawVariable0.getIdentifier());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.444419382388103
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.questionNumber = "+~8+6ogw";
      arrayList0.add(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.getDisplayName();
      arrayList0.add(ontologyTerm1);
      ArrayList<ValueLabel> arrayList1 = new ArrayList<ValueLabel>();
      rawVariable0.setValueLabels(arrayList1);
      User user0 = new User();
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.getSupportingDocuments();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getSourceVariables();
      rawVariable0.isCoded();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.getAlternativeVariable();
      rawVariable0.getAlternativeVariable();
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
  //Test case number: 22
  /*Coverage entropy=3.1354942159291497
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setCleaningDescription("user.postCode.label");
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.setName("user.email.label");
      User user0 = new User();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      Variable.detectFieldChanges(user0, derivedVariable1, derivedVariable0);
      ArrayList<Variable> arrayList0 = derivedVariable1.getSourceVariables();
      derivedVariable0.setSourceVariables(arrayList0);
      assertEquals("user.postCode.label", derivedVariable0.getCleaningDescription());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.setName("");
      RawVariable rawVariable0 = new RawVariable();
      // Undeclared exception!
      try { 
        RawVariable.detectFieldChanges((User) null, rawVariable0, rawVariable0);
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
  /*Coverage entropy=2.9434074591775383
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User("k!)4Pv", "F~@,0GJ&DT$5oY-6D");
      OntologyTerm.detectFieldChanges(user0, ontologyTerm0, ontologyTerm0);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable0.setCleaningDescription("k!)4Pv");
      rawVariable0.columnEnd = "g";
      rawVariable0.getLabel();
      rawVariable0.getAlternativeVariable();
      rawVariable0.getAvailability();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.setMissingValue(true);
      rawVariable0.setAvailability("vT5/S<Fl:PB(\"0$");
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      rawVariable0.addValueLabel(valueLabel0);
      rawVariable0.isCoded();
      rawVariable0.getLabel();
      rawVariable0.setForm("g");
      rawVariable0.getCategory();
      rawVariable0.setFilePath("general.fieldValue.unknown");
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setCleaned(true);
      User user1 = new User("user.email.label", "general.fieldValue.unknown");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.detectFieldChanges(user1, rawVariable0, derivedVariable0);
      assertEquals("g", rawVariable0.getForm());
      assertEquals("general.fieldValue.unknown", rawVariable0.getFilePath());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.4658754357647554
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.removeSourceVariable(rawVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      arrayList0.add(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.getDisplayName();
      ArrayList<OntologyTerm> arrayList1 = derivedVariable0.getOntologyTerms();
      arrayList1.add(ontologyTerm0);
      ArrayList<ValueLabel> arrayList2 = new ArrayList<ValueLabel>();
      rawVariable0.setValueLabels(arrayList2);
      User user0 = new User();
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      rawVariable0.getSupportingDocuments();
      rawVariable0.updateOntologyTerm(ontologyTerm1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.getSourceVariables();
      rawVariable0.isCoded();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.getAlternativeVariable();
      rawVariable0.getAlternativeVariable();
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
  /*Coverage entropy=3.2653221962395893
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.hasSameDisplayName(rawVariable1);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      MacawChangeEvent macawChangeEvent0 = new MacawChangeEvent();
      macawChangeEvent0.getVariableOwnerID();
      linkedList0.add((Integer) null);
      arrayList0.containsAll(linkedList0);
      arrayList0.remove((Object) rawVariable0);
      derivedVariable0.addSourceVariables(arrayList0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.clone();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      DerivedVariable derivedVariable3 = new DerivedVariable();
      derivedVariable1.clone();
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      derivedVariable2.setAlternativeVariable(rawVariable1);
      derivedVariable2.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.removeSourceVariables(arrayList1);
      User user0 = new User("zDqlmwS2\"%OUZnq?l/", "zDqlmwS2\"%OUZnq?l/");
      RawVariable rawVariable2 = new RawVariable();
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable1.clone();
      DerivedVariable derivedVariable4 = new DerivedVariable();
      DerivedVariable.detectFieldChanges(user0, derivedVariable4, derivedVariable2);
      derivedVariable3.setSourceVariables(arrayList0);
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, (Variable) null);
      derivedVariable0.addSourceVariables(arrayList0);
  }
}
