package com.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import com.selenium.util.DriverUtil;

public class LoginTest {
	//Run here
	public static void main(String[] args) throws InterruptedException {

		//The Firefox driver it's on my path "C:geckoDriver/geckodriver.exe"
		
		DriverUtil mainDriver = new DriverUtil();
		
		String loginLogClass = "login-form__login";
		
		String LoginPassClass = "login-form__password";

		//The test link
		mainDriver.myWebDriver.get(mainDriver.getLink());

		
		mainDriver.myWebDriver.manage().window().maximize();

		mainDriver.myWebDriver.findElement(By.className("js-navbar-form__fields"))
			.click();

		mainDriver.myWebDriver.findElement(By.id(loginLogClass))
			.sendKeys(mainDriver.getEmail());

		mainDriver.myWebDriver.findElement(By.id(loginLogClass))
			.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		mainDriver.myWebDriver.findElement(By.id(LoginPassClass))
			.sendKeys(mainDriver.getPassword());
		
		mainDriver.myWebDriver.findElement(By.id(LoginPassClass))
			.sendKeys(Keys.ENTER);

		Thread.sleep(7000);
		
		mainDriver.myWebDriver.quit();
		
	}

}