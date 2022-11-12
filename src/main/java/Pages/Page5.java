package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Page5 extends TestBase{
	//FindBy
	@FindBy(xpath="//span[contains(text(),'Checkout: Overview')]")private WebElement overviewLabel;
	@FindBy(xpath="//div[@class='inventory_item_name']")private List<WebElement> products;
	@FindBy(xpath="//div[contains(text(),'SauceCard #31337')]")private WebElement paymentInfo;
	@FindBy(xpath="//div[contains(text(),'FREE PONY EXPRESS DELIVERY!')]")private WebElement shippingInfo;
	@FindBy(xpath="//div[@class='summary_subtotal_label']")private WebElement totalSummary;
	@FindBy(xpath="//div[@class='summary_tax_label']")private WebElement tax;
	@FindBy(xpath="//div[@class='summary_total_label']")private WebElement total;
	@FindBy(xpath="//button[@id='finish']")private WebElement finishBtn;
	
	
	
	//Constructor
	public Page5() {
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	
//method to verify the newpage is open or not
	public String verifyOverviewLabel() {
	String label1 = overviewLabel.getText();
	return label1;
	}

//method to verify the no of products in final checkdown
	public int verifyFinalChekdown() {
		int num = products.size();
		return num;
	}
	
//method to verify the payment info
	public String verifypaymentInfo() {
		String info = paymentInfo.getText();
		return info;
	}

//method to verify the shipping info
		public String verifyShippingInfo() {
			String info = shippingInfo.getText();
			return info;
		}
//method to verify the payment info
		public String verifyItemTotal() {
			String info = totalSummary.getText();
			return info;
		}

	//method to verify the tax
	public String verifytax() 
	{
	String info = tax.getText();
	return info;
	}
	
//method to verify the total
public String verifyTotal() {
String info = total.getText();
return info;
}


//method to verify finish btn 
public void verifyFinishBtn() {
 finishBtn.click();
}

























}