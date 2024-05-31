package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition_facebook {
	static WebDriver driver;
	
	
	
	@Given("User landed The Facebook Page")
	public void user_landed_the_facebook_page() {
	     driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
		
	}
	@When("User Enter The User Name In User Name Feild {string}")
	public void user_enter_the_user_name_in_user_name_feild(String username) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		
	}
	@And("User Enter The Password Feild {string}")
	public void user_enter_the_password_feild(String password) {
		
		driver.findElement(By.id("pass")).sendKeys(password);   
		
	}
	@And("User Click The Login Button")
	public void user_click_the_login_button() {
	    
		driver.findElement(By.name("login")).click();
	}
	@Then("User Navigate To The Home Page")
	public void user_navigate_to_the_home_page() {
		
		System.out.println("User entered into the home page");
	    
		
	}



}
