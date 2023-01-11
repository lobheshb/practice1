package JavaPractice2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_Vector 
{
  public static void main(String[] args) {
	
	  Vector v=new Vector();
	    v.add("sagar");
  	    v.add("rahul");
		v.add(100);
		v.add('A');
		v.add(65.5f);
		v.add("rahul"); 
		v.add(null);       
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(100));
		
		v.add(1,250);
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.set(4,55f);
		System.out.println(v);
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator itr1 = v.listIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		for(Object s1 :v)
		{
			System.out.println(v);
		}
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+ " ");
		}
		
}
}
