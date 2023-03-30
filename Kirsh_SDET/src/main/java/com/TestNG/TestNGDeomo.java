package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDeomo {
	@Test(description="5th prayer",priority = 5)
	public static void isha() {
		System.out.println(" pray isha namza");
	}
	@Test(description="3rd prayer",priority= 3)
	public static void asar() {
		System.out.println("pray the asar namaz");
		//Assert.assertTrue(false, "Test case failed");
		SoftAssert ass= new SoftAssert();
		ass.assertTrue(false, "test case failed");
		
		System.out.println("my name is jawad");
		System.out.println(" I am from pakistan");
	}
	
	@Test(description="2nd prayer",priority= 2)
	public static void zuhar() {
		System.out.println("Pray zuhar namaz");
	}
	@Test(priority = 4)
	public static void magrib() {
		System.out.println("pray magraib namaz");
		Assert.assertTrue(true, "Testcase passed");
		System.out.println("my name is jawad");
	}
	@Test(priority = 1,invocationCount =1)
	public static void fajar () {
		System.out.println("pray fajar namaz");
	}@BeforeMethod
	public static void wozu() {
		System.out.println("make wozu befor prayer");
	}
	@AfterMethod
	public static void dua() {
		System.out.println("Do the Dua");
	}@BeforeClass//                  execute only one time 
	public static void getup() {
		System.out.println("Get up Early in the moring");
	}
	@AfterClass
	public static void sleepEarly() {
		System.out.println("Sleep early at night time");
	}
	@BeforeSuite
	public static void eman() {
		System.out.println("Allhumdullialah i am a muslim");
	}
	@Test(description= "eid namaz",enabled=true, dependsOnMethods = {"ramadan"})
	public static void chotaEid() {
		System.out.println("came after Ramadan");
		Assert.assertTrue(true, "test case passed");
	}
	@Test
	public static void ramadan(){
		System.out.println("If you keep the fast");
		Assert.assertTrue(false, "test case p");
	}
	@AfterSuite
	public static void eman1() {
		System.out.println("Inshallah I will die as a muslim");
	}

}
