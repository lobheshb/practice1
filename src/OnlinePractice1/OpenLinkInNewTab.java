package OnlinePractice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("http://demo.nopcommerce.com/");
		   
//		   String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//		   driver.findElement(By.linkText("Register")).sendKeys(tab);
		   
		  //we have to open link in new tab
		   
		   String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		   driver.findElement(By.linkText("Register")).sendKeys(tab);
		   
}
}