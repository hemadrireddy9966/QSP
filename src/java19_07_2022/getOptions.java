package java19_07_2022;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class getOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hemad/OneDrive/Desktop/first.html");
		WebElement Allop = driver.findElement(By.id("mtr"));
		Select s=new Select(Allop);
		List<WebElement> A1 = s.getOptions();
		//DesiredCapabilities.chrome();
		DesiredCapabilities cap =new DesiredCapabilities();
		DesiredCapabilities.chrome();
		cap.setBrowserName(null);
		
		System.out.println(A1.size());
		//Set<String> listnames=new HashSet<>();
		ArrayList<String> list=new ArrayList<>();
								for(int i=0;i<A1.size();i++) {
									String names = A1.get(i).getText();
									list.add(names);
								}
								Set<String> set=new HashSet<>();
								for( WebElement s1:A1) {
							 if(set.add(s1.getText())==false)
								 System.out.println(s1.getText());
							 System.out.println(set.size());
								}		
		//driver.close();
	}
}

