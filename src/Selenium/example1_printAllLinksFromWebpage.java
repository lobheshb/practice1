package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_printAllLinksFromWebpage 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
//		int size = driver.findElements(By.xpath("//a")).size();
//		
//		System.out.println(size);
		
//		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
//		
//		for(WebElement s1 :alllinks)
//		{
//			System.out.println(s1.getText());
//		}
		
	          WebElement footerLink = driver.findElement(By.xpath("//div[@class='_95ke _8opy']"));
		
		         int size = footerLink.findElements(By.tagName("a")).size();
		System.out.println(size);
		
		for(int i=0;i<=size;i++)
		{
		      String allLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
		      Thread.sleep(2000);
			footerLink.findElements(By.tagName("a")).get(i).sendKeys(allLinks);
			
			
		}
		
		
		
		
}
}
	 