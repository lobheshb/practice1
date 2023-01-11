package JavaPractice1;

public class sample17 
{
   int num1;
   int num2;
   
   sample17(int a,int b)
   {
	   num1=a;
	   num2=b;
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
	
	   sample17 s1=new sample17(10, 20);
	   s1.addition();
	   s1.multiplication();
	   
	   
	   sample18 s2=new sample18(50,5);
	   s2.substraction();
	   s2.divison();
	   
	   
	   
	   
}
}
