import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on the button javascript alert
		
		WebElement alt= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alt.click();
		 //switching to alert
		 
	//	WebDriverWait wait= new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.alertIsPresent());
//how to get text from the alert
	String text=	driver.switchTo().alert().getText();
	System.out.println(text);
	//click on the alert
	
	driver.switchTo().alert().accept();
	
	///   verifying the result
	String excepted="You successfully clicked an alert";
	String actual=driver.findElement(By.xpath("//p[@id='result']")).getText();
	if(excepted.equalsIgnoreCase(actual)) {
		System.out.println("the result is same :"+actual+"||The test case passed");
	}else {
		System.out.println("the result is not same :"+actual+"||The test case failed");
	}
	//===========================================================================
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	String text2=driver.switchTo().alert().getText();
	driver.switchTo().alert().dismiss();
	System.out.println(text2);
	//verifying the result 
String  result2=	driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
System.out.println("Message of the alert is :"+result2);
	
//=============================================================================
//WebDriverWait wait1= new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.alertIsPresent());

driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
driver.switchTo().alert().sendKeys("my name is jawad qureshi");
driver.switchTo().alert().accept();

		
	}

}
