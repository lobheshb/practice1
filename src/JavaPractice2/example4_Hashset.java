package JavaPractice2;

import java.util.HashSet;
import java.util.Iterator;

public class example4_Hashset 
{
   public static void main(String[] args) {
	
	   HashSet hs=new HashSet();
	   
	    hs.add("sagar");
	    hs.add("rahul");
		hs.add(100);
		hs.add('A');
		hs.add(65.5f);
		hs.add("rahul"); 
		hs.add(null);       
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(100));
		
		hs.add(500);
		System.out.println(hs);
		
		hs.add(35.5f);
		System.out.println(hs);
		
		hs.remove(35.5f);
		System.out.println(hs);
		
		hs.remove(500);
		System.out.println(hs);
		System.out.println("use of iterator");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		
		Iterator itr1 = hs.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());		
		}

		for(int i=0;i<hs.size();i++)
		{
			System.out.println(hs);
		}
		System.out.println("---print all data for each loop---");

		for(Object s1:hs)
		{
			System.out.println(s1);
		}

		
		
		
		
		
		
		
		
}
}
