package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Super {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com//");
		
		String title=driver.getTitle();
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 if(title.equals("myntra") )
		 {
			 System.out.println("url is passed and navigating succefully");
		 }
		 else {
			 System.out.println("url failed and navigating failed");
		 }
		 if(url.contains("https://mail.google.com/mail/u/0/#starred"))
		 {
			 System.out.println("url is pasjjjlsed and navigating succefully");
		 }
		 else {
			 System.out.println("url failed and navigating failed");
		 }
		driver.close();
	}

}
