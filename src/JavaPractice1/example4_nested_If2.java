package JavaPractice1;

public class example4_nested_If2 
{
  public static void main(String[] args) {
	
	  int amount=5000;
	  
	  if(amount>=50)
	  {
		  System.out.println("no dilivery charge");
		  
		  if(amount>=5000)
		  {
			  System.out.println("10% discount");
		  }
		  else
		  {
			  System.out.println("no discount");
		  }
	  }
	  else
	  {
		  System.out.println("delivery charges:50 rs ");
	  }
}
}
