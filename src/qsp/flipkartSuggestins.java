package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartSuggestins {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone");
	
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Naresh99");
	//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("//button[.='Request OTP']")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	List<WebElement> allaugg=driver.findElements(By.xpath(""));
	driver.close();
	
}	
}
