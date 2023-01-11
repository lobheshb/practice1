package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedOptions 
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
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		int size = s.getAllSelectedOptions().size();
		
//		for(WebElement s1 :alloptions)
//		{
//			String text = s1.getText();
//			System.out.println(text);
//		}
          System.out.println(size);
		driver.quit();
		
		
		
		
}
}