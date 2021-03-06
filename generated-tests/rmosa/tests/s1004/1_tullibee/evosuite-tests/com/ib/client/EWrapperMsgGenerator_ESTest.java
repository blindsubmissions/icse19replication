/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 06:41:53 GMT 2018
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
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-2114998392));
      assertEquals("reqId = -2114998392 =============== end ===============", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(":jD>J\u0007");
      assertEquals("Connected : The list of managed accounts are : [:jD>J\u0007]", string0);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string1 = EWrapperMsgGenerator.contractDetails((-1613), contractDetails0);
      assertEquals("reqId = -1613 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string1);
      
      String string2 = EWrapperMsgGenerator.tickSize((-1613), 1574, 1478);
      assertEquals("id=-1613  unknown=1478", string2);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EWrapperMsgGenerator.realtimeBar(2320, 924L, 473.6, 2320, 473.6, 0.0, 924L, 924L, (-3448));
      System.setCurrentTimeMillis(924L);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(0, "B{xJT", "B{xJT", "com.ib.client.AnyWrapperMsgGenerator", (-6282.1), "B{xJT", "B{xJT", "BOND", "com.ib.client.AnyWrapperMsgGenerator", "", vector0, "BOND", false, "B{xJT", "BOND");
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, "", (-6282.1), "B{xJT", "com.ib.client.Contract", 0, "", "K:3'$s|", "B{xJT", "~Verj@\"*'", "com.ib.client.AnyWrapperMsgGenerator", "P_s_*", "", "B{xJT");
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = B{xJT\nsecType = B{xJT\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = BOND\ncurrency = com.ib.client.AnyWrapperMsgGenerator\nmarketName = null\ntradingClass = \nconid = 0\nminTick = -6282.1\norderTypes = B{xJT\nvalidExchanges = com.ib.client.Contract\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = \n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(0, "");
      assertEquals("FA: null ", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.historicalData('?', (String) null, 0, 0, 0, Integer.MAX_VALUE, 0, 0, 1, false);
      assertEquals("id=63 date = null open=0.0 high=0.0 low=0.0 close=2.147483647E9 volume=0 count=0 WAP=1.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(2145664422);
      assertEquals("id=2145664422 =============== end ===============", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "");
      assertEquals("id  = 2147483647 len = 0\n", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(3742, 3742, 3742, 3742, 3742, 3742);
      assertEquals("updateMktDepth: 3742 3742 3742 3742 3742.0 3742", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("(. o-ksGUe8k");
      assertEquals("SCANNER PARAMETERS:\n(. o-ksGUe8k", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin('f', 'y', (String) null, (String) null);
      assertEquals("MsgId=102 :: MsgType=121 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(2320);
      System.setCurrentTimeMillis(2320);
      Vector<Integer> vector0 = new Vector<Integer>();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.currentTime(0);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('m', 0, (String) null, 'n', Integer.MAX_VALUE, 1, 0);
      assertEquals("updateMktDepth: 109 0 null 110 2147483647 1.0 0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(10);
      assertEquals("id = 10 =============== end ===============", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickString(0, 'c', (String) null);
      assertEquals("id=0  unknown=null", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-1987), (-1987), (-1987), (-1987));
      assertEquals("id=-1987  unknown=-1987.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3770, 3770, 3770, 3770, 3770, 3770);
      assertEquals("id=3770  unknown: vol = 3770.0 delta = N/A", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 'y', 'n');
      assertEquals("id=2147483647  unknown=110.0", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
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
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(3770);
      assertEquals("Next Valid Order ID: 3770", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Order order0 = new Order();
      order0.m_displaySize = order0.m_displaySize;
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue: null null null null", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, "%GE_J>~3]IJ\"QvkwMF", "%GE_J>~3]IJ\"QvkwMF", "%GE_J>~3]IJ\"QvkwMF", 0, "}j@*8c[e)p", "}j@*8c[e)p", "}j@*8c[e)p", "", "B,Q+yzWof[oo Iwh[", vector0, "%GE_J>~3]IJ\"QvkwMF", true, "B,Q+yzWof[oo Iwh[", "f%5h45GFE");
      contract0.m_conId = 13;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) vector0;
      objectArray0[1] = (Object) contract0;
      contract0.m_localSymbol = "}j@*8c[e)p";
      objectArray0[5] = (Object) "%GE_J>~3]IJ\"QvkwMF";
      vector0.toArray(objectArray0);
      ContractDetails contractDetails0 = new ContractDetails(contract0, "}j@*8c[e)p", (String) null, 0, "}j@*8c[e)p", "", 13, "}j@*8c[e)p", (String) null, "", (String) null, (String) null, "%GE_J>~3]IJ\"QvkwMF", "}j@*8c[e)p", "?u1\"al{c,):");
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, (String) null, "%GE_J>~3]IJ\"QvkwMF", (String) null);
      assertEquals("id = 0 rank=0 symbol=%GE_J>~3]IJ\"QvkwMF secType=%GE_J>~3]IJ\"QvkwMF expiry=%GE_J>~3]IJ\"QvkwMF strike=0.0 right=}j@*8c[e)p exchange=}j@*8c[e)p currency= localSymbol=}j@*8c[e)p marketName=}j@*8c[e)p tradingClass=null distance=null benchmark=null projection=%GE_J>~3]IJ\"QvkwMF legsStr=null", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-816), (-816), (-816), (-816), (-816), (-816));
      assertEquals("id=-816  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 2, 0, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(10, 'y', 0, 0, 3, 0);
      assertEquals("id=10  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown=2.147483647E9  noAutoExecute", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
      
      String string1 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, (OrderState) null);
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
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.orderStatus('c', (String) null, 0, Integer.MAX_VALUE, 'y', 0, 2, 0.0, 3, (String) null);
      assertEquals("order status: orderId=99 clientId=3 permId=0 status=null filled=0 remaining=2147483647 avgFillPrice=121.0 lastFillPrice=0.0 parent Id=2 whyHeld=null", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 'm', 3, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n109 3.0 0.0 0.0 2.147483647E9 2.147483647E9 null", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(121);
      assertEquals("reqId = 121 =============== end ===============", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickEFP('f', 'm', 0, (String) null, 0, 'y', (String) null, 0.0, 3);
      assertEquals("id=102  unknown: basisPoints = 0.0/null impliedFuture = 0.0 holdDays = 121 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 3.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(2, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, "BAG", "BAG", "BAG", 0, "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "BAG", true, "BAG", "BAG");
      Order order0 = new Order();
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
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      EWrapperMsgGenerator.tickOptionComputation(10, 13, 0, 0, 3, 0);
      String string0 = AnyWrapperMsgGenerator.connectionClosed();
      assertEquals("Connection Closed", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      underComp0.m_delta = underComp0.m_delta;
      Vector<Integer> vector0 = new Vector<Integer>();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0.0, 0.0, (-2286.1732), (-2286.1732));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, "BAG", "BAG", "BAG", 0, "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "BAG", true, "BAG", "BAG");
      contract0.m_comboLegsDescrip = "BAG";
      Order order0 = new Order();
      contract0.m_symbol = null;
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
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      order0.m_nbboPriceCap = (double) 15;
      Order order1 = new Order();
      order1.m_settlingFirm = null;
      EWrapperMsgGenerator.tickOptionComputation(0, 13, 1, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      System.setCurrentTimeMillis(2);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Vector<String> vector0 = new Vector<String>();
      order0.m_algoParams = vector0;
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Vector<String> vector0 = new Vector<String>();
      order0.m_algoParams = vector0;
      vector0.add((String) null);
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(2, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
      order0.m_basisPoints = 1728.04397465;
      Vector<String> vector0 = new Vector<String>();
      Vector<TagValue> vector1 = new Vector<TagValue>();
      Contract contract0 = new Contract(0, "N=!%iD\"rwA *%WTs+V", "BAG", (String) null, 1.7976931348623157E308, (String) null, "ViS+1)[/_V7x", (String) null, "O", (String) null, vector1, ",>;y.", false, "", "jc6L)6>&O");
      OrderState orderState0 = new OrderState();
      orderState0.m_status = null;
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }
}
