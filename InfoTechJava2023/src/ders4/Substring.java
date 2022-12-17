package ders4;

public class Substring {

	public static void main(String[] args) {
		//substring ==> girdigimiz indexler arasindaki ifadeleri gormek icin kullaniriz.
		
		String str  = "Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.substring(14)); 
		System.out.println(str.substring(14,20)); //14.indexten itibaren alir 20 Dahil degildir.
//		System.out.println(str.substring(14,10));
		

	}

}
