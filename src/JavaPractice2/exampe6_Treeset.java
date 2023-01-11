package JavaPractice2;

import java.util.Iterator;
import java.util.TreeSet;

public class exampe6_Treeset 
{
  public static void main(String[] args) {
	
	  TreeSet tr=new TreeSet();
	  
	  tr.add(200);
	  tr.add(400);
	  tr.add(500);
	  tr.add(100);
	  tr.add(700);
	  tr.add(900);
	  tr.add(5);
	  
	  System.out.println(tr);
	  System.out.println(tr.size());
	  System.out.println(tr.isEmpty());
	  System.out.println(tr.contains(5));
	  
	  tr.add(120);
	  System.out.println(tr);
	  
	  tr.remove(120);
	  System.out.println(tr);
//	  
//	  System.out.println("use of iterator ");
//	  Iterator itr = tr.iterator();
//	  while(itr.hasNext())
//	  {
//		  System.out.print(itr.next()+ " ");
//	  }
//	  
//	  for(Object s1 :tr)
//	  {
//		  System.out.print(s1+ " ");
//	  }
//	  
	  
	  System.out.println(tr.first());
	  System.out.println(tr.last());
	  
	  System.out.println(tr.pollFirst());
	  System.out.println(tr.pollLast());
	  
	  
	  
	  
}
}
