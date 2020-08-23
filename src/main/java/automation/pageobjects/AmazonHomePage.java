package automation.pageobjects;

import org.openqa.selenium.By;

public class AmazonHomePage {
	public String signin_link = "//*[contains(text(),'Hello, Sign in')]";

	public By getSignIn() {
		return By.xpath(signin_link);
	}
}
