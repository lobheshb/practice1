package Selenium;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=3;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
}
}