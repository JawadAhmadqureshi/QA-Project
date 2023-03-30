package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		   
	        driver.get("https://www.stqatools.com");
	 
	        // Male Radio btnlocation store into maleRadioBtn WebElement
	        WebElement RadioBtn = driver.findElement(By.id("gen-male"));
	 
	        // Click on Radio Button
	        RadioBtn.click();
	 
	        // Cricket Checkbox location store into Checkbox WebElement
	        WebElement Cricket = driver.findElement(By.id("cricket"));                       
	 
	        // Hockey Checkbox location store into Checkbox WebElement
	        WebElement Hockey = driver.findElement(By.id("hockey"));                       
	 
	        // Select Multiple Checkboxes
	        Cricket.click();
	 
	        Hockey.click();
	}

}
