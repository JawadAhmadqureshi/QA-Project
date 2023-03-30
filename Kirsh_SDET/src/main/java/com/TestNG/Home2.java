package com.TestNG;

import org.testng.annotations.Test;

public class Home2 {
	@Test(description="My 2nd home",priority=2,groups = {"Regression"})
	public static void Pakcase2() {
		System.out.println("THis is Test case 2");
	}
}
