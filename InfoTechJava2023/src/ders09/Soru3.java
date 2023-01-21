package ders09;

import java.util.ArrayList;
import java.util.List;

/*
 	Soru3 :
		-Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list 
	     elemanlarini artirmayi deneyelim
        1. Method’da elemanlari for each loop kullanarak artirin
        2. Method’da elemanlari set method’u kullanarak artirin
        Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
 */       
public class Soru3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		
		degistir(list);
		System.out.println(list);//[10, 11, 12]
		degistir2(list);
		System.out.println(list); //[13, 14, 15]
		
	}
	
	public static void degistir(List<Integer> list) {
		
		for (int each: list) {
			
			each=each+3;
			System.out.print(each + " "); //13 14 15 
		}
		System.out.println();
		System.out.println(list);//[10, 11, 12]
	}
	
	public static void degistir2(List<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			
			list.set(i, list.get(i)+3);
			System.out.print(list.get(i)+" ");//[13, 14, 15]
		}
		System.out.println();
		System.out.println(list);//[13, 14, 15]
	}

}
