package ders10;

public class Encapsulations {
	
	
	
	public Encapsulations() {//Bos constructor
		
	}
		
	//Dolu constructor
	public Encapsulations(int id, String marka, String ekranBoyutu, int fiyat, String urunKod) {
		
		this.id = id;
		this.marka = marka;
		this.ekranBoyutu = ekranBoyutu;
		this.fiyat = fiyat;
		this.urunKod = urunKod;
	}



	//Attribute - fields
	private int id;
	private String marka;
	private String ekranBoyutu;
	private int fiyat;
	private String urunKod;
	private boolean happy = true;
	
	public boolean isHappy() { //Boolean degerler isimlendirme kurali geregi getter kismi is ile olur
		return happy;
	}
	public void setHappy(boolean happy) {
		this.happy = happy;
	}
	
	//Getter ve Setter methodlari Java Beans olarak da adlandirilir. 
	
	//Getter
	public int getId() {
		return id;
	}
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getEkranBoyutu() {
		return ekranBoyutu;
	}
	public void setEkranBoyutu(String ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) { // Setter yaparken iceride kosullarimizi belirtebiliriz
		if(fiyat > 600 && fiyat < 800) {
			this.fiyat = fiyat;
		}else {
			System.out.println("600-800 arasi deger giriniz.");
		}
		
	}
	
	public String geturunKod() {
		return marka.substring(0,1)+id;
	}
	

	
	
	
	
	

}
