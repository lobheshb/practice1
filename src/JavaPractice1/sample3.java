package JavaPractice1;

public class sample3 
{
   public void m1()
   {
	   System.out.println("running m1  non static method in same class ");
   }
   
   public void m2()
   {
	   System.out.println("running m2 non static method in same class");
   }
   
   public void m3()
   {
	   System.out.println("running m3 non static method in same class");
   }
   
   public static void main(String[] args) {
	
	   sample3 s1=new sample3();
	   s1.m1();
	   s1.m2();
	   s1.m3();
	   
	   sample4 s2=new sample4();
	   s2.m4();
	   s2.m5();
	   s2.m6();
	   
	   
	   
}
   
   
   
}
