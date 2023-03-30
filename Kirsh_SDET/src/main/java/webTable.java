import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		//get rows and columes
	List <WebElement> rows=	driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	List <WebElement>cols = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
	for (int i = 1 ;i<rows.size();i++) {
		for (int j= 1;j<cols.size();j++) {
	String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+ i +"]/td["+ j +"]")).getText();
	System.out.println("row:"+ i +"column:" +j + "Text ::"+ text);
	}
	}

}
}