package Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample11 
{
	@Test(priority=2)
   public void TC1()
   {
	   Reporter.log("runnng TC1 method",true);
   }
   
	@Test(priority=4)
	   public void TC2()
	   {
		   Reporter.log("runnng TC2 method",true);
	   }
   
   
	@Test (priority=1)
	   public void TC3()
	   {
		   Reporter.log("runnng TC3 method",true);
	   }
   
	@Test(priority=3,invocationCount=5)
	   public void TC4()
	   {
		   Reporter.log("runnng TC4 method",true);
	   }
   
}
