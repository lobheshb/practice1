package JavaPractice2;

public class Generizations 
{
  public static void main(String[] args) {
	
	  System.out.println("feature of jio");
	  
	  jio j=new jio();
	  j.sms();
	  j.calling();
	  j.data();
	  j.newFeature();
	  
	  System.out.println("feature of VI");
	  VI v=new VI();
	  v.sms();
	  v.calling();
	  v.data();
	  v.newFeature();
	  
	  System.out.println("feature of airtel");
	  airtel a=new airtel();
	  a.sms();
	  a.calling();
	  a.data();
	  a.newFeature();
	  
	  
	  
	  
	  
}
}
