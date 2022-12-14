package ders3;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
/*           if(sart){if kod blogu}      sart true ise if blogu, 
 *          else {else kod blogu}       sart false ise else blogu calisir.
 */		
		
//		int a = 2;
//		int b = 3;
//		
//		if(a>=b) {                                         // a>=b = false
//			
//			System.out.println("if blogu calisti.");
//		}
//		else {
//			
//			System.out.println("else blogu calisti.");      // else blogu calisti.
//		}

		
	/* SORU: Kullanicidan yasini sorunuz. Yasi 18 den buyuk ve esit ise alkol ve sigara satis 
	 * yapiniz, degilse yapmayiniz.
	 */      
			
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Yasinizi Giriniz?");
//		int yas = scan.nextInt();
//		
//		if(yas>=18) {
//			
//			System.out.println("Sigara ve alkol satisi serbest.");
//		}
//		else {
//			
//			System.out.println("Sigara ve alkol satisi YASAKTIR.");
//		}
	
		
	/* SORU: Kullanicidan uc kenar uzunlugu girmesini isteyiniz. Kenarlarin ucu de esitse ESKENAR  
     * UCGEN, degilse ESKENAR UCGEN DEGIL yazdirin.
	 */      
		
		System.out.println("Ucgenin birinci kenar uzunlugunu giriniz?");
		int kenar1 = scan.nextInt();
		
		System.out.println("Ucgenin ikinci kenar uzunlugunu giriniz?");
		int kenar2 = scan.nextInt();
		
		System.out.println("Ucgenin ucuncu kenar uzunlugunu giriniz?");
		int kenar3 = scan.nextInt();
		
		if(kenar1==kenar2 && kenar2 == kenar3) {
			
			System.out.println("Ucgenimiz ESKENAR ucgendir.");
		}
		else {
			
			System.out.println("ucgenimiz ESKENAR ucgen DEGILDIR.");
		}
		
		scan.close();
	}

}
