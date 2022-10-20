package com.actitime.genaric;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass3 {
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
		public  void openBrowser(String browserName) throws InterruptedException, IOException {
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			Thread.sleep(10000);
			driver=new FirefoxDriver();
			Reporter.log("browsername is="+browserName+"",true);
		}
	
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			Thread.sleep(10000);
			driver=new ChromeDriver();
			Reporter.log("browsername is="+browserName+"",true);
		}
	}
		@AfterMethod
		public void AfterMethod() throws InterruptedException {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			driver.close();
		}
	}
	
