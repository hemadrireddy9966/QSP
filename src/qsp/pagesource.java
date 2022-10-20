package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.facebook"))
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	String title = driver.getTitle();
	System.out.println(title);
	//String source = driver.getPageSource();
	//System.out.println(source);
	driver.close();
}
}
