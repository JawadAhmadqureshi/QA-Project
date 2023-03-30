package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedIsEnabledIsSelected {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// isDisplayed()                           //isEnabled()
		
	WebElement searchStore=	driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	  searchStore.isDisplayed();
	  System.out.println("Displayed="+ searchStore.isDisplayed());  //return true or false
	  searchStore.isEnabled();
	  System.out.println("Enabled ="+searchStore.isEnabled());// return true or false
	  
	  //isSelected();
	WebElement maleButton=  driver.findElement(By.xpath("//input[@id='gender-male']"));
	 WebElement femaleButton= driver.findElement(By.xpath("//input[@id='gender-female']"));
	  maleButton.isSelected();
	  femaleButton.isSelected();
	
	  femaleButton.click();
	  
	  System.out.println( "male raido button ="+   maleButton.isSelected()       );
	  System.out.println  ("female raido button ="  +   femaleButton.isSelected());
	  
	  
	  
	  
	  driver.close();
	  
	}

}
