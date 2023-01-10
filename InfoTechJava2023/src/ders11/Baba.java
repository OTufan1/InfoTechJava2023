package ders11;

public class Baba {

	Baba(String isim){
		
		System.out.println("Parametreli Baba Cons.");
	}
	
	Baba(){
		
		this("ahmet");
		System.out.println("Parametresiz Baba Cons.");
	}
}
