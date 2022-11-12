package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class Page2 extends TestBase {
	
	@FindBy(xpath="//img[@class='footer_robot']")private WebElement smallLogo1;
	@FindBy(xpath="//div[@class='peek']")private WebElement largeLogo1;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement dropDown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement product1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement product2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement product3;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement product4;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement product5;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement product6;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartBadge;
	@FindBy(xpath="//a[contains(text(),'Twitter')]")private WebElement twitter;
	@FindBy(partialLinkText="Twitt")private WebElement twitter2;
	@FindBy(xpath="//a[contains(text(),'Facebook')]")private WebElement facebook;
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]")private WebElement linkedin;
	@FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement cart;
	@FindBy(xpath="//span[contains(text(),'Your Cart')]")private WebElement yourCart;
	
	
	
	
	//constructor
	public Page2() {
	PageFactory.initElements(driver, this);
	}
	
	//creating the method to verify the visisbility of small logo
	public boolean verifySmallLogo() {
		boolean logo = smallLogo1.isDisplayed();
		return logo;
	}
	
	//creating the method to verify the visibility of large logo
	public boolean verifyLargeLogo() {
		boolean logo=largeLogo1.isDisplayed();
		return logo;		
	}
	
	//creating the method to add 6 products in the cart
		public String verifyAdd6Products() {
		Select s=new Select(dropDown);
		s.selectByVisibleText("Price (high to low)");
		product1.click();
		product2.click();
		product3.click();
		product4.click();
		product5.click();
		product6.click();
		String count = cartBadge.getText();
		return count;	
	}

		//creating the method to remove 2 products in the cart
		/*		public String verifyRemovalOf2Products() {
				cartBadge.click();
				removeShirt1.click();
				removeshirt2.click();
				Select s=new Select(dropDown);
				s.selectByVisibleText("Price (high to low)");
				product1.click();
				product2.click();
				product3.click();
				product4.click();
			//	product5.click();
			//	product6.click();	
			String count = cartBadge.getText();
			return count;	
		} */
			
			//create Method for Next Page
			public void VerifyNextPage() {
				Select s=new Select(dropDown);
				s.selectByVisibleText("Price (high to low)");
				product1.click();
				product2.click();
				product3.click();
				product4.click();
				product5.click();
				product6.click();
				cart.click();
			}
	
			//create a method to verify the visibilities of twitter
			public boolean verifyTwiter() {
				boolean twit = twitter.isDisplayed();
				return twit;
			}
	
			//create a method to verify the visibilities of twitter
			public boolean verifyFacebook() {
				boolean fb= facebook.isDisplayed();
				return fb;
			}
	
			//create a method to verify the visibilities of twitter
			public boolean verifylinkedin() {
				boolean lnkdn = linkedin.isDisplayed();
				return lnkdn;
			}
	
	//create a method to verify that next page is opened or not
			public String verifyNextPageOpening() {
			cart.click();
			String urcart = yourCart.getText();
			return urcart;
			}
			
	//create a method to verify the Twitter Link is working or not
			public void verifyTwitterLink() {
				twitter2.click();
			
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
