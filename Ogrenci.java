package proje2;

public class Ogrenci {

	Ogrenci() {
		System.out.println("OGRENCİ NESNESİ OLUŞTURULUYOR ......!...!"); // Yapılandırıcılar
																			// bu
																			// şekilde
																			// tanımlanır
																			// ancak
																			// sınıf
																			// ismi
																			// gibi
																			// ilk
																			// harfi
																			// büyük
																			// olur
																			// !

	}
	Ogrenci(String a){
		System.out.println("String ile oluşturuluyor! !");
		ad=a;
		
	}
	Ogrenci(int y){
		System.out.println("İnteger ile oluşturuyor ! ");
		yas=y;
		
	}
	Ogrenci(String x, int y){
		System.out.println("İnteger ve String ile oluşturuluyor! ");
		soyad=x;
		yas=y;
	}
	
	

	String ad;
	String soyad;
	int yas;
	boolean tembelmi;
	int bakiye;

	void dersCalis() {
		System.out.println(ad + " " + soyad + " ders çalışıyor ");
	}

	void okulaGit() {
		System.out.println(ad + " " + soyad + " okula gidiyor ");
	}

	int paraHarca(int miktar) {
		if (bakiye > miktar) {
			bakiye = bakiye - miktar;

			return bakiye;

		} else {
			System.out.println("Yetersiz Bakiye");
			return bakiye;

		}
	}

}
