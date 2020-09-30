package automation.stepdefinitions;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.InputFormSubmitLibrary;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InputFormsSubmitSteps extends InputFormSubmitLibrary {
   
	//**************BackGround***************//
	
		@Given("^user launches \"([^\"]*)\"$")
		public void user_launches(String url) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
			testContext.setWebDriverImpl(new ChromeDriver());
			testContext.getWebDriverImpl().initializeDriver();
			testContext.getWebDriverImpl().driver.manage().window().maximize();
			testContext.getWebDriverImpl().getBrowserdriver().get(url);
			Thread.sleep(5000);
			popUpHandle();
		}

		@When("^user clicks InputForms Link$")
		public void user_clicks_InputForms_Link() throws Throwable {
			inputFormsClick();

		}

		@Then("^links under InputForms are displayed$")
		public void links_under_InputForms_are_displayed() throws Throwable {
	    
		}
		
		// Actual INPUTFORM STEP//
		
	@Given("^user is in Input Form Submit page$")
	public void user_is_in_Input_Form_Submit_page() throws Throwable {
		dropdownClick();
	}

	@When("^user select provides values in all fields$")
	public void user_select_provides_values_in_all_fields(DataTable dt) throws Throwable {
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   List<Map<String,String>> listOfMap = dt.asMaps(String.class, String.class);
	   enterNameValues(listOfMap.get(0).get("First Name"),listOfMap.get(0).get("Last Name"));
	   selectState(listOfMap.get(0).get("State"));
	   
	}

	@Then("^user clicks send button to submit$")
	public void user_clicks_send_button_to_submit() throws Throwable {
	   
		
	}
	
	
	// AJAX FORM SUBMIT //
	
	@Given("^user is in Ajax Form Submit Page$")
	public void user_is_in_Ajax_Form_Submit_Page() throws Throwable {
		ajaxSubmitClick();
	}

	@When("^user enter values in all fields and clicks Submit$")
	public void user_enter_values_in_all_fields_and_clicks_Submit(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	 
		List<String> list=dt.asList(String.class);
		enterAjaxValues(list.get(0),list.get(1));
		
	}

	@Then("^submitted message displays$")
	public void submitted_message_displays() throws Throwable {
		ajaxSubmitMessageVerify();
	}
	
	// JQUERY SELECT DROPDOWN//
	
	@Given("^user is in JQuery select dropdown page$")
	public void user_is_in_JQuery_select_dropdown_page() throws Throwable {
		jQueryDropdownClick();
		Thread.sleep(5000);
	}

	@When("^user enters a value \"([^\"]*)\" and select dropdown$")
	public void user_enters_a_value_and_select_dropdown(String arg1) throws Throwable {
		selectCountryClick();
		enterCountryValue(arg1);
	}

	@Then("^country is selected$")
	public void country_is_selected() throws Throwable {
		selectedCountryVerify();
	}
	
	//JQUERY SELECT DROPDOWN2//
	
	@When("^user selects dropdown from State \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_dropdown_from_State_and(String arg1, String arg2) throws Throwable {
		selectState(arg1,arg2);
	}

	@Then("^state is selected$")
	public void state_is_selected() throws Throwable {

	
	}

	//JQUERY SELECT DROPDOWN3
	
	@When("^user selects dropdown from files \"([^\"]*)\"$")
	public void user_selects_dropdown_from_files(String arg1) throws Throwable{

		selectFile(arg1);
	}

	@Then("^files is selected$")
	public void files_is_selected() throws Throwable {

	
	}

}
