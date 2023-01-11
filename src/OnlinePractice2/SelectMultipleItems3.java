package OnlinePractice2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleItems3
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String [] name= {"Cucumber","Cauliflower","Brocolli","Cucumber"};            //Brocolli - 1 Kg
		
		List<WebElement> productList = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<productList.size();i++)
		{
			String[] s1 = productList.get(i).getText().split("-");
			String s2 = s1[0].trim();
			List<String> productList1 = Arrays.asList(name);
			
			if(productList1.contains(s2))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
}
}