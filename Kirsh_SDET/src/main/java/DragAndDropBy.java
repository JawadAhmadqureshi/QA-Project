import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe")));
		Actions act2= new Actions(driver);
		
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	act2.dragAndDropBy(slider, 500, 0).build().perform();
		
	}

}
