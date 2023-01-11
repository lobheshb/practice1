package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick_RightClick 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
			
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		   
		   driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		   
		  WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		  
		  Actions act=new Actions(driver);
		  
		  act.contextClick(rightclick).perform();
		  
		  WebElement quiteclick = driver.findElement(By.xpath("//span[text()='Quit']"));
		  
		  act.click(quiteclick).perform();
		  
		   Thread.sleep(3000);
		   driver.switchTo().alert().accept();
		   
}
}