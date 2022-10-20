package com.actitime.pom;

import java.io.IOException;

import org.hemadri.propertyfile.Notepadproperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodaccess {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		Notepadproperty n=new Notepadproperty();
		driver.get(n.propertyfile("url"));
		Loginpage l=new Loginpage(driver);
		l.setvalue("manager","admin");
		l.setvalue("admin","manager");
		
	}

}
