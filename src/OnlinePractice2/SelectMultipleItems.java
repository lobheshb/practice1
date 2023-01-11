package OnlinePractice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleItems 
{
	public static void main(String[] args) throws InterruptedException {

		//	String[] name={"Cucumber","Cauliflower","Brocolli"};
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			List<WebElement> productDetails = driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			String expResult = "Cucumber - 1 Kg";
			
			for(int i=0;i<=productDetails.size();i++)
			{
				String actResult = productDetails.get(i).getText();
				
				if(actResult.equalsIgnoreCase(expResult))
				{
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					break;
				}
			}
}
}