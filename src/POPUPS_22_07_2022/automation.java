package POPUPS_22_07_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException{
			try {
			WebDriver driver=new ChromeDriver();
			int count=0;
			driver.get("https://demo.automationtesting.in/Alerts.html");
			for(int i=0;i<=1;i++) {
			driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
			driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		//	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	//Thread.sleep(2000);
	if(count==0) {
	driver.switchTo().alert().accept();
	//String lo = driver.switchTo().alert().getText();
	//System.out.println(lo);
	//if(lo.contains("You pressed Ok")) {
	System.out.println("pass");
	//}
	driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
	}
	else
	{
		driver.switchTo().alert().dismiss();
	System.out.println("fail");
	}
			
			count++;
			}
     driver.close();
			}
			catch(WebDriverException e) {
			}
}
}