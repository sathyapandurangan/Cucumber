package POM_Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	private WebElement signin1;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signin2;
	
	public SigninPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getsignin1() {
		return signin1;
	}
	
	public WebElement getemail() {
		return email;
	}
	
	public WebElement getcontinuebtn() {
		return continuebtn;
	}
	
	public WebElement getpassword() {
		return password;
		
	}
	
	public WebElement getsignin2() {
		return signin2;
	}
	
	
	
	

}
