/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 18:36:30 GMT 2018
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Short short0 = new Short((short)0);
      Short.toUnsignedLong((short)210);
      Short.compare((short)0, (short)210);
      JSONObject.numberToString(short0);
      Object object0 = new Object();
      JSONObject.valueToString(object0, 44, 0);
      JSONTokener jSONTokener0 = new JSONTokener("\"java.lang.Object@0000000002\"");
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of \"java.lang.Object@0000000002\"
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Long long0 = new Long(31L);
      JSONObject jSONObject0 = new JSONObject(long0);
      Long.compare(31L, (-1L));
      String string0 = "$~Q$3Z_Shu*6zSyjF_";
      jSONObject0.optInt("$~Q$3Z_Shu*6zSyjF_", 26);
      try { 
        jSONObject0.put((String) null, 45);
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-118));
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Expected a ',' or '}'";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "Z-X%2$Q@:w}$VFa\"0 ";
      stringArray0[4] = "JSON does not allow non-finite numbers.";
      stringArray0[5] = "000";
      stringArray0[6] = "";
      stringArray0[7] = " o`y6;2]oPQHp#z'+k)";
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      try { 
        jSONObject0.getJSONObject("false");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"false\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double((-2866.1311412621603));
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "&>lB,C$6El3s";
      stringArray0[2] = "m=,;";
      stringArray0[3] = "S,On{uD'i [T]1`.";
      stringArray0[4] = "M8$D2|VIYy";
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      boolean boolean0 = jSONObject0.isNull("");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "oclBK_:";
      stringArray0[1] = "c";
      stringArray0[2] = "{x$}WA";
      stringArray0[3] = "JdT2qgRm";
      stringArray0[4] = "";
      stringArray0[5] = "Expected '";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      long long0 = jSONObject0.optLong("\"\"", 1L);
      assertEquals(1L, long0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Byte byte0 = new Byte((byte)94);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "7.6";
      String string0 = "true";
      stringArray0[1] = "true";
      Byte.toUnsignedInt((byte)94);
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      jSONObject0.keys();
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
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "EBfs9w:rOc&&,!%q";
      stringArray0[1] = "{Y}";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      String string0 = "";
      stringArray0[6] = "";
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      try { 
        jSONObject0.put((String) null, (Collection) linkedList0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "");
      jSONObject0.toString(3);
      jSONObject0.optJSONObject("cv#KPLBQ");
      jSONObject0.putOpt("wheel.json.JSONException", "cv#KPLBQ");
      assertEquals(4, jSONObject0.length());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6339529886981836
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float((-3258.637F));
      JSONObject.numberToString(float0);
      Short short0 = new Short((short)2166);
      jSONObject0.append("wheel.json.JSONObject$1", short0);
      try { 
        jSONObject0.getJSONArray("Expected a ':' after a key");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Expected a ':' after a key\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2502602786175907
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^d$";
      stringArray0[1] = "'";
      stringArray0[2] = "";
      stringArray0[3] = ")+0*jF{Cs&";
      stringArray0[4] = "dZM4^e835d0+'e_";
      stringArray0[5] = "GSN4C}/11K0:&F}cbu3";
      stringArray0[6] = "wheel.json.JSONObject$Null";
      stringArray0[7] = "_B?$b'4^U_Cy.";
      stringArray0[8] = "T";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      jSONObject0.has((String) null);
      jSONObject0.optJSONArray("@pk>%eG");
      jSONObject0.names();
      jSONObject0.put(",:]}/\"[{;=#", 4373);
      jSONObject0.opt(",\n");
      jSONObject0.optString("000", "null");
      Double double0 = new Double(4373);
      jSONObject0.accumulate("{G9rNUOew( dJT", double0);
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0746142917293842
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.toString(48, 48);
      String string0 = "Expected a ':' after a key";
      JSONObject.quote("{}");
      try { 
        jSONObject0.getJSONArray("Expected a ':' after a key");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Expected a ':' after a key\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject.getNames(object0);
      String string0 = "";
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray("@2CpaqA}VRO.`5U9uG");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONArray text must start with '[' at character 1 of @2CpaqA}VRO.`5U9uG
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.9472609444595772
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "Expected a ':' after a key";
      Float float0 = new Float((-3258.637F));
      JSONObject.numberToString(float0);
      Short short0 = new Short((short)2166);
      JSONObject.valueToString(jSONObject0, (short)2166, 3295);
      JSONObject jSONObject1 = new JSONObject((Object) "wheel.json.JSONObject$1");
      try { 
        jSONObject1.getJSONObject("}NaGlNrFajoEB4q3r&");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"}NaGlNrFajoEB4q3r&\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6014770913022407
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Float float0 = new Float(0.0);
      HashMap<Boolean, Long> hashMap0 = new HashMap<Boolean, Long>();
      HashMap<Boolean, Long> hashMap1 = new HashMap<Boolean, Long>(hashMap0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap1);
      String[] stringArray0 = new String[1];
      String string0 = "JSONObject[";
      stringArray0[0] = "JSONObject[";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.optLong("JSONObject[", 1L);
      JSONObject jSONObject2 = new JSONObject("JSONObject[", stringArray0);
      try { 
        jSONObject2.getBoolean("JSONObject[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"JSONObject[\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.178053830347946
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Float float0 = new Float((-3258.637F));
      JSONObject.numberToString(float0);
      Short short0 = new Short((short)2166);
      HashMap<JSONObject, String> hashMap0 = new HashMap<JSONObject, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Byte byte0 = new Byte((byte)76);
      JSONObject jSONObject1 = jSONObject0.append("", byte0);
      jSONObject1.getJSONArray("");
      jSONObject0.names();
      jSONObject0.optDouble("java.lang.Float@0000000001");
      JSONObject jSONObject2 = jSONObject1.put(" ,?t\"$vc'Tk.", (-2295L));
      JSONObject.valueToString(float0);
      jSONObject2.optInt("java.lang.Float@0000000001", (int) (byte)76);
      jSONObject2.toString((-928), 3899);
      jSONObject2.optInt("");
      jSONObject2.getString(" ,?t\"$vc'Tk.");
      JSONObject jSONObject3 = jSONObject0.put("xza\u0001]X~f7Q^`#W(H1W", (double) 0);
      assertEquals(3, jSONObject3.length());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.829097662529017
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Float float0 = new Float(0.0);
      JSONObject.valueToString(float0, 1275, 1275);
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.optBoolean("java.lang.Float@0000000001");
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNull(stringArray0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.9371061758293175
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject1 = new JSONObject(object0);
      jSONObject1.toString(3);
      jSONObject0.optJSONObject("Cu:/%d``Io3");
      jSONObject1.putOpt(" of ", "{\"java.lang.String@0000000003\": \"java.lang.Class@0000000004\"}");
      Float float0 = new Float((-3833.004F));
      JSONObject jSONObject2 = jSONObject0.put("istoHexString", (Object) float0);
      assertFalse(jSONObject2.equals((Object)jSONObject1));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.190283370256022
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^d$";
      stringArray0[1] = "'";
      stringArray0[2] = "";
      stringArray0[3] = ")+0*jF{Cs&";
      stringArray0[4] = "dZM4^e835d0+'e_";
      stringArray0[5] = "GSN4C}/11K0:&F}cbu3";
      stringArray0[6] = "wheel.json.JSONObject$Null";
      stringArray0[7] = "_B?$b'4^U_Cy.";
      stringArray0[8] = "T";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      jSONObject0.has((String) null);
      jSONObject0.optJSONArray("@pk>%eG");
      jSONObject0.names();
      jSONObject0.toString(501, 4373);
      jSONObject0.optInt("GSN4C}/11K0:&F}cbu3");
      try { 
        jSONObject0.getString("A JSONObject text must end with '}'");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"A JSONObject text must end with '}'\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6855519458388601
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      long long0 = 1390L;
      Long long1 = new Long(1390L);
      JSONArray jSONArray0 = new JSONArray();
      JSONObject.valueToString(long1);
      Object object1 = new Object();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java.lang.Long@0000000002";
      stringArray0[1] = "java.lang.Long@0000000002";
      stringArray0[2] = "java.lang.Long@0000000002";
      stringArray0[3] = "000";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      int int0 = (-472);
      jSONObject0.toString(2, 964);
      try { 
        jSONObject0.getString(",:]}/\"[{;=#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\",:]}/\\\"[{;=#\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.553237002993714
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Float float0 = new Float(0.0);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      jSONObject0.optDouble("kM=N");
      String[] stringArray1 = new String[4];
      stringArray1[0] = "kM=N";
      stringArray1[1] = "kM=N";
      stringArray1[2] = "hig";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray1);
      Object object0 = new Object();
      Object object1 = JSONObject.NULL;
      JSONObject jSONObject2 = new JSONObject(object1, stringArray0);
      jSONObject0.has("kM=N");
      JSONObject jSONObject3 = new JSONObject();
      jSONObject1.optJSONArray("hig");
      jSONObject3.names();
      jSONObject0.put(",:]}/\"[{;=#", (-42724917));
      String[] stringArray2 = new String[5];
      stringArray2[0] = "hig";
      stringArray2[1] = "y";
      stringArray2[2] = "kM=N";
      stringArray2[3] = ",:]}/\"[{;=#";
      stringArray2[4] = "kM=N";
      JSONObject jSONObject4 = new JSONObject(jSONObject3, stringArray2);
      Object object2 = jSONObject4.opt("XscPwt$!~9X9qp68]");
      assertNull(object2);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6957425341696346
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long((-1L));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "m=,;";
      stringArray0[1] = "S,On{uD'i [T]1`.";
      JSONObject jSONObject1 = new JSONObject(long0, stringArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject1.toJSONArray(jSONArray0);
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject2 = jSONObject1.put("m=,;", object0);
      JSONObject jSONObject3 = jSONObject0.put("S,On{uD'i [T]1`.", 1957L);
      assertFalse(jSONObject3.equals((Object)jSONObject2));
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.5400363038209806
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long((-1L));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "S,On{uD'i [T]1`.";
      stringArray0[1] = "S,On{uD'i [T]1`.";
      jSONObject0.put("S,On{uD'i [T]1`.", false);
      stringArray0[2] = "isrotateLeft";
      stringArray0[3] = "S,On{uD'i [T]1`.";
      JSONObject jSONObject1 = new JSONObject((Object) jSONObject0, stringArray0);
      int int0 = (-472);
      jSONObject0.toString(61, 61);
      try { 
        jSONObject1.getString((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.830910896829526
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "O,xu";
      String[] stringArray0 = JSONObject.getNames((Object) "O,xu");
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 0;
      JSONObject.valueToString("");
      int int1 = 964;
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      StringWriter stringWriter0 = new StringWriter();
      jSONObject0.write(stringWriter0);
      jSONObject0.toString(964, (-472));
      try { 
        jSONObject0.getString("HEMcA1Ju:kGn<EIZ>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"HEMcA1Ju:kGn<EIZ>\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "7CVz%\"(#rE";
      stringArray0[1] = "7CVz%\"(#rE";
      stringArray0[2] = "7CVz%\"(#rE";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      int int0 = jSONObject1.optInt("7CVz%\"(#rE");
      assertEquals(0, int0);
      
      String string0 = JSONObject.valueToString(jSONObject1, (-351), (-2577));
      assertEquals("{}", string0);
      
      String string1 = JSONObject.doubleToString(1.0);
      assertEquals("1", string1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.6283356526043842
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = new Integer((-619));
      jSONObject0.append("wheel.json.JSONException", integer0);
      jSONObject0.toString();
      Long long0 = new Long((-1L));
      jSONObject0.putOpt("m=,;", "S,On{uD'i [T]1`.");
      assertEquals(2, jSONObject0.length());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^d$";
      stringArray0[1] = "'";
      long long0 = 0L;
      Long long1 = new Long(0L);
      JSONObject jSONObject0 = new JSONObject("^d$", stringArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject0.toJSONArray(jSONArray0);
      Object object1 = JSONObject.NULL;
      String string0 = "getmax";
      jSONObject0.put("getmax", (Object) null);
      long long2 = 1957L;
      String string1 = "ro";
      JSONTokener jSONTokener0 = new JSONTokener("ro");
      JSONObject jSONObject1 = null;
      try {
        jSONObject1 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of ro
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.9254081650860664
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = new Long(31L);
      JSONObject jSONObject0 = new JSONObject(long0);
      Long.compare(31L, (-1L));
      JSONObject.valueToString(long0, 1, 1129);
      JSONObject jSONObject1 = new JSONObject();
      boolean boolean0 = new Boolean("getgetBytes");
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertEquals(1, jSONObject0.length());
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "Expected a ':' after a key";
      Float float0 = new Float((-3258.637F));
      Float.max((-3258.637F), (-2624.6875F));
      JSONObject.numberToString(float0);
      Short short0 = new Short((short)2166);
      HashMap<Double, String> hashMap0 = new HashMap<Double, String>();
      jSONObject0.put("wheel.json.JSONObject$1", (Map) hashMap0);
      try { 
        jSONObject0.append("wheel.json.JSONObject$1", short0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[wheel.json.JSONObject$1] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }
}