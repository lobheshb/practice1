package OnlinePractice1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies 
{
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome Driver\\New folder\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    	driver.get("http://demo.nopcommerce.com/");
    	
    	//find the cookies size
    	Set<Cookie> cookie = driver.manage().getCookies();
    	
    	System.out.println(cookie.size());
    	
    	//print all cookies
    	
    	for(Cookie s1 :cookie)
    	{
    		System.out.println(s1.getName()+" : "+s1.getValue());
    	}
    	
    	//add the new cookies
    	Cookie s2=new Cookie("newCookies","123456");
    	
    	driver.manage().addCookie(s2);
    	int s3 = driver.manage().getCookies().size();
    	System.out.println("size of cookies after add new cookies"+ s3) ;
    	
    	//how delete specific cookies 
    	driver.manage().deleteCookie(s2);
    	
    	System.out.println(driver.manage().getCookies().size());
    	
    	
    	
    	driver.manage().deleteAllCookies();
    	System.out.println(driver.manage().getCookies().size());
    	
    	
    	driver.quit();
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
