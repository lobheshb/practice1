package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFrom_MultiSelectableListbox1 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/DeskTop2/html/Practice%201/Multiple_ListBox1.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(country);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.deselectByIndex(3);
		Thread.sleep(3000);
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByIndex(0);
		
		Thread.sleep(3000);
		
		boolean s1 = s.isMultiple();
		
		if(s1==true)
		{
			System.out.println("element is multiselectable");
		}
	
		else
		{
			System.out.println("element is single selectable");
		}
		
		
		
		
		
}
}