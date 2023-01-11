package JavaPractice2;

public class String1 
{
  public static void main(String[] args) 
  
  {
	String s1="abc";
	String s2="abc";
	String s3="ABC";
	
	//String using new Keyword
	
	String s4=new String("abc");
	String s5=new String("abc");
	String s6=new String("ABC");
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s2==s3);
	
	System.out.println(s1==s4);
	System.out.println(s3==s4);
	System.out.println(s4==s5);
	
	
	
}
}
