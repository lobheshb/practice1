package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		   
		   driver.switchTo().frame("packageListFrame");
		   
		   driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]")).click();
		   
		   driver.switchTo().parentFrame();
		   
		   driver.switchTo().frame("packageFrame");
		   	   
		   driver.findElement(By.xpath("(//span[@class='interfaceName'])[1]")).click();
		   
		   
		   
}
}