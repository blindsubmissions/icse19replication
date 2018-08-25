/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 24 11:12:34 GMT 2018
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
import java.util.function.Predicate;
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
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 121, 63, 121, (-2974), 4187, 121, 121, (String) null);
      assertEquals("order status: orderId=0 clientId=121 permId=-2974 status=null filled=121 remaining=63 avgFillPrice=121.0 lastFillPrice=121.0 parent Id=4187 whyHeld=null", string0);
      
      String string1 = EWrapperMsgGenerator.updateAccountValue(" ---- Bond Contract Details End ----\n", " ---- Bond Contract Details End ----\n", " maxCommission=", "oZy{");
      assertEquals("updateAccountValue:  ---- Bond Contract Details End ----\n  ---- Bond Contract Details End ----\n  maxCommission= oZy{", string1);
      
      String string2 = EWrapperMsgGenerator.scannerParameters(" ---- Bond Contract Details End ----\n");
      assertEquals("SCANNER PARAMETERS:\n ---- Bond Contract Details End ----\n", string2);
      
      String string3 = EWrapperMsgGenerator.updateAccountTime("");
      assertEquals("updateAccountTime: ", string3);
      
      String string4 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string4);
      
      String string5 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string5);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 0, 1846.7006);
      assertEquals("id=0  bidSize=1846.7006", string0);
      
      String string1 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      int int0 = Integer.MAX_VALUE;
      int int1 = 1;
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(1, "j'I*rbxlXQQWrsGt", "", " secType=", Integer.MAX_VALUE, "SCANNER PARAMETERS:", "SCANNER PARAMETERS:", "j'I*rbxlXQQWrsGt", "Connected : The list of managed accounts are : [", "", vector0, "", false, (String) null, (String) null);
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(Integer.MAX_VALUE, (UnderComp) null);
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
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("kbW>mx}}?^;", "", "", "kbW>mx}}?^;");
      assertEquals("updateAccountValue: kbW>mx}}?^;   kbW>mx}}?^;", string0);
      
      UnderComp underComp0 = new UnderComp();
      underComp0.m_delta = (double) 0;
      underComp0.m_price = (-578.19995173);
      underComp0.m_conId = 102;
      underComp0.m_delta = (-578.19995173);
      underComp0.m_conId = 0;
      EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      underComp0.m_price = (-1.0);
      underComp0.m_price = (double) (-375);
      String string1 = EWrapperMsgGenerator.contractDetailsEnd((-375));
      assertEquals("reqId = -375 =============== end ===============", string1);
      
      String string2 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =-578.19995173 underComp.price =-375.0", string2);
      
      String string3 = EWrapperMsgGenerator.scannerDataEnd((-1787));
      assertEquals("id = -1787 =============== end ===============", string3);
      
      underComp0.m_price = (double) 0;
      underComp0.m_price = 0.0;
      underComp0.m_conId = (-1787);
      underComp0.m_price = 0.0;
      underComp0.m_conId = 102;
      underComp0.m_delta = (-554.83);
      String string4 = EWrapperMsgGenerator.realtimeBar(10, (-1560L), 0.0, (-587.6815), 1.7976931348623157E308, 0.0, (-1560L), 0.0, 102);
      assertEquals("id=10 time = -1560 open=0.0 high=-587.6815 low=1.7976931348623157E308 close=0.0 volume=-1560 count=102 WAP=0.0", string4);
      
      String string5 = EWrapperMsgGenerator.receiveFA((-375), "");
      assertEquals("FA: null ", string5);
      
      String string6 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string6);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails((-500), contractDetails0);
      assertEquals("reqId = -500 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-4489));
      assertEquals("id=-4489 =============== end ===============", string0);
      
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(0, "5i", "v;Cu{,O94vYBN`NJ", "v;Cu{,O94vYBN`NJ", (-4489), "GW^57]'x[", "", (String) null, "com.ib.client.OrderState", "id=-4489 =============== end ===============", vector0, "77tY", false, "", "77tY");
      Predicate<String> predicate0 = Predicate.isEqual((Object) "com.ib.client.OrderState");
      Predicate<String> predicate1 = predicate0.negate();
      vector0.trimToSize();
      Predicate<String> predicate2 = predicate1.or(predicate0);
      vector0.removeIf(predicate2);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = 5i\nsecType = v;Cu{,O94vYBN`NJ\nexpiry = v;Cu{,O94vYBN`NJ\nstrike = -4489.0\nright = GW^57]'x[\nmultiplier = \nexchange = null\nprimaryExch = 77tY\ncurrency = com.ib.client.OrderState\nlocalSymbol = id=-4489 =============== end ===============\n", string1);
      
      String string2 = EWrapperMsgGenerator.accountDownloadEnd("O");
      assertEquals("accountDownloadEnd: O", string2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.contractMsg(contract0);
      Execution execution0 = new Execution();
      EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(13, (ContractDetails) null);
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
      EWrapperMsgGenerator.updateNewsBulletin((-717), (-717), "com.ib.client.OrderState", "com.ib.client.TagValue");
      Contract contract0 = new Contract();
      contract0.m_strike = (double) 606;
      contract0.m_primaryExch = "Nk 5;#Kb P'tg";
      contract0.m_symbol = "callable = ";
      Execution execution0 = new Execution(606, (-717), "t6GwTm<;~9", "Nk 5;#Kb P'tg", "UaoC05\"FMH", "Nk 5;#Kb P'tg", "Nk 5;#Kb P'tg", 110, 110, 3442, (-717), 110, 0);
      execution0.m_acctNumber = "MsgId=-717 :: MsgType=-717 :: Origin=com.ib.client.TagValue :: Message=com.ib.client.OrderState";
      EWrapperMsgGenerator.execDetails(606, contract0, execution0);
      execution0.m_clientId = 98;
      execution0.m_execId = "";
      contract0.m_exchange = "Nk 5;#Kb P'tg";
      EWrapperMsgGenerator.updatePortfolio(contract0, 98, 98, 3442, (-2987.655576758162), (-3013.31085), 2260.5, " ---- Execution Details begin ----\nreqId = 606\norderId = 606\nclientId = -717\nsymbol = callable = \nsecType = null\nexpiry = null\nstrike = 606.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = t6GwTm<;~9\ntime = Nk 5;#Kb P'tg\nacctNumber = MsgId=-717 :: MsgType=-717 :: Origin=com.ib.client.TagValue :: Message=com.ib.client.OrderState\nexecutionExchange = Nk 5;#Kb P'tg\nside = Nk 5;#Kb P'tg\nshares = 110\nprice = 110.0\npermId = 3442\nliquidation = -717\ncumQty = 110\navgPrice = 0.0\n ---- Execution Details end ----\n");
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
  //Test case number: 8
  /*Coverage entropy=2.1972245773362196
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EWrapperMsgGenerator.nextValidId((-2004));
      String string0 = EWrapperMsgGenerator.updateMktDepth((-2004), 13, 98, (-183), (-183), 167);
      assertEquals("updateMktDepth: -2004 13 98 -183 -183.0 167", string0);
      
      EWrapperMsgGenerator.receiveFA((-2004), "updateMktDepth: -2004 13 98 -183 -183.0 167");
      String string1 = EWrapperMsgGenerator.managedAccounts("'AQc>E-O-ce9#~M'$z");
      assertEquals("Connected : The list of managed accounts are : ['AQc>E-O-ce9#~M'$z]", string1);
      
      String string2 = EWrapperMsgGenerator.accountDownloadEnd("Connected : The list of managed accounts are : ['AQc>E-O-ce9#~M'$z]");
      assertEquals("accountDownloadEnd: Connected : The list of managed accounts are : ['AQc>E-O-ce9#~M'$z]", string2);
      
      String string3 = EWrapperMsgGenerator.tickGeneric(13, (-183), 0.0);
      assertEquals("id=13  unknown=0.0", string3);
      
      String string4 = EWrapperMsgGenerator.nextValidId((-460));
      assertEquals("Next Valid Order ID: -460", string4);
      
      String string5 = EWrapperMsgGenerator.tickString((-460), (-621), "updatePortfolio: ");
      assertEquals("id=-460  unknown=updatePortfolio: ", string5);
      
      String string6 = EWrapperMsgGenerator.receiveFA((-2004), "'AQc>E-O-ce9#~M'$z");
      assertEquals("FA: null 'AQc>E-O-ce9#~M'$z", string6);
      
      String string7 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string7);
      
      String string8 = EWrapperMsgGenerator.tickEFP(0, (-460), 0.0, "V", (-621), 98, " delta=", (-621), 1507.393372957);
      assertEquals("id=0  unknown: basisPoints = 0.0/V impliedFuture = -621.0 holdDays = 98 futureExpiry =  delta= dividendImpact = -621.0 dividends to expiry = 1507.393372957", string8);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EWrapperMsgGenerator.scannerParameters("#ZD/9*tu9SOB>uM|>}o");
      String string0 = EWrapperMsgGenerator.updateAccountTime("SCANNER PARAMETERS:\n#ZD/9*tu9SOB>uM|>}o");
      assertEquals("updateAccountTime: SCANNER PARAMETERS:\n#ZD/9*tu9SOB>uM|>}o", string0);
      
      String string1 = EWrapperMsgGenerator.currentTime(167L);
      assertEquals("current time = 167 (Jan 1, 1970 12:02:47 AM)", string1);
      
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_hidden = true;
      OrderState orderState0 = new OrderState();
      orderState0.m_warningText = "com.ib.client.TagValue";
      EWrapperMsgGenerator.openOrder(537, contract0, order0, orderState0);
      String string2 = EWrapperMsgGenerator.scannerParameters(" VGzxU^5etnY1Br5s");
      assertEquals("SCANNER PARAMETERS:\n VGzxU^5etnY1Br5s", string2);
      
      String string3 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string3);
      
      String string4 = EWrapperMsgGenerator.tickOptionComputation(0, (-386), (-1960.49), 0, (-1829.5531145925), 537);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string4);
      
      Execution execution0 = new Execution();
      String string5 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string5);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-1649), " faGroup=");
      assertEquals("id  = -1649 len = 9\n faGroup=", string0);
      
      String string1 = EWrapperMsgGenerator.realtimeBar((-1649), (-1L), (-1.0), (-1.0), (-1649), 0.0, 0L, (-1L), (-1649));
      assertEquals("id=-1649 time = -1 open=-1.0 high=-1.0 low=-1649.0 close=0.0 volume=0 count=-1649 WAP=-1.0", string1);
      
      String string2 = EWrapperMsgGenerator.orderStatus(0, " faGroup=", (-158), (-1649), (-1L), (-1649), 0, (-158), 2366, "id=-1649 time = -1 open=-1.0 high=-1.0 low=-1649.0 close=0.0 volume=0 count=-1649 WAP=-1.0");
      assertEquals("order status: orderId=0 clientId=2366 permId=-1649 status= faGroup= filled=-158 remaining=-1649 avgFillPrice=-1.0 lastFillPrice=-158.0 parent Id=0 whyHeld=id=-1649 time = -1 open=-1.0 high=-1.0 low=-1649.0 close=0.0 volume=0 count=-1649 WAP=-1.0", string2);
      
      String string3 = EWrapperMsgGenerator.updateMktDepth((-158), (-1649), 2366, (-158), 1.0, 0);
      assertEquals("updateMktDepth: -158 -1649 2366 -158 1.0 0", string3);
      
      UnderComp underComp0 = new UnderComp();
      underComp0.m_conId = 0;
      underComp0.m_conId = 0;
      String string4 = EWrapperMsgGenerator.deltaNeutralValidation(0, underComp0);
      assertEquals("id = 0 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string4);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-3970), 88, 88, (-3970));
      assertEquals("id=-3970  unknown=88.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_nextOptionType = "com.ib.client.Execution";
      contractDetails0.m_validExchanges = "com.ib.client.Execution";
      contractDetails0.m_notes = "com.ib.client.Execution";
      contractDetails0.m_orderTypes = "";
      EWrapperMsgGenerator.scannerData(0, (-1804), contractDetails0, (String) null, "hAyw", " whyHeld=", "Aa>#D[O~U!c4GA3XK!n");
      UnderComp underComp0 = contractDetails0.m_summary.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(139, (UnderComp) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-1988), "UMFf!}L+MCxR+EYr^*;", "UMFf!}L+MCxR+EYr^*;", "", 1.0, "", "", "", "", "", vector0, (String) null, false, "O_*w!ak#", "");
      contract0.m_secType = "O_*w!ak#";
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-1988), 1.0, (-1988), 1879.770254, 1.0, 1.0, "");
      assertEquals("updatePortfolio: conid = -1988\nsymbol = UMFf!}L+MCxR+EYr^*;\nsecType = O_*w!ak#\nexpiry = \nstrike = 1.0\nright = \nmultiplier = \nexchange = \nprimaryExch = null\ncurrency = \nlocalSymbol = \n-1988 1.0 -1988.0 1879.770254 1.0 1.0 ", string0);
      
      ContractDetails contractDetails0 = new ContractDetails(contract0, "UMFf!}L+MCxR+EYr^*;", "O_*w!ak#", 1.0, "", "", (-1988), "W'@", "O_*w!ak#", "", "?( M*5", "", "UMFf!}L+MCxR+EYr^*;", "", "");
      String string1 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = UMFf!}L+MCxR+EYr^*;\nsecType = O_*w!ak#\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = \ncurrency = \nmarketName = UMFf!}L+MCxR+EYr^*;\ntradingClass = O_*w!ak#\nconid = -1988\nminTick = 1.0\norderTypes = \nvalidExchanges = \nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = W'@\n ---- Bond Contract Details End ----\n", string1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(857, ")E,oIgL{,'\"");
      assertEquals("FA: null )E,oIgL{,'\"", string0);
      
      String string1 = EWrapperMsgGenerator.fundamentalData((-1), "FA: null )E,oIgL{,'\"");
      assertEquals("id  = -1 len = 20\nFA: null )E,oIgL{,'\"", string1);
      
      String string2 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string2);
      
      String string3 = EWrapperMsgGenerator.updateMktDepthL2(4243, (-1), "reqId = 0 =============== end ===============", (-1), 947, 0, (-1));
      assertEquals("updateMktDepth: 4243 -1 reqId = 0 =============== end =============== -1 947 0.0 -1", string3);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(98, "BOND", 4692.64, (-1740.42524609347), (-2550.8051), 3825.83561, (-62), 98, 0.0, false);
      assertEquals("id=98 date = BOND open=4692.64 high=-1740.42524609347 low=-2550.8051 close=3825.83561 volume=-62 count=98 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-2604), (-2604), 590.0, 0.0, 1.7976931348623157E308, 1.7976931348623157E308, (-2604), 1.7976931348623157E308, 2626);
      assertEquals("id=-2604 time = -2604 open=590.0 high=0.0 low=1.7976931348623157E308 close=1.7976931348623157E308 volume=-2604 count=2626 WAP=1.7976931348623157E308", string0);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      Contract contract0 = new Contract();
      contract0.m_primaryExch = "ySV`4T*daz^gB|3]d";
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 2626, 2626, 4208.5400959912, 0, (-4069.66813), 2626, (String) null);
      assertNotNull(string1);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = ySV`4T*daz^gB|3]d\ncurrency = null\nlocalSymbol = null\n2626 2626.0 4208.5400959912 0.0 -4069.66813 2626.0 null", string1);
      
      String string2 = EWrapperMsgGenerator.tickSize((-2604), (-2604), (-2604));
      assertEquals("id=-2604  unknown=-2604", string2);
      
      String string3 = EWrapperMsgGenerator.accountDownloadEnd("SCANNER PARAMETERS:");
      assertEquals("accountDownloadEnd: SCANNER PARAMETERS:", string3);
      
      String string4 = EWrapperMsgGenerator.scannerParameters("(i^I@ iGh2'Y*u-cx3");
      assertEquals("SCANNER PARAMETERS:\n(i^I@ iGh2'Y*u-cx3", string4);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7480673485460891
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string0 = EWrapperMsgGenerator.execDetailsEnd(97);
      assertEquals("reqId = 97 =============== end ===============", string0);
      
      String string1 = EWrapperMsgGenerator.updateNewsBulletin(97, 1322, "", "FA:");
      assertEquals("MsgId=97 :: MsgType=1322 :: Origin=FA: :: Message=", string1);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(1322, "", (String) null, "reqId = 97 =============== end ===============", (-1196.0), " algoParams={", "AWDae||)c/zmON;M`", (String) null, "AI:", "", vector0, "BOND", false, "tradingClass = ", (String) null);
      Order order0 = new Order();
      order0.m_shortSaleSlot = 97;
      contract0.m_comboLegsDescrip = "";
      vector0.add((Object) null);
      OrderState orderState0 = new OrderState("@)MnpXCV.ze", "Jv@Rr@C", "O", "FA:", 0, 1.7976931348623157E308, 1322, "Tc'XV4t23v7VL#DmM", "");
      orderState0.m_maxCommission = (-912.1723598127);
      EWrapperMsgGenerator.openOrder((-1090), contract0, order0, orderState0);
      String string2 = EWrapperMsgGenerator.tickOptionComputation(32, 13, 97, 0.0, 97, 0);
      assertEquals("id=32  modelOptComp: vol = 97.0 delta = 0.0: modelPrice = 97.0: pvDividend = 0.0", string2);
      
      String string3 = EWrapperMsgGenerator.updateAccountTime("O");
      assertEquals("updateAccountTime: O", string3);
      
      String string4 = EWrapperMsgGenerator.updateMktDepthL2(Integer.MAX_VALUE, 0, "", 0, 121, 0.0, 0);
      assertEquals("updateMktDepth: 2147483647 0  0 121 0.0 0", string4);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EWrapperMsgGenerator.tickPrice(0, 0, 0, 0);
      EWrapperMsgGenerator.openOrderEnd();
      EWrapperMsgGenerator.updateAccountValue("1PKR3f8D}]E`", "1PKR3f8D}]E`", (String) null, "~ _");
      Contract contract0 = null;
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
  //Test case number: 19
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-2746), "");
      assertEquals("id  = -2746 len = 0\n", string0);
      
      EWrapperMsgGenerator.tickGeneric((-1666), (-1666), (-1666));
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-1), "YK&UK\")_X7", "Connection Closed", "id  = -2746 len = 0\n", (-2746), "BAG", "BAG", "Connection Closed", "", "w!HkHJ", vector0, "a-J3@=nh}DBozy~A", true, "}`,9d +pv", "");
      String string1 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = -1\nsymbol = YK&UK\")_X7\nsecType = Connection Closed\nexpiry = id  = -2746 len = 0\n\nstrike = -2746.0\nright = BAG\nmultiplier = BAG\nexchange = Connection Closed\nprimaryExch = a-J3@=nh}DBozy~A\ncurrency = \nlocalSymbol = w!HkHJ\n", string1);
      
      String string2 = EWrapperMsgGenerator.tickGeneric(4, (-1), (-1666));
      assertEquals("id=4  unknown=-1666.0", string2);
      
      String string3 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.0, 1632.4771, (-1666), (-2746));
      assertEquals("id=0  bidSize: vol = 1.0 delta = N/A", string3);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5171515848932915
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "", "9<+$ZecDGeO{WrAOCX");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=9<+$ZecDGeO{WrAOCX :: Message=", string0);
      
      EWrapperMsgGenerator.tickOptionComputation(0, 0, 0.0, 0, 0.0, 0.0);
      String string1 = EWrapperMsgGenerator.updateAccountValue("com.ib.client.Order", "MsgId=0 :: MsgType=0 :: Origin=9<+$ZecDGeO{WrAOCX :: Message=", "id=0  bidSize: vol = 0.0 delta = 0.0", "9<+$ZecDGeO{WrAOCX");
      assertEquals("updateAccountValue: com.ib.client.Order MsgId=0 :: MsgType=0 :: Origin=9<+$ZecDGeO{WrAOCX :: Message= id=0  bidSize: vol = 0.0 delta = 0.0 9<+$ZecDGeO{WrAOCX", string1);
      
      String string2 = EWrapperMsgGenerator.receiveFA(0, "'nWAD=");
      assertEquals("FA: null 'nWAD=", string2);
      
      String string3 = EWrapperMsgGenerator.realtimeBar(0, 0, (-903.0), 0, 0.0, 156.3953755519, 0, 0, 0);
      assertEquals("id=0 time = 0 open=-903.0 high=0.0 low=0.0 close=156.3953755519 volume=0 count=0 WAP=0.0", string3);
      
      String string4 = EWrapperMsgGenerator.accountDownloadEnd("");
      assertEquals("accountDownloadEnd: ", string4);
      
      String string5 = EWrapperMsgGenerator.updateMktDepth(0, 0, 1149, 109, (-903.0), 0);
      assertEquals("updateMktDepth: 0 0 1149 109 -903.0 0", string5);
      
      Vector<Object> vector0 = new Vector<Object>();
      String string6 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 0, 1509.4, (-1960.49));
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 1509.4: pvDividend = N/A", string6);
      
      String string7 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1632.4771, 1149, (-3567.472805301946), 0);
      assertEquals("id=0  modelOptComp: vol = 1632.4771 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string7);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-2746), "");
      assertEquals("id  = -2746 len = 0\n", string0);
      
      String string1 = EWrapperMsgGenerator.tickGeneric((-1661), (-1661), (-1661));
      assertEquals("id=-1661  unknown=-1661.0", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation((-1661), (-161), (-161), (-1.0), 1.7976931348623157E308, (-161));
      assertEquals("id=-1661  unknown: vol = N/A delta = -1.0", string2);
      
      String string3 = EWrapperMsgGenerator.tickOptionComputation((-1661), (-2746), 1.7976931348623157E308, 0.0, 0.0, 1.7976931348623157E308);
      assertEquals("id=-1661  unknown: vol = N/A delta = 0.0", string3);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681098
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      EWrapperMsgGenerator.execDetailsEnd(97);
      EWrapperMsgGenerator.updateNewsBulletin(97, 1322, "", "FA:");
      Order order0 = new Order();
      order0.m_shortSaleSlot = 97;
      EWrapperMsgGenerator.tickOptionComputation(32, 13, 97, 0.0, 97, 0);
      Contract contract0 = new Contract((-2687), "vLFRYYbC;", (String) null, "FA:", Integer.MAX_VALUE, (String) null, (String) null, "vLFRYYbC;", (String) null, (String) null, (Vector) null, " eTradeOnly=", false, (String) null, "O");
      Order order1 = new Order();
      OrderState orderState0 = new OrderState();
      order1.m_faProfile = "k)t/+hahnp";
      Order order2 = new Order();
      Order order3 = new Order();
      EWrapperMsgGenerator.openOrder(1001, contract0, order3, orderState0);
      Order order4 = new Order();
      EWrapperMsgGenerator.openOrder(3, contract0, order4, orderState0);
      EWrapperMsgGenerator.tickOptionComputation((-3228), 13, 1.7976931348623157E308, 3, 1.7976931348623157E308, 97);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5195798391305154
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      order0.m_minQty = 97;
      order0.m_shortSaleSlot = 13;
      String string0 = EWrapperMsgGenerator.tickOptionComputation(32, 13, 13, 0.0, 97, 0);
      assertEquals("id=32  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 97.0: pvDividend = 0.0", string0);
      
      order0.m_algoStrategy = "$2N 3k(%A3aqR?";
      String string1 = EWrapperMsgGenerator.tickOptionComputation(0, 0, Integer.MAX_VALUE, (-1.0), (-2234.2994189008655), 665.024492733);
      assertEquals("id=0  bidSize: vol = 2.147483647E9 delta = -1.0", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(1, 0, 1.7976931348623157E308, 1.7976931348623157E308, 0, 1.7976931348623157E308);
      assertEquals("id=1  bidSize: vol = N/A delta = N/A", string2);
      
      OrderState orderState0 = new OrderState("Ue*OY`Y* 'oORwM^", "}=^$K", (String) null, (String) null, 1414.721355117917, 1811.068568, 0.0, "id=32  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 97.0: pvDividend = 0.0", "  It does not support Scale orders.");
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      String string3 = EWrapperMsgGenerator.tickOptionComputation(0, (-1828), 730.3234, 1414.721355117917, 0.0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: vol = 730.3234 delta = N/A", string3);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 902.7410633418963, 3339.84265, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 3339.84265: pvDividend = 13.0", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(13, (-386), (-386), 93.11, (-386), 10);
      assertEquals("id=13  unknown: vol = N/A delta = N/A", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 1109.435, 13, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string2);
      
      String string3 = EWrapperMsgGenerator.tickOptionComputation((-2442), 808, (-85.420399247), 1384.0, 1.7976931348623157E308, 2451.09);
      assertEquals("id=-2442  unknown: vol = N/A delta = N/A", string3);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "$2N 3(%Au3aqR?";
      Vector<String> vector0 = new Vector<String>();
      vector0.add("$2N 3(%Au3aqR?");
      vector0.add((String) null);
      Contract contract0 = new Contract((-1790834872), "", "a:<", "", 1.7976931348623157E308, (String) null, (String) null, " high/", (String) null, "auctionPrice", vector0, (String) null, true, "tzu<9U)v(M(#@K-", (String) null);
      contract0.m_comboLegsDescrip = "y~iGrsj?FH";
      Vector<String> vector1 = new Vector<String>();
      OrderState orderState0 = null;
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
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(1, "BAG", "BAG", "BAG", 1, "+Eyr7iXTZK/Yru", "cd,w{ExPZ_", "BAG", "uJpB[vvY\"V':Z!]U", (String) null, vector0, "2w`}6", false, (String) null, "com.ib.client.UnderComp");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      orderState0.m_maintMargin = null;
      contract0.m_localSymbol = null;
      EWrapperMsgGenerator.openOrder((-256), contract0, order0, orderState0);
      order0.m_sweepToFill = true;
      Order order1 = new Order();
      order1.m_allOrNone = true;
      order1.m_referencePriceType = 2125570549;
      EWrapperMsgGenerator.openOrder((-235725554), contract0, order1, orderState0);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      Contract contract1 = new Contract();
      String string1 = EWrapperMsgGenerator.openOrder(10, contract1, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(1, "BAG", "BAG", "BAG", 1, "+Eyr7iXTZK/Yru", "cd,w{ExPZ_", "BAG", "uJpB[vvY\"V':Z!]U", (String) null, vector0, "2w`}6", false, (String) null, "com.ib.client.UnderComp");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      orderState0.m_maintMargin = null;
      contract0.m_localSymbol = null;
      EWrapperMsgGenerator.openOrder((-256), contract0, order0, orderState0);
      contract0.m_comboLegsDescrip = "price magnifier = ";
      order0.m_sweepToFill = true;
      Order order1 = new Order();
      order1.m_allOrNone = true;
      order1.m_referencePriceType = 2125570549;
      EWrapperMsgGenerator.openOrder((-235725554), contract0, order1, orderState0);
      EWrapperMsgGenerator.nextValidId('m');
      Contract contract1 = new Contract();
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0L);
  }
}