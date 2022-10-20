package com.paralleAndCrossBrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.Baseclass2;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class ParelleAndCrossBrowser2 extends Baseclass2 {
	@Test
	public  void tests() throws InterruptedException, IOException {
	Thread.sleep(6000);
		driver.findElement(By.id("container_tasks")).click();
		String eTitle="actiTIME - Task List";
		String aTitle = driver.getTitle();
		AssertJUnit.assertEquals(aTitle, eTitle);
			Reporter.log("testcase is task",true);
}
}
