package ders11;
/*
 * Hatayi Bulun ve giderin.
 */
class Derived{
	
	public Derived(String temp) {
		
		System.out.println("Derived class "+temp);
	}

}

public class Test01 extends Derived {

	public Test01(String temp) {
		super("Hoscakal");
		System.out.println("Test class " + temp);
	}
	
	public static void main(String[] args) {
		
		Test01 obj = new Test01("Merhaba");
	}
}
