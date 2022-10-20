package facebookencapsulastion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class FaceEncap {
	private WebElement phno;
	private WebElement pws;
	private WebElement logbtn;
	public FaceEncap(WebDriver driver) {
		phno=driver.findElement(By.name("email"));
		pws=driver.findElement(By.id("pass"));
		logbtn=driver.findElement(By.name("login")); 
	}

	public void setValue(String p,String psw) {
		phno.sendKeys(p);
		pws.sendKeys(psw);
		logbtn.click();
		
	}
	
}
