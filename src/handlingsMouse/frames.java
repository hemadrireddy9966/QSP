package handlingsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		WebElement st = driver.findElement(By.id("frame1"));
		Thread.sleep(2000);
		driver.switchTo().frame(st);
		WebElement st2 = driver.findElement(By.id("frame2"));
		Thread.sleep(2000);
		driver.switchTo().frame(st2);
	}
	
}
