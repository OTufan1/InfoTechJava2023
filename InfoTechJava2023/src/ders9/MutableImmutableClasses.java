package ders9;

import java.util.ArrayList;
import java.util.List;

public class MutableImmutableClasses {

	public static void main(String[] args) {
		
//		String str = "Mehmet"; //immutable-degismez
//		str.toUpperCase();
//		System.out.println(str);
//		
//		List <String> list = new ArrayList<>(); //mutable degisebilir
//		list.add("Mehmet");
//		list.add("Ayse");
//		System.out.println(list);
		
//*******************************************************
		
//		String str = "";
//		
//		for(int i = 0; i < 100; i++) {
//			
//			str = i + ".deger";
//			System.out.println(str);
//		}
//		
//		System.out.println("son deger : " + str);
		
//*******************************************************
		
		String str1 = new String("mehmet");
		String str2 = new String("mehmet");
		
		System.out.println("new '==' sonucu: " + (str1 == str2));
		System.out.println("new 'equals()' sonucu: " + (str1.equals(str2)));
		
		String str3 = "mehmet";
		String str4 = "mehmet";
		
		System.out.println("new '==' sonucu: " + (str3 == str4));
		System.out.println("new 'equals()' sonucu: " + (str3.equals(str4)));
	}

}
