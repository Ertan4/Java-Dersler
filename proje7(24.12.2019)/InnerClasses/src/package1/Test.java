package package1;

import package1.Bilgisayar.ram_bellek;

public class Test {
	
	public static void main(String args[]) {
		
	Bilgisayar.islemci intel=new Bilgisayar().new islemci(); //nesne olu�tururken �st s�n�ftan baz al�narak alt s�n�flar� olu�tururuz.
	Bilgisayar.anakart asus=new Bilgisayar().new anakart();
	Bilgisayar.ram_bellek samsung=new Bilgisayar().new ram_bellek();
	
	intel.model="i9";
	asus.marka="Asus prime TX40-pro";
	samsung.boyut=16;
	
	System.out.println("��lemci: "+intel.model+" --"+ "Anakart: "+" ---"+asus.marka+"Ram miktari: "+samsung.boyut);
	
	}
	
	

}
