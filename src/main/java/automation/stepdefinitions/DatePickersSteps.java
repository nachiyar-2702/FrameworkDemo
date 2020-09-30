package automation.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.DatePickersStepLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatePickersSteps extends DatePickersStepLibrary {

	// BACKGROUND//
	
	@Given("^user launches \"([^\"]*)\" url to check Date$")
	public void user_launches_url_to_check_Date(String url) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		Thread.sleep(5000);
		popUpHandle();
	}

	@When("^user clicks DatePickers Link$")
	public void user_clicks_DatePickers_Link() throws Throwable {
		datePickersClick();
	
	}

	@Then("^links under DatePickers are displayed$")
	public void links_under_DatePickers_are_displayed() throws Throwable {

	
	}
	
	//BOOTSTRAP DATE PICKERR//
	
	@Given("^user clicks bootstrap date picker$")
	public void user_clicks_bootstrap_date_picker() throws Throwable {
		BootStrapDatePickersClick();
		
	}

	@When("^user plays around the datepicker table$")
	public void user_plays_around_the_datepicker_table() throws Throwable {
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String Date=f.format(date);
		enterDate(Date);

	}

	@Then("^selected and cleared date$")
	public void selected_and_cleared_date() throws Throwable {


	}
}
