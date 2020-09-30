package automation.pageobjects;

import org.openqa.selenium.By;

public class SingleCheckBoxDemoOR {

	public String CheckBoxDemo = "//ul[@id='treemenu']/li/ul/li[1]/ul/li[2]/a";

	public By checkBoxDemoClick() {
		return By.xpath(CheckBoxDemo);
	}
	
	public String SelectCheckBox ="//input[@id='isAgeSelected']";
	public By checkBoxSelect() {
		return By.xpath(SelectCheckBox);
		
	}
	public String CheckBoxText ="//div[@id='txtAge']";
	
	public By checkBoxText() {
		return By.xpath(CheckBoxText);
	}
	
}
