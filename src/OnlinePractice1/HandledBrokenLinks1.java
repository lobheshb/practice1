package OnlinePractice1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledBrokenLinks1 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		   
		   WebDriver driver =new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("http://www.deadlinkcity.com/");
		   
		   List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		   
		   int brokenlinks = 0; 
		   
		   for(WebElement s1 :allLinks)
		   {
			   String url = s1.getAttribute("href");
			   
			   if(url==null || url.isEmpty())
			   {
				   System.out.println("url is empty");
				   continue;
			   }
			   URL link=new URL(url);
			   			   
			   try {
					HttpURLConnection  httpconn=(HttpURLConnection ) link.openConnection();
					httpconn.connect();
					
					if(httpconn.getResponseCode()>=400)
					{
						System.out.println(httpconn.getResponseCode()+url+" is"+" Broken Link");
						brokenlinks++;
					}				
					else
					{
						System.out.println(httpconn.getResponseCode()+url+" is"+" Valid Link");
					}
									
				} catch (Exception e) {
					
					//e.printStackTrace();
				}
				  
				  
			   }   
		         
		   
		   System.out.println("number of broken links"+ brokenlinks);
		   
		   driver.quit();
		   
}
}