package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.SingleCheckBoxLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingleCheckBoxSteps extends SingleCheckBoxLibrary {

	
	@Given("^launch \"([^\"]*)\" and go to checkbox demo$") 
	public void launch_url_and_click_checboxdemo_in_simpleformdemo(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		Thread.sleep(5000);
		popUpHandle();
		
	}
	
	@When("^user checks the box$")
	public void click_on_checkboxdemo_link() {
	
	checkBoxDemoClick();
	}
	
	@Then("^success message is displayed$")
	public void verify_message_after_checkbox_click() {
		checkBoxClickAndMessageVerify();
		testContext.getWebDriverImpl().browserdriver.close();
	}
	
}
