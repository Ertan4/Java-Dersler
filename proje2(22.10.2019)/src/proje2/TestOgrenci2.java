package proje2;

public class TestOgrenci2 {
	
	
	public static void main(String args[]){
		
		Ogrenci2 ogrenci1=new Ogrenci2("Ayþe",50);
		Ogrenci2 ogrenci2 =new Ogrenci2("Ali",100);
		
		ogrenci2.paraGonder(25);
		ogrenci2.bakiyeGoster();
		
		ogrenci2.paraEkle(25);
		ogrenci2.bakiyeGoster();
		
		ogrenci2.paraGonder(150);
		
	}

}
