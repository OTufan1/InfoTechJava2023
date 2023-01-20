package ders14;

public class Main {

	public static void main(String[] args) {
		
		Kopek myKopek = new Kopek();
		myKopek.animalSound();
		myKopek.sleep();
		myKopek.hareket();

		System.out.println();
		Yilan yilan = new Yilan();
		yilan.animalSound();
		yilan.hareket();
		yilan.sleep();
		
	}

}
