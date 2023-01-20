package ders14;

public class Isci extends Muhasebe{

	@Override
	protected int saatUcreti() {
		return 10;
	}

	@Override
	protected int aylikCalismaSuresi() {
		return 140;
	}

	@Override
	public String toString() {
		return "Isci [saatUcreti=" + saatUcreti + ", aylikCalismaSuresi=" + aylikCalismaSuresi + ", maas=" + maas
				+ ", isim=" + isim + ", soyIsim=" + soyIsim + ", tcNo=" + tcNo + ", personelNo=" + personelNo
				+ ", saatUcreti()=" + saatUcreti() + ", aylikCalismaSuresi()=" + aylikCalismaSuresi()
				+ ", personelNo()=" + personelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
