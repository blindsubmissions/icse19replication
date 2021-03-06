/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:03:02 GMT 2018
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
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setSkyColor(18);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      AspectRatio aspectRatio2 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setVideoAspectRatio(aspectRatio2);
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.getGroundColor();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("VIDEO_QUALITY", (Content) null, 11053224, 11053224);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(11053224, homeTexture0, 11053224, 11053224, 11053224);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("VIDEO_QUALITY", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.setSubpartSizeUnderLight(872.0F);
      homeEnvironment0.setPhotoQuality(11053224);
      assertEquals(872.0F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha((-1607.11F));
      homeEnvironment0.setPhotoQuality(737);
      homeEnvironment0.setPhotoHeight(0);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setPhotoQuality(6);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getPhotoWidth();
      List<Camera> list1 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list1);
      homeEnvironment0.setLightColor(596);
      homeEnvironment0.getVideoCameraPath();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setSubpartSizeUnderLight(1.7777778F);
      homeEnvironment0.getDrawingMode();
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, (-1383), (HomeTexture) null, 3864, 0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_WIDTH;
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("LENS", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy("${[:Ut$`v@8", propertyChangeListener1);
      Object object0 = new Object();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      Object object1 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, "H", homeEnvironment0, object1);
      propertyChangeListenerProxy1.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy1);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.getPhotoAspectRatio();
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.setGroundColor(0);
      homeEnvironment1.setAllLevelsVisible(true);
      homeEnvironment0.setVideoFrameRate((-1056));
      homeEnvironment0.setLightColor(1803);
      homeEnvironment1.setGroundColor(1333);
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setGroundColor((-823));
      homeEnvironment0.getSkyTexture();
      homeEnvironment1.getVideoAspectRatio();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals((-823), int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("J\",PVOQZKn4!kN[Z", (Content) null, (-770.4747F), (-770.4747F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-876), homeTexture0, 0, (-3233), 0.0F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.setPhotoHeight(3757);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(6, homeTexture0, 3757, homeTexture0, 3205, 3205);
      List<Camera> list0 = homeEnvironment2.getVideoCameraPath();
      homeEnvironment1.setVideoCameraPath(list0);
      homeEnvironment1.setLightColor((-3233));
      homeEnvironment1.getPhotoWidth();
      homeEnvironment0.setVideoWidth((-876));
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf("J\",PVOQZKn4!kN[Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.Property.J\",PVOQZKn4!kN[Z
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha((-1.0F));
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.setVideoQuality((-3446));
      homeEnvironment0.setSubpartSizeUnderLight((-3446));
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(304, (HomeTexture) null, 304, (HomeTexture) null, 304, 1614.8091F);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.DRAWING_MODE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      Object object0 = new Object();
      Object object1 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(propertyChangeListenerProxy0, "", object0, object1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      int int0 = homeEnvironment0.getCeillingLightColor();
      assertEquals(13684944, int0);
      
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      assertEquals(304, homeEnvironment0.getGroundColor());
      assertEquals(1614.8091F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(304, homeEnvironment0.getLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(304, homeEnvironment0.getSkyColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      Camera camera0 = new Camera(1447.9F, 1447.9F, 1.0F, 2952.0F, 2952.0F, 2952.0F);
      Camera camera1 = camera0.clone();
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.GROUND_TEXTURE;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("", "N%@", camera1, camera1);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      propertyChangeEvent0.toString();
      propertyChangeEvent0.setPropagationId(homeEnvironment1);
      homeEnvironment0.setVideoFrameRate(482);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setPhotoWidth(20);
      int int0 = homeEnvironment1.getSkyColor();
      assertEquals(482, homeEnvironment0.getVideoFrameRate());
      assertEquals(13427964, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment.DrawingMode.values();
      int int0 = 139;
      String string0 = "";
      Content content0 = null;
      CatalogTexture catalogTexture0 = new CatalogTexture("", (Content) null, 139, 0.0F, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      int int1 = (-4545);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(139, homeTexture0, (-4545), (-601), 139);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      CatalogTexture catalogTexture1 = new CatalogTexture("LIGHT_COLOR", "com.eteks.sweethome3d.model.HomeEnvironment", (Content) null, (-601), 139, "f<", false);
      catalogTexture0.compareTo(catalogTexture1);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.getGroundTexture();
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("SUBPART_SIZE_UNDER_LIGHT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.SUBPART_SIZE_UNDER_LIGHT
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
      homeEnvironment0.setLightColor((-1391));
      homeEnvironment0.setPhotoWidth((-1391));
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setSubpartSizeUnderLight(1.0F);
      homeEnvironment0.setVideoQuality(0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getGroundColor();
      homeEnvironment0.clone();
      assertEquals(AspectRatio.RATIO_2_1, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("g}3", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setPhotoHeight(400);
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.setVideoQuality(10);
      homeEnvironment1.setPhotoHeight(400);
      homeEnvironment0.getSkyTexture();
      homeEnvironment1.getPhotoQuality();
      homeEnvironment1.setLightColor(0);
      homeEnvironment1.getVideoFrameRate();
      homeEnvironment0.setVideoWidth(400);
      homeEnvironment1.setVideoFrameRate(0);
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.getLightColor();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.isObserverCameraElevationAdjusted();
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      homeEnvironment2.setObserverCameraElevationAdjusted(false);
      assertEquals(400, homeEnvironment0.getVideoWidth());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      homeEnvironment2.setCeillingLightColor(3);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment2.setVideoQuality((-1));
      homeEnvironment0.setSkyColor((-1));
      homeEnvironment1.setAllLevelsVisible(false);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment2.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setWallsAlpha(0.0F);
      homeEnvironment2.setPhotoQuality((-430));
      homeEnvironment0.getPhotoQuality();
      homeEnvironment2.getVideoHeight();
      homeEnvironment2.setObserverCameraElevationAdjusted(false);
      int int0 = homeEnvironment1.getSkyColor();
      assertEquals(13427964, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setSkyColor((-1134));
      homeEnvironment0.setWallsAlpha(887.0F);
      homeEnvironment0.setVideoWidth(0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setPhotoHeight(0);
      assertEquals(0, homeEnvironment0.getVideoHeight());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = true;
      CatalogTexture catalogTexture0 = new CatalogTexture(" ", " ", (Content) null, 0, 0.0F, "Pw}7B<Qx&Ht9^e6", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      int int0 = 1935;
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, 1935, 1935, 1.0F);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
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
  //Test case number: 15
  /*Coverage entropy=3.071080362736029
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setWallsAlpha(3320);
      homeEnvironment1.setVideoFrameRate(3320);
      homeEnvironment1.setAllLevelsVisible(false);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setVideoQuality((-680));
      homeEnvironment0.setPhotoQuality((-728));
      homeEnvironment1.getVideoQuality();
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment1.setVideoCameraPath(list0);
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.getSkyColor();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      homeEnvironment1.setGroundColor(3320);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setAllLevelsVisible(true);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(320, homeEnvironment0.getVideoHeight());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.1458417525947544
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(3, (HomeTexture) null, 4, (HomeTexture) null, 317, 3);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      HomeEnvironment homeEnvironment1 = new HomeEnvironment();
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment();
      homeEnvironment2.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.getSkyTexture();
      homeEnvironment2.getGroundColor();
      homeEnvironment0.getSkyTexture();
      homeEnvironment2.setVideoFrameRate(3);
      homeEnvironment2.setAllLevelsVisible(true);
      assertEquals(3, homeEnvironment2.getVideoFrameRate());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(8192, (HomeTexture) null, 4, 8192, (-2095.67F));
      homeEnvironment0.setVideoFrameRate(8192);
      homeEnvironment0.setSkyColor((-904));
      homeEnvironment0.setPhotoWidth((-1044));
      homeEnvironment0.setVideoFrameRate(4);
      homeEnvironment0.setVideoQuality(12);
      homeEnvironment0.setPhotoQuality((-1044));
      homeEnvironment0.setPhotoQuality(4021);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      System.setCurrentTimeMillis((-1044));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      CatalogTexture catalogTexture0 = new CatalogTexture((String) null, (Content) null, (-4340.3105F), (-4340.3105F), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      homeEnvironment0.clone();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(13684944, (HomeTexture) null, 13684944, 5, 1404.008F);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setCeillingLightColor((-940));
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(5, (HomeTexture) null, 13684944, (HomeTexture) null, 3148, 17);
      homeEnvironment2.setVideoCameraPath(list0);
      homeEnvironment2.setVideoWidth(5);
      homeEnvironment2.setVideoWidth(17);
      assertEquals(17, homeEnvironment2.getVideoWidth());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.setGroundColor(0);
      Class<HomeEnvironment> class0 = HomeEnvironment.class;
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(class0, "");
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", resourceURLContent0, 934.6786F, 0, "", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(0, homeTexture0, 2059, 2059, (-2095.67F));
      homeEnvironment0.setVideoFrameRate(2059);
      homeEnvironment1.setSkyColor(11);
      homeEnvironment1.setPhotoWidth((-904));
      homeEnvironment2.setVideoFrameRate(0);
      homeEnvironment1.setVideoQuality(0);
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(2059, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.403640410614949
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor((-1391));
      homeEnvironment0.setPhotoWidth((-1391));
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      Object object0 = new Object();
      URL uRL0 = MockURL.getFileExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "Invalid URL base for JAR entry", resourceURLContent0, (-1607.11F), (-1391), "Invalid URL base for JAR entry");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, "H", "=9Gg5", "H");
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("=9Gg5", propertyChangeListener0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_HEIGHT;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setAllLevelsVisible(false);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(0, (HomeTexture) null, 140, 140, 872.0F);
      homeEnvironment1.getPhotoAspectRatio();
      homeEnvironment1.setVideoWidth(11);
      assertEquals(11, homeEnvironment1.getVideoWidth());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.488327743368588
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, (-1383), (HomeTexture) null, 3864, 0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setLightColor(3116);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setSubpartSizeUnderLight(0);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(3116, (HomeTexture) null, 3116, (HomeTexture) null, (-1383), (-1383));
      homeEnvironment1.setVideoQuality(2688);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getGroundColor();
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      homeEnvironment2.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setVideoFrameRate(5);
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(6);
      homeEnvironment0.setVideoWidth(6);
      assertEquals(5, homeEnvironment0.getVideoHeight());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(8192, (HomeTexture) null, 41, 8192, (-2096.0425F));
      homeEnvironment0.setVideoFrameRate(8192);
      homeEnvironment0.setSkyColor((-904));
      homeEnvironment0.setPhotoWidth((-1044));
      homeEnvironment0.setPhotoQuality((-1044));
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.clone();
      homeEnvironment0.setPhotoQuality(8192);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(8192, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment1.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(506, (HomeTexture) null, 506, 11, 1094);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setVideoWidth(830);
      homeEnvironment1.setVideoWidth(1946);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      assertEquals(623, homeEnvironment0.getVideoHeight());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.7328679513998633
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setSkyColor(18);
      MockURL.getHttpExample();
      homeEnvironment0.setSkyColor(18);
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(18, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      homeEnvironment1.setCeillingLightColor(400);
      homeEnvironment0.setAllLevelsVisible(true);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment2.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment2.setVideoQuality(0);
      homeEnvironment0.setSkyColor(830);
      homeEnvironment1.setAllLevelsVisible(true);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setWallsAlpha(400);
      homeEnvironment0.setPhotoQuality(830);
      homeEnvironment2.getPhotoQuality();
      homeEnvironment1.getVideoHeight();
      URL uRL0 = MockURL.getFtpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "Mh@}9;HE", uRLContent0, 1089.04F, 1089.04F, "");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment3 = new HomeEnvironment(830, homeTexture0, (-2496), 7, (-694.7023F));
      homeEnvironment3.setGroundTexture(homeTexture0);
      homeEnvironment0.setVideoFrameRate(20);
      homeEnvironment0.setVideoFrameRate(20);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment0.setSubpartSizeUnderLight(219.43F);
      homeEnvironment0.setPhotoQuality(6);
      homeEnvironment0.setSkyColor((-4001));
      homeEnvironment0.setPhotoWidth(3);
      homeEnvironment0.setPhotoWidth(3);
      homeEnvironment0.setCeillingLightColor(1);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setCeillingLightColor(11);
      System.setCurrentTimeMillis(11);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setCeillingLightColor(11053224);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment1.clone();
      homeEnvironment1.setCeillingLightColor(11053224);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }
}
