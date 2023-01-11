package JavaPractice1;

public class example4_nested_If1 
{
   public static void main(String[] args) {
	
	   int age=18;
	   int weight=50;
	   
	   if(age>=18)
	   {
		   System.out.println("age>=18");
		   if(weight>=50)
		   {
			   System.out.println("eligible for blood Doantion: weight>=50 ");
		   }
		   else
		   {
			   System.out.println("not eligible for blood donation: weight<=50");
		   }
	   }
	   
	   else
	   {
		   System.out.println("age<=18");
	   }
}
}
