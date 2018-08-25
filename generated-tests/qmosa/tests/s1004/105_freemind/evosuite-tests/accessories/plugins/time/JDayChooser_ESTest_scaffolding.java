/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 09:12:07 GMT 2018
 */

package accessories.plugins.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JDayChooser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "accessories.plugins.time.JDayChooser"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/105_freemind"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JDayChooser_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.fop.pdf.PDFGoToRemote",
      "org.apache.fop.pdf.PDFFactory",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.dtm.ref.IncrementalSAXSource",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemIf",
      "org.apache.xpath.objects.XRTreeFrag",
      "org.apache.fop.pdf.TransitionDictionary",
      "org.apache.xpath.functions.FuncNot",
      "org.apache.log4j.Level",
      "org.hsqldb.Node",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.apache.xpath.functions.FuncExtFunctionAvailable",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.dtm.DTMFilter",
      "org.hsqldb.lib.HsqlList",
      "org.apache.xalan.templates.XSLTVisitor",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xpath.objects.XNodeSet",
      "org.apache.xpath.XPath",
      "accessories.plugins.time.JDayChooser",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.apache.fop.pdf.PDFLink",
      "accessories.plugins.time.JYearChooser",
      "org.apache.xml.utils.SAXSourceLocator",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.hsqldb.Row",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.fop.pdf.PDFFunction",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.xml.dtm.ref.DTMDefaultBaseIterators",
      "org.apache.xpath.objects.XObject",
      "org.apache.fop.pdf.PDFOutline",
      "org.hsqldb.Table",
      "org.apache.fop.pdf.PDFAction",
      "org.apache.fop.pdf.PDFState",
      "org.hsqldb.lib.Collection",
      "org.apache.xalan.processor.ProcessorKey",
      "org.apache.xalan.processor.ProcessorAttributeSet",
      "org.apache.xpath.WhitespaceStrippingElementMatcher",
      "org.apache.log4j.Hierarchy",
      "org.apache.xalan.processor.ProcessorGlobalVariableDecl",
      "org.apache.fop.pdf.PDFFormXObject",
      "org.apache.avalon.framework.Enum",
      "org.hsqldb.User",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.batik.svggen.SVGCompositeDescriptor",
      "accessories.plugins.time.JSpinField$1",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.apache.xpath.functions.FuncNumber",
      "org.apache.xalan.templates.WhiteSpaceInfo",
      "org.apache.xpath.functions.FunctionMultiArgs",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xml.dtm.DTMConfigurationException",
      "org.hsqldb.resources.BundleHandler",
      "org.apache.xml.utils.WrappedRuntimeException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.xpath.axes.UnionPathIterator",
      "org.hsqldb.persist.CachedObject",
      "org.apache.xpath.functions.WrongNumberArgsException",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.PDFStream",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "org.apache.xalan.processor.ProcessorNamespaceAlias",
      "org.apache.xpath.functions.Function3Args",
      "org.apache.xml.utils.Context2",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.xml.dtm.ref.DTMDefaultBase",
      "org.apache.fop.fonts.FontType",
      "org.apache.xml.dtm.ref.ExpandedNameTable$HashEntry",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xpath.functions.FuncNormalizeSpace",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.xalan.transformer.TreeWalker2Result",
      "org.apache.xml.utils.XMLString",
      "org.hsqldb.lib.Iterator",
      "org.apache.xpath.functions.FuncSum",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.fop.fonts.CIDFontType",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "org.apache.xalan.templates.ElemCopy",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xpath.VariableStack",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.fop.pdf.PDFResources",
      "org.hsqldb.CompiledStatement",
      "org.apache.xml.dtm.DTMException",
      "org.apache.xml.utils.NodeConsumer",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.axes.PathComponent",
      "org.apache.fop.fonts.FontMetrics",
      "org.apache.log4j.Category",
      "org.apache.xml.utils.DOMHelper",
      "org.apache.xpath.functions.FuncCeiling",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xpath.Expression",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xpath.functions.FuncFalse",
      "org.apache.fop.pdf.PDFGoTo",
      "org.apache.fop.pdf.PDFEncryption",
      "org.apache.xpath.functions.FunctionDef1Arg",
      "org.apache.xml.serializer.ExtendedContentHandler",
      "org.apache.batik.svggen.SVGDescriptor",
      "org.apache.fop.pdf.PDFPattern",
      "org.apache.xpath.functions.Function",
      "org.apache.xml.serializer.ExtendedLexicalHandler",
      "org.hsqldb.lib.FileAccess",
      "org.apache.fop.image.AbstractFopImage",
      "org.apache.xalan.templates.DecimalFormatProperties",
      "org.hsqldb.DatabaseURL",
      "org.apache.xpath.XPathVisitor",
      "org.apache.xpath.functions.FuncBoolean",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.xalan.templates.NamespaceAlias",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.xml.dtm.ObjectFactory$ConfigurationError",
      "org.apache.xml.dtm.ref.sax2dtm.SAX2RTFDTM",
      "org.apache.xalan.extensions.ExpressionContext",
      "org.hsqldb.store.HashIndex",
      "org.apache.xpath.functions.FuncPosition",
      "org.apache.batik.gvt.PatternPaint",
      "org.apache.xpath.functions.FuncCount",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.fop.pdf.PDFPathPaint",
      "org.apache.xpath.functions.FuncLast",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.MultipleGradientPaint",
      "org.apache.xpath.functions.FuncSubstringAfter",
      "org.apache.xpath.patterns.NodeTest",
      "org.apache.xpath.functions.FuncQname",
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xalan.templates.ElemExtensionCall",
      "org.apache.xpath.functions.FuncSystemProperty",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.xpath.compiler.FunctionTable",
      "org.apache.xalan.processor.ProcessorExsltFunction",
      "org.apache.fop.pdf.PDFXObject",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.hsqldb.BaseTable",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.hsqldb.Database",
      "org.apache.log4j.Priority",
      "org.apache.batik.svggen.SVGFilterDescriptor",
      "org.apache.fop.fonts.Font",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.apache.xpath.axes.PredicatedNodeTest",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.log4j.LogManager",
      "org.apache.fop.fonts.Typeface",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.fop.pdf.PDFShading",
      "org.apache.xalan.extensions.ExpressionVisitor",
      "org.apache.xml.utils.ObjectVector",
      "accessories.plugins.time.JSpinField",
      "org.apache.xpath.functions.FuncStartsWith",
      "org.apache.xalan.templates.ElemAttributeSet",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.xml.utils.IntStack",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xpath.functions.Function2Args",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xpath.functions.FuncExtElementAvailable",
      "org.apache.xalan.processor.ProcessorTemplate",
      "org.apache.xml.dtm.SecuritySupport12$1",
      "org.apache.xpath.functions.FuncConcat",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xpath.functions.FuncDoclocation",
      "org.apache.xpath.axes.NodeSequence",
      "org.hsqldb.lib.Set",
      "org.apache.batik.util.SVGConstants",
      "org.apache.xpath.ExpressionOwner",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.processor.ProcessorOutputElem",
      "org.apache.xml.utils.QName",
      "org.apache.xpath.axes.SubContextList",
      "org.apache.xpath.objects.XNumber",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.xpath.functions.FuncStringLength",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.fop.pdf.PDFGState",
      "org.apache.xml.dtm.ref.DTMTreeWalker",
      "org.apache.xml.dtm.DTMIterator",
      "org.apache.fop.fonts.CustomFont",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.fop.pdf.PDFPages",
      "org.apache.xpath.axes.LocPathIterator",
      "org.apache.fop.fonts.MutableFont",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.log4j.CategoryKey",
      "org.apache.xalan.templates.ElemMessage",
      "org.hsqldb.persist.HsqlProperties",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.xpath.objects.DTMXRTreeFrag",
      "org.apache.batik.ext.awt.LinearGradientPaint",
      "org.apache.xpath.ExpressionNode",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.fop.fonts.FontDescriptor",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.templates.AVT",
      "org.hsqldb.SessionInterface",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$AttributeFilter",
      "org.apache.xml.utils.DOM2Helper",
      "org.apache.log4j.helpers.Loader",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xalan.processor.ProcessorStripSpace",
      "org.apache.log4j.ProvisionNode",
      "org.apache.fop.fonts.BFEntry",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.xpath.XPathContext",
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xalan.templates.ElemNumber",
      "org.hsqldb.types.JavaObject",
      "org.hsqldb.store.BaseHashMap",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xml.dtm.ref.sax2dtm.SAX2DTM",
      "org.apache.xpath.XPathVisitable",
      "org.apache.batik.ext.awt.RadialGradientPaint",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xml.utils.res.XResourceBundle",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xalan.processor.ProcessorDecimalFormat",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.batik.util.CSSConstants",
      "org.apache.xpath.NodeSetDTM",
      "org.apache.xalan.templates.ElemExtensionScript",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xalan.templates.FuncKey",
      "org.apache.xpath.objects.XRTreeFragSelectWrapper",
      "org.apache.xml.utils.PrefixResolver",
      "org.apache.fop.pdf.PDFInfo",
      "org.apache.xalan.processor.ProcessorText",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.types.Binary",
      "org.hsqldb.lib.IntValueHashMap",
      "org.apache.batik.svggen.ExtensionHandler",
      "org.hsqldb.lib.HashMap",
      "org.apache.xpath.functions.FuncLocalPart",
      "org.apache.xpath.functions.FuncFloor",
      "org.apache.xalan.processor.ProcessorGlobalParamDecl",
      "org.apache.fop.pdf.PDFFont",
      "org.apache.log4j.Logger",
      "org.apache.fop.pdf.PDFEncryptionParams",
      "org.apache.xml.dtm.ref.DTMDefaultBaseTraversers",
      "org.apache.xml.utils.XMLStringFactory",
      "org.apache.xpath.functions.FuncContains",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xpath.functions.FuncCurrent",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xpath.functions.FuncString",
      "org.apache.xml.dtm.DTMWSFilter",
      "org.apache.fop.pdf.PDFColor",
      "org.apache.xalan.processor.WhitespaceInfoPaths",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.xpath.functions.FuncRound",
      "org.apache.avalon.framework.ValuedEnum",
      "org.apache.xalan.templates.FuncDocument",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator",
      "org.apache.xpath.functions.FuncLang",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.functions.FuncSubstring",
      "org.apache.log4j.spi.RepositorySelector",
      "org.hsqldb.lib.HsqlArrayList",
      "org.apache.xpath.functions.FunctionOneArg",
      "org.apache.xpath.objects.XBoolean",
      "org.apache.batik.svggen.SVGPaintDescriptor",
      "org.apache.xml.dtm.ref.ExtendedType",
      "org.apache.xalan.templates.ElemParam",
      "org.hsqldb.HsqlException",
      "org.apache.xml.utils.IntVector",
      "org.hsqldb.Trace",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.fop.image.JpegImage",
      "org.apache.fop.fonts.MultiByteFont",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xalan.templates.ElemVariable",
      "org.hsqldb.lib.BaseList",
      "org.apache.xpath.functions.FuncTrue",
      "org.hsqldb.Result",
      "org.apache.xalan.processor.ProcessorImport",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.xpath.functions.FuncGenerateId",
      "org.apache.xpath.functions.FuncUnparsedEntityURI",
      "org.apache.xalan.templates.KeyDeclaration",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.xml.utils.StopParseException",
      "org.apache.xalan.templates.ElemFallback",
      "org.apache.xml.dtm.SecuritySupport12",
      "org.apache.xpath.functions.FuncId",
      "org.apache.xalan.templates.ElemComment",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.fop.image.FopImage",
      "org.apache.xpath.functions.FuncNamespace",
      "org.apache.xalan.processor.ProcessorPreserveSpace",
      "org.apache.xalan.templates.XSLTVisitable",
      "org.apache.xpath.functions.FuncSubstringBefore",
      "org.apache.fop.pdf.PDFImage",
      "org.apache.xml.dtm.SecuritySupport12$6",
      "org.apache.xml.dtm.SecuritySupport12$7",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.templates.ElemChoose",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.xml.dtm.SecuritySupport12$2",
      "org.apache.xpath.objects.XString",
      "org.apache.xml.dtm.SecuritySupport12$3",
      "org.apache.fop.pdf.PDFFileSpec",
      "org.apache.xml.dtm.SecuritySupport12$4",
      "org.apache.xpath.functions.FuncTranslate",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.hsqldb.Session",
      "org.apache.fop.pdf.PDFAnnotList",
      "org.apache.xml.dtm.DTM",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xalan.templates.ElemAttribute",
      "org.apache.batik.svggen.SVGSyntax",
      "org.apache.fop.fonts.CIDFont",
      "org.apache.xml.utils.BoolStack"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.ContainerListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.swing.event.AncestorListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.hsqldb.Session", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
      "freemind.view.mindmapview.MultipleImage",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.NodeHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.collaboration.database.DatabaseConnectionHook",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.pdf.PDFResources",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.fonts.Typeface",
      "org.apache.fop.fonts.CustomFont",
      "org.apache.fop.fonts.CIDFont",
      "org.apache.fop.fonts.MultiByteFont",
      "org.apache.avalon.framework.Enum",
      "org.apache.avalon.framework.ValuedEnum",
      "org.apache.fop.fonts.FontType",
      "org.apache.fop.fonts.CIDFontType",
      "org.apache.fop.fonts.Font",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.ArrayUtil",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xpath.Expression",
      "org.apache.xpath.functions.Function",
      "org.apache.xpath.functions.FuncCurrent",
      "org.apache.xpath.functions.FuncLast",
      "org.apache.xpath.functions.FuncPosition",
      "org.apache.xpath.functions.FunctionOneArg",
      "org.apache.xpath.functions.FuncCount",
      "org.apache.xpath.functions.FuncId",
      "org.apache.xpath.functions.Function2Args",
      "org.apache.xalan.templates.FuncKey",
      "org.apache.xpath.functions.FunctionDef1Arg",
      "org.apache.xpath.functions.FuncLocalPart",
      "org.apache.xpath.functions.FuncNamespace",
      "org.apache.xpath.functions.FuncQname",
      "org.apache.xpath.functions.FuncGenerateId",
      "org.apache.xpath.functions.FuncNot",
      "org.apache.xpath.functions.FuncTrue",
      "org.apache.xpath.functions.FuncFalse",
      "org.apache.xpath.functions.FuncBoolean",
      "org.apache.xpath.functions.FuncLang",
      "org.apache.xpath.functions.FuncNumber",
      "org.apache.xpath.functions.FuncFloor",
      "org.apache.xpath.functions.FuncCeiling",
      "org.apache.xpath.functions.FuncRound",
      "org.apache.xpath.functions.FuncSum",
      "org.apache.xpath.functions.FuncString",
      "org.apache.xpath.functions.FuncStartsWith",
      "org.apache.xpath.functions.FuncContains",
      "org.apache.xpath.functions.FuncSubstringBefore",
      "org.apache.xpath.functions.FuncSubstringAfter",
      "org.apache.xpath.functions.FuncNormalizeSpace",
      "org.apache.xpath.functions.Function3Args",
      "org.apache.xpath.functions.FuncTranslate",
      "org.apache.xpath.functions.FunctionMultiArgs",
      "org.apache.xpath.functions.FuncConcat",
      "org.apache.xpath.functions.FuncSystemProperty",
      "org.apache.xpath.functions.FuncExtFunctionAvailable",
      "org.apache.xpath.functions.FuncExtElementAvailable",
      "org.apache.xpath.functions.FuncSubstring",
      "org.apache.xpath.functions.FuncStringLength",
      "org.apache.xpath.functions.FuncDoclocation",
      "org.apache.xpath.functions.FuncUnparsedEntityURI",
      "org.apache.xpath.compiler.FunctionTable",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.xalan.templates.ElemIf",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.xalan.templates.ElemChoose",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemAttribute",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xalan.templates.ElemParam",
      "org.apache.xalan.processor.ProcessorText",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.xalan.templates.ElemComment",
      "org.apache.xalan.templates.ElemCopy",
      "org.apache.xalan.templates.ElemMessage",
      "org.apache.xalan.templates.ElemFallback",
      "org.apache.xalan.processor.ProcessorExsltFunction",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.xalan.processor.ProcessorImport",
      "org.apache.xalan.processor.ProcessorPreserveSpace",
      "org.apache.xalan.processor.ProcessorStripSpace",
      "org.apache.xalan.processor.ProcessorOutputElem",
      "org.apache.xalan.processor.ProcessorKey",
      "org.apache.xalan.processor.ProcessorDecimalFormat",
      "org.apache.xalan.processor.ProcessorAttributeSet",
      "org.apache.xalan.processor.ProcessorGlobalVariableDecl",
      "org.apache.xalan.processor.ProcessorGlobalParamDecl",
      "org.apache.xalan.processor.ProcessorTemplate",
      "org.apache.xalan.processor.ProcessorNamespaceAlias",
      "org.apache.xalan.templates.ElemExtensionScript",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xml.utils.BoolStack",
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTMSTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource$1",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "org.apache.batik.gvt.CanvasGraphicsNode",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xpath.XPathContext",
      "org.apache.xml.utils.IntVector",
      "org.apache.xml.utils.IntStack",
      "org.apache.xml.utils.XMLStringFactory",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport12",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.SecuritySupport12$4",
      "org.apache.xml.dtm.SecuritySupport12$7",
      "org.apache.xml.dtm.SecuritySupport12$1",
      "org.apache.xml.dtm.SecuritySupport12$2",
      "org.apache.xml.dtm.SecuritySupport12$3",
      "org.apache.xml.dtm.SecuritySupport12$6",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExtendedType",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xml.dtm.ref.ExpandedNameTable$HashEntry",
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.VariableStack",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerPNGEncoder",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.fop.fonts.LazyFont",
      "org.apache.fop.fonts.FontReader",
      "org.apache.fop.apps.FOPException",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.fop.fonts.FontSetup",
      "org.apache.fop.fonts.base14.Helvetica",
      "org.apache.fop.fonts.CodePointMapping",
      "org.apache.fop.fonts.base14.HelveticaOblique",
      "org.apache.fop.fonts.base14.HelveticaBold",
      "org.apache.fop.fonts.base14.HelveticaBoldOblique",
      "org.apache.fop.fonts.base14.TimesRoman",
      "org.apache.fop.fonts.base14.TimesItalic",
      "org.apache.fop.fonts.base14.TimesBold",
      "org.apache.fop.fonts.base14.TimesBoldItalic",
      "org.apache.fop.fonts.base14.Courier",
      "org.apache.fop.fonts.base14.CourierOblique",
      "org.apache.fop.fonts.base14.CourierBold",
      "org.apache.fop.fonts.base14.CourierBoldOblique",
      "org.apache.fop.fonts.base14.Symbol",
      "org.apache.fop.fonts.base14.ZapfDingbats",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFFactory",
      "org.apache.fop.pdf.PDFPages",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.fop.pdf.PDFInfo",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.fop.pdf.PDFStream",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.fop.pdf.FlateFilter",
      "freemind.modes.Mode",
      "freemind.modes.filemode.FileMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "org.apache.fop.fonts.SingleByteFont",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "org.jibx.runtime.Utility",
      "org.jibx.runtime.JiBXException"
    );
  }
}
