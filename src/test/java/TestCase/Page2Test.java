package TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage1;
import Pages.Page2;

public class Page2Test extends TestBase {
	Page2 inventory;
	LoginPage1 login;

	@BeforeMethod
	public void initalizationTest() throws Exception {
		initalization();
		inventory=new Page2();
		login=new LoginPage1();
	}
	
	
	@Test //(enabled=false)
	public void verifySmallLogoTest() throws Exception{
		login.verifyLoginToApp();
		boolean logo = inventory.verifySmallLogo();
		Assert.assertEquals(logo,true);
	}
	
	@Test //(enabled=false)
	public void verifyLargeLogoTest() throws Exception{
		login.verifyLoginToApp();
		boolean logo=inventory.verifyLargeLogo();
		Assert.assertEquals(logo, true);
	}
	
	@Test //(enabled=false)
	public void verifyAdd6ProductsTest() throws Exception {
		login.verifyLoginToApp();
		String count = inventory.verifyAdd6Products();
		Assert.assertEquals(count, "6");
			}
	
/*	@Test (enabled=false)
	public void verifyRemovalOf2ProductsTest() {
		login.verifyLoginToApp();
		
		String count2 = inventory.verifyRemovalOf2Products();
		Assert.assertEquals(count2,"4");
	} */
	
	@Test // (enabled=false)
	public void verifyTwiterTest() throws Exception {
		login.verifyLoginToApp();
		boolean result = inventory.verifyTwiter();
		Assert.assertEquals(result,true);
	}
	
	@Test //(enabled=false)
	public void verifyFacebookTest() throws Exception {
		login.verifyLoginToApp();
		boolean result = inventory.verifyFacebook();
		Assert.assertEquals(result,true);
	}
	
	@Test //(enabled=false)
	public void verifylinkedinTest() throws Exception {
		login.verifyLoginToApp();
		boolean result = inventory.verifylinkedin();
		Assert.assertEquals(result,true);
	}
	
	@Test //(enabled=false)
	public void verifyNextPageOpeningTest() throws Exception {
		login.verifyLoginToApp();
		String result = inventory.verifyNextPageOpening();
		Assert.assertEquals(result,"YOUR CART");
	}
	
/*	@Test
	public void verifyTwitterLinkTest() {
		login.verifyLoginToApp();
		inventory.verifyTwitterLink();
	
		//Assert.assertEquals(result1,"https://twitter.com/saucelabs");
	}
*/	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
