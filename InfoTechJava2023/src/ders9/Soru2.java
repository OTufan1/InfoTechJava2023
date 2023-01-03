package ders9;
/*
  Soru2 :
  -Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
  -Method’da indirim uygulayip fiyati main method’da yazdirin
  Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
 */
public class Soru2 {

	public static void main(String[] args) {
		
		int fiyat =100; // Pass by value
		
		System.out.println("Method10' da hesaplanan fiyat :" + indirim10(fiyat));
		System.out.println("Method20' de hesaplanan fiyat :" + indirim20(fiyat));
		System.out.println("Method25' de hesaplanan fiyat :" + indirim25(fiyat));
		System.out.println("Method call sonrasi fiyat :" + fiyat);

	}
	
	public static int indirim10(int fiyat) {
		
		fiyat*=0.90;
		return fiyat;
	}
	
    public static int indirim20(int fiyat) {
		
    	fiyat*=0.80;;
		return fiyat;
	}

    public static int indirim25(int fiyat) {
	
    	fiyat*=0.75;
	    return fiyat;
}

}
