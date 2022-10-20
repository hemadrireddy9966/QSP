package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatethePage {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public void hemadri() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.name("username")).sendKeys("admin");
     Thread.sleep(500);
     driver.findElement(By.name("pwd")).sendKeys("manager");
     Thread.sleep(500);

driver.findElement(By.id("loginButton")).click();
Thread.sleep(5000);

driver.close();
return ;

	}

}
