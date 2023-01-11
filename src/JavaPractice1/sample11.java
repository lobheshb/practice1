package JavaPractice1;

public class sample11 
{
   static int a=30;
   
   public void m1()
   {
	   System.out.println(a);
   }
   
   public void m2()
   {
	   System.out.println(a);
   }
   
   public static void main(String[] args) {
	
	   sample11 s1=new sample11();
	   s1.m1();
	   s1.m2();
	   
	   sample12 s2=new sample12();
	   s2.m3();
	   
	   System.out.println(a);
	   
	   System.out.println(sample12.b);
}
}
