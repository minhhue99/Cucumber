package com.cucumberFramework.pageObjects;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

public class CancelPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;

	public CancelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	public WebElement angledown;
	
	@FindBy(xpath = "//a[normalize-space()='My Bookings']")
	public WebElement mybookingsEle;
	
	@FindBy(xpath = "(//a[@href='#'][contains(.,'Cancel')])[1]")
	public WebElement cancelButton;
	
	@FindBy(xpath = "(//select[contains(@class,'form-control large_fild select_height48')])[1]")
	public WebElement cancelDropdown;
	
	@FindBy(xpath = "(//input[@value='Cancel'])[1]")
	public WebElement cancelsubmitButton;
	
	@FindBy(xpath = "(//a[@href='#'][contains(.,'Cancel')])")
	public List<WebElement> cancelButtonList;
	
	public void clickonCancelbooking() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", cancelButton);
		js.executeScript("arguments[0].click()", cancelButton);
		waitHelper.WaitForElement(cancelDropdown, 30);
	}
	
	public void selectrandomReason() {
		Select Select_dd = new Select(cancelDropdown);
		List<WebElement> dd = Select_dd.getOptions();
		int countsize = dd.size();
		int option = ThreadLocalRandom.current().nextInt(0, countsize + 1);
		Select_dd.selectByIndex(option);
	}
	
}

