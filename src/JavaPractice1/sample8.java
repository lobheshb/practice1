package JavaPractice1;

public class sample8 
{
    public static void StudentName(String name)
    {
    	System.out.println(name);
    }
    
    public static void StudentFullName(String FName,String LName)
    {
    	System.out.println(FName+" "+ LName);
    }
    
    public void StudentInfo(String Fname,int rollNum,char grade,float per,String dept)
    {
    	System.out.println(Fname+ " "+rollNum+" "+grade+" "+per+" "+dept);
    }
    
    public static void main(String[] args) 
    {
		 sample8.StudentName("lobhesh");
		 sample8.StudentName("suraj");
		 
		 System.out.println("-----------");
		 
		 sample8.StudentFullName("Lobhesh", "Bole");
		 sample8.StudentFullName("Suraj", "Date");
		 
		 System.out.println("-----------");
		 
		 sample8 s1=new sample8();
		 s1.StudentInfo("lobhesh", 101, 'a', 75f, "mechanical");
		 s1.StudentInfo("vikas", 102, 'a', 62.2f,"electrical");
		 
		 
		 
		 
		 
		 
	}
    
}
