package JavaPractice2;

import java.util.TreeSet;

public class exampe6_Treeset1

{
   public static void main(String[] args) {
	
	   TreeSet<Integer> tr=new TreeSet<Integer>();
	   
	   tr.add(200);
		  tr.add(400);
		  tr.add(500);
		  tr.add(100);
		  tr.add(700);
		  tr.add(900);
		  tr.add(5);
		  
		  for(Integer s1 :tr)
		  {
			  System.out.print(s1+ " ");
		  }
		  
		  
}
}
