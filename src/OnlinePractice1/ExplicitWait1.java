package OnlinePractice1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 
{
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		//   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   
		   
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		   
		   WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='gNO89b'])[1]")));
		  
		   element1.click();
		   
		   driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}