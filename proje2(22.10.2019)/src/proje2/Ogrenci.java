package proje2;

public class Ogrenci {

	Ogrenci() {
		System.out.println("OGRENC� NESNES� OLU�TURULUYOR ......!...!"); // Yap�land�r�c�lar
																			// bu
																			// �ekilde
																			// tan�mlan�r
																			// ancak
																			// s�n�f
																			// ismi
																			// gibi
																			// ilk
																			// harfi
																			// b�y�k
																			// olur
																			// !

	}
	Ogrenci(String a){
		System.out.println("String ile olu�turuluyor! !");
		ad=a;
		
	}
	Ogrenci(int y){
		System.out.println("�nteger ile olu�turuyor ! ");
		yas=y;
		
	}
	Ogrenci(String x, int y){
		System.out.println("�nteger ve String ile olu�turuluyor! ");
		soyad=x;
		yas=y;
	}
	
	

	String ad;
	String soyad;
	int yas;
	boolean tembelmi;
	int bakiye;

	void dersCalis() {
		System.out.println(ad + " " + soyad + " ders �al���yor ");
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
