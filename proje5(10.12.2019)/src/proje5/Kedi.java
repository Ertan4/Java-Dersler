package proje5;

public class Kedi extends Hayvan{
	
	
	public Kedi(){
		
		System.out.println("Kedi nesnesi oluþturuluyor.. ");
		
	}
	
	void sesCikar(){
		System.out.println("MÝYAV:.."); //overWriting ile ana sýnýftaki(Hayvan sýnýfýndaki) methodu ezdik.
		
	}

}
