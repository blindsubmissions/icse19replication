/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 10:24:43 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.AnyWrapperMsgGenerator;
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
      String string0 = EWrapperMsgGenerator.updateAccountTime("L&=~sv5?Lr1jENv");
      assertEquals("updateAccountTime: L&=~sv5?Lr1jENv", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.execDetailsEnd('y');
      assertEquals("reqId = 121 =============== end ===============", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(102);
      assertEquals("id = 102 =============== end ===============", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrderState orderState0 = new OrderState();
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation((-2), (-2), (-2), (-2), (-2), (-2));
      System.setCurrentTimeMillis((-912L));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(48, 48, 48, 48, 48, 48);
      assertEquals("id=48  RTVolume: vol = 48.0 delta = N/A", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-925), "#hr%Z\u0006", "H2hJ7kimB`>}EvM%!]", "H2hJ7kimB`>}EvM%!]", (-925), "#hr%Z\u0006", "H2hJ7kimB`>}EvM%!]", "H2hJ7kimB`>}EvM%!]", "H2hJ7kimB`>}EvM%!]", "H2hJ7kimB`>}EvM%!]", vector0, "", false, "kTKxNtcj", "");
      ContractDetails contractDetails0 = new ContractDetails(contract0, "H2hJ7kimB`>}EvM%!]", "ig7hM-4_]+A-m^UP|m", 0.0, "mrbgT9vk{02]$WVdz+", "#hr%Z\u0006", (-1), (String) null, "Next Valid Order ID: ", "8#ZY*!pBie", " rank=", " | ", "", "", "H2hJ7kimB`>}EvM%!]");
      String string0 = EWrapperMsgGenerator.scannerData(2751, 2751, contractDetails0, "/", "", "8#ZY*!pBie", "");
      assertEquals("id = 2751 rank=2751 symbol=#hr%Z\u0006 secType=H2hJ7kimB`>}EvM%!] expiry=H2hJ7kimB`>}EvM%!] strike=-925.0 right=#hr%Z\u0006 exchange=H2hJ7kimB`>}EvM%!] currency=H2hJ7kimB`>}EvM%!] localSymbol=H2hJ7kimB`>}EvM%!] marketName=H2hJ7kimB`>}EvM%!] tradingClass=ig7hM-4_]+A-m^UP|m distance=/ benchmark= projection=8#ZY*!pBie legsStr=", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = null;
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, 0, 0, 1.7976931348623157E308, 'b', 1, 1.7976931348623157E308, 0, "");
      assertEquals("order status: orderId=1 clientId=0 permId=98 status=null filled=0 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=1.7976931348623157E308 parent Id=1 whyHeld=", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EWrapperMsgGenerator.tickSize(13, 13, 13);
      System.setCurrentTimeMillis(13);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, Integer.MAX_VALUE, (String) null, 1, 0, (String) null, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: basisPoints = 2.147483647E9/null impliedFuture = 1.0 holdDays = 0 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((-1275L));
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-1911755015), ";AO", ";AO", ";AO", 5676.3693977591565, ";AO", ";AO", ";AO", ";AO", (String) null, vector0, ";AO", false, ";AO", "!TJSh[)`1/{q9aJ)");
      Contract contract1 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.realtimeBar(0, 1, 0, 1, 1, 'n', 1, 0, Integer.MAX_VALUE);
      assertEquals("id=0 time = 1 open=0.0 high=1.0 low=1.0 close=110.0 volume=1 count=2147483647 WAP=0.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 'f', (String) null, 0, 0, 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 0 102 null 0 0 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickGeneric(0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=0  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 0, 1.7976931348623157E308, 0, 3, 3, "O");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 1.7976931348623157E308 0.0 3.0 3.0 O", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, (String) null);
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
      System.setCurrentTimeMillis((-1287L));
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1911755015), (-1911755015), 0.0, 0.0, (-1287L), 0.0);
      assertEquals("id=-1911755015  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EWrapperMsgGenerator.updateAccountValue("", "", "", "");
      UnderComp underComp0 = new UnderComp();
      assertEquals(0.0, underComp0.m_price, 0.01);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("L&=~sv5?Lr1jENv");
      assertEquals("accountDownloadEnd: L&=~sv5?Lr1jENv", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 0, 0, 0);
      System.setCurrentTimeMillis(98);
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "reqId = -1672 =============== end ===============", " ", 98, (String) null, " ", 98, "8Jv'", "y+uIH", "^`sJ", " B2_60[V%'2kUW3Q", "reqId = -1672 =============== end ===============", "", "7-7~F", "id=0  bidSize: vol = N/A delta = 0.0");
      contractDetails0.m_maturity = ")mG 4|*8";
      EWrapperMsgGenerator.contractDetails((-1845745973), contractDetails0);
      String string0 = EWrapperMsgGenerator.SCANNER_PARAMETERS;
      assertFalse(string0.equals((Object)string1));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 'y', Integer.MAX_VALUE, 0, 'b', Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 0 121 2147483647 0 98.0 2147483647", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 0, (String) null);
      assertEquals("id=2147483647  bidSize=null", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(2096, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
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
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin('c', Integer.MAX_VALUE, (String) null, (String) null);
      assertEquals("MsgId=99 :: MsgType=2147483647 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 0.0, 1.7976931348623157E308, 0, "", (String) null);
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickPrice('?', 0, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=63  bidSize=1.7976931348623157E308  canAutoExecute", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EWrapperMsgGenerator.currentTime(0L);
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState((String) null, "current time = 0 (Jan 1, 1970 12:00:00 AM)", (String) null, (String) null, (-1659), (-1672.6955766819458), 0.0, (String) null, (String) null);
      assertEquals((-1659.0), orderState0.m_commission, 0.01);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(0, (ContractDetails) null);
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
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(288);
      assertEquals("reqId = 288 =============== end ===============", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.receiveFA(1, "O");
      assertEquals("FA: GROUPS O", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 1.7976931348623157E308, 13, 1.7976931348623157E308);
      System.setCurrentTimeMillis(98);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, (String) null, 'y', 0, 0, 'b', 'f', 'f', 0.0, false);
      assertEquals("id=2147483647 date = null open=121.0 high=0.0 low=0.0 close=98.0 volume=102 count=102 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      EWrapperMsgGenerator.tickPrice('n', Integer.MAX_VALUE, 1.7976931348623157E308, 0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 13);
      EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, (-733.3583348636106), (-193.8321));
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "halted", "26WeekLow", (String) null, 1.7976931348623157E308, 1.7976931348623157E308, 2735.79320648, "com.ib.client.Util", (String) null);
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1280), (-3008), 109.89614033193, 446.43889126590904, (-991.1608845507672), 1.0);
      EWrapperMsgGenerator.tickOptionComputation(10, 13, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, (-912.273425402881));
      EWrapperMsgGenerator.tickOptionComputation(1, 1, 1.7976931348623157E308, 0, 0, 1.7976931348623157E308);
      String string1 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
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
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, (String) null, "BAG", (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, contract0.m_comboLegs, (String) null, false, (String) null, (String) null);
      contract1.m_comboLegsDescrip = "c')iE4K>A2h(";
      Order order0 = new Order();
      order0.m_nbboPriceCap = 0.0;
      String string0 = EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      order0.m_discretionaryAmt = 4878.0;
      order0.m_basisPoints = 1544.4296393805;
      order0.m_delta = 2.147103814E9;
      Contract contract0 = new Contract(2147483645, "BAG", "BAG", "D  a/g&*~_v_;", 0, "", "", "y1q!", "Opti)nAskE,*xchS)r", "", (Vector) null, "bidEFP", false, (String) null, (String) null);
      Order order1 = new Order();
      EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      EWrapperMsgGenerator.openOrder((-1), contract0, order1, orderState0);
      Order order2 = new Order();
      EWrapperMsgGenerator.openOrder(2, contract0, order2, orderState0);
      EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      System.setCurrentTimeMillis(682L);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Order order0 = new Order();
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      order0.m_whatIf = false;
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      TagValue tagValue0 = new TagValue();
      vector0.addElement(tagValue0);
      Vector<Integer> vector1 = new Vector<Integer>();
      String string1 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      orderState0.m_maintMargin = null;
      TagValue tagValue0 = new TagValue(" auxPrice=", "com.ib.client.Contract");
      vector0.add((Object) tagValue0);
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      vector0.add((Object) null);
      Contract contract2 = new Contract();
      contract0.m_expiry = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1645, contract0, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }
}
