package ders12Polymorphsm;

public class MeslekKredisi extends BaseKredi{
	public double hesapla(double tutar) {
		double sonuc = tutar + (tutar * 0.012);
		return sonuc;
	}

}
