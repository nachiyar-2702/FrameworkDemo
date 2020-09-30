package automation.pageobjects;

import org.openqa.selenium.By;

public class InputFormsOR {

	//radio button demo examples
	
	public String RadioButtonsDemo = "Radio Buttons Demo";

	public By radioButtonDemoClick() {
		return By.linkText(RadioButtonsDemo);
		
	}

	public String SingleRadioButtonClick= "//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input";
	public String MulRadioButtonClick= "//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[1]/input";
	
	public By SingleRadioButtonMaleClick() {
		return By.xpath(SingleRadioButtonClick);
	}
	
	public By MultipleRadioButtonMaleClick() {
		return By.xpath(MulRadioButtonClick);
	}
	
	public String AgeRadioButtonClick="//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label[1]";
	public By AgeRadioButtonfirstvalueClick() {
		return By.xpath(AgeRadioButtonClick);
	}
	
	public String GetCheckedValue="//*[@id='buttoncheck']";
	
	public By getCheckedValueClick() {
		return By.xpath(GetCheckedValue);
	}
	
	public String GetValues="//button[text()='Get values']";
	
	public By getValues() {
		return By.xpath(GetValues);
	}
	
public String SingleRadioButtonMessageCheck= "//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[3]";
	
	public By radioButtonMessageVerify() {
		return By.xpath(SingleRadioButtonMessageCheck);
	}

	public String MulRadioButtonMessageCheck="//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]";
	
	public By radioButtonMessageVerify1() {
		return By.xpath(MulRadioButtonMessageCheck);
	}
	



/*  SELECT DROPDOWN LIST  */

	public String SelectDropdownList = "Select Dropdown List";

	public By selectDropdownListClick() {
		return By.linkText(SelectDropdownList);
		
	} 
	
	
public String SingleSelectList="select-demo";

public By singleSelectList() {
	return By.id(SingleSelectList);

}

public String DropdownValueVerify="//*[@id='easycont']/div/div[2]/div[1]/div[2]/p[2]";
public By dropdownSelectVerify() {
	return By.xpath(DropdownValueVerify);
}

public String MultipleSelectList="multi-select";

public By multiSelectList() {
	return By.id(MultipleSelectList);

}

public String GetAllSelected="printAll";

public By clickGetAllSelected() {
	return By.id(GetAllSelected);

}

public String MultipleDropdownValueVerify="//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]";
public By multipledDropdownSelectVerify() {
	return By.xpath(MultipleDropdownValueVerify);
}



/*INPUT FORM SUBMIT */
public String SelectInputForm = "Input Form Submit";

public By selectInputFormClick() {
	return By.linkText(SelectInputForm);
	
}

public String FirstName = "first_name";

public By enterFirstName() {
	return By.name(FirstName);
}

public String LastName = "last_name";

public By enterLastName() {
	return By.name(LastName);
}

public String State = "state";

public By enterState() {
	return By.name(State);
}

/* ajax input */

public String SelectAjaxForm = "Ajax Form Submit";

public By selectAjaxFormClick() {
	return By.linkText(SelectAjaxForm);
	
}

public String ajaxFormName = "title";

public By enterNameAjax() {
	return By.id(ajaxFormName);
	
}

public String ajaxFormComment = "//*[@id='description']";

public By enterCommentsAjax() {
	return By.xpath(ajaxFormComment);
	
}

public String ajaxFormSubmit = "//input[@id='btn-submit']";

public By enterSubmitAjax() {
	return By.xpath(ajaxFormSubmit);
	
}

public String ajaxFormSubmitMessage = "//div[@id='submit-control']";

public By enterSubmitMessageAjax() {
	return By.xpath(ajaxFormSubmitMessage);
	
}


public String SelectJQueryForm = "JQuery Select dropdown";

public By selectJQueryClick() {
	return By.linkText(SelectJQueryForm);
	
}

public String SelectCountry = "(//span[@class='select2-selection__arrow'])[1]";

public By selectCount() {
	return By.xpath(SelectCountry);
	
}

public String SelectCountryText = "(//input[@class='select2-search__field'])[2]";

public By selectCountText() {
	return By.xpath(SelectCountryText);
	
}


public String CountrySelection = "//li[contains(text(),'Australia')]";

public By countrySelection() {
	return By.xpath(CountrySelection);
	
}

public String SelectedCountry="//span[contains(text(),'Australia')]";

public By selectedCountry() {
	return By.xpath(SelectedCountry);
}

public String SelectState="//div[2]/div/div[2]/div[2]/div/div[2]/select";

public By selectStateValue() {
	return By.xpath(SelectState);
}

public String SelectFiles="//select[@id='files']";

public By selectFileValue() {
	return By.xpath(SelectFiles);
}



}





