package ders7;

import java.util.Arrays;

public class Arrayler {

	public static void main(String[] args) {
		
		int myArray[];  // bu daha cok kullanilir.
		myArray = new int[6];
		
		int [] myArray2;
		
		int myArray3[] = new int[6];
		
		//System.out.println(Arrays.toString(myArray3));
		
		myArray3[0] = 9;
		myArray3[1] = 33;
		myArray3[2] = 61;
		myArray3[3] = 0;
		myArray3[4] = 55;
		myArray3[5] = 33;
		
		//System.out.println(Arrays.toString(myArray3));
				
		int myArray4 [] = {1,2,3,4,5,6,7,8,9,0};
		
		//System.out.println(Arrays.toString(myArray4));
		//System.out.println(myArray4[1]);
		
		
		String arr[] = {"Ali","Veli","Fatma","Ayse"};
		
		//arr[4] = "Omer"; //ArrayIndexOutOfBoundsException-Index 4 out of bounds for length 4
		                   // at ders7.Arrayler.main (Arrayler.java:35)
		
		arr[3] = "Omer";
		//System.out.println(Arrays.toString(arr));
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		// son eleman formulu = arr.length-1
		
		int uzunluk = arr.length;   //String manipulation' daki length() ile karistirmayin.
		//System.out.println(uzunluk);
		
//		for(int i=0; i<arr.length;i++) {
//			
//			System.out.println(arr[i]);
//		}
		
		
		/*Soru: 3 elemanli integer tipinde bir array olusturun ve son elemandan 
		        itibaren sirayla yazdirin.
		*/
		
//        for(int i= arr.length-1; i>=0;i--) {
//			
//			System.out.println(arr[i]);
//		}
        
        
       //Soru: Verilen arraydeki elemanlarin tumunu toplayin.(int arr2[] = {3,5,9};)
        
        int arr2[] = {3,5,9};
        
        int toplam = 0;
        
        for(int i= arr2.length-1; i>=0;i--) {
			
			toplam+= arr2[i];
		}
        
        //System.out.println("Array deki elmanlarin sayisal toplami= "+toplam);
        
// sort() Method'u:
        
        String arr3[] = {"ab","a","baa"};
        
        Arrays.sort(arr3); // kucukten buyuge dogru siralar.
        
       // System.out.println(Arrays.toString(arr3));
        
        
// binarySearch(): Method' u:
        
        int arr4[] = {88,45,23,11,87,93};
        
        Arrays.sort(arr4); //binarySearch() method'undan once array sort edilmelidir.Aksi
                           // halde dogru sonuc vermez.         
        
        //System.out.println(Arrays.toString(arr4));
        
       //System.out.println(Arrays.binarySearch(arr4, 23)); // eleman varsa index numarasi, eleman yoksa
                                                           // eksili bir sayi verir.
        
        int arr5[] = {2,4,6};
        int arr6[] = {6,4,2};
        
       // System.out.println(Arrays.equals(arr5, arr6));   // sonuc boolean doner.
        
        
// split() Method'u:        
        
        String str = "Java ogrenmek cok kolay.";
        
        String arr7 [] = str.split(" ");
        
        System.out.println(Arrays.toString(arr7));
        System.out.println(arr7.length);
        
        String arr8 [] = str.split("");
        System.out.println(Arrays.toString(arr8));
        System.out.println(arr8.length);
        
        String arr9 [] = str.split("a");
        System.out.println(Arrays.toString(arr9));
        System.out.println(arr9.length);
        
	}

}
