package automation.pageobjects;

import org.openqa.selenium.By;

public class AmazonPasswordPage {
	public String password = "//input[@id='ap_password']";

	public By enterPass() {
		return By.xpath(password);
	}
	
	public String login="//input[@id='signInSubmit']";
	
	public By clickLogin() {
		return By.xpath(login);
	}
}
