package anotherP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	//	driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='Advertising']	")).click();
		//driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		
		
		
		
		
		

	}

}
