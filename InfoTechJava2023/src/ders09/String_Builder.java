package ders09;

public class String_Builder {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder(); // ==>Bos bir string olusturur.
		StringBuilder sb2 = new StringBuilder("animal");//==>Belli bir degeri olan string olstrur.
		StringBuilder sb3 = new StringBuilder(5); //==>Kapesitesi belirli bir string olusturur.
		
		//1) append();
		StringBuilder sb = new StringBuilder();
		sb.append("Korkma!");
		System.out.println(sb);
		sb.append(" sonmez");
		System.out.println(sb);
		sb.append(" bu safaklarda").append(" yuzen alsancak.");
		System.out.println(sb);

		//2) length();
		System.out.println(sb.length());
		
		//3) capacity();
		System.out.println(sb.capacity());
		
		//4) charAt();
		System.out.println(sb.charAt(6));
		
		//5) delete();
		//012345678901234567890123456789012345678901234
		//Korkma! sonmez bu safaklarda yuzen alsancak.
		//System.out.println(sb.delete(29,34));
		
		//6) deleteCharAt();
		System.out.println(sb.deleteCharAt(6));
		
		//7) equals();
		sb1.append("Korkma sonmez bu safaklarda yuzen alsancak."); // icerik kontrol etmez. referansa bakar.
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.equals(sb1));

		//8) indexOf();
		//0123456789012345678901234567890123456789012
		//Korkma sonmez bu safaklarda yuzen alsancak.
		System.out.println(sb.indexOf("s"));
		System.out.println(sb.indexOf("o",2));
		
		//9) insert();
		System.out.println(sb.insert(6,"zsan",0,3)); //method icinde verdiginiz kelime grubunun 
													 //istenilen indexlerini ekler
		
		//10) replace();
		//0123456789012345678901234567890123456789012345
		//Korkmazsa sonmez bu safaklarda yuzen alsancak.
		System.out.println(sb.replace(6,9,"!"));
		
		//11) reverse();
		System.out.println(sb.reverse());

		//12) setCharAt();
		sb.reverse();
		//01234567890123456789012345678901234567890123
		//Korkma! sonmez bu safaklarda yuzen alsancak.
		sb.setCharAt(15,'s');
		System.out.println(sb);
		
		//13) subSequence();
		//01234567890123456789012345678901234567890123
		//Korkma! sonmez su safaklarda yuzen alsancak.
		System.out.println(sb.subSequence(8,14));
			
		//14 toString();
		String cumle = sb.toString();
		System.out.println(cumle);

		//15 trimToSize();
	    System.out.println("length()= "+sb.length());
	    System.out.println("capacity()= "+sb.capacity());
		sb.trimToSize();
		System.out.println("length()= "+sb.length());
		System.out.println("capacity()= "+sb.capacity());
		
		//16) compareTo();
		sb3.append("Korkma! sonmez su safaklarda yuzen alsancak.");
		System.out.println(sb);
		System.out.println(sb3);
		System.out.println(sb3.compareTo(sb)); // icerik ayni ise 0 doner 
		System.out.println(sb1.compareTo(sb)); // icerik farkli ise lenght'ine gore 1 veya -1 doner

	}

}
