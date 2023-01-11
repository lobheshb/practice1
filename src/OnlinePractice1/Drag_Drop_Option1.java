package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Option1 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
				
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		   
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		   
		   WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		   
		   WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		   
		   WebElement img3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
		   
		   WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		   
		   Actions act=new Actions(driver);
		   
		   act.dragAndDrop(img1, dest).perform();
		   act.dragAndDrop(img2, dest).perform();
		   act.dragAndDrop(img3, dest).perform();
		   
		   
		   
}
}