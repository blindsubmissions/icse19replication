/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 14:37:28 GMT 2018
 */

package freemind.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Controller_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "freemind.controller.Controller"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/105_freemind"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Controller_ESTest_scaffolding.class.getClassLoader() ,
      "freemind.controller.Controller$ShowAttributeDialogAction",
      "freemind.controller.Controller$KeyDocumentationAction",
      "plugins.map.JCursorMapViewer",
      "freemind.controller.Controller$DefaultLocalLinkConverter",
      "freemind.controller.actions.generated.instance.WindowConfigurationStorage",
      "freemind.controller.Controller$OptionAntialiasAction",
      "freemind.modes.mindmapmode.attributeactors.AttributeManagerDialog",
      "freemind.modes.MindMap$MapSourceChangedObserver",
      "freemind.controller.actions.generated.instance.CompoundAction",
      "freemind.controller.Controller$BackgroundSwatch",
      "freemind.main.FreeMindApplet",
      "freemind.modes.schememode.SchemeToolBar",
      "freemind.modes.ModeController$NodeSelectionListener",
      "plugins.map.Registration$CachePurger",
      "freemind.controller.NodeDropListener",
      "freemind.modes.filemode.FileMode",
      "freemind.extensions.MindMapHook$PluginBaseClassSearcher",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "freemind.main.FreeMindMain",
      "freemind.controller.actions.generated.instance.Place",
      "freemind.controller.NodeMouseMotionListener",
      "plugins.map.TileImage",
      "freemind.controller.Controller$PageAction",
      "freemind.controller.Controller$OpenURLAction",
      "freemind.controller.MapMouseMotionListener",
      "freemind.preferences.FreemindPropertyListener",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.main.FreeMindMain$VersionInformation",
      "plugins.map.MapDialog",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.map.FreeMindMapController$CursorPositionListener",
      "freemind.controller.MenuItemSelectedListener",
      "freemind.controller.LastOpenedList",
      "org.jibx.runtime.IMarshallable",
      "freemind.preferences.FreemindPropertyContributor",
      "freemind.controller.Controller$ToggleToolbarAction",
      "freemind.controller.actions.generated.instance.MoveNodesAction",
      "freemind.main.FreeMindMain$StartupDoneListener",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileSource",
      "freemind.controller.Controller$ToggleLeftToolbarAction",
      "freemind.view.mindmapview.MapView",
      "freemind.extensions.NodeHook",
      "org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener",
      "plugins.map.MapDialog$ResultTableModel",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "freemind.controller.Controller$NavigationMoveMapLeftAction",
      "freemind.controller.MenuItemEnabledListener",
      "freemind.controller.MapModuleManager$MapTitleChangeListener",
      "freemind.controller.Controller$ShowSelectionAsRectangleAction",
      "freemind.modes.mindmapmode.actions.xml.ActorXml",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "freemind.modes.mindmapmode.actions.MindMapActions",
      "freemind.controller.actions.generated.instance.MoveNodeXmlAction",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.extensions.DontSaveMarker",
      "freemind.extensions.PermanentNodeHookAdapter",
      "org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "freemind.controller.Controller$NavigationNextMapAction",
      "plugins.map.MapNodePositionHolder$MapNodePositionListener",
      "freemind.controller.Controller$AboutAction",
      "org.jibx.runtime.IUnmarshallable",
      "tests.freemind.FreeMindMainMock",
      "freemind.controller.NodeDragListener",
      "org.openstreetmap.gui.jmapviewer.Tile",
      "freemind.common.NamedObject",
      "plugins.map.FreeMindMapController",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.openstreetmap.gui.jmapviewer.interfaces.MapMarker",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoaderListener",
      "freemind.controller.Controller",
      "freemind.controller.Controller$DocumentationAction",
      "freemind.controller.filter.FilterController",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.ControllerAdapter",
      "freemind.controller.Controller$DisposeOnClose",
      "org.openstreetmap.gui.jmapviewer.interfaces.Attributed",
      "freemind.controller.Controller$ShowFilterToolbarAction",
      "freemind.controller.Controller$ZoomInAction",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "freemind.modes.MindMapNode",
      "freemind.extensions.PermanentNodeHook",
      "plugins.map.MapNodePositionHolder",
      "freemind.controller.MapMouseWheelListener",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.schememode.SchemeMode",
      "freemind.modes.mindmapmode.actions.MoveNodeAction",
      "freemind.modes.ModesCreator",
      "freemind.modes.mindmapmode.actions.NodeActorXml",
      "freemind.controller.Controller$PrintPreviewAction",
      "freemind.modes.filemode.FileToolBar",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "freemind.controller.actions.generated.instance.NodeAction",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.view.mindmapview.NodeView",
      "freemind.controller.MapModuleManager$MapTitleContributor",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileLoader",
      "plugins.collaboration.database.DatabaseConnectionHook",
      "freemind.controller.MainToolBar",
      "freemind.controller.Controller$ZoomOutAction",
      "freemind.controller.MapModuleManager",
      "freemind.main.FreeMindStarter$ProxyAuthenticator",
      "org.openstreetmap.gui.jmapviewer.interfaces.TileCache",
      "freemind.extensions.HookRegistration",
      "freemind.controller.NodeMotionListener",
      "freemind.extensions.ModeControllerHook",
      "freemind.main.Resources",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.main.Tools$IntHolder",
      "freemind.controller.Controller$Closer",
      "plugins.map.Registration",
      "freemind.controller.Controller$LocalLinkConverter",
      "freemind.controller.Controller$HideAllAttributesAction",
      "freemind.controller.ZoomListener",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.controller.Controller$LicenseAction",
      "freemind.view.MapModule",
      "freemind.controller.Controller$OptionSelectionMechanismAction",
      "freemind.controller.MenuBar",
      "freemind.controller.actions.generated.instance.MapWindowConfigurationStorage",
      "freemind.controller.Controller$ColorTracker",
      "accessories.plugins.time.TableSorter",
      "freemind.modes.Mode",
      "freemind.controller.Controller$QuitAction",
      "freemind.extensions.NodeHookAdapter",
      "freemind.controller.ColorSwatch",
      "freemind.controller.Controller$MoveToRootAction",
      "plugins.map.MapDialog$CloseAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.extensions.MindMapHook",
      "freemind.extensions.HookAdapter",
      "freemind.controller.filter.FilterToolbar",
      "freemind.controller.Controller$PrintAction",
      "freemind.controller.Controller$CloseAction",
      "freemind.main.XMLParseException",
      "org.openstreetmap.gui.jmapviewer.JMapController",
      "freemind.view.mindmapview.MapView$ScrollPane",
      "freemind.controller.actions.generated.instance.XmlAction",
      "freemind.controller.Controller$PropertyAction",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.controller.Controller$OptionHTMLExportFoldingAction",
      "freemind.modes.MindMap",
      "freemind.controller.NodeKeyListener",
      "freemind.controller.Controller$NavigationMoveMapRightAction",
      "freemind.controller.actions.generated.instance.PlaceNodeXmlAction",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "freemind.common.TextTranslator",
      "plugins.map.Registration$NodeVisibilityListener",
      "freemind.controller.Controller$ToggleMenubarAction",
      "freemind.modes.mindmapmode.actions.NodeUpAction",
      "freemind.controller.Controller$NavigationPreviousMapAction",
      "freemind.main.FreeMindStarter",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "freemind.modes.ModeController"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Controller_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "freemind.controller.Controller",
      "freemind.controller.ColorSwatch",
      "freemind.controller.Controller$BackgroundSwatch",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.controller.Controller$HideAllAttributesAction",
      "freemind.controller.Controller$1",
      "freemind.controller.Controller$DefaultLocalLinkConverter",
      "freemind.controller.Controller$CloseAction",
      "freemind.controller.Controller$PrintAction",
      "freemind.controller.Controller$PrintPreviewAction",
      "freemind.controller.Controller$PageAction",
      "freemind.controller.Controller$QuitAction",
      "freemind.controller.Controller$AboutAction",
      "freemind.controller.Controller$OpenURLAction",
      "freemind.controller.Controller$KeyDocumentationAction",
      "freemind.controller.Controller$DocumentationAction",
      "freemind.controller.Controller$LicenseAction",
      "freemind.controller.Controller$NavigationPreviousMapAction",
      "freemind.controller.Controller$NavigationNextMapAction",
      "freemind.controller.Controller$NavigationMoveMapLeftAction",
      "freemind.controller.Controller$NavigationMoveMapRightAction",
      "freemind.controller.Controller$ShowFilterToolbarAction",
      "freemind.controller.Controller$ShowAttributeDialogAction",
      "freemind.controller.Controller$ToggleMenubarAction",
      "freemind.controller.Controller$ToggleToolbarAction",
      "freemind.controller.Controller$ToggleLeftToolbarAction",
      "freemind.controller.Controller$OptionAntialiasAction",
      "freemind.controller.Controller$OptionHTMLExportFoldingAction",
      "freemind.controller.Controller$OptionSelectionMechanismAction",
      "freemind.controller.Controller$ZoomInAction",
      "freemind.controller.Controller$ZoomOutAction",
      "freemind.controller.Controller$PropertyAction",
      "freemind.controller.Controller$ShowSelectionAsRectangleAction",
      "freemind.controller.Controller$MoveToRootAction",
      "freemind.controller.Controller$ColorTracker",
      "freemind.controller.Controller$Closer",
      "freemind.controller.Controller$DisposeOnClose",
      "freemind.controller.Controller$2",
      "freemind.controller.Controller$3",
      "freemind.controller.Controller$4",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "freemind.main.Tools",
      "freemind.modes.Mode",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "freemind.modes.browsemode.BrowseMode",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToXMLStream",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.browsemode.BrowseController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "freemind.modes.schememode.SchemeMode",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToHTMLSAXHandler",
      "freemind.modes.filemode.FileMode",
      "freemind.controller.FreeMindToolBar",
      "freemind.controller.MainToolBar",
      "freemind.modes.schememode.SchemeController",
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
      "org.apache.xml.serializer.ToTextSAXHandler",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.NodeHookAdapter",
      "freemind.extensions.PermanentNodeHookAdapter",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "plugins.map.MapNodePositionHolder",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.lib.HashMappedList",
      "org.hsqldb.store.HashIndex",
      "freemind.modes.filemode.FileController",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.modes.mindmapmode.JAutoScrollBarPane",
      "freemind.modes.mindmapmode.MindMapToolBar$1",
      "freemind.modes.mindmapmode.MindMapToolBar$2",
      "freemind.modes.mindmapmode.MindMapController",
      "org.apache.xml.serializer.EmptySerializer",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.socket.SocketBasics",
      "plugins.collaboration.socket.SocketConnectionHook",
      "plugins.collaboration.socket.MindMapClient",
      "freemind.view.mindmapview.MultipleImage",
      "org.hsqldb.lib.FileUtil",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.collaboration.database.DatabaseConnectionHook",
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
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.batik.ext.awt.image.renderable.DeferRable",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "freemind.modes.ModesCreator",
      "org.apache.xml.utils.ListingErrorHandler",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
      "org.apache.xpath.compiler.XPathParser",
      "org.apache.xpath.compiler.OpMap",
      "org.apache.xpath.compiler.Compiler",
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xpath.compiler.Lexer",
      "org.apache.xpath.compiler.OpMapVector",
      "org.apache.xpath.compiler.Keywords",
      "org.apache.xpath.axes.WalkerFactory",
      "org.apache.xpath.objects.XObject",
      "org.apache.xpath.objects.XNumber",
      "org.apache.xpath.patterns.NodeTest",
      "org.apache.xpath.axes.PredicatedNodeTest",
      "org.apache.xpath.axes.LocPathIterator",
      "org.apache.xpath.axes.ChildIterator",
      "org.apache.xpath.axes.IteratorPool",
      "org.apache.xpath.patterns.StepPattern",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "freemind.extensions.ExportHook",
      "plugins.collaboration.database.DatabaseConnector",
      "freemind.modes.mindmapmode.hooks.PermanentMindMapNodeHookAdapter",
      "accessories.plugins.ClonePlugin",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.ToTextStream",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.transformer.KeyManager",
      "org.apache.xalan.trace.TraceManager",
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
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.VariableStack",
      "org.apache.xalan.transformer.StackGuard",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "freemind.modes.mindmapmode.actions.CompoundActionHandler",
      "org.apache.batik.util.gui.resource.ResourceManager",
      "org.apache.batik.apps.svgbrowser.Main",
      "org.apache.batik.apps.svgbrowser.Main$FontSizeHandler",
      "org.apache.batik.util.ApplicationSecurityEnforcer",
      "org.apache.batik.util.PreferenceManager",
      "org.apache.batik.apps.svgbrowser.XMLPreferenceManager",
      "org.apache.batik.util.XMLResourceDescriptor",
      "org.apache.batik.apps.svgbrowser.XMLPreferenceManager$XMLProperties",
      "org.apache.batik.util.AbstractParsedURLProtocolHandler",
      "org.apache.batik.util.ParsedURLDefaultProtocolHandler",
      "org.apache.batik.Version",
      "org.apache.batik.util.ParsedURL",
      "org.apache.batik.util.ParsedURLData",
      "org.apache.batik.apps.svgbrowser.AboutDialog",
      "freemind.modes.MapAdapter",
      "freemind.modes.filemode.FileMapModel",
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
      "org.apache.xalan.templates.WhiteSpaceInfo",
      "org.apache.xalan.processor.WhitespaceInfoPaths",
      "org.apache.batik.gvt.text.ConcreteTextLayoutFactory",
      "org.apache.batik.gvt.renderer.BasicTextPainter",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.batik.gvt.renderer.StrokingTextPainter",
      "plugins.collaboration.socket.MindMapMaster",
      "org.apache.xml.utils.SAXSourceLocator",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.xml.res.XMLErrorResources_en",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.dtm.ref.CoroutineManager",
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
      "plugins.collaboration.database.DatabaseStarter",
      "org.hsqldb.rowio.RowOutputText",
      "org.hsqldb.rowio.RowOutputTextQuoted",
      "org.openstreetmap.gui.jmapviewer.Tile",
      "org.apache.crimson.tree.NodeBase",
      "org.apache.crimson.tree.ParentNode",
      "org.apache.crimson.util.MessageCatalog",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "org.apache.crimson.tree.XmlDocument",
      "org.apache.xml.serializer.ToXMLSAXHandler",
      "freemind.controller.MapModuleManager",
      "freemind.controller.MapModuleManager$MapModuleChangeObserverCompound",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerPNGEncoder",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.xalan.templates.DecimalFormatProperties",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$5",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.MoveNodeAction",
      "org.apache.batik.ext.awt.image.rendered.AbstractRed",
      "org.apache.batik.ext.awt.image.rendered.BufferedImageCachableRed",
      "freemind.modes.mindmapmode.actions.UnderlinedAction",
      "org.hsqldb.SessionManager",
      "org.hsqldb.lib.IntKeyHashMap",
      "freemind.modes.mindmapmode.actions.ToggleChildrenFoldedAction",
      "freemind.modes.MindIcon"
    );
  }
}