package ders11;

public class Ustabasi extends Isci1{

	String sorumluOlduguBirim;
	int sorumluOlduguIsciSayisi;

	public static void main(String[] args) {
		
		Ustabasi ub1 = new Ustabasi();
		ub1.sorumluOlduguBirim="tamirhane";//Ustabasi
		ub1.bolum="Tamirhane";//Isci1
		ub1.isim="Mehmet";//Personel
		
		Isci1 ub2 = new Ustabasi();
		ub2.bolum="Atolye";//Isci1
		ub2.statu = "Isci";//Personel1
		
		
		Personel1 ub3 = new Ustabasi();
		ub3.soyIsim="Bulut";//Personel1
		
	}
	
}
