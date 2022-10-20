package demopakage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class democlass {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	@Test
		public  void openBrowser() throws InterruptedException, IOException {
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			
			driver.close();
	}
}
