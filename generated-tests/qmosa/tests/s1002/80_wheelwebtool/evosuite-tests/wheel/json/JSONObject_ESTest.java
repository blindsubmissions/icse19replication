/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:15:13 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiConsumer;
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.names();
      jSONObject0.put("", (-267L));
      try { 
        jSONObject0.getJSONArray("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(":T~8op8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of :T~8op8
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.putOpt("] not found.", "] not found.");
      jSONObject1.toString((-1685), 4);
      try { 
        jSONObject0.getLong((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
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
      JSONObject.getNames((Object) null);
      Float float0 = new Float(2481.2F);
      JSONObject jSONObject0 = new JSONObject(float0);
      Float.sum(0.0F, (-313.0F));
      int int0 = jSONObject0.optInt(".oYLdATD");
      assertEquals(0, int0);
      
      jSONObject0.optJSONArray("wheel.json.JSONObject$1");
      assertEquals(3, jSONObject0.length());
      
      String string0 = JSONObject.quote("wheel.json.JSONObject$1");
      assertEquals("\"wheel.json.JSONObject$1\"", string0);
      
      Long long0 = new Long(0);
      String[] stringArray0 = JSONObject.getNames((Object) long0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optJSONArray("A JSONArray text must start with '['");
      Long long0 = new Long(0L);
      Long.divideUnsigned(0L, 264L);
      Long long1 = Long.getLong("A JSONArray text must start with '['", long0);
      Long.sum(197L, 0L);
      Long.max(0L, (-769L));
      JSONObject.valueToString(long1, 0, 0);
      jSONObject0.keys();
      String string0 = jSONObject0.toString(0, 2875);
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "r=GISa*2+QA2J_&F`N";
      stringArray0[1] = ": ";
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.put("((XMOIqipwoRNX<0", 2355L);
      jSONObject1.remove(".");
      jSONObject0.optInt("Z~g[<^RQIhKLHiXh");
      jSONObject0.names();
      jSONObject0.remove("Z~g[<^RQIhKLHiXh");
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "Am>7G]Fz^O";
      jSONObject0.optBoolean("Am>7G]Fz^O", true);
      jSONObject0.put("3@MK(0tpTTiCYWsx'n", false);
      jSONObject0.keys();
      try { 
        jSONObject0.getDouble("Am>7G]Fz^O");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Am>7G]Fz^O\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Float, JSONObject> hashMap0 = new HashMap<Float, JSONObject>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      boolean boolean0 = jSONObject0.has("null");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      JSONObject.getNames(jSONObject0);
      JSONObject.valueToString("ck");
      JSONObject jSONObject1 = jSONObject0.put("ck", (Collection) null);
      Integer integer0 = new Integer(0);
      JSONObject jSONObject2 = jSONObject1.accumulate("\"java.lang.String@0000000002\"", integer0);
      JSONObject.valueToString("ck");
      jSONObject0.optString("\"java.lang.String@0000000002\"", ",\n");
      jSONObject2.getInt("\"java.lang.String@0000000002\"");
      jSONObject0.length();
      jSONObject2.optString(",\n", "\"java.lang.String@0000000002\"");
      jSONObject0.toString(0, 0);
      boolean boolean0 = jSONObject2.optBoolean("y/N,~jcxU&W,H");
      assertEquals(3, jSONObject0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNull(stringArray0);
      
      JSONObject jSONObject1 = jSONObject0.put("Expected a ',' or '}'", true);
      jSONObject1.toString((-1295), 693);
      JSONObject jSONObject2 = jSONObject0.put("Expected a ',' or '}'", 101);
      int int0 = jSONObject2.optInt("Expected a ',' or '}'", 101);
      assertEquals(101, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      Double double1 = new Double(0.0);
      JSONObject jSONObject0 = new JSONObject(double1);
      String string0 = "jhmvvAO";
      JSONObject jSONObject1 = jSONObject0.append("jhmvvAO", "jhmvvAO");
      Double.isFinite(0.0);
      Double.min(1.0, 1.0);
      jSONObject0.append("jhmvvAO", double1);
      JSONObject.valueToString((Object) null);
      Double.isFinite(0.0);
      jSONObject0.toString();
      jSONObject0.accumulate("", double1);
      int int0 = 0;
      jSONObject1.toString(0);
      try { 
        jSONObject0.getDouble("{\"java.lang.String@0000000003\":java.lang.Boolean@0000000004,\"java.lang.String@0000000005\":java.lang.Boolean@0000000006,\"java.lang.String@0000000007\":\"java.lang.Class@0000000008\",\"java.lang.String@0000000009\":wheel.json.JSONArray@0000000002}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"{\\\"java.lang.String@0000000003\\\":java.lang.Boolean@0000000004,\\\"java.lang.String@0000000005\\\":java.lang.Boolean@0000000006,\\\"java.lang.String@0000000007\\\":\\\"java.lang.Class@0000000008\\\",\\\"java.lang.String@0000000009\\\":wheel.json.JSONArray@0000000002}\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "{N}.6yp3_Zs1j[U-'";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("{N}.6yp3_Zs1j[U-'");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at character 3 of {N}.6yp3_Zs1j[U-'
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0981473891350673
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      JSONObject jSONObject1 = new JSONObject();
      JSONObject jSONObject2 = jSONObject0.put("", (Object) jSONObject1);
      jSONObject2.remove("");
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
  //Test case number: 13
  /*Coverage entropy=1.5624893593325069
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = JSONObject.getNames(object0);
      assertNull(stringArray0);
      
      jSONObject0.put("6p>GLkL9gnrBV?(", 44);
      Float float0 = new Float(3022.0F);
      Float.sum(0.0F, 2481.2F);
      JSONObject jSONObject1 = new JSONObject();
      jSONObject1.keys();
      jSONObject0.optJSONArray("");
      String string0 = JSONObject.quote("wheel.json.JSONObject$1");
      assertEquals("\"wheel.json.JSONObject$1\"", string0);
      
      Long long0 = new Long(3153L);
      Double double0 = new Double(3153L);
      String[] stringArray1 = JSONObject.getNames((Object) double0);
      assertNotNull(stringArray1);
      assertEquals(11, stringArray1.length);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4680602034990462
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject.doubleToString((-1949.432383506));
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-1668));
      Double double0 = new Double((-68.2700405347447));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "7(?`#U)-E~yRG1=e";
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = null;
      try {
        jSONArray1 = new JSONArray("wheel.json.JSONException");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of wheel.json.JSONException
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optBoolean((String) null);
      jSONObject0.optLong("JSNObject[", 0L);
      JSONObject.getNames(jSONObject0);
      jSONObject0.put("true", 0.0);
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
  //Test case number: 16
  /*Coverage entropy=1.7527782196513173
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double.isFinite(0.0);
      double double0 = (-187.4);
      Double.min(0.0, (-187.4));
      String string0 = "_!.Z~QZs.@!|9#u";
      Object object0 = JSONObject.NULL;
      jSONObject0.append("_!.Z~QZs.@!|9#u", object0);
      JSONObject.valueToString(jSONObject0);
      Double.isFinite(1.0);
      jSONObject0.toString();
      String string1 = ": ";
      JSONTokener jSONTokener0 = new JSONTokener(": ");
      JSONObject jSONObject1 = null;
      try {
        jSONObject1 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of : 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = null;
      jSONObject0.optBoolean((String) null);
      try { 
        jSONObject0.append((String) null, "YEq9i/@(%cpX");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4878167164014493
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject.doubleToString((-1949.432383506));
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      Integer integer0 = new Integer((-1668));
      hashMap0.putIfAbsent("7(?`#U)-E~yRG1=e", integer0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.accumulate("A JSONObject text must begin with '{'", "-1949.432383506");
      JSONObject jSONObject2 = jSONObject0.accumulate("7(?`#U)-E~yRG1=e", "A JSONObject text must begin with '{'");
      assertSame(jSONObject2, jSONObject1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7565367399084861
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject.doubleToString((-1949.432383506));
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-1668));
      hashMap0.putIfAbsent("7(?`#U)-E~yRG1=e", integer0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.accumulate("A JSONObject text must begin with '{'", "-1949.432383506");
      jSONObject0.getDouble("A JSONObject text must begin with '{'");
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.216239871989847
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = 0.0;
      Double double1 = new Double(0.0);
      JSONObject jSONObject0 = new JSONObject(double1);
      JSONObject jSONObject1 = jSONObject0.append("jhmvvAO", "jhmvvAO");
      Double.isFinite(0.0);
      Double.min(0.0, 818.1078334729);
      jSONObject1.append("p$D@Maq.9?91", "p$D@Maq.9?91");
      Float float0 = new Float((-1570.999F));
      JSONObject.valueToString(float0);
      Double.isFinite(Double.NaN);
      jSONObject0.toString();
      String string0 = "";
      Double double2 = new Double((-1.0));
      jSONObject0.accumulate("n,s@DHMy^<d+Kg", double2);
      int int0 = 0;
      jSONObject1.toString(0);
      try { 
        jSONObject1.getDouble((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.995732273553991
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "r=GISa*2+QA2J_&F`N";
      stringArray0[1] = ": ";
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      jSONObject0.put("r=GISa*2+QA2J_&F`N", (Collection) linkedList0);
      JSONObject jSONObject1 = jSONObject0.put("((XMOIqipwoRNX<0", 2355L);
      jSONObject1.remove(".");
      int int0 = jSONObject0.optInt("Z~g[<^RQIhKLHiXh");
      assertEquals(0, int0);
      
      JSONArray jSONArray0 = jSONObject0.names();
      assertNotNull(jSONArray0);
      
      jSONObject0.remove("Z~g[<^RQIhKLHiXh");
      long long0 = jSONObject0.optLong("put");
      assertEquals(0L, long0);
      
      double double0 = jSONObject0.optDouble("istoJSONArray");
      assertEquals(Double.NaN, double0, 0.01);
  }
}
