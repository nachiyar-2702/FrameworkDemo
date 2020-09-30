package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.steplibraries.InputFormsStepLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InputFormsSteps extends InputFormsStepLibrary {
  
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
		/*
		 * create webdriver object assign it to testContext launchURL
		 */
		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		testContext.setWebDriverImpl(new ChromeDriver());
		testContext.getWebDriverImpl().initializeDriver();
		System.out.println(url);
		testContext.getWebDriverImpl().getBrowserdriver().get(url);
		//secureConnection();
		manageWindow();
		Thread.sleep(5000);
		popUpHandle();
	}
	
	 @When("^user clicks inputforms$") 
	 public void user_clicks_inputforms() throws Throwable {
		  
		 inputFormsClick();
	  // Write code here that turns the phrase above into concrete actions 
		  
	  }


	@Then("^InputForms Page displayed$") 
	public void verify_inputForms_dropdown_displayed() throws Throwable { 
		  // Write code here that turns the phrase above into concrete actions 
		  
		inputForms();
		  //System.out.println("PASS");
		//testContext.getWebDriverImpl().getBrowserdriver().close();
	  }
	  
}
