/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:52:53 GMT 2018
 */

package com.aelitis.azureus.core.networkmanager.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TransportImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.aelitis.azureus.core.networkmanager.impl.TransportImpl"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/104_vuze"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TransportImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.gudy.azureus2.core3.util.SystemTime$SystemTimeProvider",
      "org.gudy.azureus2.core3.util.AEMonSem",
      "org.gudy.azureus2.core3.util.BEncoder",
      "org.gudy.azureus2.platform.PlatformManagerFactory",
      "com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageEncoder",
      "org.gudy.azureus2.core3.config.impl.ConfigurationChecker",
      "org.gudy.azureus2.core3.util.ByteArrayHashMap$Entry",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminASNListener",
      "com.aelitis.azureus.core.util.AEThreadMonitor$1",
      "com.aelitis.azureus.core.networkmanager.VirtualChannelSelector",
      "com.aelitis.azureus.core.networkmanager.Transport$ConnectListener",
      "com.aelitis.azureus.core.peermanager.messaging.MessageStreamDecoder",
      "com.aelitis.net.udp.uc.PRUDPPacket",
      "org.gudy.azureus2.core3.util.FrequencyLimitedDispatcher",
      "org.gudy.azureus2.core3.logging.LogIDs",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TransportEndpointTCP",
      "org.gudy.azureus2.core3.util.DirectByteBufferPool",
      "org.gudy.azureus2.core3.util.AERunnable",
      "org.gudy.azureus2.core3.config.impl.ConfigurationDefaults",
      "org.gudy.azureus2.core3.security.SEKeyDetails",
      "org.gudy.azureus2.core3.util.Average",
      "org.gudy.azureus2.core3.util.TimerEventPeriodic",
      "org.gudy.azureus2.core3.util.protocol.AzURLStreamHandlerFactory",
      "com.aelitis.azureus.core.peermanager.messaging.Message",
      "org.gudy.azureus2.core3.util.AEDiagnostics",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPReply",
      "com.aelitis.net.udp.uc.PRUDPPacketRequestDecoder",
      "org.gudy.azureus2.platform.PlatformManagerListener",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilter",
      "org.gudy.azureus2.core3.logging.impl.FileLogging$1",
      "org.gudy.azureus2.core3.logging.impl.FileLogging$2",
      "org.gudy.azureus2.core3.util.Timer$evidenceGenerator",
      "com.aelitis.azureus.core.stats.AzureusCoreStatsProvider",
      "com.aelitis.net.udp.uc.PRUDPPacketRequest",
      "org.gudy.azureus2.core3.util.AEThread2$threadWrapper",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelper$selectListener",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$1",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdmin",
      "org.gudy.azureus2.plugins.platform.PlatformManagerException",
      "org.gudy.azureus2.core3.security.SESecurityManager",
      "org.gudy.azureus2.core3.util.SimpleTimer",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager",
      "org.gudy.azureus2.core3.logging.LogAlert",
      "org.gudy.azureus2.core3.util.FrequencyLimitedDispatcher$2",
      "org.gudy.azureus2.core3.util.FrequencyLimitedDispatcher$1",
      "org.bouncycastle.jce.provider.BouncyCastleProvider",
      "org.gudy.azureus2.core3.util.Timer",
      "org.gudy.azureus2.core3.util.ThreadPool",
      "com.aelitis.azureus.core.networkmanager.VirtualChannelSelector$VirtualAbstractSelectorListener",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs$2",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs$1",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerBC",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$14",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualBlockingServerChannelSelector",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$4",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$3",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$1",
      "com.aelitis.net.udp.uc.PRUDPPacketHandler",
      "org.gudy.azureus2.core3.util.TimeFormatter",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPRequest",
      "com.aelitis.azureus.core.networkmanager.NetworkConnection$ConnectionListener",
      "com.aelitis.azureus.core.networkmanager.ConnectionAttempt",
      "com.aelitis.azureus.core.networkmanager.OutgoingMessageQueue",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualChannelSelectorImpl",
      "com.aelitis.azureus.core.util.AEThreadMonitor",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$5",
      "org.gudy.azureus2.core3.util.BEncodableObject",
      "org.gudy.azureus2.core3.util.AEMonSem$1",
      "org.gudy.azureus2.core3.util.AEMonSem$2",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminException",
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl",
      "org.gudy.azureus2.core3.util.AEThread2",
      "com.aelitis.azureus.core.networkmanager.VirtualServerChannelSelector$SelectListener",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$TcpSelectListener",
      "org.gudy.azureus2.core3.config.StringList",
      "org.gudy.azureus2.core3.util.SystemTime",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$sliceDBB",
      "org.gudy.azureus2.core3.util.Debug",
      "org.gudy.azureus2.core3.util.AEDiagnostics$2",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelper",
      "com.aelitis.azureus.core.peermanager.messaging.MessageStreamEncoder",
      "org.gudy.azureus2.core3.util.AEDiagnostics$1",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientListener",
      "org.gudy.azureus2.core3.util.LightHashSet",
      "org.gudy.azureus2.core3.config.COConfigurationManager",
      "org.gudy.azureus2.core3.util.SystemTime$SteppedProvider",
      "org.gudy.azureus2.core3.util.ThreadPoolTask",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager",
      "com.aelitis.azureus.core.networkmanager.ConnectionEndpoint",
      "org.gudy.azureus2.core3.util.DirectByteBuffer",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper",
      "org.gudy.azureus2.plugins.logging.LogAlert",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs",
      "org.gudy.azureus2.core3.util.AESemaphore2",
      "org.gudy.azureus2.pluginsimpl.local.utils.UtilitiesImpl$runnableWithException",
      "org.gudy.azureus2.core3.util.AEMemoryMonitor$1",
      "com.aelitis.azureus.core.networkmanager.TransportEndpoint",
      "org.gudy.azureus2.core3.util.AsyncDispatcher$1",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl",
      "com.aelitis.azureus.core.networkmanager.VirtualChannelSelector$VirtualSelectorListener",
      "com.aelitis.azureus.core.speedmanager.impl.v2.SpeedLimitConfidence",
      "org.gudy.azureus2.core3.config.impl.ConfigurationManager$1",
      "org.gudy.azureus2.core3.util.SystemTime$SteppedProvider$1",
      "org.gudy.azureus2.core3.config.COConfigurationManager$ParameterVerifier",
      "com.aelitis.azureus.core.stats.AzureusCoreStats$1",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl$1",
      "com.aelitis.azureus.core.stats.AzureusCoreStats",
      "org.gudy.azureus2.core3.config.impl.ConfigurationChecker$1",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionBase",
      "org.gudy.azureus2.core3.util.AEDiagnosticsLogger",
      "org.gudy.azureus2.core3.config.impl.ConfigurationParameterNotFoundException",
      "com.aelitis.azureus.core.util.FeatureAvailability",
      "org.gudy.azureus2.core3.util.TimerEvent",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminSocksProxy",
      "org.gudy.azureus2.core3.util.StringInterner$WeakWeightedEntry",
      "com.aelitis.azureus.core.networkmanager.ProtocolEndpointHandler",
      "org.gudy.azureus2.platform.PlatformManagerPingCallback",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper$1",
      "com.aelitis.azureus.core.networkmanager.EventWaiter",
      "com.aelitis.net.udp.uc.PRUDPPacketReplyDecoder",
      "org.gudy.azureus2.core3.util.AEMemoryMonitor",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper$2",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$sliceBuffer",
      "com.aelitis.net.udp.uc.PRUDPPacketReply",
      "com.aelitis.azureus.core.networkmanager.NetworkConnection",
      "com.aelitis.azureus.core.networkmanager.RawMessage",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$4",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$5",
      "com.aelitis.azureus.core.util.CopyOnWriteList",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$3",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$1",
      "org.gudy.azureus2.core3.util.AEMonitor",
      "org.gudy.azureus2.core3.util.AsyncDispatcher",
      "org.gudy.azureus2.core3.logging.impl.FileLogging",
      "com.aelitis.azureus.core.AzureusCore",
      "com.aelitis.azureus.core.util.NetUtils",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$AzureusSecurityManager",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl$RedirectorStream",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$2",
      "com.aelitis.azureus.core.networkmanager.impl.TransportCryptoManager$HandshakeListener",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$1",
      "com.aelitis.azureus.core.instancemanager.AZInstanceManagerListener",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClient$1",
      "org.gudy.azureus2.core3.util.ByteArrayHashMap",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$3",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$4",
      "org.gudy.azureus2.core3.util.ByteEncodedKeyHashMap",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminProtocol",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$5",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$7",
      "org.gudy.azureus2.core3.util.AEThread",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminASN",
      "org.gudy.azureus2.core3.util.FileUtil",
      "org.gudy.azureus2.core3.logging.ILogEventListener",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$5",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminHTTPProxy",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$4",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.SelectorGuard$GuardListener",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$3",
      "org.gudy.azureus2.core3.util.AEDiagnosticsEvidenceGenerator",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$ConnectListener",
      "org.gudy.azureus2.core3.util.IndentWriter",
      "com.aelitis.azureus.core.networkmanager.impl.NetworkConnectionImpl",
      "org.gudy.azureus2.core3.config.impl.ConfigurationDefaults$IPVerifier",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminRouteListener",
      "org.gudy.azureus2.platform.unix.PlatformManagerImpl",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$1",
      "com.aelitis.azureus.core.networkmanager.Transport",
      "com.aelitis.azureus.core.networkmanager.IncomingMessageQueue",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal",
      "org.gudy.azureus2.plugins.platform.PlatformManager",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$1",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$2",
      "org.gudy.azureus2.platform.PlatformManager",
      "org.gudy.azureus2.core3.util.SystemTime$ChangeListener",
      "com.aelitis.azureus.core.util.AEThreadMonitor$EvidenceGenerateor",
      "com.aelitis.azureus.core.networkmanager.LimitedRateGroup",
      "org.gudy.azureus2.core3.util.StringInterner$WeakStringEntry",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP$1",
      "org.gudy.azureus2.core3.util.StringInterner$WeakEntry",
      "org.gudy.azureus2.core3.util.StringInterner$2",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminNetworkInterface",
      "org.gudy.azureus2.core3.config.COConfigurationListener",
      "org.gudy.azureus2.core3.util.StringInterner$1",
      "com.aelitis.azureus.core.util.NetUtils$1",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager$1",
      "com.aelitis.azureus.core.util.NetUtils$2",
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl$2",
      "org.gudy.azureus2.core3.util.Constants",
      "org.gudy.azureus2.core3.util.RandomUtils",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageEncoder",
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager",
      "org.gudy.azureus2.core3.config.ParameterListener",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingMessageQueueImpl",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminRoutesListener",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminPropertyChangeListener",
      "org.gudy.azureus2.core3.config.impl.ConfigurationManager",
      "org.gudy.azureus2.core3.util.TimerEventPerformer",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.SelectorGuard",
      "com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder",
      "org.gudy.azureus2.core3.config.PriorityParameterListener",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualBlockingServerChannelSelector$1",
      "com.aelitis.azureus.core.util.CopyOnWriteList$CopyOnWriteListIterator",
      "org.gudy.azureus2.core3.logging.Logger",
      "org.gudy.azureus2.core3.util.StringInterner",
      "com.aelitis.azureus.core.networkmanager.VirtualServerChannelSelectorFactory",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdminNATDevice",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$ConnectionRequest",
      "org.gudy.azureus2.platform.PlatformManagerCapabilities",
      "org.gudy.azureus2.core3.util.AESemaphore",
      "com.aelitis.azureus.core.networkmanager.TransportBase",
      "com.aelitis.azureus.core.networkmanager.impl.TransportStats",
      "org.gudy.azureus2.core3.util.ThreadPool$1",
      "org.gudy.azureus2.core3.util.AEThread2$JoinLock",
      "org.gudy.azureus2.core3.util.ThreadPool$2",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolHeap",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP",
      "org.gudy.azureus2.core3.util.SystemProperties",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterTransparent",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClient",
      "com.aelitis.azureus.core.networkmanager.impl.OutgoingMessageQueueImpl",
      "org.gudy.azureus2.core3.logging.LogEvent",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualChannelSelectorImpl$1",
      "com.aelitis.azureus.core.networkmanager.VirtualServerChannelSelector",
      "com.aelitis.azureus.core.networkmanager.ProtocolEndpoint",
      "org.gudy.azureus2.core3.util.SystemTime$TickConsumer"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP", false, TransportImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TransportImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl",
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl$1",
      "com.aelitis.azureus.core.networkmanager.impl.TransportImpl$2",
      "org.gudy.azureus2.core3.util.SystemTime$SteppedProvider",
      "org.gudy.azureus2.core3.util.SystemTime$SteppedProvider$1",
      "org.gudy.azureus2.core3.util.SystemTime",
      "org.gudy.azureus2.core3.util.TimeFormatter",
      "org.gudy.azureus2.core3.util.AEDiagnostics",
      "org.gudy.azureus2.core3.logging.LogIDs",
      "org.gudy.azureus2.core3.util.SystemProperties",
      "org.gudy.azureus2.core3.util.Constants",
      "org.gudy.azureus2.core3.util.AEMonSem$1",
      "org.gudy.azureus2.core3.util.AEMonSem",
      "org.gudy.azureus2.core3.util.AEMonitor",
      "org.gudy.azureus2.core3.util.FileUtil",
      "org.gudy.azureus2.core3.logging.impl.FileLogging",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl$RedirectorStream",
      "org.gudy.azureus2.core3.util.FrequencyLimitedDispatcher",
      "org.gudy.azureus2.core3.util.AERunnable",
      "org.gudy.azureus2.core3.config.impl.ConfigurationManager$1",
      "org.gudy.azureus2.core3.config.impl.ConfigurationManager",
      "org.gudy.azureus2.platform.PlatformManagerFactory",
      "org.gudy.azureus2.platform.PlatformManagerCapabilities",
      "org.gudy.azureus2.platform.unix.PlatformManagerImpl",
      "org.gudy.azureus2.core3.logging.LogEvent",
      "org.gudy.azureus2.core3.config.impl.ConfigurationChecker",
      "org.gudy.azureus2.core3.config.COConfigurationManager",
      "org.gudy.azureus2.core3.util.RandomUtils",
      "org.gudy.azureus2.core3.config.impl.ConfigurationDefaults",
      "org.gudy.azureus2.core3.config.impl.ConfigurationDefaults$IPVerifier",
      "com.aelitis.azureus.core.speedmanager.impl.v2.SpeedLimitConfidence",
      "org.gudy.azureus2.core3.config.impl.ConfigurationParameterNotFoundException",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs$1",
      "com.aelitis.net.udp.uc.PRUDPPacket",
      "com.aelitis.net.udp.uc.PRUDPPacketReply",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClientUDPCodecs$2",
      "com.aelitis.net.udp.uc.PRUDPPacketRequest",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClient",
      "com.aelitis.azureus.core.versioncheck.VersionCheckClient$1",
      "com.aelitis.azureus.core.util.FeatureAvailability",
      "org.gudy.azureus2.core3.util.BEncoder",
      "org.gudy.azureus2.core3.util.protocol.AzURLStreamHandlerFactory",
      "org.gudy.azureus2.core3.config.impl.ConfigurationChecker$1",
      "org.gudy.azureus2.core3.security.SESecurityManager",
      "com.aelitis.azureus.core.util.CopyOnWriteList",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$1",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$2",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerBC",
      "org.bouncycastle.jce.provider.BouncyCastleProvider",
      "org.gudy.azureus2.core3.security.impl.SESecurityManagerImpl$AzureusSecurityManager",
      "org.gudy.azureus2.core3.util.AEDiagnostics$1",
      "org.gudy.azureus2.core3.util.AEThread2",
      "org.gudy.azureus2.core3.util.AEDiagnostics$2",
      "org.gudy.azureus2.core3.util.AEThread2$JoinLock",
      "org.gudy.azureus2.core3.util.AEThread2$threadWrapper",
      "org.gudy.azureus2.core3.util.AESemaphore2",
      "com.aelitis.azureus.core.util.AEThreadMonitor",
      "com.aelitis.azureus.core.util.AEThreadMonitor$EvidenceGenerateor",
      "org.gudy.azureus2.core3.util.AEThread",
      "com.aelitis.azureus.core.util.AEThreadMonitor$1",
      "org.gudy.azureus2.core3.util.AEMemoryMonitor",
      "org.gudy.azureus2.core3.util.AEMemoryMonitor$1",
      "org.gudy.azureus2.core3.util.AEDiagnosticsLogger",
      "org.gudy.azureus2.core3.util.Debug",
      "org.gudy.azureus2.core3.logging.impl.LoggerImpl$1",
      "org.gudy.azureus2.core3.logging.impl.FileLogging$1",
      "org.gudy.azureus2.core3.logging.impl.FileLogging$2",
      "org.gudy.azureus2.core3.logging.Logger",
      "org.gudy.azureus2.platform.win32.PlatformManagerImpl",
      "org.gudy.azureus2.platform.macosx.access.jnilib.OSXAccess",
      "org.gudy.azureus2.platform.macosx.PlatformManagerImpl$1",
      "org.gudy.azureus2.platform.macosx.PlatformManagerImpl",
      "org.gudy.azureus2.platform.dummy.PlatformManagerImpl",
      "org.gudy.azureus2.core3.internat.LocaleUtilDecoderReal",
      "org.gudy.azureus2.core3.internat.LocaleUtilDecoderFallback",
      "org.gudy.azureus2.core3.internat.LocaleUtil",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.ProtocolEndpointTCP",
      "com.aelitis.azureus.core.networkmanager.impl.udp.UDPConnectionManager$1",
      "com.aelitis.azureus.core.networkmanager.impl.udp.UDPConnectionManager",
      "com.aelitis.azureus.core.networkmanager.VirtualChannelSelector",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualChannelSelectorImpl",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.SelectorGuard",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualChannelSelectorImpl$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$3",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$4",
      "com.aelitis.azureus.core.stats.AzureusCoreStats$1",
      "com.aelitis.azureus.core.stats.AzureusCoreStats",
      "com.aelitis.azureus.core.util.CopyOnWriteList$CopyOnWriteListIterator",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPConnectionManager$5",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager",
      "com.aelitis.azureus.core.networkmanager.admin.NetworkAdmin",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$1",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$2",
      "org.gudy.azureus2.core3.util.AsyncDispatcher",
      "org.gudy.azureus2.core3.util.AESemaphore",
      "org.gudy.azureus2.core3.util.LightHashSet",
      "org.gudy.azureus2.core3.util.ByteArrayHashMap",
      "org.gudy.azureus2.core3.util.ByteArrayHashMap$Entry",
      "org.gudy.azureus2.core3.util.StringInterner$WeakEntry",
      "org.gudy.azureus2.core3.util.StringInterner$WeakWeightedEntry",
      "org.gudy.azureus2.core3.util.StringInterner$WeakStringEntry",
      "org.gudy.azureus2.core3.util.StringInterner$1",
      "org.gudy.azureus2.core3.util.StringInterner$2",
      "org.gudy.azureus2.core3.util.StringInterner",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$3",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$4",
      "com.aelitis.azureus.core.networkmanager.admin.impl.NetworkAdminImpl$5",
      "org.gudy.azureus2.core3.util.Timer",
      "org.gudy.azureus2.core3.util.Timer$evidenceGenerator",
      "org.gudy.azureus2.core3.util.ThreadPool$1",
      "org.gudy.azureus2.core3.util.ThreadPool$2",
      "org.gudy.azureus2.core3.util.ThreadPool",
      "org.gudy.azureus2.core3.util.Average",
      "org.gudy.azureus2.core3.util.SimpleTimer",
      "org.gudy.azureus2.core3.util.TimerEventPeriodic",
      "org.gudy.azureus2.core3.util.ThreadPoolTask",
      "org.gudy.azureus2.core3.util.TimerEvent",
      "com.aelitis.azureus.core.util.NetUtils",
      "com.aelitis.azureus.core.util.NetUtils$1",
      "com.aelitis.azureus.core.util.NetUtils$2",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager$1",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$TcpSelectListener",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$3",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$4",
      "com.aelitis.azureus.core.networkmanager.VirtualServerChannelSelectorFactory",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualBlockingServerChannelSelector",
      "org.gudy.azureus2.core3.logging.LogAlert",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.IncomingSocketChannelManager$5",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$3",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$4",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$5",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager$2",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPNetworkManager",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportImpl$1",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterTransparent",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterSwitcher",
      "com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageDecoder",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$1",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal",
      "org.gudy.azureus2.core3.util.DirectByteBufferPool",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$sliceBuffer",
      "org.gudy.azureus2.core3.util.DirectByteBuffer",
      "org.gudy.azureus2.core3.util.DirectByteBufferPoolReal$sliceDBB",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager$IncomingConnection",
      "com.aelitis.azureus.core.networkmanager.impl.udp.UDPConnection",
      "com.aelitis.azureus.core.networkmanager.impl.udp.UDPTransportHelper",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageDecoder",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper",
      "com.aelitis.azureus.core.networkmanager.EventWaiter",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStream",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStreamXOR",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TransportEndpointTCP",
      "com.aelitis.azureus.core.networkmanager.ConnectionEndpoint",
      "com.aelitis.azureus.core.peermanager.messaging.azureus.AZMessageEncoder",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper",
      "com.aelitis.azureus.core.networkmanager.impl.NetworkConnectionImpl",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper$1",
      "com.aelitis.azureus.core.networkmanager.NetworkConnectionHelper$2",
      "com.aelitis.azureus.core.networkmanager.impl.OutgoingMessageQueueImpl",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingMessageQueueImpl",
      "com.aelitis.azureus.core.networkmanager.impl.TransportCipher",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageEncoder",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterInserter",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper$1",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.VirtualChannelSelectorImpl$RegistrationData",
      "com.aelitis.azureus.core.networkmanager.impl.tcp.TCPTransportHelper$2",
      "com.aelitis.azureus.core.networkmanager.impl.IncomingConnectionManager$SelectorListener",
      "com.aelitis.azureus.core.networkmanager.impl.TransportStats",
      "com.aelitis.azureus.core.networkmanager.impl.TransportStats$1",
      "com.aelitis.azureus.core.networkmanager.impl.TransportHelperFilterStreamCipher",
      "com.aelitis.azureus.core.peermanager.messaging.azureus.AZGenericMapPayload",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageFactory$LegacyData",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTUnchoke",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTPiece",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTChoke",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTUninterested",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTInterested",
      "com.aelitis.azureus.core.peermanager.messaging.bittorrent.BTMessageFactory"
    );
  }
}