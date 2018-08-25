/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 23 16:56:12 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, "JcSctY", 0.0, 0, (-231.973879), (-231.973879), (-1649), 0, 0.0, false);
      assertEquals("id=0 date = JcSctY open=0.0 high=0.0 low=-231.973879 close=-231.973879 volume=-1649 count=0 WAP=0.0 hasGaps=false", string0);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string1 = EWrapperMsgGenerator.scannerData(0, 1652, contractDetails0, (String) null, "", "|f,\"/Uo#0VG-=7<mv81", "");
      assertEquals("id = 0 rank=1652 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark= projection=|f,\"/Uo#0VG-=7<mv81 legsStr=", string1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_comboLegsDescrip = " scalePriceIncrement=";
      contract0.clone();
      Contract contract1 = new Contract((-2139159309), "C-", "BAG", "q`0}fH=0c|", 787.14714276828, (String) null, (String) null, "q`0}fH=0c|", (String) null, (String) null, vector0, (String) null, true, "timeZoneId = ", "Kz&,dk@tO");
      Order order0 = new Order();
      contract1.m_strike = (double) Integer.MAX_VALUE;
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, (-2139159309), Integer.MAX_VALUE, 1.0, (String) null, (String) null);
      order0.m_percentOffset = (double) 'y';
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData('?', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = "right = ";
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), "right = ", "right = ", (String) null, (String) null, (String) null, vector0, "right = ", false, "timeZoeId = ", (String) null);
      contract0.m_secType = "right = ";
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      order0.m_algoParams = contract1.m_comboLegs;
      Integer integer0 = new Integer(0);
      OrderState orderState0 = new OrderState("", (String) null, "PROFILES", (String) null, (-2139159309), (-71.837265), 0, "Tt", (String) null);
      String string0 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>(102);
      Contract contract0 = new Contract(102, "", "", "", 102, "", "", "RLRb}5QJ[`]51&f(@L", "", "RLRb}5QJ[`]51&f(@L", vector0, "RLRb}5QJ[`]51&f(@L", false, ".q|", "RLRb}5QJ[`]51&f(@L");
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 109, 102, 0.0, 102, (-133.89), 102, "");
      assertEquals("updatePortfolio: conid = 102\nsymbol = \nsecType = \nexpiry = \nstrike = 102.0\nright = \nmultiplier = \nexchange = RLRb}5QJ[`]51&f(@L\nprimaryExch = RLRb}5QJ[`]51&f(@L\ncurrency = \nlocalSymbol = RLRb}5QJ[`]51&f(@L\n109 102.0 0.0 102.0 -133.89 102.0 ", string0);
      
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      contract0.m_symbol = "FA:";
      Execution execution0 = new Execution(109, 102, "", (String) null, "", "", "RLRb}5QJ[`]51&f(@L", 102, 102.0, 973, 102, 10, 102);
      execution0.m_permId = (-131);
      String string1 = EWrapperMsgGenerator.execDetails(102, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 102\norderId = 109\nclientId = 102\nsymbol = FA:\nsecType = \nexpiry = \nstrike = 102.0\nright = \ncontractExchange = RLRb}5QJ[`]51&f(@L\ncurrency = \nlocalSymbol = RLRb}5QJ[`]51&f(@L\nexecId = \ntime = null\nacctNumber = \nexecutionExchange = \nside = RLRb}5QJ[`]51&f(@L\nshares = 102\nprice = 102.0\npermId = -131\nliquidation = 102\ncumQty = 10\navgPrice = 102.0\n ---- Execution Details end ----\n", string1);
      
      String string2 = EWrapperMsgGenerator.managedAccounts("FA:");
      assertEquals("Connected : The list of managed accounts are : [FA:]", string2);
      
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_cusip = "~D2~q6gNAU#. fo=";
      String string3 = EWrapperMsgGenerator.scannerData(109, 0, contractDetails0, "", "FA:", "RLRb}5QJ[`]51&f(@L", (String) null);
      assertEquals("id = 109 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance= benchmark=FA: projection=RLRb}5QJ[`]51&f(@L legsStr=null", string3);
      
      String string4 = EWrapperMsgGenerator.tickEFP(0, 102, 102, (String) null, 1565.28859748451, (-271), (String) null, (-317.0741), 102.0);
      assertEquals("id=0  unknown: basisPoints = 102.0/null impliedFuture = 1565.28859748451 holdDays = -271 futureExpiry = null dividendImpact = -317.0741 dividends to expiry = 102.0", string4);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_primaryExch = " auxPrice=";
      ContractDetails contractDetails0 = new ContractDetails(contract0, " rank=", (String) null, 0.0, "", "com.ib.client.OrderState", 0, (String) null, "XISCe6H)-xADZj&", " auxPrice=", (String) null, " rank=", "", (String) null, "");
      String string0 = EWrapperMsgGenerator.bondContractDetails(4679, contractDetails0);
      assertEquals("reqId = 4679 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName =  rank=\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = \nvalidExchanges = com.ib.client.OrderState\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(475, "eY\u0003$hgJf", "eY\u0003$hgJf", "eY\u0003$hgJf", (-559), (String) null, (String) null, "", "dj$$d,a5=e", "eY\u0003$hgJf", vector0, (String) null, false, (String) null, (String) null);
      ContractDetails contractDetails0 = new ContractDetails(contract0, "com.ib.client.OrderState", (String) null, 0.0, "eY\u0003$hgJf", "68v-;a,N-9k{@r~", 475, (String) null, "", "liquidation = ", "eY\u0003$hgJf", "com.ib.client.Contract", "eY\u0003$hgJf", "", (String) null);
      String string0 = EWrapperMsgGenerator.contractDetails((-559), contractDetails0);
      assertEquals("reqId = -559 ===================================\n ---- Contract Details begin ----\nconid = 475\nsymbol = eY\u0003$hgJf\nsecType = eY\u0003$hgJf\nexpiry = eY\u0003$hgJf\nstrike = -559.0\nright = null\nmultiplier = null\nexchange = \nprimaryExch = null\ncurrency = dj$$d,a5=e\nlocalSymbol = eY\u0003$hgJf\nmarketName = com.ib.client.OrderState\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = eY\u0003$hgJf\nvalidExchanges = 68v-;a,N-9k{@r~\nunderConId = 475\nlongName = null\ncontractMonth = \nindustry = liquidation = \ncategory = eY\u0003$hgJf\nsubcategory = com.ib.client.Contract\ntimeZoneId = eY\u0003$hgJf\ntradingHours = \nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long long0 = 0L;
      EWrapperMsgGenerator.currentTime(0L);
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
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 0);
      assertEquals("id=0  bidSize=0", string0);
      
      String string1 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "id=0  bidSize=0", "id=0  bidSize=0");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=id=0  bidSize=0 :: Message=id=0  bidSize=0", string1);
      
      String string2 = EWrapperMsgGenerator.realtimeBar(0, 0, 0, 0, 0.0, 0.0, 0L, 516.146633893, 0);
      assertEquals("id=0 time = 0 open=0.0 high=0.0 low=0.0 close=0.0 volume=0 count=0 WAP=516.146633893", string2);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("NnlQNsu#^Esq7+O~");
      assertEquals("accountDownloadEnd: NnlQNsu#^Esq7+O~", string0);
      
      EWrapperMsgGenerator.receiveFA(3671, "?{R?8RC");
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string1 = EWrapperMsgGenerator.tickPrice((-718), (-718), (-718), 3671);
      assertEquals("id=-718  unknown=-718.0  canAutoExecute", string1);
      
      String string2 = EWrapperMsgGenerator.receiveFA(3671, "NnlQNsu#^Esq7+O~");
      assertEquals("FA: null NnlQNsu#^Esq7+O~", string2);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = "right = ";
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), "right = ", "right = ", "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, "right = ", false, (String) null, (String) null);
      contract0.m_secType = "right = ";
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      vector0.forEach(consumer0);
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      vector0.add((Object) "right = ");
      order0.m_algoParams = contract1.m_comboLegs;
      contract1.m_primaryExch = "";
      order0.m_scaleInitLevelSize = 7;
      OrderState orderState0 = new OrderState("", "right = ", "*Af>gkzCO5Y\"7fbT|T", "", 0.0, 0.0, 1, " (", (String) null);
      contract1.m_expiry = "uxW ts4TLcX'";
      EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 0, 1.7976931348623157E308);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.ib.client.TagValue
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      System.setCurrentTimeMillis(0);
      OrderState orderState0 = new OrderState("7IMX_pu", "descAppend = ", " clientId=", "id = ", 0.0, (-4179.0), 2079.473, "ix1Lr#7H", "high");
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), (String) null, (String) null, (String) null, (String) null, (String) null, vector0, (String) null, false, (String) null, (String) null);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 3, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, (-2139159309), 0.0, 'f', (String) null);
      assertEquals("order status: orderId=2147483647 clientId=102 permId=2147483647 status=null filled=3 remaining=2147483647 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=-2139159309 whyHeld=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), (String) null, (String) null, "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, (String) null, false, (String) null, (String) null);
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      OrderState orderState0 = new OrderState((String) null, "i$Le,w`r<DlS_`WSA", "BAG", "i$Le,w`r<DlS_`WSA", (-617.3562765705442), 487.05625648, 0, "= 5.eT|MmYbc?,!=", "");
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(Integer.MAX_VALUE);
      String string1 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "";
      EWrapperMsgGenerator.updateAccountValue("id  = ", "e`,s|mF`J`", "", "e`,s|mF`J`");
      int int0 = 0;
      EWrapperMsgGenerator.execDetailsEnd(0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.tickOptionComputation(2764, 26, 2414.968703724, 2.139159309E9, 1.0, 2764);
      Order order0 = new Order();
      EWrapperMsgGenerator.updateAccountTime((String) null);
      System.setCurrentTimeMillis(1L);
      EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 59, 4365.42584156703, (-2724.110420055526), 1616, (-2345.3085946778665));
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      order0.m_stockRangeUpper = 0.0;
      String string0 = EWrapperMsgGenerator.tickString(0, 0, (String) null);
      assertEquals("id=0  bidSize=null", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation((-1984), 2435, 3627.62242, 60.08964, (-457.761349727), 0);
      assertEquals("id=-1984  unknown: vol = 3627.62242 delta = N/A", string1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      order0.m_shortSaleSlot = 0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, "O");
      Order order1 = new Order();
      String string1 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order1, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 2408, "1", (-1594), (-1505), 2408, 4);
      assertEquals("updateMktDepth: 0 2408 1 -1594 -1505 2408.0 4", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(1580, 0, 364.220688, (-1110.7641119), 0, 1580);
      assertEquals("id=1580  bidSize: vol = 364.220688 delta = N/A", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(0, 483, 0.0, 0, 364.220688, 0);
      assertEquals("id=0  unknown: vol = 0.0 delta = 0.0", string2);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-2139159309), "C-", "BAG", "q`02u}fH=0c|", 787.14714276828, (String) null, (String) null, "q`02u}fH=0c|", "fT3~/Fcsr%7Ef[G", (String) null, vector0, (String) null, true, "timeZoneId = ", "Kz&,dk@tO");
      Order order0 = new Order();
      order0.m_startingPrice = (double) (-2139159309);
      contract1.m_strike = (double) Integer.MAX_VALUE;
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, (-2139159309), Integer.MAX_VALUE, 1.0, (String) null, (String) null);
      EWrapperMsgGenerator.openOrder(0, contract1, order0, orderState0);
      order0.m_goodTillDate = "C-";
      EWrapperMsgGenerator.nextValidId(0);
      System.setCurrentTimeMillis(1038L);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("k9*7S]<$OHOBpJ]", " eTradeOnly=", "AyQUFHO$u]b>,2", "8", 0, (-578.0806063), 0, "com.ib.client.TagValue", (String) null);
      EWrapperMsgGenerator.updateMktDepth('c', 13, Integer.MAX_VALUE, Integer.MAX_VALUE, 0.0, Integer.MAX_VALUE);
      Order order1 = new Order();
      assertEquals(0, order1.m_orderId);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, 787.14714276828, (String) null, (String) null, "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, (String) null, false, "timeZoeId = ", (String) null);
      Order order0 = new Order();
      Order order1 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(5631);
      assertEquals("id=5631 =============== end ===============", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      EWrapperMsgGenerator.tickPrice(0, 0, 0, 0);
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, "cusip = ", ".B&GE._:0nK?", "cusip = ", 0, "a'", "_s", "", "", ".Vi;D:2.}qRgr/ANp", vector0, ".Vi;D:2.}qRgr/ANp", true, "yhz", "EL!Y^(yLjOy");
      Contract contract1 = new Contract();
      contract0.m_exchange = ".'F[";
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
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation(13, 13, (-885.924445673), (-2226.0), 1.0, 0.0);
      Order order0 = new Order();
      assertEquals(1.7976931348623157E308, order0.m_startingPrice, 0.01);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_volatilityType = 1168;
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 1168, 3809.640057825462, (-1.0), 12.93, 1.0);
      assertEquals("id=0  unknown: vol = 3809.640057825462 delta = -1.0", string0);
      
      Order order1 = new Order();
      String string1 = EWrapperMsgGenerator.tickOptionComputation(2631, 34, 1.7976931348623157E308, (-483.885832), 0.0, 1985.7);
      assertEquals("id=2631  auctionVolume: vol = N/A delta = N/A", string1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, (-2226.0), (-1035.34565024), 0.0);
      Order order0 = new Order();
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, (-2226.0), 1.0, 0.0);
      Order order0 = new Order();
      assertEquals(Integer.MAX_VALUE, order0.m_scaleSubsLevelSize);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_startingPrice = (double) 13;
      order0.m_discretionaryAmt = (-1.0);
      EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 1.0, 1.7976931348623157E308, 0);
      Order order1 = new Order();
      assertEquals(1.7976931348623157E308, order1.m_scalePriceIncrement, 0.01);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation((-1975), 13, 1159, (-172.6530928), 1159, 1.7976931348623157E308);
      Order order0 = new Order();
      assertEquals(1.7976931348623157E308, order0.m_trailStopPrice, 0.01);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(3484, "?0y/,MRHoelc0z%,Qnq", "?0y/,MRHoelc0z%,Qnq", "?0y/,MRHoelc0z%,Qnq", 3484, "C-", "V[!w", "SsTw;b", "V[!w", "93{:gRm?)h", vector0, "~db:n[x=>l", true, "?0y/,MRHoelc0z%,Qnq", "~db:n[x=>l");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      EWrapperMsgGenerator.openOrder((-1), contract0, order0, orderState0);
      Order order1 = new Order();
      orderState0.m_maxCommission = (double) Integer.MAX_VALUE;
      OrderState orderState1 = new OrderState();
      EWrapperMsgGenerator.openOrder(0, contract0, order1, orderState0);
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.0, 2881.697527, 6.983, (-2062.153402178988));
      Order order0 = new Order();
      assertEquals(1.7976931348623157E308, order0.m_delta, 0.01);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = null;
      Contract contract1 = new Contract(0, (String) null, "BAG", (String) null, 3809.3736442005866, "wR", "low", (String) null, "u>)l[bZDwaod^F4e", (String) null, contract0.m_comboLegs, (String) null, false, (String) null, (String) null);
      contract0.m_underComp = null;
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      contract1.m_comboLegsDescrip = "O";
      String string0 = EWrapperMsgGenerator.openOrder(14, contract1, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = null;
      Contract contract1 = new Contract((-2139159279), (String) null, "BAG", (String) null, (-2139159279), (String) null, (String) null, "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, (String) null, false, (String) null, (String) null);
      contract0.m_secType = null;
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      order0.m_algoParams = contract1.m_comboLegs;
      Integer integer0 = new Integer(0);
      TagValue tagValue0 = new TagValue((String) null, (String) null);
      vector0.add((Object) tagValue0);
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder((-2261), contract1, order0, orderState0);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis(1);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = null;
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), (String) null, (String) null, "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, (String) null, false, "timeZoeId = ", (String) null);
      contract0.m_secType = null;
      Order order0 = new Order();
      order0.m_openClose = "1";
      order0.m_algoStrategy = "BAG";
      order0.m_algoParams = contract1.m_comboLegs;
      order0.m_scaleInitLevelSize = 7;
      Integer integer0 = new Integer(0);
      TagValue tagValue0 = new TagValue((String) null, (String) null);
      tagValue0.m_value = null;
      vector0.add((Object) tagValue0);
      OrderState orderState0 = new OrderState();
      TagValue tagValue1 = new TagValue("BAG", (String) null);
      vector0.add((Object) null);
      OrderState orderState1 = new OrderState();
      OrderState orderState2 = new OrderState();
      Order order1 = new Order();
      EWrapperMsgGenerator.openOrder(909, contract1, order1, orderState2);
      System.setCurrentTimeMillis(1000L);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      contract0.m_localSymbol = null;
      Contract contract1 = new Contract((-2139159309), (String) null, "BAG", (String) null, (-2139159309), (String) null, (String) null, "<9XEe3.G'J1B2E>]", (String) null, (String) null, vector0, (String) null, false, "timeZoeId = ", (String) null);
      contract1.m_localSymbol = null;
      Order order0 = new Order();
      order0.m_algoStrategy = "BAG";
      order0.m_algoParams = contract1.m_comboLegs;
      order0.m_scaleInitLevelSize = (int) 'c';
      Integer integer0 = new Integer(0);
      TagValue tagValue0 = new TagValue();
      vector0.add((Object) tagValue0);
      OrderState orderState0 = new OrderState();
      Contract contract2 = new Contract((-1170), (String) null, (String) null, (String) null, 787.14714276828, (String) null, (String) null, "BAG", "ov", "askExch", order0.m_algoParams, (String) null, false, "  It does not support historical data backfill.", (String) null);
      contract2.m_exchange = ")cR#Q'[/,~k";
      order0.m_basisPoints = (double) (-1170);
      EWrapperMsgGenerator.openOrder(0, contract2, order0, orderState0);
      String string0 = EWrapperMsgGenerator.FINANCIAL_ADVISOR;
      System.setCurrentTimeMillis((-1170));
      String string1 = EWrapperMsgGenerator.openOrder((-2336), contract1, order0, orderState0);
      String string2 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertFalse(string2.equals((Object)string1));
  }
}