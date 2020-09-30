package automation.steplibraries;

import automation.pageobjects.MultipleCheckBoxDemoOR;
import automation.pageobjects.SeleniumEasyTestPage;
import automation.pageobjects.SingleCheckBoxDemoOR;

public class MutlipleCheckBoxLibrary extends CommonLibrary {

	SeleniumEasyTestPage seleniumEasyTestPage = new SeleniumEasyTestPage();
	SingleCheckBoxDemoOR singleCheckBoxDemoOR = new SingleCheckBoxDemoOR(); 
	MultipleCheckBoxDemoOR multipleCheckBoxDemoOR = new MultipleCheckBoxDemoOR();

	public void popUpHandle() {
		if (testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()) != null) {
			testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.popUpClose()).click();
		}

	}

	public void multipleCheckAllClick() {

		testContext.getWebDriverImpl().getWebElement(seleniumEasyTestPage.clickInputForms()).click();
		testContext.getWebDriverImpl().getWebElement(singleCheckBoxDemoOR.checkBoxDemoClick()).click();
		testContext.getWebDriverImpl().getWebElement(multipleCheckBoxDemoOR.CheckAllClick()).click();

	}

	public void checkAllOptions() {
		for(int i=0;i<4;i++) {
			testContext.getWebDriverImpl().getWebElement(multipleCheckBoxDemoOR.AllOptionsCheck()).isSelected();
			System.out.println("options " + (i+1) );
		}

	}
	
	public void verifyUnCheckAll() {
		//String UncheckAll=testContext.getWebDriverImpl().getWebElement(multipleCheckBoxDemoOR.unCheckAllVerify()).getText();
		//System.out.println(UncheckAll);
		//if(UncheckAll.equals("Uncheck All")) {
			//System.out.println("Test Case Passed");
		
		testContext.getWebDriverImpl().getWebElement(multipleCheckBoxDemoOR.unCheckAllVerify()).isDisplayed();
		System.out.println(testContext.getWebDriverImpl().getWebElement(multipleCheckBoxDemoOR.unCheckAllVerify()).isDisplayed());
		System.out.println("UnCheckAll Displayed");
		}
		
	}

