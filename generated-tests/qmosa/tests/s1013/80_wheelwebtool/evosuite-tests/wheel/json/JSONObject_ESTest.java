/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:22:35 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.UnaryOperator;
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
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*2eCAT9^m#aDxdp";
      stringArray0[1] = "*2eCAT9^m#aDxdp";
      stringArray0[2] = "*2eCAT9^m#aDxdp";
      stringArray0[3] = "*2eCAT9^m#aDxdp";
      stringArray0[4] = "*2eCAT9^m#aDxdp";
      stringArray0[5] = "*2eCAT9^m#aDxdp";
      stringArray0[6] = "*2eCAT9^m#aDxdp";
      stringArray0[7] = "*2eCAT9^m#aDxdp";
      JSONObject jSONObject0 = new JSONObject("*2eCAT9^m#aDxdp", stringArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      jSONObject0.put("*2eCAT9^m#aDxdp", (Map) hashMap0);
      jSONObject0.remove("*2eCAT9^m#aDxdp");
      Long long0 = new Long(2616L);
      try { 
        jSONObject0.getBoolean("");
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Short, Long> hashMap0 = new HashMap<Short, Long>(2029, 2029);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONArray0.optLong(2029);
      JSONObject.valueToString(jSONArray0, 93, 93);
      jSONObject0.optDouble("");
      try { 
        jSONObject0.getString((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JSONObject.numberToString(float0);
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("java.lang.Float@0000000001");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of java.lang.Float@0000000001
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1620202892385871
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = JSONObject.quote("??tYv1-");
      Long long0 = new Long(0L);
      Long.getLong("", (-912L));
      String string1 = JSONObject.valueToString(long0, (-1617), (-1617));
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.979204517434325
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Long, Integer> hashMap0 = new HashMap<Long, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = ",\n";
      jSONObject0.optDouble(",\n", 0.0);
      Integer integer0 = new Integer((-1113));
      Integer.getInteger(",\n");
      Integer.getInteger(",\n", (-1113));
      jSONObject0.accumulate("x2", integer0);
      String string1 = "";
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
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(3638);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optBoolean("");
      jSONObject1.remove("");
      jSONObject1.optBoolean("");
      JSONObject.doubleToString(1159.9299);
      jSONObject1.has("@t9");
      jSONObject0.keys();
      try { 
        jSONObject0.getJSONArray("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "";
      JSONObject jSONObject0 = new JSONObject((Object) "");
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      jSONObject0.put("", (Collection) linkedList0);
      try { 
        jSONObject0.getDouble("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] is not a number.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.optJSONObject(774);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "al8ZNp7iR";
      jSONArray0.put(0, (Object) null);
      stringArray0[1] = "get";
      stringArray0[2] = "OJ.y#6xr_&gl0Q";
      stringArray0[3] = "";
      stringArray0[4] = "] is not a JSONObject.";
      stringArray0[5] = "Expected a ',' or ']'";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((JSONObject) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Float float0 = new Float((-3484.5342F));
      JSONObject jSONObject0 = new JSONObject(float0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      jSONObject1.toString(123, 55);
      JSONObject.quote("{\"java.lang.String@0000000003\": \"java.lang.Class@0000000004\"}");
      jSONObject1.toString(55, 4);
      jSONObject0.optDouble("{\"java.lang.String@0000000003\": \"java.lang.Class@0000000004\"}");
      jSONObject0.optBoolean("", true);
      Float.min(55, 4);
      jSONObject1.toString();
      Float.sum(377.7964F, 917.06F);
      try { 
        jSONObject1.getBoolean((String) null);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double(Double.NaN);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "mA'Zzb)3r*g'#f~}Ef$";
      stringArray0[3] = ";*z-.B";
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      jSONObject0.toString(1928, 929);
      jSONObject0.put("\"-8T|3&&3E]qk&", 4936L);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "wtt#&Q7E%[-S";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "Unterminated string";
      JSONObject jSONObject1 = new JSONObject((Object) jSONObject0, stringArray0);
      boolean boolean0 = jSONObject1.isNull("Unterminated string");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.9263215158543445
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "");
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Unterminated string";
      stringArray0[3] = "0.0";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "wtt#&Q7E%[-S";
      JSONObject jSONObject1 = new JSONObject("", stringArray0);
      JSONObject jSONObject2 = new JSONObject(jSONObject0, stringArray0);
      jSONObject2.isNull("");
      try { 
        jSONObject1.getDouble("Unterminated string");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Unterminated string\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.217734004511779
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(3638);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toString(3638, 3638);
      JSONObject.quote("getformat");
      jSONObject0.toString(94, 4);
      jSONObject0.optDouble("");
      jSONObject0.optBoolean("getformat", true);
      Float.min(3638, (-1.0F));
      jSONObject0.toString();
      Float.sum(1.0F, 4);
      jSONObject0.put("", (long) 3638);
      JSONObject jSONObject1 = new JSONObject("getformat", stringArray0);
      try { 
        jSONObject1.getBoolean(" YJTSm51sF5s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\" YJTSm51sF5s\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.38888971472958
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(3638);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optBoolean("");
      jSONObject1.remove("");
      jSONObject1.optBoolean("");
      JSONObject.valueToString(jSONObject0);
      jSONObject1.has("@t9");
      jSONObject0.keys();
      try { 
        jSONObject0.getJSONArray("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Float float0 = new Float((-3484.5342F));
      JSONObject jSONObject0 = new JSONObject(float0);
      int int0 = 55;
      jSONObject0.toString(123, 55);
      JSONObject.quote("{\n                                                                                                                                                                                  \"java.lang.String@0000000002\": java.lang.Boolean@0000000003,\n                                                                                                                                                                                  \"java.lang.String@0000000004\": java.lang.Boolean@0000000005,\n                                                                                                                                                                                  \"java.lang.String@0000000006\": \"java.lang.Class@0000000007\"\n                                                       }");
      jSONObject0.toString(55, 4);
      jSONObject0.optDouble("{\n                                                                                                                                                                                  \"java.lang.String@0000000002\": java.lang.Boolean@0000000003,\n                                                                                                                                                                                  \"java.lang.String@0000000004\": java.lang.Boolean@0000000005,\n                                                                                                                                                                                  \"java.lang.String@0000000006\": \"java.lang.Class@0000000007\"\n                                                       }");
      jSONObject0.optBoolean("\"{\n                                                                                                                                                                                  \"java.lang.String@0000000002\": java.lang.Boolean@0000000003,\n                                                                                                                                                                                  \"java.lang.String@0000000004\": java.lang.Boolean@0000000005,\n                                                                                                                                                                                  \"java.lang.String@0000000006\": \"java.lang.Class@0000000007\"\n                                                       }\"", true);
      Float.min(55, 4);
      jSONObject0.toString();
      Float.sum(377.7964F, 917.06F);
      Float.isFinite(917.06F);
      jSONObject0.optBoolean((String) null, true);
      try { 
        jSONObject0.put((String) null, (long) 123);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.30565733829864
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(3638);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      boolean boolean0 = jSONObject1.optBoolean("");
      assertFalse(boolean0);
      
      jSONObject1.remove("");
      Long.getLong("", 0L);
      String string0 = JSONObject.valueToString(jSONObject1, 3638, 3638);
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.151093176759188
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject.doubleToString(0.0);
      JSONTokener jSONTokener0 = new JSONTokener("0");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "0";
      stringArray0[1] = "0";
      stringArray0[2] = "0";
      stringArray0[3] = "_yn=sX/L";
      stringArray0[4] = "0";
      stringArray0[5] = "0";
      stringArray0[6] = "0";
      JSONObject jSONObject0 = new JSONObject("0", stringArray0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optBoolean("_yn=sX/L");
      jSONObject1.remove("+o4iDx");
      jSONObject1.optBoolean("0");
      JSONObject.doubleToString((-1.0));
      jSONObject1.has((String) null);
      jSONObject1.keys();
      try { 
        jSONObject0.getJSONArray("_yn=sX/L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"_yn=sX/L\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Long.getLong("getquote");
      HashMap<JSONObject, Byte> hashMap0 = new HashMap<JSONObject, Byte>();
      HashMap<JSONObject, Byte> hashMap1 = new HashMap<JSONObject, Byte>(hashMap0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap1);
      jSONObject0.optString("true");
      JSONArray jSONArray0 = new JSONArray((Collection) null);
      JSONTokener jSONTokener0 = new JSONTokener("");
      JSONArray jSONArray1 = null;
      try {
        jSONArray1 = new JSONArray(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 0 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<JSONObject, Float> hashMap0 = new HashMap<JSONObject, Float>(4);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "J?ae^";
      stringArray0[1] = "getgetJSONObject";
      stringArray0[2] = "iY&5]QW";
      stringArray0[3] = "A JSONObject text must end with '}'";
      stringArray0[4] = "qu";
      stringArray0[5] = "u|iM`N%iO/qa";
      stringArray0[6] = "}ymqC|";
      stringArray0[7] = "put";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      int int0 = jSONObject1.optInt("A JSONObject text must end with '}'");
      assertEquals(0, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.271899083808096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "wtt#&Q7E%[-S";
      stringArray0[1] = "";
      stringArray0[2] = "";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      try { 
        jSONObject0.getBoolean("[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"[\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.109036727378708
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "e3gJDemBN?Ps");
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      int int0 = 59;
      jSONObject0.toString(59, 123);
      JSONObject.quote("Null pointer");
      String string0 = jSONObject0.toString(51, 59);
      jSONObject0.optDouble("W[& i");
      jSONObject0.optBoolean(string0, false);
      Float.min(59, 55);
      jSONObject0.toString();
      Float.sum((-504.888F), (-737.89F));
      JSONObject jSONObject1 = new JSONObject();
      try { 
        jSONObject0.getBoolean("{\"java.lang.String@0000000002\":[java.lang.Byte@0000000035,java.lang.Byte@0000000036,java.lang.Byte@0000000037,java.lang.Byte@0000000038,java.lang.Byte@0000000039,java.lang.Byte@0000000040,java.lang.Byte@0000000041,java.lang.Byte@0000000042,java.lang.Byte@0000000043,java.lang.Byte@0000000044,java.lang.Byte@0000000045,java.lang.Byte@0000000046],\"java.lang.String@0000000016\":\"java.lang.Class@0000000017\",\"java.lang.String@0000000018\":java.lang.Boolean@0000000019}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"{\\\"java.lang.String@0000000002\\\":[java.lang.Byte@0000000035,java.lang.Byte@0000000036,java.lang.Byte@0000000037,java.lang.Byte@0000000038,java.lang.Byte@0000000039,java.lang.Byte@0000000040,java.lang.Byte@0000000041,java.lang.Byte@0000000042,java.lang.Byte@0000000043,java.lang.Byte@0000000044,java.lang.Byte@0000000045,java.lang.Byte@0000000046],\\\"java.lang.String@0000000016\\\":\\\"java.lang.Class@0000000017\\\",\\\"java.lang.String@0000000018\\\":java.lang.Boolean@0000000019}\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6769877743224175
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      String string0 = "wtt#&Q7E%[-S";
      stringArray0[0] = "wtt#&Q7E%[-S";
      stringArray0[1] = "";
      JSONObject jSONObject1 = new JSONObject();
      jSONObject1.append("", hashMap0);
      byte byte0 = (byte) (-67);
      Byte byte1 = new Byte((byte) (-67));
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray(byte1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray initial value should be a string or collection or array.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, Double> hashMap0 = new HashMap<Object, Double>();
      Long long0 = new Long(0L);
      Double double0 = new Double((-4704.86));
      hashMap0.put(long0, double0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.optJSONArray("qD;8D/hTo!0'f.<C`I");
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Short, String> hashMap0 = new HashMap<Short, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Double double0 = new Double((-1.0));
      Double.isFinite((-1.0));
      String string0 = jSONObject0.toString((-2191));
      assertEquals("{}", string0);
      
      long long0 = jSONObject0.optLong("w;WE(5", (-3285L));
      assertEquals((-3285L), long0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Short, String> hashMap0 = new HashMap<Short, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Double double0 = new Double((-1.0));
      jSONObject0.put("0!/_=h9U8`31m", 1376);
      Double.isFinite((-1.0));
      Double.sum((-1.0), (-1.0));
      JSONObject jSONObject1 = jSONObject0.put("!\"3|1", (Object) double0);
      JSONObject.getNames((Object) jSONObject1);
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      linkedList0.pollFirst();
      linkedList0.parallelStream();
      UnaryOperator<JSONObject> unaryOperator0 = UnaryOperator.identity();
      linkedList0.replaceAll(unaryOperator0);
      JSONArray jSONArray0 = new JSONArray();
      String string0 = JSONObject.valueToString(jSONArray0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.4616233627612907
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "wtt#&Q7E%[-S";
      stringArray0[1] = "";
      Float.sum((-1.0F), 915.819F);
      Float.isFinite((-807.64F));
      jSONObject0.optBoolean("", true);
      JSONObject jSONObject1 = jSONObject0.put("gettoUpperCase", 545L);
      jSONObject1.toString(32);
      StringWriter stringWriter0 = new StringWriter(101);
      jSONObject0.write(stringWriter0);
      JSONArray jSONArray0 = new JSONArray();
      JSONObject.getNames((Object) jSONArray0);
      jSONObject0.optString("", "wtt#&Q7E%[-S");
      JSONObject jSONObject2 = jSONObject0.optJSONObject("aJ84-R\"");
      assertNull(jSONObject2);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = null;
      Object object0 = JSONObject.NULL;
      try { 
        jSONObject0.append((String) null, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }
}
