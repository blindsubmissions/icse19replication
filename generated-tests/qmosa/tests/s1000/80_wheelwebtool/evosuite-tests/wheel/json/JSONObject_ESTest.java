/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:39:34 GMT 2018
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
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "Missing value";
      Boolean boolean0 = new Boolean("Missing value");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Missing value";
      String string1 = "";
      stringArray0[1] = "";
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      int int0 = 0;
      jSONObject0.put("87Kttk h'FPl", 0);
      StringWriter stringWriter0 = null;
      try {
        stringWriter0 = new StringWriter((-928));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      JSONObject jSONObject1 = jSONObject0.accumulate("A=^@(X7", "A=^@(X7");
      jSONObject1.optLong("A=^@(X7");
      jSONObject0.put("A=^@(X7", 0.0);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "k]C6n";
      stringArray0[1] = "/LeYufI";
      stringArray0[2] = "";
      stringArray0[3] = "~wR-cLA@emA@f%9kA";
      String string0 = " of ";
      stringArray0[4] = " of ";
      stringArray0[5] = "UFOadTb.|jwq93H9l3";
      stringArray0[6] = "-g6~#-r)xi%=:_%&st";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      jSONObject0.toString(2688);
      try { 
        jSONObject0.get("UFOadTb.|jwq93H9l3");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"UFOadTb.|jwq93H9l3\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "RHjBxMJ~";
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("RHjBxMJ~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of RHjBxMJ~
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      String string0 = ".m`(<qMii/[2'|+/jx";
      jSONObject0.optInt(".m`(<qMii/[2'|+/jx");
      String string1 = "}hJk+0f%8?R%}*y";
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      // Undeclared exception!
      try { 
        linkedList0.remove((-1722));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1722, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9320738874454946
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<JSONObject, String> hashMap0 = new HashMap<JSONObject, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      hashMap0.put(jSONObject0, "j");
      String string0 = "})7Bh>Y6me>^RD(";
      try { 
        jSONObject0.getJSONObject("})7Bh>Y6me>^RD(");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"})7Bh>Y6me>^RD(\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.772588722239781
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject.quote("Oh=@sh");
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optLong("i_B-#6_+j31Pc<&n66J");
      jSONObject0.put("\"Oh=@sh\"", 580.3618761094066);
      jSONObject0.optDouble("\"Oh=@sh\"", 0.0);
      jSONObject0.remove("Oh=@sh");
      jSONObject0.optDouble("i_B-#6_+j31Pc<&n66J");
      jSONObject0.keys();
      HashMap<Object, JSONArray> hashMap0 = new HashMap<Object, JSONArray>();
      jSONObject0.put("Expected '", (Map) hashMap0);
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9061547465398496
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JSONObject.numberToString(float0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "java.lang.Float@0000000001";
      stringArray0[1] = "java.lang.Float@0000000001";
      stringArray0[2] = "java.lang.Float@0000000001";
      stringArray0[3] = "java.lang.Float@0000000001";
      stringArray0[4] = "java.lang.Float@0000000001";
      stringArray0[5] = "java.lang.Float@0000000001";
      stringArray0[6] = "java.lang.Float@0000000001";
      JSONObject jSONObject0 = new JSONObject("java.lang.Float@0000000001", stringArray0);
      try { 
        jSONObject0.accumulate((String) null, "java.lang.Float@0000000001");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4410152780267027
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 5277.75677835751;
      Double double1 = new Double(5277.75677835751);
      JSONObject jSONObject0 = new JSONObject(double1);
      JSONObject.getNames((Object) jSONObject0);
      jSONObject0.keys();
      String string0 = "";
      jSONObject0.optDouble("");
      try { 
        jSONObject0.getInt("");
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "!\\]}?z.{P(%aU";
      JSONObject jSONObject1 = jSONObject0.put("!]}?z.{P(%aU", false);
      String string1 = "] is not a JSONArray.";
      try { 
        jSONObject1.getJSONArray("] is not a JSONArray.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"] is not a JSONArray.\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long(0L);
      JSONObject.numberToString(long0);
      JSONObject jSONObject0 = new JSONObject(long0);
      JSONObject jSONObject1 = jSONObject0.put("0", true);
      Long long1 = new Long(0L);
      jSONObject1.putOpt("java.lang.Long@0000000001", long1);
      assertEquals(3, jSONObject1.length());
      
      String string0 = JSONObject.quote((String) null);
      assertEquals("\"\"", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "b!NMriYgXM";
      stringArray0[1] = "b!NMriYgXM";
      stringArray0[2] = "b!NMriYgXM";
      stringArray0[3] = "b!NMriYgXM";
      stringArray0[4] = "(KgbHNuM/S6Z7";
      stringArray0[5] = "^/w`sOO9TX,9j*Q";
      JSONObject jSONObject0 = new JSONObject("b!NMriYgXM", stringArray0);
      jSONObject0.optString("#A)N{VH#Y&a{B-,5`", "#A)N{VH#Y&a{B-,5`");
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      jSONObject0.put("b!NMriYgXM", (Collection) linkedList0);
      jSONObject0.put("b!NMriYgXM", true);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6674619334292946
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Double.max((-1.0), 0.0);
      JSONObject.numberToString(double0);
      byte byte0 = (byte)0;
      Byte byte1 = new Byte((byte)0);
      Byte.toUnsignedLong((byte)102);
      Byte.compare((byte)0, (byte) (-56));
      Byte.toUnsignedInt((byte)0);
      JSONObject.testValidity(byte1);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-893));
      hashMap0.put(integer0, integer1);
      jSONObject0.names();
      int int0 = 1658;
      int int1 = 8448;
      Writer writer0 = null;
      // Undeclared exception!
      try { 
        jSONObject0.write((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.313153678733635
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject.getNames(object0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.putOpt("P)1XlC", object0);
      jSONObject1.optDouble("Cq8IY>4&3?");
      jSONObject1.length();
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
  //Test case number: 14
  /*Coverage entropy=1.9172696149848654
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Double, Integer> hashMap0 = new HashMap<Double, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = ",7<.7Rb D5w!B+c";
      String string0 = "Ek>/ cIt";
      stringArray0[2] = "Ek>/ cIt";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "d|1hkt9";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.toString(65, 65);
      JSONObject.valueToString("");
      JSONObject jSONObject2 = jSONObject0.put("", 4071);
      Boolean boolean0 = Boolean.FALSE;
      JSONObject.getNames((Object) boolean0);
      Double double0 = new Double(232.2072898553);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      hashMap0.compute(double0, biFunction0);
      jSONObject2.opt("");
      try { 
        jSONObject1.getJSONArray("");
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Boolean, String> hashMap0 = new HashMap<Boolean, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.optJSONObject("JSONArray[");
      assertNull(jSONObject1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      short short0 = (short)8448;
      Short short1 = new Short((short)8448);
      short short2 = (short)0;
      Short.toUnsignedInt((short)0);
      short short3 = (short) (-281);
      Short.compare((short)0, (short) (-281));
      String[] stringArray0 = JSONObject.getNames((Object) short1);
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject(jSONArray0, stringArray0);
      String string0 = "jo\"</a$ U-%!5Lp@";
      jSONObject0.optInt("jo\"</a$ U-%!5Lp@", 0);
      jSONObject0.optBoolean("wheel.json.JSONArray");
      String string1 = "I@4P0";
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      linkedList0.removeLastOccurrence(jSONArray0);
      jSONObject0.put("I@4P0", (Collection) linkedList0);
      JSONObject.getNames((Object) linkedList0);
      JSONObject.getNames((Object) "I@4P0");
      StringWriter stringWriter0 = new StringWriter();
      jSONObject0.write(stringWriter0);
      try { 
        jSONObject0.getJSONObject("jo\"</a$ U-%!5Lp@");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"jo\\\"<\\/a$ U-%!5Lp@\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.9135353245472018
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Double, Integer> hashMap0 = new HashMap<Double, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = ",7<.7Rb D5w!B+c";
      Double double0 = new Double(1431.86578031);
      Integer.getInteger("", (Integer) null);
      hashMap0.put(double0, (Integer) null);
      stringArray0[2] = "Ek>/ cIt";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "d|1hkt9";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.toString(65, 65);
      JSONObject.valueToString("");
      jSONObject0.put("", 4071);
      Boolean boolean0 = Boolean.FALSE;
      JSONObject.getNames((Object) boolean0);
      String string0 = "";
      double double1 = 232.2072898553;
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
  //Test case number: 18
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Boolean, String> hashMap0 = new HashMap<Boolean, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.put("isrotateLeft", (-1L));
      jSONObject0.optInt("isrotateLeft", 2446);
      jSONObject0.toString();
      jSONObject1.optInt((String) null, 92);
      jSONObject1.opt((String) null);
      Double.max((-1.0), 1.0);
      Double.isFinite(92);
      String string0 = "iswait";
      jSONObject1.optInt("iswait", (-1));
      jSONObject0.toString();
      jSONObject1.optBoolean("isrotateLeft");
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
  //Test case number: 19
  /*Coverage entropy=2.2718685126965625
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short.compare((short)4513, (short) (-801));
      Short.compare((short) (-844), (short)558);
      Double double0 = new Double(236.65618146243);
      String[] stringArray0 = new String[7];
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "NEfb]{,";
      stringArray0[5] = "";
      stringArray0[6] = "NEfb]{,";
      JSONObject jSONObject1 = new JSONObject(double0, stringArray0);
      String string0 = jSONObject1.toString();
      assertNotNull(string0);
      assertEquals("{}", string0);
      
      String string1 = JSONObject.valueToString((Object) null);
      assertEquals("null", string1);
      
      String[] stringArray1 = JSONObject.getNames(jSONObject1);
      assertNull(stringArray1);
      
      boolean boolean0 = jSONObject0.isNull("getdoubleToLongBits");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Boolean, String> hashMap0 = new HashMap<Boolean, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = "{";
      JSONObject jSONObject1 = null;
      try {
        jSONObject1 = new JSONObject("{");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must end with '}' at character 1 of {
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      hashMap0.keySet();
      Boolean boolean0 = Boolean.FALSE;
      Double double0 = new Double((-2754.060493578346));
      JSONObject jSONObject1 = jSONObject0.put("' and instead saw '", (Object) double0);
      Long long0 = new Long(2012L);
      JSONObject.testValidity(long0);
      String string0 = jSONObject1.getString("' and instead saw '");
      assertNotNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optJSONArray("");
      Boolean boolean0 = Boolean.FALSE;
      JSONObject jSONObject1 = jSONObject0.put("", (Object) boolean0);
      jSONObject1.getBoolean("");
      try { 
        jSONObject1.getBoolean("/1*kB$vX,b,AP.>i");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"/1*kB$vX,b,AP.>i\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.4042341114242607
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Short short0 = new Short((short) (-151));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Y*";
      stringArray0[1] = "HZKnUx==`O/vI`e";
      Short.compare((short) (-151), (short) (-151));
      Short.compare((short) (-844), (short) (-151));
      stringArray0[2] = "";
      stringArray0[3] = "NEfb]{,";
      JSONObject jSONObject0 = new JSONObject(short0, stringArray0);
      jSONObject0.toString();
      Short.toUnsignedLong((short)45);
      JSONObject.valueToString(short0);
      JSONObject.getNames(jSONObject0);
      jSONObject0.isNull("wheel.json.JSONTokener");
      JSONObject jSONObject1 = jSONObject0.append("NEfb]{,", "wheel.json.JSONTokener");
      assertSame(jSONObject1, jSONObject0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.7664123555634643
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      String string0 = "A=^@(X7";
      jSONObject0.accumulate("A=^@(X7", "A=^@(X7");
      jSONObject0.optInt("A=^@(X7", 2341);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      int int0 = 97;
      try { 
        jSONArray0.getJSONObject(97);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONArray[97] not found.
         //
         verifyException("wheel.json.JSONArray", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.1293624543612166
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = JSONObject.doubleToString((-1151.7123));
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-1151.7123";
      stringArray0[1] = "-1151.7123";
      stringArray0[2] = "-1151.7123";
      stringArray0[3] = "NEfb]{,";
      stringArray0[4] = "NEfb]{,";
      stringArray0[5] = "-1151.7123";
      stringArray0[6] = "-1151.7123";
      stringArray0[7] = "-1151.7123";
      JSONObject jSONObject0 = new JSONObject("-1151.7123", stringArray0);
      jSONObject0.toString();
      JSONObject.valueToString("NEfb]{,");
      JSONObject.getNames(jSONObject0);
      jSONObject0.isNull("FEJ(FOn!L3 ");
      Float float0 = new Float((-1151.7123));
      Float.isFinite(1703.9773F);
      String string1 = JSONObject.valueToString(float0, 12, 12);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.1051603355896122
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject.doubleToString((-1151.7123259118957));
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONObject jSONObject0 = new JSONObject((Map) null);
      jSONObject0.optInt("Expected '", 102);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Expected '";
      stringArray0[1] = "gettoString";
      stringArray0[2] = "-1151.7123259118957";
      stringArray0[3] = "JSONArray[";
      stringArray0[4] = "-1151.7123259118957";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.opt("getdoubleToRawLongBits");
      Double.max(102, 0.0);
      Double.isFinite(0.0);
      jSONObject1.optInt("Expected '", 102);
      jSONObject1.toString();
      jSONObject0.optBoolean("val");
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
  //Test case number: 27
  /*Coverage entropy=2.1192809219098505
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Short.compare((short)13, (short)13);
      Short.compare((short) (-3061), (short)13);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "HZKnUx==`O/vI`e";
      stringArray0[1] = "";
      stringArray0[2] = "HZKnUx==`O/vI`e";
      stringArray0[3] = "NEfb]{,";
      JSONObject jSONObject1 = new JSONObject((Object) jSONObject0, stringArray0);
      String string0 = jSONObject1.toString();
      assertEquals("{}", string0);
      assertNotNull(string0);
      
      JSONObject.valueToString(jSONObject0);
      String[] stringArray1 = JSONObject.getNames(jSONObject1);
      assertNull(stringArray1);
      
      boolean boolean0 = jSONObject0.isNull("{}");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.3693821196946767
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optJSONArray("");
      Boolean boolean0 = Boolean.valueOf("");
      JSONObject jSONObject1 = jSONObject0.put("", (Object) boolean0);
      jSONObject1.names();
      jSONObject1.toJSONArray((JSONArray) null);
      try { 
        jSONObject1.getJSONObject("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] is not a JSONObject.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.5498260458782018
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "";
      Short.compare((short) (-24), (short) (-24));
      Short.compare((short)8, (short) (-24));
      Float float0 = new Float((float) (short) (-844));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Y*";
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toString();
      Short.toUnsignedLong((short) (-1556));
      JSONObject.valueToString("{}", 32, (short) (-1556));
      JSONObject.getNames(jSONObject0);
      jSONObject0.isNull("Y*");
      JSONArray jSONArray0 = new JSONArray();
      JSONTokener jSONTokener0 = new JSONTokener("HZKnUx==`O/vI`e");
      JSONArray jSONArray1 = null;
      try {
        jSONArray1 = new JSONArray(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of HZKnUx==`O/vI`e
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.9331249408322047
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      JSONObject jSONObject1 = jSONObject0.accumulate("A=^@(X7", "A=^@(X7");
      jSONObject1.optLong("A=^@(X7");
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertEquals(1, jSONObject0.length());
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.9555346936334828
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      short short0 = (short) (-151);
      Short short1 = new Short((short) (-151));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Y*";
      stringArray0[1] = "HZKnUx==`O/vI`e";
      Short.compare((short) (-151), (short) (-151));
      Short.compare((short) (-844), (short) (-151));
      Double.max((short) (-844), (-895.10527274067));
      Double.isFinite(431.93605857);
      JSONObject jSONObject0 = new JSONObject((Object) "Y*");
      jSONObject0.optInt("HZKnUx==`O/vI`e", (-693));
      jSONObject0.toString();
      try { 
        jSONObject0.getDouble("]@Iv,kEH\"UvQ7Ip6,T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"]@Iv,kEH\\\"UvQ7Ip6,T\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.0431297850843784
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject.getNames(jSONObject0);
      JSONObject jSONObject1 = jSONObject0.accumulate("A=^@(X7", "A=^@(X7");
      jSONObject1.optLong("A=^@(X7");
      boolean boolean0 = jSONObject0.isNull("A=^@(X7");
      assertEquals(1, jSONObject0.length());
      
      Float float0 = new Float((double) 0L);
      boolean boolean1 = Float.isFinite(0L);
      assertFalse(boolean1 == boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.798513256943294
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HashMap<Boolean, String> hashMap0 = new HashMap<Boolean, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = "isrotateLeft";
      JSONObject jSONObject1 = jSONObject0.put("isrotateLeft", (-1L));
      int int0 = 2446;
      jSONObject0.optInt("isrotateLeft", 2446);
      hashMap0.clone();
      jSONObject0.toString();
      jSONObject1.optInt((String) null, 92);
      jSONObject1.opt((String) null);
      Float float0 = new Float(1.0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "{\"java.lang.String@0000000002\":java.lang.Long@0000000003}";
      stringArray0[1] = "isrotateLeft";
      stringArray0[2] = "{\"java.lang.String@0000000002\":java.lang.Long@0000000003}";
      stringArray0[3] = "isrotateLeft";
      stringArray0[4] = "{\"java.lang.String@0000000002\":java.lang.Long@0000000003}";
      stringArray0[5] = "{\"java.lang.String@0000000002\":java.lang.Long@0000000003}";
      stringArray0[6] = "6BT;~6G(Ug";
      stringArray0[7] = "isrotateLeft";
      JSONObject jSONObject2 = new JSONObject(float0, stringArray0);
      jSONObject2.accumulate("{\"java.lang.String@0000000002\":java.lang.Long@0000000003}", (Object) null);
      try { 
        jSONObject1.get((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6837389058487535
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject.doubleToString(0.0);
      JSONTokener jSONTokener0 = new JSONTokener("0");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of 0
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }
}
