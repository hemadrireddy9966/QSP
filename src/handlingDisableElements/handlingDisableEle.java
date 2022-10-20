package handlingDisableElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handlingDisableEle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hemad/OneDrive/Desktop/disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		JavascriptExecutor j=r;
		j.executeScript("document.getElementById('d2').value='manager'");
		Thread.sleep(5000);
		j.executeScript("document.getElementById('d3').click");
		
		
		
		
		
	}

}
