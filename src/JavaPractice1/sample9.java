package JavaPractice1;

public class sample9 
{
   int a=30;
   
   public void m1()
   {
	   int a=10;
	   int b=20;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(this.a);
   }
   
   public void m2()
   {
	   int c=40;
	   System.out.println(a);
	   System.out.println(c);
   }
   
   public static void main(String[] args) {
	sample9 s1=new sample9();
	s1.m1();
	s1.m2();
	
	System.out.println(s1.a);
	
	sample10 s2=new sample10();
	System.out.println(s2.d);
}
}
