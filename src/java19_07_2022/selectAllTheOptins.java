package java19_07_2022;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAllTheOptins {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hemad/OneDrive/Desktop/first.html.html");
		WebElement Allop = driver.findElement(By.id("cp"));
		Select s=new Select(Allop);
		List<WebElement> Allse = s.getAllSelectedOptions();
   
		
		
		
		
for(WebElement i:Allse){
	String text=i.getText();
	System.out.println(text);
}
driver.close();
	}

}
