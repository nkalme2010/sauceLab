package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Page3 extends TestBase {
	
	//object Repository
	@FindBy(xpath="//div[@class='inventory_item_name']")private List<WebElement> products;
	@FindBy(xpath="//div[@class='inventory_item_name']")private List<WebElement> productsName;
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Backpack')]")private WebElement product1;
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Bike Light')]")private WebElement product2;
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")private WebElement product3;
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Fleece Jacket')]")private WebElement product4;
	@FindBy(xpath="//div[contains(text(),'Sauce Labs Onesie')]")private WebElement product5;
	@FindBy(xpath="//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]")private WebElement product6;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkout;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartBadge;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removeShirt1;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")private WebElement removeshirt2;
	
	
	//constructor
	public Page3() {
		PageFactory.initElements(driver,this);
	}
	
	//methods to verify the no of products is in the cart
	public int verifyNoOfProducts() {
		int Number = products.size();
		return Number;
		}

	//method to verify the no of products name in the cart
/*	public String verifyProductsName() {
		for(int i=0;i<6;i++) {
			String name = productsName.get(i).getText();
			return ;
		}
	}
*/	
	//Method to removal of 2 products in the cart
	public String verifyRemovalOf2Products() {
		removeShirt1.click();
		removeshirt2.click();
		String count = cartBadge.getText();
		return count;
	}
	//Method to verify ProductName1
		public String verifyProduct1()
		{
			String a = product1.getText();
			return a;	
		}
		
		//Method to verify ProductName2
		public String verifyProduct2()
		{
			String a = product2.getText();
			return a;	
		}
		
		//Method to verify ProductName3
		public String verifyProduct3()
		{
			String a = product3.getText();
			return a;	
		}
		
		//Method to verify ProductName4
		public String verifyProduct4()
		{
			String a = product4.getText();
			return a;	
		}
		
		//Method to verify ProductName5
		public String verifyProduct5()
		{
			String a = product5.getText();
			return a;	
		}
		
		//Method to verify ProductName6
				public String verifyProduct6()
				{
					String a = product6.getText();
					return a;	
				}
		
		//Method to checkout
				public void verifyCheckout() {
					checkout.click();
				}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

