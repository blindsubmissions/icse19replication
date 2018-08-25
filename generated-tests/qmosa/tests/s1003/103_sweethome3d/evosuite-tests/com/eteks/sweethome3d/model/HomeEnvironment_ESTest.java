/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:47:49 GMT 2018
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
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, false);
      CatalogTexture catalogTexture0 = new CatalogTexture("", resourceURLContent0, 300, 300);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(300, homeTexture0, 300, homeTexture0, 1131, (-799.4F));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setSkyColor(17);
      assertEquals(17, homeEnvironment1.getSkyColor());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("", (Content) null, 1.0F, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      TexturesCategory texturesCategory0 = new TexturesCategory("]xRcu8{a2.)JDI");
      catalogTexture0.setCategory(texturesCategory0);
      int int0 = 15;
      catalogTexture0.setCategory(texturesCategory0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, 15, 0, 0.0F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setSkyTexture(homeTexture0);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      homeEnvironment0.setAllLevelsVisible(true);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("a)aaH", propertyChangeListener0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      // Undeclared exception!
      try { 
        homeEnvironment1.setVideoAspectRatio(aspectRatio0);
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
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-71), (HomeTexture) null, (-1636), 2, 1.0F);
      homeEnvironment0.setVideoQuality((-71));
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.setPhotoWidth(0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.getPhotoWidth();
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      HomeEnvironment.Property.values();
      homeEnvironment1.isObserverCameraElevationAdjusted();
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray1 = HomeEnvironment.DrawingMode.values();
      assertNotSame(homeEnvironment_DrawingModeArray1, homeEnvironment_DrawingModeArray0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.CEILING_LIGHT_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("p!eY59he!k)_66wj", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("%yP3", "", homeEnvironment0, homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      Object object0 = new Object();
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent(homeEnvironment1, "%yP3", homeEnvironment1, object0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setPhotoQuality(1408);
      homeEnvironment1.setPhotoHeight(1408);
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setSubpartSizeUnderLight(25);
      homeEnvironment0.getSkyColor();
      homeEnvironment1.setSubpartSizeUnderLight(0.0F);
      homeEnvironment0.getPhotoAspectRatio();
      boolean boolean0 = homeEnvironment1.isObserverCameraElevationAdjusted();
      assertEquals(25.0F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setVideoFrameRate(1455);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment0.setPhotoQuality((-1853));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setVideoQuality(2);
      homeEnvironment0.setPhotoHeight(19);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.clone();
      assertEquals(2, homeEnvironment0.getVideoQuality());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getPhotoWidth();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.WALLS_ALPHA;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("s,mFVjqy", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.setPhotoHeight(400);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.getPhotoAspectRatio();
      int int0 = homeEnvironment0.getCeillingLightColor();
      assertEquals(400, homeEnvironment0.getPhotoHeight());
      assertEquals(13684944, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("", (Content) null, 0, (-620.6487F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, (-1341), 6, 0.0F);
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals((-1341), homeEnvironment0.getSkyColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(6, homeEnvironment0.getLightColor());
      assertEquals(0, int0);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = 0;
      homeEnvironment0.setLightColor(0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.getVideoCameraPath();
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.setCeillingLightColor(0);
      AspectRatio aspectRatio2 = AspectRatio.RATIO_4_3;
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setPhotoWidth(0);
      AspectRatio aspectRatio3 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio3);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio2);
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.isAllLevelsVisible();
      HomeEnvironment.DrawingMode.values();
      String string0 = "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode";
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(classLoader0, "RATIO_2_1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource RATIO_2_1
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, (HomeTexture) null, 0, 0.0F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      boolean boolean0 = homeEnvironment0.isObserverCameraElevationAdjusted();
      assertTrue(boolean0);
      
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      assertEquals(0.0F, float0, 0.01F);
      
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.valueOf("WALLS_ALPHA");
      HomeEnvironment.Property.values();
      homeEnvironment1.setVideoQuality(0);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("WALLS_ALPHA", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(0, homeEnvironment1.getLightColor());
      assertEquals(25, homeEnvironment1.getVideoFrameRate());
      assertEquals(0.0F, homeEnvironment1.getWallsAlpha(), 0.01F);
      assertEquals(13684944, homeEnvironment1.getCeillingLightColor());
      assertEquals(0, homeEnvironment1.getVideoQuality());
      assertEquals(0, homeEnvironment1.getSkyColor());
      assertEquals(300, homeEnvironment1.getPhotoHeight());
      assertEquals(0, homeEnvironment1.getGroundColor());
      assertEquals(320, homeEnvironment1.getVideoWidth());
      assertEquals(400, homeEnvironment1.getPhotoWidth());
      assertNotSame(homeEnvironment1, homeEnvironment2);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, (-1701), 4988, 0);
      homeEnvironment0.setSubpartSizeUnderLight(4988);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setVideoQuality(0);
      assertEquals(4988.0F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.8133554045006157
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setSubpartSizeUnderLight((-1150.0F));
      homeEnvironment0.setAllLevelsVisible(true);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoWidth(1245);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setSkyColor(1245);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setSkyColor((-1));
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.setLightColor((-1));
      int int0 = homeEnvironment0.getVideoHeight();
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
      assertEquals(934, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.458311329683084
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment1.setVideoQuality(14);
      homeEnvironment1.setWallsAlpha(0.0F);
      homeEnvironment1.setGroundColor(14);
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setVideoQuality(2);
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setVideoFrameRate(2);
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment1.setAllLevelsVisible(true);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setSubpartSizeUnderLight((-1.0F));
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setSubpartSizeUnderLight((-1237.0F));
      homeEnvironment0.getSkyTexture();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setPhotoQuality(13427964);
      homeEnvironment0.getLightColor();
      HomeEnvironment.Property.values();
      homeEnvironment0.getSkyColor();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getDrawingMode();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      int int0 = homeEnvironment0.getPhotoHeight();
      assertTrue(homeEnvironment0.isAllLevelsVisible());
      assertEquals(300, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-71), (HomeTexture) null, (-1636), 2, 1.0F);
      homeEnvironment0.setVideoQuality((-71));
      homeEnvironment0.setVideoWidth(2);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getSkyTexture();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(2, (HomeTexture) null, 1245, (HomeTexture) null, (-2145747605), 0.0F);
      homeEnvironment1.setSkyColor(2);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment1.setSkyColor(1);
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment1.setLightColor(12);
      homeEnvironment1.getVideoHeight();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.getGroundTexture();
      assertEquals(1, homeEnvironment1.getSkyColor());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment.Property.values();
      CatalogTexture catalogTexture0 = new CatalogTexture("", (Content) null, (-2636), (-1182.4182F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-2636), homeTexture0, (-2636), (-2636), 1.7777778F);
      homeEnvironment0.setSkyColor((-774));
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-774), homeTexture0, (-774), homeTexture0, 12, (-1098.116F));
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      List<Camera> list0 = homeEnvironment2.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      assertEquals((-774), homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.615630577027551
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setSubpartSizeUnderLight((-1.0F));
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setSubpartSizeUnderLight((-1237.0F));
      homeEnvironment0.getSkyTexture();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.getSkyColor();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("&", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setGroundColor(1241);
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.ALL_LEVELS_VISIBLE;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment1.setVideoQuality(26);
      homeEnvironment1.setGroundColor(26);
      homeEnvironment1.setWallsAlpha(0.0F);
      homeEnvironment1.setGroundColor(26);
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.setVideoQuality(2);
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setVideoFrameRate(2);
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment1.setAllLevelsVisible(true);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(11053224, (HomeTexture) null, 8192, 0, (-1636));
      homeEnvironment0.setVideoQuality((-1636));
      homeEnvironment1.setVideoFrameRate(11053224);
      homeEnvironment1.setPhotoWidth(240);
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment2.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment2.getPhotoWidth();
      HomeEnvironment.DrawingMode.values();
      HomeEnvironment homeEnvironment3 = new HomeEnvironment((-556), (HomeTexture) null, 7, 7, 0.0F);
      homeEnvironment3.setObserverCameraElevationAdjusted(true);
      HomeEnvironment.Property.values();
      homeEnvironment3.isObserverCameraElevationAdjusted();
      HomeEnvironment.DrawingMode.values();
      homeEnvironment1.setWallsAlpha((-1255.06F));
      assertEquals((-1255.06F), homeEnvironment1.getWallsAlpha(), 0.01F);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.4410152780267023
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      int int0 = (-1896);
      homeEnvironment1.setCeillingLightColor((-1896));
      homeEnvironment1.setCeillingLightColor((-1896));
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      boolean boolean0 = false;
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.setPhotoWidth((-1896));
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      AspectRatio aspectRatio1 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment0.setPhotoWidth(11);
      homeEnvironment1.isAllLevelsVisible();
      HomeEnvironment.DrawingMode.values();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(classLoader0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoQuality();
      String string0 = "{y:S;.cv{TnDk3q1,L";
      Class<HomeEnvironment> class0 = HomeEnvironment.class;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "P[MkRU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource P[MkRU
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.setPhotoHeight(240);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      Object object0 = new Object();
      Camera camera0 = new Camera(240, (-608.2F), (-1255.06F), 240, 0.0F, (-608.2F));
      homeEnvironment0.setPhotoHeight(240);
      homeEnvironment0.setVideoFrameRate((-3779));
      HomeEnvironment.Property[] homeEnvironment_PropertyArray0 = HomeEnvironment.Property.values();
      assertEquals(20, homeEnvironment_PropertyArray0.length);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getSubpartSizeUnderLight();
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, true);
      CatalogTexture catalogTexture0 = new CatalogTexture("", resourceURLContent0, 348, 0.0F, false);
      CatalogTexture catalogTexture1 = new CatalogTexture("", "~[#<8 SU\"/qe`", (Content) null, 3479.6453F, 3215.9F, "~[#<8 SU\"/qe`");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture1);
      CatalogTexture catalogTexture2 = new CatalogTexture("~[#<8 SU\"/qe`", "", (Content) null, 300, 3646.65F, "0Ygx");
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture2);
      HomeTexture homeTexture2 = new HomeTexture(homeTexture0);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-2154), homeTexture2, (-1896), 348, 4);
      homeEnvironment1.setGroundTexture(homeTexture1);
      homeEnvironment1.setLightColor(300);
      homeEnvironment0.setSkyTexture(homeTexture0);
      Random.setNextRandom(2);
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray1 = HomeEnvironment.DrawingMode.values();
      assertNotSame(homeEnvironment_DrawingModeArray1, homeEnvironment_DrawingModeArray0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.8310204811135162
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "V'a:~");
      homeEnvironment0.setGroundColor(400);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "w&kO!)tH<oA5&(1");
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setPhotoHeight(197);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(197, homeEnvironment0.getPhotoHeight());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getSubpartSizeUnderLight();
      MockURL.getFtpExample();
      homeEnvironment0.setVideoWidth(2835);
      homeEnvironment0.setVideoWidth(2835);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setVideoWidth(17);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-2145747605), (HomeTexture) null, (-2145747605), (HomeTexture) null, (-2145747605), 0.0F);
      homeEnvironment1.setSkyColor((-2145747605));
      homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setSkyColor((-2145747605));
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.setLightColor(300);
      homeEnvironment0.getVideoHeight();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment();
      homeEnvironment2.setObserverCameraElevationAdjusted(true);
      HomeEnvironment homeEnvironment3 = new HomeEnvironment(8192, (HomeTexture) null, 3757, (HomeTexture) null, 3757, 3757);
      homeEnvironment3.setVideoWidth(721);
      homeEnvironment3.setVideoFrameRate(8192);
      System.setCurrentTimeMillis(2835);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.CEILING_LIGHT_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("p!eY59he!k)_66wj", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("%yP3", "", homeEnvironment0, homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      Object object0 = new Object();
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent(homeEnvironment1, "%yP3", homeEnvironment1, object0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getPhotoWidth();
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      HomeEnvironment.Property.values();
      homeEnvironment1.isObserverCameraElevationAdjusted();
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
      
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "OBSERVER_CAMERA_ELEVATION_ADJUSTED");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2139, (HomeTexture) null, 2139, 2139, 4988.0F);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setVideoWidth(11053224);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoCameraPath((List<Camera>) null);
      assertEquals(11053224, homeEnvironment0.getVideoWidth());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.CEILING_LIGHT_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("p!eY59he!k)_66wj", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("%yP3", "", homeEnvironment0, homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      Object object0 = new Object();
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent(homeEnvironment1, "%yP3", homeEnvironment1, object0);
      propertyChangeEvent1.setPropagationId(propertyChangeEvent0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setLightColor(19);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setVideoWidth(19);
      homeEnvironment1.setVideoFrameRate(15);
      System.setCurrentTimeMillis(1L);
      homeEnvironment1.setLightColor(19);
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.3114234446919735
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "OBSERVER_CAMERA_ELEVATION_ADJUSTED");
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(19);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setVideoWidth((-1537));
      homeEnvironment0.setVideoFrameRate(19);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setVideoWidth(387);
      HomeEnvironment.Property.valueOf("OBSERVER_CAMERA_ELEVATION_ADJUSTED");
      homeEnvironment0.setVideoFrameRate(19);
      assertEquals(19, homeEnvironment0.getVideoFrameRate());
  }
}