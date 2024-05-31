package POM_Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass1;

public class SearchProduct extends BaseClass1{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement mobiles;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addtocart;
	
	@FindBy(id="attach-sidesheet-view-cart-button-announce")
	private WebElement cart;
	
	public SearchProduct(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getsearchbtn() {
		return searchbtn;
	}
	
	public WebElement getsearchbox() {
		return searchbox;
	}
	
	public WebElement getmobiles() {
		return mobiles;
	}
	
	public WebElement getaddtocart() {
		return addtocart;
	}
	public WebElement getcart() {
		return cart;
	}
}
