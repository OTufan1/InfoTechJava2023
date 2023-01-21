package ders07;

public class Giris2 {
	static int b=5;
	
	public static void main(String[] args) {
		
		System.out.println(b);        //5
		b=6;
		System.out.println(b);        //6
		
		staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println(b);        //6
		
		Giris2 giris2 = new Giris2();  
		giris2.nonStaticMethod();
//		Giris1 giris1 = new Giris1();
//		giris1.a=7;
	}
	
	public void nonStaticMethod() {
		
		System.out.println(b);        //6 
		//staticMethod();
//		Giris1 giris1 = new Giris1();
//		giris1.a=7;
	}

}
