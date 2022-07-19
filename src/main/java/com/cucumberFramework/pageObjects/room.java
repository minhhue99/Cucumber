package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebElement;

public class room {

	String roomName = "";
	int roomAdult, roomChildren;
	double roomPrice;
	WebElement viewdetail;

	public room (String pname,int padult, int pchildren, double pprice, WebElement pviewdetail) {

		setRoomName(pname);
		setAdult(padult);
		setChildren(pchildren);
		setRoomPrice(pprice);
		setViewdetail(pviewdetail);
	}
	
	
	public void setRoomName(String name) {
		roomName = name;
	}

	public void setAdult(int adult) {
		roomAdult = adult;
	}
	
	public void setChildren(int children) {
		roomChildren = children;
	}
	
	public void setRoomPrice(double price) {
		roomPrice = price;
	}	
	
	public void setViewdetail(WebElement pviewdetail) {
		viewdetail = pviewdetail;
	}	
	
	public int getAdult() {
		return roomAdult;
	}
	
	public int getChildren() {
		return roomChildren;
	}
	
	public WebElement getViewDetailEle() {
		return viewdetail;
	}
	
}
