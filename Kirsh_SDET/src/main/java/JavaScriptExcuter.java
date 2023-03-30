import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title=(String) js.executeScript("return document.title");
		
		System.out.println(title);
		
		//writing in search box
		
		WebElement ele= (WebElement) js.executeScript("return document.getElementsByName('userName')[0];");
		ele.sendKeys("my name is jawad" );
		
		
		Thread.sleep(3000);
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		WebElement iF=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iF);
		WebElement ele1=(WebElement) js.executeScript("return document.getElementById('tags')");
		ele1.sendKeys(" my name is jawad");
		
		
	}

}
