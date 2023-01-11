package OnlinePractice2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class allmodulepractice
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
//		//find the number of radio button
//		List<WebElement> radio = driver.findElements(By.xpath("//div[@id='radio-btn-example']//label"));
//		
//		for(WebElement s1:radio) 
//		{
//			System.out.println(s1.getText());
//		}
//		
//		//select radio button
//		boolean radio1 = driver.findElement(By.xpath("//input[@value='radio1']")).isSelected();
//		System.out.println(radio1);
//		driver.findElement(By.xpath("//input[@value='radio1']")).click();
//		boolean radio2 = driver.findElement(By.xpath("//input[@value='radio1']")).isSelected();
//		System.out.println(radio2);
//		
//		//auto suggestion
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
//		
//		String ExpResult = "India";
//		List<WebElement> allCountry = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
//		
//		for(WebElement s1 :allCountry)
//		{
//			String actResult = s1.getText();
//			
//			if(actResult.equalsIgnoreCase(ExpResult))
//			{
//				s1.click();
//			}
//		}
//		
//	 WebElement option = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select s=new Select(option);
//		
//		s.selectByVisibleText("Option2");
//				
//		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(WebElement s2:checkbox)
//		{
//			s2.click();
//			Thread.sleep(2000);
//		}
//		 
//		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
////		
//		//handled the child windows
//		driver.findElement(By.xpath("//a[@id='opentab']")).click();
//		
//		Set<String> allwindow = driver.getWindowHandles();
//		Iterator<String> itr = allwindow.iterator();
//		String parent = itr.next();
//		String child = itr.next();
//		driver.switchTo().window(child);
//		driver.findElement(By.linkText("Practice")).click();
		
//	    driver.findElement(By.xpath("//input[@id='name']")).click();
		
//		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
//		WebElement mouseOver = driver.findElement(By.xpath("//button[@id='mousehover']"));
//	    
//	    Actions act=new Actions(driver);
//	    
//	    act.moveToElement(mouseOver).perform();
//	    
//	    WebElement reload = driver.findElement(By.linkText("Reload"));
//	    
//	    act.click(reload).perform();
//	    
//		int size = driver.findElements(By.xpath("//a")).size();
//		
//		System.out.println(size);
		
//		WebElement footerLink = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
//		int size = footerLink.findElements(By.tagName("a")).size();
//		System.out.println(size);
//		
		WebElement colume = driver.findElement(By.xpath("(//div[@id='gf-BIG']//ul)[1]"));
		
		int size1 = colume.findElements(By.tagName("a")).size();
		System.out.println(size1);
		
		for(int i=1;i<size1;i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(2000);
			colume.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
					
		}
		
		//get Title of the every link
		
		Set<String> alllinks = driver.getWindowHandles();
		
		Iterator<String> itr = alllinks.iterator();
		
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
		     System.out.println(driver.getTitle());
		}
		
		
		driver.quit();
}
}