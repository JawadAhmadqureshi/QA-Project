

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
  
  
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  
		  //selecting dropdown list
		  
		Select  drp=new Select (driver.findElement(By.xpath("//select[@name='country']")));
	List <WebElement> allitems=	drp.getOptions();
	System.out.println("drop down size is "+allitems.size());
	
	//printing all the list
	
	for (int i=0;i<allitems.size();i++) {
		System.out.println("Element text is "+allitems.get(i).getText());
		
		
		drp.selectByValue("TURKEY");
		
		
		
		
	}
		        
	}

}
