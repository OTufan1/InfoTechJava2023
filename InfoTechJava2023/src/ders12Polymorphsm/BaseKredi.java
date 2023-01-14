package ders12Polymorphsm;

public class BaseKredi {
	public double hesapla(double tutar) {
		double sonuc = tutar + (tutar * 0.015);
		return sonuc;
	}
	
	/*
	 * Asagidaki metotta final kullandigimiz icin artik kimse override edemez.
	 */
//	public final class BaseKredi {
//		public double hesapla(double tutar) {
//			double sonuc = tutar + (tutar * 0.015);
//			return sonuc;
//		}

}
