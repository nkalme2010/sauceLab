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
import Pages.Page5;
import Pages.Page6;

public class Page6Test extends TestBase{

	LoginPage1 login;
	Page2 inventory;
	Page3 Urcart;
	Page4 checkoutInfo;
	Page5 checkoutOverview;
	Page6 checkoutComplete;
	
	@BeforeMethod
	public void initalizationnTest()throws Exception {
		initalization();
		login=new LoginPage1();
		inventory=new Page2();
		Urcart=new Page3();
		checkoutInfo=new Page4();
		checkoutOverview=new Page5();
		checkoutComplete=new Page6();
		
		login.verifyLoginToApp();
		inventory.VerifyNextPage();
		Urcart.verifyCheckout();
		checkoutInfo.toNextPage5();
		checkoutOverview.verifyFinishBtn();
	}
	
	@Test (enabled=true)
public void verifyHorseLogoTest() throws Exception{
boolean	a=checkoutComplete.verifyHorseLogo();
Assert.assertEquals(a,true);
	}
	
	@Test (enabled=true)
	public void verifyCheckoutCompleteLabelTest()throws Exception {
		String a=checkoutComplete.verifyCheckoutCompleteLabel();
		Assert.assertEquals(a,"CHECKOUT: COMPLETE!");
		System.out.println("Hi");
		
		
	}
	
	@Test (enabled=false)
	public void verifyThankuTextTest() throws Exception{
	String	a=checkoutComplete.verifyThankuText();
	Assert.assertEquals(a,"THANK YOU FOR YOUR ORDER");
	}
	
	@Test  (enabled=false)
	public void verifyorderTextTest()throws Exception {
	String	a=checkoutComplete.verifyorderText();
	Assert.assertEquals(a,"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}
	
	@Test (enabled=false)
	public void verifyHomeBtnTest() throws Exception{
	String	a=checkoutComplete.verifyHomeBtn();
	Assert.assertEquals(a,"BACK HOME");
	}
	
	@Test(enabled=false)
	public void verifyHomeBtnClickTest()throws Exception {
	checkoutComplete.verifyHomeBtnClick();
	String a = driver.getCurrentUrl();
	Assert.assertEquals(a,"https://www.saucedemo.com/inventory.html");
	}
	
	@Test(enabled=false)
	public void verifyAllItemsLinkTest() throws Exception{
	checkoutComplete.verifyOpenMenuBtnClick();
	checkoutComplete.verifyAllItemsLink();
	String	a=driver.getCurrentUrl();
	Assert.assertEquals(a,"https://www.saucedemo.com/inventory.html");
	}
	
	@Test(enabled=false)
	public void verifyAboutLinkTest() throws Exception{
	checkoutComplete.verifyOpenMenuBtnClick();
	checkoutComplete.verifyAboutLink();
	String	a=driver.getCurrentUrl();
	Assert.assertEquals(a,"https://saucelabs.com/");
	}
	
	@Test(enabled=false)
	public void verifyLogoutTest() throws Exception{
	checkoutComplete.verifyOpenMenuBtnClick();
	checkoutComplete.verifyLogout();
	String	a=driver.getCurrentUrl();
	Assert.assertEquals(a,"https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void closeBrowser()throws Exception {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

