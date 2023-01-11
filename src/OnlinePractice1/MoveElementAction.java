package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementAction
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://demo.opencart.com/");
		   
		   WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		   
		    WebElement mac1 = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(desktop).moveToElement(mac1).click().perform();
		   
}
}