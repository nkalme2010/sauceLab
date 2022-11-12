package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.configProp;
import io.github.bonigarcia.wdm.WebDriverManager;


//This class is exended to all other classes of pages and testcases
public class TestBase {
	
	public static WebDriver driver;			//driver is a global variable
											//public access modifier is used to acces this variable throughout the package
											//static keyword is used because it serves only one copy driver throughout the project
	
	//This is intialization method used to Open the Browser and url of application
	public void initalization() throws Exception {
		
		String Browser=configProp.configPropData("browser");
		if(Browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(Browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
	//	WebDriverManager.chromedriver().setup();
	//	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.saucedemo.com/");
		driver.get(configProp.configPropData("url"));

	}
}
//I made some changes in the code
//code is updated 