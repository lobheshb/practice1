package OnlinePractice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLIn2windows 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://demo.nopcommerce.com/");
		   
		   driver.switchTo().newWindow(WindowType.WINDOW);
		   
		   driver.get("https://www.opencart.com/");
}
}