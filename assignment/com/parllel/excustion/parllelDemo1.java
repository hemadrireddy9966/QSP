package com.parllel.excustion;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genaric.BaseClass3;

public class parllelDemo1 extends BaseClass3 {
	@Test
	public void beforeMethod() throws IOException, InterruptedException {
		
		driver.get("https://demo.actitime.com/");
		Thread.sleep(10000);
		     driver.findElement(By.name("username")).sendKeys("admin");
		     driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
	}
}
