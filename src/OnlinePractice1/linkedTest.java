package OnlinePractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedTest 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.amazon.com/");
	   
	   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	
	   
	   driver.findElement(By.linkText("Today's Deals")).click();
	   
	   
	   
	   
	   
	   
	   
}
}
