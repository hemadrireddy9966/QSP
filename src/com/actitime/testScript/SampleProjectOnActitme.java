package com.actitime.testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genaric.BaseClass;
import com.actitime.genaric.Baseclass4;

public class SampleProjectOnActitme extends BaseClass {
	@Test
public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
	driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HDFC_001");
	driver.findElement(By.xpath("(//textarea[@placeholder='Enter Customer Description'])")).sendKeys("Banking Project");
	driver.findElement(By.xpath("//div[@class='emptySelection']")).click();
	driver.manage().deleteAllCookies();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//div[text()='Our company']")).click();
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	String a = "Customer'HDFC_001' has been created";
}
}
