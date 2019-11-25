package proje2;

public class Ogrenci2 {

	String isim;
	double bakiye;

	void paraGonder(String isim , double miktar) {
		if (miktar < bakiye) {
			bakiye = bakiye - miktar;
			System.out.println("Para Gonderildi kalan bakiye: " + bakiye);
			paraEkle(miktar);

		} else {
			System.out.println("Yetersiz Bakiye");
		}

	}

	void paraEkle(double miktar) {
		bakiye = bakiye + miktar;
		System.out.println("Miktar eklendi Güncel bakiye: " + bakiye);

	}
}
