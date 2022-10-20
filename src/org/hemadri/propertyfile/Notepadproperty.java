package org.hemadri.propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Notepadproperty {
public String propertyfile (String key) throws IOException
{
	FileInputStream fils=new FileInputStream("./data/demodata.properties");
	Properties p=new Properties();
	p.load(fils);
	String data = p.getProperty(key);
	return data;
}
public String excelfile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./assignment/Book1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(sheetname).getRow(row).getCell(cell);
	String data = c.getStringCellValue();
	return data;
	
}
//public static void main(String[] args) throws IOException   {
	//Notepadproperty obj=new Notepadproperty();
  //String u = obj.propertyfile("pw");
 // System.out.println(u);
	//Notepadproperty obj=new Notepadproperty();
//	String p = obj.excelfile("sheet1", 1, 2);
	//System.out.println(p);
}
//}  
  // }

