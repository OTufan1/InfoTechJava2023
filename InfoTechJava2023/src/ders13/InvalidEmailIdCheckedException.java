package ders13;
/*
 * Checked Exception
 * Class isminin sonuna Exception kelimesi eklenir(Sart deil, genel konsept)
 * Exception class'ina child class yap (Checked Exceptionlar icin)
 * String parametreli bir constructor olustur ve ilk satirina 
 * super(message); keyword'unu ekle.
 */
public class InvalidEmailIdCheckedException extends Exception{

	public InvalidEmailIdCheckedException(String message) {
		super(message);
	}
	
	public InvalidEmailIdCheckedException() {
		super();
	}
	
}
