package automation.core;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.steplibraries.CommonLibrary;

public class WebDriverImpl {
	
	
	public WebDriverImpl(RemoteWebDriver driver) {
		this.driver = driver;
	}
	

	public RemoteWebDriver driver;
	public EventFiringWebDriver browserdriver;
	
	

	public WebDriver initializeDriver() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D://Software & Tools//chromedriver.exe");
		browserdriver = new EventFiringWebDriver(driver);

		return browserdriver;

	}
	
	
	
	public EventFiringWebDriver getBrowserdriver() {
		return browserdriver;
	}



	public void clickWebElement(WebElement element) {
		element.click();
	}
	
	public WebElement getWebElement(By by) {
		return driver.findElement(by);
	}
	
	public void sendKeysElement(WebElement element, String text) {
		element.sendKeys(text);
	}

/*	public static boolean isElementPresentVerifyClick(WebElement WebElement, EventFiringWebDriver browser) {
		boolean isVerifiedAndClicked = false;
		WebElement webElement = null;
		WebDriverWait browserWithElementWait = null;
		try {	
		if (webElement != null) {
					
						//Thread.sleep(EcommVariables.thresholdToloadElementWaitInterval);
				
							webElement.click();
							isVerifiedAndClicked = true;
							break;
						}
						//endTimeInMs = System.currentTimeMillis();
						//totalElapsedTimeToClickElement_TimeInMs = endTimeInMs - startTimeInMs;
							return isVerifiedAndClicked;

		}*/
		

}
	
