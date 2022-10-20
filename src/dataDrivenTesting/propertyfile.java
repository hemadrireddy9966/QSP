package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyfile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fil=new FileInputStream("C:\\Users\\hemad\\eclipse-workspace\\automation\\data\\demodata.properties");
		Properties p=new Properties();
		p.load(fil);
	String url = p.getProperty("url");
	String un = p.getProperty("un");
	String pw = p.getProperty("pw");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
	
	


		
	}

}
