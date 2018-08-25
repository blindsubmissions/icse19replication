/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:00:25 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import wheel.json.JSONArray;
import wheel.json.JSONObject;
import wheel.json.JSONTokener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(32);
      JSONObject jSONObject0 = new JSONObject(integer0);
      JSONObject jSONObject1 = jSONObject0.put("", (double) 32);
      jSONObject1.optLong("", 0L);
      jSONObject0.toString();
      Double double0 = new Double(1825.71733075508);
      JSONObject.getNames((Object) double0);
      jSONObject1.put("j*N]'t68Gz<a|A0M3J", (Object) null);
      Short short0 = new Short((short) (-1907));
      JSONObject.valueToString(short0, (short) (-1907), 795);
      jSONObject1.toString(32);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 0 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(",:]}/\"[{;=#");
      String[] stringArray0 = new String[5];
      stringArray0[0] = ",:]}/\"[{;=#";
      stringArray0[1] = ",:]}/\"[{;=#";
      stringArray0[2] = ",:]}/\"[{;=#";
      stringArray0[3] = ",:]}/\"[{;=#";
      stringArray0[4] = ",:]}/\"[{;=#";
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      jSONObject0.append(",:]}/\"[{;=#", ",:]}/\"[{;=#");
      try { 
        jSONObject0.accumulate((String) null, boolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      JSONObject jSONObject0 = new JSONObject(boolean0);
      try { 
        jSONObject0.append((String) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "\\f";
      jSONObject0.optInt("\f", (-290));
      String string1 = "";
      try { 
        jSONObject0.getLong("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "Y\"mo6hvH-;V'&[xL";
      JSONObject.quote("Y\"mo6hvH-;V'&[xL");
      JSONObject jSONObject0 = new JSONObject();
      String string1 = null;
      try { 
        jSONObject0.put((String) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      JSONArray jSONArray0 = jSONObject0.names();
      assertNull(jSONArray0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = JSONObject.doubleToString(1.0);
      assertEquals("1", string0);
      
      HashMap<String, Byte> hashMap0 = new HashMap<String, Byte>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      int int0 = jSONObject0.optInt("1", (-714));
      assertEquals((-714), int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "mF`J`!`gSG Y&(rS";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("mF`J`!`gSG Y&(rS");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of mF`J`!`gSG Y&(rS
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = "=u,:H-Bh";
      jSONObject0.optDouble("] is not a JSONArray.", 0.0);
      try { 
        jSONObject0.getDouble("=u,:H-Bh");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"=u,:H-Bh\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<Float> linkedList0 = new LinkedList<Float>();
      Float float0 = new Float((-1540.2967));
      linkedList0.add(float0);
      JSONObject jSONObject1 = jSONObject0.put("", (Collection) linkedList0);
      String string0 = "Vf_Wj&tU5=^u4n";
      jSONObject1.put("Vf_Wj&tU5=^u4n", (-1540.2967));
      jSONObject0.has("Unterminated string");
      try { 
        jSONObject1.getLong("wheel.json.JSONTokener");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"wheel.json.JSONTokener\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.783073469038219
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject.testValidity(object0);
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      Float.max(2635.6375F, 2635.6375F);
      Float.isFinite(0.0F);
      jSONObject0.has("");
      Float.isFinite(0.0F);
      String string0 = JSONObject.doubleToString(0.0);
      assertEquals("0", string0);
      
      String string1 = jSONObject0.optString("", "i:=YN,");
      assertEquals("i:=YN,", string1);
      
      String string2 = jSONObject0.toString();
      assertNotNull(string2);
      assertEquals("{}", string2);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-2265);
      Integer integer0 = new Integer((-2265));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "/nBCKU0puG,";
      stringArray0[1] = ":#mqz:[bq}_xsD";
      Integer.compareUnsigned(0, 0);
      stringArray0[2] = "is";
      Integer.compare((-2265), (-2265));
      stringArray0[3] = "";
      stringArray0[4] = "l'T/28";
      Integer.min(1209, (-2265));
      Integer.remainderUnsigned(0, 788);
      Integer.compare(9, 0);
      stringArray0[5] = "K=";
      stringArray0[6] = ")xyP&;aT 4@%e.E";
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      JSONObject.getNames((Object) "");
      int int1 = (-2900);
      try { 
        jSONObject0.getString("U#O1ek>[tu|r");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"U#O1ek>[tu|r\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      String string0 = "";
      try { 
        jSONObject0.get("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Short short0 = new Short((short) (-1138));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "wheel.json.JSONArray";
      JSONObject jSONObject0 = new JSONObject(short0, stringArray0);
      jSONObject0.put("wheel.json.JSONArray", (-511));
      jSONObject0.optInt("$g+W+e9]kaZmYkGL*", 32);
      Short.compare((short) (-1138), (short) (-1138));
      Object object0 = new Object();
      JSONObject.getNames(object0);
      HashMap<String, Float> hashMap0 = new HashMap<String, Float>();
      jSONObject0.put("$g+W+e9]kaZmYkGL*", (Map) hashMap0);
      int int0 = jSONObject0.optInt("wheel.json.JSONArray", (-2186));
      assertEquals(2, jSONObject0.length());
      assertEquals((-511), int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "b,~{d?k=xGL{;\"";
      stringArray0[1] = "iM2SP4]E";
      stringArray0[2] = "] is not a Boolean.";
      stringArray0[3] = " ^prh_a$Y z:,t*~=E";
      stringArray0[4] = "wheel.json.JSONObject$1";
      stringArray0[5] = "aeEw!ao[@zC[G";
      stringArray0[6] = ";~\"K!";
      stringArray0[7] = "";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      assertEquals(0, jSONObject1.length());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames((Object) null);
      jSONObject0.optBoolean((String) null, false);
      Byte byte0 = new Byte((byte)0);
      byte byte1 = (byte)0;
      Byte.toUnsignedLong((byte)0);
      JSONObject.valueToString(byte0);
      StringWriter stringWriter0 = new StringWriter();
      jSONObject0.write(stringWriter0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>(hashMap0);
      try { 
        jSONObject0.put((String) null, (Map) hashMap1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8979457248567797
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      float float0 = 0.0F;
      Float float1 = new Float(0.0F);
      JSONObject.valueToString(float1, 4, 4);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("java.lang.Float@0000000001");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of java.lang.Float@0000000001
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7075391741350712
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(340.046422);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "5-KP+JNgnpF?";
      Double.min(340.046422, 340.046422);
      stringArray0[1] = "5-KP+JNgnpF?";
      stringArray0[2] = "1o2X}|p9bT^L7m+8";
      stringArray0[3] = ")co7#dpJSz]k7";
      stringArray0[4] = "java.lang.%loat@00000000010";
      stringArray0[5] = "wheel.json.JSONObject$1";
      Double.min(340.046422, 340.046422);
      stringArray0[6] = "(D";
      stringArray0[7] = "6?eh";
      stringArray0[8] = "vk^o?(1gdNJU|i";
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      Float.max(2635.6375F, 2635.6375F);
      Float.isFinite(2635.6375F);
      jSONObject0.has("0");
      Float.isFinite(0.0F);
      String string0 = JSONObject.doubleToString((-1287.33783));
      assertEquals("-1287.33783", string0);
      
      String string1 = jSONObject0.optString("i:=YN,", ")co7#dpJSz]k7");
      assertEquals(")co7#dpJSz]k7", string1);
      
      String string2 = jSONObject0.toString();
      assertEquals("{}", string2);
      assertNotNull(string2);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNull(stringArray0);
      
      jSONObject0.names();
      Long long0 = new Long(317L);
      JSONObject.numberToString(long0);
      jSONObject0.toString(109);
      jSONObject0.toString();
      jSONObject0.remove("null");
      String string0 = jSONObject0.toString();
      assertNotNull(string0);
      assertEquals("{}", string0);
      
      long long1 = jSONObject0.optLong("$|noF&,8J0P#B{}mhs");
      assertEquals(0L, long1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.optDouble("] is not a JSONArray.", 0.0);
      JSONObject jSONObject1 = jSONObject0.put("~8NJRz,KAHG!|q6U", (-362.233528));
      JSONTokener jSONTokener0 = new JSONTokener("~8NJRz,KAHG!|q6U");
      jSONObject1.optBoolean("~8NJRz,KAHG!|q6U");
      jSONObject1.length();
      assertEquals(1, jSONObject0.length());
      
      double double0 = jSONObject0.getDouble("~8NJRz,KAHG!|q6U");
      assertEquals((-362.233528), double0, 0.01);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6568432436295828
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean.logicalOr(false, false);
      Double double0 = new Double((-326.79));
      JSONObject jSONObject0 = new JSONObject(boolean0);
      jSONObject0.remove("{UTPz?:");
      JSONObject.testValidity(double0);
      jSONObject0.toString((-2153), (-159));
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.829081436908226
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double double0 = new Double(340.046422);
      JSONObject jSONObject0 = new JSONObject(double0);
      jSONObject0.remove("'^w/");
      String string0 = JSONObject.quote("'^w/");
      assertEquals("\"'^w/\"", string0);
      
      long long0 = jSONObject0.optLong("C2ebQ#Is=@@jd");
      assertEquals(0L, long0);
      assertEquals(3, jSONObject0.length());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Double double0 = new Double(340.046422);
      Integer integer0 = new Integer((-12473307));
      JSONObject jSONObject0 = new JSONObject(integer0);
      Byte byte0 = new Byte((byte) (-63));
      JSONObject.getNames((Object) byte0);
      jSONObject0.optString("] is not a number.");
      boolean boolean0 = true;
      String string0 = "do";
      jSONObject0.optDouble("do", (double) (-12473307));
      jSONObject0.optJSONObject("N61Js");
      try { 
        jSONObject0.getString("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9709677868031212
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = new JSONObject((Object) "] is not a JSONArray.");
      jSONObject0.append("] is not a JSONArray.", (Object) null);
      jSONObject0.toString((-1681), 2378);
      try { 
        jSONObject1.getJSONObject("{\"java.lang.String@0000000004\": [null]}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"{\\\"java.lang.String@0000000004\\\": [null]}\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      HashMap<Float, Boolean> hashMap0 = new HashMap<Float, Boolean>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.optDouble("", 0.0);
      JSONObject jSONObject1 = jSONObject0.put("", 0.0);
      JSONTokener jSONTokener0 = new JSONTokener("");
      jSONObject1.optBoolean("Expected '");
      jSONObject0.put("", 1736L);
      jSONObject0.length();
      try { 
        jSONObject0.getDouble("~8NJRz,KAHG!|q6U");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"~8NJRz,KAHG!|q6U\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.9948609505272237
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      jSONObject0.names();
      Long long0 = new Long(317L);
      JSONObject.numberToString(long0);
      jSONObject0.toString(109);
      Boolean boolean0 = Boolean.FALSE;
      jSONObject0.toJSONArray((JSONArray) null);
      jSONObject0.length();
      try { 
        jSONObject0.getDouble("{}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"{}\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5844533803754828
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double double0 = new Double(340.046422);
      JSONObject jSONObject0 = new JSONObject(double0);
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      jSONObject0.write(stringWriter0);
      assertEquals(3, jSONObject0.length());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.395873860982312
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Short short0 = new Short((short) (-1138));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "wheel.json.JSONArray";
      JSONObject jSONObject0 = new JSONObject(short0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.put("wheel.json.JSONArray", (-511));
      jSONObject1.toString((-511), (-1505));
      JSONObject jSONObject2 = jSONObject0.put("wheel.json.JSONArray", (-362.233528));
      JSONTokener jSONTokener0 = new JSONTokener("$g+W+e9]kaZmYkGL*");
      jSONObject2.keys();
      jSONObject2.optBoolean((String) null);
      JSONObject jSONObject3 = new JSONObject((Map) null);
      jSONObject1.length();
      try { 
        jSONObject2.getDouble("getsum");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"getsum\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.2922907509099737
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      Boolean.logicalXor(true, true);
      String string0 = "P#R-NtbE2h";
      jSONObject0.optDouble("P#R-NtbE2h", 669.768734269505);
      String string1 = "getparseDouble";
      jSONObject0.optDouble("getparseDouble", (-1127.3404688774679));
      JSONObject.valueToString("P#R-NtbE2h");
      String string2 = null;
      float float0 = (-513.8557F);
      Float float1 = new Float((-513.8557F));
      Float.sum((-513.8557F), (-513.8557F));
      jSONObject0.putOpt((String) null, float1);
      try { 
        jSONObject0.getDouble((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject.doubleToString(Double.NaN);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((Object) "null");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray initial value should be a string or collection or array.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6808786378481333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Double double0 = new Double(340.046422);
      JSONObject jSONObject0 = new JSONObject(double0);
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject0.toJSONArray(jSONArray0);
      jSONObject0.keys();
      HashMap<Double, String> hashMap0 = new HashMap<Double, String>();
      JSONObject jSONObject1 = jSONObject0.put(",%FH#AW\"a{u>NxXv/", (Map) hashMap0);
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject2 = new JSONObject(object0);
      jSONObject2.optDouble("getcopyValueOf", 3024.3169898337837);
      jSONObject1.has(";J.girG");
      jSONObject1.length();
      jSONObject0.has("getcopyValueOf");
      jSONObject0.optBoolean(",\n");
      JSONObject jSONObject3 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject4 = jSONObject0.append(",e9]x{|>^D", (Object) null);
      jSONObject4.opt("getcopyValueOf");
      assertEquals(5, jSONObject0.length());
      
      String string0 = jSONObject3.toString(48, 4);
      assertEquals("{}", string0);
  }
}
