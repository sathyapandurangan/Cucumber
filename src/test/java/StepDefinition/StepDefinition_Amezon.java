package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass1;
import POM_Amezon.SearchProduct;
import POM_Amezon.SigninPage;
import PageObjectManager_Amezon.POMAN_Amezon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Amezon extends BaseClass1{
	
	static WebDriver driver = BaseClass1.driver;
	SigninPage sp = new SigninPage(driver);
	POMAN_Amezon manager = new POMAN_Amezon();
	
	@Given("Launch the amezon URL")
	public void launch_the_amezon_url() {
		getUrl("https://www.amazon.in/");
		
	   
	}
	@When("Click the signin button it will navigate to signin page")
	public void click_the_signin_button_it_will_navigate_to_signin_page() {
		click(sp.getsignin1());
	   
	}
	@When("Enter the valid Mail id {string}")
	public void enter_the_valid_mail_id(String mailid) {
		click(sp.getemail());
		sendKey(sp.getemail(), mailid);
		click(sp.getcontinuebtn());
	    
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String password) {
		click(sp.getpassword());
		sendKey(sp.getpassword(), password);
		click(sp.getsignin2());
	    
	}
	@When("click the signin button it will navigate to home page")
	public void click_the_signin_button_it_will_navigate_to_home_page() {
		System.out.println("successfully navigate into home page");
	    
	}
	@When("Click the Search Box to pass Input")
	public void click_the_search_box_to_pass_input() {
		click(manager.getSearch().getsearchbox());
		sendKey(manager.getSearch().getsearchbox(), "mobiles");
	    
	}

	@When("Click the Search Button")
	public void click_the_search_button() {
		click(manager.getSearch().getsearchbtn());
	   
	}

	@When("Select the Perticular Product")
	public void select_the_perticular_product() throws InterruptedException {
		javascript();
		javaScriptclick(manager.getSearch().getmobiles());
		scrollDown(0, 500);
		   
	}

	@When("Click the AddtoCart Button")
	public void click_the_addto_cart_button() {
		windowHandles(1);
		javascript();
		javaScriptclick(manager.getSearch().getaddtocart());
	    
	}

	@Then("Click the cart Button")
	public void click_the_cart_button() throws InterruptedException {
		Thread.sleep(3000);
		javascript();
		javaScriptclick(manager.getSearch().getcart());
	    
	   
	}
	@Then("User Successfully add Product into Cart")
	public void user_successfully_add_product_into_cart() {
	    System.out.println("User successfully add the perticular product into cart");
	}






	
}
