package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class PaymentPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath = "//input[@id='cardNumber']")
	public WebElement cardnumberField;

	@FindBy(xpath = "//input[@id='ownerName']")
	public WebElement nameoncardField;
	
	@FindBy(xpath = "//input[@name='expiry']")
	public WebElement expirydateField;
	
	@FindBy(xpath = "//input[@id='cvvcode']")
	public WebElement cvvnumberField;
	
	@FindBy(xpath = "//form[@id='cardForm']//input[@value='Pay Now']")
	public WebElement paynowButton;
	
	public void enterCardnumber(String input) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", cardnumberField);
		cardnumberField.sendKeys(input);
	}
	
	public void enterNameoncard(String input) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", nameoncardField);
		nameoncardField.sendKeys(input);
	}
	
	public void enterExpirydate(String input) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", expirydateField);
		expirydateField.sendKeys(input);
	}
	
	public void enterCVVnumber(String input) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", cvvnumberField);
		cvvnumberField.clear();
		cvvnumberField.sendKeys(input);
	}
	
	public void clickonPaynow() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", paynowButton);
		jss.executeScript("arguments[0].click()", paynowButton);
	}

}
