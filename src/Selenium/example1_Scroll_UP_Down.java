package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Scroll_UP_Down 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		
}
}