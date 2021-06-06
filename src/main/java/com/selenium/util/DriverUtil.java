package com.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	private String LINK = "https://teamshift-qa.crossknowledge.com/";

	private String PASSWORD = "WLS2020qa";

	public WebDriver myWebDriver = new FirefoxDriver();

	
	public DriverUtil() {

	}

	public String getLink() {
		return LINK;
	}
	
	public String getPassword() {
		return PASSWORD;
	}

}