package practicefolder;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class createcustmer {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public static void createcust() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get(datareading.DataRaedn("url"));
		

	}

}
