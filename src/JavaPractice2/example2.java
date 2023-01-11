package JavaPractice2;

public class example2 
{
  public static void main(String[] args) {
	
	  String [] ar=new String[4];
	   
	   try
	   {
		   ar[4]="abc";
	   }
	  	   
	   catch(ArithmeticException rohan) 
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch(StringIndexOutOfBoundsException rohan) 
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException sunil) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}	
		catch(Exception punam)
		{
			System.out.println("generic Exception handled");
			punam.printStackTrace();

	   
	   
}
   
   
   
  }}
