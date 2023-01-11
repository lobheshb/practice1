package JavaPractice2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_Linkedlist 
{ 
  public static void main(String[] args) {
	
	  LinkedList ll=new LinkedList();
	  
	  ll.add("sagar");
	    ll.add("rahul");
		ll.add(100);
		ll.add('A');
		ll.add(65.5f);
		ll.add("rahul"); 
		ll.add(null);       
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(100));
		
		ll.add(1,300);
		System.out.println(ll);
		
		ll.remove(1);
		System.out.println(ll);
		
		ll.set(5, 55.5f);
		System.out.println(ll);
	  
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		ListIterator itr1 = ll.listIterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+ " ");
		}
	  
	  for(int i=0;i<ll.size();i++)
	  {
		  System.out.print(ll.get(i)+ " ");
	  }
	  
	  
	  
	  
	  
	  
	  
}
}
