package com.TestNG;

import org.testng.annotations.Test;

public class Home3 {
	@Test(description="my 3rd home",priority = 3,groups = {"Sanity"})
	public static void Pakcase3() {
		System.out.println("THis is Test case 3");
	}
}
