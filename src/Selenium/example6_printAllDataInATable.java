package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_printAllDataInATable 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/DeskTop2/html/Practice%201/WebTable_1.html");
		
		//find row size
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		for(int i=1;i<=rowSize;i++)
		{
			int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]//*")).size();
			
			for(int j=1;j<=colsize;j++)
			{
				String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//*["+j+"]")).getText();
				System.out.print(text+ " ");
			}
		  System.out.println();	
		}
		
		
		
		
		
}
}