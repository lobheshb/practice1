package JavaPractice1;

public class sample6 
{
   //method with parameter
	
	public static void addition(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void multiplication(int a,int b)
	{
		int mult=a*b;
		System.out.println(mult);
	}
	
	public static void main(String[] args) {
		
		addition(10,20);
		addition(20,30);
		
		sample6 s1=new sample6();
		s1.multiplication(5, 2);
		s1.multiplication(10,6);
		
		sample7 s2=new sample7();
		s2.division(10, 2);
		
		
		
		
		
		
		
	}
	
	
}
