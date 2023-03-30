package SeleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateRefreshBackFoward {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//Here I can open this webpage by get url method
		driver.get("https://www.snapdeal.com");
		//Now I want to open another webpage 
		driver.get("https://www.amazon.com");   // here on the same browser first snapdeal will open then amazon will go and open
		
		//If you want to go back to snapdeal page 
		driver.navigate().back();		
		driver.navigate().forward();//will take you to the amazon page
		Thread.sleep(2000);
		// to reload or refresh a page
		driver.navigate().refresh();
		

	}

}
