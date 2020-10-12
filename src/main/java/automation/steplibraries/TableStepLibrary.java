package automation.steplibraries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

import automation.pageobjects.TableOR;

public class TableStepLibrary extends CommonLibrary {

	TableOR tableOR = new TableOR();

	public void tableClick() {
		testContext.getWebDriverImpl().getWebElement(tableOR.tableSelect()).click();

	}

	public void tablePaginationClick() {
		testContext.getWebDriverImpl().getWebElement(tableOR.tablePagination()).click();

	}

	public void clickNextLink() throws InterruptedException {
		Thread.sleep(3000);
		testContext.getWebDriverImpl().getWebElement(tableOR.clickNextLink()).click();
	}

	public void tableValidation() {
		int z = 0;
		List<WebElement> rows = testContext.getWebDriverImpl().getWebElements(tableOR.fetchTableRow());
		List<WebElement> columns = testContext.getWebDriverImpl().getWebElements(tableOR.fetchTableColumn());
		for (int i = 6; i < rows.size() - 2; i++) {
			for (int j = 1; j < columns.size(); j++) {

//System.out.print(testContext.getWebDriverImpl().getWebElement(tableOR.printRowColumnValue()).getText() + "\t");

				System.out.print(testContext.getWebDriverImpl()
						.getWebElement(By.xpath("//tbody[@id='myTable']/tr[" + i + "]/td[" + j + "]")).getText()
						+ "\t");

			}
			System.out.println();
			z++;
		}
		System.out.println("Number of rows : " + z);

		System.out.println(testContext.getWebDriverImpl().getWebElement(tableOR.prevLink()).isDisplayed());
		System.out.println(testContext.getWebDriverImpl().getWebElement(tableOR.nextLink()).isDisplayed());
	}

	// table DATA SEARCH

	public void tableDataSearchClick() {
		testContext.getWebDriverImpl().getWebElement(tableOR.tableDataSearch()).click();

	}

	public void enterSearchTerm(String value) throws InterruptedException {
		testContext.getWebDriverImpl().getWebElement(tableOR.enterTableDataSearch()).sendKeys(value);
		Thread.sleep(4000);
	}

	public void validateSearchResults(String name) {

		List<WebElement> rowTasks = testContext.getWebDriverImpl()
				.getWebElements(By.xpath("//table[@id='task-table']/tbody/tr"));

		/*
		 * for (int i = 1; i < rowTasks.size(); i++) { if
		 * (testContext.getWebDriverImpl().getWebElements(By.xpath(
		 * "//table[@id='task-table']/tbody/tr/td[3]"))
		 * .get(i).getText().contains("John")) { System.out.println("print"); } else
		 * break; }
		 */
		
		System.out.println(rowTasks.size());

		
		for (int i = 1; i < rowTasks.size(); i++) {
			if(testContext.getWebDriverImpl()
					.getWebElement(By.xpath("//table[@id='task-table']/tbody/tr[" + i + "]/td[3]"))==null)
			{
				JavascriptExecutor js = (JavascriptExecutor) testContext.getWebDriverImpl();
				String javascript = "document.evaluate('//tr[@style='display: none;']',document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;";
				WebElement element = (WebElement) js.executeScript(javascript);  

			}
			else
				System.out.println(testContext.getWebDriverImpl()
					.getWebElement(By.xpath("//table[@id='task-table']/tbody/tr[" + i + "]/td[3]")).getText());
		}

		// iteration the table
		// check John text is there
		// to display 2 john values
		/*
		 * for (int i = 1; i <= 2; i++) {
		 * System.out.println(testContext.getWebDriverImpl() .getWebElement(By.xpath(
		 * "(//table[@id='task-table']/tbody/tr/td[contains(text(),'" + name + "')])[" +
		 * i + "]")) .getText()); }
		 */
		// System.out.print(testContext.getWebDriverImpl()
		// .getWebElement(By.xpath("//table[@id='task-table']/tbody/tr/td[contains(text(),'"
		// + name + "')]")).getText());
	}
	
	
	//TABLE FILTER
	
	public void tableDataFilterClick() throws InterruptedException {
		testContext.getWebDriverImpl().getWebElement(tableOR.tableFilter()).click();
		Thread.sleep(4000);
		testContext.getWebDriverImpl().getWebElement(tableOR.applyTableFilter()).click();
		

	}
	

