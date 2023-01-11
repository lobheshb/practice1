package JavaPractice2;

public class sample1 
{
    //program on private access specifier
	
	private int a;
	
	private sample1()
	{
		a=200;
	}
	
	private void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		sample1 s1=new sample1();
		s1.m1();
	}
	
	
}
