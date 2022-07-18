package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class CheckPage {

	WaitHelper waitHelper;

	public CheckPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//span[@class='sb-icon-search']")
	public WebElement searchIcon;

	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchField;

	@FindBy(xpath = "//span[@class='green_text1 float-right']")
	public WebElement expectedBookingnumber;

	@FindBy(xpath = "//input[@class='sb-search-submit']")
	public WebElement searchSubmit;
	
	@FindBy(xpath = "//h1[@class='mmb-blc-title']")
	public WebElement errorsearchmsg;
	
	public void clickonSearchicon() {
		searchIcon.click();
	}

	public void enterBookingnumber(String input) {
		waitHelper.WaitForElement(searchField, 10);
		searchField.sendKeys(input);
	}

	public void clickonSearchsubmit() {
		searchSubmit.click();
	}
}
