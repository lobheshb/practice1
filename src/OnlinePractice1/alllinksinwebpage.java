package OnlinePractice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinksinwebpage 
{
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.amazon.com/");
		   
		  List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		   
//		   for(WebElement s1 :allLinks)
//		   {
//			   String text = s1.getText();
//			   System.out.println(text);
//		   }
//		   
		   System.out.println(allLinks.size());
		   
		   driver.quit();
		   
		   
		   
		   
		   
}
}