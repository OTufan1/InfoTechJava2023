package ders10;

public class OrnekMetotPrivate {

	private int sayi = 10;
	
	private int getKare() {
		return sayi*sayi;
	}
	
	public int sonuc() {
		return getKare();
	}
	
	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
}
