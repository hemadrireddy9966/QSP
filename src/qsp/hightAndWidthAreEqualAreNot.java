package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hightAndWidthAreEqualAreNot {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int w1 = driver.findElement(By.name("username")).getLocation().getX();
		int h1 = driver.findElement(By.name("username")).getLocation().getY();

		int w2 = driver.findElement(By.name("pwd")).getLocation().getX();
		int h2 = driver.findElement(By.name("pwd")).getLocation().getY();
		driver.close(); 
if(h1==h2) {
	System.out.println("height and width of usernameandpassword boxs ar equal and pass");
}
else {
	System.out.println("height and width of usernameandpassword boxs are not equal and fail");
}
System.out.println(h1);
System.out.println(h2);
System.out.println(w1);
System.out.println(w2);
	}

}
