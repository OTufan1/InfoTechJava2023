package ders5;

public class Methodlar {

	public static void main(String[] args) {
		
		myFirstMethod();
		
	//	int maindekiSonuc = method2(2,3);
		
	//	System.out.println(maindekiSonuc);
		
		System.out.println(method2("gunesli","hava "));  
		
		
		
	}
	
	
	// access Modifier = public/ protected/ default/private
	//Method signiture=  method adi, arguman sayisi ve arguman cesidi.
	//Eger bir Class’da ismi ayni fakat parametreleri farkli olan
	//methodlar olusturursak buna Overloading denir.
	
	// Retun type'i donussuz void
	public static void myFirstMethod(){
		
		System.out.println("First method calisti");
		
	}
	
	//Return type donuslu int
	public static int method2(int sayi1, int sayi2) {
		
		int sonuc = sayi1 + sayi2;
		
		return sonuc;
	}
	
     public static String method2(String str1, String str2) {
		
		String kelimeBirlestirme = str2.concat(str1);
		
		return kelimeBirlestirme;
	}
	

}
