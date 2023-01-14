package ders12Polymorphsm;

public class TasitKredisi extends BaseKredi{
	public double hesapla(double tutar) {
		double sonuc = tutar + (tutar * 0.013);
		return sonuc;
	}
}
