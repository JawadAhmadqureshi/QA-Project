package com.TestNG;

import org.testng.annotations.Test;

public class Home1 {
	@Test(description="my first home",priority = 1,groups = {"Smoke","Regression"})
	public static void Pakcase1() {
		System.out.println("THis is Test case 1");
	}
	public static void location1() {
		System.out.println("My first home is in doaba");
	}
	

}
