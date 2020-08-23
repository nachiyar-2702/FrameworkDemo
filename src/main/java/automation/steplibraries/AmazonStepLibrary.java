package automation.steplibraries;

import org.openqa.selenium.WebElement;

import automation.pageobjects.AmazonHomePage;

public class AmazonStepLibrary extends CommonLibrary{

	AmazonHomePage amazonHomePage = new AmazonHomePage();
	
	public void signInStep() {
		
		WebElement signInElement = testContext.getWebDriverImpl().getWebElement(amazonHomePage.getSignIn());
		testContext.getWebDriverImpl().clickWebElement(signInElement);
	}
	
}
