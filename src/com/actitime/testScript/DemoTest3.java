package com.actitime.testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.BaseClass;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class DemoTest3 extends BaseClass {
	@Test
		public static void tests() throws InterruptedException, IOException {
		Thread.sleep(6000);
			driver.findElement(By.id("container_users")).click();
			String eTitle="actiTIME - User ";
			Thread.sleep(6000);
			String aTitle = driver.getTitle();
	AssertJUnit.assertEquals(aTitle, eTitle);
	Reporter.log("testcase is user",true);
}
}
