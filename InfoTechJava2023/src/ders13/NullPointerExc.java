package ders13;

public class NullPointerExc {

	public static void main(String[] args) {
		
		String str ="";
		System.out.println(str.length());  //0
		
		str=null;
		System.out.println(str.length()); //RTE (RuntimeException), unchecked
                                          //NullPointerException
	}

}
