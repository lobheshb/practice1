package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	 @FindBy(xpath=" ") private WebElement PIN;
	 @FindBy(xpath=" ") private WebElement PINBtn;
	 
	 public KiteLogin2Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void KiteLogin2PagePin(String pin)
	 {
		 PIN.sendKeys(pin);
	 }
	 
	 public void KiteLogin2PagePinBtn()
	 {
		 PINBtn.click();
	 }
	 
	 
	 
}
