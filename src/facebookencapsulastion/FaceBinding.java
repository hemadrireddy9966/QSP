package facebookencapsulastion;

import java.io.IOException;

import org.hemadri.propertyfile.Notepadproperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBinding {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		Notepadproperty n=new Notepadproperty ();
		driver.get(n.propertyfile("url1"));
		FaceEncap f=new FaceEncap(driver);
		f.setValue("7702341425","Naresh99@");
		driver.close();

	}

}
