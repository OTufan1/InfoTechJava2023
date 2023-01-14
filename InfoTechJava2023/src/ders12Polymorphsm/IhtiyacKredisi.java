package ders12Polymorphsm;

public class IhtiyacKredisi extends BaseKredi{
	public double hesapla(double tutar) {
		double sonuc = tutar + (tutar * 0.020);
		return sonuc;
	}
}
