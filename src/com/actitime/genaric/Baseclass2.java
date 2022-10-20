package com.actitime.genaric;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Baseclass2 {
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
		public  void openBrowser(String browserName) throws InterruptedException, IOException {
		//if(browserName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			//Thread.sleep(10000);
			//driver=new FirefoxDriver();
			//Reporter.log("browsername is="+browserName+"",true);
		//}
		 if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.msedge.driver","./driver/msedgedriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			Thread.sleep(10000);
			driver=new EdgeDriver();
			Reporter.log("browsername is="+browserName+"",true);
		}
		//else if(browserName.equalsIgnoreCase("opera")) {
			//System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			//Thread.sleep(10000);
			//driver=new OperaDriver();
			//Reporter.log("browsername is="+browserName+"",true);
		//}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//Reporter.log("browsername is="+browserName+"",true);
			Thread.sleep(10000);
			driver=new ChromeDriver();
			Reporter.log("browsername is="+browserName+"",true);
		}
	}
	@AfterTest
	public  void closeBrowser() {
		driver.close();
		
	}
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		//Notepadproperty n=new Notepadproperty();
	//	Thread.sleep(1000);
		//String u = n.propertyfile("url");
		driver.get("https://demo.actitime.com/");
	
		     driver.findElement(By.name("username")).sendKeys("admin");
		     driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}
}
			