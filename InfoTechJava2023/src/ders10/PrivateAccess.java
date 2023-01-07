package ders10;

public class PrivateAccess {
	
	private String str3 = "Merhaba ben Private Access ten geldim";
	
	int sayi = 10;
	private int sayi1 = 20;
	
	public void sayi2() {
		System.out.println(sayi1);;
	}
	public int kare(){
		return sayi1*sayi1;
	}

}
