package com.actitime.testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.BaseClass;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Reporter;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class DemoTestng extends BaseClass  {
	@Test(groups = "smoke")
		public  void tests() throws InterruptedException, IOException {
		Thread.sleep(6000);
			String eTitle="actiTIME - Enter Time-Track";
			String aTitle = driver.getTitle();
			AssertJUnit.assertEquals(aTitle, eTitle);
				Reporter.log("testcase is timertrack",true);
	}
}
