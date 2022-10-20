package POPUPS_22_07_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automaticCareins  {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement yer=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		yer.click();
		Select s1=new Select(yer);
		s1.selectByVisibleText("2000");
		Thread.sleep(2000);
		//driver.findElement(By.id("dob")).click();
		WebElement mon= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		mon.click();
		Select s=new Select(mon);
		s.selectByValue("4");
		Thread.sleep(2000);
		WebElement a3 = driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[10]"));
		a3.click();
		//WebElement a4 = driver.findElement(By.xpath("//td[@data-handler='selectDay']"));
		
		//Select s2=new Select(a3);
		//s2.selectByVisibleText("15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("7702341425");
		driver.findElement(By.xpath("//button[@class='submit-login']")).click();
		Thread.sleep(2000);
	 boolean text= driver.findElement(By.id("policynumberError")).isDisplayed();
	 if(text==true)
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("faill");
	 }
		driver.close();
	}
	catch(WebDriverException e) {
		
	}
	}
}

