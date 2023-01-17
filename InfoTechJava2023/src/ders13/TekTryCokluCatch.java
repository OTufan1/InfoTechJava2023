package ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TekTryCokluCatch {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			
		FileInputStream fis = new FileInputStream("Dosyam.txt");
		
		int k= 0;
		
			while((k=fis.read())!=-1 ) {
				System.out.print((char)k);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Dosya silinmis veya yolu hatali.");
		}
		catch(IOException e) {
			System.out.println("Dosya okunamiyor.");
		}
		
		
		

	}

}
