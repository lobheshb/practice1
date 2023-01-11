package OnlinePractice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion 
{
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.google.com/");
		   
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		   
		   String expResult = "Selenium Webdriver";
		   
		   List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		   
		   for(WebElement s1 :allOptions)
		   {
			   String actResult = s1.getText();
			   if(expResult.equalsIgnoreCase(actResult))
			   {
				   s1.click();
				   break;
			   }
		   }
		   
		   
		   
		   
		   
		   
}
}