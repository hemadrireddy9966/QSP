package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gettingAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(20000);
			driver.get("htps://ww.amon.in/");
		List<WebElement> Alllinks =driver.findElements(By.xpath("//a"));
			//int count = Alllinks.size();
			//System.out.println(count);
			for(WebElement i:Alllinks) {
				String o = i.getText();
				System.out.println(o);
				//String links = get(i).getText();
				
			}
			driver.close();
}
}
