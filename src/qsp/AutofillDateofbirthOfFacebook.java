package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutofillDateofbirthOfFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(2000);
	   WebElement day = driver.findElement(By.name("birthday_day"));
	   WebElement month = driver.findElement(By.name("birthday_month"));
	   WebElement year = driver.findElement(By.name("birthday_year"));
	  Select d=new Select(day);
	  Select m=new Select(month);
	  Select y=new Select(year);
	  Thread.sleep(2000);
	  d.selectByVisibleText("10");
	  Thread.sleep(2000);
	  m.selectByIndex(4);
	  Thread.sleep(2000);
	  y.selectByValue("2000");
	  Thread.sleep(2000);
	  driver.close();
	

	}

}
