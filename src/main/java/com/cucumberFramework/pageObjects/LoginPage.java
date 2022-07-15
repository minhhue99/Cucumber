package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class LoginPage {

	private WebDriver driver;
	WaitHelper waitHelper;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//a[@data-toggle='modal'][normalize-space()='Login']")
	public WebElement loginTab;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement usernameField;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@value='Sign In']")
	public WebElement signinButton;

	@FindBy(xpath = "//a[@id='NavebarProfileDrop']")
	public WebElement profile;
	
	@FindBy(xpath = "//label[@id='loginError']")
	public WebElement loginerror;

	public void clickonLogin() throws Exception {
		loginTab.click();
	}

	public void enterUsername(String input1) {
		waitHelper.WaitForElement(usernameField, 10);
		usernameField.sendKeys(input1);
	}

	public void enterPassword(String input2) {
		waitHelper.WaitForElement(passwordField, 10);
		passwordField.sendKeys(input2);
	}

	public void clickonSignin() {
		signinButton.click();
	}
	
	public void loginwithcustomeraccount() {
		loginTab.click();
		waitHelper.WaitForElement(usernameField, 10);
		usernameField.sendKeys("hoangny");
		waitHelper.WaitForElement(passwordField, 10);
		passwordField.sendKeys("123456");
		signinButton.click();
	}

}
