package automation.steplibraries;

import automation.pageobjects.SeleniumEasyTestPage;

public class InputFormsStepLibrary extends CommonLibrary{

	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	
	
	public void inputFormsClick() {
		testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	}
	
	public void inputForms() {
		testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.verifyInputFormsDropdown()).isDisplayed();

		System.out.println("We are in right page");
	}
	
	
	public void secureConnection() {
		if(testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.privateConnection()) != null)
		{
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickAdvanced()).click();
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.proceedToWebSite()).click();
		}

	}
	
	public void manageWindow() {
		testContext.getWebDriverImpl().driver.manage().window().maximize();
	}
	
	public void popUpHandle() {
		if(testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose())!=null) {
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()).click();
		}
	}
}
