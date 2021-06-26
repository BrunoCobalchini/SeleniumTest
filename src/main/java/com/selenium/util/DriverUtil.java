package com.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	public WebDriver myWebDriver = new FirefoxDriver();
	
	private String LINK = "https://teamshift-qa.crossknowledge.com/";
	//Add your email in the String
	private String email = "";
	//Add your password in the String
	private String password = "";
	
	
	public DriverUtil() {

	}

	public String getLink() {
		return LINK;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public String getEmail() {
		return email;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}
	
	public String getPassword() {
		return password;
	}

}