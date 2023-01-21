package ders09;
/*
   Soru4 :
   Bir list ve bir array olusturalim ve eleman olarak 10,11,12 ekleyelim. Iki
   method olusturup list ve array’i degistirmeyi deneyelim
   1.Method’da array’e yeni bir array assign edelim ve yeni halini yazdiralim
   2.Method’da list’e yeni bir list assign edelim ve yeni halini yazdiralim
   
   Method call’dan sonra main method’da yeniden yazdirip degisip degismediklerini
   kontrol edelim.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru4 {

	public static void main(String[] args) {
		
		int num[]= {10,11,12}; 
		//System.out.println("Reference main = "+num);
		degistirArray(num);
		System.out.println("method' dan sonra main method' un icinde array: "+Arrays.toString(num));
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		degistirList(list);
		System.out.println("method' dan sonra main method' un icinde list :" + list);
	}
	
	public static void degistirList(List<Integer> list) {
		
		list = new ArrayList<>();
		list.add(40);
		System.out.println("list methodda :" + list);
	}
	
	public static void degistirArray(int num[]) {
		
		num = new int[5]; 
		//System.out.println("Reference degistirArray = "+num);
		System.out.println("array methodda :" + Arrays.toString(num));
	}

}
