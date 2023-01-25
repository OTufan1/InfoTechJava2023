package ders15;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListler {

	public static void main(String[] args) {
		
//		List<String> llist1 = new LinkedList<>();
//		
//		Deque<String> llist2 = new LinkedList<>();
		
		// add()
		LinkedList<String> llist = new LinkedList<>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		llist.add("D");
		llist.add("E");
		
		System.out.println(llist);
		
		// add(3,"W")
		
		llist.add(3,"W");
		
		System.out.println(llist);
		
		//addAll(coll)
		
		List<String> arrayList = new ArrayList<>(); 
		arrayList.add("Y");
		arrayList.add("Z");
		
		llist.addAll(arrayList);
		System.out.println(llist);
		
		// addAll(2,coll)
		
		llist.addAll(2,arrayList);
		System.out.println(llist);
		
		//addFirst()
		
		llist.addFirst("R");
		System.out.println(llist);
		
		//addLast()
		
		llist.addLast("P");
		System.out.println(llist);
		
		//remove()
		
		llist.remove();
		System.out.println(llist);
		
		//removeFirst();
		
		llist.removeFirst();
		System.out.println(llist);
		
		//remove(index) sildikten sonra silinen elemani dondurur.
		
		llist.remove(5);
		System.out.println(llist);
		
		//remove(eleman) sildi true, bulamazsa false
		
		llist.remove("Z");
		System.out.println(llist);
		
		//removeFirstOccurrence()
		
		llist.removeFirstOccurrence("Y");
		System.out.println(llist);
		
		//removeLast() 
		
		llist.removeLast();
		System.out.println(llist);
		
		//removeAll() 
		
		llist.removeAll(arrayList);
		System.out.println(llist);

	}

}
