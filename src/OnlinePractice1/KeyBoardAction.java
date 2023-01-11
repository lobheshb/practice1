package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://the-internet.herokuapp.com/key_presses");
		   
		   Actions act=new Actions(driver);
		   
		   act.sendKeys(Keys.ENTER).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.BACK_SPACE).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.CONTROL).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.DELETE).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.END);
		   act.sendKeys(Keys.ALT).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_UP).perform();
		   Thread.sleep(2000);
		   act.sendKeys(Keys.ARROW_LEFT).perform();
		   Thread.sleep(2000);
		   
		   driver.quit();
		   
		   
		   
		   
		   
}
}