package automation.pageobjects;

import org.openqa.selenium.By;

public class AmazonUserNamePage {
	public String username = "//input[@id='ap_email']";

	public By enterUsername() {
		return By.xpath(username);
	}
	
	public String userContinue="//input[@id='continue']";
	
	public By clickContinue() {
		return By.xpath(userContinue);
		
	}
}
