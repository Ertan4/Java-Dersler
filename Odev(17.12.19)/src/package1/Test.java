package package1;

public class Test {
	public static void main(String[] args) {
		
		Calisan calisan=new Calisan();
		calisan.calis();
		
		Calisan mudur=new Mudur();// her m�d�r ayn� zamanda calisan oldugu i�in bu �ekilde objeyi tan�mlayabiliriz..
		mudur.calis();
		
		Pazarlamaci pazarlamaci=new Pazarlamaci();
		pazarlamaci.Calis();
		
		Calisan programci=new Programci(); //her programci da bir calisan oldugu i�in objeyi bu �ekilde tan�mlayabiliriz.
		programci.calis();
		
		Sekreter sekreter= new Sekreter();
		sekreter.calis();
		
		Calisan genelMudur=new DepolamaMudur();
		genelMudur.calis();
		
		AnalizProgramci analizP=new AnalizProgramci();
		analizP.analizProgramciCalis();
		
		SistemProgramcisi sistemP=new SistemProgramcisi();
		sistemP.sistemProgramcisiCalis();
		
		
		
		
		
		
		
		
		
	}

}
