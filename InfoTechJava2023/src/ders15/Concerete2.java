package ders15;

public class Concerete2 implements Interface1, Interface2, Interface3{

	@Override              //Donus tipi ayni ise(void) hangi interface'ten 
	public void vites() {  //override ettigi onemli degildir.
		
	}

//	@Override
//	public int tekerlek() {
//		// TODO Auto-generated method stub
//		return 0;
//	}                                       // method signatur' i ayni fakat
//	                                        // donus tipi farkli olan  
//	@Override                               // methodlar override edilemez.
//	public String tekerlek() {
//		// TODO Auto-generated method stub
//		return "s";
//	}

	public static void main(String[] args) {
		
		
		//Ayni isimli variable'lar "InterfaceIsmi.VariableAdi" seklinde cagirilabilir.
		System.out.println(Interface1.SAYI+" "+Interface2.SAYI);
		
		System.out.println(Interface3.extraction(4, 2));
		Interface3 int3 = new Concerete2();
		System.out.println(int3.add(3, 5));
	}
}
