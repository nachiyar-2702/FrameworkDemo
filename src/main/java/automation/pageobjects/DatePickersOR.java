package automation.pageobjects;

import org.openqa.selenium.By;

public class DatePickersOR {
 
	public String DatePickers = "Date pickers";

	public By datePickers() {
		return By.linkText(DatePickers);
	}
	
	public String BootStrapDatePickers = "Bootstrap Date Picker";

	public By bootStrapDatePickers() {
		return By.linkText(BootStrapDatePickers);
		
	}
	
	public String EnterDate1 = "(//input[@type='text'])[1]";

	public By enterDate1() {
		return By.xpath(EnterDate1);
	}
}



