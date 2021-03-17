package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepdefs"},
		monochrome = true
	//tags = {"@SmokeTest"} 
	//- Only SmokeTest
		
//	tags = {"@SmokeTest","@RegressionTest"}  
		//- Marked as Both Smoke and REgression
		
	//	tags = {"@SmokeTest, @RegressionTest"} 
	//	- marked either as smoke or regression
	//	tags = {"not @SmokeTest", "@RegressionTest"}
		//Regression but not smoke
	//	tags = { "@RegressionTest"}
	//	tags = {"@SmokeTest"} 
		//above is specific type in only one feature file
	//	tags = {"@EndtoEndTest"}
		)
public class TagRunner {

}
