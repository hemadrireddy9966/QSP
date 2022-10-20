package handlingDisableElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcScrollbar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();	
		int hori = driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
		int var = driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getX();
		System.out.println(hori);
		System.out.println(var);
		JavascriptExecutor r=(JavascriptExecutor) driver;
		r.executeScript("window.scrollTo(0,"+hori+")");
	r.executeScript("window.scrollBy(0,0)");
	Thread.sleep(200);
		driver.close();





	}
}