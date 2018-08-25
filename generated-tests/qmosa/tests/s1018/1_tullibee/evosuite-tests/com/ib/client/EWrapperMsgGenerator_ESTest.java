/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:50:29 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EWrapperMsgGenerator.contractDetailsEnd((-1));
      EWrapperMsgGenerator.tickSnapshotEnd((-1));
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      EWrapperMsgGenerator.managedAccounts("id=-1 =============== end ===============");
      EWrapperMsgGenerator.updateAccountValue("Connected : The list of managed accounts are : [id=-1 =============== end ===============]", ",Udw^L8aq]dU*cuX", ",Udw^L8aq]dU*cuX", (String) null);
      EWrapperMsgGenerator.nextValidId((-1));
      EWrapperMsgGenerator.scannerParameters("");
      String string0 = "|t)_!IR(\"/vI$Y";
      Vector<String> vector0 = new Vector<String>(0);
      Contract contract0 = new Contract(1466, "", "*qtR|rN+EX9^Y", (String) null, 1.0, "SCANNER PARAMETERS:", "Next Valid Order ID: -1", "=!7=uh_$H", "|-%Nic", "|t)_!IR(\"/vI$Y", vector0, "Connected : The list of managed accounts are : [id=-1 =============== end ===============]", true, "", (String) null);
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-1), (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(2131);
      assertEquals("Next Valid Order ID: 2131", string0);
      
      String string1 = EWrapperMsgGenerator.execDetailsEnd(3);
      assertEquals("reqId = 3 =============== end ===============", string1);
      
      String string2 = EWrapperMsgGenerator.fundamentalData(3, "reqId = 3 =============== end ===============");
      assertEquals("id  = 3 len = 45\nreqId = 3 =============== end ===============", string2);
      
      String string3 = EWrapperMsgGenerator.orderStatus(2131, "Kc]PM9?!W%N/U> ", (-519), 3, (-4535.35599149037), (-519), (-519), (-330.5126473271), 0, "com.ib.client.UnderComp");
      assertEquals("order status: orderId=2131 clientId=0 permId=-519 status=Kc]PM9?!W%N/U>  filled=-519 remaining=3 avgFillPrice=-4535.35599149037 lastFillPrice=-330.5126473271 parent Id=-519 whyHeld=com.ib.client.UnderComp", string3);
      
      String string4 = EWrapperMsgGenerator.historicalData(1, "com.ib.client.UnderComp", 0, 3568.818271, (-4535.35599149037), (-1.0), 3, 2131, (-200.79652350896), false);
      assertEquals("id=1 date = com.ib.client.UnderComp open=0.0 high=3568.818271 low=-4535.35599149037 close=-1.0 volume=3 count=2131 WAP=-200.79652350896 hasGaps=false", string4);
      
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(3, "Next Valid Order ID: 2131", "", "", 0.0, "dW", "~W\"e8G0", "", "reqId = 3 =============== end ===============", "reqId = 3 =============== end ===============", vector0, "", true, "", "com.ib.client.Contract");
      ContractDetails contractDetails0 = new ContractDetails(contract0, "com.ib.client.UnderComp", "dW", (-1.0), "dW", "", 10, "", "Next Valid Order ID: 2131", "", "com.ib.client.Contract", "$WFk@GI;:", "&umZ{U`", "+", "$DvJ1v32");
      String string5 = EWrapperMsgGenerator.bondContractDetails(2131, contractDetails0);
      assertEquals("reqId = 2131 ===================================\n ---- Bond Contract Details begin ----\nsymbol = Next Valid Order ID: 2131\nsecType = \ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = \ncurrency = reqId = 3 =============== end ===============\nmarketName = com.ib.client.UnderComp\ntradingClass = dW\nconid = 3\nminTick = -1.0\norderTypes = dW\nvalidExchanges = \nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = \n ---- Bond Contract Details End ----\n", string5);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_localSymbol = "CH}j(T^R";
      ContractDetails contractDetails0 = new ContractDetails(contract0, "com.ib.client.Execution", " benchmark=", 0, "", "", 0, " | ", (String) null, "notes = ", "FdG?/", "M##xGUCzQN8.w4x", "CH}j(T^R", "FdG?/", (String) null);
      contractDetails0.m_summary = contract0;
      contractDetails0.m_issueDate = "t<V*=qj)V";
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = t<V*=qj)V\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = com.ib.client.Execution\ntradingClass =  benchmark=\nconid = 0\nminTick = 0.0\norderTypes = \nvalidExchanges = \nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName =  | \n ---- Bond Contract Details End ----\n", string0);
      
      String string1 = EWrapperMsgGenerator.fundamentalData(0, "");
      assertEquals("id  = 0 len = 0\n", string1);
      
      String string2 = EWrapperMsgGenerator.accountDownloadEnd("t<V*=qj)V");
      assertEquals("accountDownloadEnd: t<V*=qj)V", string2);
      
      String string3 = EWrapperMsgGenerator.scannerData(0, 330, contractDetails0, (String) null, (String) null, (String) null, "");
      assertEquals("id = 0 rank=330 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=CH}j(T^R marketName=com.ib.client.Execution tradingClass= benchmark= distance=null benchmark=null projection=null legsStr=", string3);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EWrapperMsgGenerator.currentTime(1000L);
      String string0 = EWrapperMsgGenerator.scannerDataEnd(110);
      assertEquals("id = 110 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.execDetailsEnd(110);
      assertEquals("reqId = 110 =============== end ===============", string1);
      
      EWrapperMsgGenerator.tickOptionComputation(110, 110, (-1176.079), 1291.6, 1000L, 110);
      String string2 = EWrapperMsgGenerator.currentTime(5001L);
      assertEquals("current time = 5001 (Jan 1, 1970 1:23:21 AM)", string2);
      
      String string3 = EWrapperMsgGenerator.historicalData(110, "id=110  unknown: vol = N/A delta = N/A", (-1176.079), 0.0, (-3874.5219171571), (-2020.0485164270112), 110, 110, (-1.0), true);
      assertEquals("id=110 date = id=110  unknown: vol = N/A delta = N/A open=-1176.079 high=0.0 low=-3874.5219171571 close=-2020.0485164270112 volume=110 count=110 WAP=-1.0 hasGaps=true", string3);
      
      String string4 = EWrapperMsgGenerator.tickOptionComputation(110, 265, (-3874.5219171571), 1234.706382, 1000L, 1000L);
      assertEquals("id=110  unknown: vol = N/A delta = N/A", string4);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string5 = EWrapperMsgGenerator.orderStatus((-1284), "iI.;gy", 0, (-2404), 1.0, 0, 102, (-2404), (-1681), "O");
      assertEquals("order status: orderId=-1284 clientId=-1681 permId=0 status=iI.;gy filled=0 remaining=-2404 avgFillPrice=1.0 lastFillPrice=-2404.0 parent Id=102 whyHeld=O", string5);
      
      String string6 = EWrapperMsgGenerator.tickSize(265, 110, 0);
      assertEquals("id=265  unknown=0", string6);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string7 = EWrapperMsgGenerator.contractDetails((-1549), contractDetails0);
      assertEquals("reqId = -1549 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string7);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, 0, 0, 0.0, 0);
      assertEquals("updateMktDepth: 0 0 0 0 0.0 0", string0);
      
      String string1 = EWrapperMsgGenerator.accountDownloadEnd("");
      assertEquals("accountDownloadEnd: ", string1);
      
      String string2 = EWrapperMsgGenerator.receiveFA(225, "`'(%q(7v6{y65q");
      assertEquals("FA: null `'(%q(7v6{y65q", string2);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(380, "Fsr7`k", "com.ib.client.OrderState", "1gi`9,3!u*#Wnps", 380, "Fsr7`k", "com.ib.client.Execution", "+R", "accountDownloadEnd: ", "accountDownloadEnd: ", vector0, "com.ib.client.Execution", false, "Fsr7`k", "");
      Execution execution0 = new Execution();
      String string3 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = Fsr7`k\nsecType = com.ib.client.OrderState\nexpiry = 1gi`9,3!u*#Wnps\nstrike = 380.0\nright = Fsr7`k\ncontractExchange = +R\ncurrency = accountDownloadEnd: \nlocalSymbol = accountDownloadEnd: \nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string3);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString((-1128), 10, "hf!>+");
      assertEquals("id=-1128  bidOptComp=hf!>+", string0);
      
      String string1 = EWrapperMsgGenerator.historicalData((-1128), (String) null, (-1128), (-1128), 0.0, 1.0, 0, (-1592), 0.0, true);
      assertEquals("id=-1128 date = null open=-1128.0 high=-1128.0 low=0.0 close=1.0 volume=0 count=-1592 WAP=0.0 hasGaps=true", string1);
      
      String string2 = EWrapperMsgGenerator.nextValidId(986);
      assertEquals("Next Valid Order ID: 986", string2);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string3 = EWrapperMsgGenerator.execDetailsEnd((-1128));
      assertEquals("reqId = -1128 =============== end ===============", string3);
      
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, "", 10, "mCk.\u0002X:jy(", "id=-1128 date = null open=-1128.0 high=-1128.0 low=0.0 close=1.0 volume=0 count=-1592 WAP=0.0 hasGaps=true", (-1128), "hf!>+", ":q", (String) null, (String) null, "", (String) null, (String) null, (String) null);
      String string4 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = \nconid = 0\nminTick = 10.0\norderTypes = mCk.\u0002X:jy(\nvalidExchanges = id=-1128 date = null open=-1128.0 high=-1128.0 low=0.0 close=1.0 volume=0 count=-1592 WAP=0.0 hasGaps=true\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = hf!>+\n ---- Bond Contract Details End ----\n", string4);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize((-3547), 0, 2275);
      assertEquals("id=-3547  bidSize=2275", string0);
      
      String string1 = EWrapperMsgGenerator.receiveFA(2275, "id=-3547  bidSize=2275");
      assertEquals("FA: null id=-3547  bidSize=2275", string1);
      
      String string2 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string2);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-3547), "id = 0 =============== end ===============", "com.ib.client.OrderState", "id = 0 =============== end ===============", 0, "com.ib.client.AnyWrapperMsgGenerator", "FA: null id=-3547  bidSize=2275", "id = 0 =============== end ===============", "}", "id = 0 =============== end ===============", vector0, "", false, "QGbn?Pfi-ey1r", "Lu0i4M(| k:t~UO[");
      contract0.m_conId = 0;
      Execution execution0 = new Execution();
      String string3 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = id = 0 =============== end ===============\nsecType = com.ib.client.OrderState\nexpiry = id = 0 =============== end ===============\nstrike = 0.0\nright = com.ib.client.AnyWrapperMsgGenerator\ncontractExchange = id = 0 =============== end ===============\ncurrency = }\nlocalSymbol = id = 0 =============== end ===============\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string3);
      
      String string4 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string4);
      
      String string5 = EWrapperMsgGenerator.orderStatus(0, (String) null, (-2334), (-423), 0, (-1222), 0, 1.7976931348623157E308, 0, "id=-3547  bidSize=2275");
      assertEquals("order status: orderId=0 clientId=0 permId=-1222 status=null filled=-2334 remaining=-423 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=id=-3547  bidSize=2275", string5);
      
      String string6 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string6);
      
      String string7 = EWrapperMsgGenerator.tickPrice(0, (-1786), 0, 0);
      assertEquals("id=0  unknown=0.0  noAutoExecute", string7);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1940), (-1360L), (-992.4), 0.0, (-1360L), (-658.489165787), (-1360L), 0.0, (-1940));
      assertEquals("id=-1940 time = -1360 open=-992.4 high=0.0 low=-1360.0 close=-658.489165787 volume=-1360 count=-1940 WAP=0.0", string0);
      
      String string1 = EWrapperMsgGenerator.currentTime((-1360L));
      assertEquals("current time = -1360 (Dec 31, 1969 11:37:20 PM)", string1);
      
      String string2 = EWrapperMsgGenerator.contractDetailsEnd((-779));
      assertEquals("reqId = -779 =============== end ===============", string2);
      
      String string3 = EWrapperMsgGenerator.scannerDataEnd((-34));
      assertEquals("id = -34 =============== end ===============", string3);
      
      String string4 = EWrapperMsgGenerator.historicalData((-34), "id = -34 =============== end ===============", (-784.93), (-1360L), 1015.3662815054593, 0.0, (-34), (-779), (-1.0), true);
      assertEquals("id=-34 date = id = -34 =============== end =============== open=-784.93 high=-1360.0 low=1015.3662815054593 close=0.0 volume=-34 count=-779 WAP=-1.0 hasGaps=true", string4);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EWrapperMsgGenerator.tickSize((-514), 0, (-91));
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_sweepToFill = false;
      order0.m_totalQuantity = 0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(13, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1623, "[X*5cO:[M)]cH", 0, (-231), 0.0, 0, 10, 0.0, 95, "[X*5cO:[M)]cH");
      assertEquals("order status: orderId=1623 clientId=95 permId=0 status=[X*5cO:[M)]cH filled=0 remaining=-231 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=10 whyHeld=[X*5cO:[M)]cH", string0);
      
      String string1 = EWrapperMsgGenerator.realtimeBar(0, 0, 95, 0.0, 0.0, (-231), 0L, 0.0, 10);
      assertEquals("id=0 time = 0 open=95.0 high=0.0 low=0.0 close=-231.0 volume=0 count=10 WAP=0.0", string1);
      
      String string2 = EWrapperMsgGenerator.tickPrice(95, 10, 1623, 10);
      assertEquals("id=95  bidOptComp=1623.0  canAutoExecute", string2);
      
      String string3 = EWrapperMsgGenerator.tickEFP(3, 0, 95, "=8&%CQ", 10, 0, "[X*5cO:[M)]cH", (-231), 3);
      assertEquals("id=3  bidSize: basisPoints = 95.0/=8&%CQ impliedFuture = 10.0 holdDays = 0 futureExpiry = [X*5cO:[M)]cH dividendImpact = -231.0 dividends to expiry = 3.0", string3);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(0, 0, 0, 0, 1.0, 1.0, 287L, 0.0, 0);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=1.0 close=1.0 volume=287 count=0 WAP=0.0", string0);
      
      String string1 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string1);
      
      String string2 = EWrapperMsgGenerator.tickGeneric((-1), 1418, 1.0);
      assertEquals("id=-1  unknown=1.0", string2);
      
      String string3 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string3);
      
      String string4 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string4);
      
      String string5 = EWrapperMsgGenerator.managedAccounts("SCANNER PARAMETERS:\n");
      assertEquals("Connected : The list of managed accounts are : [SCANNER PARAMETERS:\n]", string5);
      
      String string6 = EWrapperMsgGenerator.tickOptionComputation(0, 0, (-1), 1418, (-2115.5518), 1.0);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string6);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("%19W]IG5VajG!");
      assertEquals("Connected : The list of managed accounts are : [%19W]IG5VajG!]", string0);
      
      String string1 = EWrapperMsgGenerator.updateMktDepthL2((-2766), (-2766), "Connected : The list of managed accounts are : [%19W]IG5VajG!]", 0, 0, 1.0, 0);
      assertEquals("updateMktDepth: -2766 -2766 Connected : The list of managed accounts are : [%19W]IG5VajG!] 0 0 1.0 0", string1);
      
      String string2 = EWrapperMsgGenerator.execDetailsEnd(2537);
      assertEquals("reqId = 2537 =============== end ===============", string2);
      
      EWrapperMsgGenerator.realtimeBar(0, 2537, 0.0, 2537, (-2766), 0.0, 1L, 2537, 2537);
      String string3 = EWrapperMsgGenerator.currentTime(3257L);
      assertEquals("current time = 3257 (Jan 1, 1970 12:54:17 AM)", string3);
      
      String string4 = EWrapperMsgGenerator.accountDownloadEnd("");
      assertEquals("accountDownloadEnd: ", string4);
      
      String string5 = EWrapperMsgGenerator.realtimeBar(2537, (-1L), 2537, 1965.17, (-1.0), 3257L, 1L, (-1.0), 0);
      assertEquals("id=2537 time = -1 open=2537.0 high=1965.17 low=-1.0 close=3257.0 volume=1 count=0 WAP=-1.0", string5);
      
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "%19W]IG5VajG!", (String) null, 1L, "current time = 3257 (Jan 1, 1970 12:54:17 AM)", "&uO&DOuS;|[}1", 806, "\"'&z{CURGW", (String) null, (String) null, "LLt!Ja|", "", "", " projection=", "reqId = 2537 =============== end ===============");
      String string6 = EWrapperMsgGenerator.contractDetails(806, contractDetails0);
      assertEquals("reqId = 806 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = %19W]IG5VajG!\ntradingClass = null\nminTick = 1.0\nprice magnifier = 0\norderTypes = current time = 3257 (Jan 1, 1970 12:54:17 AM)\nvalidExchanges = &uO&DOuS;|[}1\nunderConId = 806\nlongName = \"'&z{CURGW\ncontractMonth = null\nindustry = null\ncategory = LLt!Ja|\nsubcategory = \ntimeZoneId = \ntradingHours =  projection=\nliquidHours = reqId = 2537 =============== end ===============\n ---- Contract Details End ----\n", string6);
      
      String string7 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string7);
      
      String string8 = EWrapperMsgGenerator.orderStatus((-2766), "\"'&z{CURGW", 0, 0, 1.7976931348623157E308, 0, (-2049), 0.0, (-1), "reqId = 806 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = %19W]IG5VajG!\ntradingClass = null\nminTick = 1.0\nprice magnifier = 0\norderTypes = current time = 3257 (Jan 1, 1970 12:54:17 AM)\nvalidExchanges = &uO&DOuS;|[}1\nunderConId = 806\nlongName = \"'&z{CURGW\ncontractMonth = null\nindustry = null\ncategory = LLt!Ja|\nsubcategory = \ntimeZoneId = \ntradingHours =  projection=\nliquidHours = reqId = 2537 =============== end ===============\n ---- Contract Details End ----\n");
      assertEquals("order status: orderId=-2766 clientId=-1 permId=0 status=\"'&z{CURGW filled=0 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=-2049 whyHeld=reqId = 806 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = %19W]IG5VajG!\ntradingClass = null\nminTick = 1.0\nprice magnifier = 0\norderTypes = current time = 3257 (Jan 1, 1970 12:54:17 AM)\nvalidExchanges = &uO&DOuS;|[}1\nunderConId = 806\nlongName = \"'&z{CURGW\ncontractMonth = null\nindustry = null\ncategory = LLt!Ja|\nsubcategory = \ntimeZoneId = \ntradingHours =  projection=\nliquidHours = reqId = 2537 =============== end ===============\n ---- Contract Details End ----\n", string8);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EWrapperMsgGenerator.orderStatus(2160, "Z)I,FB^?kpN(I", 2160, 2160, 2160, 2160, 2160, 2160, 2160, "");
      EWrapperMsgGenerator.openOrderEnd();
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(1, " =============== end ===============", "order status: orderId=2160 clientId=2160 permId=2160 status=Z)I,FB^?kpN(I filled=2160 remaining=2160 avgFillPrice=2160.0 lastFillPrice=2160.0 parent Id=2160 whyHeld=", "tO", (-2691.0528842), "Z)I,FB^?kpN(I", "", " =============== end ===============", " =============== end ===============", "order status: orderId=2160 clientId=2160 permId=2160 status=Z)I,FB^?kpN(I filled=2160 remaining=2160 avgFillPrice=2160.0 lastFillPrice=2160.0 parent Id=2160 whyHeld=", vector0, "_SHt?rizA", true, "W[", ".|~L");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      EWrapperMsgGenerator.managedAccounts("com.ib.client.OrderState");
      EWrapperMsgGenerator.tickPrice(0, 0, (-1926.239972), 0);
      EWrapperMsgGenerator.tickPrice(0, 0, (-2345.8730844816573), 2160);
      EWrapperMsgGenerator.openOrderEnd();
      EWrapperMsgGenerator.fundamentalData(2, "Gh>8N-ki>/=C(O");
      EWrapperMsgGenerator.nextValidId(1);
      ContractDetails contractDetails0 = new ContractDetails(contract0, "TgUH, td3", "", 0.0, "", "tO", Integer.MAX_VALUE, "tO", "Next Valid Order ID: 1", (String) null, " =============== end ===============", "", "", "id=0  bidSize=-2345.8730844816573  canAutoExecute", "Connected : The list of managed accounts are : [com.ib.client.OrderState]");
      String string1 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(3087);
      assertEquals("id = 3087 =============== end ===============", string0);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(3087, "id  = ", "[(c4B8Om", "BOND", 3087, "J{G2n<", "Vr7hD!IW", "J{G2n<", "id = 3087 =============== end ===============", (String) null, vector0, "3", true, "[(c4B8Om", "BOND");
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 3087, 3087, 3087.0, (-409.00644858), 0.0, 3087, "id  = ");
      assertEquals("updatePortfolio: conid = 3087\nsymbol = id  = \nsecType = [(c4B8Om\nexpiry = BOND\nstrike = 3087.0\nright = J{G2n<\nmultiplier = Vr7hD!IW\nexchange = J{G2n<\nprimaryExch = 3\ncurrency = id = 3087 =============== end ===============\nlocalSymbol = null\n3087 3087.0 3087.0 -409.00644858 0.0 3087.0 id  = ", string1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric((-898), 2146359239, 1.0);
      assertEquals("id=-898  unknown=1.0", string0);
      
      String string1 = EWrapperMsgGenerator.updateMktDepthL2(2146359239, (-898), "id=-898  unknown=1.0", (-266), 2146359239, (-898), (-266));
      assertEquals("updateMktDepth: 2146359239 -898 id=-898  unknown=1.0 -266 2146359239 -898.0 -266", string1);
      
      String string2 = EWrapperMsgGenerator.scannerParameters("+4G[${l(wT;)I");
      assertEquals("SCANNER PARAMETERS:\n+4G[${l(wT;)I", string2);
      
      String string3 = EWrapperMsgGenerator.managedAccounts("updateMktDepth: 2146359239 -898 id=-898  unknown=1.0 -266 2146359239 -898.0 -266");
      assertEquals("Connected : The list of managed accounts are : [updateMktDepth: 2146359239 -898 id=-898  unknown=1.0 -266 2146359239 -898.0 -266]", string3);
      
      String string4 = EWrapperMsgGenerator.tickOptionComputation((-898), 2582, 1.7976931348623157E308, 2146359239, 0.0, (-266));
      assertEquals("id=-898  unknown: vol = N/A delta = N/A", string4);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EWrapperMsgGenerator.realtimeBar(2145567190, 2145567190, 1556.4964, 1.7976931348623157E308, 0.0, 1, (-3197L), 0.0, 2146600028);
      EWrapperMsgGenerator.tickSnapshotEnd((-999));
      EWrapperMsgGenerator.tickGeneric(1, (-1), 1363.0);
      EWrapperMsgGenerator.scannerDataEnd(2145567190);
      EWrapperMsgGenerator.scannerParameters("id = 2145567190 =============== end ===============");
      EWrapperMsgGenerator.managedAccounts("id = 2145567190 =============== end ===============");
      EWrapperMsgGenerator.tickOptionComputation((-1341), (-1341), 1.7976931348623157E308, (-4382.1), 1.7976931348623157E308, 0);
      EWrapperMsgGenerator.updateNewsBulletin(4372, 2146600028, "_Hf22T1^*3v_;vk", (String) null);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-1945L));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EWrapperMsgGenerator.realtimeBar(0, 0, 0, 0, 1.0, 1.0, 287L, 0.0, 0);
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      EWrapperMsgGenerator.tickOptionComputation(0, 13, 287L, 1843.235453746, (-1322.89654000583), (-460.0));
      System.setCurrentTimeMillis((-312));
      Contract contract0 = new Contract();
      Order order0 = new Order();
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
  //Test case number: 17
  /*Coverage entropy=0.9743147528693494
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      EWrapperMsgGenerator.tickOptionComputation(13, 15, 92.8616069830006, (-2695.621237), (-2695.621237), (-1));
      System.setCurrentTimeMillis(13);
      Contract contract0 = new Contract();
      Vector<Object> vector1 = new Vector<Object>();
      contract0.m_comboLegs = vector1;
      Order order0 = new Order();
      order0.m_algoStrategy = "id=13  13WeekLow: vol = 92.8616069830006 delta = N/A";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1, contract0, order0, (OrderState) null);
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
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EWrapperMsgGenerator.realtimeBar((-1), 0L, (-1), 0.0, (-1), (-141.656), 0, 1.0, 10);
      EWrapperMsgGenerator.tickSnapshotEnd((-294));
      EWrapperMsgGenerator.tickOptionComputation((-1), 13, (-1), 0L, (-998.8717506863253), 1843.235453746);
      System.setCurrentTimeMillis(623L);
      Contract contract0 = new Contract();
      Order order0 = new Order();
      Order order1 = new Order();
      order1.m_volatility = 0.0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder((-1438480650), contract0, order1, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      EWrapperMsgGenerator.tickSnapshotEnd((-277));
      EWrapperMsgGenerator.tickOptionComputation(11, 13, (-3321.7452494460836), 11, 10, 1.0);
      System.setCurrentTimeMillis(0L);
      Contract contract0 = new Contract();
      Order order0 = new Order();
      Order order1 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order1, (OrderState) null);
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
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(13, 15, 92.08961077639006, (-2695.621237), (-2695.621237), (-1));
      assertEquals("id=13  13WeekLow: vol = 92.08961077639006 delta = N/A", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(33, 13, 3683.4842, 0.0, 0, 33);
      assertEquals("id=33  modelOptComp: vol = 3683.4842 delta = 0.0: modelPrice = 0.0: pvDividend = 33.0", string2);
      
      System.setCurrentTimeMillis(15);
      Order order0 = new Order();
      System.setCurrentTimeMillis(3);
      String string3 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, 1.7976931348623157E308, (-881.42));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string3);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1), 13, (-1), 0L, (-998.8717506863253), 1.7976931348623157E308);
      assertEquals("id=-1  modelOptComp: vol = N/A delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
      
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.tickOptionComputation((-1), 0, 623L, 1.0, 28.31814169128328, 556.0289027601713);
      String string1 = EWrapperMsgGenerator.tickOptionComputation(1746, 0, 1.0, 1100.731669, 556.0289027601713, 623L);
      assertEquals("id=1746  bidSize: vol = 1.0 delta = N/A", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(0, 6272, 1.7976931348623157E308, 1.0, 1746, 2698.5);
      assertEquals("id=0  unknown: vol = N/A delta = 1.0", string2);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9556998911125343
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      EWrapperMsgGenerator.tickOptionComputation(13, 15, 92.8616069830006, (-2695.621237), (-2695.621237), (-1));
      System.setCurrentTimeMillis(13);
      Contract contract0 = new Contract();
      Vector<Object> vector0 = new Vector<Object>();
      Order order0 = new Order();
      contract0.m_secType = "|i";
      contract0.m_multiplier = "_uM(A3";
      order0.m_algoStrategy = "id=13  13WeekLow: vol = 92.8616069830006 delta = N/A";
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("id=11  modelOptComp: vol = 10.0 delta = N/A: modelPrice = 10.0: pvDividend = 1.0");
      Order order0 = new Order();
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
      Order order1 = new Order();
      OrderState orderState0 = new OrderState((String) null, "Z1:j14", (String) null, "@QV-J#JMfA.TpvIn~", 1.0, Integer.MAX_VALUE, (-371.5469676705), "$", "f,");
      Contract contract0 = new Contract(0, ")G", "askSize", ")G", (-1.0), "[(c4B8Om", "", (String) null, "$", (String) null, (Vector) null, "}", true, "8gLqj\"W", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      System.setCurrentTimeMillis(968L);
      Contract contract1 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", "O", 1122.12256, "O4L8", "(:>NIN!k", "Z1:j14", "[(c4B8Om", (String) null, (Vector) null, string0, true, "RStKfW{tSx", (String) null);
      Order order2 = new Order();
      String string1 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract1, order2, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Order order0 = new Order();
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
      Order order1 = new Order();
      OrderState orderState0 = new OrderState((String) null, "Z1:j14", (String) null, "@QV-J#JMfA.TpvIn~", 1.0, Integer.MAX_VALUE, (-371.5469676705), "$", "f,");
      Contract contract0 = new Contract(0, ")G", "askSize", ")G", (-1.0), "[(c4B8Om", "", (String) null, "$", (String) null, (Vector) null, "}", true, "8gLqj\"W", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      contract0.m_conId = 1769;
      Contract contract1 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", "O", 1122.12256, "O4L8", "}", "Z1:j14", "[(c4B8Om", (String) null, (Vector) null, string0, true, "RStKfW{tSx", (String) null);
      contract1.m_comboLegsDescrip = "$";
      Order order2 = new Order();
      String string1 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract1, order2, orderState0);
      assertFalse(string1.equals((Object)string0));
  }
}