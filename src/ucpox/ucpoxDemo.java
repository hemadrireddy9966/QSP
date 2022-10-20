package ucpox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ucpoxDemo {
	static {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	//	WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ucpro-ucpoxdash.netlify.app/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Login with Google']")).click();
		Thread.sleep(5000);
		String pwh = driver.getWindowHandle();
		//System.out.println(pwh);
		 Set<String> allwh = driver.getWindowHandles();
		//System.out.println(allwh);
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			if(pwh.equals(wh)) {
				
			}
			else {
					driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]")).sendKeys("hemadrireddy1166@gmail.com");
				
				driver.findElement(By.xpath("//span[.='Next']")).click();
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Naresh@99");
				//driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
			}
		}
		//driver.close();
	}

}
