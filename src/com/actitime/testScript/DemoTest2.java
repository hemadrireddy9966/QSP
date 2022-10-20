package com.actitime.testScript;

import org.testng.annotations.Test;
import com.actitime.genaric.BaseClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Reporter;
//@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
 public class DemoTest2 extends BaseClass  {
	@Test(groups = "unit")
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

