/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 09:37:13 GMT 2018
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
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, Integer.MAX_VALUE, (String) null, 0, 'y', 0, 'b');
      assertEquals("updateMktDepth: 0 2147483647 null 0 121 0.0 98", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1605), (-1605), (-1605), (-1605), (-1605), (-1605));
      assertEquals("id=-1605  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickOptionComputation('m', Integer.MAX_VALUE, 0, 0, 1.7976931348623157E308, 0.0);
      assertEquals("id=109  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(31, 31, 31, 31, 31, 31);
      assertEquals("id=31  IndexFuturePremium: vol = 31.0 delta = N/A", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, "", 0, 0, 0, 0.0, Integer.MAX_VALUE, 'm', 0, false);
      assertEquals("id=2147483647 date =  open=0.0 high=0.0 low=0.0 close=0.0 volume=2147483647 count=109 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-1605));
      assertEquals("reqId = -1605 =============== end ===============", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      ContractDetails contractDetails0 = new ContractDetails();
      EWrapperMsgGenerator.scannerData(0, (-1), contractDetails0, (String) null, (String) null, (String) null, (String) null);
      int int1 = 1994091958;
      contractDetails0.m_putable = false;
      String string0 = "OptionBidExchStr";
      String string1 = null;
      double double0 = 0.0;
      String string2 = null;
      Vector<Object> vector0 = new Vector<Object>();
      // Undeclared exception!
      try { 
        vector0.setElementAt("id = 0 rank=-1 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", 1994091958);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1994091958 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
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
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize((-1605), (-1605), (-1605));
      assertEquals("id=-1605  unknown=-1605", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(Integer.MAX_VALUE, 0, 0, (String) null, 1.7976931348623157E308, 'b', (String) null, 1, 0.0);
      assertEquals("id=2147483647  bidSize: basisPoints = 0.0/null impliedFuture = 1.7976931348623157E308 holdDays = 98 futureExpiry = null dividendImpact = 1.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, "GDmi7RmAj~Q", 0, (String) null, (String) null, (-2101), "GDmi7RmAj~Q", "~mgh", "", (String) null, (String) null, "W.~CR&gR]-ulN", ";e'.J]nK#", (String) null);
      EWrapperMsgGenerator.bondContractDetails((-119), contractDetails0);
      EWrapperMsgGenerator.realtimeBar((-1137783131), (-119), 0, 0, 1817.36356209566, 4346.91352, (-1137783131), 0.0, (-20));
      contractDetails0.m_minTick = 4346.91352;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "openEFP", " stockRangeLower=", (String) null, 0, 0, 1.7976931348623157E308, (String) null, (String) null);
      orderState0.m_status = null;
      System.setCurrentTimeMillis((-18L));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 'n', 'n', 0, 1, 0);
      assertEquals("updateMktDepth: 0 110 110 0 1.0 0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EWrapperMsgGenerator.currentTime(1093L);
      System.setCurrentTimeMillis(1093L);
      System.setCurrentTimeMillis(1093L);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.nextValidId('n');
      assertEquals("Next Valid Order ID: 110", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus('f', "", Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0, 0, 0.0, 0, (String) null);
      assertEquals("order status: orderId=102 clientId=0 permId=0 status= filled=2147483647 remaining=0 avgFillPrice=2.147483647E9 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue: null null null null", string0);
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
      String string0 = EWrapperMsgGenerator.receiveFA(Integer.MAX_VALUE, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 1.7976931348623157E308, 0, 0, 1.7976931348623157E308, Integer.MAX_VALUE, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 1.7976931348623157E308 0.0 0.0 1.7976931348623157E308 2.147483647E9 null", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(Integer.MAX_VALUE, 'b', "", "");
      assertEquals("MsgId=2147483647 :: MsgType=98 :: Origin= :: Message=", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(1, 0, 0, 2);
      assertEquals("id=1  bidSize=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-1));
      assertEquals("reqId = -1 =============== end ===============", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EWrapperMsgGenerator.accountDownloadEnd((String) null);
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_bondType = contractDetails0.m_bondType;
      EWrapperMsgGenerator.contractDetails(1766, contractDetails0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 'c', 0.0, 0);
      assertEquals("id=2147483647  unknown=0.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
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
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Contract contract0 = null;
      String string0 = "com.ib.client.UnderComp";
      Execution execution0 = new Execution((-434), 0, "com.ib.client.UnderComp", "com.ib.client.UnderComp", "com.ib.client.UnderComp", "com.ib.client.UnderComp", "com.ib.client.UnderComp", 329, 0, 0, (-434), (-434), (-434));
      execution0.m_exchange = "3CD!ugC\"d8*k";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(0, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-5));
      assertEquals("id=-5 =============== end ===============", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 'y', 1.7976931348623157E308);
      assertEquals("id=2147483647  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(0, 0, (String) null);
      assertEquals("id=0  bidSize=null", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 'f', 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 1);
      assertEquals("id=0  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1605), 13, (-1605), (-1605));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      System.setCurrentTimeMillis('c');
      order0.m_clearingIntent = null;
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, 13, Integer.MAX_VALUE, 0.0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=3  modelOptComp: vol = 2.147483647E9 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract1 = new Contract(0, (String) null, "BAG", (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, contract0.m_comboLegs, (String) null, true, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
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
      Contract contract1 = new Contract(0, (String) null, "BAG", (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, contract0.m_comboLegs, (String) null, true, (String) null, (String) null);
      contract1.m_comboLegsDescrip = "9(aya/}A";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
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
      contract0.m_strike = 0.0;
      order0.m_algoParams = contract0.m_comboLegs;
      orderState0.m_initMargin = null;
      Object object0 = new Object();
      contract0.equals(object0);
      orderState0.m_equityWithLoan = "S3Y`fL7dt6E3rB";
      OrderState orderState1 = new OrderState();
      order0.m_basisPoints = 2126.0;
      Contract contract1 = new Contract(0, "k:IF{", "BAG", (String) null, Integer.MAX_VALUE, (String) null, "@n%U<Qo~3bF*A2JQ", (String) null, (String) null, "@n%U<Qo~3bF*A2JQ", order0.m_algoParams, "", false, (String) null, (String) null);
      contract1.m_symbol = "";
      contract1.m_secId = null;
      EWrapperMsgGenerator.openOrder(2387, contract1, order0, orderState0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<TagValue> vector0 = new Vector<TagValue>(0, 0);
      TagValue tagValue0 = new TagValue(" maintMargin=", (String) null);
      vector0.add(tagValue0);
      vector0.add(tagValue0);
      contract0.m_comboLegs = vector0;
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertTrue(string1.equals((Object)string0));
  }
}
