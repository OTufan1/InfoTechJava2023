package ders13;

import java.util.ArrayList;

public class ArrayIndexOutOfBoundsExc {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		System.out.println(arr[1]); // 2
		
		System.out.println(arr[3]); //RTE, unchecked
		                            //ArrayIndexOutOfBoundsException
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list.get(50)); //ArrayIndexOutOfBoundsException

	}

}
