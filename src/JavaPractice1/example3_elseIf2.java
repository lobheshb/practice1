package JavaPractice1;

public class example3_elseIf2
{
   public static void main(String[] args) {
	
	   int marks=6;
	   
	   if(marks>=65)
	   {
		   System.out.println("distinction");
	   }
	   
	   else if(marks>=60 & marks<=64)
	   {
		   System.out.println("first class");
	   }
	   
	   else if(marks>=55 & marks<=59)
	   {
		   System.out.println("econd class");
	   }
	   
	   else if(marks>=35 & marks<=54)
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("failed");
	   }
}
}
