/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 07:57:11 GMT 2018
 */

package wheel.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DynamicSelectModel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "wheel.util.DynamicSelectModel"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/80_wheelwebtool"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DynamicSelectModel_ESTest_scaffolding.class.getClassLoader() ,
      "wheel.components.Image",
      "org.mvel.optimizers.OptimizerFactory",
      "wheel.components.ComponentCreator",
      "org.mvel.ast.LineLabel",
      "org.mvel.asm.Item",
      "org.xmlpull.v1.XmlSerializer",
      "org.mvel.util.Stack",
      "org.mvel.optimizers.AccessorOptimizer",
      "org.mvel.util.ArrayTools",
      "wheel.components.StandaloneComponent",
      "org.mvel.PropertyAccessor",
      "wheel.components.ActionExpression",
      "wheel.components.RenderableComponent",
      "wheel.components.IContainer",
      "wheel.IEngine",
      "wheel.components.Table",
      "wheel.components.Radio",
      "org.mvel.ast.EndOfStatement",
      "wheel.components.Text",
      "org.mvel.Accessor",
      "org.mvel.ast.DeepAssignmentNode",
      "org.mvel.asm.ClassVisitor",
      "wheel.components.IBuildableComponent",
      "org.mvel.ast.OperatorNode",
      "wheel.components.CheckboxGroup",
      "org.mvel.ast.WithNode",
      "wheel.components.Any",
      "org.mvel.asm.ClassWriter",
      "org.mvel.util.PropertyTools",
      "org.mvel.ast.PreFixIncNode",
      "org.mvel.ast.AssignSub",
      "org.mvel.ast.IfNode",
      "wheel.components.FileInput",
      "org.mvel.ast.Union",
      "org.mvel.ast.LiteralNode",
      "wheel.util.WrappedException",
      "org.mvel.optimizers.impl.refl.ConstructorAccessor",
      "org.mvel.optimizers.impl.asm.ASMAccessorOptimizer",
      "org.mvel.asm.AnnotationVisitor",
      "org.mvel.ast.NestedStatement",
      "org.mvel.ast.AssertNode",
      "org.mvel.ast.PreFixDecNode",
      "org.mvel.util.ParseTools",
      "org.mvel.AccessorNode",
      "org.mvel.ast.AssignmentNode",
      "org.mvel.ast.BlockNode",
      "org.mvel.ast.VariableDeepPropertyNode",
      "org.mvel.optimizers.AbstractOptimizer",
      "org.mvel.ParseException",
      "org.mvel.BlankLiteral",
      "org.mvel.ast.RegExMatch",
      "org.mvel.ast.PropertyASTNode",
      "org.mvel.conversion.Converter",
      "org.mvel.ast.ThisValDeepPropertyNode",
      "org.mvel.MVEL",
      "org.mvel.UnresolveablePropertyException",
      "org.mvel.ast.PostFixIncNode",
      "org.mvel.ast.ForEachNode",
      "org.mvel.ast.StaticImportNode",
      "org.mvel.ast.ReturnNode",
      "org.mvel.ast.Assignment",
      "org.mvel.ast.AssignMult",
      "org.mvel.ASTNode",
      "wheel.components.ISelectModel",
      "wheel.components.NumberInput",
      "org.mvel.ast.ContextDeepPropertyNode",
      "wheel.util.DynamicSelectModel",
      "wheel.components.ElExpression",
      "org.mvel.ast.NewObjectNode",
      "org.mvel.ast.ImportNode",
      "wheel.components.Checkbox",
      "org.mvel.math.IEEEFloatingPointMath",
      "wheel.components.TextArea",
      "wheel.components.Form",
      "org.mvel.asm.MethodVisitor",
      "org.mvel.OptimizationFailure",
      "wheel.components.Label",
      "wheel.components.Hidden",
      "org.mvel.ast.WhileNode",
      "wheel.components.TextInput",
      "org.mvel.ast.LiteralDeepPropertyNode",
      "wheel.components.RenderableComponentConfiguration",
      "org.mvel.util.ExecutionStack",
      "wheel.components.ValidationError",
      "wheel.components.XmlEntityRef",
      "wheel.Messages",
      "org.mvel.ast.InlineCollectionNode",
      "wheel.components.SelectModelFormElement",
      "org.mvel.MVELInterpretedRuntime",
      "org.mvel.util.ThisLiteral",
      "org.mvel.PropertyAccessException",
      "org.mvel.optimizers.impl.refl.BaseAccessor",
      "org.mvel.ast.ThisValNode",
      "wheel.components.Expression",
      "wheel.components.FormElement",
      "wheel.util.ComponentStore",
      "wheel.components.DateInput",
      "org.mvel.ast.PostFixDecNode",
      "org.mvel.ast.Substatement",
      "wheel.components.StandaloneComponentConfiguration",
      "org.mvel.optimizers.OptimizationNotSupported",
      "org.mvel.ast.TypeCast",
      "org.mvel.ast.VarPropertyNode",
      "org.mvel.ast.InterceptorWrapper",
      "org.mvel.asm.ByteVector",
      "wheel.components.RadioGroup",
      "wheel.components.Select",
      "org.mvel.CompileException",
      "wheel.components.Component",
      "org.mvel.ast.TypedVarNode",
      "org.mvel.ParserContext",
      "org.mvel.integration.VariableResolverFactory",
      "wheel.WheelException",
      "wheel.components.Link",
      "org.mvel.AbstractParser",
      "org.mvel.EndWithValue",
      "org.mvel.ast.AssignAdd",
      "org.mvel.math.MathProcessor",
      "org.mvel.conversion.ShortCH$9",
      "org.mvel.asm.FieldVisitor",
      "org.mvel.optimizers.impl.refl.ReflectiveAccessorOptimizer",
      "org.mvel.util.StackElement",
      "wheel.components.Submit",
      "org.mvel.ast.AssignDiv",
      "wheel.components.Block",
      "org.mvel.ConversionException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DynamicSelectModel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "wheel.util.DynamicSelectModel",
      "wheel.components.Expression",
      "wheel.components.ElExpression",
      "wheel.components.XmlEntityRef",
      "wheel.components.Component",
      "wheel.components.RenderableComponent",
      "wheel.components.StandaloneComponent",
      "wheel.ErrorPage",
      "wheel.AbstractEngine$1",
      "wheel.util.AbstractDateConversionHandler$1",
      "wheel.util.AbstractDateConversionHandler",
      "wheel.util.CalendarConversionHandler",
      "org.mvel.conversion.IntegerCH$1",
      "org.mvel.conversion.IntegerCH$2",
      "org.mvel.conversion.IntegerCH$3",
      "org.mvel.conversion.IntegerCH$4",
      "org.mvel.conversion.IntegerCH$5",
      "org.mvel.conversion.IntegerCH$6",
      "org.mvel.conversion.IntegerCH$7",
      "org.mvel.conversion.IntegerCH$8",
      "org.mvel.conversion.IntegerCH$9",
      "org.mvel.conversion.IntegerCH$10",
      "org.mvel.conversion.IntegerCH$11",
      "org.mvel.conversion.IntegerCH",
      "org.mvel.conversion.ShortCH$1",
      "org.mvel.conversion.ShortCH$2",
      "org.mvel.conversion.ShortCH$3",
      "org.mvel.conversion.ShortCH$4",
      "org.mvel.conversion.ShortCH$5",
      "org.mvel.conversion.ShortCH$6",
      "org.mvel.conversion.ShortCH$7",
      "org.mvel.conversion.ShortCH$8",
      "org.mvel.conversion.ShortCH$9",
      "org.mvel.conversion.ShortCH$10",
      "org.mvel.conversion.ShortCH",
      "org.mvel.conversion.LongCH$1",
      "org.mvel.conversion.LongCH$2",
      "org.mvel.conversion.LongCH$3",
      "org.mvel.conversion.LongCH$4",
      "org.mvel.conversion.LongCH$5",
      "org.mvel.conversion.LongCH$6",
      "org.mvel.conversion.LongCH$7",
      "org.mvel.conversion.LongCH$8",
      "org.mvel.conversion.LongCH",
      "org.mvel.conversion.CharCH$1",
      "org.mvel.conversion.CharCH$2",
      "org.mvel.conversion.CharCH$3",
      "org.mvel.conversion.CharCH$4",
      "org.mvel.conversion.CharCH$5",
      "org.mvel.conversion.CharCH",
      "org.mvel.conversion.ByteCH$1",
      "org.mvel.conversion.ByteCH$2",
      "org.mvel.conversion.ByteCH$3",
      "org.mvel.conversion.ByteCH",
      "org.mvel.conversion.FloatCH$1",
      "org.mvel.conversion.FloatCH$2",
      "org.mvel.conversion.FloatCH$3",
      "org.mvel.conversion.FloatCH$4",
      "org.mvel.conversion.FloatCH$5",
      "org.mvel.conversion.FloatCH$6",
      "org.mvel.conversion.FloatCH$7",
      "org.mvel.conversion.FloatCH$8",
      "org.mvel.conversion.FloatCH$9",
      "org.mvel.conversion.FloatCH$10",
      "org.mvel.conversion.FloatCH",
      "org.mvel.conversion.DoubleCH$1",
      "org.mvel.conversion.DoubleCH$2",
      "org.mvel.conversion.DoubleCH$3",
      "org.mvel.conversion.DoubleCH$4",
      "org.mvel.conversion.DoubleCH$5",
      "org.mvel.conversion.DoubleCH$6",
      "org.mvel.conversion.DoubleCH$7",
      "org.mvel.conversion.DoubleCH$8",
      "org.mvel.conversion.DoubleCH$9",
      "org.mvel.conversion.DoubleCH$10",
      "org.mvel.conversion.DoubleCH",
      "org.mvel.conversion.BooleanCH$1",
      "org.mvel.conversion.BooleanCH$2",
      "org.mvel.conversion.BooleanCH$3",
      "org.mvel.conversion.BooleanCH$4",
      "org.mvel.conversion.BooleanCH$5",
      "org.mvel.conversion.BooleanCH$6",
      "org.mvel.conversion.BooleanCH$7",
      "org.mvel.conversion.BooleanCH$8",
      "org.mvel.conversion.BooleanCH$9",
      "org.mvel.conversion.BooleanCH$10",
      "org.mvel.conversion.BooleanCH",
      "org.mvel.conversion.StringCH",
      "org.mvel.conversion.ObjectCH",
      "org.mvel.conversion.CharArrayCH$1",
      "org.mvel.conversion.CharArrayCH",
      "org.mvel.conversion.StringArrayCH$1",
      "org.mvel.conversion.StringArrayCH",
      "org.mvel.conversion.IntArrayCH$1",
      "org.mvel.conversion.IntArrayCH$2",
      "org.mvel.conversion.IntArrayCH",
      "org.mvel.conversion.PrimArrayHandler",
      "org.mvel.conversion.PrimArrayHandler$1",
      "org.mvel.conversion.PrimArrayHandler$2",
      "org.mvel.conversion.BigDecimalCH$1",
      "org.mvel.conversion.BigDecimalCH$2",
      "org.mvel.conversion.BigDecimalCH$3",
      "org.mvel.conversion.BigDecimalCH$4",
      "org.mvel.conversion.BigDecimalCH$5",
      "org.mvel.conversion.BigDecimalCH$6",
      "org.mvel.conversion.BigDecimalCH$7",
      "org.mvel.conversion.BigDecimalCH$8",
      "org.mvel.conversion.BigDecimalCH$9",
      "org.mvel.conversion.BigDecimalCH$10",
      "org.mvel.conversion.BigDecimalCH$11",
      "org.mvel.conversion.BigDecimalCH",
      "org.mvel.conversion.BigIntegerCH$1",
      "org.mvel.conversion.BigIntegerCH$2",
      "org.mvel.conversion.BigIntegerCH$3",
      "org.mvel.conversion.BigIntegerCH$4",
      "org.mvel.conversion.BigIntegerCH$5",
      "org.mvel.conversion.BigIntegerCH$6",
      "org.mvel.conversion.BigIntegerCH$7",
      "org.mvel.conversion.BigIntegerCH$8",
      "org.mvel.conversion.BigIntegerCH$9",
      "org.mvel.conversion.BigIntegerCH",
      "org.mvel.DataConversion",
      "wheel.util.DateConversionHandler",
      "wheel.AbstractEngine",
      "wheel.Messages",
      "org.mvel.MVEL",
      "org.mvel.BlankLiteral",
      "org.mvel.AbstractParser",
      "org.mvel.MVELInterpretedRuntime",
      "org.mvel.util.ExecutionStack",
      "org.mvel.optimizers.AbstractOptimizer",
      "org.mvel.optimizers.impl.refl.ReflectiveAccessorOptimizer",
      "org.mvel.optimizers.impl.asm.ASMAccessorOptimizer",
      "org.mvel.asm.ClassWriter",
      "org.mvel.asm.ByteVector",
      "org.mvel.asm.Item",
      "org.mvel.optimizers.OptimizerFactory",
      "org.mvel.util.PropertyTools",
      "org.mvel.math.IEEEFloatingPointMath",
      "org.mvel.util.ParseTools",
      "org.mvel.ASTNode",
      "org.mvel.util.ArrayTools",
      "org.mvel.PropertyAccessor",
      "org.mvel.util.StringAppender",
      "org.mvel.PropertyAccessException",
      "org.mvel.UnresolveablePropertyException",
      "wheel.WheelException",
      "wheel.components.Label",
      "wheel.components.FormElement",
      "wheel.components.TextArea",
      "wheel.components.Any",
      "wheel.components.Block",
      "wheel.components.ActionExpression",
      "org.mvel.ast.PropertyASTNode",
      "org.mvel.CompileException",
      "wheel.components.Image",
      "org.mvel.ParseException",
      "org.mvel.ast.OperatorNode",
      "org.mvel.util.StackElement",
      "org.mvel.util.ReflectionUtil",
      "wheel.components.ComponentCreator",
      "org.mvel.ast.AssignmentNode",
      "org.mvel.OptimizationFailure",
      "org.mvel.ast.LiteralNode",
      "org.mvel.ast.PostFixIncNode",
      "org.mvel.ast.EndOfStatement",
      "org.mvel.ast.Substatement",
      "org.mvel.Operator",
      "org.mvel.ParserContext",
      "org.mvel.ast.TypeCast",
      "org.mvel.ast.InlineCollectionNode",
      "org.mvel.util.CollectionParser",
      "org.mvel.optimizers.impl.refl.collection.ExprValueAccessor",
      "org.mvel.ExpressionCompiler",
      "org.mvel.ASTLinkedList",
      "org.mvel.PropertyVerifier",
      "org.mvel.CompiledExpression",
      "org.mvel.util.CompilerTools",
      "org.mvel.ExecutableAccessor",
      "org.mvel.ExecutableLiteral",
      "org.mvel.optimizers.impl.refl.collection.ArrayCreator",
      "org.mvel.optimizers.impl.refl.collection.ListCreator",
      "org.mvel.ast.DeepAssignmentNode",
      "org.mvel.ast.BinaryOperation",
      "org.mvel.debug.DebugTools",
      "org.xmlpull.mxp1_serializer.MXSerializer",
      "org.mvel.MVELRuntime",
      "org.mvel.ast.AssignDiv",
      "org.mvel.ast.Union",
      "org.mvel.ast.ContextDeepPropertyNode",
      "wheel.components.Form",
      "wheel.components.Form$Method",
      "wheel.components.RenderableComponentConfiguration",
      "wheel.components.StandaloneComponentConfiguration",
      "wheel.components.Text",
      "org.mvel.ast.ImportNode",
      "org.mvel.ast.ReturnNode",
      "org.mvel.EndWithValue",
      "wheel.components.Link",
      "wheel.util.ComponentStore",
      "wheel.components.ValidationError",
      "org.xmlpull.v1.XmlPullParserFactory",
      "org.xmlpull.v1.wrapper.XmlPullWrapperFactory",
      "org.xmlpull.v1.wrapper.classic.XmlSerializerDelegate",
      "org.xmlpull.v1.wrapper.classic.StaticXmlSerializerWrapper",
      "org.mvel.ast.PreFixDecNode",
      "org.mvel.ast.AssignMult",
      "org.xmlpull.mxp1.MXParser",
      "wheel.Asset",
      "wheel.Asset$AssetType",
      "org.mvel.optimizers.impl.refl.collection.MapCreator",
      "org.mvel.ast.AssignAdd",
      "wheel.components.Hidden"
    );
  }
}
