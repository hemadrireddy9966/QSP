package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String args[])
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("file:///C:/Users/hemad/OneDrive/Desktop/demo.html");
	   //driver.findElement(By.tagName("a"));
	   WebElement a=driver.findElement(By.xpath(""));
	   a.click();
	   driver.close();
   }
}		