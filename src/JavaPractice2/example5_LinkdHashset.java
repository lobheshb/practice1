package JavaPractice2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkdHashset 
{
   public static void main(String[] args) {
	
	   LinkedHashSet lhs=new LinkedHashSet();
	   
	    lhs.add("sagar");
        lhs.add("rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(65.5f);
		lhs.add("rahul"); 
		lhs.add(null);       
		lhs.add(null);
		
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(100));
		
		lhs.add(200);
		System.out.println(lhs);
		
		lhs.remove(200);
		System.out.println(lhs);
		
	     System.out.println("use of iterator");
	     
	     Iterator itr = lhs.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.print(itr.next()+ " ");
	     }
		
		for(Object s1 :lhs)
		{
			System.out.print(s1+ " ");
		}
		
		
		
		
	   
}
}
