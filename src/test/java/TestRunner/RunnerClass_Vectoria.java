package TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import BaseClass.BaseClass1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\feature_file\\Vectoria.feature",
		glue="StepDefinition",
		dryRun = false,
		plugin= {
				"html:Report/Amezon.html",
				"pretty",
				"json:JSONReport/Vectoria.json",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
		}
	
		)

public class RunnerClass_Vectoria extends BaseClass1 {
@BeforeClass
	public static void sessiontart() {
		browserLaunch("chrome");
	}
	
@AfterClass

public static void sessionEnd() {
	close();
}
	
	
	
	
	

}
