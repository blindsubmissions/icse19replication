/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 10:44:59 GMT 2018
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
      "org.apache.batik.ext.awt.image.codec.ImageEncoder",
      "freemind.view.mindmapview.EditNodeBase$EditControl",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.fop.fonts.base14.ZapfDingbats",
      "freemind.modes.MindMap$MapSourceChangedObserver",
      "org.apache.log4j.Level",
      "freemind.modes.filemode.FileMode",
      "org.apache.xalan.templates.XSLTVisitor",
      "org.apache.fop.fonts.base14.Symbol",
      "freemind.extensions.MindMapHook$PluginBaseClassSearcher",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.fop.fonts.CodePointMapping",
      "accessories.plugins.time.JDayChooser",
      "freemind.controller.actions.generated.instance.Place",
      "org.apache.fop.pdf.PDFLink",
      "org.apache.fop.pdf.StreamCache",
      "accessories.plugins.time.JYearChooser",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.jibx.runtime.IBindingFactory",
      "org.apache.fop.pdf.PDFFunction",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.fop.pdf.PDFOutline",
      "org.apache.fop.pdf.PDFAction",
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.FlateFilter",
      "plugins.map.MapDialog",
      "org.apache.fop.fonts.base14.HelveticaBold",
      "org.jibx.runtime.IMarshallable",
      "org.apache.xpath.WhitespaceStrippingElementMatcher",
      "org.apache.log4j.Hierarchy",
      "org.apache.fop.fonts.base14.CourierBold",
      "org.apache.fop.pdf.PDFInternalLink",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource",
      "org.apache.fop.pdf.PDFFormXObject",
      "org.apache.batik.svggen.DOMGroupManager",
      "freemind.extensions.NodeHook",
      "org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener",
      "plugins.map.MapDialog$ResultTableModel",
      "org.apache.fop.pdf.NullFilter",
      "accessories.plugins.time.JSpinField$1",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "freemind.controller.MenuItemEnabledListener",
      "org.apache.batik.svggen.SVGIDGenerator",
      "freemind.modes.mindmapmode.actions.xml.ActorXml",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.ErrorHandler",
      "org.jibx.runtime.IUnmarshallingContext",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.avalon.framework.activity.Initializable",
      "org.apache.xpath.ExtensionsProvider",
      "org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.PDFStream",
      "org.apache.fop.fonts.base14.Courier",
      "org.apache.fop.util.FlateEncodeOutputStream",
      "org.jibx.runtime.IUnmarshallable",
      "org.apache.fop.fonts.FontSetup",
      "org.apache.xml.serializer.SerializerTrace",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.fop.pdf.ASCII85Filter",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoaderListener",
      "org.openstreetmap.gui.jmapviewer.interfaces.Attributed",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.log4j.or.ObjectRenderer",
      "freemind.modes.MindMapNode",
      "freemind.extensions.PermanentNodeHook",
      "plugins.map.MapNodePositionHolder",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "org.apache.fop.pdf.PDFResources",
      "freemind.modes.filemode.FileToolBar",
      "org.apache.fop.fonts.FontMetrics",
      "org.apache.log4j.Category",
      "org.apache.xalan.templates.ElemUse",
      "freemind.view.mindmapview.NodeView",
      "org.apache.fop.fonts.type1.PFBData",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoader",
      "org.apache.fop.pdf.PDFGoTo",
      "org.apache.fop.pdf.PDFEncryption",
      "org.apache.xml.serializer.ExtendedContentHandler",
      "org.apache.fop.pdf.PDFPattern",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileCache",
      "org.apache.commons.io.output.ProxyOutputStream",
      "org.apache.fop.image.AbstractFopImage",
      "org.xmlpull.v1.XmlPullParserException",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "freemind.modes.mindmapmode.MindMapController",
      "org.apache.xpath.XPathVisitor",
      "org.apache.avalon.framework.CascadingThrowable",
      "plugins.map.Registration",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.fop.pdf.PDFFilterException",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.jibx.runtime.IUnmarshaller",
      "org.apache.batik.svggen.StyleHandler",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.avalon.framework.CascadingRuntimeException",
      "freemind.view.MapModule",
      "org.apache.batik.svggen.ImageHandler",
      "plugins.map.FreeMindMapController$MapEditNoteTextField",
      "org.apache.batik.gvt.PatternPaint",
      "org.apache.xalan.templates.Stylesheet",
      "freemind.modes.Mode",
      "org.apache.fop.pdf.PDFPathPaint",
      "org.apache.batik.svggen.SVGPolygon",
      "freemind.extensions.HookAdapter",
      "org.apache.batik.util.XMLConstants",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.MultipleGradientPaint",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.fop.fonts.base14.TimesRoman",
      "org.apache.batik.svggen.SVGGraphics2D",
      "freemind.main.XMLParseException",
      "org.openstreetmap.gui.jmapviewer.JMapController",
      "freemind.controller.actions.generated.instance.XmlAction",
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.fop.pdf.PDFXObject",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "freemind.common.TextTranslator",
      "org.apache.log4j.Priority",
      "org.apache.avalon.framework.CascadingException",
      "plugins.map.Registration$NodeVisibilityListener",
      "org.apache.fop.fonts.Font",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.apache.batik.svggen.DOMTreeManager",
      "org.apache.log4j.LogManager",
      "org.apache.fop.fonts.Typeface",
      "org.apache.fop.pdf.PDFShading",
      "org.jibx.runtime.impl.BackFillReference",
      "org.apache.fop.pdf.PDFT1Stream",
      "plugins.map.JCursorMapViewer",
      "accessories.plugins.time.JSpinField",
      "org.apache.fop.pdf.PDFRoot",
      "freemind.controller.actions.generated.instance.WindowConfigurationStorage",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.fop.pdf.PDFTTFStream",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.fop.pdf.PDFFontNonBase14",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.batik.svggen.SVGRectangle",
      "org.apache.fop.pdf.PDFICCStream",
      "org.apache.batik.util.SVGConstants",
      "freemind.modes.ModeController$NodeSelectionListener",
      "org.jibx.runtime.JiBXException",
      "org.apache.avalon.framework.configuration.Configuration",
      "org.apache.xml.utils.QName",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.fop.pdf.PDFGState",
      "org.apache.fop.util.CloseBlockerOutputStream",
      "org.apache.fop.fonts.CustomFont",
      "org.apache.fop.pdf.PDFPages",
      "org.apache.fop.fonts.MutableFont",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.fop.fonts.base14.TimesItalic",
      "org.apache.batik.ext.awt.LinearGradientPaint",
      "org.apache.fop.fonts.base14.CourierOblique",
      "org.apache.xpath.ExpressionNode",
      "org.apache.fop.fonts.FontDescriptor",
      "plugins.map.FreeMindMapController$CursorPositionListener",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.fop.fonts.base14.TimesBoldItalic",
      "org.apache.fop.pdf.PDFPage",
      "freemind.view.mindmapview.EditNodeBase",
      "org.apache.xpath.XPathContext",
      "freemind.extensions.ExportHook",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "freemind.modes.mindmapmode.actions.MindMapActions",
      "org.apache.batik.svggen.SVGLine",
      "org.apache.commons.io.output.CountingOutputStream",
      "org.apache.batik.ext.awt.RadialGradientPaint",
      "org.apache.fop.fonts.base14.HelveticaBoldOblique",
      "org.apache.fop.pdf.PDFCIDFontDescriptor",
      "org.apache.batik.svggen.ErrorConstants",
      "freemind.extensions.PermanentNodeHookAdapter",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.fop.pdf.PDFCIDFont",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "plugins.map.MapNodePositionHolder$MapNodePositionListener",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.util.CSSConstants",
      "org.apache.batik.svggen.GenericImageHandler",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFObject",
      "plugins.map.FreeMindMapController",
      "org.apache.fop.pdf.PDFArray",
      "org.apache.xml.utils.PrefixResolver",
      "org.apache.fop.pdf.PDFInfo",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapMarker",
      "freemind.view.mindmapview.EditNodeTextField",
      "freemind.controller.Controller",
      "org.apache.fop.fonts.base14.Helvetica",
      "org.apache.batik.svggen.ExtensionHandler",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.ControllerAdapter",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "org.apache.fop.pdf.PDFFont",
      "org.apache.log4j.Logger",
      "org.apache.fop.fonts.base14.TimesBold",
      "org.apache.fop.pdf.PDFEncryptionParams",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.xml.dtm.DTMWSFilter",
      "org.apache.avalon.framework.configuration.ConfigurationException",
      "org.apache.batik.util.Base64EncoderStream",
      "org.apache.fop.pdf.PDFColor",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.xml.res.XMLMessages",
      "org.apache.fop.pdf.ASCIIHexFilter",
      "org.apache.batik.svggen.SVGGraphics2DIOException",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.log4j.spi.RepositorySelector",
      "freemind.extensions.HookRegistration",
      "freemind.extensions.ModeControllerHook",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.fop.image.JpegImage",
      "org.apache.fop.fonts.truetype.FontFileReader",
      "org.apache.fop.fonts.MultiByteFont",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.batik.svggen.SVGArc",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.fop.fonts.base14.HelveticaOblique",
      "freemind.controller.actions.generated.instance.MapWindowConfigurationStorage",
      "accessories.plugins.time.TableSorter",
      "org.apache.commons.logging.impl.Log4JLogger",
      "freemind.extensions.NodeHookAdapter",
      "plugins.map.MapDialog$CloseAction",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.fonts.type1.PFBParser",
      "freemind.extensions.MindMapHook",
      "org.apache.fop.pdf.PDFEncoding",
      "org.apache.fop.pdf.PDFNumber",
      "org.apache.fop.image.FopImage",
      "org.apache.fop.pdf.DCTFilter",
      "org.apache.xalan.templates.XSLTVisitable",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.fop.pdf.PDFImage",
      "org.apache.fop.pdf.PDFFileSpec",
      "org.apache.xalan.res.XSLTErrorResources_en",
      "org.apache.fop.pdf.PDFFontDescriptor",
      "org.apache.xalan.templates.StylesheetRoot",
      "freemind.extensions.ExportHook$ImageFilter",
      "org.apache.fop.pdf.PDFAnnotList",
      "org.apache.batik.svggen.SVGShape",
      "org.apache.avalon.framework.configuration.Configurable",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.fop.util.Finalizable",
      "org.apache.batik.svggen.SVGSyntax",
      "org.apache.fop.fonts.base14.CourierBoldOblique",
      "freemind.modes.ModeController",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.fop.fonts.CIDFont",
      "org.apache.fop.pdf.PDFUri"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.ContainerListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
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
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "freemind.modes.Mode",
      "freemind.modes.schememode.SchemeMode",
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
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.fop.pdf.PDFStream",
      "org.apache.fop.pdf.PDFICCStream",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFPage",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.fop.fonts.FontSetup",
      "org.apache.fop.fonts.Typeface",
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
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFFactory",
      "org.apache.fop.pdf.PDFPages",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.fop.pdf.PDFInfo",
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.fop.pdf.FlateFilter",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SVGIDGenerator",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "org.apache.batik.svggen.SVGShape",
      "org.apache.batik.svggen.SVGArc",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.batik.svggen.SVGLine",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.svggen.SVGPolygon",
      "org.apache.batik.svggen.SVGRectangle",
      "org.apache.batik.svggen.DOMTreeManager",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.xalan.res.XSLTErrorResources_en",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.extensions.ExportHook",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.browsemode.BrowseController",
      "freemind.modes.filemode.FileMode",
      "freemind.extensions.NodeHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.collaboration.database.DatabaseStarter",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.hsqldb.lib.FileUtil",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.batik.svggen.AbstractSVGFilterConverter",
      "org.apache.batik.svggen.SVGBufferedImageOp",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGRescaleOp",
      "org.apache.batik.svggen.SVGConvolveOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.AbstractSVGConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGPaint",
      "org.apache.batik.svggen.SVGLinearGradient",
      "org.apache.batik.svggen.SVGTexturePaint",
      "org.apache.batik.svggen.SVGCustomPaint",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.svggen.SVGBasicStroke",
      "org.apache.batik.svggen.SVGComposite",
      "org.apache.batik.svggen.SVGAlphaComposite",
      "org.apache.batik.svggen.SVGCustomComposite",
      "org.apache.batik.svggen.SVGClipDescriptor",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGRenderingHints",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGPaintDescriptor",
      "org.apache.batik.svggen.SVGStrokeDescriptor",
      "org.apache.batik.svggen.SVGCompositeDescriptor",
      "org.apache.batik.svggen.SVGHintsDescriptor",
      "org.apache.batik.svggen.SVGFontDescriptor",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$1",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "freemind.modes.mindmapmode.MindMapMode",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.svggen.CachedImageHandlerBase64Encoder",
      "org.apache.batik.svggen.ImageCacher",
      "org.apache.batik.svggen.ImageCacher$Embedded",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "freemind.controller.Controller",
      "freemind.controller.Controller$ColorTracker",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.batik.css.parser.Parser",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.css.parser.DefaultDocumentHandler",
      "org.apache.batik.css.parser.DefaultSelectorFactory",
      "org.apache.batik.css.parser.DefaultConditionFactory",
      "org.apache.batik.css.parser.DefaultErrorHandler",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerJPEGEncoder",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.hsqldb.jdbc.jdbcBlob",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "org.apache.fop.image.FopImage$ImageInfo",
      "org.apache.fop.image.AbstractFopImage",
      "org.apache.fop.image.JpegImage",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.crimson.tree.NodeBase",
      "org.apache.crimson.tree.ParentNode",
      "org.apache.crimson.util.MessageCatalog",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "org.apache.crimson.tree.XmlDocument",
      "org.apache.crimson.parser.XMLReaderImpl",
      "org.apache.crimson.tree.XmlDocumentBuilder",
      "org.apache.crimson.parser.Parser2$NullHandler",
      "org.apache.crimson.parser.Parser2$Catalog",
      "org.apache.crimson.parser.Parser2",
      "org.apache.crimson.parser.SimpleHashtable",
      "org.apache.crimson.parser.Parser2$DocLocator",
      "org.apache.crimson.parser.AttributesExImpl",
      "org.apache.crimson.parser.Parser2$NameCache",
      "org.apache.crimson.parser.EntityDecl",
      "org.apache.crimson.parser.InternalEntity",
      "org.apache.crimson.parser.SimpleHashtable$Entry",
      "org.apache.crimson.parser.Resolver",
      "org.apache.crimson.parser.InputEntity"
    );
  }
}
