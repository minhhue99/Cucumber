package com.cucumberFramework.pageObjects;

public class Room {

	String roomName = "";
	int roomAdult, roomChildren;
	double roomPrice;

	public void room (String pname,int padult, int pchildren, double pprice ) {

		setRoomName(pname);
		setAdult(padult);
		setChildren(pchildren);
		setRoomPrice(pprice);
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
}
