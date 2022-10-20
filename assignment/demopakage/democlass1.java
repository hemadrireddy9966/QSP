package demopakage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class democlass1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@Test
		public  void openBrowser() throws InterruptedException, IOException {
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.close();
	}
}
