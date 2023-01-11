package JavaPractice1;

public class sample1 
{   static int a=20;
	public static void m1()
	{
		System.out.println(a);
		System.out.println("running m1 method from same class");
	} 
	
	public static void m2()
	{
		System.out.println("running m2 method fromm same class");
	}
	
	public static void m3()
	{
		System.out.println("running m3 method from same class");
	}
	
	public static void main(String[] args) {
		
		m1();
		m2();
		m3();
		
		sample2.m4();
		sample2.m5();
		sample2.m6();
		
		//System.out.println(a);
		
		
		
		
		
		
		
	}
	
}
