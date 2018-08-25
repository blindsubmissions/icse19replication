/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 15:22:14 GMT 2018
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
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.json.JSONArray;
import wheel.json.JSONObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 0 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "";
      String string1 = "]p!V@'^vTodDw?8]";
      jSONObject0.put("]p!V@'^vTodDw?8]", 0L);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject0.accumulate("", jSONArray0);
      int int0 = 1;
      // Undeclared exception!
      try { 
        linkedList0.removeLast();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject.doubleToString(2397.90619322244);
      Object object0 = new Object();
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray initial value should be a string or collection or array.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = "4c.pNVpJ$";
      try { 
        jSONObject0.getInt((String) null);
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
  /*Coverage entropy=2.0431918705451206
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Byte byte0 = new Byte((byte)35);
      Byte.toUnsignedInt((byte)66);
      JSONObject jSONObject0 = new JSONObject(byte0);
      try { 
        jSONObject0.getLong(",\n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\",\\n\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Float.sum(480.0F, 0.0F);
      JSONObject jSONObject0 = new JSONObject(float0);
      JSONObject jSONObject1 = jSONObject0.accumulate("\f", (Object) null);
      jSONObject1.optBoolean("\"\"");
      String string0 = "";
      try { 
        jSONObject1.getString("");
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
      JSONObject jSONObject0 = new JSONObject((Object) "");
      jSONObject0.toString(10, 10);
      assertEquals(3, jSONObject0.length());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Short short0 = Short.valueOf((short)630);
      JSONObject.numberToString(short0);
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.optString("]_t-p'6'!Jf?Xa*xx_");
      assertEquals("", string0);
      
      long long0 = jSONObject0.optLong("<Ns`& Q");
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7356388262012241
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "\\";
      String string1 = ">";
      jSONObject0.optBoolean(">", false);
      jSONObject0.optLong("");
      jSONObject0.keys();
      try { 
        jSONObject0.getDouble("JSON does not allow non-finite numbers.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"JSON does not allow non-finite numbers.\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      Object object0 = JSONObject.NULL;
      Boolean boolean0 = new Boolean("D.AY-jc,XN`RD}N?>");
      hashMap0.getOrDefault(object0, boolean0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[7];
      JSONObject jSONObject1 = jSONObject0.put("", (Map) hashMap0);
      jSONObject1.put("M^DGLih*X2WJQ~/]", 0.0);
      stringArray0[0] = "JSONArray[";
      stringArray0[1] = "";
      stringArray0[2] = "%%|@YvHdM=E(mpfhKel";
      Integer.getInteger("M^DGLih*X2WJQ~/]");
      Boolean boolean1 = new Boolean(true);
      hashMap0.put((Integer) null, boolean1);
      stringArray0[3] = "Unclosed comment";
      stringArray0[4] = "] is not a JSONArray.";
      stringArray0[5] = "!;3K:Jq";
      Integer integer0 = new Integer((-265));
      Boolean boolean2 = Boolean.FALSE;
      hashMap0.put(integer0, boolean2);
      stringArray0[6] = ">c(,";
      JSONObject jSONObject2 = new JSONObject(jSONObject0, stringArray0);
      jSONObject2.remove("] is not a JSONArray.");
      assertEquals(2, jSONObject0.length());
      assertEquals(1, jSONObject2.length());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Number number0 = null;
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
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toJSONArray((JSONArray) null);
      JSONObject jSONObject1 = jSONObject0.accumulate("", "");
      jSONObject0.optLong("");
      jSONObject1.keys();
      jSONObject1.optDouble("", 0.0);
      String string0 = "@YtzBi:6x$wq8jxgY(x";
      try { 
        jSONObject1.getDouble("@YtzBi:6x$wq8jxgY(x");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"@YtzBi:6x$wq8jxgY(x\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8343719702816235
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toJSONArray((JSONArray) null);
      Double double0 = new Double(1827.193929);
      JSONObject jSONObject1 = new JSONObject(double0);
      assertEquals(3, jSONObject1.length());
      
      String string0 = jSONObject0.toString(10, 10);
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3143738430069454
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      short short0 = (short)630;
      Short short1 = Short.valueOf((short)630);
      JSONObject.numberToString(short1);
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      StringWriter stringWriter0 = new StringWriter((short)630);
      StringWriter stringWriter1 = stringWriter0.append('l');
      char[] charArray0 = new char[5];
      charArray0[0] = '5';
      charArray0[1] = 'E';
      charArray0[2] = 'l';
      charArray0[3] = 'F';
      charArray0[4] = 'E';
      stringWriter1.write(charArray0);
      float float0 = 0.0F;
      Float.isFinite(0.0F);
      StringWriter stringWriter2 = new StringWriter();
      stringWriter2.append((CharSequence) "java.lang.Short@0000000001");
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.write(stringWriter0);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("0(?iN-hn!7@e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of 0(?iN-hn!7@e
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.890371757896165
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put(")WCs^hz3LZDj", 380L);
      jSONObject1.optBoolean("H*B", true);
      jSONObject0.toString(0, (-21));
      jSONObject0.isNull("%uL0A");
      jSONObject0.put(")WCs^hz3LZDj", (double) 380L);
      Byte.toUnsignedInt((byte) (-42));
      JSONObject jSONObject2 = jSONObject0.put("", false);
      jSONObject2.optBoolean("{\"java.lang.String@0000000003\": java.lang.Long@0000000004}", false);
      Byte.toUnsignedInt((byte) (-42));
      String string0 = "\\u";
      JSONArray jSONArray0 = new JSONArray();
      try { 
        jSONArray0.getJSONObject(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray[1] not found.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9490718750258813
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toString(0, 0);
      jSONObject0.isNull("%uL0A");
      StringWriter stringWriter0 = new StringWriter();
      Double double0 = new Double(0.0);
      JSONObject jSONObject1 = jSONObject0.append("\"T@]Zm_oF", double0);
      jSONObject1.optLong("\n");
      String string0 = "<W<ZTrNI1F8u)DO";
      try { 
        jSONObject0.getInt("<W<ZTrNI1F8u)DO");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"<W<ZTrNI1F8u)DO\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.9130845242791006
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "");
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      try { 
        jSONObject0.append((String) null, jSONArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6425012249847555
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Byte byte0 = new Byte((byte)35);
      Byte.toUnsignedInt((byte)81);
      JSONObject jSONObject0 = new JSONObject(byte0);
      JSONObject jSONObject1 = new JSONObject();
      JSONObject.valueToString(jSONObject0, 81, (byte)81);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.037734194785151
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      Object object0 = JSONObject.NULL;
      Boolean boolean0 = new Boolean("D.AY-jc,XN`RD}N?>");
      Boolean boolean1 = hashMap0.getOrDefault(object0, boolean0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[7];
      jSONObject0.put("JSONArray[", (Map) hashMap0);
      String string0 = "\\u";
      JSONObject jSONObject1 = jSONObject0.put(string0, 4622.03687);
      Integer.getInteger("Wy:;,DwG");
      Boolean boolean2 = new Boolean(true);
      Integer integer0 = new Integer((-886));
      hashMap0.put(integer0, boolean1);
      Integer integer1 = new Integer(59);
      Boolean boolean3 = Boolean.FALSE;
      Boolean boolean4 = Boolean.valueOf("]'m9@!,T0bZ%r}");
      hashMap0.put(integer0, boolean4);
      JSONObject jSONObject2 = new JSONObject(jSONObject1, stringArray0);
      Object object1 = JSONObject.NULL;
      assertSame(object1, object0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.871476118054867
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      Byte.compare((byte)0, (byte)0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(]c#.4w";
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      jSONObject0.toString();
      Byte.toUnsignedInt((byte) (-34));
      JSONObject jSONObject1 = jSONObject0.put("", false);
      jSONObject1.optBoolean("", false);
      Byte.toUnsignedInt((byte)0);
      String string0 = "\\u";
      jSONObject0.optDouble(string0);
      jSONObject0.optInt("(]c#.4w");
      boolean boolean0 = jSONObject0.optBoolean(string0);
      assertEquals(1, jSONObject0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.optString("]_t-p'6'!Jf?Xa*xx_");
      jSONObject0.toString((-10400442), 27);
      jSONObject0.optDouble("{}", 0.0);
      jSONObject0.put("nLhR9SH&`^|+:I+", (-62164681));
      try { 
        jSONObject0.getDouble("getgetBytes");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"getgetBytes\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.2067368439362582
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject.valueToString("]_t-p'6'!Jf?Xa*xx_");
      long long0 = jSONObject0.optLong("<Ns`& Q");
      assertEquals(0L, long0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5250048409536814
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      Byte.compare((byte)0, (byte)0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(]c#.4w";
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      jSONObject0.toString();
      Byte.toUnsignedInt((byte) (-34));
      JSONObject jSONObject1 = jSONObject0.put("", true);
      jSONObject1.optBoolean("", true);
      Byte.toUnsignedInt((byte)0);
      JSONObject.getNames(jSONObject0);
      String string0 = "\\u";
      jSONObject0.optDouble(string0);
      jSONObject0.optInt("(]c#.4w");
      JSONObject.doubleToString(0.0);
      JSONObject.valueToString(jSONObject1, (byte)0, (byte)0);
      try { 
        jSONObject0.getJSONArray((String) null);
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
  /*Coverage entropy=1.4056108899847253
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.optString("]_t-p'6'!Jf?Xa*xx_");
      jSONObject0.optLong("<Ns`& Q");
      try { 
        jSONObject0.getInt("Yji)&i/,7'/A");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Yji)&i/,7'/A\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3143738430069454
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      Float float0 = Float.valueOf(0.0F);
      JSONObject.numberToString(float0);
      HashMap<Short, Integer> hashMap1 = new HashMap<Short, Integer>();
      int int0 = 2766;
      StringWriter stringWriter0 = new StringWriter(2766);
      StringWriter stringWriter1 = stringWriter0.append('5');
      char[] charArray0 = new char[3];
      charArray0[0] = 'E';
      charArray0[1] = 'l';
      charArray0[2] = 'E';
      stringWriter1.write(charArray0);
      Float.isFinite(0.0F);
      StringWriter stringWriter2 = new StringWriter();
      StringWriter stringWriter3 = stringWriter0.append((CharSequence) "java.lang.Float@0000000001");
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.write(stringWriter3);
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("0(?iN-hn!7@e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of 0(?iN-hn!7@e
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }
}