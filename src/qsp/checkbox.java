package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean cbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		Thread.sleep(5000);
		if(cbox=true) {
			System.out.println("checkbox is present and passed");
		}
		else {
			System.out.println("checkbox is not present and fail");
		}
		System.out.println(cbox);
		//driver.close();

	}

}
