/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 08:00:53 GMT 2018
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
      "freemind.controller.StructuredMenuItemHolder",
      "freemind.modes.mindmapmode.actions.EdgeColorAction",
      "freemind.main.FreeMind",
      "freemind.view.mindmapview.EditNodeBase$EditControl",
      "freemind.modes.mindmapmode.actions.NodeHookAction",
      "org.apache.crimson.tree.ElementNode2",
      "freemind.modes.MindMap$MapSourceChangedObserver",
      "freemind.modes.LineAdapter",
      "freemind.modes.mindmapmode.actions.EdgeStyleAction",
      "freemind.modes.mindmapmode.actions.SetLinkByTextFieldAction",
      "freemind.modes.mindmapmode.actions.NodeBackgroundColorAction",
      "org.apache.crimson.parser.InputEntity",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher",
      "org.apache.crimson.tree.XmlDocumentBuilder",
      "org.apache.crimson.util.MessageCatalog",
      "org.hsqldb.lib.HsqlList",
      "org.apache.crimson.tree.DomEx",
      "freemind.extensions.MindMapHook$PluginBaseClassSearcher",
      "org.apache.crimson.tree.DataNode",
      "freemind.main.EditServer",
      "accessories.plugins.time.JDayChooser",
      "org.hsqldb.jdbc.jdbcStatement",
      "freemind.controller.actions.generated.instance.Place",
      "accessories.plugins.time.JYearChooser",
      "freemind.modes.mindmapmode.actions.xml.ActionFactory",
      "freemind.modes.mindmapmode.actions.UsePlainTextAction",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache",
      "plugins.map.FreeMindMapController$TileSourceStore",
      "freemind.modes.mindmapmode.actions.SingleNodeOperation",
      "freemind.main.FreeMindMain$VersionInformation",
      "org.hsqldb.lib.Collection",
      "org.apache.crimson.tree.NodeEx",
      "plugins.map.MapDialog",
      "freemind.modes.mindmapmode.MindMapMapModel",
      "freemind.controller.MenuItemSelectedListener",
      "org.jibx.runtime.IMarshallable",
      "freemind.controller.actions.generated.instance.Searchresults",
      "freemind.modes.MindMapArrowLink",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$3",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$2",
      "freemind.view.mindmapview.MapView",
      "freemind.extensions.NodeHook",
      "freemind.modes.mindmapmode.actions.xml.ActionHandler",
      "org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener",
      "plugins.map.MapDialog$ResultTableModel",
      "freemind.controller.MapMouseMotionListener$MapMouseMotionReceiver",
      "freemind.modes.mindmapmode.actions.FontSizeAction",
      "accessories.plugins.time.JSpinField$1",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.apache.crimson.parser.EntityDecl",
      "freemind.controller.MenuItemEnabledListener",
      "freemind.modes.mindmapmode.actions.xml.ActorXml",
      "org.apache.crimson.parser.Resolver",
      "org.hsqldb.resources.BundleHandler",
      "freemind.modes.FreeMindAwtFileDialog",
      "org.apache.crimson.parser.EndOfInputException",
      "org.apache.crimson.parser.Parser2$1",
      "freemind.view.mindmapview.attributeview.AttributePopupMenu",
      "org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent",
      "freemind.modes.mindmapmode.actions.IconAction",
      "freemind.main.XMLElement",
      "freemind.modes.mindmapmode.actions.RedoAction",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$1",
      "freemind.modes.FreeMindFileDialog",
      "freemind.modes.mindmapmode.actions.xml.ActionPair",
      "org.jibx.runtime.IUnmarshallable",
      "org.openstreetmap.gui.jmapviewer.Tile",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher$JobThread",
      "org.apache.crimson.tree.XmlDocument$EntityRefNode",
      "freemind.modes.mindmapmode.actions.EdgeWidthAction",
      "freemind.modes.mindmapmode.actions.RevertAction",
      "freemind.controller.NodeMotionListener$NodeMotionAdapter",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoaderListener",
      "freemind.modes.IconInformation",
      "org.apache.crimson.parser.Parser2$NullHandler",
      "org.apache.crimson.tree.XmlDocument$ExtWriteContext",
      "org.apache.crimson.parser.SimpleHashtable",
      "org.openstreetmap.gui.jmapviewer.interfaces.Attributed",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$Mapnik",
      "freemind.modes.MindMapNode",
      "org.hsqldb.lib.Iterator",
      "freemind.extensions.PermanentNodeHook",
      "plugins.map.MapNodePositionHolder",
      "freemind.main.IFreeMindSplash",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.mindmapmode.attributeactors.AttributesListener",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "freemind.modes.mindmapmode.actions.ItalicAction",
      "freemind.modes.mindmapmode.actions.NewChildAction",
      "freemind.modes.MindMapLink",
      "org.apache.crimson.tree.XmlWritable",
      "org.apache.crimson.tree.AttributeNode1",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapPolygon",
      "freemind.modes.MindMapLine",
      "freemind.controller.actions.generated.instance.NodeAction",
      "org.apache.crimson.tree.CommentNode",
      "freemind.view.mindmapview.NodeView",
      "freemind.modes.XMLElementAdapter",
      "org.apache.crimson.tree.ElementEx",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoader",
      "freemind.modes.mindmapmode.actions.HookAction",
      "org.apache.crimson.tree.TextNode",
      "freemind.modes.common.CommonNodeKeyListener$EditHandler",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractOsmTileSource",
      "freemind.main.LoggingOutputStream",
      "freemind.controller.MapModuleManager",
      "freemind.modes.mindmapmode.actions.CutAction",
      "freemind.main.FreeMindStarter$ProxyAuthenticator",
      "freemind.controller.LastStateStorageManagement",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileCache",
      "org.hsqldb.lib.FileAccess",
      "freemind.modes.mindmapmode.actions.CopyAction",
      "freemind.modes.mindmapmode.MindMapController",
      "org.hsqldb.DatabaseURL",
      "freemind.modes.mindmapmode.actions.DeleteChildAction",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache$CacheLinkedListElement",
      "plugins.map.Registration",
      "org.apache.crimson.parser.AttributesEx",
      "org.apache.crimson.parser.AttributesExImpl",
      "freemind.modes.attributes.Attribute",
      "org.apache.crimson.parser.Parser2$NameCache",
      "freemind.modes.mindmapmode.actions.RemoveAllIconsAction",
      "freemind.view.MapModule",
      "org.apache.crimson.parser.SimpleHashtable$Entry",
      "org.apache.crimson.tree.CDataNode",
      "org.hsqldb.store.HashIndex",
      "freemind.modes.mindmapmode.actions.ChangeArrowLinkEndPoints",
      "plugins.map.FreeMindMapController$MapEditNoteTextField",
      "freemind.modes.mindmapmode.actions.CloudAction",
      "freemind.modes.MindIcon",
      "org.apache.crimson.parser.Parser2$DocLocator",
      "freemind.modes.Mode",
      "org.apache.crimson.parser.Parser2",
      "freemind.modes.ModeController$NodeLifetimeListener",
      "org.apache.crimson.parser.ValidatingParser",
      "freemind.extensions.HookAdapter",
      "freemind.modes.mindmapmode.actions.ImportExplorerFavoritesAction",
      "accessories.plugins.time.JMonthChooser$1",
      "freemind.main.ExampleFileFilter",
      "freemind.main.FreeMindSecurityManager",
      "freemind.main.XMLParseException",
      "org.openstreetmap.gui.jmapviewer.JMapController",
      "freemind.modes.mindmapmode.actions.RemoveIconAction",
      "freemind.controller.actions.generated.instance.XmlAction",
      "freemind.modes.mindmapmode.actions.JoinNodesAction",
      "freemind.controller.actions.generated.instance.MenuStructure",
      "freemind.modes.mindmapmode.actions.BoldAction",
      "freemind.modes.mindmapmode.actions.SelectBranchAction",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.openstreetmap.gui.jmapviewer.AttributionSupport",
      "freemind.main.FreeMindCommon",
      "freemind.common.TextTranslator",
      "plugins.map.Registration$NodeVisibilityListener",
      "freemind.modes.mindmapmode.MindMapController$NewNodeCreator",
      "org.openstreetmap.gui.jmapviewer.DefaultMapController",
      "freemind.modes.mindmapmode.actions.ToggleChildrenFoldedAction",
      "plugins.map.JCursorMapViewer",
      "accessories.plugins.time.JSpinField",
      "freemind.modes.MapAdapter",
      "freemind.controller.actions.generated.instance.WindowConfigurationStorage",
      "freemind.modes.mindmapmode.actions.AddArrowLinkAction",
      "freemind.modes.NodeDownAction",
      "freemind.main.FreeMindApplet",
      "freemind.modes.common.actions.FindAction",
      "org.hsqldb.lib.Set",
      "freemind.modes.ModeController$NodeSelectionListener",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.modes.ArrowLinkAdapter",
      "org.jibx.runtime.JiBXException",
      "freemind.controller.StructuredMenuHolder$MenuEventSupplier",
      "freemind.modes.mindmapmode.actions.RemoveArrowLinkAction",
      "freemind.modes.mindmapmode.actions.PasteAction",
      "freemind.modes.common.actions.FindAction$FindNextAction",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "freemind.main.FreeMindMain",
      "org.apache.crimson.parser.Parser2$Catalog",
      "org.apache.crimson.tree.AttributeNode",
      "freemind.extensions.HookFactory",
      "org.apache.crimson.tree.XmlDocument$DocFragNode",
      "freemind.controller.actions.generated.instance.EditNoteToNodeAction",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapRectangle",
      "org.apache.crimson.parser.ExternalEntity",
      "org.apache.crimson.tree.ElementFactory",
      "org.openstreetmap.gui.jmapviewer.OsmMercator",
      "org.apache.crimson.parser.Parser2$NameCacheEntry",
      "freemind.preferences.FreemindPropertyListener",
      "org.hsqldb.persist.HsqlProperties",
      "freemind.modes.mindmapmode.actions.NodeColorAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.listeners.MindMapNodeMotionListener",
      "freemind.modes.mindmapmode.actions.EditAction",
      "freemind.modes.mindmapmode.actions.ToggleFoldedAction",
      "org.apache.crimson.tree.NodeBase",
      "org.hsqldb.jdbc.jdbcConnection",
      "freemind.modes.mindmapmode.actions.ApplyPatternAction",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "plugins.map.FreeMindMapController$CursorPositionListener",
      "freemind.modes.mindmapmode.actions.NodeColorBlendAction",
      "org.hsqldb.SessionInterface",
      "freemind.modes.NodeAdapter",
      "freemind.main.FreeMindMain$StartupDoneListener",
      "freemind.modes.FreeMindJFileDialog",
      "freemind.view.mindmapview.EditNodeBase",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTileSource",
      "freemind.modes.mindmapmode.attributeactors.AssignAttributeDialog",
      "freemind.controller.actions.generated.instance.TextNodeAction",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "freemind.modes.mindmapmode.actions.CompoundActionHandler",
      "freemind.modes.mindmapmode.actions.MindMapActions",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTMSTileSource",
      "org.hsqldb.types.JavaObject",
      "freemind.modes.mindmapmode.actions.FontFamilyAction",
      "plugins.map.MapMarkerBase",
      "org.hsqldb.store.BaseHashMap",
      "freemind.controller.FreeMindPopupMenu",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.ColorArrowLinkAction",
      "freemind.extensions.PermanentNodeHookAdapter",
      "freemind.modes.mindmapmode.MindMapNodeModel",
      "org.apache.crimson.tree.DocumentEx",
      "freemind.modes.mindmapmode.actions.ChangeArrowsInArrowLinkAction",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "plugins.map.MapNodePositionHolder$MapNodePositionListener",
      "freemind.modes.mindmapmode.MindMapController$MindMapControllerPlugin",
      "freemind.modes.attributes.AttributeController",
      "tests.freemind.FreeMindMainMock",
      "freemind.common.NamedObject",
      "plugins.map.FreeMindMapController",
      "freemind.modes.mindmapmode.attributeactors.MindMapModeAttributeController",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapMarker",
      "freemind.view.mindmapview.EditNodeTextField",
      "org.hsqldb.jdbc.Util",
      "org.apache.crimson.tree.XmlDocument",
      "org.hsqldb.types.Binary",
      "freemind.controller.Controller",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.ControllerAdapter",
      "org.hsqldb.lib.HashMap",
      "freemind.main.FeedBack",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "org.apache.crimson.tree.NamespacedNode",
      "org.apache.crimson.parser.XMLReaderImpl",
      "freemind.modes.mindmapmode.actions.MoveNodeAction",
      "freemind.modes.mindmapmode.actions.NodeActorXml",
      "freemind.modes.common.GotoLinkNodeAction",
      "freemind.modes.mindmapmode.actions.CloudColorAction",
      "org.apache.crimson.tree.ParentNode",
      "accessories.plugins.time.JMonthChooser",
      "freemind.modes.mindmapmode.actions.UseRichFormattingAction",
      "freemind.extensions.HookRegistration",
      "org.hsqldb.lib.HsqlArrayList",
      "freemind.extensions.ModeControllerHook",
      "freemind.main.Resources",
      "org.hsqldb.HsqlException",
      "freemind.modes.mindmapmode.actions.MindMapActions$MouseWheelEventHandler",
      "freemind.modes.mindmapmode.actions.NodeBackgroundColorAction$RemoveNodeBackgroundColorAction",
      "org.hsqldb.Trace",
      "accessories.plugins.time.JDayChooser$1",
      "freemind.controller.actions.generated.instance.Pattern",
      "freemind.controller.ZoomListener",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "org.apache.crimson.tree.XmlWriteContext",
      "freemind.modes.mindmapmode.actions.UndoAction",
      "org.hsqldb.lib.BaseList",
      "org.apache.crimson.parser.InternalEntity",
      "org.hsqldb.Result",
      "freemind.controller.MenuBar",
      "freemind.modes.mindmapmode.actions.UnderlinedAction",
      "freemind.controller.actions.generated.instance.MapWindowConfigurationStorage",
      "org.apache.crimson.tree.ElementNode",
      "accessories.plugins.time.TableSorter",
      "freemind.extensions.NodeHookAdapter",
      "freemind.modes.mindmapmode.MindMapArrowLinkModel",
      "freemind.modes.mindmapmode.actions.AddLocalLinkAction",
      "plugins.map.MapDialog$CloseAction",
      "freemind.extensions.MindMapHook",
      "freemind.modes.mindmapmode.MindMapPopupMenu",
      "freemind.modes.mindmapmode.actions.PasteAsPlainTextAction",
      "freemind.main.LogFileLogHandler",
      "freemind.view.mindmapview.MapView$ScrollPane",
      "freemind.modes.LinkAdapter",
      "freemind.main.StdFormatter",
      "freemind.modes.MindMap",
      "freemind.modes.mindmapmode.actions.NodeStyleAction",
      "freemind.controller.StructuredMenuHolder",
      "freemind.controller.NodeMouseMotionListener$NodeMouseMotionObserver",
      "org.apache.crimson.tree.PINode",
      "freemind.modes.mindmapmode.actions.ImportFolderStructureAction",
      "org.openstreetmap.gui.jmapviewer.TileController",
      "org.hsqldb.Session",
      "freemind.modes.mindmapmode.actions.NodeUpAction",
      "freemind.modes.mindmapmode.actions.SelectAllAction",
      "freemind.main.FreeMindStarter",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "freemind.modes.ModeController",
      "freemind.modes.mindmapmode.MindMapXMLElement",
      "freemind.modes.mindmapmode.MindMapController$MindMapFilter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.awt.event.ContainerListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.awt.event.HierarchyListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.NodeHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.collaboration.database.DatabaseConnectionHook",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.RemoveIconAction",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
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
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
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
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "freemind.modes.Mode",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.filemode.FileController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "freemind.modes.filemode.FileMode",
      "freemind.controller.Controller",
      "freemind.modes.ModesCreator",
      "freemind.controller.ColorSwatch",
      "freemind.controller.Controller$BackgroundSwatch",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.controller.Controller$HideAllAttributesAction",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.fop.fonts.FontInfo",
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
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.pdf.PDFPages",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.fop.pdf.PDFResources",
      "org.apache.fop.pdf.PDFInfo",
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.fop.pdf.PDFStream",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.fop.pdf.FlateFilter",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.modes.browsemode.BrowseController",
      "org.apache.batik.util.SoftReferenceCache",
      "org.apache.batik.ext.awt.color.NamedProfileCache",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache$CacheLinkedListElement",
      "org.openstreetmap.gui.jmapviewer.AttributionSupport",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractTMSTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.AbstractOsmTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$Mapnik",
      "org.openstreetmap.gui.jmapviewer.TileController",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher$JobThread",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$1",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$2",
      "org.openstreetmap.gui.jmapviewer.JMapViewer$3",
      "org.openstreetmap.gui.jmapviewer.OsmMercator",
      "org.openstreetmap.gui.jmapviewer.JMapController",
      "org.openstreetmap.gui.jmapviewer.DefaultMapController",
      "freemind.modes.mindmapmode.actions.CloudColorAction",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.ExtensibleDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AElementFactory",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AltGlyphElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AltGlyphDefElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AltGlyphItemElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AnimateElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AnimateColorElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AnimateMotionElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$AnimateTransformElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$CircleElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ClipPathElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ColorProfileElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$CursorElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$DefinitionSrcElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$DefsElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$DescElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$EllipseElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeBlendElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeColorMatrixElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeComponentTransferElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeCompositeElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeConvolveMatrixElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeDiffuseLightingElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeDisplacementMapElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeDistantLightElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeFloodElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeFuncAElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeFuncRElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeFuncGElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeFuncBElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeGaussianBlurElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeImageElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeMergeElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeMergeNodeElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeMorphologyElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeOffsetElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FePointLightElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeSpecularLightingElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeSpotLightElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeTileElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FeTurbulenceElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FilterElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontFaceElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontFaceFormatElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontFaceNameElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontFaceSrcElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$FontFaceUriElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ForeignObjectElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$GElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$GlyphElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$GlyphRefElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$HkernElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ImageElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$LineElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$LinearGradientElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$MarkerElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$MaskElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$MetadataElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$MissingGlyphElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$MpathElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$PathElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$PatternElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$PolygonElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$PolylineElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$RadialGradientElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$RectElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$SetElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ScriptElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$StopElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$StyleElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$SvgElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$SwitchElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$SymbolElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$TextElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$TextPathElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$TitleElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$TrefElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$TspanElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$UseElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$ViewElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation$VkernElementFactory",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.util.Service",
      "org.apache.batik.extension.svg.BatikDomExtension",
      "org.apache.batik.extension.svg.BatikDomExtension$BatikRegularPolygonElementFactory",
      "org.apache.batik.dom.util.DoublyIndexedTable",
      "org.apache.batik.dom.util.DoublyIndexedTable$Entry",
      "org.apache.batik.extension.svg.BatikDomExtension$BatikStarElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$BatikHistogramNormalizationElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$ColorSwitchElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowTextElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowDivElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowParaElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowRegionBreakElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowRegionElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowLineElementFactory",
      "org.apache.batik.extension.svg.BatikDomExtension$FlowSpanElementFactory",
      "org.apache.batik.dom.svg.SVGDOMImplementation",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowDivElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowLineElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowParaElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowRegionBreakElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowRegionElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowRegionExcludeElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowRootElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$FlowSpanElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$MultiImageElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$SolidColorElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$SubImageElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation$SubImageRefElementFactory",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "org.hsqldb.lib.FileUtil"
    );
  }
}
