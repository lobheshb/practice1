package OnlinePractice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		   
		   driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		   driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		   driver.findElement(By.xpath("(//a[text()=' Goa (GOI)'])[2]")).click();
		   
		   driver.findElement(By.xpath("(//a[@class='ui-state-default'])[23]")).click();
		   
		   WebElement currency = driver.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
		   
		   Select s=new Select(currency);
		   
		   s.selectByVisibleText("AED");
		   
		   
}
}