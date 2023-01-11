package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Option 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   
		   WebElement src = driver.findElement(By.id("box6"));
		  WebElement dest = driver.findElement(By.id("box106"));
		  
		  Actions act=new Actions(driver);
		  act.dragAndDrop(src, dest).perform();
		  
		   
		   
}
}