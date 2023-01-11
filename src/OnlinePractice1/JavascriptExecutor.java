package OnlinePractice1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavascriptExecutor 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("http://demo.nopcommerce.com/");
		   
		   WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		   
		   JavaScriptUtil.DrawBorder(driver, logo);
		   
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   System.out.println(src);
		   
		   File dest=new File("D:\\Selenium\\Screenshot\\img.jpg");
		   
		   FileHandler.copy(src, dest);
		   
		   //to get the title
		    String title = JavaScriptUtil.getTitle(driver);
		    System.out.println(title);
		   
		   WebElement clickelement = driver.findElement(By.linkText("Register"));
		   JavaScriptUtil.getclickonelement(driver, clickelement);
		   
}
}