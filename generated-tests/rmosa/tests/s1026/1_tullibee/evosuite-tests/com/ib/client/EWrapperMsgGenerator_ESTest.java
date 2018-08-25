/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 17:29:50 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.TagValue;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-504));
      assertEquals("Next Valid Order ID: -504", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(22, contractDetails0);
      assertEquals("reqId = 22 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.scannerDataEnd('b');
      assertEquals("id = 98 =============== end ===============", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 'm', 1, 0, 'b', 'b', 0, 1, (String) null);
      assertEquals("order status: orderId=2147483647 clientId=1 permId=98 status=null filled=109 remaining=1 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=98 whyHeld=null", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, Integer.MAX_VALUE, 0, 'b', 1, 'y');
      assertEquals("updateMktDepth: 0 2147483647 0 98 1.0 121", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 3, 0, 0, Integer.MAX_VALUE, 0, 1, 0.0, false);
      assertEquals("id=0 date = null open=3.0 high=0.0 low=0.0 close=2.147483647E9 volume=0 count=1 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.tickEFP('y', Integer.MAX_VALUE, 0, "", 0, 3, (String) null, 1.7976931348623157E308, 0);
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, 0.0, 2);
      assertEquals("id=0  unknown=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, Integer.MAX_VALUE, (String) null, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1);
      assertEquals("updateMktDepth: 0 2147483647 null 2147483647 2147483647 0.0 1", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, (-1), (String) null, (String) null, (-1629), (String) null, "wX3KWcwu?h", (String) null, (String) null, "\"", "{d+Fl_MuEe'A{ull\"T", "oGR", (String) null);
      EWrapperMsgGenerator.contractDetails((-1618), contractDetails0);
      contract0.m_secId = null;
      Contract contract1 = new Contract(0, ">Wb011)hQ", "{[/'", (String) null, (-1629), "p]{gZ-_N*&r,^l?el", (String) null, (String) null, "  It does not support historical data backfill.", (String) null, contract0.m_comboLegs, (String) null, false, "%@GL/", "OptionAskExchStr");
      OrderState orderState0 = new OrderState();
      assertEquals(0.0, orderState0.m_commission, 0.01);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, "O");
      assertEquals("updateAccountValue: null null null O", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData('c', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation('f', (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.execDetailsEnd(3);
      assertEquals("reqId = 3 =============== end ===============", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 0, 0);
      assertEquals("id=0  bidSize=0.0", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EWrapperMsgGenerator.realtimeBar(0, 3512L, 3735.189791, 0, 3735.189791, 0, 0L, 227.98139367, (-1618));
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 'y', 1.7976931348623157E308, 'm', Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=1  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(0, 0, (String) null);
      assertEquals("id=0  bidSize=null", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-3126));
      assertEquals("id=-3126 =============== end ===============", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract1 = new Contract();
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 'c', 'b', 0, 1.7976931348623157E308, 0, 1.7976931348623157E308, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n99 98.0 0.0 1.7976931348623157E308 0.0 1.7976931348623157E308 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails((-468), (Contract) null, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(184);
      assertEquals("reqId = 184 =============== end ===============", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, (String) null, (String) null);
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      System.setCurrentTimeMillis((-2645L));
      System.setCurrentTimeMillis(941L);
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(869, "ve#(=`|HIC?", "BAG", "BAG", (-2645L), (String) null, (String) null, (String) null, "nl8}[,@<iTnq", (String) null, vector0, "Jp]P[V($AdHMW^V!", false, (String) null, (String) null);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("BAG", "", "", (String) null, 'f', 1.7976931348623157E308, 1.7976931348623157E308, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.currentTime(Integer.MAX_VALUE);
      assertEquals("current time = 2147483647 (Jan 19, 2038 3:14:07 AM)", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(243, 4158, contractDetails0, "=Df", (String) null, "com.ib.client.TagValue", "");
      assertEquals("id = 243 rank=4158 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance==Df benchmark=null projection=com.ib.client.TagValue legsStr=", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=2147483647  unknown=0", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(3, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 'y', 1, 0);
      assertEquals("id=2147483647  unknown=1.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "nQ2U.Ju|$UW", (String) null, "14go$ B@", 1.7976931348623157E308, 1.0, 3273.1993236, (String) null, "BAG");
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 3, 0.0, 0.0, 1.7976931348623157E308, 13);
      assertEquals("id=0  askSize: vol = 0.0 delta = 0.0", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation((-2147483645), 13, Integer.MAX_VALUE, '?', Integer.MAX_VALUE, 757.58065504812);
      assertEquals("id=-2147483645  modelOptComp: vol = 2.147483647E9 delta = N/A: modelPrice = 2.147483647E9: pvDividend = 757.58065504812", string1);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      System.setCurrentTimeMillis(2722L);
      Vector<TagValue> vector0 = new Vector<TagValue>();
      OrderState orderState0 = new OrderState("oGR", "]x\"Sa`K", "]x\"Sa`K", "]x\"Sa`K", 3014, 2722L, (-1.0), "]x\"Sa`K", "]x\"Sa`K");
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 0, 3014, 1220.1231658, 13, 13);
      assertEquals("id=13  bidSize: vol = 3014.0 delta = N/A", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(3014, 13, (-1.0), 13, (-1.0), (-1.0));
      assertEquals("id=3014  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string1);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "", (String) null, "", 1.7976931348623157E308, Integer.MAX_VALUE, (-240.34515543773017), "OtGQbN5", (String) null);
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (-506.1409702), (-350.873), 2969.1514, 0);
      assertEquals("id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = 2969.1514: pvDividend = 0.0", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(0, 13, (-1.0), 'y', 0, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = 0.0: pvDividend = N/A", string1);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, (-2281.4423277699966), 0, 266.82, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(23, 13, 0.0, 2, 1.7976931348623157E308, 1435.0);
      assertEquals("id=23  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = 1435.0", string1);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_secType = "BAG";
      Order order0 = new Order();
      order0.m_ocaGroup = null;
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = " scalemriceIncrement=";
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      System.setCurrentTimeMillis((-2645L));
      System.setCurrentTimeMillis((-2645L));
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(869, "ve#(=`|HIC?", "BAG", "BAG", (-2645L), (String) null, (String) null, "1jr", "nl8}[:@<iTnq", (String) null, vector0, "Jp]P[V($AdHMW^V!", true, (String) null, (String) null);
      Order order0 = new Order();
      contract0.m_comboLegsDescrip = "(t8*1.";
      OrderState orderState0 = new OrderState("/$x-*1T#c*Co2}al", (String) null, "jVqW", "markPrice", 1569.3055470865, (-1.0), (-1.0), "bF1Np~SH\"&", (String) null);
      orderState0.m_warningText = "VA83>%Uz_dj";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      System.setCurrentTimeMillis((-2645L));
      System.setCurrentTimeMillis(941L);
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(869, "ve#(=`|HIC?", "BAG", "BAG", (-2645L), (String) null, (String) null, (String) null, "nl8}[:@<iTnq", (String) null, vector0, "Jb60!", true, (String) null, (String) null);
      Order order0 = new Order();
      order0.m_basisPoints = 3224.0799084156615;
      contract0.m_multiplier = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = " scalePriceIncrement=";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = " scalemriceIncrement=";
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<TagValue> vector0 = new Vector<TagValue>();
      vector0.add((TagValue) null);
      contract0.m_comboLegs = vector0;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = " >qalZmrjceIncrement=";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<TagValue> vector0 = new Vector<TagValue>();
      TagValue tagValue0 = new TagValue();
      vector0.add(tagValue0);
      vector0.add((TagValue) null);
      contract0.m_comboLegs = vector0;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      orderState0.m_initMargin = "orderTypes = ";
      orderState0.equals((Object) null);
      order0.m_algoStrategy = " >qalZmrjceIncrement=";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }
}
