package ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IcIceTryCatch {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("Dosyam.txt");
			
			int k= 0;
			try {
				while((k=fis.read())!=-1 ) {
					System.out.print((char)k);
				}
			}
			catch(IOException e) {
				System.out.println("Dosya okunamiyor.");
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya silinmis veya dosya yolu hatali.");
		}

	}

}
