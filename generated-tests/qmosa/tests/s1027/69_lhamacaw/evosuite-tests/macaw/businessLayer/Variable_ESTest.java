/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:36:43 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.UnaryOperator;
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
  /*Coverage entropy=3.8286413964890924
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      ArrayList<SupportingDocument> arrayList1 = rawVariable0.getSupportingDocuments();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList1.add(supportingDocument0);
      User user0 = new User();
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.setSupportingDocuments(arrayList1);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      arrayList0.add(ontologyTerm0);
      ArrayList<OntologyTerm> arrayList2 = new ArrayList<OntologyTerm>(arrayList0);
      rawVariable0.addOntologyTerms(arrayList2);
      User user1 = new User();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setCleaningStatus("kIp+KY~2GeAybjJi;^:");
      derivedVariable0.columnStart = "";
      derivedVariable0.setAlternativeVariable(rawVariable0);
      ArrayList<Variable> arrayList3 = new ArrayList<Variable>();
      derivedVariable0.addSourceVariables(arrayList3);
      derivedVariable0.setAvailability("");
      rawVariable0.setNotes("");
      DerivedVariable.detectFieldChanges(user1, derivedVariable0, derivedVariable0);
      rawVariable0.clone();
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
  //Test case number: 1
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.cloneAttributes(rawVariable1);
      rawVariable1.setForm((String) null);
      rawVariable1.setValueLabels((ArrayList<ValueLabel>) null);
      rawVariable1.setFilePath("q{89XwARcwoK");
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      arrayList0.parallelStream();
      rawVariable1.removeSupportingDocuments(arrayList0);
      rawVariable1.getYear();
      rawVariable0.getCodeBookNumber();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setColumnEnd("q{89XwARcwoK");
      derivedVariable0.hasSameDisplayName(rawVariable0);
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      // Undeclared exception!
      try { 
        rawVariable1.addValueLabel(valueLabel0);
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      String string0 = "variable.codeBookNumber.label";
      rawVariable0.addSupportingDocument((SupportingDocument) null);
      rawVariable0.setAvailability("variable.codeBookNumber.label");
      rawVariable0.setLabel("variable.codeBookNumber.label");
      rawVariable0.createVariableSummary();
      rawVariable0.setColumnEnd("variable.codeBookNumber.label");
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
  //Test case number: 3
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setCleaningDescription("");
      derivedVariable0.clone();
      derivedVariable0.columnStart = "";
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      User user0 = new User("", "");
      RawVariable rawVariable1 = new RawVariable();
      supportingDocument0.setFileName((String) null);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      rawVariable1.setAlias("");
      arrayList0.add(supportingDocument0);
      user0.setLastName("general.fieldValue.unknown");
      rawVariable1.setColumnEnd("C0^5");
      rawVariable1.removeSupportingDocuments(arrayList0);
      Variable.detectChangesInAlternativeVariable(user0, rawVariable0, rawVariable1);
      derivedVariable0.getName();
      rawVariable0.clone();
      derivedVariable0.setFilePath("");
      rawVariable0.hasSameDisplayName(rawVariable1);
      rawVariable1.setIsNewRecord(true);
      derivedVariable0.setName("general.fieldValue.unknown");
      assertEquals("general.fieldValue.unknown", derivedVariable0.getDisplayName());
      
      rawVariable0.setFilePath("variable.questionNumber.label");
      assertEquals("variable.questionNumber.label", rawVariable0.getFilePath());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.167313071194722
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      User user0 = new User("", "l*~,w]");
      user0.setLastName("`TWLL~.C#nVQSSa");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      DerivedVariable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setName("%H\"$3akGNhU");
      derivedVariable0.clone();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.clone();
      rawVariable0.setAlternativeVariable(derivedVariable0);
      derivedVariable0.setNotes("");
      assertEquals("%H\"$3akGNhU", derivedVariable0.getName());
      
      DerivedVariable.validateFields(derivedVariable0);
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.5263605246161633
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      derivedVariable0.removeSupportingDocuments(arrayList1);
      ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
      arrayList0.add((Variable) derivedVariable0);
      arrayList0.removeAll(arrayList2);
      derivedVariable0.questionNumber = null;
      arrayList0.add((Variable) derivedVariable0);
      derivedVariable0.setSourceVariables(arrayList0);
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList3 = new ArrayList<SupportingDocument>();
      rawVariable0.setAvailability((String) null);
      user0.setUserID("]axHe@<^jB67Oj#r6oF");
      rawVariable0.addSupportingDocuments(arrayList3);
      MacawChangeEvent macawChangeEvent0 = Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, rawVariable0);
      assertEquals("Changed variable \"Alternative Variable\", field \"blank\", from \"\" to \"{3}\".", macawChangeEvent0.getChangeMessage());
      assertNotNull(macawChangeEvent0);
      
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.containsSourceVariable(rawVariable1);
      String string0 = derivedVariable0.getColumnStart();
      assertNotNull(string0);
      
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable1.cloneAttributes(derivedVariable0);
      assertFalse(derivedVariable0.isCleaned());
      assertEquals("Unknown", derivedVariable0.getAvailability());
      assertEquals("Unknown", derivedVariable0.getCleaningStatus());
      assertFalse(derivedVariable0.isCoded());
      assertEquals("Unknown", derivedVariable0.getCategory());
      
      ArrayList<OntologyTerm> arrayList4 = new ArrayList<OntologyTerm>();
      rawVariable1.addOntologyTerms(arrayList4);
      assertEquals(0, rawVariable1.getIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.getCleaningDescription();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      derivedVariable0.getNotes();
      rawVariable0.getLabel();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      ontologyTerm0.setIdentifier(0);
      rawVariable0.setCleaned(true);
      derivedVariable0.setIdentifier((-1));
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      derivedVariable0.setAlias("");
      ontologyTerm0.setTerm("5RTOS`T3305{l7PfYp");
      ontologyTerm0.setNameSpace(".{d)|");
      derivedVariable0.hasSameDisplayName(rawVariable0);
      derivedVariable0.setQuestionNumber("variable.alias.label");
      rawVariable0.containsOntologyTerm(ontologyTerm0);
      derivedVariable0.setFilePath("");
      User user0 = new User();
      DerivedVariable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      assertEquals("variable.alias.label", derivedVariable0.getQuestionNumber());
      assertEquals("Unknown", derivedVariable0.getAvailability());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      String string0 = "";
      rawVariable0.setAlias("");
      rawVariable0.getSupportingDocuments();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("");
      rawVariable0.addOntologyTerm(ontologyTerm0);
      // Undeclared exception!
      try { 
        rawVariable0.containsOntologyTerm((OntologyTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getCodeBookNumber();
      derivedVariable0.setCleaned(true);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.clone();
      supportingDocument0.setIsNewRecord(true);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      derivedVariable0.setQuestionNumber((String) null);
      derivedVariable0.setColumnStart("I%+Z4UBkt\"1\"p");
      derivedVariable0.setAlias("");
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      ontologyTerm0.setTerm(":/stV^s");
      rawVariable0.setCleaned(true);
      ontologyTerm0.setTerm("");
      ontologyTerm0.getDisplayName();
      rawVariable0.removeOntologyTerm(ontologyTerm0);
      rawVariable0.setAlias("");
      rawVariable0.hasSameDisplayName(derivedVariable0);
      rawVariable0.getNotes();
      derivedVariable0.getValueLabels();
      // Undeclared exception!
      try { 
        derivedVariable0.removeSupportingDocuments(arrayList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<ValueLabel> arrayList0 = new ArrayList<ValueLabel>(685);
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList0.add(valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      derivedVariable0.setIdentifier(2320);
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.EDIT;
      valueLabel1.setEditingOperationType(valueLabel_EditingOperationType0);
      arrayList0.add(valueLabel1);
      derivedVariable0.setValueLabels(arrayList0);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      derivedVariable0.removeSupportingDocuments(arrayList1);
      derivedVariable0.getLabel();
      derivedVariable0.isNewRecord();
      derivedVariable0.getAvailability();
      derivedVariable0.removeValueLabel(valueLabel0);
      boolean boolean0 = derivedVariable0.isCleaned();
      assertEquals(2320, derivedVariable0.getIdentifier());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      UnaryOperator<SupportingDocument> unaryOperator0 = UnaryOperator.identity();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("J*[q?F?Si|;lCfKw}M", "general.error.promotesSecurityRisk");
      user0.setAddressLine2((String) null);
      UnaryOperator.identity();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      arrayList0.add(supportingDocument0);
      supportingDocument0.setFileName("");
      unaryOperator0.apply(supportingDocument0);
      arrayList0.replaceAll(unaryOperator0);
      rawVariable0.addSupportingDocuments(arrayList0);
      rawVariable0.setColumnStart("");
      ArrayList<OntologyTerm> arrayList1 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList1.add(ontologyTerm0);
      rawVariable0.removeOntologyTerms(arrayList1);
      rawVariable0.isNewRecord();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(rawVariable0);
      ArrayList<Variable> arrayList2 = derivedVariable0.getSourceVariables();
      derivedVariable0.setSourceVariables(arrayList2);
      rawVariable0.setAlias("user.lastName.label");
      rawVariable0.getAlias();
      assertEquals("user.lastName.label", rawVariable0.getAlias());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.583518938456111
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      String string0 = "ayAWlly`J";
      derivedVariable0.columnEnd = "ayAWlly`J";
      derivedVariable0.questionNumber = "-";
      derivedVariable0.clone();
      derivedVariable0.setIdentifier(1067);
      derivedVariable0.setCleaningDescription("");
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      derivedVariable0.getCleaningDescription();
      derivedVariable0.setCleaningStatus((String) null);
      derivedVariable0.columnStart = null;
      derivedVariable0.getSupportingDocuments();
      derivedVariable0.setCoded(true);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.setAlternativeVariable(derivedVariable1);
      derivedVariable1.getLabel();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      derivedVariable1.containsSourceVariable(derivedVariable0);
      User user0 = new User();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable1, derivedVariable0);
      derivedVariable1.setSupportingDocuments(arrayList0);
      derivedVariable1.getFilePath();
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
  //Test case number: 12
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.getCleaningDescription();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      derivedVariable0.getNotes();
      rawVariable0.getLabel();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      ontologyTerm0.setIdentifier(0);
      rawVariable0.setCleaned(true);
      derivedVariable0.setIdentifier((-1));
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      derivedVariable0.setAlias("");
      ontologyTerm0.setTerm("5RTOS`T3305{l7PfYp");
      ontologyTerm0.setNameSpace(".{d)|");
      derivedVariable0.hasSameDisplayName(rawVariable0);
      derivedVariable0.setQuestionNumber("variable.alias.label");
      rawVariable0.containsOntologyTerm(ontologyTerm0);
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      assertEquals("-1", derivedVariable0.getDisplayItemIdentifier());
      
      rawVariable0.removeSupportingDocument(supportingDocument0);
      assertFalse(rawVariable0.isNewRecord());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      UnaryOperator<SupportingDocument> unaryOperator0 = UnaryOperator.identity();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("J*[q?F?Si|;lCfKw}M", "general.error.promotesSecurityRisk");
      user0.setAddressLine2((String) null);
      UnaryOperator.identity();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      arrayList0.add(supportingDocument0);
      supportingDocument0.setFileName("");
      unaryOperator0.apply(supportingDocument0);
      arrayList0.replaceAll(unaryOperator0);
      rawVariable0.addSupportingDocuments(arrayList0);
      rawVariable0.setColumnStart("J*[q?F?Si|;lCfKw}M");
      ArrayList<OntologyTerm> arrayList1 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList2 = rawVariable0.getOntologyTerms();
      arrayList2.add(ontologyTerm0);
      rawVariable0.removeOntologyTerms(arrayList1);
      rawVariable0.isNewRecord();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(rawVariable0);
      ArrayList<Variable> arrayList3 = derivedVariable0.getSourceVariables();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.setSourceVariables(arrayList3);
      rawVariable0.setAlias((String) null);
      rawVariable0.getAlias();
      assertEquals("J*[q?F?Si|;lCfKw}M", rawVariable0.getColumnStart());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5665989181145106
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.getCleaningDescription();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      derivedVariable0.getNotes();
      rawVariable0.getLabel();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      ArrayList<SupportingDocument> arrayList0 = rawVariable0.getSupportingDocuments();
      arrayList0.add(supportingDocument1);
      supportingDocument1.setFileName("");
      UnaryOperator<SupportingDocument> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply(supportingDocument0);
      arrayList0.replaceAll(unaryOperator0);
      rawVariable0.addSupportingDocuments(arrayList0);
      rawVariable0.setColumnStart("");
      ArrayList<OntologyTerm> arrayList1 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ArrayList<OntologyTerm> arrayList2 = rawVariable0.getOntologyTerms();
      arrayList2.add(ontologyTerm1);
      // Undeclared exception!
      try { 
        rawVariable0.removeOntologyTerms(arrayList2);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }
}
