package OnlinePractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement mouseOver = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mouseOver).perform();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		
		act.click(search).perform();
		act.keyDown(Keys.SHIFT).sendKeys("hello");
		act.keyUp(Keys.SHIFT);
		act.click(searchButton);
		act.perform();
		
		//driver.quit();
		
		
		
}
}