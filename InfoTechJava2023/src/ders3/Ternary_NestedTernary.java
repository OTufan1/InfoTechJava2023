package ders3;

import java.util.Scanner;

public class Ternary_NestedTernary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Bir sayi giriniz?");
//		long sayi = scan.nextLong();
//		             //sart bolumu   //true bolumu    //false bolumu
//		String sonuc = sayi%2 == 0 ? "Sayi CIFTTIR" : "Sayi TEKTIR.";
//		
//		System.out.println("Sonucumuz= "+sonuc);
//
//		
//				
//        int sonuc2 = (int) sayi%2 == 0 ? (int)sayi+10 : (int)sayi-10;
//		
//		System.out.println("int sonucumuz= "+sonuc2);
		
		
		// NESTED TERNARY (ic ice Ternary)
		
		
		System.out.println("Cinsiyet giriniz e/k?");
		char cinsiyet = scan.next().charAt(0);
		
		System.out.println("Yasinizi giriniz?");
		short yas = scan.nextShort();
		
		String durum = cinsiyet == 'k' ? (yas>=60 ? "Kadin emekli olabilir." : "Kadin emekli OLAMAZ.") 
				    
				                        : (yas>=65? "Erkek emekli olabilir." : "Erkek emekli OLAMAZ.") ;
		
		System.out.println("Son durum nedir?>>> "+durum);
		
		
		scan.close();  // Scanner' i kapatmak icin. 
			
	}

}
