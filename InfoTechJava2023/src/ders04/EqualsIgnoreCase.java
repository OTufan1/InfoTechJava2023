package ders04;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		//EqualsIgnoreCase ==> String ifadeler karsilastirildiginda BUYUK/KUCUK AYRIMI ortadan kalkar.
		
		String str1 = "AlI";
		String str2 = "ali";
		String str3 = new String("Ali");
		String str4 = "Ali";
		
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		System.out.println(str1.equalsIgnoreCase(str1)); //true
		System.out.println(str1.equalsIgnoreCase(str3)); //true

	}

}
