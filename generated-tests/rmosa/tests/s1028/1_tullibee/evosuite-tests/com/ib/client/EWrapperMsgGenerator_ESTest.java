/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 18:21:58 GMT 2018
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
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-6));
      assertEquals("reqId = -6 =============== end ===============", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_strike = 904.018064405424;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-2116), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-4));
      assertEquals("reqId = -4 =============== end ===============", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(1664, "com.ib.client.Execution");
      assertEquals("FA: null com.ib.client.Execution", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 0.0, 0.0, 0, 0.0, 0.0, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 0.0 0.0 null", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickString(4407, 4407, (String) null);
      System.setCurrentTimeMillis(4407);
      System.setCurrentTimeMillis(4407);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("2k{;ng{tQ U4|<");
      assertEquals("updateAccountTime: 2k{;ng{tQ U4|<", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-869));
      assertEquals("Next Valid Order ID: -869", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 1, 'y', 0, 'm', 0, 1.7976931348623157E308, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=2147483647 clientId=2147483647 permId=109 status=null filled=1 remaining=121 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(0, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(1123, 1123, 1123, 1123, 1123, 1123, 1000L, 1123, 1123);
      assertEquals("id=1123 time = 1123 open=1123.0 high=1123.0 low=1123.0 close=1123.0 volume=1000 count=1123 WAP=1123.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(98, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 98\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 0, 0, 0, 0);
      assertEquals("updateMktDepth: 0 0 null 0 0 0.0 0", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(32, 32, 32, 32, 32, 32);
      assertEquals("id=32  bidExch: vol = 32.0 delta = N/A", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(0, (String) null);
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
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-904));
      assertEquals("id = -904 =============== end ===============", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(1, 1, 1, 1, 1, 1);
      assertEquals("updateMktDepth: 1 1 1 1 1.0 1", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(99, 99, 99);
      assertEquals("id=99  unknown=99", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      EWrapperMsgGenerator.contractDetails(987, contractDetails0);
      OrderState orderState0 = new OrderState();
      contractDetails0.m_marketName = " filled=";
      orderState0.m_maxCommission = 0.0;
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(3969);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 0, 0, 0, 0.0, 0, 0, 0.0, false);
      assertEquals("id=0 date = null open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP((-4448), (-4448), (-4448), "2k{;ng{tQ U4|<", (-4448), (-4448), "2k{;ng{tQ U4|<", (-4448), (-4448));
      assertEquals("id=-4448  unknown: basisPoints = -4448.0/2k{;ng{tQ U4|< impliedFuture = -4448.0 holdDays = -4448 futureExpiry = 2k{;ng{tQ U4|< dividendImpact = -4448.0 dividends to expiry = -4448.0", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, (String) null, (String) null);
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1, 1, 1, 1);
      assertEquals("id=1  bidPrice=1.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.updateAccountValue("", (String) null, (String) null, (String) null);
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1), (-1), (-1), (-1), (-1), (-1));
      assertEquals("id=-1  unknown: vol = N/A delta = -1.0", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-1L));
      assertEquals("current time = -1 (Dec 31, 1969 11:59:59 PM)", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 0, 0);
      assertEquals("id=0  bidSize=0.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EWrapperMsgGenerator.tickPrice(0, 0, 0, 0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, 0.0, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation(1, 13, 1.7976931348623157E308, 13, 1.0, 1.7976931348623157E308);
      System.setCurrentTimeMillis((-1782L));
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1.0), (-1.0), (-1.0), (-1.0));
      assertEquals("id=13  modelOptComp: vol = N/A delta = -1.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "yleKP*h@>K.WyBG";
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      order0.m_stockRangeLower = 1713.524793093341;
      order0.m_scaleSubsLevelSize = 0;
      OrderState orderState0 = new OrderState((String) null, "", (String) null, "O", Integer.MAX_VALUE, 1.7976931348623157E308, 0, "", (String) null);
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.0, 0, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=0  modelOptComp: vol = 1.0 delta = 0.0: modelPrice = N/A: pvDividend = 2.147483647E9", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", (String) null, Integer.MAX_VALUE, (String) null, (String) null, "", (String) null, (String) null, (Vector) null, "O", false, (String) null, (String) null);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", (String) null, Integer.MAX_VALUE, (String) null, (String) null, "", (String) null, (String) null, (Vector) null, "O", false, (String) null, (String) null);
      contract0.m_comboLegsDescrip = "a8";
      Contract contract1 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(17, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(10, "yM_kSe", "yM_kSe", "yM_kSe", 10, "yM_kSe", "yM_kSe", "yM_kSe", "yM_kSe", "yM_kSe", vector0, "yM_kSe", false, "yM_kSe", "yM_kSe");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "yM_kSe";
      order0.m_algoParams = contract0.m_comboLegs;
      String string0 = EWrapperMsgGenerator.openOrder(10, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(10, "yM_kNSe", "yM_kNSe", "yM_kNSe", 10, "yM_kNSe", "yM_kNSe", "yM_kNSe", "yM_kNSe", "yM_kNSe", vector0, "yM_kNSe", false, "yM_kNSe", "yM_kNSe");
      vector0.add((Integer) null);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "yM_kNSe";
      order0.m_algoParams = contract0.m_comboLegs;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(10, contract0, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", (String) null, Integer.MAX_VALUE, (String) null, (String) null, "", (String) null, (String) null, (Vector) null, "O", false, (String) null, (String) null);
      order0.m_basisPoints = 2.147483647E9;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }
}
