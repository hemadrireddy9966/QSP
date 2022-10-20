package handlingsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vTiger {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(resources).perform();
	//	driver.findElement(By.)
		
	}

}
