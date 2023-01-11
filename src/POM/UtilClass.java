package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass 
{
   public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
   {
	   FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
	   
	   Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	   
	   String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	   
	   return value;
	   
   }
   
   public static void getScreenCapture(WebDriver driver) throws IOException
   {
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   
	   System.out.println(src);
	   
	   File dest=new File("");
	   FileHandler.copy(src, dest);
   }
   
   public static void getPD(String key) throws IOException
   {
	   FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Practice1\\src\\configre.properties");
	   
	   Properties p=new Properties();
	   
	   p.load(file);
	   
	   String value = p.getProperty(key);
	   System.out.println(value);
   }
   
   public static WebDriver ExplicitWait(WebDriver driver ,WebElement element)
   {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
	   return driver;
   }
   
   
   
   
   
   
   
}
