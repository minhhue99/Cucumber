package com.cucumberFramework.pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.helper.Constants;

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
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement successbookingmsg;
	
	public void enterCardnumber() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", cardnumberField);
		waitHelper.WaitForElement(cardnumberField, 10);
		cardnumberField.sendKeys(Constants.card_number);
	}
	
	public void enterNameoncard() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", nameoncardField);
		nameoncardField.sendKeys(Constants.name_on_card);
	}
	
	public void enterExpirydate() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", expirydateField);
		expirydateField.sendKeys(Constants.expiry_date);
	}
	
	public void enterCVVnumber() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", cvvnumberField);
		cvvnumberField.clear();
		cvvnumberField.sendKeys(Constants.cvv);
	}
	
	public void clickonPaynow() {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", paynowButton);
		jss.executeScript("arguments[0].click()", paynowButton);
	}
	
	public void verifySuccessMsg(String input) {
		assertTrue(successbookingmsg.getText().contains(input));
	}
	
		

}
