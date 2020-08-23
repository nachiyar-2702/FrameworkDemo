package automation.runner;


 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= {"automation.stepdefinitions"},tags= {"@S-01"})
public class TestRunner {
 
}
	
	
