package OnlinePractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp1 
{
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		 //  driver.get("https://the-internet.herokuapp.com/basic_auth");
		   
		   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}