package ders9;
/*
	Soru :
	-Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
	-Method’da indirim uygulanan fiyati yazdirin
	Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin
	orginal degeri degistirip degistirmedigini kontrol edin.
*/
public class Soru1 {

	public static void main(String[] args) {
    //Pass By Value   Pass By Reference
		int fiyat =100;
		
		System.out.println("method'da hesaplanan fiyat : " + indirim(fiyat));
		System.out.println("method call sonrasi fiyat : " + fiyat);
	}
	
	public static int indirim(int fiyat) {
		
		fiyat*=0.90;
		return fiyat;
	}

}
