package ders05;

import java.util.Scanner;

public class ForSoru {

	public static void main(String[] args) {
		
//		Soru: Kullanicidan 100’den kucuk bir tamsayi isteyin . 1’den baslayarak girilen
//		sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("100 den kucuk bir sayi giriniz?");
		int sayi = scan.nextInt();
		
		for(int i = 1; i<=sayi; i++) {
			
			if(i%3==0 || i%5==0) {
				
				System.out.println(i);
			}
		}

	}

}
