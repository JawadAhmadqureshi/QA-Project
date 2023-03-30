import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	/*	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	   driver.manage().window().maximize();
	  WebElement drag= driver.findElement(By.xpath("//div[@id='column-a']"));
	  WebElement drop= driver.findElement(By.xpath("//div[@id='column-b']"));
	 Actions a=new Actions(driver);
	 a.dragAndDrop(drag, drop).build().perform();*/
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement da  =driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		Thread.sleep(3000);
		WebElement d= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act1= new Actions (driver);
		act1.dragAndDrop(da, d).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	}

}
