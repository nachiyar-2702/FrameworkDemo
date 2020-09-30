package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.MutlipleCheckBoxLibrary;
//import automation.steplibraries.SingleCheckBoxLibrary; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleCheckBoxSteps extends MutlipleCheckBoxLibrary {

	@Given("^launch \"([^\"]*)\" and go to checkbox demo to select mutliple checkboxdemo$")
	public void launch_and_go_to_checkbox_demo_to_select_mutliple_checkboxdemo(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		Thread.sleep(5000);
		popUpHandle();

	}

	@When("^user checks all button$")
	public void user_checks_all_button() throws Throwable {

		multipleCheckAllClick();
	}

	@Then("^all the options are checked$")
	public void all_the_options_are_checked() throws Throwable {
		checkAllOptions();
		verifyUnCheckAll();
		testContext.getWebDriverImpl().browserdriver.close();

	}

}
