package ders16;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet();

	//   //Add objects to the HashSet.
	   treeSet.add("Roxy");
	   treeSet.add("Sunil");
	   treeSet.add("Sandy");
	   treeSet.add("Munish");
	   treeSet.add("Pardeep");

	   //Print the TreeSet object.
	   System.out.println("TreeSet elements:");
	   System.out.println(treeSet);

	   //Print the TreeSet elements using iterator.
	   Iterator iterator=treeSet.iterator();
	   System.out.println("TreeSet elements using iterator:");
	   while(iterator.hasNext()){
	       System.out.println(iterator.next());
	   }
	   
	   
	   Set<Integer> treeSet1 = new TreeSet();
	   treeSet1.add(10);
	   treeSet1.add(13);
	   treeSet1.add(12);
	   treeSet1.add(11);
	   treeSet1.add(1);
	   
	   System.out.println(treeSet1);
	}
	
	 

}
