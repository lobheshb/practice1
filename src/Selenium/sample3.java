package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
	   

//    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//	   
//	  
//	   String value = sh.getRow(0).getCell(0).getStringCellValue();
//	   
//	  System.out.println(value);
//	  
//	  System.out.println(sh.getRow(2).getCell(0).getNumericCellValue());
//	  
//	  System.out.println(sh.getRow(3).getCell(0).getBooleanCellValue());
	  
//	  int size = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
//	  
//	  System.out.println(size);
	  
//	  int size = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
//	  System.out.println(size);
	   
	   //find the data in row
	   
	   
//	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
//	   
//	   int lastcellIndex = sh.getRow(0).getLastCellNum();
//	   
//	   for(int i=0;i<lastcellIndex;i++)
//	   {
//		   String value = sh.getRow(0).getCell(i).getStringCellValue();
//		   System.out.print(value+ " ");
//	   }
	   
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	   
	   int lastRowIndex = sh.getLastRowNum();
	   
	   for(int i=0;i<lastRowIndex;i++)
	   {
		   String value = sh.getRow(i).getCell(0).getStringCellValue();
		   
		   System.out.println(value);
	   }
	   
	   
	   
	   
	   
	   
}
}
