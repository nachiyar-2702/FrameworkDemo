package automation.pageobjects;

import org.openqa.selenium.By;

public class AmazonAfterLoginHomePage {

	public String afterLoginVerfiy="//span[@id='nav-your-amazon-text']";
	
	public By verifyLogin() {
		return By.xpath(afterLoginVerfiy);
		
	}
}
