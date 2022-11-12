package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Page6 extends TestBase{
	//findby
	@FindBy(xpath="//img[@alt='Pony Express']")private WebElement Horselogo;
	@FindBy(xpath="//span[contains(text(),'Checkout: Complete!')]")private WebElement checkoutComplete;
	@FindBy(xpath="//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")private WebElement thankuText;
	@FindBy(xpath="//div[contains(text(),'Your order has been dispatched,')]")private WebElement orderText;
	@FindBy(xpath="//button[contains(text(),'Back Home')]")private WebElement homeBtn;
	
	@FindBy(xpath="//button[contains(text(),'Open Menu')]")private WebElement openMenu;
	@FindBy(xpath="//a[contains(text(),'All Items')]")private WebElement allItems;
	@FindBy(xpath="//a[contains(text(),'About')]")private WebElement about;
	@FindBy(xpath="//a[contains(text(),'Logout')]")private WebElement logout;
	@FindBy(xpath="//a[contains(text(),'Reset App State')]")private WebElement resetAppState;

	
	//constructor
public Page6() {
	PageFactory.initElements(driver,this);
}
	
	
	//methods
//Method to verify the Horse Logo
public boolean verifyHorseLogo() {
	boolean result = Horselogo.isDisplayed();
	return result;
}
 
//Method to verify The Checkout Complete Label
public String verifyCheckoutCompleteLabel() {
	String result = checkoutComplete.getText();
return result;
}

//Method to verify Thank u text
public String verifyThankuText() {
	String result = thankuText.getText();
return result;
}

//Method to verify Order Text
public String verifyorderText() {
	String result = orderText.getText();
return result;
}

//Method to verify The HomeButton text
public String verifyHomeBtn() {
	String result = homeBtn.getText();
return result;
}

//Method to verify the HomeButton clickable or not
public void verifyHomeBtnClick() {
	homeBtn.click();
}

//Method to verify the open menu Button is clickable or not
public void verifyOpenMenuBtnClick() {
	openMenu.click();
}

//Method to verify the All items link is clickable or not
public void verifyAllItemsLink() {
	allItems.click();
}

//Method to verify the about link is clickable or not
public void verifyAboutLink() {
	about.click();
}

//Method to verify logout  is clickable or not
public void verifyLogout() {
	logout.click();
}
































}
