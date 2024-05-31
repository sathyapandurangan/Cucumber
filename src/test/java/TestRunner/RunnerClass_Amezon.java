package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseClass.BaseClass1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\feature_file\\Amezon.feature",
		glue="StepDefinition",
		dryRun = false,
		plugin = {
				"html:Report/Amezon.html",
				"pretty",
				"json:JSONReport/Amezon.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"				
		}	
		
		)

public class RunnerClass_Amezon extends BaseClass1 {
	@BeforeClass
	public static void sessionStart() {
		browserLaunch("chrome");
	}
	@AfterClass
	public static void sessionEnd() {
		close();
	}

}
