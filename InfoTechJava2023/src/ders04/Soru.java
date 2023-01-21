package ders04;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve metin girmesini isteyin. Cumlenin icinde ki metne gore
		//1. cumle metni icermiyor
		//2. cumlede metin 1 kez varsa 1 kez iceriyor yazsin
		//3. fazla varsa birden fazla iceriyor.
		
		
		/*
		 * Algoritma
		 * 1. Kullanicidan veri girisi yapilacak
		 * 2. metin ve cumleyii karsilastir
		 * 3. yoksa yok yaz
		 * 4. 1 tane varsa 1 kez yaz
		 * 5. birden fazla yaz
		 */
		
		//cumle : bugun hava cok guzel cok gunesli
		//metin : cok
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("Metin giriniz");
		String metin = scan.next();

		if (!cumle.contains(metin)) { //cumlenin icinde metin olmadigini varsaydim
			System.out.println("Cumle girilen metni icermiyor.");
		}else {
			//Metin icerdigi icin Else kismina geldi.
			int ilkIndex = cumle.indexOf(metin);//11 ---- Bakacagimiz metin cumlenin hangi indexinde
			int ikinciIndex = cumle.indexOf(metin, ilkIndex+1); // // Bakacagimiz metin 2. defa geciyormu. Yoksa -1 doner
			
			if (ikinciIndex == (-1)) {//metni icermiyorsa
				System.out.println("Metin cumlede sadece 1 defa geciyor.");
			}else {//Metni 2 veya daha fazla iceriyorsa
				System.out.println("Metin cumlede 1 den fazla gecmektedir.");
			}
		}
	}

}
