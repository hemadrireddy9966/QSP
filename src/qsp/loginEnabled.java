package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginEnabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://ucpro-ucpoxdash.netlify.app/login");
	boolean login = driver.findElement(By.id("hema")).isEnabled();
	if(login==true) {
		System.out.println("login button working and passed");
	}
	else {
		System.out.println("login button is not working and fail");
	}
	System.out.println(login);
	driver.close();
	
	}

}
