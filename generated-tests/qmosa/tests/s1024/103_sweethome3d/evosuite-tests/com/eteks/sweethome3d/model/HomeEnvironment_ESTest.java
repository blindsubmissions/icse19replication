/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:00:15 GMT 2018
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
import com.eteks.sweethome3d.model.TextureImage;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_ASPECT_RATIO;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setLightColor(1620);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setSubpartSizeUnderLight(3063.5076F);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setPhotoHeight(1620);
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getGroundColor();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode2 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setVideoFrameRate(11053224);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode2);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.setPhotoQuality(11053224);
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      HomeEnvironment.Property.values();
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      HomeEnvironment.Property.values();
      homeEnvironment0.setCeillingLightColor(180);
      homeEnvironment0.setVideoFrameRate(0);
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, (-4020), (-290), 0);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getVideoHeight();
      HomeEnvironment.Property[] homeEnvironment_PropertyArray0 = HomeEnvironment.Property.values();
      assertEquals(20, homeEnvironment_PropertyArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = 460;
      homeEnvironment0.setPhotoQuality(460);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      homeEnvironment0.setWallsAlpha(460);
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("8'fF,chm5qWSD3%wgEc", propertyChangeListener0);
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent("8'fF,chm5qWSD3%wgEc", "8'fF,chm5qWSD3%wgEc", homeEnvironment_Property0, homeEnvironment0);
      Camera.Lens camera_Lens0 = Camera.Lens.PINHOLE;
      Camera camera0 = new Camera(1.7777778F, 0.0F, 1104.51F, 460, (-61.29353F), 0.0F, 0L, camera_Lens0);
      Camera camera1 = camera0.clone();
      propertyChangeEvent0.setPropagationId(camera1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getVideoAspectRatio();
      homeEnvironment0.getPhotoHeight();
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
  //Test case number: 3
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getPhotoWidth();
      int int0 = 18;
      homeEnvironment0.setVideoFrameRate(18);
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.isObserverCameraElevationAdjusted();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.getPhotoAspectRatio();
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
  //Test case number: 4
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.DRAWING_MODE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("system protocol handler", propertyChangeListener0);
      Object object0 = new Object();
      Object object1 = new Object();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(object0, "system protocol handler", object1, "system protocol handler");
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent(homeEnvironment_Property0, "system protocol handler", "system protocol handler", "system protocol handler");
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals(0, homeEnvironment0.getSkyColor());
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.getGroundColor();
      homeEnvironment1.getSkyColor();
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("+P:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.+P:
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 0;
      HomeTexture homeTexture0 = null;
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, (HomeTexture) null, 0, 0, 0);
      homeEnvironment0.setPhotoQuality(0);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 6;
      float float0 = (-226.72443F);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(6, (HomeTexture) null, 13427964, 13684944, (-226.72443F));
      homeEnvironment0.setPhotoHeight(2532);
      homeEnvironment0.setSkyColor(13684944);
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
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
  //Test case number: 8
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.setPhotoQuality(13684944);
      homeEnvironment0.getGroundTexture();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setCeillingLightColor(13684944);
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoWidth((-723));
      homeEnvironment1.setVideoFrameRate(3077);
      homeEnvironment1.getPhotoHeight();
      homeEnvironment1.getVideoHeight();
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.getSubpartSizeUnderLight();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      assertEquals(13684944, homeEnvironment0.getPhotoQuality());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getLightColor();
      String string0 = "";
      try { 
        MockURL.URL("", "h5w", "h5w");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoQuality(823);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setLightColor(1709);
      homeEnvironment0.setCeillingLightColor(1709);
      homeEnvironment1.setAllLevelsVisible(true);
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      HomeEnvironment homeEnvironment3 = homeEnvironment0.clone();
      homeEnvironment1.setVideoFrameRate(2170);
      homeEnvironment1.setVideoQuality(0);
      homeEnvironment0.setGroundColor(2170);
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setPhotoWidth(2170);
      homeEnvironment3.setLightColor(2170);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment2.isObserverCameraElevationAdjusted();
      homeEnvironment2.setVideoCameraPath(list0);
      homeEnvironment3.setPhotoWidth((-1766));
      homeEnvironment2.getVideoAspectRatio();
      homeEnvironment3.getGroundColor();
      homeEnvironment1.getVideoAspectRatio();
      homeEnvironment0.setSkyColor(1709);
      homeEnvironment0.setSkyColor(734);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy(")R/#^KZAWkh", propertyChangeListener0);
      homeEnvironment3.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(1709, homeEnvironment0.getCeillingLightColor());
      assertEquals(11053224, homeEnvironment3.getGroundColor());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getVideoQuality();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setGroundColor((-300));
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setPhotoQuality(0);
      int int0 = 320;
      homeEnvironment0.setVideoWidth(320);
      AspectRatio aspectRatio1 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setVideoWidth(1130);
      homeEnvironment0.setPhotoAspectRatio(aspectRatio1);
      String string0 = "[[5PQ?";
      Class<String> class0 = String.class;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "vVoQt;%uAl");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource vVoQt;%uAl
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.setLightColor(2345);
      homeEnvironment0.setVideoFrameRate(0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setWallsAlpha((-1518.2759F));
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.getCeillingLightColor();
      homeEnvironment0.setVideoFrameRate((-337));
      HomeEnvironment.Property.values();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_HEIGHT;
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("eiu4,<um'", (PropertyChangeListener) null);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.getPhotoWidth();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      HomeEnvironment.DrawingMode.values();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode2 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode2);
      homeEnvironment0.setSkyColor(13684944);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setLightColor(2097);
      assertEquals(HomeEnvironment.DrawingMode.OUTLINE, homeEnvironment0.getDrawingMode());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setCeillingLightColor((-5609));
      AspectRatio aspectRatio1 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment1.setPhotoAspectRatio(aspectRatio1);
      assertEquals((-5609), homeEnvironment1.getCeillingLightColor());
      
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_FRAME_RATE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("*u9RB$|fK1q;", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-78), (HomeTexture) null, (-1036), (HomeTexture) null, 14, 0.0F);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-1036), (HomeTexture) null, 14, (-78), 14);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>(list0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoWidth((-78));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("(&-J*", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals((-78), homeEnvironment0.getPhotoWidth());
      
      homeEnvironment1.getSkyTexture();
      assertEquals((-1036), homeEnvironment1.getGroundColor());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.351673301904631
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-78), (HomeTexture) null, (-1036), (HomeTexture) null, 14, 0.0F);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-1036), (HomeTexture) null, 14, (-78), 14);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>(list0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoWidth((-78));
      homeEnvironment1.setPhotoQuality((-40));
      homeEnvironment1.setLightColor((-1036));
      homeEnvironment1.setAllLevelsVisible(true);
      homeEnvironment0.getDrawingMode();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(400, (HomeTexture) null, (-78), 2451, 0.0F);
      homeEnvironment2.setPhotoHeight((-2));
      homeEnvironment0.setPhotoHeight(300);
      assertEquals((-78), homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-78), (HomeTexture) null, (-1036), (HomeTexture) null, 14, 0.0F);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-1036), (HomeTexture) null, 14, (-78), 14);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>(list0);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      homeEnvironment0.getSubpartSizeUnderLight();
      homeEnvironment0.setPhotoWidth((-78));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.VIDEO_WIDTH;
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.PHOTO_QUALITY;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("(&-J*", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property1, propertyChangeListenerProxy0);
      PropertyChangeListener propertyChangeListener1 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy("(&-J*", propertyChangeListener1);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy1);
      assertEquals((-78), homeEnvironment0.getPhotoWidth());
      
      homeEnvironment1.setSkyTexture((HomeTexture) null);
      int int0 = homeEnvironment1.getPhotoQuality();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha(871);
      homeEnvironment0.setSubpartSizeUnderLight((-1.0F));
      homeEnvironment0.setCeillingLightColor(871);
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.setPhotoHeight(13);
      homeEnvironment0.getGroundTexture();
      homeEnvironment0.getVideoCameraPath();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoQuality(400);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment1.setAllLevelsVisible(false);
      assertEquals(871.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(871, homeEnvironment0.getCeillingLightColor());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.setVideoFrameRate(0);
      URL uRL0 = MockURL.getFileExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture((String) null, temporaryURLContent0, 51.422F, 0.0F, false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setGroundTexture(homeTexture0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setSubpartSizeUnderLight(0.0F);
      assertEquals(HomeEnvironment.DrawingMode.FILL_AND_OUTLINE, homeEnvironment0.getDrawingMode());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoQuality(823);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setLightColor(1709);
      homeEnvironment0.setCeillingLightColor(1709);
      homeEnvironment1.setAllLevelsVisible(true);
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      HomeEnvironment homeEnvironment3 = homeEnvironment0.clone();
      homeEnvironment1.setVideoFrameRate(2170);
      homeEnvironment1.setVideoQuality(0);
      homeEnvironment0.setGroundColor(2170);
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setPhotoWidth(2170);
      homeEnvironment3.setLightColor(2170);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment2.isObserverCameraElevationAdjusted();
      homeEnvironment2.setVideoCameraPath(list0);
      homeEnvironment1.setPhotoWidth((-29));
      homeEnvironment3.getVideoAspectRatio();
      homeEnvironment1.getGroundColor();
      homeEnvironment2.getVideoAspectRatio();
      homeEnvironment3.setSkyColor((-29));
      homeEnvironment1.setSkyColor(1709);
      homeEnvironment1.setVideoFrameRate((-1766));
      int int0 = homeEnvironment0.getVideoFrameRate();
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      HomeEnvironment.Property.values();
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(394, (HomeTexture) null, 394, 8, (-2610.127F));
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setGroundColor((-1073741823));
      homeEnvironment0.setWallsAlpha(8);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setGroundColor((-1073741823));
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment.Property.values();
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(394, (HomeTexture) null, 394, 8, (-2607.5344F));
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      homeEnvironment0.setGroundColor((-1073741823));
      homeEnvironment0.setWallsAlpha((-2607.5344F));
      homeEnvironment0.setWallsAlpha(8);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
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
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment.Property.values();
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("P%8Km", (PropertyChangeListener) null);
      HomeEnvironment.DrawingMode.values();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("Ek>fz}%T_2!", uRLContent0, (-3302.1443F), 0);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2097, homeTexture0, 0, 2097, (-337));
      homeEnvironment0.setSkyTexture(homeTexture0);
      assertEquals(2097, homeEnvironment0.getLightColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(0, homeEnvironment0.getSkyColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals((-337.0F), homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(2097, homeEnvironment0.getGroundColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(20, (HomeTexture) null, 20, (HomeTexture) null, 604, (-3668.2927F));
      homeEnvironment0.setVideoQuality(20);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setSkyColor(20);
      homeEnvironment0.setLightColor(604);
      assertEquals(20, homeEnvironment0.getVideoQuality());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HomeEnvironment.DrawingMode.values();
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoFrameRate(25);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.9412316867217543
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoQuality(823);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setLightColor(1709);
      homeEnvironment0.setCeillingLightColor(1709);
      homeEnvironment1.setAllLevelsVisible(true);
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      HomeEnvironment homeEnvironment3 = homeEnvironment0.clone();
      homeEnvironment1.setVideoFrameRate(2170);
      homeEnvironment1.setVideoQuality(0);
      homeEnvironment0.setGroundColor(2170);
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setPhotoWidth(2170);
      homeEnvironment3.setLightColor(2170);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment2.isObserverCameraElevationAdjusted();
      homeEnvironment2.setVideoCameraPath(list0);
      homeEnvironment3.setPhotoWidth((-1766));
      homeEnvironment2.getVideoAspectRatio();
      homeEnvironment3.getGroundColor();
      homeEnvironment1.getVideoAspectRatio();
      homeEnvironment0.setSkyColor(1709);
      homeEnvironment0.setSkyColor(734);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment1.setAllLevelsVisible(false);
      assertEquals(0, homeEnvironment0.getVideoFrameRate());
      assertEquals(1709, homeEnvironment0.getCeillingLightColor());
  }
}
