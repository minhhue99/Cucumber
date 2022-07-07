package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

public class SaucedemoPage {

	private WebDriver driver;
	WaitHelper waitHelper;

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement usernameEle;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordEle;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginbtnEle;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	public WebElement filterdropdownEle;

	@FindBy(xpath = "//span[@class='active_option']")
	public WebElement default_filterdropdownEle;

	@FindBy(xpath = "(//button[contains(@class,'inventory')])[1]")
	public WebElement addFirstproductEle;

	@FindBy(xpath = "(//button[contains(@class,'inventory')])[6]")
	public WebElement addLastproductEle;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public WebElement shoppingcartbadgeEle;

	@FindBy(xpath = "(//button[contains(.,'Remove')])[1]")
	public WebElement removeFirstproductEle;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cartlinkEle;

	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
	public WebElement actual_ItemPriceEle;

	@FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
	public WebElement actual_ItemNameEle;

	@FindBy(xpath = "(//div[@class='inventory_item_name'])[6]")
	public WebElement expected_ItemNameEle;

	@FindBy(xpath = "(//div[@class='inventory_item_price'])[6]")
	public WebElement expected_ItemPriceEle;
	

	public SaucedemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void enterUsename(String input) {
		usernameEle.sendKeys(input);
	}

	public void enterPassword(String input) {
		passwordEle.sendKeys(input);
	}

	public void selectLowtoHigh() {
		Select Select_dd = new Select(filterdropdownEle);

		Select_dd.selectByValue("lohi");
	}

	public void addFirstproduct() {
		addFirstproductEle.click();
	}

	public void addLastproduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addLastproductEle);
		addLastproductEle.click();
	}

	public void removeFirstproduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", removeFirstproductEle);
		removeFirstproductEle.click();
	}

	public void clickontheCart() {
		cartlinkEle.click();
	}

}
