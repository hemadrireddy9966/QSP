package com.actitime.genaric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass4 {
	@FindBy(id="username")
private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
		@FindBy(id="loginButton")
	private WebElement loginbtn;
		@FindBy(linkText = "Logout")
		private WebElement logoutbtn;
	public	Baseclass4(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	@BeforeMethod 
		public void setlogin(String un,String pw) {
			untbx.sendKeys(un);
			pwtbx.sendKeys(pw);
			loginbtn.click();
		}
	@AfterMethod
public void setlogout() {
	logoutbtn.click();
		}

}
