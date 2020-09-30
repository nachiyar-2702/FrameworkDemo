package automation.steplibraries;

import automation.pageobjects.DatePickersOR;

public class DatePickersStepLibrary extends CommonLibrary{
		
		DatePickersOR datePickersOR = new DatePickersOR();
		
		public void datePickersClick() {
			testContext.getWebDriverImpl().getWebElement(datePickersOR.datePickers()).click();
			
		   }
		
		public void BootStrapDatePickersClick() {
			testContext.getWebDriverImpl().getWebElement(datePickersOR.bootStrapDatePickers()).click();
			
		   }
		
		public void enterDate(String date) {
			testContext.getWebDriverImpl().getWebElement(datePickersOR.enterDate1()).sendKeys(date);
System.out.println(testContext.getWebDriverImpl().getWebElement(datePickersOR.enterDate1()).getText());
		}
}
