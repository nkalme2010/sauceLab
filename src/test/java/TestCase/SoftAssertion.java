package TestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage1;
import Utility.ReadData;

public class SoftAssertion extends TestBase{
	LoginPage1 login;
	@BeforeMethod
	public void setup() throws Exception {
		initalization();
		login=new LoginPage1();
	}
	
	@Test
	public void logoTest()	
	{
		SoftAssert soft=new SoftAssert();
		boolean a = login.verifyLogo1();
		soft.assertEquals(a,false);
		System.out.println("using softAssert");
		soft.assertAll();
		
	}

	@Test (enabled = false,priority=1,invocationCount=0 )
	public void verifyUrlTest() throws Exception
	{
		String act=login.verifyUrl();
		Assert.assertEquals(act,ReadData.excelFile(1, 0));
		System.out.println("1");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
