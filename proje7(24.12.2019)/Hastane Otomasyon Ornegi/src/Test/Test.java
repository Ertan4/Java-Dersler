package Test;

import Hasta.Hasta;
import Hastaliklar.Hastalik;
import HastaneOtomasyon.Doktor;

public class Test {

	public static void main(String[] args) {
		
		
		Hasta hasta =new Hasta();
		hasta.setAd("Ertan ");
		((Hasta) hasta).setTCkimlikno("1111111111111");
		
		//hasta.doktorListesi;
		//hasta.hastalikListesi;
		
		Doktor doktor= new Doktor();
		doktor.setAd("Canan");
		doktor.setSoyad("Karatay");
		doktor.setSicilNo(1241241);
		doktor.setUnvan("prof");
		doktor.setUzmanlýk("Kardiyoloji");
		
		Hastalik hastalik=new Hastalik();
		hastalik.setAd("Obazite");
		hastalik.setHastalikSuresi(3);
		
		hasta.doktorListesi[0]=doktor;
		hasta.hastalikListesi[0]=hastalik;
		
		System.out.println("Hasta Ado: "+hasta.getAd()+"Doktorun isim soy isim: "+hasta.doktorListesi[0].getAd()+hasta.doktorListesi[0].getSoyad()+"  "+"\n Hastalik: "+
		hasta.hastalikListesi[0].getAd());
		
		
		
		

	}

}
