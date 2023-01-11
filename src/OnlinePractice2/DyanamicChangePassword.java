package OnlinePractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicChangePassword
{
	public static String main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		   	
		   driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		   
		   String text = driver.findElement(By.xpath("//p[contains(text(),'rahulshettyacademy')]")).getText();
		   
		   System.out.println(text);
		   
		   String[] array1 = text.split("'");
		   String password = array1[1].split("'")[0];
		   return password;
}
}