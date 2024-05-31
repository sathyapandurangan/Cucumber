package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src\\test\\java\\feature_file\\facebook.feature",
		glue="StepDefinition",
		plugin = {
				"html:Report/facebook.html",
				"pretty",
				"json:JsonReport/facebook.json"
				
				
		}
		
		
		)


public class RunnerClass_Facebook {

}
