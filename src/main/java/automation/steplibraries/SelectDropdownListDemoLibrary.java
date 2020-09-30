package automation.steplibraries;

import automation.pageobjects.InputFormsOR;
import automation.pageobjects.SeleniumEasyTestPage;

public class SelectDropdownListDemoLibrary extends CommonLibrary{
	
	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	InputFormsOR inputFormsOR = new InputFormsOR();
	
	
	public void dropdownClick() {
	testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectDropdownListClick()).click();
   
	}
	
	public void inputFormsClick() {
		testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	   
		}
	public void selectDropdown() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectDropdownListClick()).click();
	}
	public void dropdownValuesSelect(String value) {
		
	dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.singleSelectList()),value);			
		
	}

	//Multiple Dropdown Select
	public void MulDropdownValuesSelect(String value) {
		
		dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.multiSelectList()),value);			
			
		}
	
	public void clickGetAllSelected() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.clickGetAllSelected()).click();
	}
	public void dropdownValuesVerify() {
	System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.multipledDropdownSelectVerify()).isDisplayed());	
	}
}
