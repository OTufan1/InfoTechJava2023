package ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws IOException {
		
		method1();
	}
	
	static void method1() throws FileNotFoundException,IOException{
		
		FileInputStream fis = new FileInputStream("Dosyam.txt"); // method signature'inda yazilan throws keyword'u CTE checked Durumlarinda kullanilir.
		
		System.out.println("Kodlarin devami");
	}

}
