package com.selenium.tests.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.util.DriverUtil;

public class Util {

	DriverUtil utilDriver = new DriverUtil();
	
	private String CLASSNAME =  "achievement-donut__num js-achievement-donut-num";

	private String LOGGEDLINK = "https://teamshift-qa.crossknowledge.com/"
			+ "access/11d2b4413cc3103a6afc8527378acc27/"
				+ "1624037949/ab7bb1b33e784f134a3debb467b6ca840ff7d7edf912a2c1568df4393c2ff39e/";
	
	private String STATUSICON = "achievement-side-items__status";
	
	private WebElement VALIDATEBAR = utilDriver.myWebDriver.findElement(By.className(CLASSNAME));
	
	
	public String getLoggedLink() {
		return LOGGEDLINK;
	}
	
	public String getStatusIcon() {
		return STATUSICON;
	}
	
	public WebElement getValidateBar() {
		return VALIDATEBAR;
	}	
}