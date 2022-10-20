package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fastrack {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+13+pro+max&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_13_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_13_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=iphone+13+pro+max%7CMobiles&requestId=d1d90439-5073-4247-b1d2-18aa7fe7cc71&as-searchtext=iphone%2013%20pro");
		Thread.sleep(2000);
		driver.close();

	}

}
