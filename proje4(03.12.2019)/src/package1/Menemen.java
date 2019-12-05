package package1;

public class Menemen {
	
	
	Sogan sogan;
	Yumurta yumurta;
	Biber biber;
	
	public Menemen(){
		System.out.println("Menemen oluşturuluyor..");
	}
	
	public double maliyetHesapla(){
		double maliyet=sogan.fiyat+(yumurta.adet*yumurta.fiyat)+biber.fiyat;
		return maliyet;
		
		
	}
	

}
