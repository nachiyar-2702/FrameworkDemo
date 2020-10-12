package automation.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.AlertStepLibrary;
import automation.steplibraries.DatePickersStepLibrary;
import automation.steplibraries.TableStepLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlertSteps extends AlertStepLibrary {

	// BACKGROUND//
	@Given("^user launches \"([^\"]*)\" url to play around Alert$")
	public void user_launches_url_to_play_around_Alert(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(arg1);
		Thread.sleep(5000);
		popUpHandle();
	
	}

	@When("^user clicks Alerts Link$")
	public void user_clicks_Alerts_Link() throws Throwable {
		alertClick();
	
	}

	@Then("^links under Alerts are displayed$")
	public void links_under_Alerts_are_displayed() throws Throwable {

	
	}

	@Given("^user clicks BootStrap Alerts$")
	public void user_clicks_BootStrap_Alerts() throws Throwable {
		bootStartAlertClick();
	
	}

	@When("^user taps on autoclosable success alert$")
	public void user_taps_on_autoclosable_success_alert() throws Throwable {
		successAlertValidation();
	
	}

	@Then("^user sees warning that are auto closable$")
	public void user_sees_warning_that_are_auto_closable() throws Throwable {

	
	}
	
	//BOOTSTRAP MODALS
	
	@Given("^user clicks BootStrap Modals$")
	public void user_clicks_BootStrap_Modals() throws Throwable {
		//singleModalValidation();
		//multipleModalValidation();
		//windowPopUpValidation();
		//progressBarModal();
		//alertHandle3();
		fileDownload();
	}

	@When("^user taps on single Modal Example$")
	public void user_taps_on_single_Modal_Example() throws Throwable {

	
	}

	@Then("^user sees Modal Window with options$")
	public void user_sees_Modal_Window_with_options() throws Throwable {

	
	}
	
}
