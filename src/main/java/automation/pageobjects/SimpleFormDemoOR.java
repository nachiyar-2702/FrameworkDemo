package automation.pageobjects;

import org.openqa.selenium.By;

public class SimpleFormDemoOR {

	public String SimpleFormClick = "//*[@id='treemenu']/li/ul/li[1]/ul/li[1]/a";
	
	
	public By simpleFormClick() {
		return By.xpath(SimpleFormClick);
	}
	
public String SimpleFormEnterMessage = "//input[@id='user-message']";
	
	public By simpleFormEnterMessage() {
		return By.xpath(SimpleFormEnterMessage);
	}
	
public String simpleFormShowMessage= "//button[contains(text(),'Show Message')]";	

public By simpleFormShowMessage() {
	return By.xpath(simpleFormShowMessage);
}

public String simpleFormYourMessage="//div[@id='user-message']//span";

public By simpleFormYourMessage() {
	return By.xpath(simpleFormYourMessage);
}


}