	public void validateFilterResults() {

		List<WebElement> filterTasks = testContext.getWebDriverImpl()
				.getWebElements(By.xpath("//div[@class='table-container']/table/tbody/tr"));
	
		for (int i = 1; i < filterTasks.size(); i++) {
			if(testContext.getWebDriverImpl()
					.getWebElement(By.xpath("//div[@class='table-container']/table/tbody/tr[" + i + "]"))==null)
			{
				JavascriptExecutor js = (JavascriptExecutor) testContext.getWebDriverImpl();
				String javascript = "document.evaluate('//tr[@style='display: none;']',document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;";
				WebElement element = (WebElement) js.executeScript(javascript);  

			}
			else
				System.out.println(testContext.getWebDriverImpl()
					.getWebElement(By.xpath("//div[@class='table-container']/table/tbody/tr[" + i + "]")).getText());
		}
	}
	
	//TABLE SORT
	
	
		public void tableSortClick() throws InterruptedException {
			testContext.getWebDriverImpl().getWebElement(tableOR.tableSort()).click();
			Thread.sleep(4000);
			
			

		}

		public void verifySorting() {
			
			List<WebElement> originalList = testContext.getWebDriverImpl()
					.getWebElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
		
		ArrayList<String> olist = new ArrayList<String>();
		System.out.println(originalList.size());
		for (int i = 0; i < originalList.size(); i++) {
			System.out.println(originalList.get(i).getText());
			String list = originalList.get(i).getText();
			olist.add(list);
		}
		 
				
		testContext.getWebDriverImpl().getWebElement(tableOR.applyTableSort()).click();
		
		Collections.sort(olist);
		for (int i = 0; i < olist.size(); i++) {
			System.out.println(olist.get(i));
		}
		/*
		 * List<String>
		 * oList=originalList.stream().map(s->s.getText()).collect(Collectors.toList());
		 * 
		 * testContext.getWebDriverImpl().getWebElement(tableOR.applyTableSort()).click(
		 * );
		 * 
		 * List<String> sortedList=oList.stream().sorted().collect(Collectors.toList());
		 * 
		 * sortedList.stream().forEach(s->System.out.println(s));
		 */
		 
		
		}
		
		
		// TABLE SEARCH
		
		
		// PROGRESS BAR
		
		public void tapProgressBar() throws InterruptedException {
			testContext.getWebDriverImpl().getWebElement(tableOR.tapProgressBar()).click();
			testContext.getWebDriverImpl().getWebElement(tableOR.BStrapProgressBar()).click();

			Thread.sleep(4000);
			testContext.getWebDriverImpl().getWebElement(tableOR.clickStartDownloadJQuery()).click();
		}

      public void checkDownloadCompleteProgress() {

    	  System.out.println("Download started");
		
		long timeoutInSeconds = 50;
		new WebDriverWait(testContext.getWebDriverImpl().browserdriver, timeoutInSeconds)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'100')]")));
		System.out.println("Download Complete");
		
		/*
		 * Wait<WebDriver> wait = new
		 * WebDriverWait(testContext.getWebDriverImpl().browserdriver, 30);
		 * 
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//div[contains(text(),'Complete!')]")));
		 * 
		 * System.out.println("Download Complete");
		 */
    	  
      }
      
      //DRAG AND DROP SLIDER
      public void dragAndDropSlide() throws InterruptedException {
			testContext.getWebDriverImpl().getWebElement(tableOR.tapProgressBar()).click();
			testContext.getWebDriverImpl().getWebElement(tableOR.tapDragAndDrop()).click();

			Thread.sleep(4000);
      }
      
    public void dragAndDrop() {
    
    	  WebElement slider = testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@id='slider1']/div/input"));
          Actions move = new Actions(testContext.getWebDriverImpl().browserdriver);
          Action action = move.dragAndDropBy(slider, 10, 50).build();
          action.perform();
          
       String SliderNum=   testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@id='slider1']/div/output")).getText();
    System.out.println(SliderNum);
    
    }
      
    
    
    public void dragAndDrop1() {
        
  	  WebElement slider = testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@id='slider2']/div/input"));
        Actions move = new Actions(testContext.getWebDriverImpl().browserdriver);
        Action action = move.dragAndDropBy(slider, 50, 100).build();
        action.perform();
        
     String SliderNum=   testContext.getWebDriverImpl().getWebElement(By.xpath("//div[@id='slider2']/div/output")).getText();
  System.out.println(SliderNum);
  
  }    
}
