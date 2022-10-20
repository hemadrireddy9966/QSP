package mouseclicks29_07_2022;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions o=new ChromeOptions();
		//o.addArguments("__disable_notificastions");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement r = driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(r).perform();
		Thread.sleep(5000);
		Alert l = driver.switchTo().alert();
		String p = l.getText();
		System.out.println(p);
		l.dismiss();
		
	}

}
