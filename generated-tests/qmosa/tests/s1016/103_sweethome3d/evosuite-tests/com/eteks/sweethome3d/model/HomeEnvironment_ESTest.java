/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:41:04 GMT 2018
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
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(13427964, (HomeTexture) null, 13427964, 13, 13427964);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("f", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment0, "SUBPART_SIZE_UNDER_LIGHT", (Object) null, "f");
      Camera camera0 = new Camera(13427964, 13, 0.0F, 13427964, 0.0F, 0.0F);
      propertyChangeEvent0.setPropagationId(camera0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setVideoQuality(0);
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.isObserverCameraElevationAdjusted();
      HomeEnvironment.Property.values();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getVideoWidth();
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
  //Test case number: 1
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundColor(1898);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("FDrN+B20&BN;C*\"", propertyChangeListener0);
      Camera.Lens camera_Lens0 = Camera.Lens.NORMAL;
      Camera camera0 = new Camera(1.5F, (-897.0F), (-1133.0F), (-1758), 0.0F, (-83.9805F), 3719L, camera_Lens0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment0, "FDrN+B20&BN;C*\"", camera0, homeEnvironment_Property0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setCeillingLightColor((-1758));
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.getLightColor();
      homeEnvironment0.getGroundColor();
      homeEnvironment0.setLightColor((-1758));
      assertEquals((-1758), homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.clone();
      int int0 = 2094;
      homeEnvironment0.setPhotoQuality(2094);
      homeEnvironment0.setLightColor(4371);
      String string0 = "tQ[d~/x";
      Class<Integer> class0 = Integer.class;
      String string1 = "+";
      boolean boolean0 = false;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "+", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource +
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setGroundColor((-275));
      homeEnvironment0.setPhotoQuality(181);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setVideoWidth(1);
      homeEnvironment0.getWallsAlpha();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getVideoQuality();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("wkb:", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.getSkyColor();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment1, "Gy!X=tK_/\"KZq", (Object) null, aspectRatio0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.setSkyColor(13427964);
      homeEnvironment0.setVideoQuality(181);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setPhotoHeight(481);
      assertEquals(0, homeEnvironment0.getGroundColor());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1520), (HomeTexture) null, (-1520), (HomeTexture) null, (-1520), 2.0F);
      homeEnvironment0.setVideoWidth(3857);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_ASPECT_RATIO;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      Object object0 = new Object();
      Camera camera0 = new Camera(3857, 2.0F, 2.0F, 2.0F, 1.5F, (-1201.0F));
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, (String) null, homeEnvironment_Property0, camera0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setLightColor(16);
      assertEquals(16, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getWallsAlpha();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.setSkyColor(400);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.getPhotoAspectRatio();
      // Undeclared exception!
      try { 
        AspectRatio.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.AspectRatio.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(0);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setPhotoWidth(25);
      homeEnvironment0.getSkyColor();
      homeEnvironment0.getDrawingMode();
      assertEquals(25, homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_TEXTURE;
      homeEnvironment1.setSubpartSizeUnderLight(1.5F);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("B7])1", propertyChangeListener0);
      homeEnvironment1.setPhotoHeight(2565);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      homeEnvironment0.setCeillingLightColor(1551);
      homeEnvironment2.setPhotoQuality(1022);
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment1.getVideoCameraPath();
      homeEnvironment2.setLightColor(1551);
      homeEnvironment2.setGroundColor(0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.getVideoWidth();
      homeEnvironment2.setVideoWidth(320);
      homeEnvironment2.getVideoFrameRate();
      homeEnvironment0.setVideoQuality(25);
      homeEnvironment1.setPhotoWidth(0);
      homeEnvironment1.setSubpartSizeUnderLight(1551);
      homeEnvironment1.getSkyColor();
      homeEnvironment2.isAllLevelsVisible();
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setVideoWidth(320);
      assertEquals(0, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.setPhotoWidth(14);
      homeEnvironment0.setVideoWidth(1);
      homeEnvironment0.setLightColor(5);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setSkyColor(2);
      homeEnvironment1.setSkyColor(5);
      homeEnvironment1.getVideoHeight();
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setPhotoHeight(1160);
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getPhotoQuality();
      AspectRatio aspectRatio1 = homeEnvironment1.getVideoAspectRatio();
      homeEnvironment1.setVideoAspectRatio(aspectRatio1);
      assertEquals(1160, homeEnvironment0.getPhotoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2767, (HomeTexture) null, 0, 0, 0.0F);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoWidth((-2739));
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setPhotoHeight(1744);
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.setGroundTexture((HomeTexture) null);
      HomeEnvironment.DrawingMode.values();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_4_3;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setGroundColor(975);
      homeEnvironment0.getPhotoHeight();
      HomeEnvironment.Property.values();
      homeEnvironment0.setSubpartSizeUnderLight(1857.8059F);
      homeEnvironment0.getLightColor();
      int int0 = homeEnvironment0.getVideoQuality();
      assertEquals((-2054), homeEnvironment0.getVideoHeight());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.setPhotoWidth(18);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_16_9;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment1.setSkyColor(18);
      homeEnvironment0.setWallsAlpha(1.3333334F);
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment1.getVideoQuality();
      homeEnvironment0.getSkyColor();
      homeEnvironment0.setPhotoHeight(18);
      homeEnvironment0.setSubpartSizeUnderLight(2887.34F);
      homeEnvironment1.getVideoAspectRatio();
      homeEnvironment1.isObserverCameraElevationAdjusted();
      homeEnvironment1.setWallsAlpha(0);
      homeEnvironment1.setPhotoHeight(0);
      homeEnvironment0.setVideoFrameRate(257);
      assertEquals(2887.34F, homeEnvironment0.getSubpartSizeUnderLight(), 0.01F);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setVideoQuality((-3407));
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setCeillingLightColor(204);
      homeEnvironment0.setVideoFrameRate(5);
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      String string0 = null;
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
  //Test case number: 13
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = 0.0F;
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      homeEnvironment0.getPhotoWidth();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      homeEnvironment0.setVideoFrameRate(0);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("-,Yx", propertyChangeListener0);
      homeEnvironment0.setVideoFrameRate(8192);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment_Property0, "-,Yx", "-,Yx", homeEnvironment0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.setLightColor(0);
      propertyChangeListenerProxy0.propertyChange((PropertyChangeEvent) null);
      propertyChangeListenerProxy0.propertyChange((PropertyChangeEvent) null);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf("-,Yx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.Property.-,Yx
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, (-1979), (HomeTexture) null, 0, (-1979));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setLightColor(0);
      homeEnvironment1.setAllLevelsVisible(false);
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment0.setLightColor(2550);
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera camera0 = new Camera(3207.6978F, 2550, (-318.87515F), 0.0F, 1.5F, 0);
      linkedList0.add(camera0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.setVideoQuality(0);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment0.getVideoAspectRatio();
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment1.setSkyColor(0);
      homeEnvironment0.getVideoFrameRate();
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment1.setSubpartSizeUnderLight(0);
      assertEquals(2550, homeEnvironment0.getLightColor());
      assertEquals(0, homeEnvironment1.getPhotoQuality());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.9785084205272367
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(975, (HomeTexture) null, (-408), 975, 2.0F);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment2, "", propertyChangeListenerProxy0, homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setSubpartSizeUnderLight((-2229.0F));
      HomeEnvironment homeEnvironment3 = homeEnvironment1.clone();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment3.setVideoCameraPath(list0);
      homeEnvironment0.setCeillingLightColor(3155);
      homeEnvironment1.setPhotoHeight(3155);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.setPhotoWidth(3155);
      homeEnvironment1.getPhotoHeight();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment3.getCeillingLightColor();
      homeEnvironment3.setSkyColor(3155);
      homeEnvironment0.setGroundColor((-1285));
      homeEnvironment1.setCeillingLightColor(0);
      homeEnvironment0.setVideoFrameRate((-2375));
      homeEnvironment3.getCeillingLightColor();
      URLContent uRLContent0 = new URLContent((URL) null);
      CatalogTexture catalogTexture0 = new CatalogTexture("", "", uRLContent0, 2259.8276F, 2259.8276F, "K*t5:=0I'EAc ", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment3.setSkyTexture(homeTexture0);
      assertEquals(3155, homeEnvironment1.getPhotoHeight());
      assertEquals((-1285), homeEnvironment0.getGroundColor());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.9124944033310514
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_CAMERA_PATH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setSubpartSizeUnderLight((-2229.0F));
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment2.setVideoCameraPath(list0);
      homeEnvironment0.setCeillingLightColor(3155);
      homeEnvironment1.setPhotoHeight(3155);
      homeEnvironment1.setPhotoHeight(3155);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      homeEnvironment1.setPhotoWidth(3155);
      homeEnvironment1.getPhotoHeight();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment2.getCeillingLightColor();
      homeEnvironment2.setSkyColor(3155);
      homeEnvironment0.setGroundColor((-1285));
      homeEnvironment1.setCeillingLightColor(0);
      homeEnvironment1.setVideoFrameRate(0);
      int int0 = homeEnvironment1.getCeillingLightColor();
      assertEquals(3155, homeEnvironment1.getPhotoHeight());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.9264175554979963
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2767, (HomeTexture) null, 0, 0, 0.0F);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoWidth((-2739));
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.getSkyTexture();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment(0, (HomeTexture) null, 13427964, (HomeTexture) null, 0, 0);
      homeEnvironment1.setCeillingLightColor((-2739));
      homeEnvironment0.setPhotoHeight((-2165));
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.setPhotoWidth(13427964);
      homeEnvironment1.getPhotoHeight();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment1.getCeillingLightColor();
      homeEnvironment1.setSkyColor((-2739));
      HomeEnvironment homeEnvironment2 = new HomeEnvironment();
      homeEnvironment2.setGroundColor(300);
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment1.setVideoFrameRate((-219));
      int int0 = homeEnvironment2.getCeillingLightColor();
      assertEquals(300, homeEnvironment2.getGroundColor());
      assertEquals(13684944, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setPhotoQuality(181);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setVideoWidth(1);
      homeEnvironment0.getWallsAlpha();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getVideoFrameRate();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setGroundColor(1);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setPhotoWidth(400);
      homeEnvironment1.getSkyColor();
      homeEnvironment1.getDrawingMode();
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment1.setPhotoWidth(862);
      assertEquals(1, homeEnvironment0.getVideoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight((-1520));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setPhotoHeight(15);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment((-1520), (HomeTexture) null, (-859), (-1520), 2236.5F);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      HomeEnvironment homeEnvironment3 = new HomeEnvironment();
      homeEnvironment3.setPhotoWidth((-1520));
      homeEnvironment2.getPhotoHeight();
      homeEnvironment3.isAllLevelsVisible();
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      HomeEnvironment homeEnvironment4 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(15);
      homeEnvironment2.getPhotoHeight();
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment4.getCeillingLightColor();
      homeEnvironment3.setSkyColor(300);
      homeEnvironment2.setGroundColor(1895);
      homeEnvironment2.setCeillingLightColor(13684944);
      HomeEnvironment homeEnvironment5 = new HomeEnvironment();
      homeEnvironment1.setVideoFrameRate((-2783));
      homeEnvironment2.getCeillingLightColor();
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setCeillingLightColor((-1520));
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0280290733074104
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getPhotoWidth();
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setGroundColor((-275));
      homeEnvironment0.setPhotoQuality(181);
      homeEnvironment0.setGroundColor(0);
      homeEnvironment0.setVideoWidth(1);
      homeEnvironment0.getWallsAlpha();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getVideoQuality();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("wkb:", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.getSkyColor();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment1, "wkb:", (Object) null, aspectRatio0);
      propertyChangeEvent0.setPropagationId(propertyChangeListenerProxy0);
      propertyChangeEvent0.setPropagationId(homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.getGroundColor();
      homeEnvironment0.setSkyColor(13427964);
      homeEnvironment0.setVideoQuality(181);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      HomeEnvironment.DrawingMode.values();
      homeEnvironment0.setPhotoHeight(481);
      homeEnvironment1.setVideoFrameRate((-1758));
      homeEnvironment1.setVideoCameraPath((List<Camera>) null);
      assertEquals(181, homeEnvironment0.getPhotoQuality());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.615630577027551
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("#*`", "#*`", (Content) null, (-2871), (-1.0F), "", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-859), homeTexture0, (-4152), (-2871), (-1.0F));
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment();
      homeEnvironment1.setPhotoWidth((-4152));
      homeEnvironment1.getPhotoHeight();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setGroundColor(0);
      homeEnvironment1.setPhotoHeight((-4152));
      homeEnvironment1.setCeillingLightColor(0);
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(300, homeTexture0, 13684944, (-4152), 300);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("OUTLINE", propertyChangeListener0);
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy("#*`", propertyChangeListenerProxy0);
      homeEnvironment1.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setVideoFrameRate((-859));
      homeEnvironment1.getCeillingLightColor();
      HomeEnvironment.DrawingMode.values();
      homeEnvironment2.setCeillingLightColor(936);
      homeEnvironment0.setGroundTexture(homeTexture0);
      homeEnvironment1.setGroundTexture(homeTexture0);
      assertEquals((-4152), homeEnvironment1.getPhotoHeight());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate((-681));
      homeEnvironment0.setVideoFrameRate((-681));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.getCeillingLightColor();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment();
      homeEnvironment1.getCeillingLightColor();
      String string0 = "*=e  `S4!iGb`z";
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent((ClassLoader) null, "*=e  `S4!iGb`z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }
}