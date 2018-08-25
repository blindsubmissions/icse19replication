/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 10:17:35 GMT 2018
 */

package net.sf.xbus.protocol.records;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RecordTypeMessage_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sf.xbus.protocol.records.RecordTypeMessage"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/83_xbus"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RecordTypeMessage_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.xbus.base.bytearraylist.ByteArrayList",
      "net.sf.xbus.base.core.config.Configuration",
      "org.apache.html.dom.HTMLLinkElementImpl",
      "org.apache.html.dom.HTMLPreElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDConstants",
      "org.apache.html.dom.ObjectFactory",
      "org.apache.axis.deployment.wsdd.WSDDDeployment",
      "org.apache.wml.dom.WMLEmElementImpl",
      "org.apache.axis.constants.Style$Type",
      "org.apache.axis.InternalException",
      "org.apache.wml.dom.WMLPrevElementImpl",
      "org.apache.wml.WMLUElement",
      "org.apache.html.dom.HTMLTextAreaElementImpl",
      "org.apache.wml.WMLIElement",
      "org.apache.html.dom.HTMLHeadingElementImpl",
      "org.apache.html.dom.HTMLLIElementImpl",
      "net.sf.xbus.protocol.TextMessage",
      "org.apache.html.dom.HTMLFrameSetElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDDeployableItem",
      "org.apache.axis.encoding.TypeMappingRegistry",
      "org.apache.wml.dom.WMLAccessElementImpl",
      "org.apache.html.dom.HTMLBodyElementImpl",
      "org.apache.wml.dom.WMLHeadElementImpl",
      "org.apache.wml.WMLCardElement",
      "org.apache.wml.WMLOneventElement",
      "org.apache.html.dom.HTMLTableSectionElementImpl",
      "org.apache.wml.WMLNoopElement",
      "org.apache.wml.WMLBrElement",
      "org.apache.axis.encoding.SerializationContext",
      "org.apache.html.dom.HTMLHeadElementImpl",
      "org.apache.axis.ConfigurationException",
      "org.apache.wml.dom.WMLNoopElementImpl",
      "org.apache.wml.dom.WMLOptionElementImpl",
      "org.apache.axis.soap.SOAP12Constants",
      "org.apache.html.dom.HTMLElementImpl",
      "net.sf.xbus.protocol.Message",
      "org.apache.axis.constants.Enum$Type",
      "org.apache.wml.WMLElement",
      "org.apache.wml.WMLAElement",
      "org.apache.wml.dom.WMLImgElementImpl",
      "org.apache.html.dom.HTMLScriptElementImpl",
      "org.apache.axis.description.ServiceDesc",
      "org.apache.html.dom.HTMLBaseElementImpl",
      "org.apache.wml.WMLTimerElement",
      "org.apache.html.dom.HTMLMenuElementImpl",
      "org.apache.axis.SimpleTargetedChain",
      "org.apache.html.dom.HTMLFormControl",
      "org.apache.wml.dom.WMLSetvarElementImpl",
      "org.apache.axis.constants.Enum",
      "org.apache.wml.WMLBigElement",
      "org.apache.axis.deployment.wsdd.WSDDOperation",
      "org.apache.html.dom.HTMLOptionElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDChain",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "org.apache.wml.dom.WMLSelectElementImpl",
      "org.apache.html.dom.HTMLDirectoryElementImpl",
      "org.apache.html.dom.HTMLTableCaptionElementImpl",
      "net.sf.xbus.base.core.Constants",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "org.apache.html.dom.HTMLFormElementImpl",
      "org.apache.wml.WMLDoElement",
      "org.apache.html.dom.HTMLSelectElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDNonFatalException",
      "org.apache.html.dom.HTMLAppletElementImpl",
      "net.sf.xbus.base.core.bytearrays.XByteArraySupport",
      "org.apache.axis.constants.Style",
      "org.apache.wml.dom.WMLPostfieldElementImpl",
      "org.apache.wml.dom.WMLRefreshElementImpl",
      "org.apache.wml.WMLWmlElement",
      "org.apache.wml.WMLTdElement",
      "org.apache.html.dom.HTMLStyleElementImpl",
      "org.apache.wml.WMLMetaElement",
      "org.apache.html.dom.HTMLHtmlElementImpl",
      "org.apache.html.dom.HTMLImageElementImpl",
      "org.apache.wml.dom.WMLMetaElementImpl",
      "net.sf.xbus.protocol.XMLMessage",
      "org.apache.html.dom.HTMLAnchorElementImpl",
      "org.apache.html.dom.HTMLMapElementImpl",
      "org.apache.wml.dom.WMLInputElementImpl",
      "org.apache.wml.dom.WMLBrElementImpl",
      "org.apache.axis.description.JavaServiceDesc",
      "org.apache.wml.dom.WMLOneventElementImpl",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.axis.handlers.BasicHandler",
      "org.apache.axis.constants.Use$Type",
      "org.apache.html.dom.HTMLUListElementImpl",
      "net.sf.xbus.base.xbussystem.XBUSSystem",
      "org.apache.html.dom.ObjectFactory$ConfigurationError",
      "org.apache.wml.dom.WMLWmlElementImpl",
      "org.apache.wml.WMLInputElement",
      "org.apache.wml.WMLPrevElement",
      "org.apache.html.dom.HTMLLabelElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDTypeMappingContainer",
      "org.apache.wml.WMLAnchorElement",
      "org.apache.axis.AxisFault",
      "org.apache.html.dom.HTMLTableColElementImpl",
      "org.apache.wml.WMLAccessElement",
      "org.apache.axis.deployment.wsdd.WSDDFaultFlow",
      "org.apache.axis.schema.SchemaVersion2001",
      "org.apache.axis.EngineConfiguration",
      "org.apache.html.dom.HTMLAreaElementImpl",
      "org.apache.axis.schema.SchemaVersion",
      "org.apache.wml.WMLTrElement",
      "org.apache.wml.WMLFieldsetElement",
      "org.apache.wml.WMLRefreshElement",
      "org.apache.wml.WMLOptgroupElement",
      "org.apache.axis.handlers.soap.SOAPService",
      "org.apache.axis.constants.Use",
      "org.apache.axis.soap.SOAPConstants",
      "org.apache.axis.schema.SchemaVersion2000",
      "org.apache.wml.WMLTableElement",
      "org.apache.wml.dom.WMLCardElementImpl",
      "org.apache.wml.WMLHeadElement",
      "org.apache.wml.dom.WMLAnchorElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDTargetedChain",
      "org.apache.wml.dom.WMLTrElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDRequestFlow",
      "org.apache.wml.dom.WMLStrongElementImpl",
      "org.apache.html.dom.HTMLHRElementImpl",
      "org.apache.wml.WMLPostfieldElement",
      "org.apache.html.dom.HTMLOptGroupElementImpl",
      "org.apache.wml.WMLDocument",
      "org.apache.axis.deployment.wsdd.WSDDElement",
      "org.apache.wml.dom.WMLUElementImpl",
      "org.apache.wml.WMLOptionElement",
      "org.apache.wml.dom.WMLBElementImpl",
      "org.apache.wml.dom.WMLTableElementImpl",
      "org.apache.wml.WMLPElement",
      "org.apache.html.dom.HTMLTableRowElementImpl",
      "org.apache.html.dom.HTMLButtonElementImpl",
      "org.apache.html.dom.HTMLModElementImpl",
      "org.apache.wml.WMLSmallElement",
      "org.apache.html.dom.HTMLDListElementImpl",
      "org.apache.axis.components.logger.LogFactory$1",
      "net.sf.xbus.base.core.trace.Trace",
      "org.apache.axis.Handler",
      "org.apache.wml.dom.WMLDocumentImpl",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.html.dom.HTMLBRElementImpl",
      "org.apache.html.dom.HTMLIFrameElementImpl",
      "org.apache.wml.dom.WMLIElementImpl",
      "org.apache.axis.SimpleChain",
      "org.apache.axis.WSDDEngineConfiguration",
      "org.apache.html.dom.HTMLTableElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDHandler",
      "org.apache.html.dom.HTMLLegendElementImpl",
      "org.apache.wml.WMLGoElement",
      "org.apache.wml.dom.WMLTimerElementImpl",
      "org.apache.html.dom.HTMLFontElementImpl",
      "org.apache.wml.WMLEmElement",
      "org.apache.html.dom.HTMLQuoteElementImpl",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.axis.deployment.wsdd.WSDDService",
      "org.apache.wml.WMLStrongElement",
      "org.apache.axis.schema.SchemaVersion1999",
      "org.apache.html.dom.HTMLParamElementImpl",
      "org.apache.wml.dom.WMLDoElementImpl",
      "org.apache.axis.utils.LockableHashtable",
      "org.apache.axis.deployment.wsdd.WSDDTypeMapping",
      "org.apache.wml.dom.WMLSmallElementImpl",
      "org.apache.wml.dom.WMLGoElementImpl",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.wml.WMLImgElement",
      "net.sf.xbus.protocol.ObjectMessage",
      "org.apache.html.dom.HTMLFieldSetElementImpl",
      "org.apache.html.dom.HTMLTableCellElementImpl",
      "org.apache.wml.WMLSetvarElement",
      "org.apache.wml.WMLSelectElement",
      "org.apache.wml.WMLTemplateElement",
      "org.apache.wml.dom.WMLTemplateElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDException",
      "org.apache.wml.dom.WMLFieldsetElementImpl",
      "org.apache.wml.dom.WMLBigElementImpl",
      "net.sf.xbus.protocol.records.RecordTypeMessage",
      "org.apache.html.dom.HTMLDivElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDResponseFlow",
      "org.apache.wml.dom.WMLOptgroupElementImpl",
      "net.sf.xbus.base.core.MessageHandler$MessagesFilter",
      "org.apache.html.dom.HTMLMetaElementImpl",
      "net.sf.xbus.base.core.MessageHandler",
      "org.apache.axis.Chain",
      "org.apache.axis.deployment.wsdd.WSDDJAXRPCHandlerInfoChain",
      "org.apache.html.dom.HTMLInputElementImpl",
      "org.apache.axis.TargetedChain",
      "org.apache.html.dom.HTMLOListElementImpl",
      "org.apache.wml.dom.WMLAElementImpl",
      "org.apache.wml.dom.WMLPElementImpl",
      "net.sf.xbus.base.core.config.ConfigSource",
      "org.apache.html.dom.HTMLIsIndexElementImpl",
      "org.apache.wml.dom.WMLElementImpl",
      "net.sf.xbus.base.core.XException",
      "org.apache.wml.dom.WMLTdElementImpl",
      "org.apache.axis.encoding.TypeMapping",
      "org.apache.html.dom.HTMLParagraphElementImpl",
      "org.apache.html.dom.HTMLTitleElementImpl",
      "org.apache.wml.WMLBElement",
      "net.sf.xbus.protocol.xml.XMLMessageAbstract",
      "net.sf.xbus.base.xml.XMLHelper",
      "org.apache.html.dom.HTMLBaseFontElementImpl",
      "org.apache.axis.Constants"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RecordTypeMessage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sf.xbus.protocol.Message",
      "net.sf.xbus.protocol.xml.XMLMessageAbstract",
      "net.sf.xbus.protocol.records.RecordTypeMessage",
      "net.sf.xbus.protocol.records.RecordTypeManipulator",
      "net.sf.xbus.protocol.records.RecordTypeParser",
      "net.sf.xbus.protocol.records.RecordTypeSerializer",
      "net.sf.xbus.base.xbussystem.XBUSSystem",
      "net.sf.xbus.base.core.config.Configuration",
      "net.sf.xbus.base.core.Constants",
      "org.apache.axis.deployment.wsdd.WSDDConstants",
      "org.apache.axis.deployment.wsdd.WSDDElement",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.axis.deployment.wsdd.WSDDDeployableItem",
      "org.apache.axis.deployment.wsdd.WSDDHandler",
      "org.apache.axis.deployment.wsdd.WSDDChain",
      "org.apache.axis.deployment.wsdd.WSDDResponseFlow",
      "org.apache.axis.deployment.wsdd.WSDDRequestFlow",
      "org.apache.axis.deployment.wsdd.WSDDGlobalConfiguration",
      "org.apache.axis.deployment.wsdd.WSDDJAXRPCHandlerInfoChain",
      "org.apache.axis.configuration.SimpleProvider",
      "net.sf.xbus.base.xml.XMLHelper",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.utils.Mapping",
      "org.apache.axis.message.MessageElement",
      "org.apache.axis.message.RPCParam",
      "org.apache.axis.message.NullAttributes",
      "org.apache.axis.message.SOAPDocumentImpl",
      "org.apache.axis.utils.XMLUtils$ThreadLocalDocumentBuilder",
      "org.apache.axis.AxisProperties",
      "org.apache.commons.discovery.tools.ManagedProperties",
      "org.apache.commons.discovery.jdk.JDK12Hooks",
      "org.apache.commons.discovery.jdk.JDKHooks",
      "org.apache.commons.discovery.tools.ManagedProperties$1",
      "org.apache.axis.utils.XMLUtils",
      "org.apache.axis.message.Text",
      "org.apache.axis.message.SOAPBodyElement",
      "org.apache.axis.message.NamedNodeMapImpl",
      "org.apache.axis.message.NodeListImpl",
      "org.apache.axis.ConfigurationException",
      "org.apache.axis.deployment.wsdd.WSDDException",
      "org.apache.axis.i18n.ProjectResourceBundle",
      "org.apache.axis.i18n.ProjectResourceBundle$Context",
      "org.apache.axis.i18n.MessagesConstants",
      "org.apache.axis.i18n.MessageBundle",
      "org.apache.axis.utils.Messages",
      "org.apache.axis.utils.JavaUtils",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.html.dom.ObjectFactory",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLOListElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDTargetedChain",
      "org.apache.axis.deployment.wsdd.WSDDService",
      "net.sf.xbus.base.core.XException",
      "net.sf.xbus.base.core.MessageHandler",
      "net.sf.xbus.base.core.MessageHandler$MessagesFilter",
      "net.sf.xbus.base.core.trace.Trace",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.axis.soap.SOAP12Constants",
      "org.apache.axis.soap.SOAPConstants",
      "org.apache.axis.message.SOAPEnvelope",
      "org.apache.axis.schema.SchemaVersion1999",
      "org.apache.axis.schema.SchemaVersion2000",
      "org.apache.axis.schema.SchemaVersion2001",
      "org.apache.axis.schema.SchemaVersion",
      "org.apache.axis.message.SOAPHeader",
      "org.apache.axis.message.SOAPBody",
      "org.apache.axis.message.PrefixedQName",
      "org.apache.html.dom.HTMLOptGroupElementImpl",
      "org.apache.axis.constants.Enum",
      "org.apache.axis.constants.Enum$Type",
      "org.apache.axis.constants.Style$Type",
      "org.apache.axis.constants.Style",
      "org.apache.axis.constants.Use$Type",
      "org.apache.axis.Constants",
      "org.apache.axis.constants.Use",
      "org.apache.axis.description.JavaServiceDesc",
      "net.sf.xbus.base.bytearraylist.ByteArrayList",
      "org.apache.html.dom.HTMLAnchorElementImpl",
      "net.sf.xbus.base.core.bytearrays.XByteArraySupport",
      "org.apache.html.dom.HTMLHeadingElementImpl",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDDeployment",
      "org.apache.axis.encoding.TypeMappingRegistryImpl",
      "org.apache.axis.encoding.TypeMappingImpl",
      "org.apache.axis.encoding.DefaultTypeMappingImpl",
      "org.apache.axis.utils.ClassUtils",
      "org.apache.axis.utils.ClassUtils$2",
      "org.apache.axis.encoding.ser.BaseFactory",
      "org.apache.axis.encoding.ser.BaseSerializerFactory",
      "org.apache.axis.encoding.ser.JAFDataHandlerSerializerFactory",
      "org.apache.axis.encoding.ser.JAFDataHandlerSerializer",
      "org.apache.axis.encoding.ser.PlainTextDataHandlerSerializer",
      "org.apache.axis.encoding.ser.BaseDeserializerFactory",
      "org.apache.axis.encoding.ser.JAFDataHandlerDeserializerFactory",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.axis.encoding.DeserializerImpl",
      "org.apache.axis.encoding.ser.JAFDataHandlerDeserializer",
      "org.apache.axis.encoding.ser.PlainTextDataHandlerDeserializer",
      "org.apache.axis.encoding.TypeMappingImpl$Pair",
      "org.apache.axis.types.HexBinary",
      "org.apache.axis.encoding.ser.HexSerializerFactory",
      "org.apache.axis.encoding.ser.HexSerializer",
      "org.apache.axis.encoding.ser.HexDeserializerFactory",
      "org.apache.axis.encoding.ser.SimpleDeserializer",
      "org.apache.axis.encoding.ser.HexDeserializer",
      "org.apache.axis.encoding.ser.ArraySerializerFactory",
      "org.apache.axis.encoding.ser.ArraySerializer",
      "org.apache.axis.encoding.ser.Base64SerializerFactory",
      "org.apache.axis.encoding.ser.Base64Serializer",
      "org.apache.axis.encoding.ser.Base64DeserializerFactory",
      "org.apache.axis.encoding.ser.Base64Deserializer",
      "org.apache.axis.encoding.ser.SimpleSerializerFactory",
      "org.apache.axis.encoding.ser.SimpleSerializer",
      "org.apache.axis.encoding.ser.SimpleDeserializerFactory",
      "org.apache.axis.encoding.ser.QNameSerializerFactory",
      "org.apache.axis.encoding.ser.QNameSerializer",
      "org.apache.axis.encoding.ser.QNameDeserializerFactory",
      "org.apache.axis.encoding.ser.QNameDeserializer",
      "org.apache.axis.encoding.ser.DateSerializerFactory",
      "org.apache.axis.encoding.ser.DateSerializer",
      "org.apache.axis.encoding.ser.DateDeserializerFactory",
      "org.apache.axis.encoding.ser.DateDeserializer",
      "org.apache.axis.types.Time",
      "org.apache.axis.types.Day",
      "org.apache.axis.types.Duration",
      "org.apache.axis.types.NormalizedString",
      "org.apache.axis.types.Token",
      "org.apache.axis.types.Name",
      "org.apache.axis.types.NCName",
      "org.apache.axis.types.Entities",
      "org.apache.axis.types.Entity",
      "org.apache.axis.types.Id",
      "org.apache.axis.types.IDRef",
      "org.apache.axis.types.IDRefs",
      "org.apache.axis.types.Language",
      "org.apache.axis.types.Month",
      "org.apache.axis.types.MonthDay",
      "org.apache.axis.types.NonPositiveInteger",
      "org.apache.axis.types.NegativeInteger",
      "org.apache.axis.types.NMToken",
      "org.apache.axis.types.NMTokens",
      "org.apache.axis.types.NonNegativeInteger",
      "org.apache.axis.types.PositiveInteger",
      "org.apache.axis.types.YearMonth",
      "org.apache.axis.types.UnsignedInt",
      "org.apache.axis.types.UnsignedShort",
      "org.apache.axis.types.UnsignedByte",
      "org.apache.axis.types.UnsignedLong",
      "org.apache.axis.types.URI",
      "org.apache.axis.types.Year",
      "org.apache.axis.encoding.ser.MapSerializerFactory",
      "org.apache.axis.encoding.ser.MapSerializer",
      "org.apache.axis.encoding.ser.MapDeserializerFactory",
      "org.apache.axis.encoding.ser.MapDeserializer",
      "org.apache.axis.encoding.ser.ElementSerializerFactory",
      "org.apache.axis.encoding.ser.ElementSerializer",
      "org.apache.axis.encoding.ser.ElementDeserializerFactory",
      "org.apache.axis.encoding.ser.ElementDeserializer",
      "org.apache.axis.encoding.ser.DocumentSerializerFactory",
      "org.apache.axis.encoding.ser.DocumentSerializer",
      "org.apache.axis.encoding.ser.DocumentDeserializerFactory",
      "org.apache.axis.encoding.ser.DocumentDeserializer",
      "org.apache.axis.encoding.ser.VectorSerializerFactory",
      "org.apache.axis.encoding.ser.VectorSerializer",
      "org.apache.axis.encoding.ser.VectorDeserializerFactory",
      "org.apache.axis.encoding.ser.VectorDeserializer",
      "org.apache.axis.encoding.ser.ImageDataHandlerSerializer",
      "org.apache.axis.encoding.ser.ImageDataHandlerDeserializer",
      "org.apache.axis.encoding.ser.MimeMultipartDataHandlerSerializer",
      "org.apache.axis.encoding.ser.MimeMultipartDataHandlerDeserializer",
      "org.apache.axis.encoding.ser.SourceDataHandlerSerializer",
      "org.apache.axis.encoding.ser.SourceDataHandlerDeserializer",
      "org.apache.axis.attachments.OctetStream",
      "org.apache.axis.encoding.ser.OctetStreamDataHandlerSerializer",
      "org.apache.axis.encoding.ser.OctetStreamDataHandlerDeserializer",
      "org.apache.axis.description.TypeDesc",
      "org.apache.axis.description.FieldDesc",
      "org.apache.axis.description.AttributeDesc",
      "org.apache.axis.description.ElementDesc",
      "org.apache.axis.types.Notation",
      "org.apache.axis.encoding.ser.BeanSerializerFactory",
      "org.apache.axis.encoding.ser.BeanSerializer",
      "org.apache.axis.utils.cache.MethodCache",
      "org.apache.axis.utils.cache.MethodCache$MethodKey",
      "org.apache.axis.utils.BeanUtils",
      "org.apache.axis.utils.BeanUtils$1",
      "org.apache.axis.AxisFault",
      "org.apache.axis.utils.BeanPropertyDescriptor",
      "org.apache.axis.encoding.ser.BeanDeserializerFactory",
      "org.apache.axis.encoding.ser.BeanDeserializer",
      "org.apache.axis.types.Schema",
      "org.apache.axis.encoding.ser.ArrayDeserializerFactory",
      "org.apache.axis.encoding.ser.ArrayDeserializer",
      "org.apache.axis.encoding.ser.CalendarSerializerFactory",
      "org.apache.axis.encoding.ser.CalendarSerializer",
      "org.apache.axis.encoding.ser.CalendarDeserializerFactory",
      "org.apache.axis.encoding.ser.CalendarDeserializer",
      "org.apache.axis.encoding.TypeMappingDelegate",
      "org.apache.axis.encoding.DefaultSOAPEncodingTypeMappingImpl",
      "org.apache.axis.message.MimeHeaders",
      "org.apache.axis.Message",
      "org.apache.axis.attachments.AttachmentsImpl",
      "org.apache.axis.SOAPPart",
      "org.apache.axis.utils.SessionUtils",
      "org.apache.wml.dom.WMLElementImpl",
      "org.apache.wml.dom.WMLBElementImpl",
      "org.apache.wml.dom.WMLNoopElementImpl",
      "org.apache.wml.dom.WMLAElementImpl",
      "org.apache.wml.dom.WMLSetvarElementImpl",
      "org.apache.wml.dom.WMLAccessElementImpl",
      "org.apache.wml.dom.WMLStrongElementImpl",
      "org.apache.wml.dom.WMLPostfieldElementImpl",
      "org.apache.wml.dom.WMLDoElementImpl",
      "org.apache.wml.dom.WMLWmlElementImpl",
      "org.apache.wml.dom.WMLTrElementImpl",
      "org.apache.wml.dom.WMLGoElementImpl",
      "org.apache.wml.dom.WMLBigElementImpl",
      "org.apache.wml.dom.WMLAnchorElementImpl",
      "org.apache.wml.dom.WMLTimerElementImpl",
      "org.apache.wml.dom.WMLSmallElementImpl",
      "org.apache.wml.dom.WMLOptgroupElementImpl",
      "org.apache.wml.dom.WMLHeadElementImpl",
      "org.apache.wml.dom.WMLTdElementImpl",
      "org.apache.wml.dom.WMLFieldsetElementImpl",
      "org.apache.wml.dom.WMLImgElementImpl",
      "org.apache.wml.dom.WMLRefreshElementImpl",
      "org.apache.wml.dom.WMLOneventElementImpl",
      "org.apache.wml.dom.WMLInputElementImpl",
      "org.apache.wml.dom.WMLPrevElementImpl",
      "org.apache.wml.dom.WMLTableElementImpl",
      "org.apache.wml.dom.WMLMetaElementImpl",
      "org.apache.wml.dom.WMLTemplateElementImpl",
      "org.apache.wml.dom.WMLBrElementImpl",
      "org.apache.wml.dom.WMLOptionElementImpl",
      "org.apache.wml.dom.WMLUElementImpl",
      "org.apache.wml.dom.WMLPElementImpl",
      "org.apache.wml.dom.WMLSelectElementImpl",
      "org.apache.wml.dom.WMLEmElementImpl",
      "org.apache.wml.dom.WMLIElementImpl",
      "org.apache.wml.dom.WMLCardElementImpl",
      "org.apache.wml.dom.WMLDocumentImpl",
      "org.apache.html.dom.HTMLIFrameElementImpl",
      "net.sf.xbus.base.bytearraylist.ByteArrayConverterFactory",
      "org.apache.html.dom.HTMLMetaElementImpl",
      "org.apache.axis.message.SOAPHeaderElement",
      "org.apache.axis.handlers.BasicHandler",
      "org.apache.axis.AxisEngine",
      "org.apache.axis.encoding.SerializationContext",
      "org.apache.axis.utils.NSStack",
      "org.apache.html.dom.HTMLButtonElementImpl",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "org.apache.axis.message.SOAPFaultElement",
      "org.apache.axis.message.Detail",
      "org.apache.axis.MessageContext",
      "org.apache.html.dom.HTMLDListElementImpl",
      "org.apache.html.dom.HTMLLabelElementImpl",
      "org.apache.axis.utils.LockableHashtable",
      "org.apache.axis.encoding.DeserializationContext$NullLexicalHandler",
      "org.apache.axis.encoding.DeserializationContext",
      "org.apache.axis.message.SAX2EventRecorder",
      "org.apache.axis.message.SAX2EventRecorder$objArrayVector",
      "org.apache.axis.message.EnvelopeHandler",
      "org.apache.html.dom.HTMLUListElementImpl",
      "org.apache.html.dom.HTMLScriptElementImpl",
      "org.apache.html.dom.HTMLParamElementImpl",
      "org.apache.axis.server.AxisServer",
      "org.apache.axis.server.DefaultAxisServerFactory",
      "org.apache.commons.discovery.resource.names.ResourceNameDiscoverImpl",
      "org.apache.commons.discovery.log.SimpleLog",
      "org.apache.commons.discovery.log.DiscoveryLogFactory",
      "org.apache.commons.discovery.tools.ClassUtils",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInAlternateManagedProperties",
      "org.apache.commons.discovery.resource.names.DiscoverMappedNames",
      "org.apache.axis.configuration.EngineConfigurationFactoryFinder",
      "org.apache.axis.configuration.EngineConfigurationFactoryFinder$1",
      "org.apache.commons.discovery.resource.names.NameDiscoverers",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInManagedProperties",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInFile",
      "org.apache.commons.discovery.resource.names.DiscoverServiceNames",
      "org.apache.commons.discovery.resource.ResourceDiscoverImpl",
      "org.apache.commons.discovery.resource.DiscoverResources",
      "org.apache.commons.discovery.resource.names.NameDiscoverers$1",
      "org.apache.html.dom.HTMLMenuElementImpl",
      "org.apache.html.dom.HTMLOptionElementImpl",
      "org.apache.html.dom.HTMLModElementImpl",
      "org.apache.axis.configuration.DirProvider",
      "org.apache.html.dom.HTMLParagraphElementImpl",
      "org.apache.html.dom.HTMLAppletElementImpl",
      "org.apache.html.dom.HTMLTextAreaElementImpl",
      "org.apache.html.dom.HTMLQuoteElementImpl",
      "org.apache.html.dom.HTMLStyleElementImpl",
      "org.apache.html.dom.HTMLTableColElementImpl",
      "org.apache.html.dom.HTMLIsIndexElementImpl",
      "org.apache.html.dom.HTMLBodyElementImpl",
      "org.apache.html.dom.HTMLImageElementImpl",
      "org.apache.html.dom.HTMLInputElementImpl",
      "org.apache.html.dom.HTMLLinkElementImpl",
      "org.apache.axis.deployment.wsdd.WSDDTransport",
      "org.apache.html.dom.HTMLAreaElementImpl",
      "org.apache.html.dom.HTMLDivElementImpl",
      "org.apache.html.dom.HTMLSelectElementImpl",
      "org.apache.html.dom.HTMLCollectionImpl",
      "org.apache.html.dom.HTMLHtmlElementImpl",
      "org.apache.html.dom.HTMLHeadElementImpl",
      "com.ibm.wsdl.PortTypeImpl",
      "com.ibm.wsdl.Constants",
      "org.apache.html.dom.HTMLTableSectionElementImpl",
      "org.apache.axis.message.RPCElement",
      "org.apache.html.dom.HTMLFontElementImpl",
      "org.apache.html.dom.HTMLTableCellElementImpl",
      "org.apache.html.dom.HTMLBaseElementImpl",
      "org.apache.html.dom.HTMLDirectoryElementImpl",
      "org.apache.html.dom.HTMLBRElementImpl",
      "org.apache.html.dom.HTMLMapElementImpl",
      "org.apache.axis.message.EnvelopeBuilder",
      "org.apache.axis.utils.NetworkUtils",
      "org.apache.axis.message.SOAPFault",
      "org.apache.commons.httpclient.params.DefaultHttpParamsFactory",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "org.apache.commons.httpclient.params.HostParams",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "org.apache.commons.httpclient.HttpVersion",
      "org.apache.commons.httpclient.SimpleHttpConnectionManager",
      "org.apache.commons.httpclient.DefaultHttpMethodRetryHandler",
      "org.apache.commons.httpclient.HostConfiguration",
      "org.apache.commons.httpclient.HttpMethodBase",
      "org.apache.commons.httpclient.ConnectMethod",
      "org.apache.commons.httpclient.HeaderGroup",
      "org.apache.commons.httpclient.auth.AuthState",
      "org.apache.axis.message.DetailEntry",
      "org.apache.commons.httpclient.util.HttpURLConnection",
      "com.ibm.wsdl.MessageImpl",
      "org.apache.axis.transport.local.Handler",
      "org.apache.html.dom.HTMLTableCaptionElementImpl",
      "org.apache.html.dom.HTMLBaseFontElementImpl",
      "org.apache.axis.message.RPCHeaderParam",
      "org.apache.html.dom.HTMLFrameSetElementImpl",
      "org.apache.html.dom.HTMLTableElementImpl",
      "com.ibm.wsdl.BindingImpl",
      "org.apache.html.dom.NameNodeListImpl",
      "org.apache.html.dom.HTMLHRElementImpl",
      "org.apache.html.dom.HTMLPreElementImpl"
    );
  }
}