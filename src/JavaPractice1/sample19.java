package JavaPractice1;

public class sample19 
{
   String name;
   int num1;
   int num2;
   
   sample19()
   {
	   num1=30;
	   num2=40;
   }
   
   sample19(int a,int b)
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
   
   public void addition1()
   {
	   System.out.println(num1+num2);
   }
   
   sample19(String a)
   {
	   name=a;
   }
   
   public void Name()
   {
	   System.out.println(name);
   }
   
   public static void main(String[] args) {
	
	   sample19 s1=new sample19();
	   s1.addition();
	   s1.addition1();
	   
	   sample19 s2=new sample19("sagar");
	   s2.Name();
	   
	   
	   sample19 s3=new sample19(10,5);
	   s3.addition1();
	   s3.addition();
	   s3.multiplication();
}
   
}
