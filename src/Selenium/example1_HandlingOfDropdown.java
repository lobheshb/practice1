package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_HandlingOfDropdown 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	    	WebElement login = driver.findElement(By.linkText("Login"));
		
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(login).perform();
		
	    act.contextClick(more).perform();
	
          WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		
		act.click(cart).perform();
		
} 
}