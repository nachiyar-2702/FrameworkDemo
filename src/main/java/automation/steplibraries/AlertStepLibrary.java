package automation.steplibraries;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.pageobjects.AlertsOR;
import automation.pageobjects.TableOR;

public class AlertStepLibrary extends CommonLibrary {

	AlertsOR alertOR = new AlertsOR();

	public void alertClick() {
		testContext.getWebDriverImpl().getWebElement(alertOR.tapAlertandModals()).click();

	}

	public void bootStartAlertClick() {
		testContext.getWebDriverImpl().getWebElement(alertOR.tapBoosStrapAlert()).click();

	}   
    
    public void successAlertValidation() {
        
    	testContext.getWebDriverImpl().getWebElement(alertOR.tapSuccessAlert()).click();
    	testContext.getWebDriverImpl().getWebElement(alertOR.successAlertMessage()).isDisplayed();
    	System.out.println(testContext.getWebDriverImpl().getWebElement(alertOR.successAlertMessage()).getText());
    	String successText=testContext.getWebDriverImpl().getWebElement(alertOR.successAlertMessage()).getText();
    	if(successText.contains("success")) {
    		System.out.println("This alert is AutoClosable Success Message");
    	}
  }    
    
    //BootStrap Modals
    
    public void singleModalValidation() throws InterruptedException {
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Bootstrap Modals")).click();;
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Launch modal")).click();
    	testContext.getWebDriverImpl().browserdriver.switchTo().activeElement();

    	Thread.sleep(3000);
    	
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Save changes")).click();
    	
    
    }
    
    // MULTIPLE BOOTSTRAP MODALS
    
    public void multipleModalValidation() throws InterruptedException {
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Bootstrap Modals")).click();;
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//div[@class='row'])[4]/div/div/div/a")).click();
    	testContext.getWebDriverImpl().browserdriver.switchTo().activeElement();

    	Thread.sleep(3000);
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//div[@id='myModal'])/div/div/div[3]/a")).click();
    	testContext.getWebDriverImpl().browserdriver.switchTo().activeElement();
    	Thread.sleep(3000);
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//div[@class='modal-footer'])[3]/a[2]")).click();
    	
    	
    }
    
// WINDOW POP UP MODALS
    
    public void windowPopUpValidation() throws InterruptedException {
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Window Popup Modal")).click();
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//div[@class='row'])[3]/div/div[2]/div[1]/a[1]")).click();
    	String MainWindow=testContext.getWebDriverImpl().browserdriver.getWindowHandle();
    	
    	Set<String> s1=testContext.getWebDriverImpl().browserdriver.getWindowHandles();
    	Iterator<String> i1=s1.iterator();
    	
    	while(i1.hasNext()) {
    		String ChildWindow=i1.next();
    		testContext.getWebDriverImpl().browserdriver.switchTo().window(ChildWindow);
    		testContext.getWebDriverImpl().browserdriver.getTitle();
    		System.out.println(testContext.getWebDriverImpl().browserdriver.getTitle());
  		
    	}

    	testContext.getWebDriverImpl().browserdriver.switchTo().window(MainWindow);
    	
}
    
    //PROGRESS BAR MODAL
    
    public void progressBarModal() throws InterruptedException {
    	
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Progress Bar Modal")).click();
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//button[contains(text(),'Show dialog')])[1]")).click();
    	testContext.getWebDriverImpl().browserdriver.switchTo().activeElement();
    	Thread.sleep(1000);
    	testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@class='modal fade in']/div/div/div[1]/h3")).isDisplayed();
    	
    	System.out.println(testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@class='modal fade in']/div/div/div[1]/h3")).getText());
    }
    
    //JAVASCRIPT ALERTS
    
    public void alertHandle() {
    	
    	// Java Script Alert Box
    	
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Javascript Alerts")).click();
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//button[contains(text(),'Click me')])[1]")).click();
    	System.out.println(testContext.getWebDriverImpl().browserdriver.switchTo().alert().getText());
    	testContext.getWebDriverImpl().browserdriver.switchTo().alert().accept();
    	
    }
    
public void alertHandle2() {
    	
    	// Java Script Confirm Box
    	
    	testContext.getWebDriverImpl().getWebElement(By.linkText("Javascript Alerts")).click();
    	testContext.getWebDriverImpl().getWebElement(By.xpath("(//button[contains(text(),'Click me')])[2]")).click();
    	System.out.println(testContext.getWebDriverImpl().browserdriver.switchTo().alert().getText());
    	testContext.getWebDriverImpl().browserdriver.switchTo().alert().dismiss();
    	
    }

public void alertHandle3() {
	
	// Java Script Confirm Box With SendKeys
	
	testContext.getWebDriverImpl().getWebElement(By.linkText("Javascript Alerts")).click();
	testContext.getWebDriverImpl().getWebElement(By.xpath("//button[contains(text(),'Click for')]")).click();
	System.out.println(testContext.getWebDriverImpl().browserdriver.switchTo().alert().getText());
	testContext.getWebDriverImpl().browserdriver.switchTo().alert().sendKeys("Surya");
	testContext.getWebDriverImpl().browserdriver.switchTo().alert().accept();
	System.out.println(testContext.getWebDriverImpl().getWebElement(By.xpath("//p[@id='prompt-demo']")).getText());
}

//FILE DOWNLOAD

public void fileDownload() throws InterruptedException {
	testContext.getWebDriverImpl().getWebElement(By.linkText("File Download")).click();
	testContext.getWebDriverImpl().getWebElement(By.xpath("//textarea[@id='textbox']")).sendKeys("sdkjasdasasankjandadsadaskjadjwbdjsbd");
	Thread.sleep(5000);
	testContext.getWebDriverImpl().getWebElement(By.xpath("//button[@id='create']")).click();
	testContext.getWebDriverImpl().getWebElement(By.xpath("//a[@id='link-to-download']")).click();

	String filename="easyinfo";
	AlertStepLibrary.isFileDownloaded(filename);
	
		/*
		 * File dir = new File("C://Users//kulan//Downloads"); File[] dir_contents =
		 * dir.listFiles(); System.out.println("File"); for (int i = 0; i <
		 * dir_contents.length; i++) { if
		 * (dir_contents[i].getName().equalsIgnoreCase("easyinfo"))
		 * System.out.println("File downloaded succcesfuly"); }
		 */
	
    
}
public static Boolean isFileDownloaded(String fileName) {
    boolean flag = false;
    //paste your directory path below
    //eg: C:\\Users\\username\\Downloads
    String dirPath = "C:\\Users\\kulan\\Downloads"; 
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files.length == 0 || files == null) {
        System.out.println("The directory is empty");
        flag = false;
    } else {
        for (File listFile : files) {
            if (listFile.getName().contains(fileName)) {
                System.out.println(fileName + " is present");
                break;
            }
            flag = true;
        }
    }
    return flag;
} 

}
    
