package com.paralleAndCrossBrowser;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genaric.Baseclass2;
@Listeners(com.actitime.genaric.ListenaresImplimentastion.class)
public class ParelleAndCrossBrowser1 extends Baseclass2 {
	@Test
	public  void tests() throws InterruptedException, IOException {
	Thread.sleep(6000);
		String eTitle="actiTIME - Enter Time-Track";
		String aTitle = driver.getTitle();
		AssertJUnit.assertEquals(aTitle, eTitle);
			Reporter.log("testcase is timertrack",true);
}
}
