package ders15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorlar {

	public static void main(String[] args) {
		
		//hasNext() / next() / remove()

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		int k= 0;
		while(k<=list.size()-1) {
			if(list.get(k).equals("A") || list.get(k).equals("D")) {
				list.remove(k);
				k--;
			}
			k++;
		}
		System.out.println(list);
		
		Iterator<String> Ilist =list.iterator();
		
		while(Ilist.hasNext()) {
			Ilist.next();
			Ilist.remove();
			System.out.println(list);
		}
		
		
	}

}
