package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xlsxData {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\hemad\\eclipse-workspace\\automation\\data\\testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pw = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		boolean t = driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
		driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
		System.out.println(t);
	}

}
