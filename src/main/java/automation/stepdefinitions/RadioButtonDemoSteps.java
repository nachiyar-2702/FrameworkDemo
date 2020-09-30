package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.RadioButtonDemoLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadioButtonDemoSteps extends RadioButtonDemoLibrary {

	

@Given("^launch \"([^\"]*)\" and go to radio button demo$")
public void launch_and_go_to_radio_button_demo(String url) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
	testContext.setWebDriverImpl(new ChromeDriver());
	testContext.getWebDriverImpl().initializeDriver();
	testContext.getWebDriverImpl().driver.manage().window().maximize();
	testContext.getWebDriverImpl().getBrowserdriver().get(url);
	Thread.sleep(5000);
	popUpHandle();
}

@When("^user clicks radio button and click get checked value$")
public void user_clicks_radio_button_and_click_get_checked_value() throws Throwable {
	radioButtonClick();
	singleRadioButton();
}

@Then("^selected radio text  is displayed$")
public void selected_radio_text_is_displayed() throws Throwable {
	radioButtonGetCheckValueVerify();
	testContext.getWebDriverImpl().getBrowserdriver().close();
}

@When("^user clicks radio buttons and click get values$")
public void user_clicks_radio_buttons_and_click_get_values() throws Throwable {
	radioButtonClick();
	mulRadioButton();
}

@Then("^selected radio texts  are displayed$")
public void selected_radio_texts_are_displayed() throws Throwable {
	radioButtonGetValuesVerify();
	testContext.getWebDriverImpl().getBrowserdriver().close();
}

}
