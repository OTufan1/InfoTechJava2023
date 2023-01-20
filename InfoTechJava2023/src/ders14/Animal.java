package ders14;

public abstract class Animal {
	
	
	public abstract void animalSound();	
	
	public abstract void hareket();
	
	public void sleep() {           
		System.out.println("Zzz");
		//bu metotu, animal classini extends eden diger siniflarda yazmasakta olur
		//cunku normal class gibi bu ozelligi kullanabilir
		//ama hareket() ve animalSound() metotlari abstract oldugu icin bu classi 
		//extends eden heryerde override etmeliyiz
	}

}
