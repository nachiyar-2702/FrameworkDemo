package automation.steplibraries;

import automation.pageobjects.InputFormsOR;
import automation.pageobjects.SeleniumEasyTestPage;


public class RadioButtonDemoLibrary extends CommonLibrary {

	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	InputFormsOR inputFormsOR = new InputFormsOR();

	
	public void radioButtonClick() {
	testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
	testContext.getWebDriverImpl().getWebElement(inputFormsOR.radioButtonDemoClick()).click();
		
	}
	
	public void singleRadioButton() {
	testContext.getWebDriverImpl().getWebElement(inputFormsOR.SingleRadioButtonMaleClick()).click();
	System.out.println("Selected Male Value in Radio Button");
	testContext.getWebDriverImpl().getWebElement(inputFormsOR.getCheckedValueClick()).click();
	System.out.println("Selected Get Check Value");
	
	}
	
	public void mulRadioButton() {
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.MultipleRadioButtonMaleClick()).click();
		testContext.getWebDriverImpl().getWebElement(inputFormsOR.AgeRadioButtonfirstvalueClick()).click();
		
	}
	
	public void radioButtonGetCheckValueVerify() {
		
		System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.radioButtonMessageVerify()).isDisplayed());
		System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.radioButtonMessageVerify()).getText());
		
		}
	public void radioButtonGetValuesVerify() {
	testContext.getWebDriverImpl().getWebElement(inputFormsOR.getValues()).click();
	System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.radioButtonMessageVerify1()).isDisplayed());
	System.out.println(testContext.getWebDriverImpl().getWebElement(inputFormsOR.radioButtonMessageVerify1()).getText());
	
	}
	
}
