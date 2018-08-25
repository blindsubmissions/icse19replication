/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Aug 24 18:59:55 GMT 2018
 */

package client.network;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ClientMsgReceiver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "client.network.ClientMsgReceiver"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/ext1/evosuite_readability_gen/projects/57_hft-bomberman"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "GMT"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClientMsgReceiver_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "client.gui.LoginDialog",
      "common.network.MsgReceiver",
      "messages.Message",
      "org.apache.log4j.or.RendererMap",
      "client.gui.ServerSelectionDialog",
      "messages.round.BombExplodedMsg",
      "org.apache.log4j.Logger",
      "client.ClientGameRound",
      "org.apache.log4j.Level",
      "messages.global.GlobalServerMsg",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "messages.global.MapListMsg",
      "org.apache.log4j.spi.RepositorySelector",
      "client.gui.HighscoreLobby",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "client.gui.components.MyPanel",
      "org.apache.log4j.or.DefaultRenderer",
      "client.gui.SessionLobby",
      "messages.global.GlobalClientMsg",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.log4j.PropertyConfigurator",
      "client.ClientGameSession",
      "client.gui.GlobalLobby",
      "client.gui.GlobalHighscoreLobby",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "server.ExplosionBounds",
      "client.gui.CreateGameDialog",
      "client.view.GameCanvas",
      "client.BomberClient",
      "common.GameSession",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "client.network.ClientMsgReceiver",
      "org.apache.log4j.spi.RootLogger",
      "client.gui.Game",
      "org.apache.log4j.spi.AppenderAttachable",
      "messages.global.SessionDetailsMsg",
      "org.apache.log4j.spi.RendererSupport",
      "messages.session.SessionServerMsg",
      "org.apache.log4j.Priority",
      "messages.global.MapInfo",
      "messages.round.RoundServerMsg",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "client.gui.StartFrame",
      "common.GameRound"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClientMsgReceiver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
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
      "common.network.MsgReceiver",
      "client.network.ClientMsgReceiver",
      "client.gui.StartFrame",
      "client.BomberClient",
      "common.GameSession",
      "client.ClientGameSession",
      "messages.global.InfoRequestMsg",
      "messages.global.GlobalStateMsg",
      "messages.round.BombExplodedMsg",
      "server.ExplosionBounds",
      "messages.global.SessionDetailsMsg",
      "messages.session.SessionChatMsg",
      "messages.round.PowerUpHitMsg",
      "messages.round.RoundStateMsg",
      "messages.round.MagicKillMsg",
      "common.Map",
      "common.MapReader",
      "common.XmlFunctions",
      "messages.round.CountdownMsg",
      "messages.round.RoundScoreMsg",
      "server.BomberServer",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Server",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.ServerConfiguration",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.java.JavaSystem",
      "org.hsqldb.Server$ServerThread",
      "messages.global.LoginMsg",
      "messages.global.MapListMsg",
      "messages.global.JoinSessionMsg",
      "messages.session.PlayerLeftMsg",
      "messages.global.ScoreMsg",
      "messages.round.RoundTimeOverMsg",
      "messages.session.SessionStateMsg",
      "messages.global.MapInfo"
    );
  }
}
