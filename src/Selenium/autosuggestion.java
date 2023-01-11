package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("redmi");
		String expResult = "redmi note 10";
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		for(WebElement s1 :list)
		{
			String actResult = s1.getText();
			
			if(actResult.equals(expResult))
			{
				s1.click();
				break;
			}
		}
		
		
		
		
		
}
}