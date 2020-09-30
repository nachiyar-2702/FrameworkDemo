package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.SimpleFormDemoLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleFormDemoSteps extends SimpleFormDemoLibrary{

	
	@Given("^Click SimpleInputForm Link$")
	public void click_SimpleInputForm_Link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		testContext.getWebDriverImpl().driver.manage().window().maximize();
		testContext.getWebDriverImpl().getBrowserdriver().get("https://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
		popUpHandle();
		
			
		simpleFormDemoClick();		
	
	}

	@When("^user enter messages in textfield$")
	public void user_enter_messages_in_textfield() throws Throwable {
		simpleFormEnterMessage();
		
	}

	@When("^click on Show Message$")
	public void click_on_Show_Message() throws Throwable {
		simpleFormShowMessage();
	
	}

	@Then("^verify entered message is displayed$")
	public void verify_entered_message_is_displayed() throws Throwable {
		simpleFormYourMessage();
		
	}
	
}
