package ucpox;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ucDemo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ucpro-ucpoxmap.netlify.app/");
		Thread.sleep(5000);
	System.out.println(driver.getTitle());
	
	
	Thread.sleep(5000);
 WebElement address = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
 address.click();
	
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[contains(text(),'More')]")).click();
	 Thread.sleep(5000);
	 driver.switchTo().frame(0);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//div[@class='modal-close-button']")).click();
	 driver.findElement(By.linkText("×")).click();
	 Thread.sleep(5000);
	driver.close();
	 WebElement l = driver.findElement(By.xpath("//div[@class='py-3']"));
	
		
	}

}