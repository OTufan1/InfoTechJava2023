package ders11;

class Derived2 {
	
	public void getDetails() {
		
		System.out.println("Derived2 class");
	}
}

public class Test03  extends Derived2{

	public Test03() {
		
		System.out.println("Test03 class");
		super.getDetails();
	}
	
	public static void main(String[] args) {
		
		Test03 obj = new Test03();
		obj.getDetails();
	}

}
