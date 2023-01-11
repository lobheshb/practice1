package OnlinePractice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://jqueryui.com/tooltip/");
		   
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		   
		   String tooltipText = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		   
		   System.out.println(tooltipText);
		   
		   
		   
		   
		   
}
}