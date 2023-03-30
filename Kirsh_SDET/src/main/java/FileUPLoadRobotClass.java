import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUPLoadRobotClass {

	public static void main(String[] args) throws AWTException {
		//  CTRL + C
		//CTRL + V
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://easyupload.io/");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//clicking on file upload button
		driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]/button")).click();
		
		//ctrl+c operation
		String path="C:\\Users\\jawad\\OneDrive\\Desktop\\upload.txt";
		StringSelection selection = new StringSelection(path);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
		
//ctrl v operation
		 
		 Robot robo = new Robot();
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_V);
		 robo.keyRelease(KeyEvent.VK_V);
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 
		 //performing enter key
		 robo.keyPress(KeyEvent.VK_ENTER);
		 robo.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
	}

}
