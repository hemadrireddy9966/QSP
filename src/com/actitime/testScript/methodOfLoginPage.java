package com.actitime.testScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pom.LognPageOfActitime;

public class methodOfLoginPage  {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	LognPageOfActitime l=new LognPageOfActitime(driver);
		FileInputStream fis=new FileInputStream("./assignment/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	 Sheet s = wb.getSheet("Sheet1");
	 int y=0;
	 int ii = s.getLastRowNum();
	 Row c = s.getRow(ii);
	 int jj = c.getLastCellNum();
	System.out.println(ii);
	System.out.println(jj);
	for (int i=0;i<ii;i++) {
		for (int j=0;j<jj;j++) {
			 if(y==j) {
				 Thread.sleep(5000);
		 String o = s.getRow(i).getCell(j).getStringCellValue(); 
		
		 l.setlogin(o);
		 }
			 else {
		 String oo = s.getRow(i).getCell(j).getStringCellValue();
		 l.setloginn(oo);
			 }
		 //System.out.print(o+" ");
		}
		
		
		//System.out.println();
	}
		
	}

}
