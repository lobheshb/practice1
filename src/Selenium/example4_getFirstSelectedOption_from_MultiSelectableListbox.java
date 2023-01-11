package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_getFirstSelectedOption_from_MultiSelectableListbox 
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
		
		s.selectByIndex(3);
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		String s1 = s.getFirstSelectedOption().getText();
		
		System.out.println(s1);
		
		driver.quit();
		
		
		
		
}
}