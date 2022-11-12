package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Page4 extends TestBase{
//findby
		@FindBy(xpath="//input[@id='first-name']")private WebElement firstName;
		@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
		@FindBy(xpath="//input[@id='postal-code']")private WebElement postalCode;
		@FindBy(xpath="//span[contains(text(),'Checkout: Your Information')]")private WebElement chekoutLabel;
		@FindBy(xpath="//input[@id='continue']")private WebElement continueBtn;
		
//constructor
		public Page4() {
			PageFactory.initElements(driver, this);
		}
		
//methods

//Method to verify the label on page 4
		public String verifyPage4Label() {
			String value = chekoutLabel.getText();
			return value;
		}
		
//method to enter the value in the First name
			public void verifyFirstName() {
			firstName.sendKeys("ABCD");
			}
		
	//method to enter the value in the last name
				public void verifyLastName() {
				lastName.sendKeys("WXYZ");
				}

	//method to enter the value in the postal code
				public void verifyPostalCode() {
				postalCode.sendKeys("1234");
				}
	//method to go to the nextPage			
				public void verifyContinueBtn() {
					continueBtn.click();
				}
				
				public void toNextPage5() {
					firstName.sendKeys("ABCD");
					lastName.sendKeys("WXYZ");
					postalCode.sendKeys("1234");
					continueBtn.click();
				}
				
				
				
				
				
				
				
				
				
				
	}


