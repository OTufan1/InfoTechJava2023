package ders13;

public class NumberFormatExc {

	public static void main(String[] args) {
		
		String str ="123490";
		int sayi = Integer.parseInt(str);
		
		System.out.println(sayi+10); //123500
		
		str = "123a45";
		
		int sayi1 = Integer.parseInt(str); //RTE NumberFormatException
		System.out.println(sayi+10);
		

	}

}
