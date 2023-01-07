package ders10;

public class OrnekMetotPrivate {

	private int sayi = 10;
	
	private int getKare() { // Private degerimizin karesini donduren private metot
		return sayi*sayi;
	}
	
	public int sonuc() {
		return getKare(); // Private metotumuzu cagiran metotu public ile olusturduk
	}
	
	public void setSayi(int sayi) { // private sayimizi set etmek icin metotu public yapmaliyiz
		this.sayi = sayi;
	}
	
}
