package automation.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.DatePickersStepLibrary;
import automation.steplibraries.TableStepLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TableSteps extends TableStepLibrary {

	// BACKGROUND//
	


	@Given("^user launches \"([^\"]*)\" url to play around Table$")
	public void user_launches_url_to_play_around_Table(String url) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		Thread.sleep(5000);
		popUpHandle();
	}

	@When("^user clicks Table Link$")
	public void user_clicks_Table_Link() throws Throwable {

		tableClick();
	}

	@Then("^links under Table are displayed$")
	public void links_under_Table_are_displayed() throws Throwable {
		
	}

	@Given("^user clicks Table Pagination$")
	public void user_clicks_Table_Pagination() throws Throwable {
		tablePaginationClick();
		Thread.sleep(2000);
	}

	@When("^user lands on pagination page clicks on next symbol$")
	public void user_lands_on_pagination_page_clicks_on_next_symbol() throws Throwable {
		clickNextLink();
	}

	@Then("^user goes to second page that has (\\d+) records$")
	public void user_goes_to_second_page_that_has_records(int arg1) throws Throwable {
		tableValidation();
	}

	@Then("^both prev and next buttons are enabled$")
	public void both_prev_and_next_buttons_are_enabled() throws Throwable {

	}

	// TABLE DATA SEARCH
	
	@Given("^user clicks Table Data Search$")
	public void user_clicks_Table_Data_Search() throws Throwable {

		//tableClick();
		tableDataSearchClick();
		Thread.sleep(4000);
		
	}

	@When("^user types in term to search \"([^\"]*)\"$")
	public void user_types_in_term_to_search(String arg1) throws Throwable {
		enterSearchTerm(arg1);
		validateSearchResults(arg1);
	}

	@Then("^user sees results relevant to search term$")
	public void user_sees_results_relevant_to_search_term() throws Throwable {
		
	}
	
	//TABLE FILTER
	
	@Given("^user clicks Table Data Filter$")
	public void user_clicks_Table_Data_Filter() throws Throwable {
		tableDataFilterClick();
	}

	@When("^user clicks Green$")
	public void user_clicks_Green() throws Throwable {

	
	}

	@Then("^user sees results green value$")
	public void user_sees_results_green_value() throws Throwable {

		validateFilterResults();
	}
	
	
	// TABLE SORT
	
	@Given("^user clicks Table Sort$")
	public void user_clicks_Table_Sort() throws Throwable {
		tableSortClick();
	}

	@When("^user clicks Positionn column to Sort$")
	public void user_clicks_Positionn_column_to_Sort() throws Throwable {
		verifySorting();
	}

	@Then("^user sees sorted results for position column$")
	public void user_sees_sorted_results_for_position_column() throws Throwable {

	}
//TABLE SEARCH
	
	@Given("^user is in table search sort page$")
	public void user_is_in_table_search_sort_page() throws Throwable {
		tableSortClick();
	
	}

	@When("^user enters search term \"([^\"]*)\"$")
	public void user_enters_search_term(String arg1) throws Throwable {
		enterSearchTerm(arg1);
	
	}

	@Then("^user sees relavant results for search term$")
	public void user_sees_relavant_results_for_search_term() throws Throwable {

	
	}
	
	//PROGRESS BAR
	
	@Given("^user is in JQuery Page$")
	public void user_is_in_JQuery_Page() throws Throwable {
		tapProgressBar();
	
	}

	@When("^user taps on start download$")
	public void user_taps_on_start_download() throws Throwable {

	
	}

	@Then("^user sees progress bar download complete$")
	public void user_sees_progress_bar_download_complete() throws Throwable {
		checkDownloadCompleteProgress();
	
	}

	//DRAG AND DROP
	
	@Given("^user is in DragAndDrop Page$")
	public void user_is_in_DragAndDrop_Page() throws Throwable {

	}

	@When("^user starts sliding$")
	public void user_starts_sliding() throws Throwable {
		dragAndDrop();
	
	}

	@Then("^user capturs the last slide$")
	public void user_capturs_the_last_slide() throws Throwable {
		dragAndDrop1();
	
	}

	
}
