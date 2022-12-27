package ders7;

public class Deneme {

	static int count = 0;
	
	public void increment() {
		
		count++;      //count=count+1;
	}
	
	public static void main(String[] args) {
		
	Deneme obj1 = new Deneme();
	
	Deneme obj2 = new Deneme();
	
	obj1.increment();
	
	obj2.increment();
		
	System.out.println("Obj1: count is= "+ obj1.count);   //2
	System.out.println("Obj2: count is= "+ obj2.count);   //2
	}

}
