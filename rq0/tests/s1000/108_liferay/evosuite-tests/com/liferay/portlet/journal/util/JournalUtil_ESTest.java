/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 07 14:36:34 GMT 2018
 */

package com.liferay.portlet.journal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.HitsImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Tuple;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.LayoutSetBranch;
import com.liferay.portal.model.LayoutSetBranchWrapper;
import com.liferay.portal.model.LayoutSetWrapper;
import com.liferay.portal.model.Subscription;
import com.liferay.portal.model.SubscriptionWrapper;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.xml.ElementImpl;
import com.liferay.portlet.ActionResponseImpl;
import com.liferay.portlet.EventResponseImpl;
import com.liferay.portlet.PortalPreferencesImpl;
import com.liferay.portlet.PortalPreferencesWrapper;
import com.liferay.portlet.PortletPreferencesImpl;
import com.liferay.portlet.PortletPreferencesWrapper;
import com.liferay.portlet.PortletRequestImpl;
import com.liferay.portlet.Preference;
import com.liferay.portlet.RenderResponseImpl;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleWrapper;
import com.liferay.portlet.journal.model.JournalFolder;
import com.liferay.portlet.journal.model.JournalFolderWrapper;
import com.liferay.portlet.journal.model.JournalStructure;
import com.liferay.portlet.journal.model.JournalStructureWrapper;
import com.liferay.portlet.journal.model.JournalTemplate;
import com.liferay.portlet.journal.model.JournalTemplateWrapper;
import com.liferay.portlet.journal.util.JournalUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.portlet.ActionRequest;
import javax.portlet.EventRequest;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.filter.ActionRequestWrapper;
import javax.portlet.filter.EventRequestWrapper;
import javax.portlet.filter.RenderRequestWrapper;
import javax.portlet.filter.RenderResponseWrapper;
import javax.portlet.filter.ResourceRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.tree.BaseElement;
import org.dom4j.util.UserDataElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JournalUtil_ESTest extends JournalUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlSuite xmlSuite0 = new XmlSuite();
      Map<String, String> map0 = xmlSuite0.getAllParameters();
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(journalArticle0).getArticleId();
      doReturn((Date) null).when(journalArticle0).getCreateDate();
      doReturn((String) null).when(journalArticle0).getDescription(anyString());
      doReturn((Date) null).when(journalArticle0).getDisplayDate();
      doReturn((Date) null).when(journalArticle0).getModifiedDate();
      doReturn(0L).when(journalArticle0).getResourcePrimKey();
      doReturn((String) null).when(journalArticle0).getSmallImageURL();
      doReturn((String) null).when(journalArticle0).getTitle(anyString());
      doReturn((String) null).when(journalArticle0).getType();
      doReturn((String) null).when(journalArticle0).getUrlTitle();
      doReturn(0.0).when(journalArticle0).getVersion();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper(journalArticle0);
      // Undeclared exception!
      try { 
        JournalUtil.addAllReservedEls((Element) null, map0, journalArticleWrapper0, "methods");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("param");
      ElementImpl elementImpl0 = new ElementImpl(baseElement0);
      UnicodeProperties unicodeProperties0 = new UnicodeProperties();
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(journalArticle0).getArticleId();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper(journalArticle0);
      // Undeclared exception!
      try { 
        JournalUtil.addAllReservedEls(elementImpl0, unicodeProperties0, journalArticleWrapper0, "param");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.xml.SAXReaderUtil", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Map<String, String> map0 = JournalUtil.getTokens(4294967295L, (ThemeDisplay) null);
      assertEquals(0, map0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("U=MTdldhw1mKh", "U=MTdldhw1mKh");
      assertNull(orderByComparator0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      // Undeclared exception!
      try { 
        JournalUtil.getTokens(186L, themeDisplay0, ".4>3d2SXI;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JournalUtil journalUtil0 = new JournalUtil();
      assertEquals(20, JournalUtil.MAX_STACK_SIZE);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalDeniedBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserDataElement userDataElement0 = new UserDataElement("TP[cZ+*knn'w%");
      ElementImpl elementImpl0 = new ElementImpl(userDataElement0);
      JournalUtil.removeArticleLocale((Element) elementImpl0, "TP[cZ+*knn'w%");
      assertTrue(elementImpl0.supportsParent());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JournalStructure journalStructure0 = mock(JournalStructure.class, new ViolatedAssumptionAnswer());
      JournalStructureWrapper journalStructureWrapper0 = new JournalStructureWrapper(journalStructure0);
      // Undeclared exception!
      try { 
        JournalUtil.addRecentStructure((PortletRequest) null, journalStructureWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResourceRequest resourceRequest0 = mock(ResourceRequest.class, new ViolatedAssumptionAnswer());
      doReturn((PortletSession) null).when(resourceRequest0).getPortletSession();
      ResourceRequestWrapper resourceRequestWrapper0 = new ResourceRequestWrapper(resourceRequest0);
      JournalTemplate journalTemplate0 = mock(JournalTemplate.class, new ViolatedAssumptionAnswer());
      JournalTemplateWrapper journalTemplateWrapper0 = new JournalTemplateWrapper(journalTemplate0);
      // Undeclared exception!
      try { 
        JournalUtil.addRecentTemplate(resourceRequestWrapper0, journalTemplateWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        JournalUtil.getUrlTitle((-4807L), "Bo2WT:0~Z}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleUpdatedEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleReviewSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalRequestedBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalGrantedBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalRequestedSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleAddedBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = JournalUtil.removeOldContent("XczkQrnWnp=vH", "XczkQrnWnp=vH");
      assertEquals("XczkQrnWnp=vH", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalDeniedSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailFromName(portletPreferencesImpl0, (-1089L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.portal.util.PropsValues
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JournalUtil.formatVM(" UN^=C$XY=qt* ");
      ThemeDisplay themeDisplay0 = new ThemeDisplay();
      UnicodeProperties unicodeProperties0 = new UnicodeProperties();
      themeDisplay0.setSessionId("");
      try { 
        JournalUtil.transform(themeDisplay0, unicodeProperties0, " UN^=C$XY=qt* ", "diskCache", "", "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.util.LocalizationUtil", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        JournalUtil.validateXSD("XczkQrnWnp=vH");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleReviewEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        JournalUtil.getTemplateScript(0L, "0XGS*~'%", (Map<String, String>) null, "$XAEdF_I'7=$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PortletPreferences portletPreferences0 = null;
      long long0 = 0L;
      // Undeclared exception!
      try { 
        JournalUtil.getEmailFromAddress((PortletPreferences) null, 0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.portal.util.PropsValues
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ServiceContext serviceContext0 = new ServiceContext();
      serviceContext0.getRequest();
      RenderResponseImpl renderResponseImpl0 = new RenderResponseImpl();
      try { 
        JournalUtil.addPortletBreadcrumbEntries(4294967295L, (HttpServletRequest) null, (RenderResponse) renderResponseImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // BeanLocator has not been set
         //
         verifyException("com.liferay.portal.kernel.bean.PortalBeanLocatorUtil", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper(journalArticle0);
      JournalArticleWrapper journalArticleWrapper1 = new JournalArticleWrapper(journalArticleWrapper0);
      ActionRequest actionRequest0 = mock(ActionRequest.class, new ViolatedAssumptionAnswer());
      doReturn((PortletSession) null).when(actionRequest0).getPortletSession();
      ActionRequestWrapper actionRequestWrapper0 = new ActionRequestWrapper(actionRequest0);
      actionRequestWrapper0.getPortletSession();
      RenderRequest renderRequest0 = mock(RenderRequest.class, new ViolatedAssumptionAnswer());
      doReturn((PortletSession) null).when(renderRequest0).getPortletSession();
      RenderRequestWrapper renderRequestWrapper0 = new RenderRequestWrapper(renderRequest0);
      // Undeclared exception!
      try { 
        JournalUtil.addRecentArticle(renderRequestWrapper0, journalArticleWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleUpdatedSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlSuite xmlSuite0 = new XmlSuite();
      Map<String, String> map0 = xmlSuite0.getParameters();
      JournalTemplate journalTemplate0 = mock(JournalTemplate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(journalTemplate0).getXsl();
      JournalTemplateWrapper journalTemplateWrapper0 = new JournalTemplateWrapper(journalTemplate0);
      String string0 = JournalUtil.getTemplateScript((JournalTemplate) journalTemplateWrapper0, map0, "continue", (boolean) xmlSuite0.DEFAULT_SKIP_FAILED_INVOCATION_COUNTS);
      assertNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleApprovalGrantedSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleApprovalGrantedEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "$l<";
      ActionResponseImpl actionResponseImpl0 = new ActionResponseImpl();
      actionResponseImpl0.getPortletRequest();
      // Undeclared exception!
      try { 
        JournalUtil.removeRecentArticle((PortletRequest) null, "$l<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      portletPreferencesImpl0.getNames();
      RenderRequest renderRequest0 = mock(RenderRequest.class, new ViolatedAssumptionAnswer());
      RenderRequestWrapper renderRequestWrapper0 = new RenderRequestWrapper(renderRequest0);
      JournalUtil.addRecentArticle(renderRequestWrapper0, (JournalArticle) null);
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleAddedSubject(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JournalTemplate journalTemplate0 = mock(JournalTemplate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(journalTemplate0).getXsl();
      JournalTemplateWrapper journalTemplateWrapper0 = new JournalTemplateWrapper(journalTemplate0);
      XmlSuite xmlSuite0 = new XmlSuite();
      Map<String, String> map0 = xmlSuite0.getParameters();
      String string0 = JournalUtil.getTemplateScript((JournalTemplate) journalTemplateWrapper0, map0, "methods", true);
      assertNull(string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleUpdatedBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleApprovalRequestedEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("j+3P+XjY2}.}lEp", "asc");
      assertNull(orderByComparator0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      // Undeclared exception!
      try { 
        JournalUtil.getEmailArticleReviewBody(portletPreferencesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleAddedEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      RenderResponseImpl renderResponseImpl0 = new RenderResponseImpl();
      ServiceContext serviceContext0 = new ServiceContext();
      serviceContext0.getRequest();
      JournalUtil.addPortletBreadcrumbEntries(0L, (HttpServletRequest) null, (RenderResponse) renderResponseImpl0);
      assertNull(renderResponseImpl0.getContentType());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        JournalUtil.getUrlTitle(2222L, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.model.ModelHintsUtil", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("version", "version");
      assertNotNull(orderByComparator0);
      assertEquals("JournalArticle.version DESC", orderByComparator0.getOrderBy());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JournalFolder journalFolder0 = mock(JournalFolder.class, new ViolatedAssumptionAnswer());
      doReturn(535L).when(journalFolder0).getFolderId();
      doReturn(214L).when(journalFolder0).getPrimaryKey();
      JournalFolderWrapper journalFolderWrapper0 = new JournalFolderWrapper(journalFolder0);
      JournalFolderWrapper journalFolderWrapper1 = new JournalFolderWrapper(journalFolderWrapper0);
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      doReturn(journalFolderWrapper0).when(journalArticle0).getFolder();
      journalFolderWrapper0.getPrimaryKey();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper(journalArticle0);
      ServiceContext serviceContext0 = new ServiceContext();
      serviceContext0.getRequest();
      try { 
        JournalUtil.addPortletBreadcrumbEntries((JournalArticle) journalArticleWrapper0, (HttpServletRequest) null, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = JournalUtil.getUrlTitle((-2529L), (String) null);
      assertEquals("-2529", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        JournalUtil.getUrlTitle(100L, "rss");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.model.ModelHintsUtil", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      JournalUtil.getArticleOrderByComparator("title", ";");
      ActionResponseImpl actionResponseImpl0 = new ActionResponseImpl();
      assertFalse(actionResponseImpl0.isCalledSetRenderParameter());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Map<String, String> map0 = JournalUtil.getTokens(1511L, (ThemeDisplay) null, "j[%wo$\"z");
      assertTrue(map0.isEmpty());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      EventRequest eventRequest0 = mock(EventRequest.class, new ViolatedAssumptionAnswer());
      EventRequestWrapper eventRequestWrapper0 = new EventRequestWrapper(eventRequest0);
      JournalUtil.addRecentTemplate(eventRequestWrapper0, (JournalTemplate) null);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ActionResponseImpl actionResponseImpl0 = new ActionResponseImpl();
      actionResponseImpl0.getPortletRequest();
      JournalUtil.addRecentStructure((PortletRequest) null, (JournalStructure) null);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      portletPreferencesImpl0.reset();
      JournalUtil.getEmailArticleApprovalDeniedEnabled(portletPreferencesImpl0);
      JournalFolder journalFolder0 = mock(JournalFolder.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(journalFolder0).getPrimaryKey();
      JournalFolderWrapper journalFolderWrapper0 = new JournalFolderWrapper(journalFolder0);
      JournalArticle journalArticle0 = mock(JournalArticle.class, new ViolatedAssumptionAnswer());
      doReturn(journalFolderWrapper0, (JournalFolder) null).when(journalArticle0).getFolder();
      journalFolderWrapper0.getPrimaryKey();
      JournalArticleWrapper journalArticleWrapper0 = new JournalArticleWrapper(journalArticle0);
      journalArticleWrapper0.getFolder();
      ServiceContext serviceContext0 = new ServiceContext();
      serviceContext0.getRequest();
      try { 
        JournalUtil.addPortletBreadcrumbEntries((JournalArticle) journalArticleWrapper0, (HttpServletRequest) null, (RenderResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("display-date", "]");
      assertNotNull(orderByComparator0);
      assertEquals("displayDate DESC, version DESC", orderByComparator0.getOrderBy());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      PortalPreferencesImpl portalPreferencesImpl0 = new PortalPreferencesImpl();
      portalPreferencesImpl0.setValue("emailArticleApprovalGrantedBody", "3'!");
      PortalPreferencesWrapper portalPreferencesWrapper0 = new PortalPreferencesWrapper(portalPreferencesImpl0);
      String string0 = JournalUtil.getEmailArticleApprovalGrantedBody(portalPreferencesWrapper0);
      assertEquals("3'!", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("id", "id");
      assertNotNull(orderByComparator0);
      assertFalse(orderByComparator0.isAscending());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("modified-date", "modified-date");
      assertFalse(orderByComparator0.isAscending());
      assertNotNull(orderByComparator0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      portletPreferencesImpl0.setValue("emailArticleReviewSubject", "emailArticleReviewSubject");
      String string0 = JournalUtil.getEmailArticleReviewSubject(portletPreferencesImpl0);
      assertEquals("emailArticleReviewSubject", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("review-date", "review-date");
      assertNotNull(orderByComparator0);
      assertEquals("JournalArticle.reviewDate DESC, JournalArticle.version DESC", orderByComparator0.getOrderBy());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        JournalUtil.getUrlTitle((-915L), "4");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.model.ModelHintsUtil", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      OrderByComparator orderByComparator0 = JournalUtil.getArticleOrderByComparator("create-date", "create-date");
      assertNotNull(orderByComparator0);
      assertEquals("createDate DESC", orderByComparator0.toString());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HitsImpl hitsImpl0 = new HitsImpl();
      Document[] documentArray0 = new Document[0];
      hitsImpl0.setDocs(documentArray0);
      Tuple tuple0 = JournalUtil.getArticles(hitsImpl0);
      assertEquals(2, tuple0.getSize());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HitsImpl hitsImpl0 = new HitsImpl();
      Document[] documentArray0 = new Document[6];
      hitsImpl0.setDocs(documentArray0);
      // Undeclared exception!
      try { 
        JournalUtil.getArticles(hitsImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portlet.journal.util.JournalUtil", e);
      }
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      portletPreferencesImpl0.setValue("emailArticleUpdatedEnabled", "emailArticleUpdatedEnabled");
      boolean boolean0 = JournalUtil.getEmailArticleUpdatedEnabled(portletPreferencesImpl0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      portletPreferencesImpl0.setValue("emailArticleUpdatedBody", "un#Ew");
      String string0 = JournalUtil.getEmailArticleUpdatedBody(portletPreferencesImpl0);
      assertEquals("un#Ew", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      PortletPreferencesImpl portletPreferencesImpl0 = new PortletPreferencesImpl();
      PortletPreferencesWrapper portletPreferencesWrapper0 = new PortletPreferencesWrapper(portletPreferencesImpl0, "_eview-date");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "fyn{j";
      stringArray0[1] = "emailArticleReviewEnabled";
      stringArray0[2] = "_eview-date";
      portletPreferencesImpl0.setValues("emailArticleReviewEnabled", stringArray0);
      PortletPreferencesImpl portletPreferencesImpl1 = portletPreferencesWrapper0.getPortletPreferencesImpl();
      boolean boolean0 = JournalUtil.getEmailArticleReviewEnabled(portletPreferencesImpl1);
      assertFalse(boolean0);
  }
}
