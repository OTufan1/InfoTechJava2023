package ders15;
/*
Abstract classes
1)
Class’dir
2)
abstract ve concrete method’lar
konabilir
3)
Kismi olarak abstraction saglar.
4)
Birden fazla abstract class’a direk
child olunamaz. Coklu inheritance’i
desteklemez.
5)
Hiz acisindan avantajlidir
6)
Icindeki tüm nesnelerin “public”
olması zorunlu degildir
7)
soyut olmayan metodlar static olarak
tanımlanabilir
8)
Abstract class constructor’a sahiptir

Interface
1)
Class degildir.
2)
sadece abstract method’lar konabilir
3)
Tam abstraction (soyutluk) saglar
4)
Bir class’dan istediginiz kadar
interface’i inherit edebilirsiniz. Coklu
inheritance’a uygundur.
5)
Hiz acisindan abstract class’a gore
yavastir.
6)
Icindeki tüm nesnelerin “public”
olması gerekir
7)
metodlar static olamaz
8)
Interface constructor’a sahip degildir

 */
public interface Interface2 {

	public abstract void vites(); 
	
	int SAYI=12;                     
	public int SAYI2=20;                
	public static int SAYI3=30;       
	public static final int SAYI4=40;
	
//	abstract int tekerlek();
}
