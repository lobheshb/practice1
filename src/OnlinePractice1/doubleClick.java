package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		   
		   driver.switchTo().frame("iframeResult");
		   
		   driver.findElement(By.id("field1")).clear();
		   driver.findElement(By.id("field1")).sendKeys("welcome to selenium");
		   
		   WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		   
		   Actions act=new Actions(driver);
		   
		   act.doubleClick(doubleClick).perform();
		   
}
}