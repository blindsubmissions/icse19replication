/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 16:21:03 GMT 2018
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
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = (-136);
      homeEnvironment0.setPhotoHeight((-136));
      float float0 = 0.0F;
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      homeEnvironment0.setPhotoHeight((-136));
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      HomeTexture homeTexture0 = null;
      try {
        homeTexture0 = new HomeTexture((TextureImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.HomeTexture", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setPhotoWidth(363);
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio VIEW_3D_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoWidth((-464));
      homeEnvironment1.getLightColor();
      homeEnvironment1.setPhotoHeight(2618);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoQuality(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_ASPECT_RATIO;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("lRS*hW|}0u]!hbiTnXV", propertyChangeListener0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setSubpartSizeUnderLight(2618);
      assertEquals((-464), homeEnvironment1.getVideoWidth());
      
      homeEnvironment0.setVideoQuality(0);
      CatalogTexture catalogTexture0 = new CatalogTexture("lRS*hW|}0u]!hbiTnXV", "", (Content) null, 0, 0, "Z", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(0);
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setVideoQuality(4);
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
  //Test case number: 4
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.setGroundColor(0);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.poll();
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment1.setGroundColor(6);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setGroundColor(633);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment0.getPhotoAspectRatio());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("K9^KyD86;>", (PropertyChangeListener) null);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setGroundColor((-2886));
      homeEnvironment0.setCeillingLightColor((-1534));
      homeEnvironment0.setCeillingLightColor(1517);
      homeEnvironment0.setAllLevelsVisible(true);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.getPhotoQuality();
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf("U/QVCM");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.Property.U/QVCM
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality((-739));
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setVideoWidth(13427964);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getSkyColor();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setWallsAlpha(13427964);
      homeEnvironment0.setGroundColor((-1149));
      homeEnvironment0.setSkyColor(13427964);
      HomeEnvironment.Property.values();
      homeEnvironment0.setLightColor(10070973);
      HomeEnvironment.Property.values();
      homeEnvironment0.setLightColor(2);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoWidth(10070973);
      homeEnvironment0.setWallsAlpha(981);
      homeEnvironment0.setSkyColor(981);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setVideoFrameRate(10070973);
      homeEnvironment0.getLightColor();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setWallsAlpha(0.0F);
      homeEnvironment0.setVideoCameraPath(list0);
      assertEquals(981, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 7, 0, 0);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment0.setWallsAlpha(1830.1187F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.SKY_TEXTURE;
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener1);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      Object object0 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("", "", object0, homeEnvironment1);
      propertyChangeListenerProxy1.propertyChange(propertyChangeEvent0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy1);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setGroundColor(0);
      int int0 = homeEnvironment0.getCeillingLightColor();
      assertEquals(1830.1187F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(13684944, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(918);
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.setPhotoQuality(918);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getVideoQuality();
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setWallsAlpha(2.0F);
      homeEnvironment0.setAllLevelsVisible(false);
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf(">");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.Property.>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = (-2747);
      homeEnvironment0.setSkyColor((-2747));
      homeEnvironment0.getVideoCameraPath();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      HomeEnvironment.Property.values();
      int int1 = 0;
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.setGroundColor(2872);
      HomeEnvironment.Property.values();
      homeEnvironment0.getVideoCameraPath();
      String string0 = "PHOTO_QUALITY";
      HomeEnvironment.Property.valueOf("PHOTO_QUALITY");
      homeEnvironment0.isObserverCameraElevationAdjusted();
      Class<String> class0 = String.class;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoWidth(0);
      homeEnvironment1.setCeillingLightColor(0);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setPhotoWidth((-347));
      homeEnvironment0.getVideoCameraPath();
      URL uRL0 = MockURL.getFtpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "FILL_AND_OUTLINE", uRLStreamHandler0);
      URLContent uRLContent0 = new URLContent(uRL1);
      CatalogTexture catalogTexture0 = new CatalogTexture("", uRLContent0, 0, (-347), true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment1.setSkyTexture(homeTexture0);
      homeEnvironment0.getSkyColor();
      homeEnvironment1.getPhotoQuality();
      homeEnvironment1.setPhotoWidth(0);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      assertEquals((-347), homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.setGroundColor(0);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.poll();
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment1.setGroundColor(6);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment();
      homeEnvironment2.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.getPhotoAspectRatio();
      assertEquals(6, homeEnvironment1.getGroundColor());
      
      homeEnvironment2.getDrawingMode();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment2.setVideoAspectRatio(aspectRatio0);
      assertEquals(13427964, homeEnvironment2.getSkyColor());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha(0.0F);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoWidth(4);
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setWallsAlpha(0.0F);
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setVideoWidth(13684944);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setVideoQuality(0);
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(10263708, homeEnvironment0.getVideoHeight());
      assertEquals(11053224, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.403640410614949
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(1609);
      homeEnvironment0.getVideoCameraPath();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setGroundColor(0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor((-820));
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setWallsAlpha(1.0F);
      homeEnvironment0.setLightColor((-2871));
      boolean boolean0 = homeEnvironment0.isAllLevelsVisible();
      assertEquals(1.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoWidth((-464));
      homeEnvironment1.getLightColor();
      homeEnvironment1.setPhotoHeight(2618);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoQuality(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_QUALITY;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("lRS*hW|}0u]!hbiTnXV", propertyChangeListener0);
      homeEnvironment1.setPhotoQuality((-36));
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setSubpartSizeUnderLight(2618);
      assertEquals(2618, homeEnvironment1.getPhotoHeight());
      
      homeEnvironment0.setVideoQuality(0);
      CatalogTexture catalogTexture0 = new CatalogTexture("lRS*hW|}0u]!hbiTnXV", "", (Content) null, (-36), (-36), "Z", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(19, homeTexture1, 1424, homeTexture0, 1073741824, 19);
      homeEnvironment2.setLightColor(1073741824);
      assertEquals(400, homeEnvironment2.getPhotoWidth());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("SKY_TEXTURE", propertyChangeListener0);
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy("SKY_TEXTURE", propertyChangeListenerProxy0);
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, (String) null, object1, object2);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.OBSERVER_CAMERA_ELEVATION_ADJUSTED;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setLightColor(9);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoWidth(320);
      assertEquals(9, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(1609);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setGroundColor(1609);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(1609);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setPhotoWidth(363);
      HomeEnvironment.Property.values();
      homeEnvironment0.setVideoWidth(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.WALLS_ALPHA;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("ALL_LEVELS_VISIBLE", propertyChangeListener0);
      Object object0 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, "ALL_LEVELS_VISIBLE", propertyChangeListenerProxy0, homeEnvironment0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setGroundColor(363);
      homeEnvironment0.setCeillingLightColor(8);
      homeEnvironment0.setCeillingLightColor(8);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("ALL_LEVELS_VISIBLE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.ALL_LEVELS_VISIBLE
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoWidth((-464));
      homeEnvironment1.getLightColor();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera(13684944, 13684944, 775.1F, 1.7777778F, 3077.3655F, 0.0F, 13684944, camera_Lens0);
      Camera camera1 = camera0.clone();
      linkedList0.add(camera1);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment1.setPhotoHeight(2618);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoQuality(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_ASPECT_RATIO;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("lRS*hW|}0u]!hbiTnXV", propertyChangeListener0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setSubpartSizeUnderLight(2618);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment1.setVideoWidth(13684944);
      homeEnvironment0.setVideoFrameRate(300);
      assertEquals(300, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setCeillingLightColor((-1164));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_TEXTURE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      homeEnvironment0.setVideoFrameRate(798);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getVideoWidth();
      homeEnvironment0.setLightColor(320);
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.setVideoFrameRate(798);
      assertEquals(798, homeEnvironment0.getVideoFrameRate());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "{E");
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1288), (HomeTexture) null, (-1288), (-1), (-1));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setGroundColor((-1288));
      homeEnvironment0.setPhotoWidth(919);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      HomeEnvironment.Property.values();
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setPhotoWidth(5);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      HomeEnvironment.Property.values();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("]LfWjf>H*c4", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setPhotoWidth(366);
      HomeEnvironment.Property.values();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      homeEnvironment0.setPhotoWidth(366);
      HomeEnvironment.Property.values();
      System.setCurrentTimeMillis(366);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(4);
      homeEnvironment0.setVideoQuality(4);
      homeEnvironment0.setVideoQuality(1866);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", (Content) null, 172.23686F, 4, "]u(<+7", false);
      CatalogTexture catalogTexture1 = new CatalogTexture("", (Content) null, 1866, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture1);
      URL uRL0 = MockURL.getHttpExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture2 = new CatalogTexture((String) null, temporaryURLContent0, 1866, 2.0F, false);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture1);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      assertEquals(4, homeEnvironment0.getVideoFrameRate());
  }
}
