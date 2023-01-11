package JavaPractice2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class example1_ArrayList
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
		System.out.println(al.size());
        System.out.println(al.isEmpty());
    	System.out.println(al.contains(100));
    	
    	al.add(4,200);
    	System.out.println(al);
    	
    	al.remove(4);
    	System.out.println(al);
    	
    	al.set(4, 55.5f);
    	System.out.println(al);
    	
    	
    	Iterator itr = al.iterator();
    	while(itr.hasNext())
    	{
    		System.out.print(itr.next()+ " ");
    	}
    	
    	ListIterator itr1 = al.listIterator();
    	 
    	while(itr1.hasNext())
    	{
    		System.out.print(itr1.next()+ " ");
    	}
    	
    	for(int i=0;i<al.size();i++)
    	{
    		System.out.println(al.get(i));
    	}
    	
	}
}
