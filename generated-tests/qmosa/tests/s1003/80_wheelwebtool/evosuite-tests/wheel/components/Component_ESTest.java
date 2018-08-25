/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:40:16 GMT 2018
 */

package wheel.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.List;
import java.util.stream.IntStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import org.xmlpull.mxp1_serializer.MXSerializer;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import org.xmlpull.v1.wrapper.XmlPullWrapperFactory;
import org.xmlpull.v1.wrapper.XmlSerializerWrapper;
import wheel.ErrorPage;
import wheel.components.ActionExpression;
import wheel.components.Any;
import wheel.components.Block;
import wheel.components.Checkbox;
import wheel.components.CheckboxGroup;
import wheel.components.Component;
import wheel.components.DateInput;
import wheel.components.ElExpression;
import wheel.components.FileInput;
import wheel.components.Form;
import wheel.components.FormElement;
import wheel.components.Hidden;
import wheel.components.Image;
import wheel.components.Label;
import wheel.components.Link;
import wheel.components.NumberInput;
import wheel.components.RadioGroup;
import wheel.components.Select;
import wheel.components.Submit;
import wheel.components.Table;
import wheel.components.TableBlock;
import wheel.components.TableRow;
import wheel.components.TextArea;
import wheel.components.TextInput;
import wheel.components.XmlEntityRef;
import wheel.util.DynamicSelectModel;
import wheel.util.InitialFieldValue;
import wheel.util.StringSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Component_ESTest extends Component_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      errorPage0.address();
      String string0 = "yzQo";
      // Undeclared exception!
      try { 
        errorPage0.message("yzQo");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.components.StandaloneComponent", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "T%3\\lR;:7@3GJ";
      DateInput dateInput0 = new DateInput((Component) null, "T%3lR;:7@3GJ", "T%3lR;:7@3GJ", "T%3lR;:7@3GJ");
      Checkbox checkbox0 = new Checkbox(dateInput0, "ZF?", ",z=ke*p4m[");
      dateInput0._getRenderableChildren();
      String string1 = "";
      FormElement formElement0 = checkbox0.setFormElementName("");
      TableBlock tableBlock0 = null;
      try {
        tableBlock0 = new TableBlock(formElement0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "q8";
      Form form0 = new Form("q8");
      String string1 = "/";
      Checkbox checkbox0 = new Checkbox(form0, "q8", "/");
      // Undeclared exception!
      try { 
        form0.textInput("/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "\\'";
      String string1 = "Q)\"%5wGC>663JU&b";
      ActionExpression actionExpression0 = new ActionExpression("Q)\"%5wGC>663JU&b");
      ActionExpression actionExpression1 = actionExpression0.setOwner((Component) null);
      ActionExpression actionExpression2 = actionExpression1.submissible(true);
      Form form0 = null;
      try {
        form0 = new Form((Component) null, "'", actionExpression2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No top level component found.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Form form0 = new Form("3ks514_Bwtn>bS7ZD6");
      double double0 = (-2415.55467725302);
      Double double1 = new Double((-2415.55467725302));
      Double.sum((-2415.55467725302), 0.0);
      // Undeclared exception!
      try { 
        form0.h5((Object) double1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.4681399390162084
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "|_4i#sW/";
      Form form0 = new Form("|_4i#sW/");
      Table table0 = null;
      try {
        table0 = new Table(form0, "|_4i#sW/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No top level component found.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "/K#";
      Submit submit0 = new Submit((Component) null, "/K#", "/K#");
      submit0._getAction();
      DynamicSelectModel dynamicSelectModel0 = submit0.selectModel();
      Select select0 = null;
      try {
        select0 = new Select((Component) null, "/K#", "/K#", dynamicSelectModel0, "/K#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Form form0 = new Form("5XUZ=I;}`Kx>\"5-q5OK");
      String string0 = "";
      // Undeclared exception!
      try { 
        form0.placeholder("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = null;
      XmlEntityRef xmlEntityRef0 = new XmlEntityRef((String) null);
      Submit submit0 = null;
      try {
        submit0 = new Submit(xmlEntityRef0, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "";
      XmlEntityRef xmlEntityRef0 = new XmlEntityRef("");
      String string1 = "u3 @f6E6\\kx&u";
      // Undeclared exception!
      try { 
        xmlEntityRef0.hidden((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Form elements can be created only by compoents that are attached to a form component.
         //
         verifyException("wheel.components.ComponentCreator", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlEntityRef xmlEntityRef0 = new XmlEntityRef("kUh@[Cnf9L<;P");
      String string0 = "Checkbox";
      Submit submit0 = new Submit(xmlEntityRef0, "Checkbox", "kUh@[Cnf9L<;P");
      submit0.addInternalRenderHint("org.mvel.conversion.BooleanCH$2");
      // Undeclared exception!
      try { 
        submit0.sub();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Block block0 = new Block(errorPage0);
      String string0 = "";
      FileInput fileInput0 = new FileInput(block0, "", "");
      String string1 = "W_-?QmG|WDO";
      ActionExpression actionExpression0 = new ActionExpression("");
      // Undeclared exception!
      try { 
        fileInput0.abbr((Object) "W_-?QmG|WDO");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't add components to a component that is not an instance of IContainer.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "";
      ActionExpression actionExpression0 = new ActionExpression("");
      Any any0 = null;
      try {
        any0 = new Any((Component) null, actionExpression0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "wheel.components.RenderableComponentConfiguration";
      String string1 = "F[a@-NBB";
      Checkbox checkbox0 = new Checkbox((Component) null, "wheel.components.RenderableComponentConfiguration", "F[a@-NBB");
      // Undeclared exception!
      try { 
        checkbox0.b();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      String string0 = null;
      Submit submit1 = new Submit(table0, (String) null, (String) null);
      NumberInput numberInput0 = new NumberInput(table0, "", "");
      // Undeclared exception!
      try { 
        submit1.tt((Object) numberInput0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't add components to a component that is not an instance of IContainer.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Component component0 = errorPage0.address();
      Component component1 = component0.dt();
      component1.strong((Object) errorPage0);
      String string0 = "jYt";
      component0.small();
      errorPage0.create();
      Component component2 = component1.a();
      String[] stringArray0 = new String[7];
      stringArray0[2] = "jYt";
      stringArray0[3] = "jYt";
      // Undeclared exception!
      try { 
        component2.attributes(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attributes must be given in name, value pairs.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      String string0 = null;
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      Table table1 = table0.renderHint((CharSequence) null);
      Component component0 = table1.ins((Object) submit0);
      errorPage0.create();
      table0.a();
      errorPage0.attributes((String[]) null);
      component0.label();
      // Undeclared exception!
      try { 
        errorPage0.getSubmittedForm();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Tried to access a form, but none was submitted.
         //
         verifyException("wheel.components.StandaloneComponent", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      Table table1 = table0.renderHint((CharSequence) null);
      table1.ins((Object) submit0);
      Table table2 = table1.id((String) null);
      TableBlock tableBlock0 = table2.tbody();
      tableBlock0.acronym();
      Table table3 = new Table(submit0, "$|SvDQO P?Z k");
      table3.id("The list of suffixes must not be null");
      table2.renderHint("$|SvDQO P?Z k");
      TableBlock tableBlock1 = table3.thead();
      tableBlock1.getComponents();
      TableRow tableRow0 = tableBlock0.tr();
      Component component0 = tableRow0.th();
      assertFalse(table0._isGeneratedId());
      assertTrue(component0._isGeneratedId());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.4339872044851467
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Component component0 = errorPage0.address();
      Component component1 = component0.dt();
      component1.strong((Object) errorPage0);
      Table table0 = new Table(component1, "%lNkn;/B");
      Table table1 = table0.id("");
      TableBlock tableBlock0 = table1.tfoot();
      tableBlock0.acronym();
      TextArea textArea0 = new TextArea(table1, "dir", (String) null);
      ActionExpression actionExpression0 = new ActionExpression((String) null);
      tableBlock0.form("jYt", actionExpression0);
      textArea0.value("}qL)\"FZ!>z.dg");
      table0.placeholder("jYt");
      TextInput textInput0 = new TextInput((Component) null, "--r+%a%E4gv!x+", "Rh");
      FormElement formElement0 = textInput0.value("");
      Submit submit0 = new Submit(formElement0, "--r+%a%E4gv!x+", "M606ti~}s35d,?6g");
      submit0.value("M606ti~}s35d,?6g");
      Float float0 = new Float((-1177.1064F));
      Component component2 = component0.samp((Object) "Rh");
      assertTrue(component2._isGeneratedId());
      assertEquals("wheel_ErrorPage", errorPage0.getComponentId());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      Table table1 = table0.renderHint((CharSequence) null);
      Component component0 = table1.ins((Object) submit0);
      Table table2 = table1.id("");
      TableBlock tableBlock0 = table2.tbody();
      tableBlock0.acronym();
      TextArea textArea0 = new TextArea(tableBlock0, "", "-0VcUYBKR,w2V[7)^m");
      ActionExpression actionExpression0 = new ActionExpression("qs+x@r*2p^j<.y4");
      Object object0 = new Object();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) null;
      Object object1 = new Object();
      objectArray0[1] = object1;
      objectArray0[2] = (Object) table2;
      objectArray0[3] = (Object) "qs+x@r*2p^j<.y4";
      objectArray0[4] = (Object) "";
      objectArray0[5] = (Object) component0;
      objectArray0[6] = (Object) actionExpression0;
      Object object2 = new Object();
      objectArray0[7] = object2;
      actionExpression0.parameters(objectArray0);
      Image image0 = new Image(tableBlock0, "qs+x@r*2p^j<.y4", (CharSequence) null);
      // Undeclared exception!
      try { 
        image0.dateFormat("q", objectArray0[4]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Failed to initialize SimpleDateFormat with pattern 'q'.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = null;
      Form form0 = new Form((String) null);
      // Undeclared exception!
      try { 
        form0.kbd((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      table0.renderHint((CharSequence) null);
      ElExpression elExpression0 = new ElExpression((String) null);
      // Undeclared exception!
      try { 
        submit0.b((Object) elExpression0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't add components to a component that is not an instance of IContainer.
         //
         verifyException("wheel.components.Component", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.4657359027997248
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Component component0 = errorPage0.address();
      Component component1 = component0.dt();
      Component component2 = component1.strong((Object) errorPage0);
      Component component3 = component0.small();
      errorPage0.create();
      component1.a();
      Table table0 = new Table(component1, "jYt");
      Table table1 = table0.id("java.lang.String@0000000013");
      Table table2 = table1.renderHint("-0VcUYBKR,w2V[7)^m");
      TableBlock tableBlock0 = table2.tfoot();
      tableBlock0.acronym();
      TextArea textArea0 = new TextArea(component2, "jYt", "-0VcUYBKR,w2V[7)^m");
      ActionExpression actionExpression0 = new ActionExpression("java.lang.String@0000000013");
      TableBlock tableBlock1 = new TableBlock(component3);
      tableBlock1.form("-0VcUYBKR,w2V[7)^m", actionExpression0);
      actionExpression0.event("-0VcUYBKR,w2V[7)^m");
      Long long0 = new Long(2147483647L);
      TableBlock tableBlock2 = table1.colgroup();
      tableBlock2.sup((Object) null);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.401197381662154
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Submit submit0 = new Submit(errorPage0, (String) null, (String) null);
      Table table0 = new Table(submit0, (String) null);
      Table table1 = table0.renderHint((CharSequence) null);
      table1.ins((Object) submit0);
      Table table2 = table1.id("");
      TableBlock tableBlock0 = table2.tbody();
      tableBlock0.acronym();
      TextArea textArea0 = new TextArea(tableBlock0, "", "-0VcUYBKR,w2V[7)^m");
      ActionExpression actionExpression0 = new ActionExpression("qs+x@r*2p^j<.y4");
      tableBlock0.form("-0VcUYBKR,w2V[7)^m", actionExpression0);
      textArea0.value("The wildcard list must not be null");
      table0.placeholder((String) null);
      TableBlock tableBlock1 = table0.tfoot();
      TableRow tableRow0 = tableBlock1.tr();
      Block block0 = tableRow0.createTd();
      FileInput fileInput0 = new FileInput(block0, "java.lang.String@0000000010", "");
      int int0 = 3248;
      DynamicSelectModel dynamicSelectModel0 = tableBlock1.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("X!:fJ");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("g8LZlV];cXQ`2_");
      // Undeclared exception!
      try { 
        table2.select("X!:fJ", dynamicSelectModel3, "qs+x@r*2p^j<.y4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Form elements can be created only by compoents that are attached to a form component.
         //
         verifyException("wheel.components.ComponentCreator", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.8290407494790992
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      Block block0 = (Block)errorPage0.address();
      Block block1 = (Block)block0.dt();
      block1.strong((Object) errorPage0);
      Table table0 = new Table(block1, "%lNkn;/B");
      TableBlock tableBlock0 = table0.tfoot();
      tableBlock0.acronym();
      TextArea textArea0 = new TextArea(table0, "dir", (String) null);
      ActionExpression actionExpression0 = new ActionExpression((String) null);
      tableBlock0.form("jYt", actionExpression0);
      textArea0.value("}qL)\"FZ!>z.dg");
      block0.id("jYt");
      TextInput textInput0 = new TextInput((Component) null, "--r+%a%E4gv!x+", "Rh");
      TextInput textInput1 = (TextInput)textInput0.value("");
      Submit submit0 = new Submit(textInput1, "--r+%a%E4gv!x+", "M606ti~}s35d,?6g");
      Submit submit1 = (Submit)submit0.value("M606ti~}s35d,?6g");
      Long long0 = new Long(543L);
      block0.sup((Object) submit1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.3749769641974785
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      String string0 = "";
      Hidden hidden0 = new Hidden(errorPage0, (String) null, "");
      Table table0 = new Table(hidden0, "");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      Table table1 = table0.renderHint(charBuffer0);
      // Undeclared exception!
      try { 
        table1.id("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractMap", e);
      }
  }
}