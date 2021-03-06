/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:36:08 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.json.JSONArray;
import wheel.json.JSONObject;
import wheel.json.JSONTokener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "brp{-ZiKl9jbd9dj";
      JSONTokener jSONTokener0 = new JSONTokener("brp{-ZiKl9jbd9dj");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of brp{-ZiKl9jbd9dj
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Boolean, Object> hashMap0 = new HashMap<Boolean, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = null;
      try { 
        jSONObject0.put((String) null, 0.0);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "V4wPRgd,<s%MiY]";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("V4wPRgd,<s%MiY]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of V4wPRgd,<s%MiY]
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = ",:]}/\\\"[{;=#";
      JSONObject jSONObject1 = jSONObject0.append(",:]}/\"[{;=#", ",:]}/\"[{;=#");
      try { 
        jSONObject1.getDouble("");
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
  /*Coverage entropy=2.670119889806817
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject.testValidity(object0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.putOpt("p@#[pV[K-<<[2sI5e", object0);
      jSONObject1.optInt("p@#[pV[K-<<[2sI5e", 0);
      JSONObject.valueToString(object0);
      Boolean boolean0 = new Boolean(true);
      Boolean.logicalOr(true, true);
      Boolean.compare(true, true);
      JSONObject jSONObject2 = new JSONObject();
      jSONObject0.append("null", jSONObject2);
      JSONObject.valueToString(boolean0, 8, 8);
      hashMap0.put("p@#[pV[K-<<[2sI5e", (Object) null);
      try { 
        jSONObject0.getDouble("dg");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"dg\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JSONObject.valueToString(object0, (-2187), (-2187));
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.isNull("\"java.lang.Object@0000000001\"");
      JSONObject jSONObject1 = jSONObject0.put("\"java.lang.Object@0000000001\"", (long) (-2187));
      jSONObject0.put("\"java.lang.Object@0000000001\"", 4809.0);
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONArray0.put(0L);
      JSONObject.valueToString(jSONArray0, (-2187), (-1559));
      jSONObject1.optDouble("\"java.lang.Object@0000000001\"");
      jSONObject1.length();
      jSONObject1.optDouble("\"java.lang.Object@0000000001\"", 2937.854);
      jSONObject0.has("\"java.lang.Object@0000000001\"");
      try { 
        jSONObject1.getString("Uzp;'=7s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Uzp;'=7s\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean.getBoolean("'");
      JSONObject jSONObject0 = new JSONObject(boolean0);
      Boolean.compare(true, true);
      jSONObject0.optInt("] is not a JSONArray.");
      String string0 = "] not found.";
      jSONObject0.optString("] not found.");
      String string1 = "?Jq.]0P=\"\"Zj";
      Object object0 = null;
      String string2 = "Expected a ',' or '}'";
      HashMap<String, JSONArray> hashMap0 = new HashMap<String, JSONArray>();
      JSONTokener jSONTokener0 = new JSONTokener("'");
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of '
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5806491250694639
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte byte0 = (byte)105;
      Byte byte1 = new Byte((byte)105);
      byte byte2 = (byte)0;
      Byte.toUnsignedInt((byte)0);
      Byte.compare((byte)0, (byte)105);
      Byte.toUnsignedLong((byte)105);
      JSONObject.valueToString(byte1, 62, 62);
      JSONObject jSONObject0 = new JSONObject((Object) "java.lang.Byte@0000000001");
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
  //Test case number: 8
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = (-2110L);
      Long long1 = new Long((-2110L));
      JSONObject jSONObject0 = new JSONObject(long1);
      jSONObject0.remove("{D;Npo]o0");
      jSONObject0.names();
      Long.getLong("^^4Gc`Ii:Gm", (-2110L));
      Long.getLong("'lg");
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
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = " {yNt+Wz\\fl";
      JSONTokener jSONTokener0 = new JSONTokener(" {yNt+Wz\fl");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at character 10 of  {yNt+Wz\fl
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "\b";
      stringArray0[3] = "F+B82d&|]lwSbJ)*";
      stringArray0[4] = "";
      stringArray0[5] = "#-<o8%X8s!R";
      jSONObject0.optInt("\b");
      stringArray0[6] = "";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optInt("");
      HashMap<JSONArray, Double> hashMap0 = new HashMap<JSONArray, Double>();
      jSONObject0.put("", (Map) hashMap0);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject.testValidity(object0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.putOpt("p@#[pV[K-<<[2sI5e", object0);
      jSONObject1.optInt("p@#[pV[K-<<[2sI5e", 0);
      JSONObject.valueToString(object0);
      Boolean boolean0 = new Boolean(true);
      Boolean.logicalOr(true, true);
      Boolean.compare(true, true);
      try { 
        jSONObject0.getJSONObject("p@#[pV[K-<<[2sI5e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"p@#[pV[K-<<[2sI5e\"] is not a JSONObject.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      jSONObject0.optDouble("");
      stringArray0[1] = "";
      stringArray0[2] = "\b";
      jSONObject0.append("yGD", "\b");
      stringArray0[3] = "c^;_o{3t`OAX";
      stringArray0[4] = "";
      stringArray0[5] = "#-<o8%X8s!R";
      stringArray0[6] = "";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      JSONObject.quote("");
      jSONObject1.put("c^;_o{3t`OAX", 70);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8343343686395694
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Map<JSONObject, String> map0 = null;
      JSONObject jSONObject0 = new JSONObject((Map) null);
      JSONObject jSONObject1 = jSONObject0.putOpt("\n", (Object) null);
      String string0 = null;
      jSONObject0.keys();
      Boolean boolean0 = new Boolean(false);
      jSONObject1.putOpt("' and instead saw '", boolean0);
      jSONObject0.toString();
      JSONObject.getNames((Object) null);
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
  //Test case number: 15
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      String string0 = "] is not a JSONObject.";
      JSONObject.quote("?c;?VQ}3>f3`_t_~");
      JSONObject.getNames(jSONObject0);
      jSONObject0.remove("] is not a JSONObject.");
      jSONObject0.toJSONArray((JSONArray) null);
      jSONObject0.optLong("wheel.json.JSONObject$1", 0L);
      jSONObject0.toString();
      try { 
        jSONObject0.getJSONArray("islogicalOr");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"islogicalOr\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = null;
      jSONObject0.keys();
      JSONObject.valueToString((Object) null);
      JSONObject.getNames((Object) null);
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
  //Test case number: 17
  /*Coverage entropy=1.910465511497843
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      String string0 = JSONObject.quote("^");
      assertEquals("\"^\"", string0);
      
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
      
      jSONObject0.remove("] is not a JSONObject.");
      String string1 = JSONObject.valueToString(object0);
      assertEquals("null", string1);
      
      int int0 = jSONObject0.length();
      assertEquals(1, int0);
      
      jSONObject0.toString(64, (-411));
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.2922907509099737
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = null;
      Iterator iterator0 = jSONObject0.keys();
      JSONObject.valueToString(iterator0);
      JSONObject.getNames(jSONObject0);
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
  //Test case number: 19
  /*Coverage entropy=1.7677614722893296
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONArray0.put(0L);
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optDouble((String) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        jSONObject0.put("isnotifyAll", Double.NaN);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSON does not allow non-finite numbers.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4075317407193155
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = JSONObject.quote("dZtrue");
      assertEquals("\"dZtrue\"", string0);
      
      JSONObject jSONObject0 = new JSONObject();
      String string1 = JSONObject.valueToString(jSONObject0, 46, (-1458));
      assertEquals("{}", string1);
      
      jSONObject0.toString((-1458), 46);
      Boolean boolean0 = new Boolean("\"dZtrue\"");
      String string2 = JSONObject.valueToString(jSONObject0);
      assertFalse(string2.equals((Object)string1));
      
      jSONObject0.length();
      jSONObject0.opt("\"dZtrue\"");
      String string3 = jSONObject0.toString(2091, 1205);
      assertEquals("{}", string3);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      int int0 = (-2187);
      JSONObject.valueToString(object0, (-2187), (-2187));
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.isNull("\"java.lang.Object@0000000001\"");
      JSONObject jSONObject1 = jSONObject0.put("\"java.lang.Object@0000000001\"", (long) (-2187));
      jSONObject0.put("\"java.lang.Object@0000000001\"", 4809.0);
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONArray0.put(0L);
      JSONObject.valueToString(jSONArray0, (-2187), (-1559));
      jSONObject1.optDouble("\"java.lang.Object@0000000001\"");
      jSONObject1.length();
      jSONObject1.optDouble("\"java.lang.Object@0000000001\"", 2937.854);
      String string0 = "lAtvNmz:V";
      String[] stringArray0 = new String[0];
      JSONObject jSONObject2 = new JSONObject(jSONObject0, stringArray0);
      try { 
        jSONObject2.put((String) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.3099724052108055
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      Object object1 = new Object();
      jSONObject0.putOpt(",\n", object1);
      Double double0 = new Double(0.0);
      JSONObject.getNames((Object) double0);
      JSONObject.quote("?c;?VQ}3>f3`_t_~");
      JSONObject.getNames(jSONObject0);
      jSONObject0.remove("] is not a JSONObject.");
      jSONObject0.toJSONArray((JSONArray) null);
      jSONObject0.optLong("wheel.json.JSONObject$1", 0L);
      jSONObject0.toString();
      try { 
        jSONObject0.getJSONArray("islogicalOr");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"islogicalOr\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject.quote("true");
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.valueToString(jSONObject0, 46, (-1458));
      jSONObject0.toString((-1458), 46);
      jSONObject0.optBoolean("\"true\"");
      jSONObject0.toString(1256, 1256);
      jSONObject0.length();
      jSONObject0.opt("\"true\"");
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[0];
      stringWriter0.write(charArray0);
      jSONObject0.toString(1256);
      JSONObject jSONObject1 = jSONObject0.putOpt("\"true\"", "true");
      jSONObject1.write(stringWriter0);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.1005384429577236
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      Object object1 = JSONObject.NULL;
      jSONObject0.putOpt(",\n", object1);
      Double double0 = new Double(0.0);
      JSONObject.getNames((Object) double0);
      JSONObject.quote("?c;?VQ}3>f3`_t_~");
      JSONObject.getNames(jSONObject0);
      JSONObject.quote("?c;?VQ}3>f3`_t_~");
      JSONObject jSONObject1 = new JSONObject((Object) "\"?c;?VQ}3>f3`_t_~\"");
      JSONObject.valueToString(jSONObject1);
      jSONObject0.length();
      // Undeclared exception!
      jSONObject1.toString(3424, 1131);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.817680606075718
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "\b";
      stringArray0[6] = "F+B82d&|]lwSbJ)*";
      stringArray0[4] = "";
      stringArray0[5] = "#-<o8%X8s!TR";
      jSONObject0.optInt("\b");
      stringArray0[6] = "";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optInt("T");
      HashMap<JSONArray, Double> hashMap0 = new HashMap<JSONArray, Double>();
      jSONObject0.put("", (Map) hashMap0);
      assertEquals(1, jSONObject0.length());
  }
}
