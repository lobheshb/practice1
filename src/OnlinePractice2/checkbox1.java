package OnlinePractice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   
//		   boolean size = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
//		   System.out.println(size);
//		   
//		   driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
//		   
//		   boolean size1 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
//		   
//		   System.out.println(size1);
		   
		    int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		    
		    for(int i=1;i<size;i++)
		    {
		    	driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
		    	Thread.sleep(2000);
		    }
		    
		    
		   
//		   for(WebElement s1 :checkbox)
//		   {
//			   s1.click();
//			   Thread.sleep(2000);
//		   }
		   
		   
		   
		   
		   
		  // driver.quit();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}