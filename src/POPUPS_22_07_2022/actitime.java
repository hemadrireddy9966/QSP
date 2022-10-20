package POPUPS_22_07_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/user/submit_tt.do");
	driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    //Thread.sleep(500);
    driver.findElement(By.name("pwd")).sendKeys("manager");
   // Thread.sleep(500);

driver.findElement(By.id("loginButton")).click();
//Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
	//Thread.sleep(3000);
	driver.findElement(By.linkText("About your actiTIME")).click();
	//Thread.sleep(3000);
	driver.findElement(By.linkText("Read Service Agreement")).click();
	String ko = driver.getTitle();
	System.out.println(ko);
	driver.quit();
		
	}

}
