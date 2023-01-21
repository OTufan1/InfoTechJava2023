package ders04;

import java.util.Scanner;

public class Soru1 {

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
				

				int ilkIndex = cumle.indexOf(metin); // metni aramaya sol taraftan basladi
				int sonIndex = cumle.lastIndexOf(metin); // metni aramaya sag taraftan basladi
				
				if(ilkIndex == (-1)) {//metin yoksa -1 doner 
					System.out.println("Metin cumle icinde yoktur");
				}else if (ilkIndex == sonIndex) { //ilkIndex ve sonIndex ayni degeri gosterirse esit olur. yani bir tane vardir
					System.out.println("Metin cumle icinde 1 defa vardir");
				}else {//3.ve son secenek; 2 veya daha fazla gecmektedir
					System.out.println("Birden fazla metin vardir.");
				}

	}

}
