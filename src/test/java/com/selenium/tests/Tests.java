package com.selenium.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import com.selenium.tests.util.Util;
import com.selenium.util.DriverUtil;


public class Tests {

	DriverUtil testDrive = new DriverUtil();
	Util testUtil = new Util();

	//The tests doesn't need to pass, so I made some not self oriented tests

	@Test
	public void elementsCheck() {
		
		//Test to validate the bar, by default it's "00" the bar value
		String expectedZero = "00";

		System.out.println("Zero percent bar test");
		
		testUtil.getLoggedLink();
		
		assertEquals(expectedZero, testUtil.getValidateBar());

	}
	
	public void checkAddition() {
		
		//It's 11 percent in my profile, I expect pass
		String expectedPlus = "11";

		System.out.println("Plus percent bar test");
		
		testUtil.getLoggedLink();
		
		assertEquals(expectedPlus, testUtil.getValidateBar());

	}
	
	public void checkIcon() {
		
		/*There's 2 icons on my profile, one completed and one not done yet,this test
			compares both*/
		
		String doneIcon = "main__icon--achievement-completed step__icon--achievement-completed";

		System.out.println("Check the icon");
		
		testUtil.getLoggedLink();
		
		assertNotEquals(doneIcon, testUtil.getStatusIcon());;

	}

}