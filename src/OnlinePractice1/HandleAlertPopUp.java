package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		 //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   
		   driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		   
		   driver.switchTo().alert().accept();
		   
		   driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		   driver.switchTo().alert().accept();
		   
		   driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		   
		   driver.switchTo().alert().sendKeys("hello world");
		   
		   driver.switchTo().alert().accept();
		   Thread.sleep(3000);
		  // driver.quit();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}