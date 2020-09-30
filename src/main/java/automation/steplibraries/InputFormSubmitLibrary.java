package automation.steplibraries;

import automation.pageobjects.InputFormsOR;
import automation.pageobjects.SeleniumEasyTestPage;

public class InputFormSubmitLibrary extends CommonLibrary{
	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	InputFormsOR inputFormsOR = new InputFormsOR();
	
	public void inputFormsClick() {
		testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	   
		}
	public void dropdownClick() {
		//testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectInputFormClick()).click();
	   
		}
	
	public void enterNameValues(String FirstName, String LastName) {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterFirstName()).sendKeys(FirstName);
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterLastName()).sendKeys(LastName);
		
	}
	
	public void selectState(String state) {
		dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterState()),state);
		
		
	}
	
	public void ajaxSubmitClick() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectAjaxFormClick()).click();
	}
	
	public void enterAjaxValues(String Name, String Comment) {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterNameAjax()).sendKeys(Name);
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterCommentsAjax()).sendKeys(Comment);
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterSubmitAjax()).click();
	}
	
	public void ajaxSubmitMessageVerify() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterSubmitMessageAjax()).isDisplayed();
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterSubmitMessageAjax()).getText();
		System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterSubmitMessageAjax()).isDisplayed());
		System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.enterSubmitMessageAjax()).getText());
	}
	
	//JQUERY SELECT DROPDOWN//
	
	public void jQueryDropdownClick() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectJQueryClick()).click();
	  
		}

	
	public void selectCountryClick() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectCount()).click();
	}
	
	public void enterCountryValue(String Country) {

		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectCountText()).sendKeys(Country);
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.countrySelection()).click();
	}
	
	public void selectedCountryVerify() {
		
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectedCountry()).isDisplayed();
	}

	public void selectState(String value1, String value2) {
		dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectStateValue()),value1);
		dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectStateValue()),value2);
	}

	
	public void selectFile(String value1) {
		dropdownSelect(testContext.getWebDriverImpl().getWebElement(inputFormsOR.selectFileValue()),value1);
	
	}
	
}
