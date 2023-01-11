package OnlinePractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 
{
	public static void main(String[] args) throws InterruptedException {
			
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		   driver.findElement(By.id("divpaxinfo")).click();
		   
		   for(int i=1;i<4;i++)
		   {
			   driver.findElement(By.id("hrefIncAdt")).click();
		   }
		   
		   for(int i=1;i<4;i++)
		   {
			   driver.findElement(By.id("hrefIncChd")).click();
		   }
		   		   
		   System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		   
		   driver.findElement(By.id("btnclosepaxoption")).click();
		   
}
}