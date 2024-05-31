package POM_Vectoria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vectoria_AddCustomer {
  WebDriver driver;
	
	@FindBy(xpath = "(//i[@class='right fas fa-angle-left '])[4]")
	private WebElement customers1;
	
	@FindBy(xpath="//p[text()=' Customers']")
	private WebElement customers2;

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement Addnew;
	
	@FindBy(xpath="(//input[@class='form-control text-box single-line'])[1]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement password;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(id="Gender_Female")
	private WebElement gender;
	
	@FindBy(id="DateOfBirth")
	private WebElement dateofbirth;
	
	@FindBy(xpath="(//input[@class='form-control text-box single-line'])[4]")
	private WebElement company;
	
	@FindBy(id="IsTaxExempt")
	private WebElement istaxexempt;
	
	@FindBy(id="save")
	private WebElement save;

	public Vectoria_AddCustomer(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getCustomers1() {
		return customers1;
	}

	public WebElement getCustomers2() {
		return customers2;
	}

	public WebElement getAddnew() {
		return Addnew;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getDateofbirth() {
		return dateofbirth;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getIstaxexempt() {
		return istaxexempt;
	}

	

	

	
	
}
