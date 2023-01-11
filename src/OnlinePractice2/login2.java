package OnlinePractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2
{
public static void main(String[] args) throws InterruptedException {
		
		String name="rahul";
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		   driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   
		   String password = getPassword(driver);
		   driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		   
		   driver.findElement(By.id("inputUsername")).sendKeys(name);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@Type='password']")).sendKeys(password);
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   
		   
}

  public static String getPassword(WebDriver driver) throws InterruptedException
{
	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  
	  driver.findElement(By.linkText("Forgot your password?")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	   Thread.sleep(3000);
	   String text = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();        //Please use temporary password 'rahulshettyacademy' to Login.
	   
	   String[] passwordArray = text.split("'");
	   
	   String password = passwordArray[1].split("'")[0];
	   
	   return password; 

}



}