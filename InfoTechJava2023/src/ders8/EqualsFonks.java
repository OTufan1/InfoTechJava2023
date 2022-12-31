package ders8;

import java.util.ArrayList;
import java.util.List;

public class EqualsFonks {

	public static void main(String[] args) {

		List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        
       /*
        * Equals fonksiyonu var olan iki lsitesinin elemanlarinin ayni olup olmadigina bakar
        * Equals fonksiyonu referans adreslerine bakmaz
        * sadece icindeki degerler ayni mi degilmi ona bakar
        */
        System.out.println(one.equals(two)); // Bos iki liste equals ile bakildiginda true doner
        
        one.add("Ankara");
        System.out.println(one.equals(two)); // listeler farkli oldugu icin false doner
        
        two.add("Ankara");
        System.out.println(one.equals(two)); //  iki listede de "Ankara" oldugu icin true doner
        
        
   
	}

}
