package automation.steplibraries;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automation.core.TestContext;
import automation.pageobjects.SeleniumEasyTestPage;

public class CommonLibrary{
	
	public TestContext testContext;
	
	SeleniumEasyTestPage seleniumEasyTestPage=new SeleniumEasyTestPage();
	
	public CommonLibrary(){
		testContext = new TestContext();
	}

	public TestContext getTestContext() {
		return testContext;
	}

	public void setTestContext(TestContext testContext) {
		this.testContext = testContext;
	}
		
	
	public void popUpHandle() {
		if(testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose())!=null) {
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()).click();
			
		}
	}
	
	public void dropdownSelect(WebElement element, String value) {
		Select select=new Select((WebElement) element);
		//select.selectByValue(value);
		select.selectByVisibleText(value);
		//select.selectByIndex(Integer.parseInt(value));
	}
	// Dummy lines	
	public void set1TestContext(TestContext testContext) {
		this.testContext = testContext;
	}	 
	
}
