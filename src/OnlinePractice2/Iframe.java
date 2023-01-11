package OnlinePractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//WebElement frame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	  driver.switchTo().frame("frame-top");
	  driver.switchTo().frame("frame-middle");
	  
	  String text = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	  System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
}
}