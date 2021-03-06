/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:28:57 GMT 2018
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
      "plugins.map.JCursorMapViewer",
      "accessories.plugins.time.JSpinField",
      "org.apache.fop.pdf.PDFRoot",
      "freemind.controller.actions.generated.instance.WindowConfigurationStorage",
      "freemind.view.mindmapview.EditNodeBase$EditControl",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.log4j.or.RendererMap",
      "freemind.modes.MindMap$MapSourceChangedObserver",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.log4j.Level",
      "freemind.modes.ModeController$NodeSelectionListener",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource",
      "org.apache.avalon.framework.configuration.Configuration",
      "freemind.extensions.MindMapHook$PluginBaseClassSearcher",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "accessories.plugins.time.JDayChooser",
      "freemind.controller.actions.generated.instance.Place",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.fop.pdf.PDFLink",
      "org.apache.fop.pdf.PDFGState",
      "org.apache.fop.pdf.PDFPages",
      "accessories.plugins.time.JYearChooser",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.apache.fop.pdf.PDFFunction",
      "org.apache.log4j.CategoryKey",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$Maplint",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.batik.ext.awt.LinearGradientPaint",
      "plugins.map.FreeMindMapController$TileSourceStore",
      "org.apache.fop.pdf.PDFOutline",
      "org.apache.fop.pdf.PDFAction",
      "org.apache.fop.pdf.PDFState",
      "plugins.map.MapDialog",
      "plugins.map.FreeMindMapController$CursorPositionListener",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$AttributeFilter",
      "org.jibx.runtime.IMarshallable",
      "freemind.controller.actions.generated.instance.Searchresults",
      "org.apache.log4j.helpers.Loader",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource$TileUpdate",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource",
      "org.apache.fop.pdf.PDFFormXObject",
      "freemind.extensions.NodeHook",
      "org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener",
      "plugins.map.MapDialog$ResultTableModel",
      "freemind.view.mindmapview.EditNodeBase",
      "org.apache.fop.pdf.PDFPage",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTileSource",
      "accessories.plugins.time.JSpinField$1",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "freemind.controller.MenuItemEnabledListener",
      "freemind.modes.mindmapmode.actions.xml.ActorXml",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "freemind.modes.mindmapmode.actions.MindMapActions",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTMSTileSource",
      "plugins.map.MapMarkerBase",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.batik.ext.awt.RadialGradientPaint",
      "org.apache.avalon.framework.activity.Initializable",
      "freemind.extensions.PermanentNodeHookAdapter",
      "org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.fop.pdf.PDFState$Data",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "org.apache.fop.pdf.PDFStream",
      "plugins.map.MapNodePositionHolder$MapNodePositionListener",
      "org.apache.log4j.spi.RendererSupport",
      "org.jibx.runtime.IUnmarshallable",
      "org.apache.fop.pdf.PDFResourceContext",
      "plugins.map.FreeMindMapController",
      "org.apache.fop.pdf.PDFObject",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$OsmaSource",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.fop.pdf.PDFInfo",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapMarker",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoaderListener",
      "freemind.view.mindmapview.EditNodeTextField",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.ControllerAdapter",
      "org.openstreetmap.gui.jmapviewer.interfaces.Attributed",
      "org.apache.log4j.or.ObjectRenderer",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "freemind.modes.MindMapNode",
      "freemind.extensions.PermanentNodeHook",
      "plugins.map.MapNodePositionHolder",
      "org.apache.fop.pdf.PDFFont",
      "org.apache.log4j.Logger",
      "org.apache.fop.pdf.PDFEncryptionParams",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.pdf.PDFResources",
      "org.apache.avalon.framework.configuration.ConfigurationException",
      "org.apache.fop.pdf.PDFColor",
      "org.apache.fop.fonts.FontMetrics",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "freemind.view.mindmapview.NodeView",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoader",
      "org.apache.fop.pdf.PDFGoTo",
      "org.apache.fop.pdf.PDFEncryption",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractOsmTileSource",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.fop.pdf.PDFPattern",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator",
      "org.apache.log4j.spi.RepositorySelector",
      "freemind.extensions.HookRegistration",
      "org.apache.fop.image.AbstractFopImage",
      "freemind.extensions.ModeControllerHook",
      "freemind.modes.mindmapmode.MindMapController",
      "plugins.map.Registration",
      "org.apache.avalon.framework.CascadingThrowable",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.fop.image.JpegImage",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.avalon.framework.CascadingRuntimeException",
      "freemind.view.MapModule",
      "plugins.map.FreeMindMapController$MapEditNoteTextField",
      "org.apache.batik.gvt.PatternPaint",
      "org.apache.log4j.PropertyConfigurator",
      "freemind.controller.actions.generated.instance.MapWindowConfigurationStorage",
      "accessories.plugins.time.TableSorter",
      "org.apache.commons.logging.impl.Log4JLogger",
      "freemind.modes.Mode",
      "freemind.extensions.NodeHookAdapter",
      "org.apache.fop.pdf.PDFPathPaint",
      "plugins.map.MapDialog$CloseAction",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "freemind.extensions.MindMapHook",
      "freemind.extensions.HookAdapter",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.MultipleGradientPaint",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$CycleMap",
      "org.apache.fop.image.FopImage",
      "org.openstreetmap.gui.jmapviewer.JMapController",
      "freemind.controller.actions.generated.instance.XmlAction",
      "org.apache.fop.pdf.PDFDocument",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$TilesAtHome",
      "org.apache.fop.pdf.PDFImage",
      "org.apache.fop.pdf.PDFXObject",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFFileSpec",
      "freemind.common.TextTranslator",
      "org.apache.log4j.Priority",
      "plugins.map.Registration$NodeVisibilityListener",
      "org.apache.avalon.framework.CascadingException",
      "org.apache.fop.fonts.Font",
      "org.apache.fop.pdf.PDFAnnotList",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.apache.avalon.framework.configuration.Configurable",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "freemind.modes.ModeController",
      "org.apache.fop.pdf.PDFShading"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.swing.event.AncestorListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTMSTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractOsmTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$CycleMap",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
      "freemind.modes.Mode",
      "freemind.modes.schememode.SchemeMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.browsemode.BrowseController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToHTMLSAXHandler",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
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
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.PDFState$Data",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SVGIDGenerator",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.batik.svggen.SVGGraphics2D",
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
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "org.apache.batik.gvt.CanvasGraphicsNode",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.batik.css.parser.Parser",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.css.parser.DefaultDocumentHandler",
      "org.apache.batik.css.parser.DefaultSelectorFactory",
      "org.apache.batik.css.parser.DefaultConditionFactory",
      "org.apache.batik.css.parser.DefaultErrorHandler",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
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
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.fop.pdf.PDFStream",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.fop.pdf.FlateFilter",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerPNGEncoder",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xalan.templates.ElemParam",
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
      "org.apache.crimson.parser.InputEntity",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "freemind.modes.schememode.SchemeController",
      "org.hsqldb.lib.FileUtil",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource$TileUpdate"
    );
  }
}
