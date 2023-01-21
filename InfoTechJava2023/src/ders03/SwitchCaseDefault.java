package ders03;

import java.util.Scanner;

public class SwitchCaseDefault {

	public static void main(String[] args) {
		
		//SWITCH CASE DEFAULT
		// long / double / float / boolean  switch te kullanilamaz, neden?  arastirma odevi!!!

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gun adi giriniz?");
		String gunAdi = scan.nextLine();
		
		switch (gunAdi) {
		
			case "pazartesi" :
				System.out.println("Gun Pazartesi");
				
				
			case "sali" :
				System.out.println("Gun Sali");
				break;
				
			case "carsamba" :
				System.out.println("Gun Carsamba");
				break;
				
			case "persembe" :
				System.out.println("Gun Persembe");
				break;
				
			case "cuma" :
				System.out.println("Gun Cuma");
				break;
				
			case "cumartesi" :
				System.out.println("Gun Cumartesi");
				break;
				
			case "pazar" :
				System.out.println("Gun pazar");
				break;
				
			default :
				System.out.println("Hatali giris yaptiniz.");
		
		}
		
		
		scan.close();
		
	}

}
