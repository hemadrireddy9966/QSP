package facebookencapsulastion;

import java.io.IOException;

import org.hemadri.propertyfile.Notepadproperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class actimethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		Notepadproperty n=new Notepadproperty();
		driver.get(n.propertyfile("url"));
		actilogin l=new actilogin(driver);
		l.setvalue("manager","admin");
		l.setvalue("admin","manager");
		driver.close();
	}

}
