package OnlinePractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopUp1 
{
 public static void main(String[] args) {
	
	 ChromeOptions option=new ChromeOptions();
	 option.addArguments("--disabled-notifications");
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.redbus.in/");
}
}
