package package1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){
		
		/*Sogan s=new Sogan();
		s.fiyat=4.5;
		s.tip="kuru";
		
		Yumurta y=new Yumurta();
		y.adet=5;
		y.fiyat=1;
		y.cins="organik";
		
		Biber b = new Biber();
		b.renk="kýrmýzý";
		b.fiyat=3;
		
		Menemen m =new Menemen();
		m.sogan=s;
		m.biber=b;
		m.yumurta=y;
		
		System.out.println("Toplam maliyet: "+m.maliyetHesapla());*/
		
		
		double toplam = 0;
		
		Sogan soganlardizi[]=new Sogan[5];
		Scanner scn=new Scanner(System.in);
		
		
		for(int i=0; i<soganlardizi.length; i++){
			System.out.println("Fiyat giriniz: ");
			Sogan s=new Sogan();
			
			s.fiyat=scn.nextDouble();
			soganlardizi[i]=s;
			
			toplam+=soganlardizi[i].fiyat;
			
		}
		System.out.println("Toplam sogan fiyati: "+toplam);
		
		System.out.println("Soganlar dizisinin 2. elemaný : "+soganlardizi[1].fiyat);
		System.out.println("Soganlar dizisinin 4. elemanu : "+soganlardizi[3].fiyat);
		System.out.println("Alýnana elemanlarýn fiyat ortalamasý: "+(soganlardizi[1].fiyat+soganlardizi[3].fiyat)/2);
		
		
		
		
		
	}
	
	
	
	

}
