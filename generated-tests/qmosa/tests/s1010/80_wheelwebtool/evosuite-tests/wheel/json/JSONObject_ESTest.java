/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 13:32:03 GMT 2018
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
import java.util.function.BiFunction;
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
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "eRJ-%( 3z8";
      stringArray0[1] = "y-t-C7z,kYbrq5";
      String string0 = "wheel.json.JSONObject$Null";
      stringArray0[2] = "wheel.json.JSONObject$Null";
      stringArray0[3] = "!pGO2A";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optDouble("eRJ-%( 3z8");
      String string1 = "C,L6+";
      boolean boolean0 = false;
      jSONObject1.put("C,L6+", false);
      try { 
        jSONObject1.getLong("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      String string0 = jSONObject0.toString((-956));
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = (-1L);
      jSONObject0.optLong("true", (-1L));
      jSONObject0.toString();
      try { 
        JSONObject.numberToString((Number) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null pointer
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "y%5\";6Z4&@=";
      JSONObject.quote("y%5\";6Z4&@=");
      int int0 = 0;
      JSONObject.valueToString("\"y%5\";6Z4&@=\"", 573, 0);
      HashMap<Long, Object> hashMap0 = new HashMap<Long, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.names();
      jSONObject0.names();
      jSONObject0.optInt("=Di_64f", 0);
      jSONObject0.toString(0, (-2578));
      try { 
        jSONObject0.getBoolean("\"java.lang.String@0000000001\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\\\"java.lang.String@0000000001\\\"\"] not found.
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
      Float float0 = new Float((-1493.2055761894));
      JSONObject.numberToString(float0);
      String string0 = "";
      JSONTokener jSONTokener0 = new JSONTokener("");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 0 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = "";
      jSONObject0.toString(123, 123);
      jSONObject0.optLong("");
      JSONObject.getNames(jSONObject0);
      jSONObject0.optDouble("");
      try { 
        jSONObject0.getJSONObject("6qiO/o9dm`;VEvI");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"6qiO/o9dm`;VEvI\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1639556568820564
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Byte byte0 = new Byte((byte)15);
      Byte.toUnsignedInt((byte) (-3));
      Byte.toUnsignedLong((byte)15);
      Byte.compare((byte)42, (byte)42);
      JSONObject.valueToString(byte0, (byte)15, 0);
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "java.lang.Byte@0000000001";
      stringArray0[2] = "java.lang.Byte@0000000001";
      stringArray0[3] = "java.lang.Byte@0000000001";
      stringArray0[4] = "java.lang.Byte@0000000001";
      stringArray0[5] = "java.lang.Byte@0000000001";
      stringArray0[6] = "java.lang.Byte@0000000001";
      stringArray0[7] = "K";
      stringArray0[8] = "java.lang.Byte@0000000001";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      try { 
        jSONObject0.getJSONArray("java.lang.Byte@0000000001");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"java.lang.Byte@0000000001\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9331249408322044
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("!`]JH6tzi3T$ocg\"V", false);
      jSONObject0.optJSONArray("");
      jSONObject0.keys();
      int int0 = (-3480);
      jSONObject0.toString((-3480));
      try { 
        jSONObject0.getDouble("6l%V{5y^");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"6l%V{5y^\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      jSONObject0.put("\u0004C45K", (Collection) linkedList0);
      HashMap<Double, Long> hashMap0 = new HashMap<Double, Long>();
      Double double0 = new Double((-632.3068465092));
      BiFunction<Object, Object, Long> biFunction0 = (BiFunction<Object, Object, Long>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.replaceAll(biFunction0);
      Long long0 = new Long((-2088L));
      Long.max(564L, 0L);
      Long long1 = Long.getLong((String) null, long0);
      Long.compare(0L, 564L);
      hashMap0.put(double0, long1);
      try { 
        jSONObject0.put((String) null, (Map) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4354735656251962
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      Long.getLong("] is not a Boolean.");
      JSONObject jSONObject0 = new JSONObject(long0);
      Long.max(1L, (-1L));
      Long.sum(1L, 0L);
      String string0 = "^~E;xea.scj.|$J-_~)";
      try { 
        jSONObject0.getInt("\f");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\\f\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      JSONObject.valueToString((Object) null, 0, 0);
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("null");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of null
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.531138612172325
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      jSONObject0.putOpt("E/mRfXjz5gWqwSj+XY", object0);
      jSONObject0.toString();
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.659322697709517
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = "";
      jSONObject0.toString(123, 123);
      jSONObject0.optLong("");
      JSONObject.getNames(jSONObject0);
      jSONObject0.optDouble("");
      String string1 = "6qiO/o9dm`;VEvI";
      Double double0 = new Double(Double.NaN);
      try { 
        jSONObject0.putOpt("isdivideUnsigned", double0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSON does not allow non-finite numbers.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("W`]JH6tzi3T$ocg\"", false);
      jSONObject0.optJSONArray("");
      jSONObject0.keys();
      jSONObject0.toString((-3480));
      double double0 = new Integer((-3480));
      JSONObject.valueToString((Object) null, 0, (-3480));
      JSONObject.quote((String) null);
      boolean boolean0 = jSONObject0.optBoolean("\n");
      assertEquals(1, jSONObject0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0622353947955703
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "eRJ-%( 3z8";
      JSONObject jSONObject1 = jSONObject0.put("lER[5$`?NKC]b9BW3", false);
      jSONObject0.optJSONArray((String) null);
      jSONObject0.keys();
      JSONObject.quote("getrotateRight");
      jSONObject1.toString((-3480));
      try { 
        jSONObject1.getDouble("isrotateRight");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"isrotateRight\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.254846530371935
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      String[] stringArray0 = new String[6];
      linkedList0.pollLast();
      stringArray0[0] = "true";
      stringArray0[1] = " of ";
      stringArray0[2] = ")VN<-*0xQ].~u_,";
      stringArray0[3] = "";
      stringArray0[4] = "7,mZc-XKJp}To";
      stringArray0[5] = "wheel.json.JSONArray";
      JSONObject jSONObject0 = new JSONObject(jSONArray0, stringArray0);
      HashMap<Double, Object> hashMap0 = new HashMap<Double, Object>();
      JSONObject jSONObject1 = jSONObject0.put("wheel.json.JSONObject", (Map) hashMap0);
      jSONObject0.optInt(" of ", 0);
      jSONObject0.optDouble("7,mZc-XKJp}To");
      JSONObject jSONObject2 = jSONObject1.putOpt("b5rFDk3Zf!0KME/u]T", "");
      jSONObject2.toString();
      assertEquals(2, jSONObject1.length());
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Float float0 = new Float((-1493.2055761894));
      JSONObject.doubleToString((-1493.2055761894));
      String string0 = "";
      JSONTokener jSONTokener0 = new JSONTokener("");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 0 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("!`]JH6tzi3T$ocg\"V", true);
      JSONObject.getNames((Object) jSONObject1);
      jSONObject0.optJSONArray("");
      jSONObject0.keys();
      int int0 = (-3480);
      jSONObject0.toString((-3480));
      try { 
        jSONObject0.getDouble("6l%V{5y^");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"6l%V{5y^\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9263215158543445
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "eRJ-%( 3z8";
      stringArray0[1] = "y-t-C7z,kYbrq5";
      stringArray0[2] = "wheel.json.JSONObject$Null";
      stringArray0[3] = "!pGO2A";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optDouble("eRJ-%( 3z8");
      String string0 = "C,L6+";
      JSONObject jSONObject2 = jSONObject1.put("C,L6+", false);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject0.toJSONArray(jSONArray0);
      try { 
        jSONObject2.getDouble("y-t-C7z,kYbrq5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"y-t-C7z,kYbrq5\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = (-1L);
      jSONObject0.optLong("true", (-1L));
      jSONObject0.toString();
      JSONObject.valueToString(jSONObject0);
      jSONObject0.put("wheel.json.JSONObject@0000000001", 0.0);
      jSONObject0.put("wheel.json.JSONObject@0000000001", (Collection) null);
      JSONArray jSONArray0 = new JSONArray((Collection) null);
      try { 
        jSONArray0.getBoolean((-3038));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray[-3038] not found.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7388948450374015
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Float float0 = new Float((-1493.2055761894));
      JSONObject.numberToString(float0);
      String string0 = "] is not a JSONObject.";
      Long.getLong("] is not a JSONObject.");
      JSONObject jSONObject0 = new JSONObject((Object) "java.lang.Float@0000000001");
      long long0 = 857L;
      Long.max(857L, 0L);
      Long.sum(1L, 0L);
      try { 
        jSONObject0.getInt("] is not a JSONObject.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"] is not a JSONObject.\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.toJSONArray((JSONArray) null);
      assertNull(jSONArray0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.20619205063323187
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject.quote("y%5\";6Z4&@=");
      JSONTokener jSONTokener0 = new JSONTokener("y%5\";6Z4&@=");
      Long.getLong("] is not a JSONObject.");
      Long.max(0L, (-2107L));
      Long.sum(857L, 0L);
      JSONObject.valueToString((Object) null);
      Long.compareUnsigned((-2107L), 857L);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("\b");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of \b
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9683304358882807
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[4];
      stringArray0[1] = "eRJ-%( 3z8";
      stringArray0[1] = "y-t-C7z,kYbrq5";
      stringArray0[2] = "wheel.json.JSONObject$Null";
      stringArray0[3] = "!pGO2A";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optDouble("eRJ-%( 3z8");
      jSONObject1.put("C,L6+", false);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject0.toJSONArray(jSONArray0);
      String string0 = "JSONObject[";
      jSONObject0.optLong("C,L6+", (-1192L));
      JSONObject jSONObject2 = new JSONObject();
      try { 
        jSONObject2.get("4");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"4\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.3854161373740337
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      Long.getLong("] is not a Boolean.");
      JSONObject jSONObject0 = new JSONObject(long0);
      jSONObject0.toString(123, 123);
      jSONObject0.optLong("toU");
      JSONObject.getNames(jSONObject0);
      jSONObject0.optDouble((String) null);
      Double.min(0L, 0L);
      Double double0 = new Double(Double.NaN);
      String[] stringArray0 = JSONObject.getNames((Object) double0);
      assertNotNull(stringArray0);
      
      jSONObject0.optJSONObject("toS");
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.7664123555634643
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("!`]JH6tzi3T$ocg\"V", true);
      JSONObject.getNames((Object) jSONObject1);
      jSONObject0.optJSONArray("");
      jSONObject1.put("spl", true);
      jSONObject0.optInt("spl", (-3480));
      try { 
        jSONObject0.getDouble("QQVn}c,%");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"QQVn}c,%\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("!`]JH6tzi3T$ocg\"V", true);
      JSONObject.getNames((Object) jSONObject1);
      jSONObject0.optJSONArray("");
      jSONObject0.keys();
      JSONObject.quote("");
      jSONObject0.put("Wu", 2214L);
      JSONTokener jSONTokener0 = new JSONTokener(".");
      jSONTokener0.toString();
      try { 
        Double.valueOf("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject1 = new JSONObject();
      JSONObject jSONObject2 = jSONObject1.putOpt("E/mRfXjz5gWqwSj+XY", jSONObject0);
      jSONObject1.toString();
      try { 
        jSONObject2.getString("getdivideUnsigned");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"getdivideUnsigned\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.2268265504537665
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = Long.valueOf(0L);
      Long.getLong("] is not a Boolean.");
      JSONObject jSONObject0 = new JSONObject(long0);
      JSONObject.valueToString(jSONObject0, 138, 138);
      jSONObject0.optLong("toU");
      JSONObject.getNames(jSONObject0);
      String string0 = null;
      jSONObject0.optDouble((String) null);
      try { 
        jSONObject0.getJSONObject("6qiO/o9dm`;VEvI");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"6qiO/o9dm`;VEvI\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = null;
      Boolean boolean0 = new Boolean((String) null);
      Boolean.logicalXor(false, true);
      JSONObject.valueToString(boolean0);
      Float float0 = new Float((-1.0));
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      try { 
        jSONObject0.put((String) null, (-431));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.988449306478194
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "div";
      stringArray0[1] = "div";
      stringArray0[2] = "mC/rKn(\"";
      stringArray0[3] = "div";
      stringArray0[4] = "div";
      stringArray0[5] = "div";
      stringArray0[6] = "div";
      JSONObject jSONObject0 = new JSONObject("div", stringArray0);
      jSONObject0.optBoolean("div", true);
      JSONObject.valueToString("mC/rKn(\"", 1312, 131);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.accumulate("div", "div");
      assertEquals(1, jSONObject1.length());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      jSONObject0.keys();
      JSONObject jSONObject1 = new JSONObject();
      long long0 = jSONObject0.optLong("mi", 1199L);
      assertEquals(1199L, long0);
      
      double double0 = jSONObject1.optDouble("E/mRfXjz5gWqwSj+XY");
      assertEquals(Double.NaN, double0, 0.01);
      
      JSONObject jSONObject2 = jSONObject1.put("E/mRfXjz5gWqwSj+XY", (Object) null);
      assertEquals(0, jSONObject2.length());
      
      String string0 = JSONObject.quote("isparseLong");
      assertEquals("\"isparseLong\"", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.8891591637540217
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      jSONObject0.putOpt("E/mRfXjz5gWqwSj+XY", object0);
      jSONObject0.append("OM_8EYPOwrL&b&u", "E/mRfXjz5gWqwSj+XY");
      JSONTokener jSONTokener0 = new JSONTokener("OM_8EYPOwrL&b&u");
      jSONTokener0.back();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "OM_8EYPOwrL&b&u";
      stringArray0[1] = "E/mRfXjz5gWqwSj+XY";
      stringArray0[2] = "E/mRfXjz5gWqwSj+XY";
      stringArray0[3] = "B*RVO";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      JSONObject.testValidity((Object) null);
  }
}
