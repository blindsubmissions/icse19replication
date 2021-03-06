/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 10:50:25 GMT 2018
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
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(":jDd>J\u0007]");
      assertEquals("Connected : The list of managed accounts are : [:jDd>J\u0007]]", string0);
      
      String string1 = EWrapperMsgGenerator.contractDetailsEnd((-1019));
      assertEquals("reqId = -1019 =============== end ===============", string1);
      
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_notes = "O";
      contractDetails0.m_underConId = 3;
      String string2 = EWrapperMsgGenerator.contractDetails(3, contractDetails0);
      assertEquals("reqId = 3 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 3\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string2);
      
      String string3 = EWrapperMsgGenerator.tickSize(3542, 1574, 1478);
      assertEquals("id=3542  unknown=1478", string3);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("Connection Closed");
      assertEquals("Connected : The list of managed accounts are : [Connection Closed]", string0);
      
      String string1 = EWrapperMsgGenerator.realtimeBar(0, 0, 0, 0, 0.0, 0.0, 0, 0, 0);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=0.0", string1);
      
      String string2 = EWrapperMsgGenerator.receiveFA(0, "Connection Closed");
      assertEquals("FA: null Connection Closed", string2);
      
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "", "Connected : The list of managed accounts are : [Connection Closed]", 0, "t8Q|sTZ[]~u`62", " trailStopPrice=", 0, "com.ib.client.UnderComp", (String) null, "Fy)?2sfb3pZq@?=v/UF", "nextOptionDate = ", " stockRangeLower=", (String) null, "Connection Closed", (String) null);
      String string3 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = \ntradingClass = Connected : The list of managed accounts are : [Connection Closed]\nconid = 0\nminTick = 0.0\norderTypes = t8Q|sTZ[]~u`62\nvalidExchanges =  trailStopPrice=\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = com.ib.client.UnderComp\n ---- Bond Contract Details End ----\n", string3);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      Contract contract0 = new Contract();
      Vector<Object> vector0 = new Vector<Object>();
      contract0.m_comboLegs = vector0;
      contract0.m_comboLegsDescrip = "com.ib.client.Order";
      EWrapperMsgGenerator.contractMsg(contract0);
      vector0.removeAllElements();
      vector0.ensureCapacity((-1));
      EWrapperMsgGenerator.updateMktDepth((-505), (-1), 0, 0, 0.0, 1133);
      double double0 = 1.0;
      int int0 = 0;
      EWrapperMsgGenerator.historicalData(1133, (String) null, (-505), 0.0, 1.0, 0, 63, 0, (-2127.0924744172), false);
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
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EWrapperMsgGenerator.updateAccountTime(" | ");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState(" deltaNeutralOrderType=", "", ";eo", "", (-1.0), 0.0, 1327.145070595846, "", (String) null);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, (Contract) null, order0, orderState0);
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
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("");
      assertEquals("updateAccountTime: ", string0);
      
      String string1 = EWrapperMsgGenerator.updateNewsBulletin((-1139), 110, (String) null, "");
      assertEquals("MsgId=-1139 :: MsgType=110 :: Origin= :: Message=null", string1);
      
      String string2 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string2);
      
      String string3 = EWrapperMsgGenerator.scannerParameters("updateAccountTime: ");
      assertEquals("SCANNER PARAMETERS:\nupdateAccountTime: ", string3);
      
      String string4 = EWrapperMsgGenerator.updateNewsBulletin((-1), 0, "", "updateAccountTime: ");
      assertEquals("MsgId=-1 :: MsgType=0 :: Origin=updateAccountTime:  :: Message=", string4);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5649493574615376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-1436), "currency = ");
      assertEquals("id  = -1436 len = 11\ncurrency = ", string0);
      
      String string1 = EWrapperMsgGenerator.tickPrice((-1436), (-1436), 1.7976931348623157E308, (-1436));
      assertEquals("id=-1436  unknown=1.7976931348623157E308  canAutoExecute", string1);
      
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_nextOptionDate = "!";
      contractDetails0.m_timeZoneId = "id=-1436  unknown=1.7976931348623157E308  canAutoExecute";
      String string2 = EWrapperMsgGenerator.bondContractDetails((-1436), contractDetails0);
      assertEquals("reqId = -1436 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = !\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string2);
      
      String string3 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 0, 0, 0.0, 1075);
      assertEquals("updateMktDepth: 0 0 null 0 0 0.0 1075", string3);
      
      String string4 = EWrapperMsgGenerator.tickString((-2331), (-1485), (String) null);
      assertEquals("id=-2331  unknown=null", string4);
      
      String string5 = EWrapperMsgGenerator.tickOptionComputation(0, (-1485), 0.0, 1075, (-779.978211), 0.0);
      assertEquals("id=0  unknown: vol = 0.0 delta = N/A", string5);
      
      String string6 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string6);
      
      String string7 = EWrapperMsgGenerator.contractMsg(contractDetails0.m_summary);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string7);
      
      String string8 = EWrapperMsgGenerator.currentTime(0);
      assertEquals("current time = 0 (Jan 1, 1970 12:00:00 AM)", string8);
      
      EWrapperMsgGenerator.managedAccounts((String) null);
      String string9 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string9);
      
      EWrapperMsgGenerator.accountDownloadEnd("id=-1436  unknown=1.7976931348623157E308  canAutoExecute");
      String string10 = EWrapperMsgGenerator.realtimeBar(228, 1257L, 1257L, 1.0, 0.0, 1257L, 1L, 0.0, 0);
      assertEquals("id=228 time = 1257 open=1257.0 high=1.0 low=0.0 close=1257.0 volume=1 count=0 WAP=0.0", string10);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      EWrapperMsgGenerator.receiveFA(0, "id=0 =============== end ===============");
      EWrapperMsgGenerator.tickGeneric(0, 0, (-992.7748331));
      String string0 = "";
      EWrapperMsgGenerator.scannerParameters("");
      EWrapperMsgGenerator.realtimeBar(3, (-995L), 443.4139866898, (-992.7748331), (-995L), 0, 0L, (-992.7748331), 1991);
      EWrapperMsgGenerator.tickSnapshotEnd(0);
      EWrapperMsgGenerator.receiveFA(0, "oshx1`RVi{'Mi");
      Contract contract0 = new Contract();
      UnderComp underComp0 = contract0.m_underComp;
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
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-396));
      assertEquals("id=-396 =============== end ===============", string0);
      
      Contract contract0 = new Contract();
      contract0.m_includeExpired = true;
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, "d8^fSsPhi|G}eu", 0.0, " faGroup=", (String) null, (-1), "`@%%3Uv", "", (String) null, (String) null, " equityWithLoan=", " goodAfterTime=", " faGroup=", "right = ");
      contractDetails0.m_notes = "OgvV#D6KSAn1TP";
      contractDetails0.m_liquidHours = "G#=&8Q8%)hDx:0";
      String string1 = EWrapperMsgGenerator.bondContractDetails((-922), contractDetails0);
      assertEquals("reqId = -922 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = d8^fSsPhi|G}eu\nconid = 0\nminTick = 0.0\norderTypes =  faGroup=\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = OgvV#D6KSAn1TP\nlongName = `@%%3Uv\n ---- Bond Contract Details End ----\n", string1);
      
      contractDetails0.m_priceMagnifier = (-922);
      contractDetails0.m_nextOptionType = null;
      String string2 = EWrapperMsgGenerator.updateAccountValue((String) null, "d8^fSsPhi|G}eu", (String) null, "");
      assertEquals("updateAccountValue: null d8^fSsPhi|G}eu null ", string2);
      
      String string3 = EWrapperMsgGenerator.nextValidId((-396));
      assertEquals("Next Valid Order ID: -396", string3);
      
      String string4 = EWrapperMsgGenerator.historicalData((-1002), (String) null, 0.0, (-922), 0.0, 1.7976931348623157E308, (-1166), 0, 0.0, false);
      assertEquals("id=-1002 date = null open=0.0 high=-922.0 low=0.0 close=1.7976931348623157E308 volume=-1166 count=0 WAP=0.0 hasGaps=false", string4);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EWrapperMsgGenerator.openOrderEnd();
      EWrapperMsgGenerator.updateAccountTime(" =============== end ===============");
      EWrapperMsgGenerator.accountDownloadEnd("");
      int int0 = 126;
      Contract contract0 = new Contract();
      contract0.m_expiry = "accountDownloadEnd: ";
      ContractDetails contractDetails0 = new ContractDetails(contract0, "", "NB4NOz2E|w1sB5_&x", 1.7976931348623157E308, "", "r{Apw=7gE$>621PZzR3", 0, "", "", "[", (String) null, "", "pM#qACc", " ===================================\n", "");
      EWrapperMsgGenerator.bondContractDetails(126, contractDetails0);
      EWrapperMsgGenerator.updateAccountTime(" ===================================\n");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(0, (-988), (ContractDetails) null, " =============== end ===============", "updateAccountTime:  =============== end ===============", "", (String) null);
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
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-246), (-1790), "v|9XS9x", "v|9XS9x");
      assertEquals("MsgId=-246 :: MsgType=-1790 :: Origin=v|9XS9x :: Message=v|9XS9x", string0);
      
      String string1 = EWrapperMsgGenerator.scannerParameters("v|9XS9x");
      assertEquals("SCANNER PARAMETERS:\nv|9XS9x", string1);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string2 = EWrapperMsgGenerator.tickString((-246), (-1790), "FA:");
      assertEquals("id=-246  unknown=FA:", string2);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(978, 978, (-1));
      assertEquals("id=978  unknown=-1", string0);
      
      String string1 = EWrapperMsgGenerator.updateNewsBulletin((-1), 98, "id=978  unknown=-1", "com.ib.client.TagValue");
      assertEquals("MsgId=-1 :: MsgType=98 :: Origin=com.ib.client.TagValue :: Message=id=978  unknown=-1", string1);
      
      String string2 = EWrapperMsgGenerator.updateMktDepth(978, (-1), (-1), 13, 978, 103);
      assertEquals("updateMktDepth: 978 -1 -1 13 978.0 103", string2);
      
      UnderComp underComp0 = new UnderComp();
      String string3 = EWrapperMsgGenerator.deltaNeutralValidation(103, underComp0);
      assertEquals("id = 103 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string3);
      
      String string4 = EWrapperMsgGenerator.tickOptionComputation(103, 567, 1.7976931348623157E308, 0.0, (-1.0), (-1.0));
      assertEquals("id=103  unknown: vol = N/A delta = 0.0", string4);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      int int0 = 0;
      EWrapperMsgGenerator.tickPrice(0, 0, (-700.782867), 897);
      EWrapperMsgGenerator.tickPrice(0, 0, 0, 0);
      EWrapperMsgGenerator.tickSize(0, 0, 0);
      EWrapperMsgGenerator.currentTime((-1L));
      double double0 = 0.0;
      EWrapperMsgGenerator.historicalData(0, "sL|R", 315.7534376241267, 0, (-181.802), 0, (-998), (-998), 0.0, false);
      EWrapperMsgGenerator.fundamentalData((-998), "current time = -1 (Dec 31, 1969 11:59:59 PM)");
      EWrapperMsgGenerator.receiveFA((-998), "FA:");
      EWrapperMsgGenerator.accountDownloadEnd("id=0  bidSize=0");
      Contract contract0 = new Contract();
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-1062), (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      EWrapperMsgGenerator.scannerData(3, 0, contractDetails0, "+$8y0pNSg jErQE2Y", (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.realtimeBar((-1), 0L, 1.7976931348623157E308, 0.0, 572.7838026, 1.7976931348623157E308, 4536L, (-1.0), 0);
      assertEquals("id=-1 time = 0 open=1.7976931348623157E308 high=0.0 low=572.7838026 close=1.7976931348623157E308 volume=4536 count=0 WAP=-1.0", string0);
      
      String string1 = EWrapperMsgGenerator.scannerDataEnd(1732);
      assertEquals("id = 1732 =============== end ===============", string1);
      
      String string2 = EWrapperMsgGenerator.updateMktDepth(0, 0, (-1379), 0, 757.780532, 2507);
      assertEquals("updateMktDepth: 0 0 -1379 0 757.780532 2507", string2);
      
      String string3 = EWrapperMsgGenerator.tickString(0, 3001, "id=-1 time = 0 open=1.7976931348623157E308 high=0.0 low=572.7838026 close=1.7976931348623157E308 volume=4536 count=0 WAP=-1.0");
      assertEquals("id=0  unknown=id=-1 time = 0 open=1.7976931348623157E308 high=0.0 low=572.7838026 close=1.7976931348623157E308 volume=4536 count=0 WAP=-1.0", string3);
      
      String string4 = EWrapperMsgGenerator.scannerData(0, 1686, contractDetails0, (String) null, "_O-|57Bml.T0vm'BD", "id=0  unknown=id=-1 time = 0 open=1.7976931348623157E308 high=0.0 low=572.7838026 close=1.7976931348623157E308 volume=4536 count=0 WAP=-1.0", "");
      assertEquals("id = 0 rank=1686 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=_O-|57Bml.T0vm'BD projection=id=0  unknown=id=-1 time = 0 open=1.7976931348623157E308 high=0.0 low=572.7838026 close=1.7976931348623157E308 volume=4536 count=0 WAP=-1.0 legsStr=", string4);
      
      Execution execution0 = new Execution(0, 2507, (String) null, (String) null, "", "", "pit]G)]", 909, (-1379), (-1), 3001, (-1), (-1652.946864));
      String string5 = EWrapperMsgGenerator.execDetails((-1701), contractDetails0.m_summary, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1701\norderId = 0\nclientId = 2507\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = \nexecutionExchange = \nside = pit]G)]\nshares = 909\nprice = -1379.0\npermId = -1\nliquidation = 3001\ncumQty = -1\navgPrice = -1652.946864\n ---- Execution Details end ----\n", string5);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 0;
      int int1 = 2804;
      EWrapperMsgGenerator.tickOptionComputation(0, 2804, 0, (-2408.571), 2804, 0);
      EWrapperMsgGenerator.orderStatus(2804, ": vol = ", 2804, 0, (-2408.571), 3, 102, (-2408.571), 3, (String) null);
      EWrapperMsgGenerator.openOrderEnd();
      EWrapperMsgGenerator.historicalData((-350), (String) null, (-2408.571), 0.0, (-350), 0.0, 0, 1561, 1.7976931348623157E308, false);
      int int2 = (-229);
      Contract contract0 = null;
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails((-229), (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.3025850929940455
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-3212), (-3212), ".o>~Wa(hO7D8Bo;4", "");
      assertEquals("MsgId=-3212 :: MsgType=-3212 :: Origin= :: Message=.o>~Wa(hO7D8Bo;4", string0);
      
      String string1 = EWrapperMsgGenerator.receiveFA(102, "$xUc?>0?HR");
      assertEquals("FA: null $xUc?>0?HR", string1);
      
      String string2 = EWrapperMsgGenerator.tickSize(0, 0, 0);
      assertEquals("id=0  bidSize=0", string2);
      
      EWrapperMsgGenerator.updateNewsBulletin(0, 0, "FA: null $xUc?>0?HR", "id=0  bidSize=0");
      Contract contract0 = new Contract();
      contract0.m_right = "$xUc?>0?HR";
      contract0.m_primaryExch = "_";
      String string3 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (-3212), 0.0, (-1688.0), 1571.12, 2943.409259, "com.ib.client.OrderState");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = $xUc?>0?HR\nmultiplier = null\nexchange = null\nprimaryExch = _\ncurrency = null\nlocalSymbol = null\n0 -3212.0 0.0 -1688.0 1571.12 2943.409259 com.ib.client.OrderState", string3);
      
      String string4 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string4);
      
      String string5 = EWrapperMsgGenerator.fundamentalData(0, "com.ib.client.OrderState");
      assertEquals("id  = 0 len = 24\ncom.ib.client.OrderState", string5);
      
      String string6 = EWrapperMsgGenerator.fundamentalData((-5359), "\"M~Nes61sX/@1g?NWUL");
      assertEquals("id  = -5359 len = 19\n\"M~Nes61sX/@1g?NWUL", string6);
      
      String string7 = EWrapperMsgGenerator.tickPrice(0, 0, 3496.759081143, (-3409));
      assertEquals("id=0  bidSize=3496.759081143  canAutoExecute", string7);
      
      String string8 = EWrapperMsgGenerator.tickGeneric(0, 0, (-5359));
      assertEquals("id=0  bidSize=-5359.0", string8);
      
      String string9 = EWrapperMsgGenerator.updateMktDepth(0, 0, 0, 2753, 1.0, 102);
      assertEquals("updateMktDepth: 0 0 0 2753 1.0 102", string9);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EWrapperMsgGenerator.currentTime(266L);
      EWrapperMsgGenerator.execDetailsEnd((-3050));
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.contractMsg(contract0);
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      EWrapperMsgGenerator.updateMktDepth((-3050), (-3050), 0, 0, 0.0, 0);
      Contract contract1 = new Contract();
      Order order0 = new Order();
      order0.m_triggerMethod = 0;
      OrderState orderState0 = new OrderState();
      orderState0.m_minCommission = 1.0;
      String string1 = EWrapperMsgGenerator.openOrder((-2674), contract1, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
      
      UnderComp underComp0 = new UnderComp();
      OrderState orderState0 = new OrderState();
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(2042, (String) null, "", "x=~<TPQ", (-155.0408124), "askPrice", "TB]4X%8#dxSQ(_", "5OkiTV", "lowEFP", "lowEFP", vector0, "5OkiTV", false, " avgFillPrice=", "5OkiTV");
      Order order0 = new Order();
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string1);
      
      String string2 = EWrapperMsgGenerator.tickEFP(0, 0, (-803.31952526859), (String) null, (-1037.31654603), (-5183), "OptionAskExchStr", Integer.MAX_VALUE, 2408.571);
      assertEquals("id=0  bidSize: basisPoints = -803.31952526859/null impliedFuture = -1037.31654603 holdDays = -5183 futureExpiry = OptionAskExchStr dividendImpact = 2.147483647E9 dividends to expiry = 2408.571", string2);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string3 = EWrapperMsgGenerator.bondContractDetails(3770, contractDetails0);
      assertEquals("reqId = 3770 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string3);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation((-5), 13, (-5), (-5), (-5), (-5));
      EWrapperMsgGenerator.fundamentalData(13, "id=-5  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A");
      EWrapperMsgGenerator.receiveFA((-5), "id=-5  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A");
      Order order0 = new Order();
      order0.m_permId = (-5);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder((-5), (Contract) null, order0, (OrderState) null);
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
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_eTradeOnly = false;
      OrderState orderState0 = new OrderState();
      contract0.m_secId = null;
      EWrapperMsgGenerator.openOrder(2145688435, contract0, order0, orderState0);
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 3, 1.7976931348623157E308, (-791.0), 1490.304756549, 314.0);
      assertEquals("id=0  askSize: vol = N/A delta = N/A", string0);
      
      EWrapperMsgGenerator.openOrder(13, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.tickOptionComputation(125, 830, 0, 1.7976931348623157E308, 665.0, 3);
      assertEquals("id=125  unknown: vol = 0.0 delta = N/A", string1);
      
      Order order1 = new Order();
      EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      String string2 = EWrapperMsgGenerator.tickOptionComputation((-2451), 13, 1.7976931348623157E308, 0.0, 1, (-5.0));
      assertEquals("id=-2451  modelOptComp: vol = N/A delta = 0.0: modelPrice = 1.0: pvDividend = N/A", string2);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.7214636866925116
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-5), 13, (-5), (-5), (-5), (-5));
      assertEquals("id=-5  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
      
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-2837), " hasGaps=", "ewErA", "id=-5  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", (-5), " symbol=", " benchmark=", "5OkiTV", "%s [id = %d, errorCode = %d]", "%s [id = %d, errorCode = %d]", vector0, " hasGaps=", false, (String) null, " localSymbol=");
      UnderComp underComp0 = new UnderComp();
      underComp0.m_price = (double) 13;
      contract0.m_underComp = underComp0;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      orderState0.m_minCommission = (double) 0;
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string1);
      
      order0.m_algoStrategy = "2Qd!V=GpFAjLUA";
      String string2 = EWrapperMsgGenerator.tickOptionComputation(0, 3, 1.0, (-1.0), (-1764.21877738354), 0);
      assertEquals("id=0  askSize: vol = 1.0 delta = -1.0", string2);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
      
      Vector<Integer> vector0 = new Vector<Integer>();
      String string1 = EWrapperMsgGenerator.tickOptionComputation(0, 121, (-2988), (-933.6381001961546), 0.0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: vol = N/A delta = N/A", string1);
      
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(339, contract0, order0, orderState0);
      String string2 = EWrapperMsgGenerator.tickOptionComputation(790, 339, 3, (-2241.06525257327), 665.0, (-253.9391842199105));
      assertEquals("id=790  unknown: vol = 3.0 delta = N/A", string2);
      
      Order order1 = new Order();
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      contract0.clone();
      String string3 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, (-1.0), 1.7976931348623157E308, 1.7976931348623157E308, 0.0);
      assertEquals("id=2147483647  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 0.0", string3);
      
      String string4 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1.0, 0, 1);
      assertEquals("id=2147483647  bidSize: vol = N/A delta = 1.0", string4);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.8369882167858358
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation((-5), 13, (-5), (-5), (-5), (-5));
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-5), "id=-5  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", " benchmark=", (String) null, (-5), "}~,qE7xi@WyshwzOd", "3%jN{F]", " benchmark=", "~ub8ta1]%E", " symbol=", vector0, (String) null, false, (String) null, "~ub8ta1]%E");
      UnderComp underComp0 = new UnderComp();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickPrice(0, 1090, 0, 3);
      EWrapperMsgGenerator.managedAccounts("close");
      EWrapperMsgGenerator.tickOptionComputation(0, 13, (-1344.771), 1379.0565216208965, 1, 1.7976931348623157E308);
      OrderState orderState1 = new OrderState();
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState1);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(39, underComp0);
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(167, "ewErA", "ewErA", "", (-2988), "id = 39 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", "", "ewErA", " clientId=", "", vector0, "3%jN{F]", false, "$'n16", "  It does not support historical data backfill.");
      Order order0 = new Order();
      contract0.equals("$'n16");
      Contract contract1 = new Contract((-1726031376), (String) null, (String) null, "$'n16", 2398.1600654212098, "ewErA", (String) null, " clientId=", "ewErA", "2w|j1'B%k'gr0s^", (Vector) null, (String) null, false, " open=", "unknown");
      Order order1 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(38, contract1, order0, orderState0);
      EWrapperMsgGenerator.openOrder(0, contract1, order1, orderState0);
      order1.m_algoStrategy = "ewErA";
      EWrapperMsgGenerator.managedAccounts("/z\"gCC;2]Lc!A^!@#H");
      System.setCurrentTimeMillis(1L);
      String string1 = EWrapperMsgGenerator.openOrder(24, contract0, order1, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      underComp0.m_conId = 31;
      Order order0 = new Order();
      Order order1 = new Order();
      OrderState orderState0 = new OrderState();
      order1.m_algoStrategy = "ewrA";
      EWrapperMsgGenerator.managedAccounts("/z\"gCC;2]Lc!A^!@#H");
      order1.m_designatedLocation = null;
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      contract0.m_underComp = underComp0;
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order1, orderState0);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      EWrapperMsgGenerator.openOrder((-5632), contract0, order1, orderState0);
      System.setCurrentTimeMillis(0);
      EWrapperMsgGenerator.openOrder((-3864), contract0, order0, orderState0);
      contract0.m_secType = "BAG";
      String string1 = EWrapperMsgGenerator.openOrder((-2147483647), contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "`j?4aS&w_^[$vi-xw");
      vector0.add((Object) "`j?4aS&w_^[$vi-xw");
      Contract contract0 = new Contract((-2713), "`j?4aS&w_^[$vi-xw", "BAG", "BAG", (-2713), "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "`j?4aS&w_^[$vi-xw", true, "`j?4aS&w_^[$vi-xw", "`j?4aS&w_^[$vi-xw");
      Order order0 = new Order();
      vector0.add((Object) " avgFillPrice=");
      vector0.removeAllElements();
      contract0.m_comboLegsDescrip = "  It does not support Subsequent Level Size for Scale orders.";
      OrderState orderState0 = new OrderState("`j?4aS&w_^[$vi-xw", "  It does not support Subsequent Level Size for Scale orders.", "  It does not support Subsequent Level Size for Scale orders.", "", 22.2682202970282, 1.7976931348623157E308, 0, "BAG", (String) null);
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
      System.setCurrentTimeMillis(0);
  }
}
