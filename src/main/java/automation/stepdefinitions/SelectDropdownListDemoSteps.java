package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.SelectDropdownListDemoLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectDropdownListDemoSteps extends SelectDropdownListDemoLibrary{

	
   
	//*********Multiple Dropdown***********//
	
	@Given("^user is in dropdown demo page$")
	public void user_is_in_dropdown_demo_page() throws Throwable {
		selectDropdown();
	}

	@When("^user select multiple value \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_multiple_value_and(String arg1, String arg2) throws Throwable {
		MulDropdownValuesSelect(arg1);
		MulDropdownValuesSelect(arg2);
		clickGetAllSelected();
	}

	@Then("^multiple dropdown texts are displayed$")
	public void multiple_dropdown_texts_are_displayed() throws Throwable {
		dropdownValuesVerify();
	}
	
	@Given("^launch \"([^\"]*)\" and go to dropdown demo$")
	public void launch_and_go_to_dropdown_demo(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		Thread.sleep(5000);
		popUpHandle();
		dropdownClick();
	}
	
	@When("^user select single value \"([^\"]*)\"$")
	public void user_select_single_value(String arg1)  throws Throwable {
		dropdownValuesSelect(arg1);
	}

	@Then("^selected dropdown texts  are displayed$")
	public void selected_dropdown_texts_are_displayed() throws Throwable {
		dropdownValuesVerify();
	}
	
}
