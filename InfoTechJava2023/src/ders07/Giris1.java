package ders07;

public class Giris1 {
	int a=5;
	 
	public static void main(String[] args) {
		Giris1 giris1 = new Giris1();
		System.out.println(giris1.a);    //5
		giris1.a=6;
		System.out.println(giris1.a);    //6
		
		staticMethod();
	}
	
	public static void staticMethod() {
		Giris1 giris1 = new Giris1();
		System.out.println(giris1.a);	//5    
		//Giris2.b=4;
		giris1.nonStaticMethod();
	}
	
	public void nonStaticMethod() {
		//Giris2.b=4;
		System.out.println(a);          //5   

	}
/*	
1)Class yuklendiginde, memory’de static variable’lar olusturulur.
2)Static variable’lar bir tane olusturulur ve class’daki tum objeler onu gorur ve
kullanir.
3)Memory kullanimi static variable’lar icin sadece bir kere olur.
4)Static variable’lar static veya static olmayan methodlarin icinde kullanilabilir.
5)Static variable’lara baska classlardan sadece class ismi kullanilarak ulasilabilir,
obje olusturmaya gerek yoktur.
*/
	
}
