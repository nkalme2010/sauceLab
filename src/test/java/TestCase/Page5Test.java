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

public class Page5Test extends TestBase {
	LoginPage1 login;
	Page2 inventory;
	Page3 Urcart;
	Page4 checkoutInfo;
	Page5 checkoutOverview;
	
	@BeforeMethod
	public void initalizationnTest() throws Exception {
		initalization();
		login=new LoginPage1();
		inventory=new Page2();
		Urcart=new Page3();
		checkoutInfo=new Page4();
		checkoutOverview=new Page5();
		
		login.verifyLoginToApp();
		inventory.VerifyNextPage();
		Urcart.verifyCheckout();
		checkoutInfo.toNextPage5();
	}
	
	@Test //(enabled=false)
	public void verifyOverviewLabelTest() throws Exception{
		 String a = checkoutOverview.verifyOverviewLabel();
		Assert.assertEquals(a,"CHECKOUT: OVERVIEW");
		}
	
	@Test //(enabled=false)
	public void verifyNoOfProductsTest() throws Exception{
		int cartAdded = Urcart.verifyNoOfProducts();
		int finalCart = checkoutOverview.verifyFinalChekdown();
		Assert.assertEquals(cartAdded, finalCart);	
		System.out.println(cartAdded);
		System.out.println(finalCart);
		}
	
	@Test //(enabled=false)
	public void verifypaymentInfoTest() throws Exception{
		String a = checkoutOverview.verifypaymentInfo();
		Assert.assertEquals(a,"SauceCard #31337");
	}
	
	@Test //(enabled=false)
	public void verifyShippingInfoTest()throws Exception{
		String a = checkoutOverview.verifyShippingInfo();
		Assert.assertEquals(a,"FREE PONY EXPRESS DELIVERY!");
	}
	
	@Test //(enabled=false)
	public void verifyItemTotalTest()throws Exception{
		String a = checkoutOverview.verifyItemTotal();
		Assert.assertEquals(a,"Item total: $129.94");
	}
	
	@Test
	public void verifyTaxTest() throws Exception{
		String a = checkoutOverview.verifytax() ;
		Assert.assertEquals(a,"Tax: $10.40");
	}
	
	@Test
	public void verifyTotalTest() throws Exception{
		String a = checkoutOverview.verifyTotal();
		Assert.assertEquals(a,"Total: $140.34");
	}
	
	@Test
	public void verifyFinishBtn() throws Exception{
		checkoutOverview.verifyFinishBtn();
		String a = driver.getCurrentUrl();
		Assert.assertEquals(a,"https://www.saucedemo.com/checkout-complete.html");
	}
	

	@AfterMethod
	public void closeBrowser() throws Exception{
		driver.close();
	}
	

}
