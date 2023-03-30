package com.TestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
	WebDriver driver;
  @AfterMethod
  public  void closeBrowser() {
	  driver.close();
	  
  }
	@BeforeMethod
	@Parameters({"browsername","url"})
	public void lunch(String  nameOfBrowser, String link) {
	       driver = new ChromeDriver();
	       if (nameOfBrowser.equals("chrome")) {
			   WebDriverManager.chromedriver().setup();
               driver =new ChromeDriver();
	       }
	       driver.get(link);
		 
	}
  @Test
	public void Dropdown (){
		
		  
		  //selecting dropdown list
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		Select  drp=new Select (driver.findElement(By.xpath("//select[@name='country']")));
	List <WebElement> allitems=	drp.getOptions();
	System.out.println("drop down size is "+allitems.size());
	
	//printing all the list
	
	for (int i=0;i<allitems.size();i++) {
		System.out.println("Element text is "+allitems.get(i).getText());
		
		
		drp.selectByValue("TURKEY");
		
		
		
		
	}
		        
	}

}
