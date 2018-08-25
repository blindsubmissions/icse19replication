/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 14:27:53 GMT 2018
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
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EWrapperMsgGenerator.nextValidId((-1));
      String string0 = EWrapperMsgGenerator.nextValidId((-1524));
      assertEquals("Next Valid Order ID: -1524", string0);
      
      String string1 = EWrapperMsgGenerator.updateAccountTime("");
      assertEquals("updateAccountTime: ", string1);
      
      String string2 = EWrapperMsgGenerator.updateNewsBulletin(1227, (-1524), "", "Next Valid Order ID: -1");
      assertEquals("MsgId=1227 :: MsgType=-1524 :: Origin=Next Valid Order ID: -1 :: Message=", string2);
      
      String string3 = EWrapperMsgGenerator.execDetailsEnd(44);
      assertEquals("reqId = 44 =============== end ===============", string3);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string4 = EWrapperMsgGenerator.tickString(1227, 1227, "");
      assertEquals("id=1227  unknown=", string4);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(609, "Next Valid Order ID: -1", "2.(2~2q 4)ye!", "MsgId=1227 :: MsgType=-1524 :: Origin=Next Valid Order ID: -1 :: Message=", 0.0, "(^pLm)ZpcfKG", " ---- Bond Contract Details End ----\n", "l*,", "Next Valid Order ID: -1", "", vector0, " (", true, "", "");
      String string5 = EWrapperMsgGenerator.updatePortfolio(contract0, (-1), 1227, 0.0, 0.0, 0.0, 0.0, "");
      assertEquals("updatePortfolio: conid = 609\nsymbol = Next Valid Order ID: -1\nsecType = 2.(2~2q 4)ye!\nexpiry = MsgId=1227 :: MsgType=-1524 :: Origin=Next Valid Order ID: -1 :: Message=\nstrike = 0.0\nright = (^pLm)ZpcfKG\nmultiplier =  ---- Bond Contract Details End ----\n\nexchange = l*,\nprimaryExch =  (\ncurrency = Next Valid Order ID: -1\nlocalSymbol = \n-1 1227.0 0.0 0.0 0.0 0.0 ", string5);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "", "");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin= :: Message=", string0);
      
      Contract contract0 = new Contract();
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 1, 0, 0, 0, 1, (-307.259564), "MsgId=0 :: MsgType=0 :: Origin= :: Message=");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n1 0.0 0.0 0.0 1.0 -307.259564 MsgId=0 :: MsgType=0 :: Origin= :: Message=", string1);
      
      String string2 = EWrapperMsgGenerator.updatePortfolio(contract0, 1, 0, (-307.259564), 374.374, (-1846.7999504140435), 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n1 0.0 -307.259564 374.374 -1846.7999504140435 0.0 null", string2);
      
      String string3 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "zDeYf';'peED^|", (String) null);
      assertEquals("updateAccountValue: null null zDeYf';'peED^| null", string3);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-921), (-921), (-921), (-921), (-921), (-921));
      assertEquals("id=-921  unknown: vol = N/A delta = N/A", string0);
      
      String string1 = EWrapperMsgGenerator.realtimeBar(1229, (-921), 1229, (-1839.89571), (-921), (-3012.95), 955L, 0.0, 2709);
      assertEquals("id=1229 time = -921 open=1229.0 high=-1839.89571 low=-921.0 close=-3012.95 volume=955 count=2709 WAP=0.0", string1);
      
      String string2 = EWrapperMsgGenerator.accountDownloadEnd("o@[QR@$ur{");
      assertEquals("accountDownloadEnd: o@[QR@$ur{", string2);
      
      String string3 = EWrapperMsgGenerator.tickString((-4149), 1632, "o@[QR@$ur{");
      assertEquals("id=-4149  unknown=o@[QR@$ur{", string3);
      
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      contract0.m_exchange = "]7R)hnsqeYbhrHgF";
      contract0.m_strike = (double) 955L;
      String string4 = EWrapperMsgGenerator.execDetails(2, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 955.0\nright = null\ncontractExchange = ]7R)hnsqeYbhrHgF\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string4);
      
      EWrapperMsgGenerator.updatePortfolio(contract0, 0, 1632, 1632, 955.0, 0, 0.0, "id=1229 time = -921 open=1229.0 high=-1839.89571 low=-921.0 close=-3012.95 volume=955 count=2709 WAP=0.0");
      String string5 = EWrapperMsgGenerator.updateAccountTime("]7R)hnsqeYbhrHgF");
      assertEquals("updateAccountTime: ]7R)hnsqeYbhrHgF", string5);
      
      String string6 = EWrapperMsgGenerator.scannerDataEnd(2);
      assertEquals("id = 2 =============== end ===============", string6);
      
      String string7 = EWrapperMsgGenerator.updatePortfolio(contract0, Integer.MAX_VALUE, (-1839.89571), 1105.0109835, 1.7976931348623157E308, (-1.0), 204.903, " ---- Execution Details begin ----\nreqId = 2\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 955.0\nright = null\ncontractExchange = ]7R)hnsqeYbhrHgF\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 955.0\nright = null\nmultiplier = null\nexchange = ]7R)hnsqeYbhrHgF\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n2147483647 -1839.89571 1105.0109835 1.7976931348623157E308 -1.0 204.903  ---- Execution Details begin ----\nreqId = 2\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 955.0\nright = null\ncontractExchange = ]7R)hnsqeYbhrHgF\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string7);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EWrapperMsgGenerator.openOrderEnd();
      String string0 = EWrapperMsgGenerator.realtimeBar(497, (-90L), 1.7976931348623157E308, 497, 0.0, 154.456, (-90L), (-90L), 497);
      assertEquals("id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0", string0);
      
      Contract contract0 = new Contract(0, "id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0", "yTdLU5_gTr7: 2$", " =============== end ===============", 665.0, "Ta@TlC@h", "d,<s%MiY]]2DaU;", "Ta@TlC@h", (String) null, " =============== end ===============", (Vector) null, "yTdLU5_gTr7: 2$", true, "d,<s%MiY]]2DaU;", "yTdLU5_gTr7: 2$");
      ContractDetails contractDetails0 = new ContractDetails(contract0, " =============== end ===============", " =============== end ===============", (-1.0), " | ", "id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0", (-2925), "|)", "Ta@TlC@h", (String) null, "yTdLU5_gTr7: 2$", "", "yTdLU5_gTr7: 2$", "com.ib.client.Execution", "id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0");
      String string1 = EWrapperMsgGenerator.scannerData(497, 1702, contractDetails0, " =============== end ===============", (String) null, "id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0", "9");
      assertEquals("id = 497 rank=1702 symbol=id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0 secType=yTdLU5_gTr7: 2$ expiry= =============== end =============== strike=665.0 right=Ta@TlC@h exchange=Ta@TlC@h currency=null localSymbol= =============== end =============== marketName= =============== end =============== tradingClass= =============== end =============== distance= =============== end =============== benchmark=null projection=id=497 time = -90 open=1.7976931348623157E308 high=497.0 low=0.0 close=154.456 volume=-90 count=497 WAP=-90.0 legsStr=9", string1);
      
      String string2 = EWrapperMsgGenerator.tickGeneric(0, 1702, 2112.694453);
      assertEquals("id=0  unknown=2112.694453", string2);
      
      String string3 = EWrapperMsgGenerator.tickSize((-2925), 1702, 1);
      assertEquals("id=-2925  unknown=1", string3);
      
      String string4 = EWrapperMsgGenerator.fundamentalData(0, "~tkAp@#[pV[K-<<[2");
      assertEquals("id  = 0 len = 17\n~tkAp@#[pV[K-<<[2", string4);
      
      String string5 = EWrapperMsgGenerator.updateMktDepth((-2634), 0, (-2925), 0, 0, (-2186));
      assertEquals("updateMktDepth: -2634 0 -2925 0 0.0 -2186", string5);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EWrapperMsgGenerator.scannerDataEnd(109);
      EWrapperMsgGenerator.receiveFA(109, "longName = ");
      String string0 = EWrapperMsgGenerator.receiveFA(0, "longName = ");
      assertEquals("FA: null longName = ", string0);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      EWrapperMsgGenerator.scannerDataEnd(13);
      String string1 = EWrapperMsgGenerator.tickString(109, (-2582), "");
      assertEquals("id=109  unknown=", string1);
      
      String string2 = EWrapperMsgGenerator.tickGeneric((-2582), (-1791), (-150.68741));
      assertEquals("id=-2582  unknown=-150.68741", string2);
      
      EWrapperMsgGenerator.receiveFA((-2582), "FA: null longName = ");
      String string3 = EWrapperMsgGenerator.scannerDataEnd((-2582));
      assertEquals("id = -2582 =============== end ===============", string3);
      
      String string4 = EWrapperMsgGenerator.accountDownloadEnd("");
      assertEquals("accountDownloadEnd: ", string4);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.receiveFA(0, "");
      assertEquals("FA: null ", string1);
      
      String string2 = EWrapperMsgGenerator.updateAccountTime("!PW\"");
      assertEquals("updateAccountTime: !PW\"", string2);
      
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 0, (String) null, (String) null, 0, "V3nVY4,3mXG", (String) null, (String) null, (String) null, "V3nVY4,3mXG", "updateAccountTime: !PW\"", (String) null, "");
      contract0.m_expiry = "com.ib.client.ContractDetails";
      String string3 = EWrapperMsgGenerator.contractDetails(1, contractDetails0);
      assertEquals("reqId = 1 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = com.ib.client.ContractDetails\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = V3nVY4,3mXG\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = V3nVY4,3mXG\ntimeZoneId = updateAccountTime: !PW\"\ntradingHours = null\nliquidHours = \n ---- Contract Details End ----\n", string3);
      
      contractDetails0.m_issueDate = "updateAccountTime: !PW\"";
      String string4 = EWrapperMsgGenerator.realtimeBar(0, 1070L, 0.0, 0.0, 0.0, 1.0, 3544L, 0.0, (-64));
      assertEquals("id=0 time = 1070 open=0.0 high=0.0 low=0.0 close=1.0 volume=3544 count=-64 WAP=0.0", string4);
      
      String string5 = EWrapperMsgGenerator.realtimeBar(0, (-64), 0, 0, 1070L, 768.527238897077, 1733L, 0, 0);
      assertEquals("id=0 time = -64 open=0.0 high=0.0 low=1070.0 close=768.527238897077 volume=1733 count=0 WAP=0.0", string5);
      
      String string6 = EWrapperMsgGenerator.orderStatus(0, "!PW\"", 0, 0, 0, 0, 0, (-1.0), 823, "\n");
      assertEquals("order status: orderId=0 clientId=823 permId=0 status=!PW\" filled=0 remaining=0 avgFillPrice=0.0 lastFillPrice=-1.0 parent Id=0 whyHeld=\n", string6);
      
      String string7 = EWrapperMsgGenerator.tickPrice(10, 840, (-513.18), 0);
      assertEquals("id=10  unknown=-513.18  noAutoExecute", string7);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_primaryExch = "'mVE";
      contract0.clone();
      contract0.m_comboLegsDescrip = "g#*E3qq<Q#/eTm+";
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = 'mVE\ncurrency = null\nlocalSymbol = null\n", string0);
      
      String string1 = EWrapperMsgGenerator.tickEFP(892, 892, 0.0, (String) null, 991.61703851, 0, "com.ib.client.AnyWrapperMsgGenerator", 1166.571353, 936.1889913);
      assertEquals("id=892  unknown: basisPoints = 0.0/null impliedFuture = 991.61703851 holdDays = 0 futureExpiry = com.ib.client.AnyWrapperMsgGenerator dividendImpact = 1166.571353 dividends to expiry = 936.1889913", string1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3978952727983707
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EWrapperMsgGenerator.updateMktDepth(10, 0, 10, 0, 0, 0);
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      AnyWrapperMsgGenerator.error(0, 0, " auctionStrategy=");
      EWrapperMsgGenerator.openOrderEnd();
      UnderComp underComp0 = new UnderComp();
      EWrapperMsgGenerator.deltaNeutralValidation(10, underComp0);
      String string0 = EWrapperMsgGenerator.updateAccountValue("updateMktDepth: 10 0 10 0 0.0 0", (String) null, " warningText=", "t0DKx");
      EWrapperMsgGenerator.execDetailsEnd(3679);
      EWrapperMsgGenerator.scannerDataEnd(0);
      EWrapperMsgGenerator.scannerParameters(" auctionStrategy=");
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, ">R1#\"Bb+^3X;*956", "", 0.0, "xn5JU3f1TsZ9!W8", "", 3679, " noAutoExecute", (String) null, "KDuB%Eu8T>ne)O1", "s:X6SBD;<qf@clS", "", "t0DKx", "", "BhHahg6zkEH@,p");
      String string1 = EWrapperMsgGenerator.contractDetails(3679, contractDetails0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_notes = null;
      contractDetails0.m_convertible = true;
      contractDetails0.m_descAppend = "B]RB?NLeh4WLR.EIL6";
      contractDetails0.m_coupon = (-707.6072125409);
      contractDetails0.m_coupon = 134.930786;
      contractDetails0.m_tradingClass = "";
      contractDetails0.m_nextOptionType = "B]RB?NLeh4WLR.EIL6";
      EWrapperMsgGenerator.bondContractDetails(2780, contractDetails0);
      Execution execution0 = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(2780, contractDetails0.m_summary, (Execution) null);
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
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
      
      String string1 = EWrapperMsgGenerator.historicalData(3656, "IoMkWkU]Kp!", 3656, 232.7934122841, 232.7934122841, 3656, 3656, 0, 0.0, true);
      assertEquals("id=3656 date = IoMkWkU]Kp! open=3656.0 high=232.7934122841 low=232.7934122841 close=3656.0 volume=3656 count=0 WAP=0.0 hasGaps=true", string1);
      
      String string2 = EWrapperMsgGenerator.fundamentalData(0, "Connected : The list of managed accounts are : []");
      assertEquals("id  = 0 len = 49\nConnected : The list of managed accounts are : []", string2);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-1631), "IoMkWkU]Kp!", "", "", 0.0, " dividendImpact = ", "notes = ", "Connected : The list of managed accounts are : [", " $0+&z)=+zZ|W", "TnQW46*W|!~75mE", vector0, " dividendImpact = ", true, (String) null, "Connected : The list of managed accounts are : []");
      Execution execution0 = new Execution(2111, 2185, " shortSaleSlot=", "R,9H)L4 &`4(O{", (String) null, "", "{2R9V'f2z9+Mp]EIm", 2111, 2185, 0, 0, 3656, 3656);
      String string3 = EWrapperMsgGenerator.execDetails(2111, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2111\norderId = 2111\nclientId = 2185\nsymbol = IoMkWkU]Kp!\nsecType = \nexpiry = \nstrike = 0.0\nright =  dividendImpact = \ncontractExchange = Connected : The list of managed accounts are : [\ncurrency =  $0+&z)=+zZ|W\nlocalSymbol = TnQW46*W|!~75mE\nexecId =  shortSaleSlot=\ntime = R,9H)L4 &`4(O{\nacctNumber = null\nexecutionExchange = \nside = {2R9V'f2z9+Mp]EIm\nshares = 2111\nprice = 2185.0\npermId = 0\nliquidation = 0\ncumQty = 3656\navgPrice = 3656.0\n ---- Execution Details end ----\n", string3);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((-2688));
      vector0.add(integer0);
      vector0.iterator();
      Contract contract0 = new Contract((-363), "", "com.ib.client.Order", "]", (-363), "", ".p2", "", "4N:9,D8", "mm 8)AFod@", vector0, "=7sZBnm", true, "com.ib.client.Order", "com.ib.client.Order");
      vector0.add(integer0);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      orderState0.m_status = "com.ib.client.Order";
      EWrapperMsgGenerator.openOrder((-2930), contract0, order0, orderState0);
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = -363\nsymbol = \nsecType = com.ib.client.Order\nexpiry = ]\nstrike = -363.0\nright = \nmultiplier = .p2\nexchange = \nprimaryExch = =7sZBnm\ncurrency = 4N:9,D8\nlocalSymbol = mm 8)AFod@\n", string0);
      
      String string1 = EWrapperMsgGenerator.scannerParameters("com.ib.client.Order");
      assertEquals("SCANNER PARAMETERS:\ncom.ib.client.Order", string1);
      
      String string2 = EWrapperMsgGenerator.currentTime(819L);
      assertEquals("current time = 819 (Jan 1, 1970 12:13:39 AM)", string2);
      
      String string3 = EWrapperMsgGenerator.updateAccountValue((String) null, "com.ib.client.OrderState", "KV@m_Nd1 Tef", (String) null);
      assertEquals("updateAccountValue: null com.ib.client.OrderState KV@m_Nd1 Tef null", string3);
      
      UnderComp underComp0 = new UnderComp();
      String string4 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string4);
      
      String string5 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=2147483647  unknown=0", string5);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
      
      String string1 = "8\\uGSpZ!euLPkGOT";
      String string2 = EWrapperMsgGenerator.tickString((-1), (-1), string1);
      assertEquals("id=-1  unknown=8\\uGSpZ!euLPkGOT", string2);
      
      String string3 = EWrapperMsgGenerator.scannerParameters("com.ib.client.Execution");
      assertEquals("SCANNER PARAMETERS:\ncom.ib.client.Execution", string3);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string4 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string4);
      
      String string5 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string5);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 216;
      int int1 = 3;
      EWrapperMsgGenerator.tickPrice(216, 3, (-143.5), 545);
      EWrapperMsgGenerator.nextValidId((-658));
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-658), "com.ib.client.ContractDetails", "com.ib.client.OrderState", "Next Valid Order ID: -658", 545, "com.ib.client.ContractDetails", "Next Valid Order ID: -658", "-kk)~ET`;s;Yg", "", "", vector0, ")lf%4dQxFO~+>Vn6v", true, "id=216  askSize=-143.5  canAutoExecute", ")lf%4dQxFO~+>Vn6v");
      contract0.m_includeExpired = true;
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-658), (UnderComp) null);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EWrapperMsgGenerator.updateNewsBulletin((-2208), (-2208), " TIF=", " TIF=");
      Contract contract0 = new Contract();
      contract0.m_strike = (double) (-2208);
      Execution execution0 = new Execution(275, 275, "", (String) null, (String) null, (String) null, "", (-2208), (-2208.0), 0, 0, (-3165), 275);
      EWrapperMsgGenerator.execDetails((-2208), contract0, execution0);
      EWrapperMsgGenerator.contractDetailsEnd(0);
      int int0 = 302;
      execution0.m_shares = 0;
      execution0.m_permId = 0;
      EWrapperMsgGenerator.updateMktDepthL2(275, 302, (String) null, 0, (-1521), (-1577.5957323801056), (-2208));
      EWrapperMsgGenerator.tickString((-1), 0, "4 .~Q26d=");
      EWrapperMsgGenerator.updateMktDepth(0, 0, (-1521), 275, (-3165), 1722);
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
  //Test case number: 14
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(121);
      assertEquals("reqId = 121 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(121, 153, 2793.132664356424, 153, 2793.132664356424, 0.0);
      assertEquals("id=121  unknown: vol = 2793.132664356424 delta = N/A", string1);
      
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 0.0, (String) null, "hA>bmMe18Yhl+!6IgW6", 0, "reqId = 121 =============== end ===============", (String) null, (String) null, "id=121  unknown: vol = 2793.132664356424 delta = N/A", "ub", ": pvDividend = ", "J9/&%cb7J&7XC'370", "id=121  unknown: vol = 2793.132664356424 delta = N/A");
      String string2 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = hA>bmMe18Yhl+!6IgW6\nunderConId = 0\nlongName = reqId = 121 =============== end ===============\ncontractMonth = null\nindustry = null\ncategory = id=121  unknown: vol = 2793.132664356424 delta = N/A\nsubcategory = ub\ntimeZoneId = : pvDividend = \ntradingHours = J9/&%cb7J&7XC'370\nliquidHours = id=121  unknown: vol = 2793.132664356424 delta = N/A\n ---- Contract Details End ----\n", string2);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("");
      assertEquals("Connected : The list of managed accounts are : []", string0);
      
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, (String) null, "Connected : The list of managed accounts are : []", "Connected : The list of managed accounts are : []", 0, "", (String) null, "Connected : The list of managed accounts are : []", "", " :: MsgType=", vector0, "", false, "Connected : The list of managed accounts are : []", "Connected : The list of managed accounts are : []");
      contract0.m_primaryExch = "";
      Order order0 = new Order();
      vector0.iterator();
      OrderState orderState0 = new OrderState((String) null, (String) null, "Connected : The list of managed accounts are : []", "H\"^pc7y0(p[J&kQT;x", 0, (-193.6283), 0.0, "d(gG|ym#qJ)D-TLn6#", "");
      orderState0.m_maintMargin = null;
      orderState0.m_maxCommission = 1.7976931348623157E308;
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.tickOptionComputation(2467, 2717, 0.0, 0, 1192.134374273714, (-1314.8687864426));
      assertEquals("id=2467  unknown: vol = 0.0 delta = 0.0", string1);
      
      String string2 = EWrapperMsgGenerator.tickSize(0, 1, 3);
      assertEquals("id=0  bidPrice=3", string2);
      
      ContractDetails contractDetails0 = new ContractDetails();
      EWrapperMsgGenerator.scannerData(3, 0, contractDetails0, "HT`bIB17", (String) null, "SjmoX{f3KKDoyr@f", "");
      String string3 = EWrapperMsgGenerator.realtimeBar((-188), 0, 1.0, (-1662.364603395), 0, 0.0, 0, 2, 13);
      assertEquals("id=-188 time = 0 open=1.0 high=-1662.364603395 low=0.0 close=0.0 volume=0 count=13 WAP=2.0", string3);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract((-4), "com.ib.client.Order", "com.ib.client.Order", "com.ib.client.Order", (-4), "com.ib.client.Order", "U_K~M@06", "Vs\"6", "bidExch", "com.ib.client.Order", vector0, "[*pOZT&+G2;(En~|u", false, "com.ib.client.Order", "com.ib.client.Order");
      Order order0 = new Order();
      contract0.equals("[*pOZT&+G2;(En~|u");
      contract0.m_multiplier = "com.ib.client.EException";
      EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, 1.7976931348623157E308, 720.0808605732, (-3422.88179313), (-1095.3568170798744));
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EWrapperMsgGenerator.tickSnapshotEnd(129);
      EWrapperMsgGenerator.tickOptionComputation(129, 13, 1.7976931348623157E308, 13, 129, 1.0);
      System.setCurrentTimeMillis(13);
      EWrapperMsgGenerator.tickOptionComputation((-2145154490), 13, 1.0, (-465.3488690259619), 1.7976931348623157E308, (-2145154490));
      System.setCurrentTimeMillis(2139L);
      System.setCurrentTimeMillis(1279L);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5359610497090694
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(129);
      assertEquals("id=129 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(129, 13, 1.7976931348623157E308, 13, 129, 1.0);
      assertEquals("id=129  modelOptComp: vol = N/A delta = N/A: modelPrice = 129.0: pvDividend = 1.0", string1);
      
      OrderState orderState0 = new OrderState();
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(13, "?", (String) null, ".h+N}@8dvp)?", (-1562.74), "", (String) null, (String) null, (String) null, "id=129 =============== end ===============", vector0, (String) null, false, "?", "ThAvBD8E}Z!q4E99D");
      Order order0 = new Order();
      orderState0.m_commissionCurrency = "com.ib.lient.Order";
      OrderState orderState1 = new OrderState((String) null, (String) null, "?", (String) null, 1499.774234, 2, 'y', (String) null, "askOptComp");
      vector0.clear();
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      Order order1 = new Order();
      Contract contract1 = new Contract(0, (String) null, (String) null, "4FuwK1khqZ", 325.7589939212369, (String) null, (String) null, "SCANNER PARAMETERS:\n", (String) null, "O", (Vector) null, (String) null, false, "lastTimestamp", (String) null);
      OrderState orderState2 = new OrderState();
      EWrapperMsgGenerator.openOrder(3, contract1, order0, orderState2);
      String string2 = EWrapperMsgGenerator.tickOptionComputation(1, 13, 0, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=1  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string2);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_maxCommission = (double) 13;
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "Z5G$Gj(`EOd@";
      String string0 = EWrapperMsgGenerator.openOrder(13, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OrderState orderState0 = new OrderState("Connected : The list of managed accounts are / []", "Connected : The list of managed accounts are / []", "Connected : The list of managed accounts are / []", "", (-2714.45), 921.0, 13, "Connected : The list of managed accounts are / []", "");
      Vector<Object> vector0 = new Vector<Object>();
      TagValue tagValue0 = new TagValue();
      vector0.add((Object) tagValue0);
      Contract contract0 = new Contract(0, "", "BAG", "|PH_7%dh3` >]7V'", 921.0, "", "", "com.ib.lient.Orer", "Connected : The list of managed accounts are / []", "", vector0, "Connected : The list of managed accounts are / []", true, "", "");
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Vector<Object> vector1 = new Vector<Object>();
      Contract contract1 = new Contract(0, "F3pMFI5K|QA/H?r", "", "x_0P-q", 433.19344881, "Qv2T'CL]S", ",&mGOu V", (String) null, " faPercentage=", (String) null, vector1, (String) null, false, "", "^8e%^*");
      Order order1 = new Order();
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order1, orderState0);
      String string1 = EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OrderState orderState0 = new OrderState("Connected : The list of managed accounts are : []", "Connected : The list of managed accounts are : []", "Connected : The list of managed accounts are : []", "", (-2714.45), 921.0, 13, "Connected : The list of managed accounts are : []", "");
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(0, "", "BAG", "|PH_7%dh3` >]7V'", 921.0, "", "", "com.ib.lient.Order", "Connected : The list of managed accounts are : []", "", vector0, "Connected : The list of managed accounts are : []", true, "", "");
      contract0.m_comboLegsDescrip = "*W]0H\"g0/&@";
      contract0.m_multiplier = "5|}h";
      orderState0.m_initMargin = " avgFillPrice=";
      Order order0 = new Order();
      EWrapperMsgGenerator.openOrder(13, contract0, order0, orderState0);
      System.setCurrentTimeMillis(0);
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
      order0.m_algoParams = contract0.m_comboLegs;
      orderState0.m_warningText = null;
      order0.m_algoStrategy = "Z5G$Gj(`EOd@";
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      Order order1 = new Order();
      EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      order1.m_allOrNone = false;
      Contract contract1 = new Contract(184, (String) null, (String) null, (String) null, (-582.055915465), "J0CwQ", (String) null, "C7JU.6R-J:OdxM$o", "askEFP", (String) null, contract0.m_comboLegs, "&m)nejf8A:~", false, "|PH_7%dh3` >]7V'", "liquidation = ");
      OrderState orderState1 = new OrderState();
      EWrapperMsgGenerator.openOrder(6, contract0, order0, orderState1);
      System.setCurrentTimeMillis((-1306L));
      EWrapperMsgGenerator.openOrder(1079, contract1, order1, orderState1);
      EWrapperMsgGenerator.openOrder(240, contract0, order1, orderState0);
      System.setCurrentTimeMillis((-1L));
  }
}