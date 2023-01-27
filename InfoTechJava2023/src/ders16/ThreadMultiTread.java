package ders16;

public class ThreadMultiTread {

	public static void main(String[] args) {

		// Thread kullanimi try-catch kullanimini zorunlu tutar
//		for (int i = 0; i < 10; i++) {
//            System.out.print(i + "  ");
//            try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		// MultiThread : Java ayni anda birden fazla islem yapmaniza izin verir. 
		// Bunu siralamaya sokmak icin synchronizing yapisi kullanilir.

		Thread th1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("AA   ");
				}
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print("ZZ   ");
				}
			}
		};

		th1.start();
		th2.start();

	}

}
