package proje2;

public class Ayse {
	
	String isim;
	double AyseBakiye;
	
	Ogrenci2 ogrenci2=new Ogrenci2();
	
	void paraGonder(double miktar) {
		if (miktar < AyseBakiye) {
			AyseBakiye = AyseBakiye - miktar;
			ogrenci2.paraEkle(miktar);
			System.out.println("Para Gonderildi kalan bakiye: " + AyseBakiye);
			//paraEkle(miktar);

		} else {
			System.out.println("Yetersiz Bakiye");
		}

	}

	void paraEkle(double miktar) {
		AyseBakiye = AyseBakiye + miktar;
		System.out.println("Miktar eklendi Güncel bakiye: " + AyseBakiye);

	}

}
