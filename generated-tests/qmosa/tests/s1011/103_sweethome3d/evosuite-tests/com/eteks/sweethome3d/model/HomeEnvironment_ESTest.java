/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:19:25 GMT 2018
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.AspectRatio;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(1080);
      float float0 = 420.3743F;
      homeEnvironment0.setSubpartSizeUnderLight(420.3743F);
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("CP?0Gw*H3cg5:xf_})", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 1212, (HomeTexture) null, 20, 1.3333334F);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setWallsAlpha((-1.0F));
      homeEnvironment0.getSubpartSizeUnderLight();
      int int0 = homeEnvironment0.getVideoFrameRate();
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
      assertEquals(25, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      CatalogTexture catalogTexture0 = new CatalogTexture((String) null, (String) null, (Content) null, (-2240.3503F), (-1036), "");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setSkyTexture(homeTexture0);
      homeEnvironment1.setSkyColor((-1036));
      homeEnvironment0.setPhotoQuality((-1036));
      homeEnvironment0.setCeillingLightColor((-1036));
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.FILL;
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode2 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode2);
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode1);
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment1.getPhotoWidth();
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment1.getCeillingLightColor();
      homeEnvironment0.getCeillingLightColor();
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment1.setGroundColor((-1036));
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
      assertEquals(320, homeEnvironment0.getVideoWidth());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor((-1415));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment1.getPhotoWidth();
      homeEnvironment1.setLightColor(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setVideoQuality(0);
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setCeillingLightColor(1);
      homeEnvironment0.setVideoQuality(2010);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.getVideoCameraPath();
      assertEquals(2010, homeEnvironment0.getVideoQuality());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1153, (HomeTexture) null, (-2202), 1153, 0.0F);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera camera0 = new Camera((-572.18475F), (-806.8783F), (-2202), 2623.9F, (-797.1F), (-806.8783F));
      linkedList0.push(camera0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setWallsAlpha(0.0F);
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = (-964);
      homeEnvironment0.setVideoQuality((-964));
      homeEnvironment0.setCeillingLightColor((-295));
      homeEnvironment0.getGroundTexture();
      boolean boolean0 = false;
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setAllLevelsVisible(false);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("B!0~FfULquAu!R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.B!0~FfULquAu!R
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Camera> class0 = Camera.class;
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(class0, "");
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", resourceURLContent0, (-25.3415F), 0.0F, "", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, 0, 0, (-1318.74F));
      homeEnvironment0.getVideoHeight();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoFrameRate((-1676));
      homeEnvironment0.getLightColor();
      homeEnvironment0.setWallsAlpha(0);
      homeEnvironment0.setVideoWidth(11053224);
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getLightColor();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setCeillingLightColor(1);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setVideoQuality(1);
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setLightColor(1);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      int int0 = (-2548);
      homeEnvironment0.setSkyColor((-2548));
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.setSubpartSizeUnderLight((-1.0F));
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setVideoQuality((-2548));
      homeEnvironment0.setSkyColor(3837);
      homeEnvironment0.setSubpartSizeUnderLight(0);
      homeEnvironment0.setSubpartSizeUnderLight(3837);
      homeEnvironment0.setVideoQuality(3837);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.getVideoFrameRate();
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("of\"TT)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.of\"TT)
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-706), (HomeTexture) null, (-706), (HomeTexture) null, (-836), 0.0F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      int int0 = homeEnvironment1.getGroundColor();
      assertNotSame(homeEnvironment1, homeEnvironment0);
      assertEquals(400, homeEnvironment1.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment1.getWallsAlpha(), 0.01F);
      assertEquals((-836), homeEnvironment1.getLightColor());
      assertEquals(13684944, homeEnvironment1.getCeillingLightColor());
      assertEquals(240, homeEnvironment1.getVideoHeight());
      assertEquals(25, homeEnvironment1.getVideoFrameRate());
      assertEquals((-706), homeEnvironment1.getSkyColor());
      assertEquals((-706), int0);
      assertEquals(300, homeEnvironment1.getPhotoHeight());
      assertTrue(homeEnvironment1.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.2188758248681983
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setPhotoHeight(1002);
      homeEnvironment0.setPhotoWidth(726);
      homeEnvironment0.setCeillingLightColor(726);
      homeEnvironment0.getVideoCameraPath();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setPhotoQuality(6);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setPhotoWidth(726);
      homeEnvironment1.setPhotoQuality(1002);
      homeEnvironment1.setWallsAlpha((-1658.3082F));
      homeEnvironment1.setVideoFrameRate(6);
      AspectRatio aspectRatio1 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setVideoFrameRate(10);
      homeEnvironment0.getLightColor();
      homeEnvironment1.setVideoFrameRate(1002);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment1.setAllLevelsVisible(true);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment1.getSubpartSizeUnderLight();
      homeEnvironment0.setLightColor(726);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment1.getVideoHeight();
      homeEnvironment0.getVideoAspectRatio();
      URL uRL0 = MockURL.getFtpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", uRLContent0, 0.0F, 726, ";B8]&");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(10, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_TEXTURE;
      String string0 = "P:jvto.sk:";
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("P:jvto.sk:", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment0, "*9k+JXAP", "*9k+JXAP", "*9k+JXAP");
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent("P:jvto.sk:", "", homeEnvironment0, "");
      propertyChangeEvent1.toString();
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setWallsAlpha(0.0F);
      homeEnvironment0.setCeillingLightColor((-2675));
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent((ClassLoader) null, "1.5.0_16");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.6701198898068172
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setLightColor(961);
      homeEnvironment0.setVideoQuality(300);
      homeEnvironment0.setWallsAlpha(961);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.setWallsAlpha(961);
      homeEnvironment0.setVideoCameraPath(list0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(961);
      homeEnvironment0.setVideoQuality(11053224);
      homeEnvironment0.setSkyColor(11053224);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setSkyColor(11053224);
      homeEnvironment0.setPhotoWidth((-829));
      HomeEnvironment.Property.values();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      String string0 = null;
      Class<Object> class0 = Object.class;
      boolean boolean0 = false;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2033, (HomeTexture) null, 0, 0, 1.7777778F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      assertTrue(boolean0);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0, homeEnvironment0.getSkyColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertNotSame(homeEnvironment0, homeEnvironment1);
      assertEquals(2033, homeEnvironment0.getGroundColor());
      assertEquals(0, homeEnvironment0.getLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(1.7777778F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = (-2202);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1153, (HomeTexture) null, (-2202), 1153, 0.0F);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setLightColor(1153);
      String string0 = "(5$ H_Tw";
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("(5$ H_Tw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.(5$ H_Tw
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, 0, 0.0F);
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setPhotoHeight(4703);
      homeEnvironment0.getPhotoWidth();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setSkyColor(4703);
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      AspectRatio aspectRatio0 = homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.setAllLevelsVisible(true);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      HomeEnvironment.Property.values();
      homeEnvironment0.getSkyColor();
      HomeEnvironment.DrawingMode.values();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setPhotoWidth(400);
      AspectRatio aspectRatio2 = AspectRatio.RATIO_16_9;
      homeEnvironment1.setVideoAspectRatio(aspectRatio2);
      homeEnvironment1.setPhotoHeight(4703);
      homeEnvironment0.getLightColor();
      homeEnvironment1.getLightColor();
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setSkyColor(13);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment1.getWallsAlpha();
      homeEnvironment0.getVideoQuality();
      int int0 = homeEnvironment0.getPhotoQuality();
      assertEquals(AspectRatio.RATIO_2_1, homeEnvironment0.getVideoAspectRatio());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      CatalogTexture catalogTexture0 = new CatalogTexture((String) null, (String) null, (Content) null, (-2240.3503F), (-1036), "");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setSkyTexture(homeTexture0);
      homeEnvironment1.setSkyColor((-1036));
      homeEnvironment0.setPhotoQuality((-1036));
      homeEnvironment0.setCeillingLightColor((-1036));
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio1);
      homeEnvironment0.setCeillingLightColor((-1036));
      homeEnvironment0.getCeillingLightColor();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(300, homeTexture0, 8, (-1036), 2440.0F);
      homeEnvironment2.setObserverCameraElevationAdjusted(true);
      homeEnvironment2.getCeillingLightColor();
      AspectRatio aspectRatio2 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio2);
      homeEnvironment0.setGroundColor((-1330));
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("qCVAw&~", (Content) null, 1951, (-2039.794F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1951, homeTexture0, 1951, 13, 1951);
      homeEnvironment0.setPhotoHeight(13);
      homeEnvironment0.setVideoFrameRate(0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.setCeillingLightColor(1073741824);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.getCeillingLightColor();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.getSkyTexture();
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("o~URIHBWYu=v-_l/1`m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.o~URIHBWYu=v-_l/1`m
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.351673301904631
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(4166);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.DRAWING_MODE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("YAW", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment_Property0, "YAW", "YAW", propertyChangeListenerProxy0);
      propertyChangeEvent0.setPropagationId("YAW");
      Camera.Lens camera_Lens0 = Camera.Lens.FISHEYE;
      Camera camera0 = new Camera(5542.16F, 5542.16F, 1.0F, 4166, 5542.16F, 1.0F, 0L, camera_Lens0);
      propertyChangeEvent0.setPropagationId(camera0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      propertyChangeEvent0.setPropagationId(propertyChangeListenerProxy0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setVideoQuality(270);
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setWallsAlpha(1.7777778F);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setVideoWidth(270);
      Random.setNextRandom(13684944);
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(1.7777778F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.2102535776209735
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "qCVAw&~";
      CatalogTexture catalogTexture0 = new CatalogTexture("qCVAw&~", (Content) null, 1951, (-2039.794F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1951, homeTexture0, 1951, 13, 1951);
      homeEnvironment0.setPhotoHeight(13);
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.setVideoFrameRate(13);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(13, homeTexture0, 0, homeTexture0, 0, 1951);
      homeEnvironment1.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.setSubpartSizeUnderLight((-1.0F));
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      catalogTexture0.setCategory((TexturesCategory) null);
      homeEnvironment1.getVideoHeight();
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      // Undeclared exception!
      try { 
        homeEnvironment1.setGroundTexture(homeTexture1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.HomeTexture", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("qCVAw&~", (Content) null, 1951, (-2039.794F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1951, homeTexture0, 1951, 13, 1951);
      homeEnvironment0.setPhotoHeight(13);
      homeEnvironment0.setVideoFrameRate((-11));
      homeEnvironment0.setVideoFrameRate(9);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setVideoFrameRate(19);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setSubpartSizeUnderLight(13);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      catalogTexture0.setCategory((TexturesCategory) null);
      homeEnvironment0.getVideoHeight();
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      // Undeclared exception!
      try { 
        homeEnvironment0.setGroundTexture(homeTexture1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.HomeTexture", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3034884952192693
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("qCVAw&~", (Content) null, 1929, (-2039.794F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1929, homeTexture0, 1929, 13, 1929);
      homeEnvironment0.setPhotoHeight(13);
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.setVideoWidth(13);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setSubpartSizeUnderLight((-2039.794F));
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      catalogTexture0.setCategory((TexturesCategory) null);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.setGroundTexture(homeTexture0);
      homeEnvironment0.setVideoWidth(13);
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.9730014063936125
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("YQXf", (Content) null, (-1.0F), 18L, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(13, homeTexture0, 13, 2146299813, 18L);
      homeEnvironment0.setPhotoHeight((-1554));
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera((-2981.4568F), 18L, 1.7778F, 1054.7281F, 18L, 1598.32F, (-11), camera_Lens0);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setLightColor((-1554));
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setWallsAlpha((-1367.4F));
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals((-1554), homeEnvironment0.getPhotoHeight());
  }
}