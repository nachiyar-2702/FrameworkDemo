package automation.pageobjects;

import org.openqa.selenium.By;

public class SeleniumEasyTestPage {
	
public String Connection="//*[@id=\"main-message\"]/h1";
	
public By privateConnection() {
	return By.xpath(Connection);
}

public String Advanced="//*[@id=\"details-button\"]";

public By clickAdvanced() {
	return By.xpath(Advanced);
}

public String Proceed="//*[@id=\"proceed-link\"]";

public By proceedToWebSite() {
	return By.xpath(Proceed);
}

public String PopUpClose ="//*[@title='Close']";

public By popUpClose() {
	return By.xpath(PopUpClose);
}
	public String InputForms = "//*[@id=\"treemenu\"]/li/ul/li[1]/a";

	public By clickInputForms() {
		return By.xpath(InputForms);
	}
	
	public String InputFormsDropdown = "//*[@id='treemenu']/li/ul/li[1]/ul/li[1]/a";

	public By verifyInputFormsDropdown() {
		return By.xpath(InputFormsDropdown);
	}
	
	
}
