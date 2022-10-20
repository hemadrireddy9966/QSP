package dataDrivenTesting;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.hemadri.propertyfile.Notepadproperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoProAndExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		Notepadproperty obj=new Notepadproperty();
		String u = obj.excelfile("Sheet1", 1, 0);
		String us = obj.excelfile("Sheet1", 1, 1);
		String p = obj.excelfile("Sheet1", 1, 2);
		String url = obj.propertyfile("url");
		String un = obj.propertyfile("un");
		String pw = obj.propertyfile("pw");
		//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int c=1;
		for(int i=0;i<=c;i++) {
		if(i==0) {
			WebDriver driver=new ChromeDriver();

		driver.get(u);
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(p);
		Thread.sleep(2000);
		driver.quit();
	}
				else {
					WebDriver driver=new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			Thread.sleep(2000);
			driver.close();
		}
	//c++;
		}
}
}
