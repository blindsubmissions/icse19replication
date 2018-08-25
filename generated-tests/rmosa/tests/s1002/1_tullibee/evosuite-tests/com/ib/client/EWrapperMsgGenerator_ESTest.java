/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 05:56:01 GMT 2018
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
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickEFP(0, 1, 'b', (String) null, Integer.MAX_VALUE, 3, (String) null, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  bidPrice: basisPoints = 98.0/null impliedFuture = 2.147483647E9 holdDays = 3 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_right = "";
      Execution execution0 = new Execution((-1603), (-186), "", (String) null, "]", "PG?AQe^w;x-G", (String) null, (-186), 1.7976931348623157E308, (-186), (-523), 0, (-1603));
      String string0 = EWrapperMsgGenerator.execDetails((-186), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -186\norderId = -1603\nclientId = -186\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = \ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = \ntime = null\nacctNumber = ]\nexecutionExchange = PG?AQe^w;x-G\nside = null\nshares = -186\nprice = 1.7976931348623157E308\npermId = -186\nliquidation = -523\ncumQty = 0\navgPrice = -1603.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(110);
      assertEquals("id = 110 =============== end ===============", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 0, 0, 'f', 0, 'n', Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=2147483647 clientId=2147483647 permId=0 status=null filled=0 remaining=0 avgFillPrice=102.0 lastFillPrice=2.147483647E9 parent Id=110 whyHeld=null", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-887));
      assertEquals("id=-887 =============== end ===============", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1, 0, (String) null, 0, 0, '?', Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 1 0 null 0 0 63.0 2147483647", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      Contract contract0 = new Contract();
      contract0.m_primaryExch = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(0, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
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
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue: null null null null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 'y', 1.7976931348623157E308, 0.0, '?', 1.7976931348623157E308, '?', (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n121 1.7976931348623157E308 0.0 63.0 1.7976931348623157E308 63.0 null", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_validExchanges = "nB:a,rB]YjT";
      EWrapperMsgGenerator.contractDetails((-17), contractDetails0);
      contractDetails0.m_nextOptionType = "reqId = -17 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = nB:a,rB]YjT\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n";
      contractDetails0.m_marketName = "reqId = -17 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = nB:a,rB]YjT\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n";
      contractDetails0.m_issueDate = "vKQsT#'t";
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, (String) null, (String) null);
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData('y', (String) null, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 1, 2, 0, 1, false);
      assertEquals("id=121 date = null open=2.147483647E9 high=0.0 low=2.147483647E9 close=1.0 volume=2 count=0 WAP=1.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "AQ-NQD'%x";
      Order order1 = new Order();
      Order order2 = new Order();
      EWrapperMsgGenerator.realtimeBar(Integer.MAX_VALUE, 0, 1.7976931348623157E308, 0, 1.7976931348623157E308, 'b', 0, '?', 'n');
      Order order3 = new Order();
      System.setCurrentTimeMillis((-3191L));
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation('c', Integer.MAX_VALUE, Integer.MAX_VALUE, 1.7976931348623157E308, 0, 1.7976931348623157E308);
      assertEquals("id=99  unknown: vol = 2.147483647E9 delta = N/A", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 1, 1.7976931348623157E308, 0, 0, 0.0);
      assertEquals("id=0  bidPrice: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1541), (-1541), (-1541), (-1541), (-1541), (-1541));
      assertEquals("id=-1541  unknown: vol = N/A delta = N/A", string0);
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
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData('n', 0, (ContractDetails) null, (String) null, "", (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 0);
      assertEquals("id=0  bidSize=0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(117);
      assertEquals("reqId = 117 =============== end ===============", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(1, 0, 'f', 0, 0, 1);
      assertEquals("updateMktDepth: 1 0 102 0 0.0 1", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(0L);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickGeneric('?', 'f', 0);
      assertEquals("id=63  unknown=0.0", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickString('y', 0, (String) null);
      assertEquals("id=121  bidSize=null", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(0, "");
      assertEquals("FA: null ", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData('n', (String) null);
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
      String string0 = EWrapperMsgGenerator.nextValidId(110);
      assertEquals("Next Valid Order ID: 110", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 'y', Integer.MAX_VALUE, 'm');
      assertEquals("id=2147483647  unknown=2.147483647E9  canAutoExecute", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      int int0 = 0;
      Contract contract0 = new Contract();
      String string0 = null;
      ContractDetails contractDetails0 = new ContractDetails(contract0, "SCANNER PARAMETERS:", (String) null, 0, (String) null, (String) null, 0, "FA:", "FA:", "FCX(>Ql[fp}^atg|", (String) null, (String) null, (String) null, (String) null, (String) null);
      EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      Contract contract1 = null;
      String string1 = null;
      String string2 = "d";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractMsg((Contract) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(0, 'c', 0, 0);
      assertEquals("id=0  unknown=0.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1041, 13, 2787.45389637, 1041, 4, 1.7976931348623157E308);
      assertEquals("id=1041  modelOptComp: vol = 2787.45389637 delta = N/A: modelPrice = 4.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1541), 13, 2787.45389637, (-1541), (-1541), 13);
      assertEquals("id=-1541  modelOptComp: vol = 2787.45389637 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, 1041, 1041, 1041, (-1459.288280613757));
      assertEquals("id=2147483647  modelOptComp: vol = 1041.0 delta = N/A: modelPrice = 1041.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Order order0 = new Order();
      EWrapperMsgGenerator.tickOptionComputation(1908874353, 13, 0, 0, 1.7976931348623157E308, (-832.8096467004403));
      System.setCurrentTimeMillis(758);
      System.setCurrentTimeMillis(0);
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
      Contract contract0 = new Contract(2373, "BAG", "BAG", "BAG", 37, "BAG", "BAG", "BAG", "BAG", "BAG", (Vector) null, "BAG", true, "BAG", "lowEFP");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(37, contract0, order0, orderState0);
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
      Vector<Object> vector0 = new Vector<Object>();
      Vector<Integer> vector1 = new Vector<Integer>();
      OrderState orderState0 = new OrderState(" clientId=", " clientId=", "C,x", "O|mzt", 2.0, 2.0, 2.0, "BAG", " clientId=");
      orderState0.m_maxCommission = (double) (-1529);
      vector1.stream();
      Contract contract0 = new Contract((-1529), "BAG", "BAG", "O|mzt", 2.0, "C,x", " clientId=", "C,x", (String) null, "BAG", vector1, "BAG", false, "BAG", "BAG");
      contract0.m_comboLegsDescrip = "  It does not support Scale orders.";
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.openOrder(3, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(2147483645, "BAG", "BAG", "BOND", 2147483645, "BOND", "BAG", "_", "BOND", "a=sq", vector0, "BOND", true, "BOND", "BOND");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_basisPoints = (-554.44948);
      EWrapperMsgGenerator.openOrder(2147483645, contract0, order0, orderState0);
      EWrapperMsgGenerator.openOrder((-1551), contract0, order0, orderState0);
      EWrapperMsgGenerator.openOrder(5, contract0, order0, orderState0);
      System.setCurrentTimeMillis(2147483645);
      vector0.remove((Object) "  It does not support API scanner subscriptiou.");
      Vector<Integer> vector1 = new Vector<Integer>();
      Contract contract1 = new Contract();
      contract1.m_currency = "u/&c=[=-A$!cWOS";
      contract1.m_comboLegs = contract0.m_comboLegs;
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract1, order0, orderState0);
      System.setCurrentTimeMillis(2147483645);
  }
}
