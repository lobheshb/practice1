package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method2
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		boolean dispalyed = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		System.out.println(dispalyed);
		
		if(dispalyed==true)
		{
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		boolean s1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(s1);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		boolean s2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println(s2);
	driver.quit();
}
}