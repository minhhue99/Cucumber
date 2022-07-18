package com.cucumberFramework.pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumberFramework.helper.WaitHelper;

public class SetupRoomsPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;

	public SetupRoomsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	@FindBy(xpath = "//i[@class='fa fa-angle-down']")
	public WebElement angledownicon;
	
	@FindBy(xpath = "//a[normalize-space()='Go to Admin']")
	public WebElement gotoadminbtn;
	
	@FindBy(xpath = "//span[normalize-space()='Room Types']")
	public WebElement roomtypebtn;
	
	@FindBy(xpath = "//span[normalize-space()='Add Room Type']")
	public WebElement addroomtypebtn;
	
	@FindBy(xpath = "//input[@id='txtRoomName']")
	public WebElement titleField;
	
	@FindBy(xpath = "//input[@name='price']")
	public WebElement priceField;
	
	@FindBy(xpath = "//input[@id='list2']")
	public WebElement adultdrop;

	@FindBy(xpath = "//input[@id='list3']")
	public WebElement childrendrop;
	
	@FindBy(xpath = "//textarea[@id='text7']")
	public WebElement descriptionField;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']//span[@class='mdl-button__ripple-container']")
	public WebElement submitaddroombtn;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchroombox;
	
	@FindBy(xpath = "//tr[@class='gradeX odd']")
	public WebElement roomrecord;
	
	public void clickonaddRoomType() {
		waitHelper.WaitForElement(addroomtypebtn, 10);
		addroomtypebtn.click();
	}
	
	public void selectrandomAdult() {
		adultdrop.click();
		int valueadult = ThreadLocalRandom.current().nextInt(1,5);
		driver.findElement(By.xpath("(//li[@class='mdl-menu__item'][normalize-space()='" + valueadult + "'])[1]")).click();

	}
	
	public void selectrandomChildren() {
		childrendrop.click();
		int valuechild = ThreadLocalRandom.current().nextInt(1,5);
		driver.findElement(By.xpath("(//li[@class='mdl-menu__item'][normalize-space()='" + valuechild + "'])[2]")).click();	
	}
	
//	public void entertitle(String title) {
//		titleField.sendKeys(title);
//		String expectedtitle = title;
//	}
	
	public void entertitleroomtosearch(String input) {
		waitHelper.WaitForElement(searchroombox, 10);
		searchroombox.sendKeys(input);
	}
	
	public void verifynewaddedroom(String expectedtitle) {
				assertTrue(roomrecord.getText().contains(expectedtitle));	
	}
}
