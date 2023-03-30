package com.TestNG;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	WebDriver driver;
	@BeforeMethod
	@Parameters(value= {"Browser"})
	public void lunch(String  browser) {
		WebDriverManager.firefoxdriver().setup();
		if(browser.toLowerCase().contains("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (browser.toLowerCase().contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else if (browser.toLowerCase().contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
	
}

@AfterMethod
public  void close() {
	driver.close();
	
}
@Test
	public  void radio() {
		
		  
       List <WebElement> radiobutton=   driver.findElements(By.xpath("//input[@name='servClass']"));
		 
       radiobutton.get(2).click();


	}

}
