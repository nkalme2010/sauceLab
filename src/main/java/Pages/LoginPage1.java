package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.configProp;

//here in this class we created the methods of 1st login page
public class LoginPage1 extends TestBase {
		//object Repository
	@FindBy(xpath="//div[@class='login_logo']")private WebElement logo1;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement logo2;
	@FindBy(xpath="//input[@id='user-name']")private WebElement userName;
	@FindBy(xpath="//input[@id='password']")private WebElement Password;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBrn;
	@FindBy(xpath="//span[contains(text(),Products)][1]")private WebElement products;
	@FindBy(xpath="//div[@class='peek']")private WebElement logo3;
	@FindBy(xpath="//img[@class='footer_robot']")private WebElement logo4;
	
	
	//construcor
	public LoginPage1()
	{
		PageFactory.initElements(driver,this);
	}
	
		//creating the method to verify the title
	public String verifyTitle() {
	return	driver.getTitle();
	}
	
		//creating the method to verify the url
	public String verifyUrl() {
		return driver.getCurrentUrl();
	}
	
		//creating the method to verify the logo1
	public boolean verifyLogo1() {
	boolean logo = logo1.isDisplayed();
	return logo;	
	}

		//creating the method to verify the logo2
	public boolean verifyLogo2() {
	boolean logo = logo2.isDisplayed();
	return logo;
	}

		//creating the method to verify the login to app by using valid credentials
	public void verifyLoginToApp() throws Exception {
		userName.sendKeys(configProp.configPropData("username"));
		Password.sendKeys(configProp.configPropData("password"));
		loginBrn.click();
	}

		//creating the method to verify the login to app is successful or not
	public String verifyLoginToAppIsSuccessful() throws Exception {
		verifyLoginToApp();
		String productsLabel =products.getText();
		return productsLabel;	
	}

		//creating the method to verify the login to app is successful via checking logos
	public boolean verifyLoginToAppIsSuccessful2() throws Exception {
		verifyLoginToApp();
		boolean topLogo = logo3.isDisplayed();
		boolean footerLogo = logo4.isDisplayed();
		return footerLogo;
		
	}
	













































}
