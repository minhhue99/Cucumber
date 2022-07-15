package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class SearchPage {

	private WebDriver driver;
	WaitHelper waitHelper;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
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

	public void enterCheckinDate(String input) {
		checkinField.sendKeys(input);
	}

	public void enterCheckoutDate(String input) {
		checkoutField.sendKeys(input);
	}

	public void enterNumberofAdult(String input) {
		adultField.sendKeys(input);
	}

	public void enterNumberofChildren(String input) {
		childrenField.sendKeys(input);
	}

	public void clickonSearch() {
		searchButton.click();
	}

}
