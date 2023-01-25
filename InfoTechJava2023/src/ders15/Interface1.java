package ders15;
/*
Interface bir class degildir. Interface interface’dir.
 
Interface’ler somutlastirilamaz (can not be instantiated) yani Interface’de obje
olusturulamaz.

Bir class birden fazla class’a extend edilemez ama birden fazla interface’e
implement edilebilir.

*/
public interface Interface1 {

	//Methodlar(abstract metodlar yani soyut)
	void vites();                //  \
//	public void aku();           //   \
//	abstract String tekerlek();  //    4 method da aynidir.
//	public abstract int motor(); //   /

	//Variable'lar
	//Interface' in variable'lari public, static ve de final' dir. Yazi olarak
	//yanlarinda yazsa da yazmasa da standarttir.
	int SAYI=11;                      //   \
	public int SAYI2=20;              //    \  
	public static int SAYI3=30;       //     4 variable da ayni seyi ifade eder.
	public static final int SAYI4=40; //    /
}
