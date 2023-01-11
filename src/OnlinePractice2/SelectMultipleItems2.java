package OnlinePractice2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleItems2
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	     String[] name= {"Brocolli - 1 Kg","Cauliflower - 1 Kg","Cucumber - 1 Kg","Beetroot - 1 Kg"};
		
		List<WebElement> productDetails = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<productDetails.size();i++)
		{
			String s1 = productDetails.get(i).getText();
			
			  List<String> productlist = Arrays.asList(name);
			
			if(productlist.contains(s1))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
		
		
		
		driver.quit();
		
		
}
}