package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampe1_getRowSize 
{
	public static void main(String[] args) throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/DeskTop2/html/Practice%201/WebTable_1.html");
		
		//find the row size
		
//		int size = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
//		System.out.println(size);
//		
//		int size1 = driver.findElements(By.xpath("//table[@id='1234']//tr//*")).size();
//		System.out.println(size1);
//		
		
		 List<WebElement> text = driver.findElements(By.xpath("//table[@id='1234']//tr//td[2] |//table[@id='1234']//tr//th[2]"));

		 for(WebElement s1 :text)
		 {
			 System.out.println(s1.getText());
		 }
		
		
		
		driver.quit();
		
} 
}