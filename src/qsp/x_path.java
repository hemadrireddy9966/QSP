package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class  x_path
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
 public static void main(String[] args)
 {
WebDriver driver=new ChromeDriver();
driver.get("file:///D/Demo2.html");
driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("a");
driver.findElement(By.xpath("/html/body/input")).sendKeys("c");
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("b");
 }
}