package JavaPractice1;

public class son extends father
{
  public void laptop()
  {
	  System.out.println("laptop:HP");
  }
  
  public void car()            //override / update
	{
		System.out.println("car: Kia seltos");
	}
	
	public void money()         //override
	{
		System.out.println("money: 1L");
	}
   
  public static void main(String[] args)
  {
	//program on up casting
	  
	  father f=new son();
	  f.car();
	  f.home();
	  f.money();
	  
	  
}
  
  
  
}
