package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class BookingPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//a[1]")
	public WebElement viewdetailButton;

	@FindBy(xpath = "//input[@value='Book Now']")
	public WebElement booknowButton;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement fullnameField;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;

	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phoneField;

	@FindBy(xpath = "//textarea[@id='address']")
	public WebElement addressField;

	@FindBy(xpath = "//label[@class='custom-control custom-checkbox']")
	public WebElement checkbox;

	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement submitButton;

	public void clickonViewdetails() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", viewdetailButton);
		jss.executeScript("arguments[0].click()", viewdetailButton);
	}

	public void clickonBooknow() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", booknowButton);
		jss.executeScript("arguments[0].click()", booknowButton);
	}

	public void enterFullname(String input) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", fullnameField);
		fullnameField.sendKeys(input);
	}

	public void enterEmail(String input) {
		emailField.sendKeys(input);
	}

	public void enterPhone(String input) {
		phoneField.sendKeys(input);
	}

	public void enterAddress(String input) {
		addressField.sendKeys(input);
	}

	public void tickCheckbox() {
		checkbox.click();
	}

	public void clickonSubmit() {
		submitButton.click();
	}
}
