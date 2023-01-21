package ders05;

import java.util.Scanner;

public class MethodSoru2 {

	
	public static int soru2(int sayi) {
		
		int sonuc=0;
		
		Scanner scan = new Scanner(System.in);
		
		switch(sayi) {
		
		case 2 :
			System.out.println("Birinci sayiyi giriniz?");
			int birinciSayi = scan.nextInt();
			
			System.out.println("Ikinci sayiyi giriniz?");
			int ikinciSayi = scan.nextInt();
			
			sonuc =  birinciSayi + ikinciSayi;
			
		    break;
		case 3 :
			System.out.println("Birinci sayiyi giriniz?");
			int birinciSayi2 = scan.nextInt();
			
			System.out.println("Ikinci sayiyi giriniz?");
			int ikinciSayi2 = scan.nextInt();
			
			System.out.println("Ucuncu sayiyi giriniz?");
			int ucuncuSayi = scan.nextInt();
			
			sonuc = birinciSayi2 + ikinciSayi2 +ucuncuSayi;
			 
			break;
			
		default:
			System.out.println("Cok sayi , toplayamam.");
			
		}
		
		return sonuc;
		
	}
	
	
	
	public static void main(String[] args) {
		
//		Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2 veya 3 
//		degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
//		yazdirin. Kullanici toplamak istedigi sayi adedini 3’den buyuk girerse “Cok sayi
//		girdiniz, ben toplayamam” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac adet sayi toplamak istiyorsunuz?");
		int sayi = scan.nextInt();
		
		System.out.println("Toplama sonucu= "+soru2(sayi));

	}
	
}
