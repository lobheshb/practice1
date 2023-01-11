package JavaPractice1;

public class sample13 
{
  //example of default constructor
	
   public void m1()
   {
	   System.out.println("running m1 method");
	   
   }
   
   public void m2()
   {
	   System.out.println("running m2 method");
   }
   
   
	public static void main(String[] args) {
		
		sample13 s1=new sample13();
		s1.m1();
		s1.m2();
		
		sample14 s2=new sample14();
		s2.m3();
	}
	   

}
