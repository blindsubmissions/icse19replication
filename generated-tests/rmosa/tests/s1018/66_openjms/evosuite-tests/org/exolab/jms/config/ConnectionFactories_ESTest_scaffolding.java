/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 23 13:25:26 GMT 2018
 */

package org.exolab.jms.config;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConnectionFactories_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.exolab.jms.config.ConnectionFactories"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/66_openjms"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectionFactories_ESTest_scaffolding.class.getClassLoader() ,
      "org.exolab.jms.config.XATopicConnectionFactory",
      "org.exolab.castor.util.Configuration$ConfigValues",
      "org.exolab.jms.config.XAConnectionFactoryDescriptor",
      "org.exolab.jms.config.ConnectionFactories",
      "org.exolab.castor.xml.UnmarshalHandler$IDResolverImpl",
      "org.exolab.jms.config.XATopicConnectionFactoryDescriptor",
      "org.apache.xml.serialize.BaseMarkupSerializer",
      "org.exolab.castor.xml.TypeValidator",
      "org.exolab.castor.xml.FileLocation",
      "org.exolab.castor.xml.Validator",
      "org.exolab.castor.xml.ValidationContext",
      "org.exolab.castor.mapping.FieldDescriptor",
      "org.exolab.castor.mapping.FieldHandler",
      "org.exolab.castor.xml.validators.PatternValidator",
      "org.exolab.castor.util.LocalConfiguration",
      "org.exolab.castor.xml.descriptors.StringClassDescriptor",
      "org.exolab.castor.xml.ClassDescriptorEnumeration",
      "org.exolab.castor.xml.XMLFieldDescriptor",
      "org.exolab.jms.config.XAQueueConnectionFactoryDescriptor",
      "org.exolab.castor.xml.UnmarshalHandler$Arguments",
      "org.exolab.castor.xml.Introspector",
      "org.exolab.castor.util.ObjectFactory",
      "org.exolab.castor.xml.XMLMappingLoader",
      "org.exolab.castor.xml.EventProducer",
      "org.exolab.castor.mapping.MappingResolver",
      "org.exolab.castor.xml.Location",
      "org.exolab.castor.util.DefaultObjectFactory",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$2",
      "org.exolab.castor.xml.util.DefaultNaming",
      "org.exolab.castor.xml.MarshalFramework",
      "org.exolab.castor.xml.FieldValidator",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$3",
      "org.exolab.jms.config.XAConnectionFactory",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$4",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$5",
      "org.exolab.castor.xml.CastorException",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$1",
      "org.exolab.castor.types.AnyNode",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$6",
      "org.exolab.castor.xml.IDResolver",
      "org.exolab.castor.xml.ClassDescriptorResolver",
      "org.apache.xml.serialize.Serializer",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor",
      "org.exolab.castor.util.MimeBase64Encoder",
      "org.exolab.castor.xml.UnmarshalHandler",
      "org.exolab.castor.mapping.MappingException",
      "org.exolab.castor.xml.Namespaces",
      "org.exolab.castor.mapping.CollectionHandler",
      "org.exolab.castor.mapping.ClassDescriptor",
      "org.exolab.castor.xml.XMLFieldHandler",
      "org.exolab.castor.xml.XPathLocation",
      "org.exolab.castor.xml.util.XMLFieldDescriptorImpl",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor$1",
      "org.exolab.castor.types.OperationNotSupportedException",
      "org.exolab.castor.xml.ClassValidator",
      "org.exolab.castor.xml.validators.StringValidator",
      "org.exolab.castor.xml.ValidationException",
      "org.exolab.castor.xml.XMLException",
      "org.exolab.castor.util.Configuration",
      "org.exolab.castor.xml.MarshalException",
      "org.exolab.jms.config.QueueConnectionFactory",
      "org.exolab.castor.xml.XMLClassDescriptor",
      "org.exolab.jms.config.ConnectionFactory",
      "org.exolab.castor.xml.util.XMLClassDescriptorImpl",
      "org.exolab.jms.config.TopicConnectionFactory",
      "org.exolab.castor.util.IteratorEnumeration",
      "org.exolab.castor.xml.IntrospectedXMLClassDescriptor",
      "org.apache.xml.serialize.OutputFormat",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor",
      "org.exolab.castor.util.NestedIOException",
      "org.exolab.castor.xml.Unmarshaller",
      "org.exolab.castor.xml.Marshaller",
      "org.exolab.jms.config.XAQueueConnectionFactory",
      "org.exolab.castor.xml.XMLNaming",
      "org.exolab.castor.mapping.loader.MappingLoader",
      "org.exolab.castor.xml.NodeType",
      "org.exolab.castor.xml.AttributeSet",
      "org.apache.xml.serialize.DOMSerializer",
      "org.apache.xml.serialize.XMLSerializer",
      "org.exolab.castor.xml.MarshalFramework$InheritanceMatch",
      "org.exolab.castor.util.RegExpEvaluator",
      "org.exolab.castor.xml.util.ClassDescriptorResolverImpl",
      "org.exolab.castor.xml.UnmarshalHandler$ReferenceInfo",
      "org.exolab.jms.config.ConnectionFactoryType",
      "org.exolab.castor.xml.util.XMLFieldDescriptors"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectionFactories_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.exolab.jms.config.ConnectionFactories",
      "org.exolab.castor.xml.MarshalFramework",
      "org.exolab.castor.xml.descriptors.StringClassDescriptor",
      "org.exolab.castor.xml.Marshaller",
      "org.exolab.jms.config.ConnectionFactoryType",
      "org.exolab.jms.config.XAQueueConnectionFactory",
      "org.exolab.castor.xml.Unmarshaller",
      "org.exolab.castor.util.Configuration$ConfigValues",
      "org.exolab.castor.util.Configuration",
      "org.exolab.castor.util.LocalConfiguration",
      "org.exolab.castor.xml.util.ClassDescriptorResolverImpl",
      "org.exolab.castor.xml.Introspector",
      "org.exolab.castor.xml.XMLNaming",
      "org.exolab.castor.xml.util.DefaultNaming",
      "org.exolab.castor.xml.NodeType",
      "org.exolab.castor.xml.UnmarshalHandler",
      "org.exolab.castor.util.DefaultObjectFactory",
      "org.exolab.castor.xml.UnmarshalHandler$IDResolverImpl",
      "org.exolab.castor.xml.Namespaces",
      "org.exolab.castor.xml.CastorException",
      "org.exolab.castor.xml.XMLException",
      "org.exolab.castor.xml.MarshalException",
      "org.exolab.castor.xml.FileLocation",
      "org.exolab.jms.config.QueueConnectionFactory",
      "org.exolab.jms.config.XATopicConnectionFactory",
      "org.exolab.castor.util.NestedIOException",
      "org.exolab.castor.xml.Validator",
      "org.exolab.castor.xml.ValidationContext",
      "org.exolab.castor.xml.util.XMLClassDescriptorImpl",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor",
      "org.exolab.jms.config.QueueConnectionFactoryDescriptor",
      "org.exolab.castor.xml.util.XMLFieldDescriptors",
      "org.exolab.castor.xml.util.XMLFieldDescriptorImpl",
      "org.exolab.castor.types.AnyNode",
      "org.exolab.castor.xml.XMLFieldHandler",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor$1",
      "org.exolab.castor.xml.FieldValidator",
      "org.exolab.castor.xml.validators.PatternValidator",
      "org.exolab.castor.xml.validators.StringValidator",
      "org.exolab.castor.xml.ValidationException",
      "org.exolab.castor.xml.XPathLocation",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$1",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$2",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$3",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$4",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$5",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$6",
      "org.exolab.jms.config.XAConnectionFactory",
      "org.exolab.jms.config.XAConnectionFactoryDescriptor",
      "org.exolab.jms.config.ConnectionFactory",
      "org.exolab.jms.config.XATopicConnectionFactoryDescriptor",
      "org.exolab.jms.config.TopicConnectionFactory",
      "org.exolab.jms.config.XAQueueConnectionFactoryDescriptor",
      "org.exolab.castor.util.IteratorEnumeration",
      "org.exolab.castor.util.List",
      "org.exolab.castor.util.Stack",
      "org.exolab.castor.xml.util.AttributeSetImpl",
      "org.apache.xml.serialize.BaseMarkupSerializer",
      "org.apache.xml.serialize.XMLSerializer",
      "org.apache.xml.serialize.OutputFormat",
      "org.apache.xml.serialize.ElementState",
      "org.apache.xml.serialize.Encodings",
      "org.apache.xml.serialize.EncodingInfo",
      "org.apache.xml.serialize.Printer",
      "org.exolab.jms.config.TopicConnectionFactoryDescriptor",
      "org.exolab.castor.util.Stack$StackItem",
      "org.exolab.castor.xml.MarshalFramework$InternalXMLClassDescriptor",
      "org.exolab.castor.xml.Namespaces$Namespace",
      "org.exolab.castor.mapping.loader.CollectionHandlers",
      "org.exolab.castor.mapping.loader.CollectionHandlers$Info",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$2",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$3",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$4",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$2",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$3",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$4",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$ArrayEnumerator"
    );
  }
}
