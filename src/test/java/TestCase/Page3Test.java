package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage1;
import Pages.Page2;
import Pages.Page3;

public class Page3Test extends TestBase {
	LoginPage1 login;
	Page2 inventory;
	Page3 Urcart;
	
	@BeforeMethod
	public void initalizationTest() throws Exception{
		initalization();
		login=new LoginPage1();
		inventory=new Page2();
		Urcart=new Page3();	
		login.verifyLoginToApp();
		inventory.VerifyNextPage();
	}
	
	@Test (enabled=false,alwaysRun=true)
	public void verifyNoOfProductsTest() throws Exception{
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		int value = Urcart.verifyNoOfProducts();
		Assert.assertEquals(value,6);
		}
	
/*	@Test(enabled=false)
	public void verifyProductsNametest() {
		login.verifyLoginToApp();
		inventory.VerifyNextPage();
		Urcart.verifyProductsName();	
	}
*/
	@Test(enabled=false)
	public void verifyRemovalOf2ProductsTest() throws Exception{
		String value = Urcart.verifyRemovalOf2Products();
		Assert.assertEquals(value,"4");
		
	}
	
	@Test(enabled=false)
	public void verifyProductName1Test() throws Exception{
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct1();
		Assert.assertEquals(result,"Sauce Labs Backpack");
		
	}
	
	@Test (enabled=false)
	public void verifyProductName2Test()throws Exception {
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct2();
		Assert.assertEquals(result,"Sauce Labs Bike Light");		
	}
	
	@Test  (enabled=false)
	public void verifyProductName3Test() throws Exception{
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct3();
		Assert.assertEquals(result,"Sauce Labs Bolt T-Shirt");		
	}
	
	@Test  //(enabled=false)
	public void verifyProductName4Test() throws Exception{
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct4();
		Assert.assertEquals(result,"Sauce Labs Fleece Jacket");		
	}
	
	@Test  //(enabled=false)
	public void verifyProductName5Test() throws Exception{
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct5();
		Assert.assertEquals(result,"Sauce Labs Onesie");		
	}
	
	@Test (enabled=false)
	public void verifyProductName6Test()throws Exception {
		//login.verifyLoginToApp();
		//inventory.VerifyNextPage();
		String result = Urcart.verifyProduct6();
		Assert.assertEquals(result,"Test.allTheThings() T-Shirt (Red)");		
	}
	
	@Test (enabled=false)
	public void verifyCheckoutTest() throws Exception{
		Urcart.verifyCheckout();
		String nexturl = driver.getCurrentUrl();
		Assert.assertEquals(nexturl,"https://www.saucedemo.com/checkout-step-one.html");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() throws Exception{
		driver.close();
	}

}
