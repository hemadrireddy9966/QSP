package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LognPageOfActitime {
@FindBy(id="username")
private WebElement ustbx;
@FindBy(name="pwd")
private WebElement pwtbx;
@FindBy(id="loginButton")
private WebElement loginbtn;
public LognPageOfActitime(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void setlogin(String s) {
	this.ustbx.sendKeys(s);
}
public void setloginn(String s1) {
	
	this.pwtbx.sendKeys(s1);
	
	this.loginbtn.click();
}
}
