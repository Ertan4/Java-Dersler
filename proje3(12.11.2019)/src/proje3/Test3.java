package proje3;

import java.util.Scanner;

public class Test3 {
	/*public static void main(String[] args) {
		double ogrenciNotlar[] = new double[5];
		double toplam = 0;
		for (int i = 0; i < ogrenciNotlar.length; i++) {

			Scanner scan = new Scanner(System.in);
			ogrenciNotlar[i] = scan.nextDouble();

			toplam += ogrenciNotlar[i];

		}
		System.out.println("Sýnýf Ortamalasý: " + (toplam / ogrenciNotlar.length));
		System.out.println("Diznin 6. elemani: "+ogrenciNotlar[3]);
		

	}*/
	public static void main(String[] args){
	
	Kitap kitaplik[] =new Kitap[2];
	for(int i=0;i<kitaplik.length;i++){
		
		Scanner scn= new Scanner(System.in);
		kitaplik[i]=new Kitap();
		
		
		
		
		System.out.println("Kitap Ýsmi giriniz");
		kitaplik[i].kitapAdi=scn.nextLine();
		
		System.out.println("Basim Yili: ");
		kitaplik[i].basimYili=scn.nextInt();
		
		
		System.out.println("Kitapýn fiyati");
		kitaplik[i].fiyat=scn.nextDouble();
		
	}
	System.out.println("Ortalama Fiyat="+(kitaplik[0].fiyat+kitaplik[1].fiyat/2));
	
	
	}

}




