package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.helper.Constants;

public class SearchPage {

	WaitHelper waitHelper;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//input[@id='check-in']")
	public WebElement checkinField;

	@FindBy(xpath = "//input[@id='check-out']")
	public WebElement checkoutField;

	@FindBy(xpath = "//input[@placeholder='Adult']")
	public WebElement adultField;

	@FindBy(xpath = "//input[@placeholder='Children']")
	public WebElement childrenField;

	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;
	
	public void enterNumberofAdult() {
		String adultNumberString = Integer.toString(Constants.aduld_number);
		adultField.sendKeys(adultNumberString);
	}

	public void enterNumberofChildren() {
		String childrenNumberString = Integer.toString(Constants.children_number);
		childrenField.sendKeys(childrenNumberString);
	}

	public void clickonSearch() {
		searchButton.click();
	}

}
