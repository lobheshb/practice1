package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//	driver.get("https://www.google.com/");
//	
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
////	System.out.println(driver.getPageSource());               //https://www.facebook.com/
	
	driver.navigate().to("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	driver.quit();
	
	
	
	
}
  
}
