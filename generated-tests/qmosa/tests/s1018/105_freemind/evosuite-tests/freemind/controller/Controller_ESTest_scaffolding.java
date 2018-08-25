/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 13:16:09 GMT 2018
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
      "freemind.controller.Controller$KeyDocumentationAction",
      "freemind.controller.StructuredMenuItemHolder",
      "freemind.modes.mindmapmode.actions.EdgeColorAction",
      "freemind.controller.Controller$DefaultLocalLinkConverter",
      "freemind.controller.Controller$OptionAntialiasAction",
      "freemind.modes.mindmapmode.attributeactors.AttributeManagerDialog",
      "freemind.modes.mindmapmode.actions.NodeHookAction",
      "freemind.modes.MindMap$MapSourceChangedObserver",
      "freemind.modes.mindmapmode.actions.EdgeStyleAction",
      "freemind.modes.mindmapmode.actions.SetLinkByTextFieldAction",
      "freemind.modes.mindmapmode.actions.NodeBackgroundColorAction",
      "freemind.controller.actions.generated.instance.RemoveIconXmlAction",
      "freemind.modes.schememode.SchemeToolBar",
      "freemind.controller.NodeMouseMotionListener",
      "freemind.controller.Controller$PageAction",
      "freemind.controller.Controller$OpenURLAction",
      "freemind.modes.mindmapmode.actions.xml.ActionFactory",
      "freemind.modes.mindmapmode.actions.UsePlainTextAction",
      "freemind.modes.mindmapmode.actions.SingleNodeOperation",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.controller.MenuItemSelectedListener",
      "freemind.modes.mindmapmode.MindMapMapModel",
      "org.jibx.runtime.IMarshallable",
      "freemind.view.mindmapview.MapView",
      "freemind.extensions.NodeHook",
      "freemind.modes.mindmapmode.actions.xml.ActionHandler",
      "freemind.controller.MapMouseMotionListener$MapMouseMotionReceiver",
      "freemind.modes.mindmapmode.actions.FontSizeAction",
      "freemind.controller.MenuItemEnabledListener",
      "freemind.controller.MapModuleManager$MapTitleChangeListener",
      "freemind.controller.Controller$ShowSelectionAsRectangleAction",
      "freemind.modes.mindmapmode.actions.xml.ActorXml",
      "freemind.modes.FreeMindAwtFileDialog",
      "freemind.modes.mindmapmode.actions.IconAction",
      "freemind.controller.Controller$NavigationNextMapAction",
      "freemind.main.XMLElement",
      "freemind.modes.mindmapmode.actions.RedoAction",
      "freemind.modes.FreeMindFileDialog",
      "freemind.modes.mindmapmode.actions.xml.ActionPair",
      "org.jibx.runtime.IUnmarshallable",
      "freemind.modes.mindmapmode.actions.EdgeWidthAction",
      "freemind.modes.mindmapmode.actions.RevertAction",
      "freemind.controller.NodeMotionListener$NodeMotionAdapter",
      "freemind.modes.IconInformation",
      "freemind.controller.Controller$DisposeOnClose",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "freemind.controller.Controller$ZoomInAction",
      "freemind.modes.MindMapNode",
      "freemind.controller.MapMouseWheelListener",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.schememode.SchemeMode",
      "freemind.modes.mindmapmode.attributeactors.AttributesListener",
      "freemind.modes.ModesCreator",
      "freemind.modes.mindmapmode.actions.ItalicAction",
      "freemind.controller.Controller$PrintPreviewAction",
      "freemind.modes.mindmapmode.actions.NewChildAction",
      "freemind.controller.actions.generated.instance.NodeAction",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.modes.XMLElementAdapter",
      "freemind.controller.MapModuleManager$MapTitleContributor",
      "freemind.modes.mindmapmode.actions.HookAction",
      "freemind.modes.common.CommonNodeKeyListener$EditHandler",
      "freemind.controller.MainToolBar",
      "freemind.controller.MapModuleManager",
      "freemind.modes.mindmapmode.actions.CutAction",
      "freemind.main.FreeMindStarter$ProxyAuthenticator",
      "freemind.modes.mindmapmode.actions.CopyAction",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.modes.mindmapmode.actions.DeleteChildAction",
      "freemind.controller.Controller$Closer",
      "freemind.controller.Controller$HideAllAttributesAction",
      "freemind.modes.mindmapmode.actions.RemoveAllIconsAction",
      "freemind.view.MapModule",
      "freemind.controller.actions.generated.instance.AddIconAction",
      "freemind.controller.Controller$OptionSelectionMechanismAction",
      "freemind.modes.mindmapmode.actions.ChangeArrowLinkEndPoints",
      "freemind.modes.mindmapmode.actions.CloudAction",
      "freemind.modes.Mode",
      "freemind.controller.Controller$QuitAction",
      "freemind.modes.mindmapmode.actions.ImportExplorerFavoritesAction",
      "freemind.controller.filter.FilterToolbar",
      "freemind.controller.Controller$CloseAction",
      "freemind.main.ExampleFileFilter",
      "freemind.main.XMLParseException",
      "freemind.modes.mindmapmode.actions.RemoveIconAction",
      "freemind.controller.actions.generated.instance.XmlAction",
      "freemind.controller.Controller$PropertyAction",
      "freemind.modes.mindmapmode.actions.JoinNodesAction",
      "freemind.controller.NodeKeyListener",
      "freemind.controller.Controller$OptionHTMLExportFoldingAction",
      "freemind.controller.actions.generated.instance.MenuStructure",
      "freemind.modes.mindmapmode.actions.BoldAction",
      "freemind.modes.mindmapmode.actions.SelectBranchAction",
      "freemind.common.TextTranslator",
      "freemind.modes.mindmapmode.MindMapController$NewNodeCreator",
      "freemind.modes.mindmapmode.actions.ToggleChildrenFoldedAction",
      "freemind.controller.Controller$ShowAttributeDialogAction",
      "freemind.modes.MapAdapter",
      "freemind.modes.mindmapmode.actions.AddArrowLinkAction",
      "freemind.controller.StructuredMenuHolder$MenuAdderCreator",
      "freemind.controller.actions.generated.instance.CompoundAction",
      "freemind.controller.Controller$BackgroundSwatch",
      "freemind.modes.NodeDownAction",
      "freemind.modes.common.actions.FindAction",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.controller.NodeDropListener",
      "org.jibx.runtime.JiBXException",
      "freemind.controller.StructuredMenuHolder$MenuEventSupplier",
      "freemind.modes.mindmapmode.actions.RemoveArrowLinkAction",
      "freemind.modes.mindmapmode.actions.PasteAction",
      "freemind.modes.common.actions.FindAction$FindNextAction",
      "freemind.main.FreeMindMain",
      "freemind.preferences.layout.OptionPanel$OptionPanelFeedback",
      "freemind.extensions.HookFactory",
      "freemind.controller.actions.generated.instance.EditNoteToNodeAction",
      "freemind.controller.MapMouseMotionListener",
      "freemind.preferences.FreemindPropertyListener",
      "freemind.modes.mindmapmode.actions.NodeColorAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.listeners.MindMapNodeMotionListener",
      "freemind.controller.StructuredMenuHolder$MapTokenPair",
      "freemind.modes.mindmapmode.actions.EditAction",
      "freemind.modes.mindmapmode.actions.ToggleFoldedAction",
      "freemind.modes.mindmapmode.actions.ApplyPatternAction",
      "freemind.modes.mindmapmode.actions.NodeColorBlendAction",
      "freemind.controller.LastOpenedList",
      "freemind.controller.Controller$ToggleToolbarAction",
      "freemind.modes.NodeAdapter",
      "freemind.modes.FreeMindJFileDialog",
      "freemind.controller.Controller$ToggleLeftToolbarAction",
      "freemind.modes.mindmapmode.attributeactors.AssignAttributeDialog",
      "freemind.controller.Controller$NavigationMoveMapLeftAction",
      "freemind.controller.actions.generated.instance.TextNodeAction",
      "freemind.modes.mindmapmode.actions.CompoundActionHandler",
      "freemind.modes.mindmapmode.actions.MindMapActions",
      "freemind.modes.mindmapmode.actions.FontFamilyAction",
      "freemind.controller.FreeMindPopupMenu",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.ColorArrowLinkAction",
      "freemind.modes.mindmapmode.actions.ChangeArrowsInArrowLinkAction",
      "freemind.controller.Controller$AboutAction",
      "freemind.modes.attributes.AttributeController",
      "tests.freemind.FreeMindMainMock",
      "freemind.controller.NodeDragListener",
      "freemind.common.NamedObject",
      "freemind.modes.mindmapmode.attributeactors.MindMapModeAttributeController",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "freemind.controller.Controller",
      "freemind.controller.filter.FilterController",
      "freemind.controller.Controller$DocumentationAction",
      "freemind.modes.ControllerAdapter",
      "freemind.controller.Controller$ShowFilterToolbarAction",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "freemind.modes.mindmapmode.actions.MoveNodeAction",
      "freemind.modes.mindmapmode.actions.NodeActorXml",
      "freemind.modes.common.GotoLinkNodeAction",
      "freemind.modes.mindmapmode.actions.CloudColorAction",
      "freemind.controller.Controller$ZoomOutAction",
      "freemind.modes.mindmapmode.actions.UseRichFormattingAction",
      "freemind.controller.NodeMotionListener",
      "freemind.main.Resources",
      "freemind.controller.Controller$LocalLinkConverter",
      "freemind.modes.mindmapmode.actions.NodeBackgroundColorAction$RemoveNodeBackgroundColorAction",
      "freemind.controller.ZoomListener",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.controller.Controller$LicenseAction",
      "freemind.modes.mindmapmode.actions.UndoAction",
      "freemind.modes.mindmapmode.actions.UnderlinedAction",
      "freemind.controller.Controller$ColorTracker",
      "freemind.controller.ColorSwatch",
      "freemind.modes.mindmapmode.actions.AddLocalLinkAction",
      "freemind.controller.Controller$MoveToRootAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.extensions.MindMapHook",
      "freemind.controller.StructuredMenuHolder$MenuAdder",
      "freemind.controller.Controller$PrintAction",
      "freemind.modes.mindmapmode.MindMapPopupMenu",
      "freemind.modes.mindmapmode.actions.PasteAsPlainTextAction",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.modes.MindMap",
      "freemind.modes.mindmapmode.actions.NodeStyleAction",
      "freemind.controller.Controller$NavigationMoveMapRightAction",
      "freemind.controller.NodeMouseMotionListener$NodeMouseMotionObserver",
      "freemind.controller.StructuredMenuHolder",
      "freemind.modes.mindmapmode.actions.ImportFolderStructureAction",
      "freemind.controller.Controller$ToggleMenubarAction",
      "freemind.modes.mindmapmode.actions.NodeUpAction",
      "freemind.modes.mindmapmode.actions.SelectAllAction",
      "freemind.controller.Controller$NavigationPreviousMapAction",
      "freemind.main.FreeMindStarter",
      "freemind.modes.ModeController",
      "freemind.modes.mindmapmode.MindMapXMLElement",
      "freemind.modes.mindmapmode.MindMapController$MindMapFilter"
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
      "freemind.extensions.HookAdapter",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.modes.mindmapmode.JAutoScrollBarPane",
      "freemind.modes.mindmapmode.MindMapToolBar$1",
      "freemind.modes.mindmapmode.MindMapToolBar$2",
      "freemind.modes.filemode.FileMode",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.browsemode.BrowseController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "freemind.modes.schememode.SchemeMode",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "freemind.modes.schememode.SchemeController",
      "org.apache.xml.serializer.EmptySerializer",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xml.utils.ListingErrorHandler",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
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
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xpath.patterns.StepPattern",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToTextStream",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.transformer.KeyManager",
      "org.apache.xml.utils.BoolStack",
      "org.apache.xml.utils.DefaultErrorHandler",
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
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "freemind.extensions.NodeHookAdapter",
      "freemind.extensions.PermanentNodeHookAdapter",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "plugins.map.MapNodePositionHolder",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.xalan.res.XSLTErrorResources_en",
      "org.apache.xalan.templates.WhiteSpaceInfo",
      "org.apache.xalan.processor.WhitespaceInfoPaths",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.database.DatabaseBasics",
      "plugins.collaboration.database.DatabaseConnectionHook",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$5",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "freemind.controller.MapModuleManager",
      "freemind.controller.MapModuleManager$MapModuleChangeObserverCompound",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "freemind.modes.ModesCreator",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "plugins.collaboration.database.DatabaseConnector",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToHTMLSAXHandler",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.hsqldb.lib.FileUtil",
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
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.ToXMLStream",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.xml.serializer.ToTextSAXHandler",
      "plugins.collaboration.socket.SocketBasics",
      "plugins.collaboration.socket.SocketConnectionHook",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerPNGEncoder",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SVGIDGenerator",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.xml.serializer.ToXMLSAXHandler",
      "freemind.modes.filemode.FileController",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "org.apache.batik.gvt.RootGraphicsNode",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
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
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "freemind.controller.MainToolBar",
      "org.apache.batik.bridge.AbstractSVGBridge",
      "org.apache.batik.bridge.AbstractGraphicsNodeBridge",
      "org.apache.batik.bridge.SVGUseElementBridge",
      "org.apache.fop.svg.PDFGraphics2D",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.batik.ext.awt.TranscodingHintKey",
      "org.apache.batik.ext.awt.AreaOfInterestHintKey",
      "org.apache.batik.ext.awt.BufferedImageHintKey",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.batik.ext.awt.AvoidTilingHintKey",
      "org.apache.batik.ext.awt.RenderingHintsKeyExt",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "plugins.collaboration.socket.MindMapClient",
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
      "plugins.collaboration.socket.MindMapMaster",
      "plugins.collaboration.database.DatabaseStarter",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.xml.res.XMLErrorResources_en",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "freemind.modes.mindmapmode.hooks.PermanentMindMapNodeHookAdapter",
      "accessories.plugins.ClonePlugin",
      "org.apache.batik.gvt.text.TextPaintInfo",
      "org.apache.batik.util.AbstractParsedURLProtocolHandler",
      "org.apache.batik.util.ParsedURLDefaultProtocolHandler",
      "org.apache.batik.Version",
      "org.apache.batik.util.ParsedURL",
      "org.apache.batik.util.ParsedURLData",
      "org.apache.batik.util.ParsedURLDataProtocolHandler",
      "org.apache.batik.util.ParsedURLJarProtocolHandler",
      "org.apache.batik.util.Service",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "org.apache.batik.svggen.SVGShape",
      "org.apache.batik.svggen.SVGArc",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.batik.svggen.SVGLine",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.svggen.SVGPolygon",
      "org.apache.batik.svggen.SVGRectangle",
      "org.apache.batik.svggen.DOMTreeManager",
      "freemind.extensions.ExportHook",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.rowio.RowInputTextLog",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.Tokenizer",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "freemind.modes.NodeDownAction",
      "freemind.controller.BlindIcon",
      "freemind.controller.StructuredMenuHolder",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.FontFamilyAction",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFPage",
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
      "freemind.modes.mindmapmode.actions.ToggleFoldedAction",
      "org.apache.xalan.transformer.XalanTransformState",
      "freemind.modes.mindmapmode.actions.SelectAllAction",
      "freemind.modes.mindmapmode.actions.SelectAllAction$1",
      "org.apache.batik.util.gui.resource.ResourceManager",
      "org.apache.batik.apps.svgbrowser.Main",
      "org.apache.batik.apps.svgbrowser.Main$FontSizeHandler",
      "org.apache.batik.util.ApplicationSecurityEnforcer",
      "org.apache.batik.util.PreferenceManager",
      "org.apache.batik.apps.svgbrowser.XMLPreferenceManager",
      "org.apache.batik.util.XMLResourceDescriptor",
      "org.apache.batik.apps.svgbrowser.XMLPreferenceManager$XMLProperties",
      "org.apache.batik.apps.svgbrowser.AboutDialog",
      "org.apache.xml.utils.XMLStringDefault",
      "org.apache.xml.utils.XMLStringFactoryDefault",
      "org.apache.xml.dtm.ref.DTMDocumentImpl",
      "org.apache.xml.dtm.ref.ChunkedIntArray",
      "org.apache.xml.dtm.ref.ChunkedIntArray$ChunksVector",
      "org.apache.xml.utils.FastStringBuffer",
      "org.apache.xml.dtm.ref.DTMStringPool",
      "freemind.modes.MindIcon",
      "freemind.modes.attributes.NodeAttributeTableModel",
      "freemind.modes.NodeAdapter",
      "freemind.modes.browsemode.BrowseNodeModel",
      "freemind.controller.filter.FilterInfo",
      "freemind.controller.StructuredMenuItemHolder",
      "freemind.controller.StructuredMenuHolder$MapTokenPair"
    );
  }
}
