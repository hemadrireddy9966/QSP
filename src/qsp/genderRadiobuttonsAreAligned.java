package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class genderRadiobuttonsAreAligned  {
static {
	System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new OperaDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		int fax = driver.findElement(By.name("sex")).getLocation().getX();
		int max = driver.findElement(By.name("sex")).getLocation().getX();
		int cax = driver.findElement(By.name("sex")).getLocation().getX();
		if(fax==max&&fax==cax&&max==cax) {
			System.out.println("passed");
		}
		else {
			System.out.println("fail");
		}
		System.out.println(fax);
		System.out.println(max);
		System.out.println(cax);
		driver.close();
}
}