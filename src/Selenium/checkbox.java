package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/DeskTop2/html/Practice%201/checkbox.html");
		
		 int checkbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
//		for(int i=0;i<=checkbox.size()-1;i++)
//		{
//			checkbox.get(i).click();
//			Thread.sleep(1000);
//			
//		}
//		
//		Thread.sleep(1000);
//		
//		for(int i=checkbox.size()-1;i>=0;i--)
//		{
//			checkbox.get(i).click();
//			Thread.sleep(1000);
//			
//		}
		 System.out.println(checkbox);
		 
		driver.quit();
}
}