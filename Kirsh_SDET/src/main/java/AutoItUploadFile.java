import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItUploadFile {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String path="C:\\Users\\jawad\\OneDrive\\Desktop\\upload.txt";
		//clicking on choose file button
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		
		//Execute.EXE file by passing the file Path
		Runtime.getRuntime().exec("C:\\Users\\jawad\\OneDrive\\Desktop\\sql\\UploadFile1.exe  C:\\\\Users\\\\jawad\\\\OneDrive\\\\Desktop\\\\upload.txt" );
		

	}

}
