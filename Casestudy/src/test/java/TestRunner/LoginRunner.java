package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features" , glue={ "casestudy" } , tags="@product", plugin = {"pretty","json:target/cucumber.json"})
public class LoginRunner {
	
}
