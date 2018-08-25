/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:31:57 GMT 2018
 */

package de.huxhorn.lilith.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.huxhorn.lilith.buffers.FilteringBuffer;
import de.huxhorn.lilith.conditions.GroovyCondition;
import de.huxhorn.lilith.conditions.LoggerEqualsCondition;
import de.huxhorn.lilith.conditions.MessageContainsCondition;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.debug.DebugProgressingCallable;
import de.huxhorn.lilith.engine.impl.EventSourceImpl;
import de.huxhorn.lilith.swing.AccessEventViewPanel;
import de.huxhorn.lilith.swing.EventWrapperViewPanel;
import de.huxhorn.lilith.swing.LoggingEventViewPanel;
import de.huxhorn.lilith.swing.MainFrame;
import de.huxhorn.lilith.swing.TabbedLoggingViewContainer;
import de.huxhorn.sulky.buffers.Buffer;
import de.huxhorn.sulky.conditions.Or;
import de.huxhorn.sulky.tasks.Task;
import java.awt.Component;
import java.awt.Container;
import java.awt.RenderingHints;
import java.beans.PropertyChangeEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.UndoManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventWrapperViewPanel_ESTest extends EventWrapperViewPanel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventWrapperViewPanel<UndoManager> eventWrapperViewPanel0 = (EventWrapperViewPanel<UndoManager>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.MyFocusTraversalPolicy eventWrapperViewPanel_MyFocusTraversalPolicy0 = eventWrapperViewPanel0.new MyFocusTraversalPolicy();
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser();
      File file0 = MockFile.createTempFile(";f_>=\";)O{Pt4", "selectedEvent");
      Icon icon0 = mockJFileChooser0.getIcon(file0);
      JToggleButton jToggleButton0 = new JToggleButton(icon0, true);
      Component component0 = eventWrapperViewPanel_MyFocusTraversalPolicy0.getLastComponent(jToggleButton0);
      assertNull(component0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventWrapperViewPanel<GroovyCondition> eventWrapperViewPanel0 = (EventWrapperViewPanel<GroovyCondition>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.FindResultListener eventWrapperViewPanel_FindResultListener0 = eventWrapperViewPanel0.new FindResultListener();
      DebugProgressingCallable debugProgressingCallable0 = new DebugProgressingCallable();
      debugProgressingCallable0.getProgress();
      EventWrapperViewPanel<LoggerEqualsCondition> eventWrapperViewPanel1 = (EventWrapperViewPanel<LoggerEqualsCondition>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.EventWrapperViewChangeListener eventWrapperViewPanel_EventWrapperViewChangeListener0 = eventWrapperViewPanel1.new EventWrapperViewChangeListener();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(debugProgressingCallable0, "2p \"/", (Object) null, (Object) null);
      eventWrapperViewPanel_EventWrapperViewChangeListener0.propertyChange(propertyChangeEvent0);
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_FindResultListener0.setCallable(debugProgressingCallable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel$FindResultListener", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventWrapperViewPanel<TabbedLoggingViewContainer> eventWrapperViewPanel0 = (EventWrapperViewPanel<TabbedLoggingViewContainer>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.MyFocusTraversalPolicy eventWrapperViewPanel_MyFocusTraversalPolicy0 = eventWrapperViewPanel0.new MyFocusTraversalPolicy();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField();
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_MyFocusTraversalPolicy0.getComponentAfter(jFormattedTextField0, jFormattedTextField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel$MyFocusTraversalPolicy", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SourceIdentifier sourceIdentifier0 = new SourceIdentifier();
      Buffer<EventWrapper<LoggingEvent>> buffer0 = null;
      EventSourceImpl<LoggingEvent> eventSourceImpl0 = new EventSourceImpl<LoggingEvent>(sourceIdentifier0, (Buffer<EventWrapper<LoggingEvent>>) null, false);
      LoggingEventViewPanel loggingEventViewPanel0 = null;
      try {
        loggingEventViewPanel0 = new LoggingEventViewPanel((MainFrame) null, eventSourceImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventWrapperViewPanel<TabbedLoggingViewContainer> eventWrapperViewPanel0 = (EventWrapperViewPanel<TabbedLoggingViewContainer>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.MyFocusTraversalPolicy eventWrapperViewPanel_MyFocusTraversalPolicy0 = eventWrapperViewPanel0.new MyFocusTraversalPolicy();
      StyledEditorKit.AlignmentAction styledEditorKit_AlignmentAction0 = new StyledEditorKit.AlignmentAction("selectedEvent", (-1899));
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(styledEditorKit_AlignmentAction0);
      Component component0 = eventWrapperViewPanel_MyFocusTraversalPolicy0.getDefaultComponent(jRadioButtonMenuItem0);
      assertNull(component0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventWrapperViewPanel<LoggingEventViewPanel> eventWrapperViewPanel0 = (EventWrapperViewPanel<LoggingEventViewPanel>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.FindResultListener eventWrapperViewPanel_FindResultListener0 = eventWrapperViewPanel0.new FindResultListener();
      Task<Long> task0 = (Task<Long>) mock(Task.class, new ViolatedAssumptionAnswer());
      eventWrapperViewPanel_FindResultListener0.taskCreated(task0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventWrapperViewPanel<TabbedLoggingViewContainer> eventWrapperViewPanel0 = (EventWrapperViewPanel<TabbedLoggingViewContainer>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.MyFocusTraversalPolicy eventWrapperViewPanel_MyFocusTraversalPolicy0 = eventWrapperViewPanel0.new MyFocusTraversalPolicy();
      JTableHeader jTableHeader0 = new JTableHeader();
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_MyFocusTraversalPolicy0.getComponentBefore((Container) null, jTableHeader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel$MyFocusTraversalPolicy", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventWrapperViewPanel<AccessEventViewPanel> eventWrapperViewPanel0 = (EventWrapperViewPanel<AccessEventViewPanel>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.MyFocusTraversalPolicy eventWrapperViewPanel_MyFocusTraversalPolicy0 = eventWrapperViewPanel0.new MyFocusTraversalPolicy();
      JTextField jTextField0 = new JTextField();
      Component component0 = eventWrapperViewPanel_MyFocusTraversalPolicy0.getFirstComponent(jTextField0);
      assertNull(component0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      System.setCurrentTimeMillis(49L);
      EventWrapperViewPanel<DefaultTableModel> eventWrapperViewPanel0 = (EventWrapperViewPanel<DefaultTableModel>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.EventWrapperViewChangeListener eventWrapperViewPanel_EventWrapperViewChangeListener0 = eventWrapperViewPanel0.new EventWrapperViewChangeListener();
      LoggerEqualsCondition loggerEqualsCondition0 = new LoggerEqualsCondition();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_COLOR_RENDERING;
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(loggerEqualsCondition0, "filterCondition", sunHints_Key0, loggerEqualsCondition0);
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_EventWrapperViewChangeListener0.propertyChange(propertyChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel$EventWrapperViewChangeListener", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(49L);
      EventWrapperViewPanel<DefaultTableModel> eventWrapperViewPanel0 = (EventWrapperViewPanel<DefaultTableModel>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.EventWrapperViewChangeListener eventWrapperViewPanel_EventWrapperViewChangeListener0 = eventWrapperViewPanel0.new EventWrapperViewChangeListener();
      MessageContainsCondition messageContainsCondition0 = new MessageContainsCondition("i~TmM}^?D;");
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(messageContainsCondition0, "scrollingToBottom", "i~TmM}^?D;", (Object) null);
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_EventWrapperViewChangeListener0.propertyChange(propertyChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      System.setCurrentTimeMillis(49L);
      EventWrapperViewPanel<DefaultTableModel> eventWrapperViewPanel0 = (EventWrapperViewPanel<DefaultTableModel>) mock(EventWrapperViewPanel.class, CALLS_REAL_METHODS);
      EventWrapperViewPanel.EventWrapperViewChangeListener eventWrapperViewPanel_EventWrapperViewChangeListener0 = eventWrapperViewPanel0.new EventWrapperViewChangeListener();
      LoggerEqualsCondition loggerEqualsCondition0 = new LoggerEqualsCondition();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_COLOR_RENDERING;
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(eventWrapperViewPanel_EventWrapperViewChangeListener0, "filterCondition", sunHints_Key0, (Object) null);
      // Undeclared exception!
      try { 
        eventWrapperViewPanel_EventWrapperViewChangeListener0.propertyChange(propertyChangeEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.huxhorn.lilith.swing.EventWrapperViewPanel$EventWrapperViewChangeListener", e);
      }
  }
}
