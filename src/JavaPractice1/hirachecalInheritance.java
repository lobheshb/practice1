package JavaPractice1;

public class hirachecalInheritance 
{
   public static void main(String[] args) {
	
	   System.out.println("---property of son1---");
	   son1 s1=new son1();
	   s1.car();
	   s1.money();
	   s1.home();
	   s1.mobile();
	   
	   
	   System.out.println("----property of son2-----");
	   son2 s2=new son2();
	   s2.car();
	   s2.money();
	   s2.home();
	   s2.bike();
	   
	   System.out.println("--property of son3---");
	   son3 s3=new son3();
	   s3.car();
	   s3.home();
	   s3.money();
	   s3.watch();
}
}
