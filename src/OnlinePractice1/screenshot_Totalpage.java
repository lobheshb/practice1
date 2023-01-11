package OnlinePractice1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_Totalpage 
{
	public static void main(String[] args) throws InterruptedException, IOException {
			
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://demo.nopcommerce.com/");
		   
//		   WebElement ele = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		   
//		   File src = ele.getScreenshotAs(OutputType.FILE);
//		   System.out.println(src);
//		   
//		   File dest=new File("D:\\Selenium\\Screenshot\\abc.jpg");
//		   
//		   FileHandler.copy(src, dest);
		   
		   
		  WebElement ele = driver.findElement(By.xpath("(//div[@class='product-item'])[1]"));
		   
		   File src = ele.getScreenshotAs(OutputType.FILE);
		   System.out.println(src);
		   
		   File dest=new File("D:\\Selenium\\Screenshot\\abc1.jpg");
		   FileHandler.copy(src, dest);
		   
		   
		   
}
}