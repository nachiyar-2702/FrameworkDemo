package automation.steplibraries;

import automation.pageobjects.SeleniumEasyTestPage;
import automation.pageobjects.SimpleFormDemoOR;
import automation.pageobjects.SingleCheckBoxDemoOR;

public class SingleCheckBoxLibrary extends CommonLibrary {
	
	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	SingleCheckBoxDemoOR singleCheckBoxDemoOR = new SingleCheckBoxDemoOR();
	
	public void popUpHandle() {
		if(testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose())!=null) {
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()).click();}
			
		}
	
	public void checkBoxDemoClick() {
	testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	testContext.getWebDriverImpl().getWebElement(singleCheckBoxDemoOR.checkBoxDemoClick()).click();
	
	}
	
	public void checkBoxClickAndMessageVerify() {
		testContext.getWebDriverImpl().getWebElement(singleCheckBoxDemoOR.checkBoxSelect()).click();
		testContext.getWebDriverImpl().getWebElement(singleCheckBoxDemoOR.checkBoxText()).isDisplayed();
		System.out.println(testContext.getWebDriverImpl().getWebElement(singleCheckBoxDemoOR.checkBoxText()).getText());
		System.out.println("successful");
		}
}
