package OnlinePractice1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMovement 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
				
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		   
		   WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']//span"));
		   System.out.println(slider.getLocation());
		   
		   Actions act=new Actions(driver);
		   act.dragAndDropBy(slider, 120, 0).perform();
		   
		   
		   
}
}