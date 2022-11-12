package TestCase;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage1;
import Utility.ReadData;
import Utility.Screenshot;

public class LoginPage1Test extends TestBase {
	LoginPage1 login;

	@BeforeMethod
	public void initalizationTest() throws Exception {
		initalization();
		login=new LoginPage1();
	}
		
	@Test (enabled = true,priority=-1,description="Title Test",timeOut=10000)
	public void verifyTitleTest() {
		String act = login.verifyTitle();
		try {
			Assert.assertEquals(act,ReadData.excelFile(0,0));
		} catch (Exception e) {}
		System.out.println("-1");
	}

	@Test (enabled = true,priority=1,invocationCount=3 )
	public void verifyUrlTest() throws Exception {
		String act=login.verifyUrl();
		Assert.assertEquals(act,ReadData.excelFile(1, 0));
		System.out.println("1");
		}

	@Test (enabled = true,priority=2)
	public void verifyLogo1Test() throws Exception {
		boolean logo1 = login.verifyLogo1();
		Assert.assertEquals(logo1,true);
		System.out.println("2");
		}
	
	@Test (enabled = true,priority=3)
	public void verifyLogo2() {
		boolean logo2=login.verifyLogo2();
		Assert.assertEquals(logo2, true);
		System.out.println("3");
		}
	
	@Test(enabled = true,priority=4)
	public void verifyLoginToAppTest() throws Exception {
		login.verifyLoginToApp();
		System.out.println("4");
	}
	
	@Test (enabled =true,priority=5, dependsOnMethods="verifyLoginToAppTest")
	public void verifyLoginToAppIsSuccessfulTest() throws Exception {
		login.verifyLoginToAppIsSuccessful();
		System.out.println("5");
	}
	
	@Test(enabled = true,priority=6, dependsOnMethods="verifyLoginToAppTest")
	public void verifyLoginToAppIsSuccessful2Test() throws Exception {
		login.verifyLoginToAppIsSuccessful2();
		System.out.println("6");
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception {
		if(ITestResult.FAILURE==it.getStatus())
		{
			Screenshot.screenshotMethod(it.getName());
		}
		
		driver.close();
	}
	
}
