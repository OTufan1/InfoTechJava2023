package ders14;

public class Personel {
	
	static final String sirketIsmi = "InfoTech";
	static final String sirketAdresi = "Almanya";
	
	protected String isim = "Deger Girilmedi";
    protected String soyIsim = "Deger Girilmedi";
    protected String tcNo = "Deger Girilmedi";
    protected String personelNo;
    
    static int personelSayac = 1000;
    
    protected String personelNo(){
        personelSayac++;
        String no = personelSayac+"";
        return no;
    }
	

}
