package OnlinePractice1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil 
{
  public static void DrawBorder(WebDriver driver,WebElement element)
  {
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].style.border='3px solid red'", element);
  }
  
  public static String getTitle(WebDriver driver)
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	 String title = js.executeScript("return document.title;").toString();
	 return title;
	  
  }
  
  //click element
  public static void getclickonelement(WebDriver driver,WebElement element)
  {
	  JavascriptExecutor js = ((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].click();",element);
  }
  
  
  
}
