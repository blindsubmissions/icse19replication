/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:32:26 GMT 2018
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.function.Predicate;
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
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("general.fieldValue.blank");
      derivedVariable0.removeSupportingDocument(supportingDocument0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      derivedVariable1.containsSupportingDocument(supportingDocument1);
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
  //Test case number: 1
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      arrayList0.trimToSize();
      arrayList0.listIterator();
      derivedVariable0.addSupportingDocuments(arrayList0);
      derivedVariable0.columnStart = "";
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.clone();
      derivedVariable0.addSupportingDocument(supportingDocument0);
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.columnEnd = "SxBP~[p_4{I";
      derivedVariable0.containsSourceVariable(rawVariable0);
      rawVariable0.setCodeBookNumber("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      derivedVariable0.containsSupportingDocument(supportingDocument1);
      rawVariable0.getFilePath();
      rawVariable0.setCleaned(true);
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
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.notes = "user.status.saveChanges";
      rawVariable0.form = "";
      ValueLabel valueLabel0 = new ValueLabel();
      rawVariable0.removeValueLabel(valueLabel0);
      rawVariable0.columnStart = "";
      User user0 = new User("CANCEL", "user.status.saveChanges");
      ValueLabel.differencesExist(user0, rawVariable0, valueLabel0, valueLabel0);
      rawVariable0.setCleaningStatus((String) null);
      rawVariable0.addValueLabel(valueLabel0);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      rawVariable0.setSupportingDocuments(arrayList0);
      rawVariable0.getValueLabels();
      assertFalse(rawVariable0.isCleaned());
      assertEquals("", rawVariable0.getName());
      assertEquals("0", rawVariable0.getDisplayItemIdentifier());
      assertFalse(rawVariable0.isNewRecord());
      assertFalse(rawVariable0.isCoded());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setIsNewRecord(false);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
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
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = derivedVariable0.getOntologyTerms();
      derivedVariable0.setOntologyTerms(arrayList0);
      derivedVariable0.setLabel("rSr}Z/C{:)_`sthL^:");
      User user0 = new User();
      user0.setLastName("rSr}Z/C{:)_`sthL^:");
      try { 
        User.checkValidEmail("rSr}Z/C{:)_`sthL^:");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"rSr}Z/C{:)_`sthL^:\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setCleaningDescription("variable.questionNumber.label");
      User user0 = new User();
      RawVariable rawVariable1 = new RawVariable();
      Variable.detectFieldChanges(user0, rawVariable1, rawVariable1);
      rawVariable0.setIsNewRecord(false);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable1.updateOntologyTerm(ontologyTerm0);
      rawVariable0.addValueLabel((ValueLabel) null);
      assertEquals("variable.questionNumber.label", rawVariable0.getCleaningDescription());
      
      rawVariable1.setCoded(false);
      assertFalse(rawVariable1.isNewRecord());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.367295829986472
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ontologyTerm0.getDisplayName();
      derivedVariable0.cloneAttributes(derivedVariable1);
      derivedVariable1.removeOntologyTerm(ontologyTerm0);
      derivedVariable1.setAlias("bz4lGG+R-R7H&%}%~$");
      derivedVariable0.setIsNewRecord(false);
      derivedVariable1.containsSourceVariable(derivedVariable0);
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = "@34*i@";
      // Undeclared exception!
      try { 
        arrayList0.set((-631), supportingDocument1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -631
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.setCleaningStatus((String) null);
      ArrayList<ValueLabel> arrayList0 = new ArrayList<ValueLabel>();
      arrayList0.spliterator();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.setMissingValue(true);
      valueLabel0.setMissingValue(false);
      arrayList0.add(valueLabel0);
      derivedVariable0.setValueLabels(arrayList0);
      derivedVariable0.getCleaningStatus();
      derivedVariable0.setAlias("-b15b2bG5zxr<th7A");
      derivedVariable0.setAvailability((String) null);
      derivedVariable0.setCleaningDescription("-b15b2bG5zxr<th7A");
      // Undeclared exception!
      try { 
        Variable.validateFields(derivedVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel valueLabel1 = new ValueLabel();
      ValueLabel.validateFields(valueLabel1);
      valueLabel0.setMissingValue(false);
      derivedVariable1.removeValueLabel(valueLabel0);
      derivedVariable1.setOntologyTerms((ArrayList<OntologyTerm>) null);
      derivedVariable0.setAlternativeVariable(derivedVariable1);
      derivedVariable0.getDisplayName();
      derivedVariable1.setAvailability(" type=");
      derivedVariable0.getCleaningDescription();
      User user0 = new User("", "");
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable1);
      derivedVariable0.setCoded(false);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      // Undeclared exception!
      try { 
        derivedVariable1.removeOntologyTerm(ontologyTerm0);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("fDWZ)w-");
      derivedVariable0.removeSupportingDocument(supportingDocument0);
      derivedVariable0.setCategory("9dm`;VEvI_i 2~'");
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      arrayList0.add(ontologyTerm0);
      derivedVariable0.removeOntologyTerms(arrayList0);
      derivedVariable0.setForm("");
      derivedVariable0.setOntologyTerms(arrayList0);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      derivedVariable0.addSupportingDocuments(arrayList1);
      assertEquals("9dm`;VEvI_i 2~'", derivedVariable0.getCategory());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.6970118691207783
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.getFilePath();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("");
      supportingDocument0.getDisplayName();
      arrayList0.add(supportingDocument0);
      supportingDocument0.setIdentifier(2937);
      User user0 = new User("", "-");
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setIdentifier((-1109));
      arrayList0.add(supportingDocument1);
      derivedVariable0.addSupportingDocuments(arrayList0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable0.setAlternativeVariable(derivedVariable1);
      derivedVariable0.clone();
      derivedVariable1.getFilePath();
      derivedVariable1.setCodeBookNumber("B3e=!9");
      assertEquals("B3e=!9", derivedVariable1.getCodeBookNumber());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      derivedVariable0.codeBookNumber = null;
      derivedVariable0.setColumnEnd("user.city.saveChanges");
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      String string0 = "mGD;";
      supportingDocument0.setDescription("mGD;");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      arrayList0.add(supportingDocument1);
      arrayList0.add(supportingDocument0);
      derivedVariable0.setSupportingDocuments(arrayList0);
      derivedVariable0.setCoded(true);
      derivedVariable0.getIdentifier();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      derivedVariable0.removeSourceVariables(arrayList1);
      derivedVariable0.clone();
      derivedVariable0.setCategory("user.city.saveChanges");
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.getSourceVariables();
      derivedVariable0.getYear();
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
  //Test case number: 12
  /*Coverage entropy=2.5261491036395327
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User("SUPPORTING_DOCUMENT", "|p.9B H>)&oZS }rm3");
      derivedVariable0.columnEnd = "SUPPORTING_DOCUMENT";
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setLabel("variable.cleaningDescription.label");
      derivedVariable0.getNotes();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      valueLabel0.setMissingValue(true);
      derivedVariable0.addValueLabel(valueLabel0);
      assertEquals("SUPPORTING_DOCUMENT", derivedVariable0.getColumnEnd());
      
      RawVariable rawVariable0 = new RawVariable();
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.setIdentifier(1533);
      rawVariable0.setName(" 3<c)");
      Variable.validateFields(rawVariable0);
      assertEquals(" 3<c)", rawVariable0.getDisplayName());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.validateFields(derivedVariable0);
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setFilePath("0");
      derivedVariable0.setColumnStart("0");
      derivedVariable0.setCoded(true);
      derivedVariable0.getYear();
      derivedVariable0.getIdentifier();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      arrayList0.listIterator();
      derivedVariable0.removeSupportingDocuments(arrayList0);
      assertEquals("0", derivedVariable0.getColumnStart());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<OntologyTerm> arrayList0 = new ArrayList<OntologyTerm>();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.setTerm("gf$C*tFV");
      arrayList0.add(ontologyTerm0);
      derivedVariable0.addOntologyTerms(arrayList0);
      derivedVariable0.addSupportingDocument((SupportingDocument) null);
      derivedVariable0.isNewRecord();
      derivedVariable0.getIdentifier();
      ArrayList<Variable> arrayList1 = derivedVariable0.getSourceVariables();
      ArrayList<ValueLabel> arrayList2 = new ArrayList<ValueLabel>();
      ValueLabel valueLabel0 = new ValueLabel();
      arrayList2.add(valueLabel0);
      ValueLabel valueLabel1 = new ValueLabel();
      valueLabel1.clone();
      arrayList2.add(valueLabel1);
      arrayList1.add((Variable) derivedVariable0);
      derivedVariable0.setValueLabels(arrayList2);
      derivedVariable0.getColumnEnd();
      derivedVariable0.getSourceVariables();
      derivedVariable0.setNotes("gf$C*tFV");
      arrayList1.stream();
      derivedVariable0.getDisplayName();
      derivedVariable0.setSourceVariables(arrayList1);
      derivedVariable0.getLabel();
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
  //Test case number: 15
  /*Coverage entropy=3.319492576154752
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User("variable.cleaningDescription.label", "|p.9B H>)&oZS }rm3");
      derivedVariable0.columnEnd = "variable.cleaningDescription.label";
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setLabel("variable.cleaningDescription.label");
      derivedVariable0.getNotes();
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      valueLabel0.setMissingValue(true);
      derivedVariable0.addValueLabel(valueLabel0);
      RawVariable rawVariable0 = new RawVariable();
      Variable.detectFieldChanges(user0, rawVariable0, rawVariable0);
      rawVariable0.setIdentifier(1533);
      rawVariable0.setCleaned(true);
      rawVariable0.setName(" 3<c)");
      Variable.validateFields(rawVariable0);
      ArrayList<MacawChangeEvent> arrayList0 = Variable.detectFieldChanges(user0, rawVariable0, derivedVariable0);
      assertEquals("variable.cleaningDescription.label", derivedVariable0.getColumnEnd());
      assertEquals(4, arrayList0.size());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.992400521059247
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User();
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setCodeBookNumber("(<UL!");
      RawVariable rawVariable1 = new RawVariable();
      Variable.detectFieldChanges(user0, derivedVariable0, rawVariable1);
      rawVariable1.setIsNewRecord(true);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      rawVariable1.updateOntologyTerm(ontologyTerm0);
      rawVariable1.addValueLabel((ValueLabel) null);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = derivedVariable0.containsSupportingDocument(supportingDocument0);
      assertEquals("(<UL!", derivedVariable0.getCodeBookNumber());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.16939431354298
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      ArrayList<SupportingDocument> arrayList0 = derivedVariable0.getSupportingDocuments();
      arrayList0.trimToSize();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable0.addValueLabel(valueLabel0);
      RawVariable rawVariable0 = new RawVariable();
      derivedVariable0.setForm("3F4uPwcZ54]<qJx>![");
      derivedVariable0.cloneAttributes(rawVariable0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      arrayList1.add(supportingDocument0);
      derivedVariable0.addSupportingDocuments(arrayList0);
      derivedVariable0.setQuestionNumber("");
      ArrayList<SupportingDocument> arrayList2 = new ArrayList<SupportingDocument>();
      derivedVariable0.removeSupportingDocuments(arrayList0);
      assertEquals("3F4uPwcZ54]<qJx>![", derivedVariable0.getForm());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.332204510175204
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ValueLabel valueLabel0 = new ValueLabel();
      derivedVariable1.addValueLabel(valueLabel0);
      derivedVariable0.cloneAttributes(derivedVariable1);
      ontologyTerm0.clone();
      derivedVariable0.containsOntologyTerm(ontologyTerm0);
      ArrayList<SupportingDocument> arrayList0 = new ArrayList<SupportingDocument>();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      arrayList0.add(supportingDocument0);
      derivedVariable0.addSupportingDocuments(arrayList0);
      derivedVariable0.setQuestionNumber("~Q,Tl'1#[Jn[");
      ArrayList<SupportingDocument> arrayList1 = new ArrayList<SupportingDocument>();
      derivedVariable0.removeSupportingDocuments(arrayList1);
      assertEquals("~Q,Tl'1#[Jn[", derivedVariable0.getQuestionNumber());
      
      derivedVariable1.createVariableSummary();
      assertEquals("Unknown", derivedVariable1.getCleaningStatus());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.80172383289564
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      Variable.validateFields(derivedVariable0);
      derivedVariable0.getDisplayItemIdentifier();
      derivedVariable0.setFilePath("0");
      derivedVariable0.setColumnStart("0");
      RawVariable rawVariable0 = new RawVariable();
      DerivedVariable derivedVariable1 = new DerivedVariable();
      User user0 = new User("0", "0");
      Variable.detectFieldChanges(user0, derivedVariable1, derivedVariable0);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      derivedVariable0.containsSupportingDocument(supportingDocument0);
      assertEquals("0", derivedVariable0.getFilePath());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.4436605846904964
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      ontologyTerm0.clone();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      ontologyTerm0.getDisplayName();
      derivedVariable0.cloneAttributes(derivedVariable1);
      derivedVariable1.removeOntologyTerm(ontologyTerm0);
      derivedVariable1.setAlias("bz4lGG+R-R7H&%}%~$");
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.setMissingValue(false);
      derivedVariable1.addValueLabel((ValueLabel) null);
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User();
      Variable.detectFieldChanges(user0, derivedVariable1, rawVariable0);
      rawVariable0.setIdentifier(1533);
      rawVariable0.setCleaned(false);
      rawVariable0.setName((String) null);
      // Undeclared exception!
      try { 
        Variable.validateFields(rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.8989749846564132
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      User user0 = new User("SUPPORTING_DOCUMENT", "|p.9B H>)&oZS }rm3");
      derivedVariable0.columnEnd = "SUPPORTING_DOCUMENT";
      Variable.detectChangesInAlternativeVariable(user0, derivedVariable0, derivedVariable0);
      derivedVariable0.setLabel("variable.cleaningDescription.label");
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      derivedVariable0.addValueLabel(valueLabel0);
      RawVariable rawVariable0 = new RawVariable();
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      rawVariable0.setIdentifier((-1));
      rawVariable0.setCleaned(false);
      rawVariable0.setName("variable.cleaningDescription.label");
      Variable.validateFields(rawVariable0);
      Variable.detectFieldChanges(user0, derivedVariable0, derivedVariable0);
      assertEquals("SUPPORTING_DOCUMENT", derivedVariable0.getColumnEnd());
      assertEquals("variable.cleaningDescription.label", derivedVariable0.getLabel());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.236476568754351
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DerivedVariable derivedVariable0 = new DerivedVariable();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIsNewRecord(false);
      derivedVariable0.addSupportingDocument(supportingDocument0);
      OntologyTerm ontologyTerm0 = new OntologyTerm();
      OntologyTerm ontologyTerm1 = (OntologyTerm)ontologyTerm0.clone();
      derivedVariable0.addOntologyTerm(ontologyTerm0);
      ValueLabel valueLabel0 = new ValueLabel();
      valueLabel0.getDisplayName();
      ValueLabel valueLabel1 = new ValueLabel();
      valueLabel0.getDisplayName();
      valueLabel1.hasSameDisplayName(valueLabel0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) "-");
      ArrayList<Variable> arrayList0 = derivedVariable0.getSourceVariables();
      arrayList0.removeIf(predicate0);
      derivedVariable0.updateOntologyTerm(ontologyTerm1);
      DerivedVariable derivedVariable1 = new DerivedVariable();
      derivedVariable1.removeSourceVariables(arrayList0);
      derivedVariable0.updateOntologyTerm(ontologyTerm1);
      derivedVariable1.getSourceVariables();
      DerivedVariable derivedVariable2 = new DerivedVariable();
      derivedVariable1.removeSourceVariable(derivedVariable2);
      User user0 = new User("-", (String) null);
      ArrayList<MacawChangeEvent> arrayList1 = DerivedVariable.detectFieldChanges(user0, derivedVariable2, derivedVariable2);
      assertEquals(0, arrayList1.size());
      
      ArrayList<Variable> arrayList2 = derivedVariable0.getSourceVariables();
      derivedVariable0.addSourceVariables(arrayList2);
      DerivedVariable derivedVariable3 = new DerivedVariable();
      derivedVariable3.getSourceVariables();
      DerivedVariable derivedVariable4 = (DerivedVariable)derivedVariable2.clone();
      assertFalse(derivedVariable4.isNewRecord());
      assertEquals("Unknown", derivedVariable4.getAvailability());
      assertFalse(derivedVariable4.isCoded());
      assertEquals("Unknown", derivedVariable4.getCategory());
      assertEquals("Unknown", derivedVariable4.getCleaningStatus());
      assertEquals("0", derivedVariable4.getDisplayItemIdentifier());
  }
}
