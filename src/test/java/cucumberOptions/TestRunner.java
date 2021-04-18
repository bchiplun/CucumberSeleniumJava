package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Here we execute the code using feature file and step definition file

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature" ,  //here we are not writing file name as we need to run all feature files from d=feature package
		//features = "src/test/java/feature/WebAndMobile.feature" ,   //We can specify and particlar file name if needed eg "src/test/java/features/login.feature"
		
		//glue = "stepDefinitions" , strict=true, monochrome=true,
		//glue = "stepDefinitions", tags="@Tag2"
		//glue = "stepDefinitions", tags="@Tag1, @Tag3", strict=true, monochrome=true
		
		glue = "stepDefinitions", tags="@Selenium1", strict=true, monochrome=true,
		
		//for reports
		plugin = {"pretty","html:target/cucmber", "json:target/cuc.json", "junit:target/cuk.xml"}
		)
public class TestRunner {
	
	

}
