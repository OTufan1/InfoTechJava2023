package ders09;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		//Varargs ==> variable arguments arguman=parametre
		//arka planda array olarak calisir.
		//Varargs' a varargs disinda parametre gonderilecekse varargs en sonda yazilir(en sagda)
		//sadece bir method'da bir adet varargs kullanilabilir.
		
		add("Ahmet",67, 'f',10,20,30,40);
	}
	
//	public static void add(int sayi1, int sayi2) {
//		
//		int toplam = sayi1 + sayi2;
//		System.out.println("SONUC= "+toplam);
//	}
//	
//	public static void add(int sayi1, int sayi2, int sayi3) {
//		
//		int toplam = sayi1 + sayi2 + sayi3;
//		System.out.println("SONUC= "+toplam);
//	}
//	public static void add(int sayi1, int sayi2, int sayi3,int sayi4) {
//		
//		int toplam = sayi1 + sayi2 + sayi3 + sayi4;
//		System.out.println("SONUC= "+toplam);
//	}
	
	public static void add(int... sayi ) {
		
		int top = 0;
		for(int i: sayi) {
			
			top +=i;
		}
	}

	
	public static void add(String str,int rakam,char ch,int... sayi) {
		
		int top = 0;
		for(int i: sayi) {
			
			top +=i;
		}
		
		System.out.println("2SONUC= "+top);
		System.out.println(sayi[2]);
		System.out.println(sayi.length);
		System.out.println(Arrays.toString(sayi));

	}

}
