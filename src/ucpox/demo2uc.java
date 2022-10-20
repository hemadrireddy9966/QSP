package ucpox;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2uc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
		
		// Default size
		org.openqa.selenium.Dimension currentDimension = driver.manage().window().getSize();
		int height = currentDimension.getHeight();
		int width = currentDimension.getWidth();
		System.out.println("Current height: "+ height);
		System.out.println("Current width: "+width);
		
		// Set new size
		org.openqa.selenium.Dimension newDimension = new org.openqa.selenium.Dimension(800, 600);
		driver.manage().window().setSize(newDimension);
		
		// Getting 
		org.openqa.selenium.Dimension newSetDimension = driver.manage().window().getSize();
		int newHeight = newSetDimension.getHeight();
		int newWidth = newSetDimension.getWidth();
		System.out.println("Current height: "+ newHeight);
		System.out.println("Current width: "+newWidth);
	}

	}
