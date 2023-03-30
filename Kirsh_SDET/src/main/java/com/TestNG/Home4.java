package com.TestNG;

import org.testng.annotations.Test;

public class Home4 {
@Test(description="my 4th home",priority=4,groups = {"Smoke"})
	public static void Pakcase4() {
		System.out.println("THis is Test case 4");
	}
@Test(groups= {"Regression"})
public static void Home5() {
	System.out.println("This is my 5th home");
}
@Test(groups= {"Smoke"})
public static void Home6() {
	System.out.println("This is my 6th home");
}
}
