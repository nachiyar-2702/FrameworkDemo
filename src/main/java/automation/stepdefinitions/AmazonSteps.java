package automation.stepdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import automation.core.WebDriverImpl;
import automation.pageobjects.AmazonAfterLoginHomePage;
import automation.pageobjects.AmazonHomePage;
import automation.pageobjects.AmazonPasswordPage;
import automation.pageobjects.AmazonUserNamePage;
import automation.steplibraries.AmazonStepLibrary;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSteps extends AmazonStepLibrary {

	AmazonHomePage amazonHomePage = new AmazonHomePage();
	AmazonUserNamePage amazonUserNamePage = new AmazonUserNamePage();
	AmazonPasswordPage amazonPasswordPage = new AmazonPasswordPage();
	AmazonAfterLoginHomePage amazonAfterLoginHomePage = new AmazonAfterLoginHomePage();

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
	}

	@And("^user Login \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Login_and(String arg1, String arg2) throws Throwable {

		//testContext.getWebDriverImpl().getWebElement(amazonHomePage.getSignIn()).click();
		//testContext.getWebDriverImpl().clickWebElement(testContext.getWebDriverImpl().getWebElement(amazonHomePage.getSignIn()));
		signInStep();
		testContext.getWebDriverImpl().getWebElement(amazonUserNamePage.enterUsername()).sendKeys(arg1);
		testContext.getWebDriverImpl().getWebElement(amazonUserNamePage.clickContinue()).click();
		testContext.getWebDriverImpl().getWebElement(amazonPasswordPage.enterPass()).sendKeys(arg2);
		

		// Write code here that turns the phrase above into concrete actions
	}
		  
		  @When("^user clicks login$") public void user_clicks_login() throws Throwable {
		  
			  testContext.getWebDriverImpl().getWebElement(amazonPasswordPage.clickLogin()).click();
		  // Write code here that turns the phrase above into concrete actions 
			  
		  }
		  
		  @Then("^verify account home page$") public void verify_account_home_page() throws Throwable { 
			  // Write code here that turns the phrase above into concrete actions 
			  
			  testContext.getWebDriverImpl().getWebElement(amazonAfterLoginHomePage.verifyLogin()).isDisplayed();
			  System.out.println("PASS");
		  }
		 

}
