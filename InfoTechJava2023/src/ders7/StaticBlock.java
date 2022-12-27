package ders7;

public class StaticBlock {
	
	public static int age;
	
	static {
		
		System.out.println("static block 2 calisti"); //1.
		age = 24; //2.
	}
	static {
		
		System.out.println("static block 1 calisti"); //3.
		age = 23;  //4.
	}
	public StaticBlock() {
		
		System.out.println("Constructor calisti"); //8.
		System.out.println(++age);   //9.   25
	}

	public static void main(String[] args) {
		
		System.out.println("Main method calisti 1"); //5.
		System.out.println(++age);  //6.   24
		StaticBlock obj = new StaticBlock(); //7
		System.out.println("Main method calisti 2");  //10.
		
	}

}
