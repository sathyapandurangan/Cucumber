package StepDefinition;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass1;
import PageObjectManager_Vectoria.POMAN_Vectoria;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitin_Vectoria extends BaseClass1 {
	
	static WebDriver driver = BaseClass1.driver;
	POMAN_Vectoria vectoria = new POMAN_Vectoria();
	
	@Given("User Entered into The signin Page")
	public void user_entered_into_the_signin_page() {
		getUrl("https://admin-demo.nopcommerce.com/admin/");
	}

	@When("User Enter The Valid Mailid")
	public void user_enter_the_valid_mailid() {
		click(vectoria.getLog().getEmailid());
		sendKey(vectoria.getLog().getEmailid(), "sathyapandurangan92@gmail.com");	
		
	}

	@And("User Enter The Valid Password")
	public void user_enter_the_valid_password() {
		click(vectoria.getLog().getPassword());
		sendKey(vectoria.getLog().getPassword(), "sathya1992");
	}

	@And("User Click The login Button")
	public void user_click_the_login_button() {
		click(vectoria.getLog().getLoginbtn());
	}

	@Then("User Ssuccessfully Enter into Home Page")
	public void user_ssuccessfully_enter_into_home_page() {
		System.out.println("User successfully entered into home page");
	}

	@When("User Click The Customers")
	public void user_click_the_customers() {
	}

	@And("User Click The Customers from Coustomers options")
	public void user_click_the_customers_from_coustomers_options() {
	}

	@When("User Click Add New Button")
	public void user_click_add_new_button() {
		
	}
	@When("User Enter The Valid Mailid For New Customer")
	public void user_enter_the_valid_mailid_for_new_customer() {
		
	}
	@When("User Enter The Password")
	public void user_enter_the_password() {
	    
	}

	@And("User Enter The First Name")
	public void user_enter_the_first_name() {
	}

	@And("User Enter The Last Name")
	public void user_enter_the_last_name() {
	}

	@And("User Enter The Date Of Birth")
	public void user_enter_the_date_of_birth() {
	}
	@When("User Enter The Gender")
	public void user_enter_the_gender() {
	    
	}

	@When("User Enter The Company Name")
	public void user_enter_the_company_name() {
	    
	}

	@When("User Pass Last istaxexempty")
	public void user_pass_last_istaxexempty() {
	    
	}

	@And("Customer Click Save Button")
	public void customer_click_save_button() {
	   
	}
	@When("Customer Enter Emailid")
	public void customer_enter_emailid() {
	    
	}

	@When("Click Search Button")
	public void click_search_button() {
	   
	}



}
