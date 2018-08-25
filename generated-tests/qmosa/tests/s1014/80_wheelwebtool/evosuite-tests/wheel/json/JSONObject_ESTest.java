/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:46:29 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      JSONObject jSONObject0 = new JSONObject(integer0);
      Integer.compare(0, 0);
      String string0 = "]&";
      try { 
        jSONObject0.getInt("]&");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"]&\"] not found.
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
      JSONObject jSONObject0 = new JSONObject();
      String string0 = null;
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
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      jSONObject1.length();
      String string0 = "";
      try { 
        jSONObject1.getInt("");
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
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      String string0 = "Substring bounds error";
      jSONObject0.optDouble("Substring bounds error");
      String string1 = "\\u";
      try { 
        jSONObject0.getString(string1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\\\\u\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("Null pointer");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of Null pointer
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject.doubleToString(0.0);
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "";
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
  //Test case number: 6
  /*Coverage entropy=1.4794090592280063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      boolean boolean1 = false;
      Boolean.logicalXor(false, false);
      Boolean.logicalAnd(true, false);
      JSONObject.getNames((Object) boolean0);
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "wM?L";
      JSONObject jSONObject1 = jSONObject0.put("wM?L", (Object) boolean0);
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject1.toJSONArray(jSONArray0);
      try { 
        jSONObject1.getString("000");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"000\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.7776612957621659
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      try { 
        jSONObject0.getString("i0w%51");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"i0w%51\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      short short0 = (short)0;
      Short short1 = new Short((short)0);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(short1, stringArray0);
      String string0 = "";
      jSONObject0.optInt("");
      HashMap<JSONObject, Float> hashMap0 = new HashMap<JSONObject, Float>();
      JSONTokener jSONTokener0 = new JSONTokener("vQzpTz{F<&TMfF");
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of vQzpTz{F<&TMfF
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.260233853174674
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONObject jSONObject0 = new JSONObject(jSONArray0);
      linkedList0.pollFirst();
      jSONArray0.toString();
      jSONArray0.toString(1630, (-1676));
      JSONObject jSONObject1 = jSONObject0.put("Unterminated string", 1630);
      jSONObject1.remove("[]");
      linkedList0.add("[]");
      jSONObject1.keys();
      Double double0 = new Double(1630);
      JSONObject.valueToString(jSONObject1, (-1676), (-1676));
      long long0 = new Long((-1676));
      jSONObject1.optLong("] is not a JSONObject.");
      JSONObject.quote("I9`H");
      try { 
        jSONObject1.getJSONArray("wai");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"wai\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      Float.sum(0.0F, 1.0F);
      stringArray0[1] = "P.6WoOX:6)UZ";
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      jSONObject0.keys();
      Double double0 = new Double(0.0F);
      JSONObject.valueToString(double0, 0, 0);
      jSONObject0.optLong("=2sSA5UN\"n3AN(0d", 1029L);
      jSONObject0.optLong("");
      HashMap<JSONObject, Float> hashMap0 = new HashMap<JSONObject, Float>();
      jSONObject0.put("P.6WoOX:6)UZ", (Map) hashMap0);
      JSONObject.quote("Xk{;0");
      try { 
        jSONObject0.getJSONArray("Xk{;0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Xk{;0\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Long long0 = new Long(2002L);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "tF^@YwDUQS";
      stringArray0[1] = "wheel.json.JSONObject$Null";
      stringArray0[2] = "JSONArray initial value should be a string or collection or array.";
      stringArray0[3] = "] is not a Boolean.";
      Long.max(0L, 1L);
      stringArray0[4] = "";
      stringArray0[5] = "!]x;B4B";
      stringArray0[6] = "K/kp(RcA=";
      stringArray0[7] = "";
      stringArray0[8] = "wheel.json.JSONArray";
      JSONObject jSONObject0 = new JSONObject(long0, stringArray0);
      StringWriter stringWriter0 = new StringWriter(42);
      StringWriter stringWriter1 = stringWriter0.append('@');
      StringWriter stringWriter2 = stringWriter1.append((CharSequence) "K/kp(RcA=");
      Writer writer0 = jSONObject0.write(stringWriter2);
      jSONObject0.write(writer0);
      assertEquals("@K/kp(RcA={}{}", stringWriter2.toString());
      
      boolean boolean0 = jSONObject0.optBoolean("] is not a Boolean.", true);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1031358906658317
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean.compare(true, true);
      Boolean.logicalXor(false, false);
      Boolean.logicalAnd(true, false);
      String[] stringArray0 = JSONObject.getNames((Object) boolean0);
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject("wM?L", stringArray0);
      jSONObject1.keys();
      Double double0 = new Double(1222.6751);
      Integer integer0 = new Integer(3226);
      JSONObject.valueToString(integer0, 0, 160);
      jSONObject0.optLong("QkHL~cZ4Ax|YJ");
      JSONObject.quote("QkHL~cZ4Ax|YJ");
      String string0 = jSONObject0.optString("iswrite", "iswrite");
      assertEquals("iswrite", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      jSONObject0.put("tF^@YwDUQS", (Collection) linkedList0);
      JSONTokener jSONTokener0 = new JSONTokener("\"\"");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "] is not a Boolean.";
      stringArray0[1] = "tF^@YwDUQS";
      stringArray0[2] = "";
      stringArray0[3] = "istoUnsignedLong";
      stringArray0[4] = "cm$!~z_#x$V>>*G6*:";
      stringArray0[5] = ",\n";
      stringArray0[6] = "JSONArray initial value should be a string or collection or array.";
      JSONObject jSONObject1 = new JSONObject((Object) "\"\"");
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-2089));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "P.6WoOX:6)UZ";
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      jSONObject0.keys();
      Double double0 = new Double(0.0F);
      JSONObject.valueToString(double0, 0, 0);
      jSONObject0.optBoolean("P.6WoOX:6)UZ");
      JSONObject jSONObject1 = jSONObject0.put("istoString", (long) 0);
      jSONObject0.length();
      Short short0 = new Short((short)0);
      JSONObject jSONObject2 = new JSONObject(jSONObject1, stringArray0);
      jSONObject2.putOpt("java.lang.Double@0000000002", "istoString");
      JSONArray jSONArray0 = jSONObject0.optJSONArray("no");
      assertNull(jSONArray0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.349792396172401
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject.doubleToString(20.749769286540435);
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "";
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
  //Test case number: 16
  /*Coverage entropy=1.8949506984485254
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      JSONObject jSONObject0 = new JSONObject(integer0);
      Integer.compare(0, 0);
      Integer.compare(391, 998);
      jSONObject0.optLong("getwrite", (long) 0);
      Object object0 = new Object();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "getwrite";
      stringArray0[2] = "K/kp(RcA=";
      stringArray0[3] = "-Ig3s5^h#";
      stringArray0[4] = "wheel.json.JSONArray";
      stringArray0[5] = "wheel.json.JSONArray";
      stringArray0[6] = "]&";
      stringArray0[7] = "";
      JSONObject jSONObject1 = new JSONObject(object0, stringArray0);
      StringWriter stringWriter0 = new StringWriter(96);
      StringWriter stringWriter1 = stringWriter0.append('9');
      StringWriter stringWriter2 = stringWriter0.append((CharSequence) "wheel.json.JSONArray");
      jSONObject0.write(stringWriter1);
      Writer writer0 = jSONObject1.write(stringWriter2);
      assertSame(writer0, stringWriter1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.4193214836740355
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "P.6WoOX:6)UZ";
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      jSONObject0.keys();
      Double double0 = new Double(0.0F);
      String string0 = JSONObject.valueToString(double0, 0, 0);
      jSONObject0.optBoolean("P.6WoOX:6)UZ");
      jSONObject0.length();
      Short short0 = new Short((short)0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.putOpt("java.lang.Double@0000000002", "P.6WoOX:6)UZ");
      jSONObject0.optJSONArray("");
      JSONObject.valueToString((Object) null);
      jSONObject1.names();
      Byte byte0 = new Byte((byte) (-105));
      String string1 = JSONObject.numberToString(byte0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.2104817098009684
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[2];
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      jSONObject0.keys();
      Double double0 = new Double((-1.0));
      Boolean boolean0 = Boolean.valueOf(true);
      JSONObject.valueToString(boolean0, 0, 61);
      jSONObject0.optBoolean(".Z}X");
      JSONObject jSONObject1 = jSONObject0.put("", (long) 0);
      jSONObject0.length();
      Short short0 = new Short((short)0);
      JSONObject jSONObject2 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.putOpt("istoString", "");
      jSONObject1.optJSONArray("");
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(0.0F);
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject("P.6WoOX:6)UZ", stringArray0);
      jSONObject0.keys();
      Double double0 = new Double(0.0F);
      JSONObject.valueToString("P.6WoOX:6)UZ", 15, 80);
      Float float1 = new Float((double) 0);
      Float.max(246.83707F, 0);
      HashMap<JSONObject, Object> hashMap0 = new HashMap<JSONObject, Object>();
      JSONObject jSONObject1 = new JSONObject((Map) hashMap0);
      hashMap0.put(jSONObject0, double0);
      JSONObject jSONObject2 = new JSONObject();
      JSONObject.getNames(jSONObject2);
      jSONObject1.put("\"java.lang.String@0000000002\"", 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONArray0.optJSONObject(15);
      jSONObject1.optInt("Q< M=qlh", 4785);
      assertEquals(1, jSONObject1.length());
      
      JSONObject.quote("P.6WoOX:6)UZ");
      boolean boolean0 = jSONObject2.isNull("I.0\"");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = null;
      JSONObject jSONObject1 = new JSONObject();
      jSONObject0.optString((String) null);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject.getNames((Object) null);
      String string0 = JSONObject.quote("");
      assertEquals("\"\"", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.3017534058885865
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      Integer.compare((-767), (-634));
      Integer.compare(1241, 0);
      jSONObject0.optLong("getwrite", (long) 1241);
      Object object1 = new Object();
      Object object2 = JSONObject.NULL;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "getwrite";
      stringArray0[1] = "-Ig3s5^h#";
      stringArray0[2] = "";
      stringArray0[3] = "]&";
      stringArray0[4] = "getwrite";
      stringArray0[5] = "wheel.json.JSONArray";
      stringArray0[6] = "getwrite";
      JSONObject jSONObject1 = new JSONObject(object2, stringArray0);
      JSONObject jSONObject2 = new JSONObject((Object) jSONObject1, stringArray0);
      StringWriter stringWriter0 = new StringWriter(1055);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "getwrite");
      stringWriter1.append('9');
      stringWriter0.append((CharSequence) "]&");
      Writer writer0 = jSONObject2.write(stringWriter1);
      jSONObject1.put("su", 0L);
      jSONObject0.write(writer0);
      Long long0 = new Long(1055);
      jSONObject1.accumulate("getvalueOf", long0);
      jSONObject1.toString((-634), (-767));
      assertEquals(2, jSONObject1.length());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.70805020110221
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONObject jSONObject0 = new JSONObject(jSONArray0);
      linkedList0.pollFirst();
      jSONArray0.toString();
      int int0 = 1630;
      String string0 = "vXt5\\:HE`eL+n>LXT";
      JSONObject jSONObject1 = jSONObject0.put("getsum", 48);
      jSONObject1.toString(799);
      try { 
        jSONObject0.getInt("vXt5:HE`eL+n>LXT");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"vXt5:HE`eL+n>LXT\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONObject jSONObject0 = new JSONObject(jSONArray0);
      linkedList0.pollFirst();
      jSONArray0.toString();
      JSONObject jSONObject1 = jSONObject0.put("Unterminated string", 1630);
      jSONObject1.optBoolean("Unterminated string", false);
      jSONObject1.remove("[]");
      linkedList0.add("[]");
      jSONObject1.keys();
      Double double0 = new Double(1630);
      JSONObject.valueToString(jSONObject1, (-1676), (-1676));
      Long long0 = new Long((-1676));
      jSONObject1.optLong("] is not a JSONObject.");
      JSONObject.quote("I9`H");
      try { 
        jSONObject1.getBoolean("Unterminated string");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Unterminated string\"] is not a Boolean.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9495936677167384
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = null;
      long long0 = 1L;
      try { 
        jSONObject0.getDouble("V:bQ@LS}xY/dQv`[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"V:bQ@LS}xY/dQv`[\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }
}