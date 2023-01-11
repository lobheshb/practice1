package JavaPractice1;

public class sample15 
{
    //use constructor with zero parameter
	
	int num1;
	int num2;
	
	sample15()
	{
		num1=20;
		num2=5;
	}
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
			
	public static void main(String[] args) {
		
		sample15 s1=new sample15();
		s1.addition();
		s1.multiplication();
		System.out.println(s1.num1);
		System.out.println("--------------");
		sample16 s2=new sample16();
		s2.substraction();
		s2.divison();
		System.out.println(s2.num3);
				
	}
	
	
	
	
	
	
	
	
}
