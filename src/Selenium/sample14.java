package Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample14 
{
	 @Test(groups="fund")
	   public void TC5()
	   {
		   Reporter.log("runnng TC5 method",true);
	   }
	   
		@Test(groups="profile")
		   public void TC6()
		   {
			   Reporter.log("runnng TC6 method",true);
		   }
	   
	   
		@Test(groups="login")
		   public void TC7()
		   {
			   Reporter.log("runnng TC7 method",true);
		   }
	   
		@Test(groups="fund")
		   public void TC8()
		   {
			   Reporter.log("runnng TC8 method",true);
		   }
	   
}
