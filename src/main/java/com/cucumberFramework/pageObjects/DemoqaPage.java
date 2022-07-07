package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class DemoqaPage {

	private WebDriver driver;
	WaitHelper waitHelper;

	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li/span[contains(text(),'Text Box')]")
	public WebElement textBoxTab;

	@FindBy(xpath = "//input[@id='userName']")
	public WebElement fullname_txt;

	@FindBy(id = "userEmail")
	public WebElement email_txt;

	@FindBy(id = "currentAddress")
	public WebElement currentAddress_txt;

	@FindBy(id = "permanentAddress")
	public WebElement permanentAddress_txt;

	@FindBy(id = "submit")
	public WebElement submit_btn;

	@FindBy(id = "output")
	public WebElement output_text;

	@FindBy(xpath = "//div[@id='output']//p[@id='name']")
	public WebElement output_Name;

	@FindBy(xpath = "//div[@id='output']//p[@id='email']")
	public WebElement output_email;

	public DemoqaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void clickTextBoxTab() {
		textBoxTab.click();

	}

	public void enterfullName(String input) {
		fullname_txt.sendKeys(input);
	}

	public void enterEmail(String input) {
		email_txt.sendKeys(input);
	}

	public void enterCurrentAddress(String input) {
		currentAddress_txt.sendKeys(input);
	}

	public void enterPermanentAddress(String input) {
		permanentAddress_txt.sendKeys(input);
	}

	public void clickSubmit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submit_btn);
		submit_btn.click();

	}

}
