package com.cucumberFramework.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;
import com.google.common.base.CharMatcher;
import com.cucumberFramework.helper.Constants;

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

	@FindBy(xpath = "//strong[contains(.,'adult')]")
	public List<WebElement> adultEle;

	@FindBy(xpath = "//strong[contains(.,'children')]")
	public List<WebElement> childrenEle;

	@FindBy(xpath = "/html/body/section[2]/div/div/div/div/div[2]")
	public List<WebElement> roomList;

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

	public void verify_AdultNumber_ChildrenNumber() {
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("arguments[0].scrollIntoView(true);", viewdetailButton);
//		for (int countAdult = 1; countAdult <= adultEle.size(); countAdult++) {
//			String expectedAdultNumberString = adultEle.get(countAdult).getText();
//			int expectedAdultNumber = Integer.parseInt(expectedAdultNumberString.replaceAll("[^0-9]", ""));
//			System.out.println(expectedAdultNumber);
//			if (expectedAdultNumber >= Constants.aduld_number) {	
//				
//			}
//		}

//		for (int countChildren = 0; countChildren <= childrenEle.size(); countChildren++) {
//			String expectedChildrenNumberString = childrenEle.get(countChildren).getText();
//			int expectedChildrenNumber = Integer.parseInt(expectedChildrenNumberString.replaceAll("[^0-9]", ""));
//			System.out.println(expectedChildrenNumber);
////			if (expectedAdultNumber >= Constants.aduld_number) {

//			}

		List<Room> listOfRoom = new ArrayList<>();

		for (int i = 0; i < roomList.size(); i++) {

			String roomname = roomList.get(i).findElement(By.xpath("div/h5")).getText();
			System.out.println(roomname);

			String Adult = roomList.get(i).findElement(By.xpath("div/div[1]/strong[1]")).getText().replaceAll("[^0-9]",
					"");
			int adult = Integer.parseInt(Adult);
			System.out.println(adult);

			String Children = roomList.get(i).findElement(By.xpath("div/div[1]/strong[2]")).getText()
					.replaceAll("[^0-9]", "");
			int children = Integer.parseInt(Children);
			System.out.println(children);

			String price = roomList.get(i).findElement(By.xpath("div/p/strong")).getText().replace("$", "");
			double Price = Double.parseDouble(price);
			System.out.println(Price);

		}
		if (adult >= Constants.aduld_number && children >= Constants.children_number) {
			
		}

	}

}
