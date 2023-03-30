package crossBrowserTesting;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowseTest {
	@Parameters("Browser")
	@Test
	public void test1(@Optional ("Chrome")String browser) {
		System.out.println("Test  started current Browser is "+ browser);
		//Reporter.log("Test Started", true);
	}

}
