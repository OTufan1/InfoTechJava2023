package ders15;

public interface Interface3 {              // Java8 den sonra concrete
                                           // methodlar eklenebilir.  
	public default int add(int a, int b) { // buradaki default access modifier
		                                   // degildir. non-static bir concrete 
		return a+b;                        // method olarak dusunulebilir.
	}
	
	public static int extraction(int a, int b) {  // static concrete bir method'tur
		
		return a-b;
	}
}
