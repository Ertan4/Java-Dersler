package proje2;

public class Test2 {

	public static void main(String args[]) {

		Ogrenci ogrenci = new Ogrenci();
		
		Ogrenci ogrenci2 = new Ogrenci("Ertan");
		System.out.println(ogrenci2.ad);
		
		
		
		Ogrenci ogrenci3 = new Ogrenci(20);
		System.out.println(ogrenci3.yas);
		
		
		
		Ogrenci ogrenci4 = new Ogrenci("Ciller", 20);
		System.out.println(ogrenci4.soyad + ogrenci4.yas);

		/*
		 * ogrenci.ad = "ERTAN"; ogrenci.soyad = "ÇÝLLER"; ogrenci.yas = 20;
		 * ogrenci.tembelmi = false; ogrenci.bakiye = 100;
		 * 
		 * ogrenci.dersCalis(); ogrenci.okulaGit();
		 * System.out.println(ogrenci.ad + " YAS: " + ogrenci.yas);
		 * 
		 * int kalan = ogrenci.paraHarca(40); System.out.println("Bakiye: " +
		 * kalan);
		 * 
		 * kalan =ogrenci.paraHarca(10); System.out.println("Bakiye: " + kalan);
		 */

	}

}
