package java19_07_2022;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aiphabaticalOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hemad/OneDrive/Desktop/first.html");
		WebElement Allop = driver.findElement(By.id("mtr"));
		Select s=new Select(Allop);
		List<WebElement> A1 = s.getOptions();
		String lo = Allop.getText();
		System.out.println(lo);
		TreeSet<String> t1=new TreeSet<>();
		for(int i=0;i<A1.size();i++) {
			String names = A1.get(i).getText();
			t1.add(names);
		}
		
		System.out.println(t1);
		driver.close();
	}

}
