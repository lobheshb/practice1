package OnlinePractice1;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://google.com/");
		   
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		   
		   WebElement element1 = driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
		   
		   Explicitwait(driver,element1).click();
		   driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		   	   
}
	public static WebElement Explicitwait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element;
	}
}