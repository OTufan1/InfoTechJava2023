package ders4;

public class Empty_Blank {

	public static void main(String[] args) {
		//isEmpty==> Stringin Bos olup olmadigina bakar. bos true doner.
		//isBlank==> String ifadenin icinde hic birsey yoksa veya space ile bosluk olusturulduysa true doner
		
		
		String str  = "Calisirsaniz, Java ogrenmek cok kolay";
		String str1 = "                 ";
		
		System.out.println(str.isEmpty()); //false
		System.out.println(str1.isEmpty());//false
		
		System.out.println(str.isBlank());//false
		System.out.println(str1.isBlank());//true
		

	}

}
