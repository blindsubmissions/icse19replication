/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:57:24 GMT 2018
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
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.net.URL;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("SUBPART_SIZE_UNDER_LIGHT", propertyChangeListener0);
      HomeEnvironment homeEnvironment1 = new HomeEnvironment();
      homeEnvironment1.getVideoCameraPath();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment0, "SUBPART_SIZE_UNDER_LIGHT", "SUBPART_SIZE_UNDER_LIGHT", homeEnvironment1);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setPhotoWidth(788);
      HomeEnvironment.Property homeEnvironment_Property1 = HomeEnvironment.Property.GROUND_TEXTURE;
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio1);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property1, (PropertyChangeListener) null);
      homeEnvironment0.getVideoWidth();
      homeEnvironment0.setVideoQuality(2816);
      homeEnvironment0.getDrawingMode();
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(400, (HomeTexture) null, 400, 3828, 400);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setVideoQuality(3828);
      homeEnvironment1.setLightColor(3828);
      homeEnvironment1.setCeillingLightColor((-1813));
      homeEnvironment1.getPhotoAspectRatio();
      HomeEnvironment homeEnvironment2 = homeEnvironment1.clone();
      int int0 = homeEnvironment2.getLightColor();
      assertEquals((-1813), homeEnvironment1.getCeillingLightColor());
      assertEquals(3828, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(641, (HomeTexture) null, 0, (HomeTexture) null, 641, 641);
      homeEnvironment0.getDrawingMode();
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(0, homeEnvironment0.getSkyColor());
      assertEquals(641, homeEnvironment0.getLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(641, homeEnvironment0.getGroundColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(641.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Comparator<Camera> comparator0 = (Comparator<Camera>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      linkedList0.pollFirst();
      homeEnvironment1.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setWallsAlpha((-911.7943F));
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.getSkyTexture();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setLightColor(13);
      homeEnvironment1.getVideoAspectRatio();
      homeEnvironment1.getVideoAspectRatio();
      HomeEnvironment.DrawingMode[] homeEnvironment_DrawingModeArray0 = HomeEnvironment.DrawingMode.values();
      assertEquals(3, homeEnvironment_DrawingModeArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("k^waid", "k^waid", (Content) null, 1641, 0.0F, "k^waid", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1641, homeTexture0, 0, homeTexture0, 1641, 0.0F);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      CatalogTexture catalogTexture1 = new CatalogTexture("k^waid", (Content) null, 609.3643F, 0.0F, false);
      catalogTexture0.compareTo(catalogTexture1);
      List<Camera> list0 = homeEnvironment1.getVideoCameraPath();
      homeEnvironment1.setVideoCameraPath(list0);
      homeEnvironment1.setVideoFrameRate(1641);
      homeEnvironment1.setSkyColor((-2026));
      homeEnvironment1.setVideoWidth((-1));
      homeEnvironment1.getDrawingMode();
      // Undeclared exception!
      try { 
        HomeEnvironment.DrawingMode.valueOf("k^waid");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.DrawingMode.k^waid
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(11053224, int0);
      
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Camera camera0 = new Camera(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      Camera camera1 = camera0.clone();
      linkedList0.add(camera1);
      homeEnvironment0.setVideoCameraPath(linkedList0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_QUALITY;
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("b@h(4)", (PropertyChangeListener) null);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      List<Camera> list0 = homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.setVideoCameraPath(list0);
      homeEnvironment0.setVideoWidth(1288);
      homeEnvironment0.setVideoCameraPath(list0);
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoQuality(1596);
      AspectRatio aspectRatio1 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio1);
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_WIDTH;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setAllLevelsVisible(false);
      homeEnvironment1.isAllLevelsVisible();
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment1.setAllLevelsVisible(true);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment1.setGroundColor(1596);
      assertTrue(homeEnvironment1.isAllLevelsVisible());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(979, (HomeTexture) null, (-432), 979, (-432));
      homeEnvironment0.setWallsAlpha(979);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_COLOR;
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setPhotoQuality(0);
      homeEnvironment0.setSubpartSizeUnderLight((-432));
      homeEnvironment0.setGroundColor(1351);
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoQuality((-921));
      homeEnvironment0.setVideoWidth(979);
      homeEnvironment0.setWallsAlpha(1351);
      AspectRatio aspectRatio0 = AspectRatio.VIEW_3D_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
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
  //Test case number: 8
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = (-293);
      homeEnvironment0.setVideoFrameRate((-293));
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
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(25, (HomeTexture) null, 6, 25, 6);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setGroundColor((-281));
      homeEnvironment1.setAllLevelsVisible(true);
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment1.getSkyColor();
      homeEnvironment0.getWallsAlpha();
      int int0 = homeEnvironment0.getPhotoWidth();
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
      assertEquals(400, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.CEILING_LIGHT_COLOR;
      homeEnvironment1.setSubpartSizeUnderLight(0.0F);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("y.\"", propertyChangeListener0);
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.setPhotoQuality((-1644));
      AspectRatio aspectRatio0 = AspectRatio.RATIO_16_9;
      homeEnvironment0.setVideoWidth(13684944);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.setPhotoQuality((-3037));
      homeEnvironment1.setAllLevelsVisible(false);
      homeEnvironment1.setLightColor(1532);
      homeEnvironment0.getGroundTexture();
      homeEnvironment1.getSkyTexture();
      homeEnvironment0.setSkyColor((-3037));
      assertEquals(AspectRatio.RATIO_16_9, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(11);
      homeEnvironment0.setVideoFrameRate((-4579));
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      homeEnvironment0.setSkyColor(220);
      homeEnvironment0.setVideoWidth(14);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.DRAWING_MODE;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode", propertyChangeListener0);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getPhotoAspectRatio();
      assertEquals(220, homeEnvironment0.getSkyColor());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.395908119293929
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = new HomeEnvironment((-432), (HomeTexture) null, (-432), (-432), (-432));
      homeEnvironment0.setWallsAlpha((-432));
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.SKY_TEXTURE;
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      homeEnvironment0.setPhotoQuality((-432));
      homeEnvironment1.setSubpartSizeUnderLight((-642.5F));
      homeEnvironment1.setGroundColor(4);
      homeEnvironment1.getPhotoHeight();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment1.setPhotoQuality(0);
      homeEnvironment1.setVideoWidth((-2119));
      homeEnvironment0.setWallsAlpha((-432.0F));
      AspectRatio aspectRatio0 = AspectRatio.FREE_RATIO;
      homeEnvironment0.setPhotoAspectRatio(aspectRatio0);
      // Undeclared exception!
      try { 
        HomeEnvironment.Property.valueOf("Unknown resource ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.HomeEnvironment.Property.Unknown resource 
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(18);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setCeillingLightColor((-2399));
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment.Property.values();
      homeEnvironment0.setPhotoHeight(1808);
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.isObserverCameraElevationAdjusted();
      homeEnvironment0.setLightColor(440);
      homeEnvironment0.setPhotoQuality((-3615));
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setVideoQuality((-1751));
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.getVideoWidth();
      homeEnvironment0.getWallsAlpha();
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setPhotoHeight(1808);
      assertEquals(AspectRatio.SQUARE_RATIO, homeEnvironment0.getVideoAspectRatio());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      URL uRL0 = MockURL.getFtpExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("s5itv77YN8B4lc9P", "s5itv77YN8B4lc9P", temporaryURLContent0, 0.0F, 0.0F, "s5itv77YN8B4lc9P");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      homeEnvironment0.setSkyTexture(homeTexture0);
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      HomeTexture homeTexture1 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setSkyTexture(homeTexture1);
      homeEnvironment1.setWallsAlpha(172.86569F);
      assertEquals(172.86569F, homeEnvironment1.getWallsAlpha(), 0.01F);
      
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      assertEquals(0.0F, float0, 0.01F);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.0910424533583143
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.setGroundColor(2);
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.setPhotoHeight(2);
      homeEnvironment0.setVideoQuality(2);
      homeEnvironment0.setAllLevelsVisible(false);
      homeEnvironment0.setVideoFrameRate(729);
      homeEnvironment0.setCeillingLightColor(16);
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.setGroundColor(0);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      HomeEnvironment homeEnvironment2 = homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.OUTLINE;
      homeEnvironment1.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment1.getVideoHeight();
      homeEnvironment1.getVideoQuality();
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment2.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment1.getPhotoAspectRatio();
      homeEnvironment2.setCeillingLightColor(2);
      homeEnvironment0.setVideoQuality(2);
      AspectRatio aspectRatio1 = AspectRatio.RATIO_4_3;
      homeEnvironment2.setVideoAspectRatio(aspectRatio1);
      homeEnvironment0.getWallsAlpha();
      homeEnvironment2.getVideoCameraPath();
      homeEnvironment0.setGroundColor(16);
      int int0 = homeEnvironment2.getVideoFrameRate();
      assertEquals(AspectRatio.RATIO_3_2, homeEnvironment0.getVideoAspectRatio());
      assertEquals(729, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      Comparator<Camera> comparator0 = (Comparator<Camera>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedList0.sort(comparator0);
      linkedList0.pollFirst();
      homeEnvironment1.setSkyTexture((HomeTexture) null);
      homeEnvironment0.setWallsAlpha((-911.7943F));
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.setVideoCameraPath(linkedList0);
      homeEnvironment1.getSkyTexture();
      AspectRatio aspectRatio0 = AspectRatio.SQUARE_RATIO;
      homeEnvironment1.setVideoAspectRatio(aspectRatio0);
      homeEnvironment1.getCeillingLightColor();
      homeEnvironment1.setGroundTexture((HomeTexture) null);
      homeEnvironment0.getPhotoAspectRatio();
      AspectRatio aspectRatio1 = AspectRatio.FREE_RATIO;
      // Undeclared exception!
      try { 
        homeEnvironment0.setVideoAspectRatio(aspectRatio1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported aspect ratio FREE_RATIO
         //
         verifyException("com.eteks.sweethome3d.model.HomeEnvironment", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(18);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setCeillingLightColor((-2399));
      HomeEnvironment.Property.values();
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      homeEnvironment0.isAllLevelsVisible();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setCeillingLightColor((-2399));
      AspectRatio aspectRatio0 = AspectRatio.RATIO_3_2;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      homeEnvironment0.isAllLevelsVisible();
      homeEnvironment0.getPhotoAspectRatio();
      homeEnvironment0.setCeillingLightColor(0);
      assertEquals(18, homeEnvironment0.getPhotoWidth());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("}SB", "}SB", (Content) null, (-777.813F), (-758.87F), "}SB", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(3, homeTexture0, 3, 3, (-777.813F));
      homeEnvironment0.setVideoQuality(926);
      homeEnvironment0.getVideoHeight();
      TexturesCategory texturesCategory0 = new TexturesCategory("QU)'o4pmMgp'e");
      catalogTexture0.setCategory(texturesCategory0);
      homeEnvironment0.setSkyColor(3);
      homeEnvironment0.getVideoCameraPath();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_QUALITY;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      Object object0 = new Object();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(homeEnvironment0, "!11LDV^DT=", homeEnvironment1, homeTexture0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
      PropertyChangeEvent propertyChangeEvent1 = new PropertyChangeEvent("QU)'o4pmMgp'e", "QU)'o4pmMgp'e", "QU)'o4pmMgp'e", (Object) null);
      propertyChangeListenerProxy0.propertyChange(propertyChangeEvent1);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
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
  //Test case number: 19
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(18);
      homeEnvironment0.getVideoCameraPath();
      homeEnvironment0.getSkyTexture();
      homeEnvironment0.getPhotoQuality();
      homeEnvironment0.setSkyColor(0);
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.setCeillingLightColor((-2399));
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment.Property.values();
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.getPhotoHeight();
      homeEnvironment0.setGroundColor(11053224);
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment0.clone();
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      homeEnvironment0.getVideoHeight();
      homeEnvironment1.getVideoQuality();
      HomeEnvironment homeEnvironment2 = new HomeEnvironment(0, (HomeTexture) null, 132, (HomeTexture) null, (-2399), (-1.0F));
      homeEnvironment2.isAllLevelsVisible();
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment2.getPhotoAspectRatio();
      // Undeclared exception!
      try { 
        AspectRatio.valueOf("J;O,`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.eteks.sweethome3d.model.AspectRatio.J;O,`
         //
         verifyException("java.lang.Enum", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = 1409;
      homeEnvironment0.setVideoWidth(1409);
      homeEnvironment0.setVideoFrameRate(11);
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      homeEnvironment0.setVideoWidth(1409);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode1 = HomeEnvironment.DrawingMode.FILL;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode1);
      homeEnvironment0.getVideoHeight();
      homeEnvironment0.getVideoQuality();
      homeEnvironment0.isAllLevelsVisible();
      int int1 = (-691);
      String string0 = "";
      Class<String> class0 = String.class;
      boolean boolean0 = false;
      ResourceURLContent resourceURLContent0 = null;
      try {
        resourceURLContent0 = new ResourceURLContent(class0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown resource 
         //
         verifyException("com.eteks.sweethome3d.tools.ResourceURLContent", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoCameraPath((List<Camera>) null);
      homeEnvironment0.setSkyColor(496);
      homeEnvironment0.setVideoWidth(496);
      HomeEnvironment.DrawingMode homeEnvironment_DrawingMode0 = HomeEnvironment.DrawingMode.FILL_AND_OUTLINE;
      homeEnvironment0.setDrawingMode(homeEnvironment_DrawingMode0);
      homeEnvironment0.setPhotoWidth(496);
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy((String) null, propertyChangeListener0);
      PropertyChangeListenerProxy propertyChangeListenerProxy1 = new PropertyChangeListenerProxy((String) null, propertyChangeListenerProxy0);
      PropertyChangeListenerProxy propertyChangeListenerProxy2 = new PropertyChangeListenerProxy("com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode", propertyChangeListenerProxy0);
      PropertyChangeListenerProxy propertyChangeListenerProxy3 = new PropertyChangeListenerProxy((String) null, propertyChangeListenerProxy1);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_WIDTH;
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.addPropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      homeEnvironment1.setPhotoWidth(496);
      assertEquals(496, homeEnvironment0.getPhotoWidth());
      assertEquals(496, homeEnvironment0.getVideoWidth());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setGroundColor((-1001));
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      homeEnvironment0.setVideoFrameRate(16);
      homeEnvironment0.setLightColor(16);
      homeEnvironment0.setPhotoQuality(16);
      homeEnvironment0.setVideoFrameRate(16);
      assertEquals(16, homeEnvironment0.getPhotoQuality());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Camera> linkedList0 = new LinkedList<Camera>();
      LinkedList<Camera> linkedList1 = new LinkedList<Camera>();
      CatalogTexture catalogTexture0 = new CatalogTexture("}*(h", (Content) null, 0.0F, (-1));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1), homeTexture0, (-1), 7, (-1));
      HomeEnvironment homeEnvironment1 = homeEnvironment0.clone();
      homeEnvironment1.setObserverCameraElevationAdjusted(false);
      assertFalse(homeEnvironment1.isObserverCameraElevationAdjusted());
      
      homeEnvironment1.setObserverCameraElevationAdjusted(true);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
}
