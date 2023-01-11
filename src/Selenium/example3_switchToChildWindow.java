package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchToChildWindow 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allIDS = driver.getWindowHandles();
		
		Iterator<String> itr = allIDS.iterator();
		
		String parant = itr.next();
		
		String child = itr.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parant);
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		
		
		
		
		
		
}
}