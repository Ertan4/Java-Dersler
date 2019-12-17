package package1;

public class Test {
	public static void main(String[] args) {
		
		Calisan calisan=new Calisan();
		calisan.calis();
		
		Calisan mudur=new Mudur();// her müdür ayný zamanda calisan oldugu için bu þekilde objeyi tanýmlayabiliriz..
		mudur.calis();
		
		Pazarlamaci pazarlamaci=new Pazarlamaci();
		pazarlamaci.Calis();
		
		Calisan programci=new Programci(); //her programci da bir calisan oldugu için objeyi bu þekilde tanýmlayabiliriz.
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
