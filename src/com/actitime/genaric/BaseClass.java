package com.actitime.genaric;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.hemadri.propertyfile.Notepadproperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest(groups = {"smoke","unit"})
		public  void openBrowser() throws InterruptedException, IOException {
			driver=new ChromeDriver();
	}
	@AfterTest(groups = {"smoke","unit"})
	public  void closeBrowser() {
		driver.close();
		
	}
	@BeforeMethod(groups = {"smoke","unit"})
	public void beforeMethod() throws IOException {
		Notepadproperty n=new Notepadproperty();
		String u = n.propertyfile("url");
		driver.get(u);
      Baseclass4 b=new Baseclass4(driver);
      b.setlogin("admin", "manager");
	}
	//@AfterMethod(groups = {"smoke","unit"})
	//public void AfterMethod() {
	//	 Baseclass4 b=new Baseclass4(driver);
		// b.setlogout();
//	}
}
			