package POPUPS_22_07_2022;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukariFailuploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gclsrc=aw.ds&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd5W7SngXat0GKIg9epM16ufTMCrI7I7IQ2zxLDdJya46NrNp_zRV4MaAraxEALw_wcB");
		Thread.sleep(3000);
	driver.manage().window().maximize();
		WebElement fld = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		fld.click();
		Thread.sleep(2000);
		File f=new File("./data/File.png");
		fld.sendKeys();
		Thread.sleep(2000);
	//driver.close();
		}
	}