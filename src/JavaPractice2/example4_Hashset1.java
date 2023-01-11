package JavaPractice2;
import java.util.ArrayList;
import java.util.HashSet;
public class example4_Hashset1 
{
  public static void main(String[] args) {
	
	  ArrayList al=new ArrayList();
	  
	    al.add("sagar");
        al.add("rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("rahul"); 
		al.add(null);       
		al.add(null);    
		System.out.println(al);
		HashSet hs=new HashSet(al);
	  System.out.println(hs);
}
}
