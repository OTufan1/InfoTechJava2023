package ders14;

public class Kedi extends Animal{
	
	
	public void sleep() { //Bu metotu burada yazmasakta olur. cunku abstract class icersinde
		//abstract metot degildir.
		System.out.println("Zzz");
	}

	@Override
	public void animalSound() {
		System.out.println("Miyav");
		
	}

	@Override
	public void hareket() {
		System.out.println("Birden ziplar");
		
	}

}
