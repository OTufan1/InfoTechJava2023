package ders15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorlar {

	public static void main(String[] args) {
		// add() / hasNext() /hasPrevious / next() / nextIndex() /previous()
		// previousIndex() / remove() / set() 

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		ListIterator<String> Ilist = list.listIterator();
		
		Ilist.next();
		Ilist.next();
		Ilist.add("F");
		System.out.println(list);
		
		Ilist.previous();
		Ilist.add("G");
		System.out.println(list);
		
		while(Ilist.hasPrevious()) {
			Ilist.previous();
			Ilist.remove();
			System.out.println(list);
		}
		
		Ilist.next();
		System.out.println(Ilist.nextIndex());
		System.out.println(Ilist.previousIndex());
		
		Ilist.set("X");
		System.out.println(list);
	}

}
