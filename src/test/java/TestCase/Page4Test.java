package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage1;
import Pages.Page2;
import Pages.Page3;
import Pages.Page4;

public class Page4Test extends TestBase {
	LoginPage1 login;
	Page2 inventory;
	Page3 Urcart;
	Page4 checkoutInfo;
	
@BeforeMethod
public void initalizationTest() throws Exception {
	initalization();
	login=new LoginPage1();
	inventory=new Page2();
	Urcart=new Page3();
	checkoutInfo=new Page4();	
	login.verifyLoginToApp();
	inventory.VerifyNextPage();
	Urcart.verifyCheckout();
}

@Test //(enabled=false)
public void verifyPage4LabelTest() throws Exception{
	String a = checkoutInfo.verifyPage4Label();
	Assert.assertEquals(a,"CHECKOUT: YOUR INFORMATION");
}


@Test //(enabled=false)
public void verifyFirstNameTest()throws Exception {
	checkoutInfo.verifyFirstName();
}

@Test //(enabled=false)
public void verifyLastNameTest() throws Exception{
	checkoutInfo.verifyLastName();
}

@Test //(enabled=false)
public void verifyPostalCodeTest()throws Exception {
	checkoutInfo.verifyPostalCode();
}

@Test
public void verifyContinueBtnTest() throws Exception{
	checkoutInfo.verifyContinueBtn();
	String nextUrl = driver.getCurrentUrl();
	Assert.assertEquals(nextUrl,"https://www.saucedemo.com/checkout-step-one.html");
}



@AfterMethod
public void closeBrowser()throws Exception {
	driver.close();
}
	
}
	