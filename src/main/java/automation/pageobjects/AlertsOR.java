package automation.pageobjects;

import org.openqa.selenium.By;

public class AlertsOR {
 
	public String AlertMainLink = "Alerts & Modals";

	public By tapAlertandModals() {
		return By.linkText(AlertMainLink);
	}
	
	public String BootStrapAlert = "Bootstrap Alerts";

	public By tapBoosStrapAlert() {
		return By.linkText(BootStrapAlert);
		
	}
	
	public String SuccessAlert="//*[@id='autoclosable-btn-success']";
	
	public By tapSuccessAlert() {
		return By.xpath(SuccessAlert);
		
	}
	
public String SuccessAlertCheck="(//div[@class='row'])[3]/div[2]/div[1]";
	
	public By successAlertMessage() {
		return By.xpath(SuccessAlertCheck);
		
	}
	
	//BootStrap Modals
	
	
	
	
	
}
