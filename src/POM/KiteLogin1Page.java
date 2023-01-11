package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
  @FindBy(xpath=" ") private WebElement UN;
  
  @FindBy(xpath=" ") private WebElement PWD;
  
  @FindBy(xpath=" ") private WebElement LoginBtn;
  
  
  public KiteLogin1Page(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void KiteLogin1PageUsername(String username)
  {
	  UN.sendKeys(username);
  }
  
  public void KiteLogin1Pagepassword(String password)
  {
	  PWD.sendKeys(password);
  }
  
  public void KiteLogin1PageloginBtn()
  {
	  LoginBtn.click();
  }
  
  
  
  
  
  
  
  
  
  
}
