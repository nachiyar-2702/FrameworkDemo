package automation.steplibraries;

import automation.pageobjects.SeleniumEasyTestPage;
import automation.pageobjects.SimpleFormDemoOR;

public class SimpleFormDemoLibrary extends CommonLibrary {

	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	SimpleFormDemoOR simpleFormDemoOR = new SimpleFormDemoOR();
	
	public void popUpHandle() {
		if(testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose())!=null) {
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()).click();}
			
		}
	  public void simpleFormDemoClick() {
		  //System.out.println(testContext.getWebDriverImpl().toString());
		  
	  testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	  testContext.getWebDriverImpl().getWebElement(simpleFormDemoOR.simpleFormClick()).click(); 
	  }
	 
	
	public void simpleFormEnterMessage() {
		testContext.getWebDriverImpl().getWebElement(simpleFormDemoOR.simpleFormEnterMessage()).sendKeys("Hello");
	}

	public void simpleFormShowMessage() {
		testContext.getWebDriverImpl().getWebElement(simpleFormDemoOR.simpleFormShowMessage()).click();
	}
	
	public void simpleFormYourMessage() {
		if(testContext.getWebDriverImpl().getWebElement(simpleFormDemoOR.simpleFormYourMessage()).isDisplayed()) {
			
		}
			
	}
	
}
