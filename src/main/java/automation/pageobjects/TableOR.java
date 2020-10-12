package automation.pageobjects;

import org.openqa.selenium.By;

public class TableOR {
 
	public String Table = "Table";

	public By tableSelect() {
		return By.linkText(Table);
	}
	
	public String TablePagination = "Table Pagination";

	public By tablePagination() {
		return By.linkText(TablePagination);
		
	}
	
	public String NextLink = "//*[@id='myPager']/li[3]/a";

	public By clickNextLink() {
		return By.xpath(NextLink);
	}
	
	public String TableRow="//tbody[@id='myTable']/tr";
	
	public By fetchTableRow() {
		return By.xpath(TableRow);
	}

	//TABLE FILTER
	
	public String TableFilter = "Table Filter";

	public By tableFilter() {
		return By.linkText(TableFilter);
		
	}
	
public String ApplyTableFilter="//div[@class='btn-group']/button[1]";
	
	public By applyTableFilter() {
		return By.xpath(ApplyTableFilter);
	}
	
	
public String PrevLink="//a[@class='prev_link']";
	
	public By prevLink() {
		return By.xpath(PrevLink);
	}
	
	public String NextLink2 = "//a[@class='next_link']";

	public By nextLink() {
		return By.xpath(NextLink2);
	}
	
	
public String TableColumn="//tbody[@id='myTable']/tr[1]/td";
	
	public By fetchTableColumn() {
		return By.xpath(TableColumn);
	}
	int i,j;
	public String rowColumnValue="//tbody[@id='myTable']/tr[" + i +"]/td[" + j + "]";
	
	public By printRowColumnValue() {
		return By.xpath(rowColumnValue);
	}
	
//TABLE DATA SEARCH
	
	public String TableDataSearch = "Table Data Search";

	public By tableDataSearch() {
		return By.linkText(TableDataSearch);
		
	}
	
	
	public String EnterTableDataSearch = "//input[@id='task-table-filter']";

	public By enterTableDataSearch() {
		return By.xpath(EnterTableDataSearch);
		
	}
	
	//TABLE SORT & SEARCH
	
		public String TableSort = "Table Sort & Search";

		public By tableSort() {
			return By.linkText(TableSort);
			
		}
		
	public String SortPosition="//table[@id='example']/thead/tr/th[2]";
		
		public By applyTableSort() {
			return By.xpath(SortPosition);
		}
		

public String Search="//div[@id='example_filter']/label/input";

public By enterTableSearch() {
	return By.xpath(Search);
}


// PROGRESS BAR
public String ProgressBar="Progress Bars & Sliders";

public By tapProgressBar() {
	return By.linkText(ProgressBar);
}

public String JQueryProgressBar="JQuery Download Progress bars";

public By tapJQueryProgressBar() {
	return By.linkText(JQueryProgressBar);
}

public String BStrapProgressBar="Bootstrap Progress bar";

public By BStrapProgressBar() {
	return By.linkText(BStrapProgressBar);
}

public String StartDownloadJQuery="//button[@id='cricle-btn']";

public By clickStartDownloadJQuery() {
	return By.xpath(StartDownloadJQuery);
}

//Drag & Drop Sliders
public String DragAndDrop="Drag & Drop Sliders";

public By tapDragAndDrop() {
	return By.linkText(DragAndDrop);
}


}
