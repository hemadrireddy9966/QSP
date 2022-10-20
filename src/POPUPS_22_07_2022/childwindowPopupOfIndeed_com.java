package POPUPS_22_07_2022;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowPopupOfIndeed_com {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			System.out.println(wh);
			String title = driver.switchTo().window(wh).getTitle();
System.out.println(title);
Thread.sleep(5000);
        driver.close();
		}
		driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=115882278440564&kid_directed_site=0&app_id=115882278440564&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fclient_id%3D115882278440564%26redirect_uri%3Dhttps%253A%252F%252Fsecure.indeed.com%252Faccount%252Ffbauth%26scope%3Demail%26locale%3Den_IN%26display%3Dpopup%26state%3DN1nFKcR28FL0utrOVOa1WhYQHwgcmZt5%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D549539c6-9b9d-4e8a-a18d-e580fb7de59b%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fsecure.indeed.com%2Faccount%2Ffbauth%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DN1nFKcR28FL0utrOVOa1WhYQHwgcmZt5%23_%3D_&display=popup&locale=en_GB&pl_dbl=0");
		driver.findElement(By.id("email")).sendKeys("dfghgr");
		
	}

}
