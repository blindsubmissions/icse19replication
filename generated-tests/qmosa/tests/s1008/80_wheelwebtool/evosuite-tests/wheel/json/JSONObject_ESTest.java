/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 12:53:45 GMT 2018
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Object object0 = jSONObject0.remove("");
      assertNull(object0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Short short0 = new Short((short)2292);
      String string0 = JSONObject.valueToString(short0, 1888, 0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "wO+'2-k*1Y";
      stringArray0[1] = "";
      stringArray0[2] = "gGq60#k7b]`pl\"";
      stringArray0[3] = "1KLI\nb8]!B*(";
      stringArray0[4] = "LPv";
      JSONObject jSONObject0 = new JSONObject(object0, stringArray0);
      JSONObject.getNames(jSONObject0);
      Object object1 = new Object();
      JSONObject.testValidity(object1);
      assertFalse(object1.equals((Object)object0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Float> hashMap0 = new HashMap<String, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.length();
      boolean boolean0 = jSONObject0.has("JSONArray initial value should be a string or collection or array.");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean.logicalAnd(true, true);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      Double double0 = new Double(764.0879241);
      JSONObject jSONObject1 = jSONObject0.put("-", (Object) double0);
      assertEquals(1, jSONObject0.length());
      
      jSONObject1.getString("-");
      jSONObject0.optBoolean("'");
      String string0 = jSONObject1.optString("'", "-");
      assertEquals("-", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short) (-633));
      JSONObject jSONObject0 = new JSONObject(short0);
      long long0 = jSONObject0.optLong("[A5Q:`rN>-XJa=L");
      assertEquals(0L, long0);
      
      Short.toUnsignedLong((short)740);
      int int0 = jSONObject0.optInt("", (int) (short)0);
      assertEquals(0, int0);
      
      Short.toUnsignedInt((short)0);
      jSONObject0.optString("-q6AW$MO[2+kQ/Sl.g", "-q6AW$MO[2+kQ/Sl.g");
      jSONObject0.optLong("-q6AW$MO[2+kQ/Sl.g", 0L);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "] is not a Boolean.";
      String string1 = "iv`}G*y])Ie";
      jSONObject0.optBoolean("iv`}G*y])Ie", true);
      jSONObject0.optDouble("iv`}G*y])Ie", Double.NaN);
      JSONObject jSONObject1 = jSONObject0.put("] is not a Boolean.", true);
      try { 
        jSONObject1.getJSONObject("");
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
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, JSONArray> hashMap0 = new HashMap<Object, JSONArray>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      jSONObject0.optLong(".(oH|");
      jSONObject1.keys();
      try { 
        jSONObject1.put(".(oH|", Double.NaN);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSON does not allow non-finite numbers.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Float float0 = new Float(0.0);
      jSONObject0.putOpt("", float0);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.6390573296152584
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      JSONObject jSONObject2 = jSONObject1.put("-", (Collection) linkedList0);
      jSONObject2.optBoolean("-");
      jSONObject1.put("-", 0);
      int int0 = 2;
      JSONObject.valueToString((Object) null, 2, 2);
      try { 
        jSONObject0.get("H:l\"tW9xj<SM]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"H:l\\\"tW9xj<SM]\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4901762161527465
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.optLong("kf&tId/u.1");
      assertEquals(0L, long0);
      
      Boolean boolean0 = Boolean.FALSE;
      String[] stringArray0 = new String[6];
      stringArray0[0] = "kf&tId/u.1";
      stringArray0[1] = "kf&tId/u.1";
      stringArray0[2] = "] is not a Boolean.";
      stringArray0[3] = "kf&tId/u.1";
      stringArray0[4] = "kf&tId/u.1";
      stringArray0[5] = "kf&tId/u.1";
      JSONObject jSONObject1 = new JSONObject(boolean0, stringArray0);
      String string0 = JSONObject.valueToString(jSONObject1, 0, 48);
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1682234916146403
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "</91Qq#";
      stringArray0[1] = "bNU2&<]";
      Boolean.logicalAnd(true, false);
      stringArray0[2] = "";
      stringArray0[3] = ".WDM,$";
      String string0 = "Null key.";
      stringArray0[4] = "Null key.";
      Boolean.compare(true, false);
      stringArray0[5] = "]:$!$1xU^$E b4V";
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.putOpt("bNU2&<]", "</91Qq#");
      jSONObject1.toString(1, (-615));
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "Null key.", 0, 0);
      jSONObject0.write(stringWriter1);
      try { 
        jSONObject0.getInt(".WDM,$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\".WDM,$\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double(0.0);
      JSONObject jSONObject0 = new JSONObject(double0);
      jSONObject0.toJSONArray((JSONArray) null);
      jSONObject0.optInt("m*c/d/4uc84a_r*?i", 60);
      Double.isFinite(60);
      jSONObject0.put("wheel.json.JSONObject", (-395L));
      jSONObject0.remove(".");
      jSONObject0.optDouble("Expected a ',' or ']'");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONObject jSONObject1 = jSONObject0.put(".", (Collection) linkedList0);
      jSONObject0.optLong("7!+YO", (-2634L));
      jSONObject1.put("5el]vJ]75\"fK?h4", (double) 60);
      int int0 = jSONObject1.length();
      assertEquals(6, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<JSONObject, Object> hashMap0 = new HashMap<JSONObject, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      hashMap0.put(jSONObject0, jSONObject0);
      double double0 = jSONObject0.optDouble("", 0.0);
      assertEquals(0.0, double0, 0.01);
      
      String string0 = jSONObject0.toString((-357));
      assertEquals("{}", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      try { 
        jSONObject0.getJSONObject((String) null);
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
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      String string0 = "bNU2&<]";
      Boolean.logicalAnd(true, false);
      Boolean.compare(false, false);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Null key.";
      stringArray0[1] = ".WDM,$";
      stringArray0[2] = "toH";
      stringArray0[3] = "bNU2&<]";
      JSONObject jSONObject0 = new JSONObject("", stringArray0);
      jSONObject0.putOpt((String) null, "toH");
      jSONObject0.toString((-3184), (-291));
      StringWriter stringWriter0 = new StringWriter();
      int int0 = 0;
      // Undeclared exception!
      try { 
        stringWriter0.append((CharSequence) "", 3071, 3071);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.2010655742065897
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(0.0);
      JSONObject jSONObject0 = new JSONObject(double0);
      jSONObject0.optInt("m*c/d/4uc84a_r*?i", 60);
      Double.isFinite(60);
      jSONObject0.put("wheel.json.JSONObject", (-395L));
      Object object0 = JSONObject.NULL;
      JSONObject.valueToString(object0, 3, 60);
      jSONObject0.remove(".");
      jSONObject0.optDouble("Expected a ',' or ']'");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSONObject0.put(".", (Collection) linkedList0);
      jSONObject0.optLong("7!+YO", (-2634L));
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".";
      stringArray0[1] = ".";
      stringArray0[2] = "m*c/d/4uc84a_r*?i";
      stringArray0[3] = "Expected a ',' or ']'";
      stringArray0[4] = "Expected a ',' or ']'";
      stringArray0[5] = "get";
      stringArray0[6] = "Expected a ',' or ']'";
      stringArray0[7] = "2";
      JSONObject jSONObject1 = null;
      try {
        jSONObject1 = new JSONObject((Object) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Float, Long> hashMap0 = new HashMap<Float, Long>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "|OiYjZT.mJHH`-oe{4";
      stringArray0[2] = "";
      stringArray0[3] = "Unclosed comment";
      try { 
        jSONObject0.put((String) null, 1.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.766412355563464
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "(EQ&<G0}R-\\z";
      JSONObject jSONObject1 = jSONObject0.append("(EQ&<G0}R-z", "(EQ&<G0}R-z");
      jSONObject1.optDouble("(EQ&<G0}R-z");
      JSONObject.getNames(jSONObject0);
      String string1 = null;
      String string2 = ";";
      try { 
        jSONObject1.get(";");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\";\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4377014436429414
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Float, Long> hashMap0 = new HashMap<Float, Long>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      JSONObject jSONObject1 = jSONObject0.putOpt("A JSONObject text must begin with '{'", "");
      JSONObject.valueToString(jSONObject1);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.955983846584362
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Float, Long> hashMap0 = new HashMap<Float, Long>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "|OiYjZT.mJHH`-oe{4";
      stringArray0[2] = "";
      stringArray0[3] = "Unclosed comment";
      JSONObject jSONObject1 = new JSONObject((Object) jSONObject0, stringArray0);
      jSONObject1.names();
      jSONObject0.optJSONArray((String) null);
      Long long0 = new Long(1L);
      String string0 = JSONObject.numberToString(long0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.4849066497880012
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Short short0 = new Short((short) (-633));
      Short.toUnsignedInt((short) (-633));
      JSONObject jSONObject0 = new JSONObject(short0);
      long long0 = jSONObject0.optLong("[A5Q:`rN>-XJa=L");
      assertEquals(1, jSONObject0.length());
      assertEquals(0L, long0);
      
      Boolean boolean0 = Boolean.TRUE;
      JSONObject.valueToString(boolean0, (-3948), 1);
      String string0 = JSONObject.doubleToString(0.0);
      assertEquals("0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.3785628007862463
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Double double0 = new Double(0.0);
      JSONObject jSONObject0 = new JSONObject(double0);
      jSONObject0.optInt("m*c/d/4uc84a_r*?i", 60);
      Double.isFinite(60);
      JSONObject jSONObject1 = jSONObject0.put("wheel.json.JSONObject", (-395L));
      Object object0 = JSONObject.NULL;
      JSONObject.valueToString(object0, 3, 60);
      jSONObject0.remove(".");
      double double1 = jSONObject0.optDouble("Expected a ',' or ']'");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONObject jSONObject2 = jSONObject0.put(".", (Collection) linkedList0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Expected a ',' or ']'";
      stringArray0[1] = "m*c/d/4uc84a_r*?i";
      stringArray0[2] = ".";
      stringArray0[3] = "Expected a ',' or ']'";
      stringArray0[4] = "wheel.json.JSONObject";
      stringArray0[5] = "wheel.json.JSONObject";
      JSONObject jSONObject3 = new JSONObject("wheel.json.JSONObject", stringArray0);
      jSONObject1.names();
      jSONObject2.optJSONArray("getcompar");
      assertEquals(5, jSONObject0.length());
      
      Long long0 = new Long(1L);
      JSONObject.numberToString(double0);
      assertNotEquals((double)double0, (double)double1, 0.01);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.271899083808096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject.quote("Ja}shKM2ul0|>-~}(7K");
      JSONObject jSONObject0 = new JSONObject((Object) "Ja}shKM2ul0|>-~}(7K");
      int int0 = 0;
      String string0 = "Eg+.CL";
      jSONObject0.append("Eg+.CL", (Object) null);
      String string1 = "ZB78oZsy]";
      JSONTokener jSONTokener0 = new JSONTokener(",");
      JSONObject jSONObject1 = null;
      try {
        jSONObject1 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of ,
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.0253262207700673
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<Float, Long> hashMap0 = new HashMap<Float, Long>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "Unclosed comment";
      JSONObject jSONObject1 = new JSONObject((Object) jSONObject0, stringArray0);
      jSONObject1.names();
      jSONObject0.optJSONArray("");
      Long long0 = new Long(1L);
      String[] stringArray1 = JSONObject.getNames((Object) null);
      assertNull(stringArray1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.0445224377234217
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      JSONObject jSONObject2 = jSONObject1.put("-", (Collection) linkedList0);
      jSONObject2.optInt("+[e");
      jSONObject2.optBoolean("-");
      jSONObject0.optInt("x rqE+x'v!LnLz%p", (-1451));
      Double.isFinite((-782.3567));
      String string0 = "rNol}o?'ZHJ:]";
      JSONObject jSONObject3 = jSONObject0.put("rNol}o?'ZHJ:]", (long) (-1451));
      jSONObject0.remove("-");
      jSONObject3.optDouble("DiYIvEg=");
      LinkedList<String> linkedList1 = new LinkedList<String>();
      JSONObject jSONObject4 = jSONObject0.put("DiYIvEg=", (Collection) linkedList1);
      jSONObject4.optLong((String) null, 0L);
      try { 
        jSONObject0.getLong("-");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"-\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = "] is not a Boolean.";
      jSONObject0.optDouble("iv`}G*y])Ie", Double.NaN);
      JSONObject jSONObject1 = jSONObject0.put("] is not a Boolean.", false);
      try { 
        jSONObject1.getJSONObject("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.2018441643265625
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = Boolean.TRUE;
      JSONObject jSONObject1 = new JSONObject(boolean0);
      JSONArray jSONArray0 = new JSONArray();
      jSONObject1.toJSONArray(jSONArray0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "] is not a Boolean.";
      stringArray0[1] = "m*c/d/4uc84a_r*?i";
      stringArray0[2] = "m*c/d/4uc84a_r*?i";
      stringArray0[3] = "m*c/d/4uc84a_r*?i";
      stringArray0[4] = "-Ts#Cf 053RXtEDi|";
      stringArray0[5] = "] is not a Boolean.";
      stringArray0[6] = "@a";
      JSONObject jSONObject2 = new JSONObject(jSONObject0, stringArray0);
      jSONObject2.optInt("getparseDouble", 60);
      Double.isFinite(60);
      jSONObject1.put("ma", (long) 60);
      jSONObject2.remove("toH");
      jSONObject0.optDouble("m*c/d/4uc84a_r*?i");
      jSONObject1.optLong("u\"Ch>2&L", (long) 60);
      try { 
        jSONObject0.getLong("@a");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"@a\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.9444389791664403
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Short short0 = new Short((short) (-633));
      JSONObject jSONObject0 = new JSONObject(short0);
      long long0 = jSONObject0.optLong("[A5Q:`rN>-XJa=L");
      assertEquals(0L, long0);
      
      Short.toUnsignedLong((short)740);
      int int0 = jSONObject0.optInt("", (int) (short)0);
      assertEquals(0, int0);
      
      Short.toUnsignedInt((short)0);
      jSONObject0.optString("-q6AW$MO[2+kQ/Sl.g", "-q6AW$MO[2+kQ/Sl.g");
      jSONObject0.opt("0");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "[A5Q:`rN>-XJa=L";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      jSONObject1.put("-q6AW$MO[2+kQ/Sl.g", (int) (short)0);
      String string0 = jSONObject1.optString("t;;_(|!XzZrX*8P[X-");
      assertEquals("", string0);
      
      boolean boolean0 = jSONObject1.isNull("[;B");
      assertTrue(boolean0);
      assertEquals(1, jSONObject0.length());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.8428266655020007
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Float float0 = new Float((-23.97015899287291));
      JSONObject jSONObject1 = jSONObject0.put("^WP+J<z*Es:", 52);
      long long0 = jSONObject1.optLong("Jrje$@d");
      assertEquals(0L, long0);
      
      jSONObject1.optJSONArray("^WP+J<z*Es:");
      String string0 = JSONObject.doubleToString((-23.97015899287291));
      assertEquals("-23.97015899287291", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.8646466795477872
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<JSONArray, Integer> hashMap0 = new HashMap<JSONArray, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Float float0 = new Float(2037.468596529);
      JSONObject jSONObject1 = jSONObject0.put("getnotify", 2037.468596529);
      JSONObject jSONObject2 = jSONObject0.put("^Wi+J<zw*Es:", 52);
      jSONObject2.optLong("Jrje$d");
      jSONObject2.optJSONArray("^Wi+J<zw*Es:");
      Double double0 = Double.valueOf((double) 0L);
      jSONObject1.accumulate("%.B#.gc%Rh+JYvVO", double0);
      assertEquals(3, jSONObject1.length());
  }
}
