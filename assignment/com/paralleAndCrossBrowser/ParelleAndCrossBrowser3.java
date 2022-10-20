package com.paralleAndCrossBrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.Baseclass2;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class ParelleAndCrossBrowser3 extends Baseclass2{
	@Test
	public  void tests() throws InterruptedException, IOException {
	Thread.sleep(6000);
		driver.findElement(By.id("container_reports")).click();
		String eTitle="actiTIME - Reports Dashboard";
		Thread.sleep(6000);
		String aTitle = driver.getTitle();
		AssertJUnit.assertEquals(aTitle, eTitle);
			Reporter.log("testcase is report",true);
}

}
