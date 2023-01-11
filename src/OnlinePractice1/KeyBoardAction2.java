package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("http://text-compare.com/");
		   
		   WebElement input = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		   WebElement output = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		   input.sendKeys("welcome to lobhesh");
		   
		 Actions act=new Actions(driver);
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("a");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("c");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 
		 act.sendKeys(Keys.TAB);
		 act.perform();
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("v");
		 act.keyUp(Keys.CONTROL);
		 act.perform();
		 
		 if(input.getAttribute("value").equalsIgnoreCase(output.getAttribute("value")))
		 {
			 System.out.println("text copied");
		 }
		 else
		 {
			 System.out.println("text not copied");
		 }
		 
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		   
		   
		   
		   
		   
		   
		   
		   
}
}