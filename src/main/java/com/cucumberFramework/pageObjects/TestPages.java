package com.cucumberFramework.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

public class TestPages {

	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement usernameEle;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordEle;
	
	@FindBy(xpath="//textarea[@name='comments']")
	public WebElement commentEle;
	
	@FindBy(xpath="//tbody/tr[5]/td[1]/input[2]")
	public WebElement checkbox2Ele;
	
	@FindBy(xpath="//input[@value='cb3']")
	public WebElement checkbox3Ele;
	
	@FindBy(xpath="//input[@value='rd1']")
	public WebElement radiobtn1Ele;	
	
	@FindBy(xpath="//option[@value='ms1']")
	public WebElement select1Ele;
	
	@FindBy(xpath="//option[@value='ms2']")
	public WebElement select2Ele;
	
	@FindBy(xpath="//select[@name='dropdown']")
	public WebElement dropdownEle;
	
	@FindBy(xpath="//input[@value='submit']")
	public WebElement submitEle;
	
	@FindBy(id="_valueusername")
	public WebElement outputusername;
	
	@FindBy(id="_valuepassword")
	public WebElement outputpassword;
	
	public TestPages(WebDriver driver){
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
	
	public void enterComment(String input) {
		commentEle.clear();
		commentEle.sendKeys(input);	
	}
	
	public void select_onlycheckbox2 () {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",checkbox2Ele);
		checkbox3Ele.click();
		checkbox2Ele.click();
	}
	
	public void select_radiobtn1 () {
		radiobtn1Ele.click();
	}
	
	public void  select1and2 (){
		
		Actions action = new Actions(driver);

		action.click(select1Ele);

		action.keyDown(Keys.CONTROL).click(select2Ele).keyUp(Keys.CONTROL).build()
				.perform();
		
	}
	
	public void  dropdown (){

		Select selectsimple = new Select(dropdownEle);

		selectsimple.selectByVisibleText("Drop Down Item 5");
		
	}
	
	public void clickSubmit() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",submitEle);
		submitEle.click();		
		
	}
	

	

}
