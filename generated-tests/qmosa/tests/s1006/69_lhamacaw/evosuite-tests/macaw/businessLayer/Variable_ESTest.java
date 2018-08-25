/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:14:45 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.2958368660043296
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User();
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      OntologyTerm.detectFieldChanges(user0, ontologyTerm1, ontologyTerm0);
      arrayList0.add(ontologyTerm0);
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.removeOntologyTerms(arrayList0);
      rawVariable0.setLabel("G%=$4I|cVOW_]1sp");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.cloneAttributes(derivedVariable0);
      rawVariable0.getFilePath();
      // Undeclared exception!
      try { 
        rawVariable0.removeOntologyTerm((OntologyTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.4965075614664793
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      derivedVariable0.getAlias();
      derivedVariable0.setIdentifier((-1));
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.addSourceVariable(derivedVariable1);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable1.setQuestionNumber("");
      rawVariable0.hasSameDisplayName(derivedVariable0);
      rawVariable0.setCoded(false);
      rawVariable0.getDisplayItemIdentifier();
      rawVariable0.getColumnStart();
      Variable.validateFields(rawVariable0);
      derivedVariable1.clone();
      derivedVariable0.isCoded();
      int int0 = derivedVariable0.getIdentifier();
      assertEquals("-1", derivedVariable0.getDisplayItemIdentifier());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.removeSourceVariable(derivedVariable1);
      ArrayList<OntologyTerm> arrayList0 = derivedVariable1.getOntologyTerms();
      derivedVariable0.setOntologyTerms(arrayList0);
      derivedVariable0.setName("GVxM*");
      derivedVariable0.codeBookNumber = "";
      derivedVariable0.setCleaningDescription("");
      Variable.validateFields(derivedVariable0);
      derivedVariable0.setAlias("G=h0},&Y#h");
      derivedVariable0.setCleaningDescription("");
      derivedVariable0.isCleaned();
      assertEquals("GVxM*", derivedVariable0.getDisplayName());
      
      String string0 = derivedVariable1.getAvailability();
      assertEquals("Unknown", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      User user0 = new User("N[Ghly", "variable.isCoded.label");
      user0.setPassword("m+KYBu");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.cloneAttributes(derivedVariable1);
      RawVariable rawVariable0 = new RawVariable();
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, rawVariable0);
      derivedVariable0.setNotes("variable.availability.label");
      assertEquals("variable.availability.label", derivedVariable0.getNotes());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.176082814659591
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.clone();
      ontologyTerm0.setNewRecord(false);
      ontologyTerm0.setNameSpace("*C");
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable0.getLabel();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.addSourceVariables(arrayList0);
      rawVariable0.setCodeBookNumber("qp>5[^%N|/.oa`4l=");
      assertEquals("qp>5[^%N|/.oa`4l=", rawVariable0.getCodeBookNumber());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.setColumnEnd("**Ax$d{`f76");
      rawVariable0.getValueLabels();
      rawVariable0.setCoded(false);
      assertEquals("**Ax$d{`f76", rawVariable0.getColumnEnd());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.7612001156935655
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.setColumnStart("VARIABLE");
      rawVariable0.form = "|9F4P  Fe.";
      supportingDocument0.setDescription("");
      rawVariable0.setCategory("");
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.setFilePath("T^K^OA");
      User user0 = new User("", "variable.cleaningStatus.label");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.clone();
      rawVariable0.getDisplayItemIdentifier();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setName((String) null);
      // Undeclared exception!
      try { 
        DerivedVariable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.columnStart = "";
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<String> arrayList0 = Variable.validateFields(rawVariable0);
      assertEquals(1, arrayList0.size());
      
      derivedVariable0.setIsNewRecord(false);
      derivedVariable0.setCodeBookNumber("");
      VariableSummary variableSummary0 = derivedVariable0.createVariableSummary();
      assertEquals(0, variableSummary0.getIdentifier());
      
      rawVariable0.getName();
      derivedVariable0.getCodeBookNumber();
      assertFalse(derivedVariable0.isNewRecord());
      
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.removeSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      boolean boolean0 = rawVariable0.containsOntologyTerm(ontologyTerm0);
      assertFalse(rawVariable0.isCoded());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.questionNumber = "6RnOuC.Qo";
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      derivedVariable0.addOntologyTerms(arrayList0);
      derivedVariable0.getCleaningStatus();
      User user0 = new User();
      MacawChangeEvent macawChangeEvent0 = Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable0);
      assertNotNull(macawChangeEvent0);
      assertEquals("Changed variable \"Alternative Variable\", field \"blank\", from \"\" to \"{3}\".", macawChangeEvent0.getChangeMessage());
      assertEquals(0, (int)macawChangeEvent0.getVariableOwnerID());
      
      String string0 = derivedVariable0.getFilePath();
      assertEquals("", string0);
      assertEquals("", derivedVariable0.getDisplayName());
      
      derivedVariable0.setName((String) null);
      derivedVariable0.setCleaningDescription("");
      ArrayList<SupportingDocument> arrayList1 = derivedVariable0.getSupportingDocuments();
      arrayList1.spliterator();
      derivedVariable0.setSupportingDocuments(arrayList1);
      String string1 = derivedVariable0.getCleaningStatus();
      assertNotNull(string1);
      assertEquals("Unknown", string1);
      
      derivedVariable0.addValueLabel((ValueLabel) null);
      derivedVariable0.getSourceVariables();
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isNewRecord());
      assertEquals("", derivedVariable0.getCleaningDescription());
      assertFalse(derivedVariable0.isCoded());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel valueLabel1 = new ValueLabel();
      valueLabel1.getDisplayName();
      valueLabel0.setIdentifier(0);
      valueLabel1.setIdentifier(0);
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.NEW;
      valueLabel1.setEditingOperationType(valueLabel_EditingOperationType0);
      Variable.validateFields(derivedVariable0);
      ValueLabel.validateFields(valueLabel1);
      valueLabel0.setValue("-");
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.removeValueLabel(valueLabel0);
      derivedVariable0.getCleaningDescription();
      derivedVariable0.removeValueLabel(valueLabel0);
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.getOntologyTerms();
      derivedVariable0.getQuestionNumber();
      ArrayList<Variable> arrayList1 = new ArrayList<Variable>();
      derivedVariable0.setSourceVariables(arrayList1);
      User user0 = null;
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges((User) null, derivedVariable0, derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.Variable", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.3284718813307355
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setQuestionNumber("\"f.ZJ?R0gZV.b");
      rawVariable0.setCleaned(true);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.setCleaningStatus("\"f.ZJ?R0gZV.b");
      ontologyTerm0.setIdentifier((-487));
      ontologyTerm0.setOntologyName("\"f.ZJ?R0gZV.b");
      ontologyTerm0.setNameSpace("\"f.ZJ?R0gZV.b");
      rawVariable0.containsOntologyTerm(ontologyTerm0);
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable0.setNotes("\"f.ZJ?R0gZV.b");
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable0.removeOntologyTerm(ontologyTerm0);
      rawVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.setCategory("6ZZI0Njr /sJsj");
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.cloneAttributes(rawVariable1);
      rawVariable1.getAlias();
      rawVariable0.getCategory();
      assertTrue(rawVariable0.isCleaned());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.isNewRecord();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>(0);
      derivedVariable0.removeOntologyTerms(arrayList0);
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
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<ValueLabel> arrayList0 = rawVariable0.getValueLabels();
      rawVariable0.createVariableSummary();
      rawVariable0.setColumnStart("");
      rawVariable0.setCoded(false);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.setValueLabels(arrayList0);
      supportingDocument0.setFilePath("");
      derivedVariable0.containsSupportingDocument(supportingDocument0);
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
  //Test case number: 13
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = "K6c;ZkM#!C";
      supportingDocument0.setDocumentCode("K6c;ZkM#!C");
      rawVariable0.setCleaned(false);
      Variable.validateFields(rawVariable0);
      rawVariable0.containsSupportingDocument(supportingDocument0);
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      arrayList0.add(ontologyTerm0);
      // Undeclared exception!
      try { 
        rawVariable0.removeOntologyTerms(arrayList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.3284718813307355
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      ArrayList<OntologyTerm> arrayList1 = derivedVariable0.getOntologyTerms();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.removeSupportingDocuments(arrayList0);
      derivedVariable0.cloneAttributes(derivedVariable1);
      derivedVariable0.removeOntologyTerms(arrayList1);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      Variable variable0 = null;
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
  //Test case number: 15
  /*Coverage entropy=3.5157396511717027
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<ValueLabel> arrayList0 = rawVariable0.getValueLabels();
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList0.add(valueLabel0);
      arrayList0.parallelStream();
      rawVariable0.setValueLabels(arrayList0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.containsSupportingDocument(supportingDocument0);
      ontologyTerm0.setNewRecord(false);
      ontologyTerm0.setNewRecord(true);
      rawVariable0.clone();
      rawVariable0.setYear("");
      ontologyTerm0.getDisplayName();
      ontologyTerm0.setOntologyName("variable.columnStart.label");
      rawVariable0.updateOntologyTerm(ontologyTerm0);
      rawVariable0.createVariableSummary();
      rawVariable0.getSupportingDocuments();
      rawVariable0.setNotes("");
      rawVariable0.getCleaningDescription();
      rawVariable0.getValueLabels();
      rawVariable0.getCleaningDescription();
      rawVariable0.getAvailability();
      // Undeclared exception!
      try { 
        rawVariable0.addOntologyTerms((ArrayList<OntologyTerm>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      derivedVariable0.getAlias();
      derivedVariable0.setIdentifier((-1));
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.addSourceVariable(derivedVariable1);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable1.setQuestionNumber("");
      rawVariable0.setCoded(false);
      rawVariable0.getDisplayItemIdentifier();
      RawVariable rawVariable1 = new RawVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable1.addOntologyTerm(ontologyTerm0);
      derivedVariable1.setAvailability("0");
      rawVariable0.setCategory("");
      RawVariable rawVariable2 = new RawVariable();
      rawVariable2.cloneAttributes(derivedVariable1);
      assertEquals("Unknown", derivedVariable1.getAvailability());
      
      rawVariable2.getAlias();
      rawVariable1.getCategory();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable2.getSupportingDocuments();
      rawVariable2.addSupportingDocuments(arrayList0);
      assertEquals("Unknown", rawVariable2.getCategory());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      Comparator<SupportingDocument> comparator0 = (Comparator<SupportingDocument>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      arrayList0.sort(comparator0);
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
  //Test case number: 18
  /*Coverage entropy=3.0898065347392136
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      rawVariable0.form = "-";
      supportingDocument0.setFileName((String) null);
      rawVariable0.containsSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      rawVariable0.setCleaned(false);
      rawVariable0.setColumnStart("4j_w)R#k1Y_[iglx");
      derivedVariable0.removeSourceVariable(rawVariable0);
      derivedVariable0.setAlternativeVariable(rawVariable0);
      rawVariable0.setCoded(false);
      ArrayList<Variable> arrayList0 = new ArrayList<Variable>();
      derivedVariable0.removeSourceVariables(arrayList0);
      rawVariable0.clone();
      assertEquals("4j_w)R#k1Y_[iglx", rawVariable0.getColumnStart());
      
      DerivedVariable derivedVariable1 = (DerivedVariable)derivedVariable0.clone();
      assertEquals("Unknown", derivedVariable1.getCategory());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.563454920788933
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User(" tye", "(VtrqQkpGDN@rB-cH}u");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<ValueLabel> arrayList0 = derivedVariable0.getValueLabels();
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList0.add(valueLabel0);
      RawVariable rawVariable0 = new RawVariable();
      ArrayList<ValueLabel> arrayList1 = derivedVariable0.getValueLabels();
      rawVariable0.setValueLabels(arrayList1);
      RawVariable rawVariable1 = new RawVariable();
      rawVariable1.setYear("");
      RawVariable rawVariable2 = new RawVariable();
      rawVariable2.setQuestionNumber(" tye");
      rawVariable0.setCategory("");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable2.removeSupportingDocument(supportingDocument0);
      ArrayList<SupportingDocument> arrayList2 = new ArrayList<SupportingDocument>();
      RawVariable rawVariable3 = new RawVariable();
      rawVariable3.removeSupportingDocuments(arrayList2);
      derivedVariable0.getSourceVariables();
      User user1 = new User();
      Variable.detectFieldChanges(user1, rawVariable3, rawVariable2);
      assertEquals(" tye", rawVariable2.getQuestionNumber());
      assertEquals("Unknown", rawVariable3.getCategory());
  }
}