package POM_Vectoria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vectoria_LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='email valid']")
	private WebElement emailid;
	
	@FindBy(xpath = "//input[@value='admin']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	public Vectoria_LoginPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getEmailid() {
		return emailid;
	}


	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
