package automation.pageobjects;

import org.openqa.selenium.By;

public class MultipleCheckBoxDemoOR {

	String MultipleCheckAll ="//input[@value='Check All']";
	
	public By CheckAllClick() {
		return By.xpath(MultipleCheckAll);
	}

	String OptionsCheck = "//input[@class='cb1-element']";
		
	public By AllOptionsCheck() {
		return By.xpath(OptionsCheck);
	}
	
	String UncheckAll="//input[@value='Uncheck All']";
	public By unCheckAllVerify() {
		return By.xpath(UncheckAll);
	}
}

