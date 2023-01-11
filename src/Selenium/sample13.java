package Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample13 
{
	@Test(groups="login")
	   public void TC1()
	   {
		   Reporter.log("runnng TC1 method",true);
	   }
	   
		@Test(groups="login")
		   public void TC2()
		   {
			   Reporter.log("runnng TC2 method",true);
		   }
	   
	   
		@Test (groups="fund")
		   public void TC3()
		   {
			   Reporter.log("runnng TC3 method",true);
		   }
	   
		@Test(groups="profile")
		   public void TC4()
		   {
			   Reporter.log("runnng TC4 method",true);
		   }
	   
}
