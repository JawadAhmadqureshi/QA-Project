package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Car {
	@Test(description="honda modle 2015", priority = 1, invocationCount=2)
	public static void honda() {
		
		System.out.println("My first car");
	}
	@Test(description = "toyota modle 2022",priority=2)
	public static void toyota() {
		System.out.println("This is my second car");
	}
	@Test(description = "BMW modle 2023",enabled=false)
	public static void BMW() {
		System.out.println("My third car");
	}
	@Test(description ="modle 2023",priority =4)
	public static void porche() {
		System.out.println("My dream car");
		Assert.assertTrue(true, "I will buy the care ");
	}
	@Test(description="Mercedes modle 2000",priority =5)
	public static void mercedes() {
		System.out.println(" my dad car");
		SoftAssert ass= new SoftAssert();
		ass.assertTrue(false,"mercedes is not a good car");
	}
	@BeforeClass
	public static void beforeBuying() {
		System.out.println("Before buying a car please check the condition");
	}
	@AfterClass
	public static void AfterBying () {
		System.out.println("make sure the care is in good condition");
	}
	@AfterSuite
	public static void vistFacotry() {
		System.out.println("first vist the factory");
	
	}
	@BeforeSuite
	public static void leavethefactory() {
		System.out.println("Leave the factory if it is standard  ");
	}
	@BeforeMethod
	public static void BringMoney() {
		System.out.println("take money with you");
		
		
	}
	@AfterMethod
	public static void takeRecipit(){
		System.out.println("Take the recipit");
	}

}
