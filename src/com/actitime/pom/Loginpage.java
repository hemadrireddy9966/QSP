package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
private WebElement untbx;
private WebElement pwtbx;
//private WebElement loginbtn;
public Loginpage(WebDriver driver) {
	untbx= driver.findElement(By.id("username"));
	  pwtbx = driver.findElement(By.name("pwd"));
	
	// loginbtn = driver.findElement(By.xpath("(//div)[13]"));
	 
}
public void setvalue(String u,String p) {
	untbx.sendKeys(u);
	pwtbx.sendKeys(p);
	//loginbtn.click();
}
}

