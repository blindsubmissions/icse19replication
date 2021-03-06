/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:52:02 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.function.Consumer;
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
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setColumnEnd("k,7%9`y+PPOh.}8");
      rawVariable0.setLabel("k,7%9`y+PPOh.}8");
      rawVariable0.setIsNewRecord(false);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      User user0 = new User("k,7%9`y+PPOh.}8", "k,7%9`y+PPOh.}8");
      OntologyTerm.detectFieldChanges(user0, ontologyTerm0, ontologyTerm0);
      arrayList0.add(ontologyTerm0);
      rawVariable0.addOntologyTerms(arrayList0);
      rawVariable0.setOntologyTerms(arrayList0);
      rawVariable0.getDisplayName();
      rawVariable0.clone();
      rawVariable0.setNotes("");
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getSourceVariables();
      RawVariable rawVariable1 = new RawVariable();
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      derivedVariable0.removeSupportingDocuments(arrayList1);
      rawVariable0.setAlternativeVariable(rawVariable1);
      derivedVariable0.removeSourceVariable(rawVariable0);
      ArrayList<OntologyTerm> arrayList2 = new ArrayList<OntologyTerm>();
      derivedVariable0.setOntologyTerms(arrayList2);
      derivedVariable0.setColumnEnd("LHA");
      assertEquals("LHA", derivedVariable0.getColumnEnd());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setCategory((String) null);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.containsSourceVariable(rawVariable0);
      VariableSummary variableSummary0 = rawVariable0.createVariableSummary();
      assertEquals(0, variableSummary0.getIdentifier());
      
      rawVariable0.setIdentifier(0);
      assertEquals(0, rawVariable0.getIdentifier());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isCoded());
      assertFalse(rawVariable0.isNewRecord());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setIdentifier(0);
      rawVariable0.setAlternativeVariable(derivedVariable0);
      rawVariable0.getForm();
      derivedVariable0.setColumnEnd("");
      assertEquals("0", derivedVariable0.getDisplayItemIdentifier());
      
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNewRecord(true);
      rawVariable0.removeOntologyTerm(ontologyTerm0);
      rawVariable0.setFilePath("");
      assertFalse(rawVariable0.isCoded());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isNewRecord());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setYear("]S0yhIE");
      derivedVariable0.createVariableSummary();
      derivedVariable0.setName("variable.notes.label");
      derivedVariable0.setLabel("variable.notes.label");
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      rawVariable0.setCleaned(true);
      ArrayList<OntologyTerm> arrayList0 = rawVariable0.getOntologyTerms();
      arrayList0.iterator();
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.getLabel();
      assertEquals("variable.notes.label", derivedVariable0.getDisplayName());
      
      String string0 = rawVariable0.getAvailability();
      assertEquals("Unknown", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      ontologyTerm0.setOntologyName("$Z#=?fcg;eo:FC}O");
      derivedVariable0.questionNumber = "";
      int int0 = (-804);
      ontologyTerm0.setIdentifier((-804));
      ontologyTerm0.clone();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.columnEnd = "P)k(<7S7Ab:1Ay>_";
      boolean boolean0 = false;
      derivedVariable0.setCoded(false);
      derivedVariable0.getSupportingDocuments();
      RawVariable rawVariable0 = null;
      // Undeclared exception!
      try { 
        RawVariable.validateFields((RawVariable) null);
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
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setFilePath("W3L$8-OD0JbzV'");
      rawVariable0.setAlias("W3L$8-OD0JbzV'");
      Variable.validateFields(rawVariable0);
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.clone();
      valueLabel0.setValue("W3L$8-OD0JbzV'");
      rawVariable0.notes = "W3L$8-OD0JbzV'";
      rawVariable0.removeValueLabel(valueLabel0);
      rawVariable0.setColumnEnd("W3L$8-OD0JbzV'");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("W3L$8-OD0JbzV'");
      supportingDocument0.clone();
      supportingDocument0.setIsNewRecord(false);
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.isCoded();
      User user0 = new User();
      user0.setCounty("SL<wL");
      RawVariable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.setIsNewRecord(false);
      rawVariable0.getDisplayName();
      rawVariable0.getForm();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.addOntologyTerm(ontologyTerm0);
      rawVariable0.getCategory();
      rawVariable0.setColumnStart("Unknown");
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      rawVariable0.setOntologyTerms(arrayList0);
      assertEquals("W3L$8-OD0JbzV'", rawVariable0.getFilePath());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.columnStart = "";
      DerivedVariable derivedVariable1 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable1.setAlternativeVariable(rawVariable0);
      derivedVariable0.removeSourceVariable(derivedVariable1);
      boolean boolean0 = derivedVariable1.isNewRecord();
      assertFalse(boolean0);
      
      derivedVariable0.setAlias("");
      ArrayList<OntologyTerm> arrayList0 = derivedVariable1.getOntologyTerms();
      derivedVariable0.removeOntologyTerms(arrayList0);
      assertFalse(derivedVariable1.isCleaned());
      assertFalse(derivedVariable1.isCoded());
      assertEquals(0, derivedVariable1.getIdentifier());
      assertFalse(derivedVariable0.isCleaned());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      VariableSummary variableSummary0 = derivedVariable0.createVariableSummary();
      assertEquals(0, variableSummary0.getIdentifier());
      
      derivedVariable0.getFilePath();
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList0);
      assertFalse(derivedVariable0.isCleaned());
      assertFalse(derivedVariable0.isCoded());
      assertFalse(derivedVariable0.isNewRecord());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.8286413964890924
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      RawVariable rawVariable1 = new RawVariable();
      rawVariable0.setAlternativeVariable(rawVariable1);
      valueLabel0.setIdentifier(246);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      valueLabel0.setValue("");
      supportingDocument0.getDisplayName();
      valueLabel0.setMissingValue(false);
      rawVariable0.removeSupportingDocument(supportingDocument0);
      rawVariable0.addValueLabel(valueLabel0);
      rawVariable0.getLabel();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setDocumentCode("X\"ct&%z4bkR0gS&Zc?");
      supportingDocument0.setTitle("G#=&8Q8%)hDx:0");
      rawVariable0.clone();
      rawVariable0.removeSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.columnStart = "";
      rawVariable0.setAlternativeVariable(derivedVariable0);
      String string0 = rawVariable0.getAvailability();
      assertNotNull(string0);
      
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      arrayList0.removeAll(arrayList1);
      rawVariable1.removeSupportingDocuments(arrayList0);
      User user0 = new User("j)aTzw[pP1@4DB", "");
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable1);
      assertEquals("Unknown", rawVariable1.getCleaningStatus());
      
      rawVariable1.setCleaningStatus("");
      rawVariable0.setForm("j)aTzw[pP1@4DB");
      derivedVariable0.removeSourceVariable(rawVariable1);
      boolean boolean0 = rawVariable0.isNewRecord();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.createVariableSummary();
      derivedVariable0.setYear("");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("");
      ontologyTerm0.setNameSpace("");
      derivedVariable0.removeOntologyTerm(ontologyTerm0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.getDisplayName();
      ontologyTerm1.setTerm("");
      derivedVariable0.notes = "";
      derivedVariable0.removeOntologyTerm(ontologyTerm1);
      derivedVariable0.setColumnEnd("xiKU|#e'K$F+W0");
      derivedVariable0.setAlias("_T5e^XS{");
      derivedVariable0.isCoded();
      derivedVariable0.getCleaningDescription();
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.getCleaningStatus();
      derivedVariable0.getCleaningStatus();
      assertEquals("_T5e^XS{", derivedVariable0.getAlias());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.429486231665012
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setAvailability("0");
      derivedVariable0.clone();
      derivedVariable0.setQuestionNumber("iXGk'Ms'>[ZR");
      derivedVariable0.getNotes();
      derivedVariable0.setLabel("");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.setIdentifier(183);
      derivedVariable0.setCodeBookNumber("");
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      arrayList0.forEach(consumer0);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      arrayList0.add(supportingDocument0);
      derivedVariable0.removeSupportingDocuments(arrayList0);
      derivedVariable0.form = "S966QVjIuZ`=";
      derivedVariable0.getCodeBookNumber();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable0.removeValueLabel(valueLabel0);
      derivedVariable0.setSourceVariables(arrayList1);
      ArrayList<OntologyTerm> arrayList2 = derivedVariable0.getOntologyTerms();
      // Undeclared exception!
      try { 
        derivedVariable0.removeOntologyTerms(arrayList2);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCategory("user.county.saveChanges");
      rawVariable0.setColumnStart("user.county.saveChanges");
      rawVariable0.getQuestionNumber();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      rawVariable0.setOntologyTerms(arrayList0);
      rawVariable0.isCleaned();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User("", "!=");
      DerivedVariable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.columnEnd = "user.lastName.saveChanges";
      derivedVariable0.hasSameDisplayName(rawVariable0);
      derivedVariable0.setColumnEnd("");
      ArrayList<SupportingDocument> arrayList1 = rawVariable0.getSupportingDocuments();
      rawVariable0.addSupportingDocuments(arrayList1);
      assertEquals("user.county.saveChanges", rawVariable0.getColumnStart());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setAlternativeVariable(rawVariable0);
      derivedVariable0.setCategory("lFm(. o-k");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setOntologyName("lFm(. o-k");
      ontologyTerm0.setDescription("");
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      assertEquals("lFm(. o-k", derivedVariable0.getCategory());
      
      derivedVariable0.setCategory("");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(true);
      derivedVariable0.columnEnd = null;
      supportingDocument0.clone();
      rawVariable0.addSupportingDocument(supportingDocument0);
      rawVariable0.setYear("");
      derivedVariable0.getAvailability();
      derivedVariable0.getCategory();
      Variable.validateFields(derivedVariable0);
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      derivedVariable0.getDisplayName();
      derivedVariable0.setCleaningStatus("W'WQHsL|R5");
      assertEquals("Unknown", derivedVariable0.getAvailability());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getValueLabels();
      assertFalse(rawVariable0.isNewRecord());
      assertEquals(0, rawVariable0.getIdentifier());
      assertFalse(rawVariable0.isCleaned());
      assertFalse(rawVariable0.isCoded());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      valueLabel0.clone();
      ArrayList<ValueLabel> arrayList0 = new ArrayList<ValueLabel>(5);
      ValueLabel valueLabel1 = new ValueLabel();
      arrayList0.add(valueLabel1);
      arrayList0.add(valueLabel0);
      derivedVariable0.setValueLabels(arrayList0);
      valueLabel0.setLabel("RQ<");
      derivedVariable0.removeValueLabel(valueLabel0);
      derivedVariable0.getForm();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setNotes("RQ<");
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
  /*Coverage entropy=2.422493145939175
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getNotes();
      rawVariable0.setNotes("");
      rawVariable0.getCleaningDescription();
      rawVariable0.getAlias();
      rawVariable0.getCodeBookNumber();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = rawVariable0.containsSupportingDocument(supportingDocument0);
      assertFalse(boolean0);
      
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.hasSameDisplayName(rawVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace((String) null);
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      User user0 = new User("", "");
      user0.setEmail("");
      ArrayList<MacawChangeEvent> arrayList0 = Variable.detectFieldChanges(user0, derivedVariable0, rawVariable0);
      assertEquals(0, arrayList0.size());
      
      rawVariable0.getAlternativeVariable();
      rawVariable0.setFilePath((String) null);
      assertFalse(rawVariable0.isNewRecord());
      assertEquals("Unknown", rawVariable0.getAvailability());
      assertEquals("Unknown", rawVariable0.getCategory());
      assertEquals("Unknown", rawVariable0.getCleaningStatus());
      assertEquals(0, rawVariable0.getIdentifier());
      assertFalse(rawVariable0.isCleaned());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.4979375713266543
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("8a{(e;QdG764H%\";N ");
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      LinkedList<OntologyTerm> linkedList0 = new LinkedList<OntologyTerm>();
      arrayList0.addAll((Collection<? extends OntologyTerm>) linkedList0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.cloneAttributes(derivedVariable1);
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable1.setCleaningStatus((String) null);
      derivedVariable0.setCleaned(false);
      derivedVariable0.getLabel();
      derivedVariable0.setYear("ontologyTerm.description.saveChanges");
      derivedVariable1.getColumnStart();
      derivedVariable0.getColumnStart();
      derivedVariable0.getColumnEnd();
      User user0 = new User("", "");
      // Undeclared exception!
      try { 
        Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.526149103639533
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getDisplayItemIdentifier();
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getNotes();
      rawVariable0.setNotes("0");
      rawVariable0.getCleaningDescription();
      rawVariable0.getAlias();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      rawVariable0.containsSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.hasSameDisplayName(derivedVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setNameSpace("variable.notes.label");
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable2.updateOntologyTerm(ontologyTerm0);
      User user0 = new User((String) null, "mT+WA[V'#d{");
      User user1 = new User((String) null, "W3L$8-OD0JbzV'");
      user1.setEmail("");
      User user2 = new User();
      Variable.detectFieldChanges(user2, rawVariable0, derivedVariable1);
      rawVariable0.getAlternativeVariable();
      rawVariable0.setFilePath("#Y_#-p@8f0EFb)&`l");
      assertEquals("0", rawVariable0.getNotes());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.5555951317288237
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getNotes();
      rawVariable0.setNotes("");
      rawVariable0.getCleaningDescription();
      rawVariable0.getAlias();
      rawVariable0.getCodeBookNumber();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.cloneAttributes(rawVariable1);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setCleaningStatus("");
      derivedVariable0.setCleaned(true);
      derivedVariable0.getLabel();
      derivedVariable0.setYear("eXd4;:");
      derivedVariable0.getColumnStart();
      derivedVariable0.getColumnStart();
      derivedVariable0.getColumnEnd();
      derivedVariable0.getYear();
      derivedVariable0.getAlternativeVariable();
      rawVariable0.getCleaningStatus();
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
  //Test case number: 19
  /*Coverage entropy=3.2653221962395893
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setAvailability("0");
      DerivedVariable derivedVariable1 = (DerivedVariable)derivedVariable0.clone();
      derivedVariable0.setQuestionNumber("iXGk'Ms'>[ZR");
      derivedVariable0.getNotes();
      derivedVariable0.setLabel("");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.setIdentifier(183);
      derivedVariable0.setCodeBookNumber("");
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      arrayList0.forEach(consumer0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm1.setNameSpace("W3L$8-OD0JbzV'");
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      User user0 = new User("52vj", "~]}WmSdq,");
      user0.setEmail((String) null);
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getAlternativeVariable();
      rawVariable0.setFilePath("~]}WmSdq,");
      derivedVariable1.clone();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      assertEquals("0", derivedVariable0.getAvailability());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.3295439117160313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setForm("f@J:~q[B;s'`F#c");
      User user0 = new User("", "");
      user0.setEmail((String) null);
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      rawVariable0.setFilePath((String) null);
      assertEquals("f@J:~q[B;s'`F#c", rawVariable0.getForm());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.6653086325939297
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getNotes();
      rawVariable0.setNotes("");
      rawVariable0.getCleaningDescription();
      rawVariable0.getAlias();
      rawVariable0.getCodeBookNumber();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      DerivedVariable derivedVariable0 = new DerivedVariable();
      RawVariable rawVariable1 = new RawVariable();
      derivedVariable0.cloneAttributes(rawVariable1);
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setCleaningStatus("");
      derivedVariable0.setCleaned(true);
      derivedVariable0.getLabel();
      User user0 = new User("~]}WmSdq,", "");
      user0.setEmail("u%u");
      Variable.detectFieldChanges(user0, rawVariable1, derivedVariable0);
      RawVariable rawVariable2 = new RawVariable();
      RawVariable rawVariable3 = new RawVariable();
      rawVariable3.getAlternativeVariable();
      rawVariable0.setFilePath("");
      derivedVariable0.clone();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      arrayList1.add((Variable) rawVariable2);
      // Undeclared exception!
      try { 
        derivedVariable0.removeSourceVariables(arrayList1);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.3228628464847696
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setAvailability("0");
      DerivedVariable derivedVariable1 = (DerivedVariable)derivedVariable0.clone();
      derivedVariable0.setQuestionNumber("iXGk'Ms'>[ZR");
      derivedVariable0.getNotes();
      derivedVariable0.setLabel("");
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      derivedVariable0.setIdentifier(183);
      derivedVariable0.setCodeBookNumber("");
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      Consumer<SupportingDocument> consumer0 = (Consumer<SupportingDocument>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      arrayList0.forEach(consumer0);
      OntologyTerm ontologyTerm1 = new OntologyTerm();
      ontologyTerm0.setNameSpace("variable.label.label");
      derivedVariable0.updateOntologyTerm(ontologyTerm0);
      User user0 = new User("::Lz_UD#?", "-(G");
      user0.setEmail((String) null);
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable1);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.getAlternativeVariable();
      rawVariable0.setFilePath("");
      derivedVariable1.clone();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      assertEquals("iXGk'Ms'>[ZR", derivedVariable0.getQuestionNumber());
  }
}
