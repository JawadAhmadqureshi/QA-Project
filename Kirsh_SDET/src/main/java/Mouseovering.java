import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseovering {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	   driver.manage().window().maximize();
	   
	  // driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
	   driver.get("https://the-internet.herokuapp.com/hovers");
	   
	   //enable  
	   WebElement enabled=driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
	   //overing on download
	  WebElement download= driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
	  WebElement excel = driver.findElement(By.xpath("//a[normalize-space()='Excel']"));
	  Actions act= new Actions(driver);
	  act.moveToElement(enabled).pause(2000).moveToElement(download).pause(2000).moveToElement(excel).click().build().perform();
	   
	   
	   /*enable  
	   WebElement enabled=driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/a"));
	   //overing on download
	  WebElement download= driver.findElement(By.xpath("//a[normalize-space()='Downloads']"));
	  WebElement excel = driver.findElement(By.xpath("//a[normalize-space()='Excel']"));
	  Actions act= new Actions(driver);
	  act.moveToElement(enabled).pause(2000).moveToElement(download).pause(2000).moveToElement(excel).click().build().perform();*/
	}
	
	
	

}
