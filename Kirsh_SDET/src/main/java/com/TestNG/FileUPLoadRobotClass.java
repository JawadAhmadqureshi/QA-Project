package com.TestNG;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUPLoadRobotClass {
	
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
		}}
@AfterMethod
public  void close() {
	driver.close();
	
}
	@Test
	public void upload() throws AWTException {
		//  CTRL + C
		//CTRL + V
		
	
		//clicking on file upload button
		driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]/button")).click();
		
		//ctrl+c operation
		String path="C:\\Users\\jawad\\OneDrive\\Desktop\\upload.txt";
		StringSelection selection = new StringSelection(path);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
		
//ctrl v operation
		 
		 Robot robo = new Robot();
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_V);
		 robo.keyRelease(KeyEvent.VK_V);
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 
		 //performing enter key
		 robo.keyPress(KeyEvent.VK_ENTER);
		 robo.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
	}

}
