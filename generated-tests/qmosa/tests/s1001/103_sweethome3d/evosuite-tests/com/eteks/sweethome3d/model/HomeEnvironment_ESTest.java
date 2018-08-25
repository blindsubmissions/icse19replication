/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 08:23:00 GMT 2018
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.eteks.sweethome3d.model.AspectRatio;
import com.eteks.sweethome3d.model.Camera;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
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
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setSkyColor(300);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setGroundColor(300);
      homeEnvironment0.setPhotoWidth(65);
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      homeEnvironment0.setPhotoHeight(65);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.getVideoHeight();
      homeEnvironment1.setWallsAlpha((-2595.7754F));
      homeEnvironment0.setPhotoQuality(0);
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.GROUND_COLOR;
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property1, (PropertyChangeListener) null);
      homeEnvironment1.getWallsAlpha();
      HomeEnvironment.Property homeEnvironment_Property2 = HomeEnvironment.Property.GROUND_TEXTURE;
      homeEnvironment2.addPropertyChangeListener(homeEnvironment_Property2, (PropertyChangeListener) null);
      assertEquals(65, homeEnvironment0.getPhotoHeight());
      assertEquals(13684944, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor(1878);
      int int0 = 1723;
      homeEnvironment0.setVideoFrameRate(1723);
      homeEnvironment0.setLightColor((-143));
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoFrameRate(1723);
      homeEnvironment0.setPhotoHeight((-143));
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment1.setVideoCameraPath(list0);
      homeEnvironment0.setGroundColor(0);
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      homeEnvironment2.setVideoQuality(0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SUBPART_SIZE_UNDER_LIGHT;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(0, homeEnvironment0.getGroundColor());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getVideoQuality();
      int int0 = 0;
      homeEnvironment0.setVideoWidth(0);
      homeEnvironment0.setPhotoHeight(1758);
      homeEnvironment0.getSubpartSizeUnderLight();
      String string0 = "";
      TexturesCategory texturesCategory0 = new TexturesCategory("");
      // Undeclared exception!
      try { 
        texturesCategory0.getTexture(1758);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1758, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      URL uRL0 = MockURL.getFtpExample();
      ResourceURLContent resourceURLContent0 = new ResourceURLContent(uRL0, false);
      CatalogTexture catalogTexture0 = new CatalogTexture("GROUND_COLOR", resourceURLContent0, 0.0F, 557.9225F);
      homeEnvironment0.setSkyColor(0);
      CatalogTexture catalogTexture1 = new CatalogTexture("GROUND_COLOR", resourceURLContent0, 0, (-5377.1396F));
      catalogTexture1.getCategory();
      catalogTexture0.setCategory((TexturesCategory) null);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      homeEnvironment0.setLightColor((-58));
      homeEnvironment0.setGroundColor((-58));
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.setGroundColor((-58));
      assertEquals(0, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.isObserverCameraElevationAdjusted();
      String string0 = "#a'~E";
      String string1 = "$6$";
      try { 
        MockURL.URL("#a'~E", "%r?*W", "#a'~E");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: #a'~e
         //
         verifyException("java.net.URL", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.getGroundColor();
      homeEnvironment1.setPhotoQuality((-1));
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment1.getLightColor();
      homeEnvironment1.getCeillingLightColor();
      homeEnvironment0.getSubpartSizeUnderLight();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.ALL_LEVELS_VISIBLE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("Tbd ao@NIglP.%", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.setVideoQuality(13684944);
      ResourceURLContent resourceURLContent0 = new ResourceURLContent((URL) null, false);
      CatalogTexture catalogTexture0 = new CatalogTexture("Super class isn't cloneable", resourceURLContent0, (-1), 1.0F, false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(13684944, homeTexture0, 13684944, 13684944, 13684944);
      homeEnvironment2.setVideoCameraPath(list0);
      Object object0 = new Object();
      Object object1 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment2, "0riJ1v;iJT1-H@n_]", object0, object1);
      propertyChangeEvent0.toString();
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.GROUND_COLOR;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment2.setVideoQuality(2156);
      assertEquals(2156, homeEnvironment2.getVideoQuality());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setSkyColor((-1021));
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getSkyColor();
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
  //Test case number: 8
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment1.setGroundColor(0);
      homeEnvironment1.getSubpartSizeUnderLight();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      URL uRL0 = MockURL.getFileExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("}T9oXG_z", "", temporaryURLContent0, 0, (-934.7502F), "IatO'{et(`zi :){ZH");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      homeEnvironment1.setSkyColor(8192);
      homeEnvironment0.setAllLevelsVisible(false);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      AspectRatio aspectRatio1 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.getDrawingMode();
      AspectRatio aspectRatio2 = AspectRatio.RATIO_3_2;
      homeEnvironment1.setVideoAspectRatio(aspectRatio2);
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment1.getVideoAspectRatio());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-289), (HomeTexture) null, (-289), (-289), 0.0F);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("}xxQ86Cf6fmQoPCd3OO", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.setSkyColor(13684944);
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.setPhotoQuality((-473));
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.setSubpartSizeUnderLight(2495.8F);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.getWallsAlpha();
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy((String) null, propertyChangeListener1);
      propertyChangeListenerProxy1.propertyChange((PropertyChangeEvent) null);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy1);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setPhotoHeight(2027);
      assertEquals(2495.8F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setWallsAlpha(655.3F);
      assertEquals(655.3F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-3562), (HomeTexture) null, (-3562), (HomeTexture) null, 11053224, 0.0F);
      homeEnvironment0.setPhotoWidth((-3562));
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.isObserverCameraElevationAdjusted();
      homeEnvironment1.getSkyColor();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_ASPECT_RATIO;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      int int0 = homeEnvironment0.getPhotoQuality();
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor((-1737));
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      AspectRatio aspectRatio1 = AspectRatio.VIEW_3D_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio VIEW_3D_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.getPhotoQuality();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      String string0 = "Z2hZ{X5";
      Class<HomeEnvironment> class0 = HomeEnvironment.class;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "Z2hZ{X5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource Z2hZ{X5
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-3562), (HomeTexture) null, (-3562), (HomeTexture) null, 11053224, 0.0F);
      homeEnvironment0.setPhotoWidth((-3562));
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setVideoWidth(11053224);
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.getSkyTexture();
      assertEquals((-3562), homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setSkyColor(300);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setGroundColor(300);
      homeEnvironment0.setPhotoWidth(65);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.setWallsAlpha(300);
      assertEquals(300, homeEnvironment0.getSkyColor());
      assertEquals(13684944, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment1.setGroundColor(0);
      homeEnvironment1.getSubpartSizeUnderLight();
      URL uRL0 = MockURL.getFileExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("}T9oXG_z", "", temporaryURLContent0, 0, (-934.7502F), "IatO'{et(`zi :){ZH");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      homeEnvironment1.setSkyColor(8192);
      assertEquals(AspectRatio.RATIO_4_3, homeEnvironment1.getPhotoAspectRatio());
      
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(8192, homeTexture0, 8192, 65, 599.99F);
      homeEnvironment2.setVideoWidth(320);
      assertEquals(599.99F, homeEnvironment2.getWallsAlpha(), 0.01F);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setAllLevelsVisible(true);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("uJz^e", propertyChangeListener0);
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy(" He2uay?fl", propertyChangeListenerProxy0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.WALLS_ALPHA;
      PropertyChangeListenerProxy propertyChangeListenerProxy2 = new PropertyChangeListenerProxy("Y6`Dx", propertyChangeListenerProxy1);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy2);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.getDrawingMode();
      AspectRatio aspectRatio1 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.253857589601352
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = 2;
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera camera0 = new Camera(882.41F, 2, 2, 882.41F, 2, 2483.1233F);
      linkedList0.add(camera0);
      linkedList0.toArray();
      linkedList0.toArray();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setCeillingLightColor((-1569));
      homeEnvironment0.setPhotoHeight(2);
      homeEnvironment0.setPhotoHeight(2);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setSkyColor(2);
      homeEnvironment0.setSkyColor(2);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoWidth(2);
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("qh;t=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.qh;t=
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("we:P=sz-f!d7n?", uRLContent0, 2.0F, 2.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(264, homeTexture0, 264, homeTexture0, 2940, 264);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera(1.8F, (-1440.552F), 1.8F, 1287.1398F, 2940, (-3277.0823F), (-2582L), camera_Lens0);
      linkedList0.add(camera0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setCeillingLightColor(2483);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.getPhotoQuality();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.getGroundColor();
      homeEnvironment0.getVideoAspectRatio();
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
      assertEquals(300, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("we:P=sz-f!d7n?", uRLContent0, 2.0F, 2.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(264, homeTexture0, 264, homeTexture0, 2940, 264);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera((-247.08784F), (-1440.552F), (-247.08784F), 1287.1398F, 2940, (-3285.65F), (-2582L), camera_Lens0);
      linkedList0.add(camera0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setCeillingLightColor(2483);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.getPhotoQuality();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setLightColor(4);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setLightColor(2483);
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.setWallsAlpha((-2595.7754F));
      assertEquals(2483, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.pollLast();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setSkyColor((-2233));
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoWidth(0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setPhotoWidth(3404);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setWallsAlpha(0);
      homeEnvironment0.setLightColor(0);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment();
      homeEnvironment1.setSkyColor(400);
      homeEnvironment1.setAllLevelsVisible(false);
      homeEnvironment0.setPhotoWidth(400);
      homeEnvironment1.setSkyColor(400);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment1.setCeillingLightColor(1013);
      assertEquals(400, homeEnvironment1.getSkyColor());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeEnvironment.Property.valueOf("GROUND_TEXTURE");
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      Camera camera0 = new Camera(879.3485F, 879.3485F, 1.5F, 879.3485F, (-1573.5226F), 879.3485F);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.add((Camera) null);
      linkedList0.add((Camera) null);
      linkedList0.toArray();
      LinkedList<Camera> linkedList1 = new LinkedList<Camera>();
      linkedList1.toArray();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setCeillingLightColor((-2146742392));
      homeEnvironment0.setPhotoHeight((-2146742392));
      homeEnvironment0.setPhotoHeight((-3108));
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoWidth((-586));
      homeEnvironment0.setSkyColor((-3108));
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setCeillingLightColor((-2146742392));
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.4036404106149494
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera camera0 = new Camera(879.3485F, 2, 2, 879.3485F, 2, 2483.1233F);
      linkedList0.add(camera0);
      linkedList0.toArray();
      linkedList0.toArray();
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.setCeillingLightColor((-1569));
      homeEnvironment0.setPhotoHeight(2);
      homeEnvironment0.setPhotoHeight(8);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setSkyColor(8);
      homeEnvironment0.setSkyColor(2);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoWidth(8);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getLightColor();
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setCeillingLightColor(8);
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-1920);
      URLContent uRLContent0 = new URLContent((URL) null);
      CatalogTexture catalogTexture0 = new CatalogTexture("(*0z}<Zw`", uRLContent0, (-914.1F), (-914.1F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1920), homeTexture0, (-2239), homeTexture0, (-2239), (-1920));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_QUALITY;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment();
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(1797, homeTexture0, 1393, homeTexture1, (-2239), (-2239));
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment1, "(*0z}<Zw`", (Object) null, homeEnvironment2);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setLightColor((-2239));
      HomeEnvironment.DrawingMode.values();
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.143952200643869
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("we:P=sz-f!d7n?", uRLContent0, 2.0F, 2.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      linkedList0.toArray();
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2940, homeTexture0, 280, homeTexture1, 4, 280);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoCameraPath((List<Camera>) null);
      homeEnvironment0.setCeillingLightColor((-1569));
      homeEnvironment0.setPhotoHeight((-143));
      homeEnvironment0.setPhotoHeight((-1706));
      HomeEnvironment.DrawingMode.values();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment((-143), homeTexture1, 280, (-1706), 2.0F);
      homeEnvironment2.setSkyColor(2940);
      homeEnvironment0.setSkyColor(46);
      homeEnvironment1.setAllLevelsVisible(true);
      homeEnvironment2.setPhotoWidth(5);
      homeEnvironment0.setSkyColor((-2075));
      HomeEnvironment.DrawingMode.values();
      homeEnvironment2.setLightColor(8192);
      LinkedList<Camera> linkedList1 = new LinkedList<Camera>();
      homeEnvironment0.setVideoCameraPath(linkedList1);
      assertEquals((-1569), homeEnvironment0.getCeillingLightColor());
  }
}
