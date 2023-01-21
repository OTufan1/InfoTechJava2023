package ders03;

import java.util.Scanner;

public class If_Elseif_Else {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
/*		if() {}
		
		else if() {}
		
	    else if() {}          // sinirsiz else if(){} eklenebilir.
		.
		.
		.
		
		else {}
*/
		
		
/*		SORU:Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini
		yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi
		farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
		sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”
		yazdirin.
*/		
		//durum1 + + ise toplami
		//durum2 - - ise carpimi
		//durum3 + -  “farkli isaretlerde sayilarla islem yapamazsin” yazdir.
		//durum4 biri sifir ise  “sifir carpmaya gore yutan elemandir” yazdir.
		
		System.out.println("Birinci sayiyi giriniz?");
		int birinciSayi = scan.nextInt();
		
		System.out.println("ikinci sayiyi giriniz?");
		int ikinciSayi = scan.nextInt();
		
		if(birinciSayi>0 && ikinciSayi>0) {
			
			System.out.println("Sayilarin toplami= "+(birinciSayi+ikinciSayi));
		}
		else if(birinciSayi<0 && ikinciSayi<0) {
			
			System.out.println("Sayilarin carpimi= "+(birinciSayi*ikinciSayi));
		}
		else if(birinciSayi*ikinciSayi<0) {
			
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		}
		else {
			
			System.out.println("sifir carpmaya gore yutan elemandir");
		}
		
		
		scan.close();
		
	}

}
