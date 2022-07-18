package com.cucumberFramework.helper;

import java.util.concurrent.ThreadLocalRandom;

public class Constants {


//	public final static String userName = "admin";
//	public final static String password = "password";
//	
//	public final static long explicitWait = 100;
//	public final static long impliciteWait = 100;
//	
//	public static String getUsername() {
//		return userName;
//	}
//	public static String getPassword() {
//		return password;
//	}
//	public static long getExplicitwait() {
//		return explicitWait;
//	}
//	public static long getImplicitewait() {
//		return impliciteWait;
//	}
	
	public final static String pageurl = "http://14.176.232.213:8084/";
	public final static String card_number = "2222 3333 4444 5555";
	public final static String name_on_card = "JOHN HENRY";
	public final static String expiry_date = "12/21";
	public final static String cvv = "123";
	public static final int aduld_number = ThreadLocalRandom.current().nextInt(1, 5);
	public static final int children_number = ThreadLocalRandom.current().nextInt(1, 5);

}
