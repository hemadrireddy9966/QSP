package POPUPS_22_07_2022;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeExpectSpecificbrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the title to be close");
String e=sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth");
driver.findElement(By.id("apple-signin-button")).click();
driver.findElement(By.id("login-facebook-button")).click();
driver.close();
Set<String> allwh = driver.getWindowHandles();
System.out.println(e);
for(String wh:allwh) {
driver.switchTo().window(wh);
String a= driver.getTitle();
System.out.println(a);
//System.out.println(etitle);
if((a.contains(e)))
{
			driver.close();
}
//driver.close();

}
		}
	}

