package JavaPractice2;

public class sample10 
{
   public void addition(int a,int b)
   {
	   System.out.println(a+b);
   }
   
   public void addition(int a,int b,int c)
   {
	   System.out.println(a+b+c);
   }
   
   public static void main(String[] args) {
	
	   sample10 s1=new sample10();
	   s1.addition(20, 10);
	   s1.addition(20, 20, 20);
}
   
   
   
   
}
