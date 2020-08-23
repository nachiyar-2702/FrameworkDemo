package automation.core;

import org.openqa.selenium.remote.RemoteWebDriver;

public class TestContext {
	WebDriverImpl webDriverImpl;

	public WebDriverImpl getWebDriverImpl() {
		return webDriverImpl;
	}

	public void setWebDriverImpl(WebDriverImpl webDriverImpl) {
		this.webDriverImpl = webDriverImpl;
	}

	public void setWebDriverImpl(RemoteWebDriver driver) {
		webDriverImpl = new WebDriverImpl(driver);
	}
	
	

	
	
}
