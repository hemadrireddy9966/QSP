package facebookencapsulastion;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
	public class actilogin {
		
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement loginbtn;
	public actilogin(WebDriver driver) {
		untbx= driver.findElement(By.id("username"));
		  pwtbx = driver.findElement(By.name("pwd"));
		
		loginbtn = driver.findElement(By.xpath("(//div)[13]"));
		 
	}
	
	public void setvalue(String u,String p) {
		untbx.sendKeys(u);
		pwtbx.sendKeys(p);
		loginbtn.click();
	}
	}
